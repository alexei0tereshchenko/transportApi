package model;

public interface Schedule {
    enum Weak {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN
    }

    enum TimeInterval {
        T00_01,
        T01_02,
        T02_03,
        T03_04,
        T04_05,
        T05_06,
        T06_07,
        T07_08,
        T08_09,
        T09_10,
        T10_11,
        T11_12,
        T12_13,
        T13_14,
        T14_15,
        T15_16,
        T16_17,
        T17_18,
        T18_19,
        T19_20,
        T20_21,
        T21_22,
        T22_23,
        T23_24
    }
}
