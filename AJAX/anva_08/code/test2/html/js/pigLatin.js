/* 
PIG LATIN

1. If starts with consonant (or consonant cluster), then move the end and append "ay"
"pig"    → "igpay"
"banana" → "ananabay"
"trash"  → "ashtray"
"happy"  → "appyhay"
"glove"  → "oveglay"

2. If starts with vowel or silent letter, then keep word along and append "way"
"egg"    → "eggway"
"inbox"  → "inboxway"
"eight"  → "eightway"

*/

var CONSONANTS = 'bcdfghjklmnpqrstvwxyz';
var VOWELS = 'aeiou';

function englishToPigLatin(word){
	// to do
	return word; // try with 'igpay';
}






// A very cool trick: if we're running under Node...
if(typeof exports !== 'undefined') {
    exports.englishToPigLatin = englishToPigLatin;
}