const form = document.getElementById('form');
const username = document.getElementById('name');
const email = document.getElementById('email');
const number = document.getElementById('number');

// All Functions
// Function to show error
function showError(message) {
    alert(message);
}

// Function to check if email is valid
function checkEmail(input) {
    const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if (re.test(input.value.trim())) {
        return true;
    } else {
        showError(`Please provide a valid email`)
        return false;
    }
}

// Function to check length of input field
function checkLength(input, min, max) {
    if (input.value.length < min) {
        showError(`${getFieldId(input)} needs to be at least ${min} characters`);
        return false;
    } else if (input.value.length > max) {
        showError(`${getFieldId(input)} needs to be less than ${max} characters`);
        return false;
    }
    else {
        return true;
    }
}

// Function to get the id of the input field with proper case
function getFieldId(input) {
    return input.id.charAt(0).toUpperCase() + input.id.slice(1);
}

// This is an event listener for the form on submit
form.addEventListener('submit', function (e) {
    checkLength(username, 3, 10);
    checkLength(number, 6, 30);
    checkEmail(email);
    if (checkLength(username, 3, 10) == false ||
        checkLength(number, 6, 30) == false ||
        checkEmail(email) == false) {
        e.preventDefault();
    }
})
