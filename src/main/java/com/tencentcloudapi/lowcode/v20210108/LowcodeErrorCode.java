package com.tencentcloudapi.lowcode.v20210108;
public enum LowcodeErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 文档正在解析中不允许删除 */
     FAILEDOPERATION_DOCPARSINGNOTDELETE("FailedOperation.DocParsingNotDelete"),
     
     /* 低码用户不存在。 */
     FAILEDOPERATION_LOWCODEUSERNOTEXIST("FailedOperation.LowcodeUserNotExist"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound");
     
    private String value;
    private LowcodeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

