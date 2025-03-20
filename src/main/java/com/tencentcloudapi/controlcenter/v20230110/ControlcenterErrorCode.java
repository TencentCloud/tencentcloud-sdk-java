package com.tencentcloudapi.controlcenter.v20230110;
public enum ControlcenterErrorCode {
     /*         账号工厂必选基线项未配置 */
     FAILEDOPERATION_AFREQUIREDITEMNOTSELECT("FailedOperation.AFRequiredItemNotSelect"),
     
     /*         账号工厂基线项的依赖项未配置 */
     FAILEDOPERATION_ACCOUNTFACTORYDEPENDONITEMNOTCONFIG("FailedOperation.AccountFactoryDependOnItemNotConfig"),
     
     /*         账号工厂批量应用基线的账号数量超过限制 */
     FAILEDOPERATION_ACCOUNTFACTORYMEMBERUINNUMEXCEED("FailedOperation.AccountFactoryMemberUinNumExceed"),
     
     /*         用户正在部署账号基线中，无法重复部署 */
     FAILEDOPERATION_ACCOUNTFACTORYTASKISDEPLOYING("FailedOperation.AccountFactoryTaskIsDeploying"),
     
     /*         Control Center服务未开通 */
     FAILEDOPERATION_CONTROLCENTERNOTOPEN("FailedOperation.ControlCenterNotOpen"),
     
     /*         数据库操作异常 */
     FAILEDOPERATION_DBOPERATIONERROR("FailedOperation.DBOperationError"),
     
     /*         依赖的功能项未部署 */
     FAILEDOPERATION_DEPENDONITEMNOTDEPLOY("FailedOperation.DependOnItemNotDeploy"),
     
     /*         远程调用失败 */
     FAILEDOPERATION_REMOTECALLERROR("FailedOperation.RemoteCallError"),
     
     /*         基线项预设标签数量超过最大数量 */
     INVALIDPARAMETER_ACCOUNTFACTORYTAGEXCEEDMAXNUM("InvalidParameter.AccountFactoryTagExceedMaxNum"),
     
     /*         入参校验错误 */
     INVALIDPARAMETER_PARAMERROR("InvalidParameter.ParamError"),
     
     /*         用户基线配置数据不存在 */
     RESOURCENOTFOUND_ACCOUNTFACTORYBASELINENOTEXIST("ResourceNotFound.AccountFactoryBaselineNotExist"),
     
     /*         用户所部署的基线项未配置 */
     RESOURCENOTFOUND_ACCOUNTFACTORYITEMNOTCONFIG("ResourceNotFound.AccountFactoryItemNotConfig"),
     
     /*         账号工厂基线不存在 */
     RESOURCENOTFOUND_ACCOUNTFACTORYITEMNOTEXIST("ResourceNotFound.AccountFactoryItemNotExist");
     
    private String value;
    private ControlcenterErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

