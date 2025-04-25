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
1. Navega al paquete `sele_guer/src/test/java/runners`.
2. Ejecuta las pruebas desde las clases de Runner para ejecutar los escenarios definidos en los archivos `.feature`.

## Navegadores Compatibles 🌐
La automatización actualmente es compatible con los siguientes navegadores:
- Google Chrome versión 123 o superior.

## Detalles Generales de Implementación 💻
Los escenarios de prueba están definidos en archivos `.feature` utilizando el lenguaje Gherkin.  
Estos escenarios están conectados con métodos en las clases de StepDefinitions mediante las anotaciones `@Given`, `@When` y `@Then`.  
Las clases de StepDefinitions interactúan con las clases de páginas (`pages`) para realizar acciones y validaciones en la interfaz de usuario.

   ```bash
📦ArionKoder
┗ 📂sele_guer
   ┣ 📂src
   ┃ ┣ 📂main
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](sele_guer)
   ┃ ┃ ┃   ┣ 📂drivers            # WebDriver configuration and setup (e.g., ChromeDriver)
   ┃ ┃ ┃   ┣ 📂hooks              # Cucumber hooks (e.g., Before/After actions)
   ┃ ┃ ┃   ┣ 📂locators           # Centralized element locators used in pages
   ┃ ┃ ┃   ┣ 📂org                # (Optional) For organization-specific packages or configs
   ┃ ┃ ┃   ┣ 📂pages              # Page Object Model classes for each screen/page
   ┃ ┃ ┃   ┣ 📂test_data          # Static data used for test execution
   ┃ ┃ ┃   ┗ 📂utils              # Utility/helper classes for general reusable methods
   ┃ ┃ ┗ 📂resources              # Resources (if needed for runtime configs, e.g., properties)
   ┃ ┣ 📂test
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](sele_guer)
   ┃ ┃ ┃   ┣ 📂runners            # Test runner classes to trigger feature execution
   ┃ ┃ ┃   ┗ 📂stepdefinitions    # Step definitions matching .feature steps with Java code
   ┃ ┃ ┗ 📂resources
   ┃ ┃   ┗ 📂Features            # .feature files defining scenarios in Gherkin syntax
   ┃ ┃       ┣ 📜FlowShoppingCart.feature # Test for shopping cart workflow
   ┃ ┃       ┣ 📜Login.feature             # Login functionality test scenarios
   ┃ ┃       ┗ 📜Register.feature          # Register functionality test scenarios
   ┣ 📂target                     # Maven build output (compiled classes, reports, etc.)
   ┣ 📜.gitignore                # Git ignored files configuration
   ┣ 📜pom.xml                  # Maven project descriptor (dependencies and plugins)
   ┗ 📜README.md                # Project documentation

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





