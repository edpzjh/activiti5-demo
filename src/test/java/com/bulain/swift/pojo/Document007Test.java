package com.bulain.swift.pojo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;

@Ignore
public class Document007Test {
    @Test
    public void testUnmarshal() throws IOException, JAXBException {
        // get test file
        File file = getTestFile("acmt/acmt.007.001.01.xml");

        // unmarshal
        Document007 document = JAXB.unmarshal(file, Document007.class);

        // assert
        assertNotNull(document);
        assertNotNull(document.getAcctOpngReq());
    }

    @Test
    public void testMarshal() throws IOException, JAXBException, SAXException {
        // prepare
        File file = getTestFile("acmt/acmt.007.001.01.xml");
        Document007 document = JAXB.unmarshal(file, Document007.class);

        ByteArrayOutputStream os = new ByteArrayOutputStream();

        // marshal
        JAXB.marshal(document, os);
        // SchemaFactory sf =
        // SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        // Schema schema = sf.newSchema(new
        // StreamSource(getTestFile("xsd/acmt.007.001.01.xsd")));
        // Class[] classesToBeBound = new Class[]{document.getClass()};
        // Map<String, ?> properties = new HashMap<String, Object>();
        // JAXBContext context = JAXBContext.newInstance(classesToBeBound,
        // properties);
        // Marshaller marshaller = context.createMarshaller();
        // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // marshaller.setSchema(schema);
        // marshaller.marshal(document, os);

        // assert
        assertTrue(os.size() > 0);
        System.out.println(os);
    }

    private File getTestFile(String path) throws IOException {
        ClassPathResource resource = new ClassPathResource(path);
        return resource.getFile();
    }
}
