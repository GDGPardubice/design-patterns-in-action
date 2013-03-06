package example3;


public class Demo {
    public static void main(String[] args) {
        XMLBuilder xmlBuilder = new XMLBuilder();
        xmlBuilder.create("event").setAttribute("name", "Design Patterns in Action #1")
                .appendChild("speakers")
                    .appendChild("speaker").setAttribute("surname", "Honza").setAttribute("lastname", "Voráček")
                    .up()
                    .appendChild("speaker").setAttribute("surname", "Jirka").setAttribute("lastname", "Pénzeš")
                    .up()
                    .appendChild("speaker").setAttribute("surname", "Vojta").setAttribute("lastname", "Biberle")
                    .up()
                .up()
                .appendChild("content")
                    .appendChild("patterns")
                        .appendChild("pattern").setAttribute("type", "creational").setAttribute("name", "Sigleton")
                        .up()
                        .appendChild("pattern").setAttribute("type", "creational").setAttribute("name", "Factory")
                        .up()
                        .appendChild("pattern").setAttribute("type", "creational").setAttribute("name", "Builder");
        
        String xml = xmlBuilder.getResult();
        System.out.println(xml);
    }
}
