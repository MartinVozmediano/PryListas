import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Libro> libros;

    public Lista() {
        libros = new ArrayList<>();
        predefinir();
    }

    public void predefinir() {
        libros.add(new Libro(1, "Gabriel García Márquez", "Cien años de soledad", "Ficción", 1967));
        libros.add(new Libro(2, "George Orwell", "1984", "Ciencia Ficción", 1949));
        libros.add(new Libro(3, "Miguel de Cervantes", "Don Quijote de la Mancha", "Literatura", 1605));
        libros.add(new Libro(4, "Jane Austen", "Orgullo y prejuicio", "Ficción", 1813));
        libros.add(new Libro(5, "J.R.R. Tolkien", "El Señor de los Anillos", "Fantasía", 1954));
        libros.add(new Libro(6, "Herman Melville", "Moby-Dick", "Aventura", 1851));
        libros.add(new Libro(7, "Fiódor Dostoyevski", "Crimen y castigo", "Filosofía", 1866));
        libros.add(new Libro(8, "Aldous Huxley", "Un mundo feliz", "Ciencia Ficción", 1932));
        libros.add(new Libro(9, "Ray Bradbury", "Fahrenheit 451", "Ciencia Ficción", 1953));
        libros.add(new Libro(10, "Mary Shelley", "Frankenstein", "Terror", 1818));
        libros.add(new Libro(11, "Bram Stoker", "Drácula", "Terror", 1897));
        libros.add(new Libro(12, "Oscar Wilde", "El retrato de Dorian Gray", "Filosofía", 1890));
        libros.add(new Libro(13, "Antoine de Saint-Exupéry", "El principito", "Infantil", 1943));
        libros.add(new Libro(14, "Homero", "La Ilíada", "Épica", -750));
        libros.add(new Libro(15, "Homero", "La Odisea", "Épica", -725));
        libros.add(new Libro(16, "Dante Alighieri", "La Divina Comedia", "Épica", 1320));
        libros.add(new Libro(17, "William Shakespeare", "Hamlet", "Teatro", 1603));
        libros.add(new Libro(18, "William Shakespeare", "Romeo y Julieta", "Teatro", 1597));
        libros.add(new Libro(19, "Charles Dickens", "Historia de dos ciudades", "Histórica", 1859));
        libros.add(new Libro(20, "Charles Dickens", "Oliver Twist", "Novela", 1838));
        libros.add(new Libro(21, "Alexandre Dumas", "El conde de Montecristo", "Aventura", 1844));
        libros.add(new Libro(22, "Alexandre Dumas", "Los tres mosqueteros", "Aventura", 1844));
        libros.add(new Libro(23, "Victor Hugo", "Los miserables", "Histórica", 1862));
        libros.add(new Libro(24, "Victor Hugo", "Nuestra Señora de París", "Novela", 1831));
        libros.add(new Libro(25, "Mark Twain", "Las aventuras de Tom Sawyer", "Aventura", 1876));
        libros.add(new Libro(26, "Mark Twain", "Las aventuras de Huckleberry Finn", "Aventura", 1884));
        libros.add(new Libro(27, "Arthur Conan Doyle", "Estudio en escarlata", "Misterio", 1887));
        libros.add(new Libro(28, "Arthur Conan Doyle", "El sabueso de los Baskerville", "Misterio", 1902));
        libros.add(new Libro(29, "Agatha Christie", "Diez negritos", "Misterio", 1939));
        libros.add(new Libro(30, "Agatha Christie", "Asesinato en el Orient Express", "Misterio", 1934));
        libros.add(new Libro(31, "J.D. Salinger", "El guardián entre el centeno", "Ficción", 1951));
        libros.add(new Libro(32, "Harper Lee", "Matar a un ruiseñor", "Ficción", 1960));
        libros.add(new Libro(33, "Gabriel García Márquez", "El coronel no tiene quien le escriba", "Ficción", 1961));
        libros.add(new Libro(34, "Julio Cortázar", "Rayuela", "Ficción", 1963));
        libros.add(new Libro(35, "Mario Vargas Llosa", "La ciudad y los perros", "Ficción", 1963));
        libros.add(new Libro(36, "Isabel Allende", "La casa de los espíritus", "Ficción", 1982));
        libros.add(new Libro(37, "Jorge Luis Borges", "Ficciones", "Cuentos", 1944));
        libros.add(new Libro(38, "Pablo Neruda", "Veinte poemas de amor y una canción desesperada", "Poesía", 1924));
        libros.add(new Libro(39, "Octavio Paz", "El laberinto de la soledad", "Ensayo", 1950));
        libros.add(new Libro(40, "Ernesto Sabato", "El túnel", "Psicológica", 1948));
        libros.add(new Libro(41, "Franz Kafka", "La metamorfosis", "Ficción", 1915));
        libros.add(new Libro(42, "Albert Camus", "El extranjero", "Filosofía", 1942));
        libros.add(new Libro(43, "Jean-Paul Sartre", "La náusea", "Filosofía", 1938));
        libros.add(new Libro(44, "Friedrich Nietzsche", "Así habló Zaratustra", "Filosofía", 1883));
        libros.add(new Libro(45, "Platón", "La República", "Filosofía", -380));
        libros.add(new Libro(46, "Aristóteles", "Ética nicomáquea", "Filosofía", -340));
        libros.add(new Libro(47, "Sun Tzu", "El arte de la guerra", "Estrategia", -500));
        libros.add(new Libro(48, "Maquiavelo", "El príncipe", "Política", 1532));
        libros.add(new Libro(49, "Karl Marx", "El capital", "Economía", 1867));
        libros.add(new Libro(50, "Adam Smith", "La riqueza de las naciones", "Economía", 1776));
        libros.add(new Libro(51, "Isaac Asimov", "Fundación", "Ciencia Ficción", 1951));
        libros.add(new Libro(52, "Isaac Asimov", "Yo, robot", "Ciencia Ficción", 1950));
        libros.add(new Libro(53, "Arthur C. Clarke", "2001: Odisea del espacio", "Ciencia Ficción", 1968));
        libros.add(new Libro(54, "Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", "Ciencia Ficción", 1968));
        libros.add(new Libro(55, "Frank Herbert", "Dune", "Ciencia Ficción", 1965));
        libros.add(new Libro(56, "Orson Scott Card", "El juego de Ender", "Ciencia Ficción", 1985));
        libros.add(new Libro(57, "Douglas Adams", "Guía del autoestopista galáctico", "Ciencia Ficción", 1979));
        libros.add(new Libro(58, "C.S. Lewis", "Las Crónicas de Narnia", "Fantasía", 1950));
        libros.add(new Libro(59, "Lewis Carroll", "Alicia en el país de las maravillas", "Fantasía", 1865));
        libros.add(new Libro(60, "L. Frank Baum", "El mago de Oz", "Fantasía", 1900));
        libros.add(new Libro(61, "J.K. Rowling", "Harry Potter y la piedra filosofal", "Fantasía", 1997));
        libros.add(new Libro(62, "Suzanne Collins", "Los juegos del hambre", "Ciencia Ficción", 2008));
        libros.add(new Libro(63, "Veronica Roth", "Divergente", "Ciencia Ficción", 2011));
        libros.add(new Libro(64, "James Dashner", "El corredor del laberinto", "Ciencia Ficción", 2009));
        libros.add(new Libro(65, "Stephen King", "El resplandor", "Terror", 1977));
        libros.add(new Libro(66, "Stephen King", "It", "Terror", 1986));
        libros.add(new Libro(67, "Stephen King", "Carrie", "Terror", 1974));
        libros.add(new Libro(68, "Dan Brown", "El código Da Vinci", "Suspenso", 2003));
        libros.add(new Libro(69, "Dan Brown", "Ángeles y demonios", "Suspenso", 2000));
        libros.add(new Libro(70, "Stieg Larsson", "Los hombres que no amaban a las mujeres", "Suspenso", 2005));
        libros.add(new Libro(71, "Khaled Hosseini", "Cometas en el cielo", "Drama", 2003));
        libros.add(new Libro(72, "Khaled Hosseini", "Mil soles espléndidos", "Drama", 2007));
        libros.add(new Libro(73, "Markus Zusak", "La ladrona de libros", "Histórica", 2005));
        libros.add(new Libro(74, "John Green", "Bajo la misma estrella", "Romántica", 2012));
        libros.add(new Libro(75, "Nicholas Sparks", "El cuaderno de Noah", "Romántica", 1996));
        libros.add(new Libro(76, "Paulo Coelho", "El alquimista", "Ficción", 1988));
        libros.add(new Libro(77, "Rick Riordan", "Percy Jackson y el ladrón del rayo", "Fantasía", 2005));
        libros.add(new Libro(78, "Patrick Rothfuss", "El nombre del viento", "Fantasía", 2007));
        libros.add(new Libro(79, "Brandon Sanderson", "El imperio final", "Fantasía", 2006));
        libros.add(new Libro(80, "George R.R. Martin", "Juego de tronos", "Fantasía", 1996));
        libros.add(new Libro(81, "Yuval Noah Harari", "Sapiens: De animales a dioses", "Historia", 2011));
        libros.add(new Libro(82, "Stephen Hawking", "Breve historia del tiempo", "Ciencia", 1988));
        libros.add(new Libro(83, "Carl Sagan", "Cosmos", "Ciencia", 1980));
        libros.add(new Libro(84, "Richard Dawkins", "El gen egoísta", "Ciencia", 1976));
        libros.add(new Libro(85, "Charles Darwin", "El origen de las especies", "Ciencia", 1859));
        libros.add(new Libro(86, "Walter Isaacson", "Steve Jobs", "Biografía", 2011));
        libros.add(new Libro(87, "Anne Frank", "El diario de Ana Frank", "Biografía", 1947));
        libros.add(new Libro(88, "Nelson Mandela", "El largo camino hacia la libertad", "Biografía", 1994));
        libros.add(new Libro(89, "Malala Yousafzai", "Yo soy Malala", "Biografía", 2013));
        libros.add(new Libro(90, "Michelle Obama", "Mi historia", "Biografía", 2018));
        libros.add(new Libro(91, "Dale Carnegie", "Cómo ganar amigos e influir sobre las personas", "Autoayuda", 1936));
        libros.add(new Libro(92, "Napoleon Hill", "Piense y hágase rico", "Autoayuda", 1937));
        libros.add(new Libro(93, "Stephen Covey", "Los 7 hábitos de la gente altamente efectiva", "Autoayuda", 1989));
        libros.add(new Libro(94, "James Clear", "Hábitos atómicos", "Autoayuda", 2018));
        libros.add(new Libro(95, "Robert Kiyosaki", "Padre rico, padre pobre", "Finanzas", 1997));
        libros.add(new Libro(96, "T. Harv Eker", "Los secretos de la mente millonaria", "Finanzas", 2005));
        libros.add(new Libro(97, "Ray Dalio", "Principios", "Finanzas", 2017));
        libros.add(new Libro(98, "Daniel Kahneman", "Pensar rápido, pensar despacio", "Psicología", 2011));
        libros.add(new Libro(99, "Malcolm Gladwell", "Fuera de serie (Outliers)", "Sociología", 2008));
        libros.add(new Libro(100, "Yuval Noah Harari", "Homo Deus", "Historia", 2015));
    }

    public void agregar(Libro dato) throws Exception {
        if (libros.isEmpty()) {
            libros.add(dato);
        } else {
            if (dato.getCodigo() > libros.getLast().getCodigo()) {
                libros.add(dato);
            } else {
                throw new Exception("Datos no ordenados o duplicados");
            }
        }
    }

    public ArrayList<Libro> buscar(String texto) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro aux : libros) {
            if (aux.getTitulo().contains(texto)) {
                resultado.add(aux);

            }
        }
        return resultado;
    }

    public Libro binario(int codigo) throws Exception {
        if (libros.isEmpty()) {
            throw new Exception("La lista esta vacia");
        }

        if (codigo < libros.getFirst().getCodigo() || codigo > libros.getLast().getCodigo()) {
            throw new Exception("No existe libro con el codigo");
        }

        int i = 0, s = libros.size() - 1;

        while (i <= s) {
            int c = (i + s) / 2;
            int valor = libros.get(c).getCodigo();
            if (valor == codigo) {
                return libros.get(c);
            } else if (codigo < valor) {
                s = c - 1;
            } else {
                i = c + 1;
            }
        }
        throw new Exception("No existe un libro con ese codigo");

    }

    public ArrayList<Libro> getLibros(){
        return (ArrayList<Libro>) libros;
    }


}






















