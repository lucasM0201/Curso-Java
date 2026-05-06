const form = document .querySelector('form');

form.addEventListener('submit', function(event){
    event.preventDefault();

    // declaração de variável
    let nome = document.querySelector('#nome').value;

    // exibe a caixa de dialogo
    alert(nome);
    // reseta o formulário após o submit
    form.reset();
});