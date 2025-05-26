package com.example.smartcities.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CIUDAD")
public class Ciudad {

    @Id
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "KPI_AIRE_ID")
    private KpiStatus kpiAire;

    @ManyToOne
    @JoinColumn(name = "KPI_TRANSPORTE_ID")
    private KpiStatus kpiTransporte;

    @ManyToOne
    @JoinColumn(name = "KPI_AGUA_ID")
    private KpiStatus kpiAgua;

    @ManyToOne
    @JoinColumn(name = "KPI_SEGURIDAD_ID")
    private KpiStatus kpiSeguridad;

    @ManyToOne
    @JoinColumn(name = "KPI_SALUD_ID")
    private KpiStatus kpiSalud;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public KpiStatus getKpiAire() {
        return kpiAire;
    }

    public void setKpiAire(KpiStatus kpiAire) {
        this.kpiAire = kpiAire;
    }

    public KpiStatus getKpiTransporte() {
        return kpiTransporte;
    }

    public void setKpiTransporte(KpiStatus kpiTransporte) {
        this.kpiTransporte = kpiTransporte;
    }

    public KpiStatus getKpiAgua() {
        return kpiAgua;
    }

    public void setKpiAgua(KpiStatus kpiAgua) {
        this.kpiAgua = kpiAgua;
    }

    public KpiStatus getKpiSeguridad() {
        return kpiSeguridad;
    }

    public void setKpiSeguridad(KpiStatus kpiSeguridad) {
        this.kpiSeguridad = kpiSeguridad;
    }

    public KpiStatus getKpiSalud() {
        return kpiSalud;
    }

    public void setKpiSalud(KpiStatus kpiSalud) {
        this.kpiSalud = kpiSalud;
    }
}
