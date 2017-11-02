// constant defintions
var CONSONANTS = ['th', 'qu', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 
					'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'];
var VOWELS = ['a', 'e', 'i', 'o', 'u'];
var ENDING = 'ay';


function startsWithVowel(word){ 
	return VOWELS.indexOf(word[0]) != -1;
}

function startsWithConsonant(word){
	// true only if first letter of word is in CONSONANTS
	return CONSONANTS.indexOf(word[0]) != -1; 
}

function isValid(word){
	// .. OR ...
	return ( startsWithVowel(word) || startsWithConsonant(word) ); 
}

// finds the consonant (or consonant group) at the start of the word
// word could start with a single consonant (like 'banana') or a group (e.g "trash")
function getConsonants( word ){
	var initialConsonants = '';
	
	// until the word starts by consonant...
	while (startsWithConsonant(word)){
		
		for (var i=0;i<CONSONANTS.length;i++){
			var consonantSound = CONSONANTS[i];
			// find which consonant it starts by...
			if (word.startsWith(consonantSound)) {
				initialConsonants += consonantSound;

				// remove that consonant, and check again, 
				// in case word started with a group of consonants
				word = word.substr(consonantSound.length);
			}
		}
	}
	
	return initialConsonants;
} 

function englishToPigLatin(english) {
	if (isValid(english)) {
		if (startsWithVowel(english)) {
			english += ENDING;
		} else {
			var initialConsonantLetters = getConsonants(english);
			english = english.substr(initialConsonantLetters.length) +
					 initialConsonantLetters +
					 ENDING;
		}
	}
   return english;
}




// A very cool trick: if we're running under Node...
if(typeof exports !== 'undefined') {
    exports.englishToPigLatin = englishToPigLatin;
}