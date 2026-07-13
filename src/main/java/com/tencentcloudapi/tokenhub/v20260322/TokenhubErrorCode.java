package com.tencentcloudapi.tokenhub.v20260322;
public enum TokenhubErrorCode {
     /* FailedOperation.CreateInstanceFailed */
     FAILEDOPERATION_CREATEINSTANCEFAILED("FailedOperation.CreateInstanceFailed"),
     
     /* FailedOperation.EnablePostPaidFailed */
     FAILEDOPERATION_ENABLEPOSTPAIDFAILED("FailedOperation.EnablePostPaidFailed"),
     
     /* FailedOperation.EndpointAlreadyExists */
     FAILEDOPERATION_ENDPOINTALREADYEXISTS("FailedOperation.EndpointAlreadyExists"),
     
     /* FailedOperation.EndpointNotFound */
     FAILEDOPERATION_ENDPOINTNOTFOUND("FailedOperation.EndpointNotFound"),
     
     /* FailedOperation.EndpointNotHealthy */
     FAILEDOPERATION_ENDPOINTNOTHEALTHY("FailedOperation.EndpointNotHealthy"),
     
     /* FailedOperation.FreeQuotaExhausted */
     FAILEDOPERATION_FREEQUOTAEXHAUSTED("FailedOperation.FreeQuotaExhausted"),
     
     /* FailedOperation.NoTPMPackage */
     FAILEDOPERATION_NOTPMPACKAGE("FailedOperation.NoTPMPackage"),
     
     /* FailedOperation.OperationDenied */
     FAILEDOPERATION_OPERATIONDENIED("FailedOperation.OperationDenied"),
     
     /* FailedOperation.PackageQueryFailed */
     FAILEDOPERATION_PACKAGEQUERYFAILED("FailedOperation.PackageQueryFailed"),
     
     /* FailedOperation.PurchaseTPMFailed */
     FAILEDOPERATION_PURCHASETPMFAILED("FailedOperation.PurchaseTpmFailed"),
     
     /* FailedOperation.SetRenewFlagFailed */
     FAILEDOPERATION_SETRENEWFLAGFAILED("FailedOperation.SetRenewFlagFailed"),
     
     /* FailedOperation.TPMPackagePending */
     FAILEDOPERATION_TPMPACKAGEPENDING("FailedOperation.TPMPackagePending"),
     
     /* InternalError.BaradError */
     INTERNALERROR_BARADERROR("InternalError.BaradError"),
     
     /* InternalError.InternalError */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* InvalidParameter.InvalidParameter */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* InvalidParameter.Limit */
     INVALIDPARAMETER_LIMIT("InvalidParameter.Limit"),
     
     /* InvalidParameter.ModelIdNotFound */
     INVALIDPARAMETER_MODELIDNOTFOUND("InvalidParameter.ModelIdNotFound"),
     
     /* InvalidParameter.PeriodExceedsSpan */
     INVALIDPARAMETER_PERIODEXCEEDSSPAN("InvalidParameter.PeriodExceedsSpan"),
     
     /* InvalidParameter.PeriodTooFineForData */
     INVALIDPARAMETER_PERIODTOOFINEFORDATA("InvalidParameter.PeriodTooFineForData"),
     
     /* InvalidParameter.QPMLimitExceeded */
     INVALIDPARAMETER_QPMLIMITEXCEEDED("InvalidParameter.QPMLimitExceeded"),
     
     /* InvalidParameter.TPMBelowQuota */
     INVALIDPARAMETER_TPMBELOWQUOTA("InvalidParameter.TPMBelowQuota"),
     
     /* InvalidParameter.TPMInputBelowQuota */
     INVALIDPARAMETER_TPMINPUTBELOWQUOTA("InvalidParameter.TPMInputBelowQuota"),
     
     /* InvalidParameter.TPMInputLimitExceeded */
     INVALIDPARAMETER_TPMINPUTLIMITEXCEEDED("InvalidParameter.TPMInputLimitExceeded"),
     
     /* InvalidParameter.TPMLimitExceeded */
     INVALIDPARAMETER_TPMLIMITEXCEEDED("InvalidParameter.TPMLimitExceeded"),
     
     /* InvalidParameter.TPMOutputBelowQuota */
     INVALIDPARAMETER_TPMOUTPUTBELOWQUOTA("InvalidParameter.TPMOutputBelowQuota"),
     
     /* InvalidParameter.TPMOutputLimitExceeded */
     INVALIDPARAMETER_TPMOUTPUTLIMITEXCEEDED("InvalidParameter.TPMOutputLimitExceeded"),
     
     /* InvalidParameter.TPMPreQuotaModifyNotSupported */
     INVALIDPARAMETER_TPMPREQUOTAMODIFYNOTSUPPORTED("InvalidParameter.TPMPreQuotaModifyNotSupported"),
     
     /* InvalidParameter.TooManyObjects */
     INVALIDPARAMETER_TOOMANYOBJECTS("InvalidParameter.TooManyObjects"),
     
     /* InvalidParameterValue.EndpointNameTooLong */
     INVALIDPARAMETERVALUE_ENDPOINTNAMETOOLONG("InvalidParameterValue.EndpointNameTooLong"),
     
     /* InvalidParameterValue.InvalidParameterValue */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* LimitExceeded.EndpointQuota */
     LIMITEXCEEDED_ENDPOINTQUOTA("LimitExceeded.EndpointQuota"),
     
     /* MissingParameter.MissingParameter */
     MISSINGPARAMETER_MISSINGPARAMETER("MissingParameter.MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* OperationDenied.OperationDenied */
     OPERATIONDENIED_OPERATIONDENIED("OperationDenied.OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* ResourceNotFound.EndpointNotFound */
     RESOURCENOTFOUND_ENDPOINTNOTFOUND("ResourceNotFound.EndpointNotFound"),
     
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

