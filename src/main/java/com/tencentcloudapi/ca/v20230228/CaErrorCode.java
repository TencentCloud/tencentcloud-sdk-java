package com.tencentcloudapi.ca.v20230228;
public enum CaErrorCode {
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         无效的过滤器 */
     INVALIDFILTER("InvalidFilter"),
     
     /*         参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /*         参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /*         缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter");
     
    private String value;
    private CaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

