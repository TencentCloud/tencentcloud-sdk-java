package com.tencentcloudapi.cdz.v20221123;
public enum CdzErrorCode {
     /* 方法不存在 */
     FAILEDOPERATION_INVALIDACTION("FailedOperation.InvalidAction"),
     
     /* HostUuids参数和InstancesIds参数不能同时传递。 */
     INVALIDPARAMETER_HOSTUUIDSANDINSIDSCANNOTAPPEARSAMETIME("InvalidParameter.HostUuidsAndInsIdsCannotAppearSameTime"),
     
     /* 该专属可用区不存在 */
     RESOURCENOTFOUND_CDZIDNOTFOUND("ResourceNotFound.CdzIdNotFound");
     
    private String value;
    private CdzErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

