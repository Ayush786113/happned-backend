package com.happned;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
class Meta{
    @JsonProperty("message")
    public String getMessage() {
        return this.message; }
    public void setMessage(String message) {
        this.message = message; }
    String message;
}
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error{
    @JsonProperty("success")
    public boolean getSuccess() {
        return this.success; }
    public void setSuccess(boolean success) {
        this.success = success; }
    boolean success;
    @JsonProperty("status")
    public int getStatus() {
        return this.status; }
    public void setStatus(int status) {
        this.status = status; }
    int status;
    @JsonProperty("error")
    public String getError() {
        return this.error; }
    public void setError(String error) {
        this.error = error; }
    String error;
    @JsonProperty("data")
    public Meta getData() {
        return this.data; }
    public void setData(Meta meta) {
        this.data = meta; }
    Meta data;
    @JsonProperty("error_code")
    public int getError_code() {
        return this.error_code; }
    public void setError_code(int error_code) {
        this.error_code = error_code; }
    int error_code;
}


