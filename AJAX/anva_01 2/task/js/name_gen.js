
// Inspired by: https://gamedevelopment.tutsplus.com/tutorials/quick-tip-how-to-code-a-simple-character-name-generator--gamedev-14308
var firstNameSyllables = ['mon','day','shi','zag','blarg','rash'];
var lastNameSyllables = ['jo','sa','re','sha','moo','bra','na','mar','der','ster'];
function createNewName(){
	// Creates a first name
	var firstName = "";
	var numberOfSyllablesInFirstName = randInt(1, 4);
	for (var i=0;i < numberOfSyllablesInFirstName; i++){
		firstName += firstNameSyllables[randInt(0, firstNameSyllables.length-1)];
	}
	// capitalize first letter
	firstName = firstName.charAt(0).toUpperCase() + firstName.slice(1);

	// Creates a last name with 1-3 syllables
	var lastName = "";
	var numberOfSyllablesInLastName = randInt(1, 3);
	for (var j = 0; j < numberOfSyllablesInLastName; j++){
		lastName += lastNameSyllables[randInt(0, lastNameSyllables.length-1)];
	}
	// capitalize first letter
	lastName = lastName.charAt(0).toUpperCase() + lastName.slice(1);
	
	return firstName + " " + lastName;
}


// Usage: console.log( createNewName() );