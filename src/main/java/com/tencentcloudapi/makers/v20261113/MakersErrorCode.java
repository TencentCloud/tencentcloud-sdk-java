package com.tencentcloudapi.makers.v20261113;
public enum MakersErrorCode {
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* Git 授权已过期。 */
     FAILEDOPERATION_GITAUTHEXPIRED("FailedOperation.GitAuthExpired"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数取值不合法，或请求的资源不属于当前账号。 */
     INVALIDPARAMETER_SECURITY("InvalidParameter.Security"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 当前套餐不支持该操作，或已达到套餐配额上限。 */
     LIMITEXCEEDED_QUOTA("LimitExceeded.Quota"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable");
     
    private String value;
    private MakersErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

