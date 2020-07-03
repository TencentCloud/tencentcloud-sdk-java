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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyUserCertRequest extends AbstractModel{

    /**
    * 模块名，固定字段：cert_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：cert_apply_for_user
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 申请证书的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 用户证书标识，用于标识用户证书，要求由纯小写字母组成，长度小于10
    */
    @SerializedName("UserIdentity")
    @Expose
    private String UserIdentity;

    /**
    * 证书申请实体，使用腾讯云账号实名认证的名称
    */
    @SerializedName("Applicant")
    @Expose
    private String Applicant;

    /**
    * 证件号码。如果腾讯云账号对应的实名认证类型为企业认证，填入“0”；如果腾讯云账号对应的实名认证类型为个人认证，填入个人身份证号码
    */
    @SerializedName("IdentityNum")
    @Expose
    private String IdentityNum;

    /**
    * csr p10证书文件。需要用户根据文档生成证书的CSR文件
    */
    @SerializedName("CsrData")
    @Expose
    private String CsrData;

    /**
    * 证书备注信息
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
     * Get 模块名，固定字段：cert_mng 
     * @return Module 模块名，固定字段：cert_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：cert_mng
     * @param Module 模块名，固定字段：cert_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：cert_apply_for_user 
     * @return Operation 操作名，固定字段：cert_apply_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：cert_apply_for_user
     * @param Operation 操作名，固定字段：cert_apply_for_user
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 区块链网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 区块链网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 申请证书的组织名称，可以在组织管理列表中获取当前组织的名称 
     * @return GroupName 申请证书的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 申请证书的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 申请证书的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 用户证书标识，用于标识用户证书，要求由纯小写字母组成，长度小于10 
     * @return UserIdentity 用户证书标识，用于标识用户证书，要求由纯小写字母组成，长度小于10
     */
    public String getUserIdentity() {
        return this.UserIdentity;
    }

    /**
     * Set 用户证书标识，用于标识用户证书，要求由纯小写字母组成，长度小于10
     * @param UserIdentity 用户证书标识，用于标识用户证书，要求由纯小写字母组成，长度小于10
     */
    public void setUserIdentity(String UserIdentity) {
        this.UserIdentity = UserIdentity;
    }

    /**
     * Get 证书申请实体，使用腾讯云账号实名认证的名称 
     * @return Applicant 证书申请实体，使用腾讯云账号实名认证的名称
     */
    public String getApplicant() {
        return this.Applicant;
    }

    /**
     * Set 证书申请实体，使用腾讯云账号实名认证的名称
     * @param Applicant 证书申请实体，使用腾讯云账号实名认证的名称
     */
    public void setApplicant(String Applicant) {
        this.Applicant = Applicant;
    }

    /**
     * Get 证件号码。如果腾讯云账号对应的实名认证类型为企业认证，填入“0”；如果腾讯云账号对应的实名认证类型为个人认证，填入个人身份证号码 
     * @return IdentityNum 证件号码。如果腾讯云账号对应的实名认证类型为企业认证，填入“0”；如果腾讯云账号对应的实名认证类型为个人认证，填入个人身份证号码
     */
    public String getIdentityNum() {
        return this.IdentityNum;
    }

    /**
     * Set 证件号码。如果腾讯云账号对应的实名认证类型为企业认证，填入“0”；如果腾讯云账号对应的实名认证类型为个人认证，填入个人身份证号码
     * @param IdentityNum 证件号码。如果腾讯云账号对应的实名认证类型为企业认证，填入“0”；如果腾讯云账号对应的实名认证类型为个人认证，填入个人身份证号码
     */
    public void setIdentityNum(String IdentityNum) {
        this.IdentityNum = IdentityNum;
    }

    /**
     * Get csr p10证书文件。需要用户根据文档生成证书的CSR文件 
     * @return CsrData csr p10证书文件。需要用户根据文档生成证书的CSR文件
     */
    public String getCsrData() {
        return this.CsrData;
    }

    /**
     * Set csr p10证书文件。需要用户根据文档生成证书的CSR文件
     * @param CsrData csr p10证书文件。需要用户根据文档生成证书的CSR文件
     */
    public void setCsrData(String CsrData) {
        this.CsrData = CsrData;
    }

    /**
     * Get 证书备注信息 
     * @return Notes 证书备注信息
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 证书备注信息
     * @param Notes 证书备注信息
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "UserIdentity", this.UserIdentity);
        this.setParamSimple(map, prefix + "Applicant", this.Applicant);
        this.setParamSimple(map, prefix + "IdentityNum", this.IdentityNum);
        this.setParamSimple(map, prefix + "CsrData", this.CsrData);
        this.setParamSimple(map, prefix + "Notes", this.Notes);

    }
}

