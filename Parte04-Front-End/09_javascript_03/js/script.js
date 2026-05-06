const form = document.querySelector('form');

// arrow function
const maioridade = () => {
    // pegar valores
    const nome = document.querySelector('#nome').value.trim();
    const idade = Number(document.querySelector('#idade').value);

    const result = document.querySelector('#result');

    // validação simples
    if (!nome || !idade) {
        result.innerHTML = 'Preencha todos os campos corretamente.';
        return;
    }

    // lógica
    if (idade >= 18) {
        result.innerHTML = `${nome} é maior de idade.`;
    } else {
        result.innerHTML = `${nome} é menor de idade.`;
    }

    form.reset();
};

// evento
form.addEventListener('submit', function(event) {
    event.preventDefault();
    maioridade();
});