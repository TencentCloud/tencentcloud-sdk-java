package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SignContractByKeywordRequest  extends AbstractModel{


    /**
    * 模块名
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 合同ID
    */
    @SerializedName("ContractResId")
    @Expose
    private String ContractResId;

    /**
    * 账户ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 授权时间，格式为年月日时分秒，例20160801095509
    */
    @SerializedName("AuthorizationTime")
    @Expose
    private String AuthorizationTime;

    /**
    * 授权IP地址
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 签章ID
    */
    @SerializedName("SealResId")
    @Expose
    private String SealResId;

    /**
    * 签署关键字，坐标和范围不得超过合同文件边界
    */
    @SerializedName("SignKeyword")
    @Expose
    private SignKeyword SignKeyword;

    /**
     * 获取模块名
     * @return Module 模块名
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名
     * @param Module 模块名
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取合同ID
     * @return ContractResId 合同ID
     */
    public String getContractResId() {
        return this.ContractResId;
    }

    /**
     * 设置合同ID
     * @param ContractResId 合同ID
     */
    public void setContractResId(String ContractResId) {
        this.ContractResId = ContractResId;
    }

    /**
     * 获取账户ID
     * @return AccountResId 账户ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * 设置账户ID
     * @param AccountResId 账户ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * 获取授权时间，格式为年月日时分秒，例20160801095509
     * @return AuthorizationTime 授权时间，格式为年月日时分秒，例20160801095509
     */
    public String getAuthorizationTime() {
        return this.AuthorizationTime;
    }

    /**
     * 设置授权时间，格式为年月日时分秒，例20160801095509
     * @param AuthorizationTime 授权时间，格式为年月日时分秒，例20160801095509
     */
    public void setAuthorizationTime(String AuthorizationTime) {
        this.AuthorizationTime = AuthorizationTime;
    }

    /**
     * 获取授权IP地址
     * @return Position 授权IP地址
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * 设置授权IP地址
     * @param Position 授权IP地址
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * 获取签章ID
     * @return SealResId 签章ID
     */
    public String getSealResId() {
        return this.SealResId;
    }

    /**
     * 设置签章ID
     * @param SealResId 签章ID
     */
    public void setSealResId(String SealResId) {
        this.SealResId = SealResId;
    }

    /**
     * 获取签署关键字，坐标和范围不得超过合同文件边界
     * @return SignKeyword 签署关键字，坐标和范围不得超过合同文件边界
     */
    public SignKeyword getSignKeyword() {
        return this.SignKeyword;
    }

    /**
     * 设置签署关键字，坐标和范围不得超过合同文件边界
     * @param SignKeyword 签署关键字，坐标和范围不得超过合同文件边界
     */
    public void setSignKeyword(SignKeyword SignKeyword) {
        this.SignKeyword = SignKeyword;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ContractResId", this.ContractResId);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamSimple(map, prefix + "AuthorizationTime", this.AuthorizationTime);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "SealResId", this.SealResId);
        this.setParamObj(map, prefix + "SignKeyword.", this.SignKeyword);

    }
}

