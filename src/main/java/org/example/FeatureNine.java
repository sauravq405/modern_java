package org.example;

import org.example.dto.BMWEngine;

public class FeatureNine {

    //FEATURE NINE: Flexible Constructor Bodies
    //Java 25 finalized Flexible Constructor Bodies (JEP 513).
    //super(), this() need not be the first statement inside constructor
    static void main() {
        BMWEngine bmwEngine = new BMWEngine("car");
    }
}
