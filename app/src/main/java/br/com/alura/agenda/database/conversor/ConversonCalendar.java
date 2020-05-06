package br.com.alura.agenda.database.conversor;

import android.arch.persistence.room.TypeConverter;

import java.util.Calendar;

public class ConversonCalendar {

    @TypeConverter
    public Long toLong(Calendar calendar) {
        return calendar.getTimeInMillis();
    }

    @TypeConverter
    public Calendar toCalendar(Long valor) {
        Calendar momentoAtual = Calendar.getInstance();
        if(valor != null) {
            momentoAtual.setTimeInMillis(valor);
        }
        return momentoAtual;
    }
}
