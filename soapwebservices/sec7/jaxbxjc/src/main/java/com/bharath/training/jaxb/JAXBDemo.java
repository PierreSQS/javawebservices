package com.bharath.training.jaxb;

import com.bharatthippireddy.patient.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JAXBDemo {
    public static void main(String... args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Patient.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        Patient patient = new Patient();
        patient.setId(123);
        patient.setName("Pierrot");

        StringWriter stringWriter = new StringWriter();

        marshaller.marshal(patient, stringWriter);

        System.out.println("## The Patient XML-File: "+stringWriter);

    }
}
