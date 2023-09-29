package com.klasher.KlashaGeoCurrencyService.dto.res.response;

import com.klasher.KlashaGeoCurrencyService.dto.req.request.CityDataDto;

import java.util.List;

public class ApiResponse {
    private boolean error;
    private String msg;
    private List<CityDataDto> data;

    public ApiResponse() {
    }

    public ApiResponse(boolean error, String msg, List<CityDataDto> data) {
        this.error = error;
        this.msg = msg;
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CityDataDto> getData() {
        return data;
    }

    public void setData(List<CityDataDto> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "error=" + error +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
