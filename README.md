# Challenge 01: Job Finder App

Este es el primer desafío de la materia Taller de Programacion 3 cursando la carrera de Analista de Sistemas en ORT Argentina. Se busca la implementacion de una aplicación móvil para buscar empleos, desarrollada de forma nativa en **Android** utilizando **Kotlin** y **Jetpack Compose**. El proyecto implementa las primeras pantallas de la aplicación, siguiendo un diseño proporcionado en Figma.

---

## Estado del proyecto

Este proyecto está en **desarrollo activo**. Las pantallas de bienvenida, inicio de sesión y registro están implementadas y funcionalmente navegables. El objetivo de este desafío es construir la estructura base de la UI.

---

## Características implementadas

* **Navegación**: Se implementa un sistema de navegación entre las pantallas principales (`Welcome`, `Login` y `Register`) utilizando `NavHost` de Jetpack Compose.
* **Interfaz de Usuario**:
    * **Pantalla de Bienvenida**: Diseño con una ilustración, título y botones para iniciar sesión o registrarse.
    * **Pantalla de Inicio de Sesión**: Incluye campos de texto para email y contraseña, un botón para iniciar sesión, un enlace para recuperar la contraseña y opciones para continuar con redes sociales.
    * **Pantalla de Registro**: Incluye campos de texto para email, contraseña y confirmación de contraseña, un botón para registrarse y opciones para continuar con redes sociales.
* **Gestión de Estado**: Se utiliza `remember` con `mutableStateOf` para manejar el estado de los campos de texto, permitiendo que la interfaz de usuario se actualice dinámicamente.

---

## Tecnologías utilizadas

### 📌 Estructura base del stack tecnológico

* **Lenguaje**: Kotlin
* **Plataforma**: Android
* **Framework UI**: Jetpack Compose
* **Navegación**: Jetpack Compose Navigation (`NavHost`, `NavHostController`)
* **Componentes de UI**: `Box`, `Column`, `Row`, `Spacer`, `Text`, `Image`, `Button`, `TextButton`, `TextField`, `IconButton`.

---

## Estructura del directorio

    /app/src/
    └── main/
        ├── java/ 
        │   └── com/ 
        │       └── example/ 
        │           └── myapplication/ 
        │               ├── MainActivity.kt         # Punto de entrada de la app y AppNavigation 
        │               └── ui/ 
        │                   ├── screens/  
        │                   │   ├── login.kt        # Pantalla de inicio de sesión 
        │                   │   ├── register.kt     # Pantalla de registro 
        │                   │   └── welcome.kt      # Pantalla de bienvenida 
        │                   └── theme/ 
        │                       ├── Color.kt 
        │                       ├── Theme.kt 
        │                       └── Type.kt 
        └── res/ 
            ├── drawable/                           # Recursos gráficos (ilustraciones, íconos de redes sociales) 
            └── font/                               # Fuentes utilizadas 

---

## Figma

Las pantallas del diseño de este proyecto fueron tomadas del siguiente enlace:

* [Figma: 1º Challenge](https://www.figma.com/design/DsbzaLvPgwfJt6vHUoYRFo/1%C2%BA-Challenge?node-id=0-1&p=f&t=gqObNTDBXcT38mEx-0)

---

## Cómo empezar

Para ejecutar la aplicación, necesitas **Android Studio** instalado.

1.  **Clona el repositorio**

    ```bash
    git clone https://github.com/jjulianne/ort_tp3_challenge_01.git
    ```

2.  **Abrir el proyecto**

    * En Android Studio, selecciona **Open an existing Android Studio Project** y navega hasta la carpeta del proyecto que acabas de clonar.

3.  **Ejecutar la App**

    * Conecta un dispositivo Android o inicia un emulador.
    * Haz clic en el botón **Run** (el ícono de play ▶️) en la barra de herramientas superior para instalar y ejecutar la aplicación en el dispositivo o emulador.
