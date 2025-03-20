package com.tencentcloudapi.gwlb.v20240906;
public enum GwlbErrorCode {
     /*         操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /*         FailedOperation.ResourceInOperating */
     FAILEDOPERATION_RESOURCEINOPERATING("FailedOperation.ResourceInOperating"),
     
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /*         InvalidParameter.FormatError */
     INVALIDPARAMETER_FORMATERROR("InvalidParameter.FormatError"),
     
     /*         InvalidParameter.RegionNotFound */
     INVALIDPARAMETER_REGIONNOTFOUND("InvalidParameter.RegionNotFound"),
     
     /*         参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /*         存在相同的值。 */
     INVALIDPARAMETERVALUE_DUPLICATE("InvalidParameterValue.Duplicate"),
     
     /*         Filter参数输入错误。 */
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
     /*         InvalidParameterValue.Length */
     INVALIDPARAMETERVALUE_LENGTH("InvalidParameterValue.Length"),
     
     /*         超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /*         未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private GwlbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

