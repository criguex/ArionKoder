# **PRUEBA TÉCNICA PARA ARIONKODER**

## Introducción 📖
Automatización desarrollada para cumplir con el desafío técnico de ArionKoder.  
La automatización se realizó para validar el flujo de inicio de sesión en una aplicación web.

El proyecto se encuentra en el directorio `sele_guer`.

## Prerrequisitos 📋
- Java versión 17 y JDK.
- IntelliJ IDEA o Eclipse IDE.
- Maven.
- Cucumber.

## Instalación 🛠️🔩
1. Clona el repositorio o descomprime el archivo del proyecto.
2. Importa el proyecto en IntelliJ IDEA o Eclipse.
3. Configura el JDK de Java y las variables de entorno necesarias.
4. Configura Maven para la gestión de dependencias.
5. Instala el plugin de Cucumber para Java en tu IDE.

## Ejecución del Proyecto 🚧⚒️
1. Navega al paquete `sele_guer/src/test/java/stepdefinitions/login`.
2. Ejecuta las pruebas desde las clases de StepDefinitions o configura un Runner para ejecutar los escenarios definidos en los archivos `.feature`.

## Navegadores Compatibles 🌐
La automatización actualmente es compatible con los siguientes navegadores:
- Google Chrome versión 123 o superior.

## Detalles Generales de Implementación 💻
Los escenarios de prueba están definidos en archivos `.feature` utilizando el lenguaje Gherkin.  
Estos escenarios están conectados con métodos en las clases de StepDefinitions mediante las anotaciones `@Given`, `@When` y `@Then`.  
Las clases de StepDefinitions interactúan con las clases de páginas (`pages`) para realizar acciones y validaciones en la interfaz de usuario.

   ```bash
 ArionKoder/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── arionkoder/
│   │           ├── exceptions/       # Excepciones personalizadas.
│   │           ├── questions/        # Clases para construir modelos de datos o validaciones.
│   │           ├── tasks/            # Clases para realizar acciones de alto nivel.
│   │           ├── userinterfaces/   # Clases que mapean elementos de la interfaz de usuario.
│   │           └── utils/            # Funcionalidades comunes.
│   └── test/
│       └── java/
│           └── arionkoder/
│               ├── stepdefinitions/  # Definiciones de pasos de Cucumber.
│               │   └── login/        # Pasos específicos para el flujo de login.
│               ├── runners/          # Clases para ejecutar los escenarios.
│               └── test_data/        # Datos de prueba.
│       └── resources/
│           └── features/             # Archivos .feature con los escenarios de prueba.
├── pom.xml
└── README.md
