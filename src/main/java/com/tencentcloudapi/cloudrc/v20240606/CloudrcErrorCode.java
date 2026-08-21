package com.tencentcloudapi.cloudrc.v20240606;
public enum CloudrcErrorCode {
     /* Api参数校验不通过 */
     INVALIDPARAMETER_APIPARAMERROR("InvalidParameter.ApiParamError"),
     
     /* 资源ID不存在 */
     RESOURCENOTFOUND_RESOURCEIDNOTFOUND("ResourceNotFound.ResourceIdNotFound"),
     
     /* 视图ID不存在 */
     RESOURCENOTFOUND_VIEWIDNOTFOUND("ResourceNotFound.ViewIdNotFound");
     
    private String value;
    private CloudrcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

