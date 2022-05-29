package com.example.cia_3;

public class search1 {
    String TRAIN_NO, TRAIN_NAME, DEP_STATION, ARRIVAL_STATION, DEP_TIME, ARRIVAL_TIME, DAYS;

    public search1(String t_num, String t_name, String dep_st, String arv_st, String time, String a_time, String days) {
        this.TRAIN_NO = t_num;
        this.TRAIN_NAME = t_name;
        this.DEP_STATION = dep_st;
        this.ARRIVAL_STATION = arv_st;
        this.DEP_TIME = time;
        this.ARRIVAL_TIME = a_time;
        this.DAYS = days;


    }

    public String getTRAIN_NO() {
        return TRAIN_NO;
    }

    public void getTRAIN_NO(String TRAIN_NO) {
        TRAIN_NO = TRAIN_NO;
    }

    public String getTRAIN_NAME() {
        return TRAIN_NAME;
    }

    public void getDATE(String TRAIN_NAME) {
        TRAIN_NAME = TRAIN_NAME;
    }

    public String getDEP_STATION() {
        return DEP_STATION;
    }

    public void setDEP_STATION(String DEP_STATION) {
        DEP_STATION = DEP_STATION;
    }

    public String getARRIVAL_STATION() {
        return ARRIVAL_STATION;
    }

    public void setARRIVAL_STATION(String ARRIVAL_STATION) {
        ARRIVAL_STATION = ARRIVAL_STATION;
    }

    public String getARRIVAL_TIME() {
        return ARRIVAL_TIME;
    }

    public void setARRIVAL_TIME(String ARRIVAL_TIME) {
        ARRIVAL_TIME = ARRIVAL_TIME;
    }

    public String getDAYS() {
        return DAYS;
    }

    public void setDAYS(String DAYS) {
        DAYS = DAYS;
    }
}
