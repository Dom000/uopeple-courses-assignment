function arraneCards(cards) {
  const players = { Jack: 11, King: 12, Queen: 13 };
  const playerValue = cards
    .map((item) => ({
      value: players[item] || parseInt(item),
      name: item,
    }))
    .sort((a, b) => a.value - b.value);

//   playerValue.sort((a, b) => a.value - b.value);

  const sortedCards = playerValue.map((pair) => pair.name);
  console.log(sortedCards);
}

const cards = [2, 3, 5, 6, 8, "Jack", "Queen", "King"];
arraneCards(cards);
