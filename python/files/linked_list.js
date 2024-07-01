function sortCards(cards) {
  // Define a dictionary to map card names to their numerical values
  const cardValues = { Jack: 11, Queen: 12, King: 13 };

  // Create an array of objects containing the numerical value and the card name
  const cardValueNamePairs = cards.map((card) => ({
    value: cardValues[card] || parseInt(card),
    name: card,
  }));

  // Sort the array of objects based on the numerical value
  cardValueNamePairs.sort((a, b) => a.value - b.value);

  // Extract the card names from the sorted array of objects
  const sortedCards = cardValueNamePairs.map((pair) => pair.name);

  return sortedCards;
}

// Test the function
const cards = [
  "2",
  "3",
  "5",
  "6",
  "8",
  "Jack",
  "Queen",
  "King",
  "Jack",
  "Queen",
  "King",
  "Jack",
  "Queen",
  "King",
];
const sortedCards = sortCards(cards);
console.log(sortedCards);
