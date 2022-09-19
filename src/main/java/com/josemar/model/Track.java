package com.josemar.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ordem",
    "linha",
    "latitude",
    "longitude",
    "velocidade",
    "dataHora"
})
@Generated("jsonschema2pojo")
public class Track {

    @JsonProperty("ordem")
    private String ordem;
    @JsonProperty("linha")
    private String linha;
    @JsonProperty("latitude")
    private Float latitude;
    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("velocidade")
    private String velocidade;
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    @JsonProperty("dataHora")
    private LocalDateTime dataHora;

    @JsonProperty("ordem")
    public String getOrdem() {
        return ordem;
    }

    @JsonProperty("ordem")
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    @JsonProperty("linha")
    public String getLinha() {
        return linha;
    }

    @JsonProperty("linha")
    public void setLinha(String linha) {
        this.linha = linha;
    }

    @JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("velocidade")
    public String getVelocidade() {
        return velocidade;
    }

    @JsonProperty("velocidade")
    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @JsonProperty("dataHora")
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @JsonProperty("dataHora")
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

}
