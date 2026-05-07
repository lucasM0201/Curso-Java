 function calcularIMC() {
      // entrada de dados
      let nome = document.getElementById("nome").value;
      let peso = parseFloat(document.getElementById("peso").value);
      let altura = parseFloat(document.getElementById("altura").value);

      // validação
      if (!nome || peso <= 0 || altura <= 0 || isNaN(peso) || isNaN(altura)) {
        document.getElementById("saida").innerText = "Preencha os dados corretamente!";
        return;
      }

      // cálculo do imc
      let imc = peso / (altura * altura);

      // resultado formatado
      let mensagem = nome + " seu IMC é " + imc.toFixed(2) + ". ";

      // operador ternário (igual ao seu Java)
      let result = (imc < 18.5) ? "está abaixo do peso." :
                   (imc < 25) ? "está no peso ideal." :
                   (imc < 30) ? "está acima do peso." :
                   (imc < 35) ? "está obeso." :
                   (imc < 40) ? "está com obesidade nível II." :
                   "está com obesidade mórbida.";

      mensagem += result;

      // saída
      document.getElementById("saida").innerText = mensagem;

      // if/else 
      if (imc < 18.5) {
        console.log(nome + " está abaixo do peso.");
      } else if (imc < 25) {
        console.log(nome + " está no peso ideal.");
      } else if (imc < 30) {
        console.log(nome + " está acima do peso.");
      } else if (imc < 35) {
        console.log(nome + " está obeso.");
      } else if (imc < 40) {
        console.log(nome + " está com obesidade nível 2.");
      } else {
        console.log(nome + " está com obesidade mórbida.");
      }
    }