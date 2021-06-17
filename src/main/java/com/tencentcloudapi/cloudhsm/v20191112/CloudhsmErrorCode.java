package com.tencentcloudapi.cloudhsm.v20191112;
public enum CloudhsmErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private CloudhsmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

