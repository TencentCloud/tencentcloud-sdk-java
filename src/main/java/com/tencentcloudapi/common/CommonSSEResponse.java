package com.tencentcloudapi.common;

public final class CommonSSEResponse extends SSEResponseModel {
    private String RequestId;

    @Override
    public String getRequestId() {
        return RequestId;
    }

    @Override
    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}