// from: http://elijahmanor.com/talks/js-smells/#/1/2

var CONSONANTS = 'bcdfghjklmnpqrstvwxyz';
var VOWELS = 'aeiou';

function englishToPigLatin(english) {
  var SYLLABLE = 'ay'; var pigLatin = '';

  if (english !== null && english.length > 0 &&
    (VOWELS.indexOf(english[0]) > -1 || CONSONANTS.indexOf(english[0]) > -1 )) { 
	if (VOWELS.indexOf(english[0]) > -1) {
      pigLatin = english + SYLLABLE;
    } else {
      var preConsonants = ''; 
	  for (var i = 0; i < english.length; ++i) {
        if (CONSONANTS.indexOf(english[i]) > -1) {
          preConsonants += english[i];
          if (preConsonants == 'q' &&
            i+1 < english.length && english[i+1] == 'u') {
            preConsonants += 'u'; i += 2; break;
          }
        } else { break; }
      }
      pigLatin = english.substring(i) + preConsonants + SYLLABLE;
    }
  }

  return pigLatin;
}





// A very cool trick: if we're running under Node...
if(typeof exports !== 'undefined') {
    exports.englishToPigLatin = englishToPigLatin;
}