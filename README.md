# Notas GIT

## Instalar en ubuntu
'''sudo apt install git'''

##   Instalar en debian, redhat, centOS
sudo yum install git

## Instalar en windows`
Descargar de http://git-scm.com/

### MarkDown (.md)


## Crear respositorio GIT
Ejecutar comando dentro de la carpeta RAIZ
```git init```


## Dentro de GIT
Tenemos la carpeta con nuestro código /home/ubuntu/environment/curso
Hay una carpeta con el respositorio /home/ubuntu/environment/curso/.git

- Que hay en mi carpeta de mi codigo?
El codigo fuente de mi aplicación, en su última versión en la rama en la que me encuentre

- Que hay en mi repositorio?
El codigo fuente de mi aplicación, en todas sus vresiones en todas las ramas
Los fichreos los llevaremos de nuestra carpeta al repo, o al reves
La carpeta de mi codigo es lo que en git se denomina WORKSPACE

En GIT hay una cosa más en medio.. AREA DE STAGING

WORKSPACE               AREA DE STAGING                         REPO (carpeta .git)
----------------->>>>>>>----------------------------------->>>>>------------
fichreros 
en directorios                                                  Commits (paquetes de código sellado)


## Comandos GIT

|Comando                            |Descripción
|:------                            |:------
|git init                           |Crea un nuevo repositorio en la carpta actual
|git status                         |Obtiene el estado del workspace
|git add                            |Añade archivos / carpetas al SCM por defecto de forma recursiva
|git add .                          |Añade archivos ocultos
|git add *                          |Añade todos los archivos
|git add NOMBRE_FIHCERO             |Añade el fichero indicado
|git add NOMBRE_CARPETA             |Añade una carpeta y su contenido
|git rm --cached                    |Saca un fichero del STAGING. Hace que los ficheros deje de estar controlado por el SCM
|git rm                             |Elimina el fichero: 1- De mi carpeta local: WORKSPACE 2- Del área de STAGING 3- Del REPOSITORIO en la versión actual
|git commit -m "mensaje"            |Indica al SCM que guarde el paquete de cambios en el REPOSITORIO
|git commit ammedn --reset-autor    |Hace un commit reescribiendo los comentarios
|git commit --all -m "mensaje"      |Añade al stagin y hace el comit directamente pero solo de los archivos que estan ya en el reposittorio
|git config --global user.name "Iván Díaz"  |Cambie el nombre del usuario
|git config --global user.email i.diaz@ibermatica.com   |Email del usuario
|git reset --hard                   |Restaura el WORKSPACE completamente (ojo se pueden perder cambios locales en workspace)
|git branch                         |Obtiene informacion de las ramas existentes, incando la rama en la que me encuentro
|git branch NOMBRE_RAMA             |Crea una rama nueva
|git checkout NOMBRE_RAMA           |Cambia de rama, si la rama existe
|git checkout -b NOMBRE_RAMA        |Cambia de rama y si no existe la crea
|git checkout ID_COMMIT             |Cambia de commit pero no borra nada
|git ls-files                       |Lista los archivos en el repositorio GIT
|git merge "rama a traer"           |Trae los datos de una rama a la rama en la que stamos actualmente
|git stash save "aqui me he quedado"    |Guarda en el stash "diretorio temporal" el estdo actual de la rama en la que estamos. Solo los archivos controlados por SCM
|git stash list                     |Lista los stash que tenemos en la rama
|git stash pop                      |Saca el ultimo stash y lo pone en la rama actual
|git stash branch                   |Crea una nueva rama desde la rama actual añadiendo los cambios que hay en el stash
|git remote                         |Lista los recursos remotos existentes
|git remote add NOMBRE_REMOTO https://github.com/diazalmazan/cursoGIT_proyecto1.git    |Añade un repositorio externo
|git remote -r NOMBRE_REMOTO        |Elimina un remote del repositorio local
|git config credential.helper store |Permite almacenar las credenciales en memoria. Despues de ejecutarlo hay que hacer un push o pull para que guarde usuario y contraseña
|git push NOMBRE_REMOTO             |Envia los cambios en el repostiorio (commit) al repositorio remotos
|git fetch                          |Sincroniza el repositorio local con el repositorio remotos
|git pull                           |Obtiene los datos del repositorio y actualiza el repositorio local y el workspace
|git diff RAMA1..RAMA2              |Compara dos ramas del mismo repositorio
|git clone                          |Clona un repositorio en otro directorio para poder cambiar el repositorio remoto
|git reset ID_COMMIT                |Reestablece el workspace al commit indicado borrando los commits posteriores
|git revert ID_COMMMIT              |Genera un Nuevo COMMIT con los datos del commit indicados


## Entorno grafico de GIT
SourceTree  https://www.sourcetreeapp.com/


## Generar clave publica/privada para conexion SSH
ssh-keygen

ssh-add

ssh -T git@bitbucket.org

## otro


