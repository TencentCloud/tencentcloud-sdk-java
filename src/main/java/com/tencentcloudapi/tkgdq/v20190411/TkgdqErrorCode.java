package com.tencentcloudapi.tkgdq.v20190411;
public enum TkgdqErrorCode {
    // 内部错误
     INTERNALERROR("InternalError"),
     
    // 图数据库引擎内部错误
     INTERNALERROR_GRAPHENGINEERROR("InternalError.GraphEngineError"),
     
    // 图查询引擎计算超时错误
     INTERNALERROR_GREMLINTIMEOUTERROR("InternalError.GremlinTimeoutError"),
     
    // 请求数据解析失败
     INTERNALERROR_REQUESTENCODEERROR("InternalError.RequestEncodeError"),
     
    // 读取请求数据内容失败
     INTERNALERROR_REQUESTPARSEERROR("InternalError.RequestParseError"),
     
    // 系统响应解析失败
     INTERNALERROR_RESPONSEDECODEERROR("InternalError.ResponseDecodeError"),
     
    // 参数错误
     INVALIDPARAMETER("InvalidParameter"),
     
    // 不可用的接口操作错误
     INVALIDPARAMETER_INVALIDACTIONERROR("InvalidParameter.InvalidActionError"),
     
    // 参数取值错误
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 账户余量不足错误
     LIMITEXCEEDED_INSUFFICIENTBALANCEERROR("LimitExceeded.InsufficientBalanceError"),
     
    // 未授权的用户请求错误
     UNAUTHORIZEDOPERATION_UNAUTHORIZEDACCOUNTERROR("UnauthorizedOperation.UnauthorizedAccountError");
     
    private String value;
    private TkgdqErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

