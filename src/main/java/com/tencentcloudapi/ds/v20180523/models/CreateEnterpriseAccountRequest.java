package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateEnterpriseAccountRequest  extends AbstractModel{


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
    * 企业用户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 企业用户证件类型，8代表营业执照
    */
    @SerializedName("IdentType")
    @Expose
    private Integer IdentType;

    /**
    * 企业用户营业执照号码
    */
    @SerializedName("IdentNo")
    @Expose
    private String IdentNo;

    /**
    * 企业联系电话
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
    * 经办人姓名
    */
    @SerializedName("TransactorName")
    @Expose
    private String TransactorName;

    /**
    * 经办人证件类型，0代表身份证
    */
    @SerializedName("TransactorIdentType")
    @Expose
    private Integer TransactorIdentType;

    /**
    * 经办人证件号码
    */
    @SerializedName("TransactorIdentNo")
    @Expose
    private String TransactorIdentNo;

    /**
    * 经办人手机号
    */
    @SerializedName("TransactorPhone")
    @Expose
    private String TransactorPhone;

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
     * 获取企业用户名称
     * @return Name 企业用户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置企业用户名称
     * @param Name 企业用户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取企业用户证件类型，8代表营业执照
     * @return IdentType 企业用户证件类型，8代表营业执照
     */
    public Integer getIdentType() {
        return this.IdentType;
    }

    /**
     * 设置企业用户证件类型，8代表营业执照
     * @param IdentType 企业用户证件类型，8代表营业执照
     */
    public void setIdentType(Integer IdentType) {
        this.IdentType = IdentType;
    }

    /**
     * 获取企业用户营业执照号码
     * @return IdentNo 企业用户营业执照号码
     */
    public String getIdentNo() {
        return this.IdentNo;
    }

    /**
     * 设置企业用户营业执照号码
     * @param IdentNo 企业用户营业执照号码
     */
    public void setIdentNo(String IdentNo) {
        this.IdentNo = IdentNo;
    }

    /**
     * 获取企业联系电话
     * @return MobilePhone 企业联系电话
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * 设置企业联系电话
     * @param MobilePhone 企业联系电话
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * 获取经办人姓名
     * @return TransactorName 经办人姓名
     */
    public String getTransactorName() {
        return this.TransactorName;
    }

    /**
     * 设置经办人姓名
     * @param TransactorName 经办人姓名
     */
    public void setTransactorName(String TransactorName) {
        this.TransactorName = TransactorName;
    }

    /**
     * 获取经办人证件类型，0代表身份证
     * @return TransactorIdentType 经办人证件类型，0代表身份证
     */
    public Integer getTransactorIdentType() {
        return this.TransactorIdentType;
    }

    /**
     * 设置经办人证件类型，0代表身份证
     * @param TransactorIdentType 经办人证件类型，0代表身份证
     */
    public void setTransactorIdentType(Integer TransactorIdentType) {
        this.TransactorIdentType = TransactorIdentType;
    }

    /**
     * 获取经办人证件号码
     * @return TransactorIdentNo 经办人证件号码
     */
    public String getTransactorIdentNo() {
        return this.TransactorIdentNo;
    }

    /**
     * 设置经办人证件号码
     * @param TransactorIdentNo 经办人证件号码
     */
    public void setTransactorIdentNo(String TransactorIdentNo) {
        this.TransactorIdentNo = TransactorIdentNo;
    }

    /**
     * 获取经办人手机号
     * @return TransactorPhone 经办人手机号
     */
    public String getTransactorPhone() {
        return this.TransactorPhone;
    }

    /**
     * 设置经办人手机号
     * @param TransactorPhone 经办人手机号
     */
    public void setTransactorPhone(String TransactorPhone) {
        this.TransactorPhone = TransactorPhone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdentType", this.IdentType);
        this.setParamSimple(map, prefix + "IdentNo", this.IdentNo);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);
        this.setParamSimple(map, prefix + "TransactorName", this.TransactorName);
        this.setParamSimple(map, prefix + "TransactorIdentType", this.TransactorIdentType);
        this.setParamSimple(map, prefix + "TransactorIdentNo", this.TransactorIdentNo);
        this.setParamSimple(map, prefix + "TransactorPhone", this.TransactorPhone);

    }
}

