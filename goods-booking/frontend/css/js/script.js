document.getElementById("bookingForm").addEventListener("submit", async function (e) {
  e.preventDefault();

  const formData = new FormData(this);
  const data = new URLSearchParams(formData);

  const response = await fetch("http://localhost:8080/BookingServlet", {
    method: "POST",
    headers: {
      "Content-Type": "application/x-www-form-urlencoded"
    },
    body: data
  });

  if (response.ok) {
    alert("Booking successful!");
    this.reset();
  } else {
    alert("Booking failed!");
  }
});
// Function to open the booking form modal
function openBookingForm() {
  document.getElementById("booking-modal").style.display = "block";
}

// Function to close the booking form modal
function closeBookingForm() {
  document.getElementById("booking-modal").style.display = "none";
}

// Close the modal when the user clicks outside of the modal content
window.onclick = function(event) {
  if (event.target == document.getElementById("booking-modal")) {
    closeBookingForm();
  }
}
