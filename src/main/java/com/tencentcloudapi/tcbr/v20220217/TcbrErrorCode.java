package com.tencentcloudapi.tcbr.v20220217;
public enum TcbrErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不足。 */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 请求参数中的云托管版本未找到 */
     RESOURCENOTFOUND_VERSIONNOTFOUND("ResourceNotFound.VersionNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* 资源被封禁 */
     RESOURCEUNAVAILABLE_RESOURCEBANNED("ResourceUnavailable.ResourceBanned"),
     
     /* 资源已冻结 */
     RESOURCEUNAVAILABLE_RESOURCEFROZEN("ResourceUnavailable.ResourceFrozen"),
     
     /* 资源已隔离 */
     RESOURCEUNAVAILABLE_RESOURCEISOLATED("ResourceUnavailable.ResourceIsolated"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TcbrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

