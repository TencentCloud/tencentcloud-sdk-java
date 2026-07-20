package com.tencentcloudapi.rce.v20260130;
public enum RceErrorCode {
     /* 系统异常。 */
     INTERNALERROR_SYSTEMEXCEPTION("InternalError.SystemException"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 必填字段缺失。 */
     INVALIDPARAMETER_FIELDMISSED("InvalidParameter.FieldMissed"),
     
     /* 字段格式错误。 */
     INVALIDPARAMETER_INVALIDFORMAT("InvalidParameter.InvalidFormat"),
     
     /* 字段非法取值。 */
     INVALIDPARAMETER_INVALIDVALUE("InvalidParameter.InvalidValue"),
     
     /* 字段长度超过最大限制。 */
     INVALIDPARAMETER_LENGTHEXCEED("InvalidParameter.LengthExceed"),
     
     /* 事件不存在。 */
     INVALIDPARAMETERVALUE_EVENTNOTEXIST("InvalidParameterValue.EventNotExist"),
     
     /* 租户不存在。 */
     INVALIDPARAMETERVALUE_TENANTNOTEXIST("InvalidParameterValue.TenantNotExist"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 缺少参数错误，必传参数未填。 */
     MISSINGPARAMETER_FIELDMISSED("MissingParameter.FieldMissed"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private RceErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

