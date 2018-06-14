package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateContractByUploadRequest  extends AbstractModel{


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
    * 签署人信息
    */
    @SerializedName("SignInfos")
    @Expose
    private SignInfo [] SignInfos;

    /**
    * 合同上传链接地址
    */
    @SerializedName("ContractFile")
    @Expose
    private String ContractFile;

    /**
    * 合同名称
    */
    @SerializedName("ContractName")
    @Expose
    private String ContractName;

    /**
    * 备注
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * 合同发起方帐号ID
    */
    @SerializedName("Initiator")
    @Expose
    private String Initiator;

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
     * 获取签署人信息
     * @return SignInfos 签署人信息
     */
    public SignInfo [] getSignInfos() {
        return this.SignInfos;
    }

    /**
     * 设置签署人信息
     * @param SignInfos 签署人信息
     */
    public void setSignInfos(SignInfo [] SignInfos) {
        this.SignInfos = SignInfos;
    }

    /**
     * 获取合同上传链接地址
     * @return ContractFile 合同上传链接地址
     */
    public String getContractFile() {
        return this.ContractFile;
    }

    /**
     * 设置合同上传链接地址
     * @param ContractFile 合同上传链接地址
     */
    public void setContractFile(String ContractFile) {
        this.ContractFile = ContractFile;
    }

    /**
     * 获取合同名称
     * @return ContractName 合同名称
     */
    public String getContractName() {
        return this.ContractName;
    }

    /**
     * 设置合同名称
     * @param ContractName 合同名称
     */
    public void setContractName(String ContractName) {
        this.ContractName = ContractName;
    }

    /**
     * 获取备注
     * @return Remarks 备注
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * 设置备注
     * @param Remarks 备注
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * 获取合同发起方帐号ID
     * @return Initiator 合同发起方帐号ID
     */
    public String getInitiator() {
        return this.Initiator;
    }

    /**
     * 设置合同发起方帐号ID
     * @param Initiator 合同发起方帐号ID
     */
    public void setInitiator(String Initiator) {
        this.Initiator = Initiator;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "SignInfos.", this.SignInfos);
        this.setParamSimple(map, prefix + "ContractFile", this.ContractFile);
        this.setParamSimple(map, prefix + "ContractName", this.ContractName);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "Initiator", this.Initiator);

    }
}

