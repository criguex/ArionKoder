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
```
## Recomendaciones 🛠️
1. **Estructura del Proyecto**: Mantén una estructura de paquetes clara y modular. Asegúrate de que cada paquete tenga una responsabilidad específica:
   - **`pages`**: Para mapear elementos de la interfaz de usuario.
   - **`stepdefinitions`**: Para definir los pasos de los escenarios de prueba.
   - **`hooks`**: Para configuraciones previas o posteriores a los escenarios.
   - **`test_data`**: Para almacenar datos de prueba reutilizables.
   - **`utils`**: Para funcionalidades comunes.

2. **Nombres de Clases y Métodos**: Usa nombres descriptivos y consistentes para facilitar la comprensión del código.

3. **Gestión de Dependencias**: Mantén actualizado el archivo `pom.xml` con las versiones más recientes de las dependencias utilizadas.

4. **Pruebas en Navegadores**: Asegúrate de que las pruebas sean compatibles con las versiones más recientes de los navegadores soportados.

5. **Documentación**: Mantén el archivo `README.md` actualizado con instrucciones claras para la instalación, configuración y ejecución del proyecto.

6. **Control de Versiones**: Usa ramas para trabajar en nuevas funcionalidades o correcciones y realiza revisiones de código antes de fusionar cambios.

---

## Autor ✒️👨🏻‍💻
**©️ Cristian Guerra Gómez** - *Creación del Proyecto.* - [criguex@gmail.com](#criguex)





