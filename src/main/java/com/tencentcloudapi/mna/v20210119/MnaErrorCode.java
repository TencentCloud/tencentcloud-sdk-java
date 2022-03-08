package com.tencentcloudapi.mna.v20210119;
public enum MnaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 无法获取到可加速的运营商信息
     INVALIDPARAMETERVALUE_VENDORNOTFOUND("InvalidParameterValue.VendorNotFound"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 不建议加速。
     OPERATIONDENIED_ACCELERATIONNOTSUGGEST("OperationDenied.AccelerationNotSuggest"),
     
    // 中国电信加速token过期。
     OPERATIONDENIED_CTCCTOKENEXPIRED("OperationDenied.CTCCTokenExpired"),
     
    // 相同加速间隔时间过短。
     OPERATIONDENIED_CREATEQOSEXCEEDLIMIT("OperationDenied.CreateQosExceedLimit"),
     
    // 请求运营商加速超时。
     OPERATIONDENIED_REQUESTQOSTIMEOUT("OperationDenied.RequestQosTimeout"),
     
    // 该用户加速已取消，不处于加速状态。
     OPERATIONDENIED_USERNONACCELERATED("OperationDenied.UserNonAccelerated"),
     
    // 该用户不在运营商网络可加速范围内
     OPERATIONDENIED_USEROUTOFCOVERAGE("OperationDenied.UserOutOfCoverage"),
     
    // 运营商返回结果错误。
     OPERATIONDENIED_VENDORRETURNERROR("OperationDenied.VendorReturnError"),
     
    // 运营商服务器临时错误。
     OPERATIONDENIED_VENDORSERVERERROR("OperationDenied.VendorServerError"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MnaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

