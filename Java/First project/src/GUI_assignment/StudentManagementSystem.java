package GUI_assignment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private String course;
    private double grade;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}


public class StudentManagementSystem extends JFrame {
    private final List<Student> students = new ArrayList<>();
    private DefaultTableModel studentTableModel;
    private DefaultTableModel courseTableModel;
    private DefaultTableModel gradeTableModel;
    private JPanel coursePanel;

    public StudentManagementSystem() {
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();
        JMenu studentMenu = new JMenu("Student Management");
        JMenu courseMenu = new JMenu("Course Enrollment");
        JMenu gradeMenu = new JMenu("Grade Management");
        menuBar.add(studentMenu);
        menuBar.add(courseMenu);
        menuBar.add(gradeMenu);
        setJMenuBar(menuBar);

        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Add Student"));
        toolBar.add(new JButton("Update Student"));
        toolBar.add(new JButton("View Student Details"));
        toolBar.add(new JButton("Enroll Student"));
        toolBar.add(new JButton("Assign Grade"));
        add(toolBar, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();
        coursePanel = createCoursePanel();
        tabbedPane.addTab("Student Management", createStudentPanel(coursePanel));
        tabbedPane.addTab("Course Enrollment", coursePanel);
        tabbedPane.addTab("Grade Management", createGradePanel());
        add(tabbedPane, BorderLayout.CENTER);

        JLabel statusBar = new JLabel("Ready");
        add(statusBar, BorderLayout.SOUTH);
    }
    private JPanel createStudentPanel(JPanel coursePanel) {
        JPanel panel = new JPanel(new BorderLayout());

        studentTableModel = new DefaultTableModel();
        studentTableModel.addColumn("Name");
        studentTableModel.addColumn("ID");
        JTable studentTable = new JTable(studentTableModel);
        panel.add(new JScrollPane(studentTable), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JTextField nameField = new JTextField();
        JTextField idField = new JTextField();
        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int id = Integer.parseInt(idField.getText());
                Student student = new Student(name, id);
                students.add(student);
                studentTableModel.addRow(new Object[]{name, id});
                nameField.setText("");
                idField.setText("");

                updateStudentComboBox(getStudentComboBox(coursePanel));
            }
        });
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);
        panel.add(inputPanel, BorderLayout.SOUTH);

        return panel;
    }
    private JPanel createCoursePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Create the table and model
        courseTableModel = new DefaultTableModel();
        courseTableModel.addColumn("Student Name");
        courseTableModel.addColumn("Course");
        JTable courseTable = new JTable(courseTableModel);
        panel.add(new JScrollPane(courseTable), BorderLayout.CENTER);

        // Create the input fields
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        // Add list of students to the studentComboBox
        JComboBox<String> studentComboBox = new JComboBox<>();
        updateStudentComboBox(studentComboBox);

        for (Student student : students) {

            System.out.println(student);
            studentComboBox.addItem(student.getName());
        }

        // Add list of courses to the courseComboBox
        JComboBox<String> courseComboBox = new JComboBox<>();
        courseComboBox.addItem("Introduction to Computer Science");
        courseComboBox.addItem("Data Structures and Algorithms");
        courseComboBox.addItem("Operating Systems");
        courseComboBox.addItem("Computer Networks");

        // Add more courses as needed

        JButton enrollButton = new JButton("Enroll Student");
        enrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = (String) studentComboBox.getSelectedItem();
                String course = (String) courseComboBox.getSelectedItem();
                courseTableModel.addRow(new Object[]{studentName, course});

                updateStudentComboBox(getStudentComboBox(coursePanel));

            }
        });

        inputPanel.add(new JLabel("Student:"));
        inputPanel.add(studentComboBox);
        inputPanel.add(new JLabel("Course:"));
        inputPanel.add(courseComboBox);
        inputPanel.add(new JLabel());
        inputPanel.add(enrollButton);
        panel.add(inputPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JComboBox<String> getStudentComboBox(JPanel coursePanel) {
        for (Component component : coursePanel.getComponents()) {
            if (component instanceof JPanel) {
                JPanel inputPanel = (JPanel) component;
                for (Component inputComponent : inputPanel.getComponents()) {
                    if (inputComponent instanceof JComboBox) {
                        return (JComboBox<String>) inputComponent;
                    }
                }
            }
        }
        return null;
    }

    private void updateStudentComboBox(JComboBox<String> studentComboBox) {
        if (studentComboBox != null) {
            studentComboBox.removeAllItems();
            for (Student student : students) {
                studentComboBox.addItem(student.getName());
            }
        }
    }

    private JPanel createGradePanel(){
        JPanel panel = new JPanel(new BorderLayout());

        // Create the table and model
        gradeTableModel = new DefaultTableModel();
        gradeTableModel.addColumn("Student Name");
        gradeTableModel.addColumn("Course");
        gradeTableModel.addColumn("Grade");
        JTable gradeTable = new JTable(gradeTableModel);
        panel.add(new JScrollPane(gradeTable), BorderLayout.CENTER);

        // Create the input fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JComboBox<String> studentComboBox = new JComboBox<>();
        updateStudentComboBox(studentComboBox);
        JComboBox<String> courseComboBox = new JComboBox<>();
        courseComboBox.addItem("Introduction to Computer Science");
        courseComboBox.addItem("Data Structures and Algorithms");
        courseComboBox.addItem("Operating Systems");
        courseComboBox.addItem("Computer Networks");
        JTextField gradeField = new JTextField();
        JButton assignButton = new JButton("Assign Grade");
        assignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = (String) studentComboBox.getSelectedItem();
                String course = (String) courseComboBox.getSelectedItem();
                double grade = Double.parseDouble(gradeField.getText());
                gradeTableModel.addRow(new Object[]{studentName, course, grade});
                gradeField.setText("");
            }
        });
        inputPanel.add(new JLabel("Student:"));
        inputPanel.add(studentComboBox);
        inputPanel.add(new JLabel("Course:"));
        inputPanel.add(courseComboBox);
        inputPanel.add(new JLabel("Grade:"));
        inputPanel.add(gradeField);
        inputPanel.add(new JLabel());
        inputPanel.add(assignButton);
        panel.add(inputPanel, BorderLayout.SOUTH);

        return panel;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentManagementSystem frame = new StudentManagementSystem();
            frame.setVisible(true);
        });
    }
}
