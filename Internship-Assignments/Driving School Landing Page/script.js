// script.js
document.addEventListener('DOMContentLoaded', function () {
    // Get references to the gallery elements
    const images = document.querySelectorAll('.gallery-image');
    const prevBtn = document.querySelector('.prev-btn');
    const nextBtn = document.querySelector('.next-btn');
  
    let currentIndex = 0;
  
    // Function to show a specific image
    function showImage(index) {
        images.forEach((img, i) => {
            img.classList.toggle('active', i === index);
        });
    }
  
    // Function to go to the next image
    function nextImage() {
        currentIndex = (currentIndex + 1) % images.length;
        showImage(currentIndex);
    }
  
    // Function to go to the previous image
    function prevImage() {
        currentIndex = (currentIndex - 1 + images.length) % images.length;
        showImage(currentIndex);
    }
  
    // Add event listeners to the buttons
    nextBtn.addEventListener('click', nextImage);
    prevBtn.addEventListener('click', prevImage);
  
    // Auto-advance every 3 seconds (optional)
    setInterval(nextImage, 3000);
  
  
      document.getElementById('inquiryForm').addEventListener('submit', function(event) {
          event.preventDefault(); 
  
          alert("Thank you for your inquiry!  We'll be in touch soon.");
          this.reset(); 
      });
  
  
    // Initialize the display
    showImage(currentIndex);
  });