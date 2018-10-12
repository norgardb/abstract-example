package com.metatove.dataparser;

/**
 * Example of an abstract class and its implementations.
 *
 * https://www.javacodegeeks.com/2013/03/template-method-design-pattern-in-java.html
 */
abstract public class DataParser {

    // Template method
    // This method defines a generic structure for parsing data
    void parseDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    // These  methods will be implemented in subclasses
    abstract void readData();
    abstract void processData();

    // Write output to a CSV file :  this step is the same for all subclasses
    private void writeData() {
        System.out.println("Output generated, writing to an output file");
    }
}

