// Set the background image (Your Guitar Photo)
document.body.style.backgroundImage = "url('your-guitar-photo.jpg')";

// Set the logo image (Your Custom Logo)
document.getElementById('logo').src = "your-logo.jpg";

// Function to open the Patreon Store
document.getElementById('storeButton').addEventListener('click', function() {
    window.open('https://patreon.com/yourpatreon', '_blank');
});
