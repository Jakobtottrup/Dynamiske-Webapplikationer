// jQuery plugin to restore data to a form from a jQuery .serialize() string --- begin
// from: http://jsfiddle.net/luken/4VVs3/
$.fn.deserialize = function (serializedString) 
{
    var $form = $(this);
    $form[0].reset();
    serializedString = serializedString.replace(/\+/g, '%20');
    var formFieldArray = serializedString.split("&");
	// DEBUG console.log(formFieldArray);

    $.each(formFieldArray, function(i, pair){
        var nameValue = pair.split("=");
        var name = decodeURIComponent(nameValue[0]);
        var value = decodeURIComponent(nameValue[1]);
        // Find one or more fields
        var $field = $form.find('[name=' + name + ']');
        // DEBUG console.log(name, value);
        
        if ($field[0].type == "radio" 
            || $field[0].type == "checkbox") 
        {
            var $fieldWithValue = $field.filter('[value="' + value + '"]');            
            var isFound = ($fieldWithValue.length > 0);
            if (!isFound && value == "on") {
                $field.first().prop("checked", true);
            } else {
                $fieldWithValue.prop("checked", isFound);
            } 
        } else {
            $field.val(value);
        }
    });
}
// jQuery plugin to restore data to a form from a jQuery .serialize() string --- end
