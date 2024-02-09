# Tarea3_Tecnicas
link a mi repositori: 

ENUNCIADO 
1. Análisis de Datos de Redes Sociales
Descripción
Desarrolla un algoritmo que analice los datos de una red social y clasifique las publicaciones en categorías como "positivas", "negativas" o "neutrales" basándose en el análisis de sentimientos. El algoritmo debe ser capaz de procesar texto en varios idiomas.

Pseudocódigo
función analizarSentimiento(texto):
    sentimiento = analizarTexto(texto)
    si sentimiento > umbral_positivo:
        return "positivo"
    si sentimiento < umbral_negativo:
        return "negativo"
    return "neutral"

para cada publicación en red_social:
    sentimiento = analizarSentimiento(publicación.texto)
    imprimir("Publicación: ", publicación.texto, " - Sentimiento: ", sentimiento)
2. Sistema de Recomendación de Libros
Descripción
Implementa un sistema de recomendación que sugiera libros a los usuarios basándose en sus intereses previos y calificaciones dadas a otros libros. El sistema debe utilizar algoritmos de aprendizaje automático para mejorar las recomendaciones con el tiempo.

Pseudocódigo
función recomendarLibros(usuario):
    libros_interesantes = obtenerLibrosInteresantes(usuario)
    calificaciones = obtenerCalificaciones(usuario)
    recomendaciones = []
    para cada libro en libros_interesantes:
        si libro no está en calificaciones:
            recomendaciones.agregar(libro)
    return recomendaciones

usuario_actual = obtenerUsuarioActual()
recomendaciones = recomendarLibros(usuario_actual)
imprimir("Recomendaciones: ", recomendaciones)
3. Simulación de Redes de Computadoras
Descripción
Crea un programa de simulación que modele el comportamiento de una red de computadoras, incluyendo el enrutamiento de paquetes, la congestión de la red y los ataques de denegación de servicio (DDoS). El usuario debe poder modificar parámetros como el número de nodos y la tasa de tráfico.

Pseudocódigo
función simularRed(nodos, tasa_de_tráfico):
    red = crearRed(nodos)
    para cada nodo en red:
        simularTráfico(nodo, tasa_de_tráfico)
        imprimir("Nodo: ", nodo.id, " - Tráfico: ", nodo.tráfico)

nodos = generarNodos(10)
tasa_de_tráfico = 0.5
simularRed(nodos, tasa_de_tráfico)
4. Desarrollo de un Videojuego Educativo
Descripción
Diseña y desarrolla un videojuego educativo que enseñe conceptos básicos de programación a niños. El juego debe incluir niveles de dificultad progresiva y permitir a los usuarios crear sus propios desafíos de programación para compartir con otros.

Pseudocódigo

clase Nivel:
    def __init__(self, dificultad, desafíos):
        self.dificultad = dificultad
        self.desafíos = desafíos

función jugarNivel(nivel):
    para cada desafío en nivel.desafíos:
        resultado = resolverDesafío(desafío)
        imprimir("Desafío: ", desafío, " - Resultado: ", resultado)

nivel = Nivel(dificultad=1, desafíos=["loop", "condicional"])
jugarNivel(nivel)
5. Sistema de Monitoreo de Rendimiento de Aplicaciones
Descripción
Implementa un sistema que monitoree y registre el rendimiento de distintas aplicaciones en un servidor. El sistema debe recolectar datos como uso de CPU, memoria y tiempo de respuesta, y proporcionar un panel de control para visualizar el rendimiento en tiempo real.

Pseudocódigo
función monitorearAplicación(aplicación):
    rendimiento = obtenerRendimiento(aplicación)
    imprimir("Aplicación: ", aplicación.nombre, " - CPU: ", rendimiento.cpu, " - Memoria: ", rendimiento.memoria)

aplicaciones = obtenerAplicaciones()
para cada aplicación en aplicaciones:
    monitorearAplicación(aplicación)
