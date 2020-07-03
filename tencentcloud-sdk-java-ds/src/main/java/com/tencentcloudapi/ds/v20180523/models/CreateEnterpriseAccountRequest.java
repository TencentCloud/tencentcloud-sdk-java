/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnterpriseAccountRequest extends AbstractModel{

    /**
    * 模块名AccountMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名CreateEnterpriseAccount
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
    * 企业用户证件类型，8代表营业执照，详情请见常见问题
    */
    @SerializedName("IdentType")
    @Expose
    private Long IdentType;

    /**
    * 企业用户营业执照号码
    */
    @SerializedName("IdentNo")
    @Expose
    private String IdentNo;

    /**
    * 企业联系人手机号
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
    private Long TransactorIdentType;

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
    * 企业联系人邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 模块名AccountMng 
     * @return Module 模块名AccountMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名AccountMng
     * @param Module 模块名AccountMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名CreateEnterpriseAccount 
     * @return Operation 操作名CreateEnterpriseAccount
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名CreateEnterpriseAccount
     * @param Operation 操作名CreateEnterpriseAccount
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 企业用户名称 
     * @return Name 企业用户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业用户名称
     * @param Name 企业用户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 企业用户证件类型，8代表营业执照，详情请见常见问题 
     * @return IdentType 企业用户证件类型，8代表营业执照，详情请见常见问题
     */
    public Long getIdentType() {
        return this.IdentType;
    }

    /**
     * Set 企业用户证件类型，8代表营业执照，详情请见常见问题
     * @param IdentType 企业用户证件类型，8代表营业执照，详情请见常见问题
     */
    public void setIdentType(Long IdentType) {
        this.IdentType = IdentType;
    }

    /**
     * Get 企业用户营业执照号码 
     * @return IdentNo 企业用户营业执照号码
     */
    public String getIdentNo() {
        return this.IdentNo;
    }

    /**
     * Set 企业用户营业执照号码
     * @param IdentNo 企业用户营业执照号码
     */
    public void setIdentNo(String IdentNo) {
        this.IdentNo = IdentNo;
    }

    /**
     * Get 企业联系人手机号 
     * @return MobilePhone 企业联系人手机号
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 企业联系人手机号
     * @param MobilePhone 企业联系人手机号
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Get 经办人姓名 
     * @return TransactorName 经办人姓名
     */
    public String getTransactorName() {
        return this.TransactorName;
    }

    /**
     * Set 经办人姓名
     * @param TransactorName 经办人姓名
     */
    public void setTransactorName(String TransactorName) {
        this.TransactorName = TransactorName;
    }

    /**
     * Get 经办人证件类型，0代表身份证 
     * @return TransactorIdentType 经办人证件类型，0代表身份证
     */
    public Long getTransactorIdentType() {
        return this.TransactorIdentType;
    }

    /**
     * Set 经办人证件类型，0代表身份证
     * @param TransactorIdentType 经办人证件类型，0代表身份证
     */
    public void setTransactorIdentType(Long TransactorIdentType) {
        this.TransactorIdentType = TransactorIdentType;
    }

    /**
     * Get 经办人证件号码 
     * @return TransactorIdentNo 经办人证件号码
     */
    public String getTransactorIdentNo() {
        return this.TransactorIdentNo;
    }

    /**
     * Set 经办人证件号码
     * @param TransactorIdentNo 经办人证件号码
     */
    public void setTransactorIdentNo(String TransactorIdentNo) {
        this.TransactorIdentNo = TransactorIdentNo;
    }

    /**
     * Get 经办人手机号 
     * @return TransactorPhone 经办人手机号
     */
    public String getTransactorPhone() {
        return this.TransactorPhone;
    }

    /**
     * Set 经办人手机号
     * @param TransactorPhone 经办人手机号
     */
    public void setTransactorPhone(String TransactorPhone) {
        this.TransactorPhone = TransactorPhone;
    }

    /**
     * Get 企业联系人邮箱 
     * @return Email 企业联系人邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 企业联系人邮箱
     * @param Email 企业联系人邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

