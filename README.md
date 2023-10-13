### Notas

Checar qual o e-mail associado ao repositório, e se necessário, mudar 
manualmente segundo [esse link](https://docs.github.com/en/github-ae@latest/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-email-preferences/setting-your-commit-email-address) da documentação do Github:

- Checar o e-mail global
````bash
git config --global user.email
````

- Checar o e-mail do repositório
````bash
git config user.email
````

- Mudar o e-mail do repositório se necessário.
````bash
git config user.email "email-do-commit@x.com"
````

