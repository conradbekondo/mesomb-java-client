package com.hachther.mesomb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.json.simple.JSONObject;

import java.util.Map;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@Builder
public class TransactionResponse {
    private boolean success;
    private String message;
    private String redirect;
    private TransactionModel transaction;
    private String reference;
    private String status;

    public boolean isTransactionSuccess() {
        return this.success && Objects.equals(this.status, "SUCCESS");
    }
}
