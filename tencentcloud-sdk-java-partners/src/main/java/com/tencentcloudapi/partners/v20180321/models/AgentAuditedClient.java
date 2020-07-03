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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentAuditedClient extends AbstractModel{

    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 代客账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 代客审核通过时间戳
    */
    @SerializedName("AgentTime")
    @Expose
    private String AgentTime;

    /**
    * 代客类型，可能值为a/b/c
    */
    @SerializedName("ClientFlag")
    @Expose
    private String ClientFlag;

    /**
    * 代客备注
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;

    /**
    * 代客名称（首选实名认证名称）
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * 认证类型, 0：个人，1：企业；其他：未认证
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 代客APPID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 上月消费金额
    */
    @SerializedName("LastMonthAmt")
    @Expose
    private Long LastMonthAmt;

    /**
    * 本月消费金额
    */
    @SerializedName("ThisMonthAmt")
    @Expose
    private Long ThisMonthAmt;

    /**
    * 是否欠费,0：不欠费；1：欠费
    */
    @SerializedName("HasOverdueBill")
    @Expose
    private Long HasOverdueBill;

    /**
    * 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 业务员ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 业务员姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 代客邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
     * Get 代理商账号ID 
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 代客账号ID 
     * @return ClientUin 代客账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 代客账号ID
     * @param ClientUin 代客账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 代客审核通过时间戳 
     * @return AgentTime 代客审核通过时间戳
     */
    public String getAgentTime() {
        return this.AgentTime;
    }

    /**
     * Set 代客审核通过时间戳
     * @param AgentTime 代客审核通过时间戳
     */
    public void setAgentTime(String AgentTime) {
        this.AgentTime = AgentTime;
    }

    /**
     * Get 代客类型，可能值为a/b/c 
     * @return ClientFlag 代客类型，可能值为a/b/c
     */
    public String getClientFlag() {
        return this.ClientFlag;
    }

    /**
     * Set 代客类型，可能值为a/b/c
     * @param ClientFlag 代客类型，可能值为a/b/c
     */
    public void setClientFlag(String ClientFlag) {
        this.ClientFlag = ClientFlag;
    }

    /**
     * Get 代客备注 
     * @return ClientRemark 代客备注
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * Set 代客备注
     * @param ClientRemark 代客备注
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * Get 代客名称（首选实名认证名称） 
     * @return ClientName 代客名称（首选实名认证名称）
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set 代客名称（首选实名认证名称）
     * @param ClientName 代客名称（首选实名认证名称）
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get 认证类型, 0：个人，1：企业；其他：未认证 
     * @return AuthType 认证类型, 0：个人，1：企业；其他：未认证
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证类型, 0：个人，1：企业；其他：未认证
     * @param AuthType 认证类型, 0：个人，1：企业；其他：未认证
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 代客APPID 
     * @return AppId 代客APPID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 代客APPID
     * @param AppId 代客APPID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 上月消费金额 
     * @return LastMonthAmt 上月消费金额
     */
    public Long getLastMonthAmt() {
        return this.LastMonthAmt;
    }

    /**
     * Set 上月消费金额
     * @param LastMonthAmt 上月消费金额
     */
    public void setLastMonthAmt(Long LastMonthAmt) {
        this.LastMonthAmt = LastMonthAmt;
    }

    /**
     * Get 本月消费金额 
     * @return ThisMonthAmt 本月消费金额
     */
    public Long getThisMonthAmt() {
        return this.ThisMonthAmt;
    }

    /**
     * Set 本月消费金额
     * @param ThisMonthAmt 本月消费金额
     */
    public void setThisMonthAmt(Long ThisMonthAmt) {
        this.ThisMonthAmt = ThisMonthAmt;
    }

    /**
     * Get 是否欠费,0：不欠费；1：欠费 
     * @return HasOverdueBill 是否欠费,0：不欠费；1：欠费
     */
    public Long getHasOverdueBill() {
        return this.HasOverdueBill;
    }

    /**
     * Set 是否欠费,0：不欠费；1：欠费
     * @param HasOverdueBill 是否欠费,0：不欠费；1：欠费
     */
    public void setHasOverdueBill(Long HasOverdueBill) {
        this.HasOverdueBill = HasOverdueBill;
    }

    /**
     * Get 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空 
     * @return ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     * @param ClientType 客户类型：可以为new(新拓)/assign(指定)/old(存量)/空
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空 
     * @return ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     * @param ProjectType 项目类型：可以为self(自拓项目)/platform(合作项目)/repeat(复算项目  )/空
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get 业务员ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalesUin 业务员ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesUin 业务员ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get 业务员姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalesName 业务员姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 业务员姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesName 业务员姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 代客邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mail 代客邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 代客邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mail 代客邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "AgentTime", this.AgentTime);
        this.setParamSimple(map, prefix + "ClientFlag", this.ClientFlag);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "LastMonthAmt", this.LastMonthAmt);
        this.setParamSimple(map, prefix + "ThisMonthAmt", this.ThisMonthAmt);
        this.setParamSimple(map, prefix + "HasOverdueBill", this.HasOverdueBill);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "Mail", this.Mail);

    }
}

