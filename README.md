# Projeto: sapataria
## SI400B - Programação Orientada a Objetos II - FT UNICAMP

## EQUIPE:
 * Ricardo Hideki Adati Tomomitsu
 * Leonardo Barreto Nogueira
 * Gustavo Trigoli Santos
 * Lucas de Campos Vergueiro Scheunemann

### Objetivos
Desenvolver um software capaz de possibilitar o gerenciamento de uma sapataria. 
Permitir que os gestores tenham acessos a informações a respeito do estoque, clientes, funcionários, etc, para facilitar seu gerenciamento e tomada de decisões.

### Requisitos Essenciais
Permitir o gerenciamento de funcionários e gerente.
Permitir o gerenciamento de clientes.
Permitir o gerenciamento de mercadorias.
Permitir o gerenciamento de fornecedores.
Permitir o gerenciamento de compras.
Permitir o gerenciamento de vendas.
Permitir o gerenciamento de estoque.

### CLASSES
PESSOA:
Nome,
Rg,
Cpf,
E-mail,
Telefone,
Endereço.

FUNCIONÁRIO: 
Nome,
Rg,
Cpf,
E-mail,
Telefone,
Endereço,
Data de Nascimento,
Hora de entrada,
Hora de saída,
Carteira de trabalho.

GERENTE:
Nome,
Rg,
Cpf,
E-mail,
Telefone,
Endereço,
Data de Nascimento,
Hora de entrada,
Hora de saída,
Carteira de trabalho.
            	
VENDEDOR:
Nome,
Rg,
Cpf,
E-mail,
Telefone,
Endereço,
Data de Nascimento,
Hora de entrada,
Hora de saída,
Carteira de trabalho.

FORNECEDOR:
Nome fantasia,
razao social,
cnpj,
email,
telefone,
endereço.

CLIENTE:
Nome,
Rg,
Cpf,
E-mail,
Telefone,
Endereço,
Tamanho de calçado.

MERCADORIA:
Marca,
Modelo,
Categoria,
Tamanho,
Cor,
Preço de Venda.
            	            	
 
COMPRA:
Data,
Fornecedor,
Quantidade,
Tipo de mercadoria (marca, modelo, categoria, cor, tamanho),
Preço de compra.
            	
VENDA:
Data,
Cliente,
Quantidade,
Tipo de mercadoria (marca, modelo, categoria, cor, tamanho),
Preço de venda.
            	
ESTOQUE:
Data,
Quantidade,
Tipo de mercadoria (marca, modelo, categoria, cor, tamanho),
Preço de venda.


