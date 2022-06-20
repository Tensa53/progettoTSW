package com.example.progettotsw.model;

import jakarta.servlet.http.HttpServlet;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ordine extends HttpServlet {

    public Ordine() {

    }

    public Ordine(GregorianCalendar dataOrdine, Indirizzo indirizzo, Pagamento pagamento, BigDecimal totale, Utente utente) {
        this.dataOrdine = dataOrdine;
        this.indirizzo = indirizzo;
        this.pagamento = pagamento;
        this.totale = totale;
        this.utente = utente;
    }

    public GregorianCalendar getDataOrdine() {
        return dataOrdine;
    }

    public String getDataOrdineString() {
        return dataOrdine.get(GregorianCalendar.DAY_OF_MONTH) + "-" + (dataOrdine.get(GregorianCalendar.MONTH) + 1) + "-" + dataOrdine.get(GregorianCalendar.YEAR);
    }

    public String getDataOrdineReversedString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setCalendar(this.dataOrdine);
        String result = format.format(this.dataOrdine.getTime());

        return result;
    }

    public void setDataOrdine(GregorianCalendar dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public BigDecimal getTotale() {
        return totale;
    }

    public void setTotale(BigDecimal totale) {
        this.totale = totale;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    GregorianCalendar dataOrdine;
    Indirizzo indirizzo;
    Pagamento pagamento;
    BigDecimal totale;
    Utente utente;
}