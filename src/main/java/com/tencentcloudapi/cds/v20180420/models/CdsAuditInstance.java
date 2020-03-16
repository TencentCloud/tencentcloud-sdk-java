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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdsAuditInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 付费模式（数据安全审计只支持预付费：1）
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 实例私网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 实例类型（版本）
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pdomain")
    @Expose
    private String Pdomain;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 续费标识 
     * @return RenewFlag 续费标识
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识
     * @param RenewFlag 续费标识
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 付费模式（数据安全审计只支持预付费：1） 
     * @return PayMode 付费模式（数据安全审计只支持预付费：1）
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式（数据安全审计只支持预付费：1）
     * @param PayMode 付费模式（数据安全审计只支持预付费：1）
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期 
     * @return Status 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     * @param Status 实例状态： 0，未生效；1：正常运行； 2：被隔离； 3，已过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss 
     * @return IsolatedTimestamp 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     * @param IsolatedTimestamp 实例被隔离时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get 实例创建时间，格式： yyyy-mm-dd HH:ii:ss 
     * @return CreateTime 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     * @param CreateTime 实例创建时间，格式： yyyy-mm-dd HH:ii:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例过期时间，格式：yyyy-mm-dd HH:ii:ss 
     * @return ExpireTime 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     * @param ExpireTime 实例过期时间，格式：yyyy-mm-dd HH:ii:ss
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 实例私网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 实例私网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 实例私网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 实例私网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 实例类型（版本） 
     * @return InstanceType 实例类型（版本）
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型（版本）
     * @param InstanceType 实例类型（版本）
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pdomain 实例域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPdomain() {
        return this.Pdomain;
    }

    /**
     * Set 实例域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pdomain 实例域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPdomain(String Pdomain) {
        this.Pdomain = Pdomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Pdomain", this.Pdomain);

    }
}

