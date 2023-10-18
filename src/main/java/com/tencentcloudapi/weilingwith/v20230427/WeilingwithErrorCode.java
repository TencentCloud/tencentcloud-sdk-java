package com.tencentcloudapi.weilingwith.v20230427;
public enum WeilingwithErrorCode {
    // 未找到此应用该api授权信息
     AUTHFAILURE_APIAUTHORIZATIONNOTFOUND("AuthFailure.ApiAuthorizationNotFound"),
     
    // 未找到该token信息
     AUTHFAILURE_TOKENNOTFOUND("AuthFailure.TokenNotFound"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // API网关内部错误
     INTERNALERROR_APIGATEWAYINTERNALERROR("InternalError.ApiGatewayInternalError"),
     
    // 该应用未关联该项目空间数据，无法获取该项目空间数据
     INTERNALERROR_APPAPINOSPACEPERMISSION("InternalError.AppApiNoSpacePermission"),
     
    // 未知错误
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 应用id非法
     INVALIDPARAMETERVALUE_INVALIDAPPLICATIONID("InvalidParameterValue.InvalidApplicationId"),
     
    // 错误的工作空间Id
     INVALIDPARAMETERVALUE_INVALIDWORKSPACEID("InvalidParameterValue.InvalidWorkspaceId");
     
    private String value;
    private WeilingwithErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

