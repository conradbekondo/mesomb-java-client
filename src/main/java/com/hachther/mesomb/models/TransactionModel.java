package com.hachther.mesomb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@Builder
public class TransactionModel {
    private String pk, status, type, b_party, message, service, reference, country, currency, fin_trx_id, name;
    private LocalDateTime ts;
    private float amount, fees, direction;
    private float trxamount;
    private String[] customer, products, location;
    /*@JsonCreator(mode= JsonCreator.Mode.PROPERTIES)
    public TransactionModel(@JsonProperty("pk") String pk,
                            @JsonProperty("status") String status,
                            @JsonProperty("type") String type,
                            @JsonProperty("b_party") String b_party,
                            @JsonProperty("message") String message,
                            @JsonProperty("reference") String reference,
                            @JsonProperty("country") String country,
                            @JsonProperty("currency") String currency,
                            @JsonProperty("fin_trx_id") String fin_trx_id,
                            @JsonProperty("name") String name,
                            @JsonProperty("ts") LocalDateTime ts,
                            @JsonProperty("amount") float amount,
                            @JsonProperty("fees") float fees,
                            @JsonProperty("direction") float direction,
                            @JsonProperty("trxamount") float trxamount,
                            @JsonProperty("customer") String[] customer,
                            @JsonProperty("products") String[] products,
                            @JsonProperty("location") String[] location) {

        this.pk = pk;
        this.status = status;
        this.type = type;
        this.b_party = b_party;
        this.message = message;
        this.reference = reference;
        this.country = country;
        this.currency = currency;
        this.fin_trx_id = fin_trx_id;
        this.name = name;
        this.ts = ts;
        this.amount = amount;
        this.fees = fees;
        this.direction = direction;
        this.trxamount = trxamount;
        this.customer = customer;
        this.products = products;
        this.location = location;
    }

    @JsonProperty("pk")
    private String pk;
    @JsonProperty("status")
    private String status;
    @JsonProperty("type")
    private String type;
    @JsonProperty("b_party")
    private String b_party;
    @JsonProperty("message")
    private String message;
    @JsonProperty("service")
    private String service;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("country")
    private String country;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("fin_trx_id")
    private String fin_trx_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ts")
    private LocalDateTime ts;
    @JsonProperty("amount")
    private float amount;
    @JsonProperty("fees")
    private float fees;
    @JsonProperty("direction")
    private float direction;
    @JsonProperty("trxamount")
    private float trxamount;
    @JsonProperty("customer")
    private String[] customer;
    @JsonProperty("products")
    private String[] products;
    @JsonProperty("location")
    private String[] location;*/

}
