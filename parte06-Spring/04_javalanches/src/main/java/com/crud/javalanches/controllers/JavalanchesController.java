package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.javalanches.models.Categoria;
import com.crud.javalanches.models.Cliente;
import com.crud.javalanches.models.Endereco;
import com.crud.javalanches.models.Produto;
import com.crud.javalanches.repository.CategoriaRepository;
import com.crud.javalanches.repository.ClienteRepository;
import com.crud.javalanches.repository.EnderecoRepository;
import com.crud.javalanches.repository.ProdutoRepository;

@Controller
public class JavalanchesController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    // TODO: adicionar as injeções de dependência para ClienteRepository e EnderecoRepository - RESOLVIDO
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/novaCategoria")
    public String novaCategoria() {
        return "nova_categoria";
    }

    @PostMapping("/novaCategoria")
    public String novaCategoria(Categoria categoria) {
        saveCategoriaComTratamento(categoria);
        return "categoria_sucesso";
    }

    private void saveCategoriaComTratamento(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @GetMapping("/novoProduto")
    public String novoProduto(Model model) {
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "novo_produto";
    }

    @PostMapping("/novoProduto")
    public String novoProduto(Produto produto, Long categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "produto_sucesso";
    }

    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model) {
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "listar_produtos";
    }

    // TODO: implementar o método para acessar formulário de cadastro de cliente - RESOLVIDO
    @GetMapping("/novoCliente")
    public String novoCliente() {
        return "novo_cliente"; // Retorna a view 'novo_cliente.html'
    }

    // TODO: implementar o método para salvar um novo cliente, incluindo o endereço - RESOLVIDO
    @PostMapping("/novoCliente")
    public String novoCliente(Cliente cliente, Endereco endereco) {
        // Vincula as duas entidades para garantir a consistência do relacionamento no banco
        cliente.getEnderecos().add(endereco);
        endereco.getClientes().add(cliente);

        // Salva ambas as entidades usando os respectivos repositórios
        enderecoRepository.save(endereco);
        clienteRepository.save(cliente);

        return "cliente_sucesso"; // Retorna a view de confirmação de sucesso
    }
}