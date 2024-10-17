//Creational Pattern: Factory Method Pattern

// Product
abstract class Document {
    public abstract void open();
    public abstract void save();
    public abstract void close();
}

// Concrete Products
class WordDocument extends Document {
    public void open() {
        System.out.println("Opening Word document...");
    }

    public void save() {
        System.out.println("Saving Word document...");
    }

    public void close() {
        System.out.println("Closing Word document...");
    }
}

class PdfDocument extends Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }

    public void save() {
        System.out.println("Saving PDF document...");
    }

    public void close() {
        System.out.println("Closing PDF document...");
    }
}

// Creator
abstract class Application {
    public void newDocument() {
        Document doc = createDocument();
        doc.open();
    }

    protected abstract Document createDocument();
}

// Concrete Creators
class WordApplication extends Application {
    protected Document createDocument() {
        return new WordDocument();
    }
}

class PdfApplication extends Application {
    protected Document createDocument() {
        return new PdfDocument();
    }
}

// Main
public class DocumentFactory {
    public static void main(String[] args) {
        Application app = new WordApplication();
        app.newDocument();

        app = new PdfApplication();
        app.newDocument();
    }
}

