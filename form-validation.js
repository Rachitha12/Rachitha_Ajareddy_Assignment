function submitForm() {
    const form = document.getElementById("surveyForm");
    if (form.checkValidity()) {
        const firstName = document.getElementById("firstName").value;
        const lastName = document.getElementById("lastName").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const gender = document.querySelectorAll('input[name="gender"]:checked');
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        let genderValues = [];
        gender.forEach(input => {
            genderValues.push(input.value);
        });

        const popupList = document.getElementById("popup-list");
        popupList.innerHTML = `
            <li>First Name: ${firstName}</li>
            <li>Last Name: ${lastName}</li>
            <li>Date of Birth: ${dob}</li>
            <li>Country: ${country}</li>
            <li>Gender: ${genderValues.join(", ")}</li>
            <li>Profession: ${profession}</li>
            <li>Email: ${email}</li>
            <li>Mobile Number: ${mobile}</li>
        `;

        document.getElementById("popup").style.display = "block";
        form.reset();
    } else {
        alert("Please fill in all required fields.");
    }
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}