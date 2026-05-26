const clickBtn = document.getElementById('js-click-btn');
const clickOutput = document.getElementById('js-click-output');

const inputField = document.getElementById('js-input');
const inputOutput = document.getElementById('js-input-output');

const userBox = document.getElementById('js-user');
const userOutput = document.getElementById('js-user-output');
const userButton = document.getElementById('js-load-btn');

let clickCount = 0;

clickBtn.addEventListener('click', () => {
  clickCount++;
  clickOutput.innerHTML = `Button clicked ${clickCount} time${clickCount > 1 ? 's' : ''}.`;
}
);

inputField.addEventListener('input', (evt) => {
  inputOutput.innerHTML = `Hello, ${evt.target.value}`;
  console.log(evt);
});

userButton.addEventListener('click', async function () {
    const response = await fetch("https://randomuser.me/api/");
    const data = await response.json();
    const user = data.results[0];
    const name = `${user.name.first} ${user.name.last}`;
    const photo = user.picture.large;
    userOutput.innerHTML = `<img src="${photo}" alt="User photo" class="user-photo"><p>${name}</p>`;
});
