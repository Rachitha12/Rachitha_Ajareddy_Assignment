function reversingWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(" ");
    
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      // Use split, reverse, and join to reverse the word
      return word.split("").reverse().join("");
    });
    
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(" ");
    
    return reversedSentence;
  }
  const Sentence = prompt()
  const reversedSentence = reversingWords(Sentence);
  console.log(reversedSentence);