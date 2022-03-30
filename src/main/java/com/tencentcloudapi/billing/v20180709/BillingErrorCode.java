package com.tencentcloudapi.billing.v20180709;
public enum BillingErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 没有权限。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 代理支付设备不能降配。
     FAILEDOPERATION_AGENTPAYDEALCANNOTDOWN("FailedOperation.AgentPayDealCannotDown"),
     
    // 账户余额不足。
     FAILEDOPERATION_BALANCEINSUFFICIENT("FailedOperation.BalanceInsufficient"),
     
    // appId不符。
     FAILEDOPERATION_INVALIDAPPID("FailedOperation.InvalidAppId"),
     
    // 订单状态错误，只有未支付订单才能支付。
     FAILEDOPERATION_INVALIDDEAL("FailedOperation.InvalidDeal"),
     
    // 代金券不可用。
     FAILEDOPERATION_INVALIDVOUCHER("FailedOperation.InvalidVoucher"),
     
    // 一起购买的订单必须同时支付。
     FAILEDOPERATION_NEEDPAYTOGETER("FailedOperation.NeedPayTogeter"),
     
    // 套餐订单需一起购买。
     FAILEDOPERATION_NEEDPAYTOGETHER("FailedOperation.NeedPayTogether"),
     
    // 支付失败，请联系腾讯云工作人员处理。
     FAILEDOPERATION_PAYPRICEERROR("FailedOperation.PayPriceError"),
     
    // 支付成功但发货失败，请联系腾讯云工作人员处理。
     FAILEDOPERATION_PAYSUCCDELIVERFAILED("FailedOperation.PaySuccDeliverFailed"),
     
    // 获取数据条数失败。
     FAILEDOPERATION_QUERYCOUNTFAILED("FailedOperation.QueryCountFailed"),
     
    // 汇总数据正在构建中，请稍后再试。
     FAILEDOPERATION_SUMMARYDATANOTREADY("FailedOperation.SummaryDataNotReady"),
     
    // 不存在该分账标签键。
     FAILEDOPERATION_TAGKEYNOTEXIST("FailedOperation.TagKeyNotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 网关错误。
     INTERNALERROR_GATEWAYERROR("InternalError.GatewayError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 账号没有cam授权。
     UNAUTHORIZEDOPERATION_CAMNOAUTH("UnauthorizedOperation.CamNoAuth"),
     
    // 因账号安全升级，购买云资源需完善您的实名信息。
     UNAUTHORIZEDOPERATION_CERTIFICATIONNEEDUPGRADE("UnauthorizedOperation.CertificationNeedUpgrade"),
     
    // 账号没有实名认证，支付失败。
     UNAUTHORIZEDOPERATION_NOTCERTIFICATION("UnauthorizedOperation.NotCertification"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private BillingErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

