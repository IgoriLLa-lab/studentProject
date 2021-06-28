package edu.javacourse.studentorder.domain;

public class CityRegisterCheckerResponse {

   private boolean existing;//зарегистрирован или нет
   private Boolean temporal;//класс обертка, три состояни true false null...поле для временной или постоянной регистрации

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}
