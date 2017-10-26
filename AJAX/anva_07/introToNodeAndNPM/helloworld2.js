
var a = 10;
for (var i=0;i<a;i++){
	console.log(i , 'testing...' );
}


var b = 1000 * 1.2;
console.log( 'b = ' + b );


var numbers = [1,4,24,253];
numbers = numbers.map( 
	function(x){ 
		return x*10; 
	}
);
console.log( numbers );


var o = {name:'Andrea', familyName: 'Valente'};
console.log( o );
console.log( o.name );