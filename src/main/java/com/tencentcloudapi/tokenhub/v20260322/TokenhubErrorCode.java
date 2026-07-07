package com.tencentcloudapi.tokenhub.v20260322;
public enum TokenhubErrorCode {
     /* InternalError.BaradError */
     INTERNALERROR_BARADERROR("InternalError.BaradError"),
     
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* InvalidParameter.PeriodExceedsSpan */
     INVALIDPARAMETER_PERIODEXCEEDSSPAN("InvalidParameter.PeriodExceedsSpan"),
     
     /* InvalidParameter.PeriodTooFineForData */
     INVALIDPARAMETER_PERIODTOOFINEFORDATA("InvalidParameter.PeriodTooFineForData"),
     
     /* InvalidParameter.TooManyObjects */
     INVALIDPARAMETER_TOOMANYOBJECTS("InvalidParameter.TooManyObjects"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* ResourceNotFound.GlossaryNotFound */
     RESOURCENOTFOUND_GLOSSARYNOTFOUND("ResourceNotFound.GlossaryNotFound"),
     
     /* ResourceNotFound.ResourceNotFound */
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
     /* UnauthorizedOperation.UnauthorizedOperation */
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDOPERATION("UnauthorizedOperation.UnauthorizedOperation");
     
    private String value;
    private TokenhubErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

