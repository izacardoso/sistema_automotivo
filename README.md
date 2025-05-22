🚗 Sistema Automotivo - Projeto CRUD em Java com Spring Boot
Este projeto foi desenvolvido como parte do portfólio acadêmico da disciplina de Programação Orientada a Objetos, com o objetivo de aplicar os conceitos de POO utilizando Java, Spring Boot e MySQL. A aplicação consiste em um sistema de cadastro de veículos, com interface simples em HTML e integração completa entre front-end e back-end via API REST.

📌 Funcionalidades
✅ Cadastro de veículos

✅ Listagem de veículos cadastrados

✅ Atualização de dados (preço, quilometragem e status)

✅ Remoção de veículos

✅ Integração com banco de dados MySQL

✅ Interface HTML simples com JavaScript (Fetch API)

🛠 Tecnologias Utilizadas
Java 17

Spring Boot

Spring Data JPA

MySQL

HTML5 + JavaScript

Maven


⚙️ Como Executar
Clone o repositório:


bash
Copiar
Editar
git clone https://github.com/seu-usuario/sistema-automotivo.git
Configure o banco de dados MySQL:


sql
Copiar
Editar
CREATE DATABASE sistema_automotivo;
Atualize o arquivo application.properties com seu usuário e senha MySQL:


properties
Copiar
Editar
spring.datasource.username=root
spring.datasource.password=sua_senha
Execute o projeto (via IDE ou terminal):

bash
Copiar
Editar
cd backend
mvn spring-boot:run
Abra o arquivo index.html no navegador para testar a interface gráfica:

bash
Copiar
Editar
frontend/index.html
💡 Observações
O front-end comunica-se com a API REST local usando fetch() via HTTP.

O projeto pode ser testado no navegador ou com ferramentas como Postman.

👩‍💻 Autora
Izabella Cardoso
Desenvolvedora em formação.
Projeto acadêmico desenvolvido para o curso de Programação Orientada a Objetos.
