/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EDRScanTaskHostItem extends AbstractModel {

    /**
    * <p>主机唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>主机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>操作系统</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>资产所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>风险数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
     * Get <p>主机唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid <p>主机唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid <p>主机唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>主机名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName <p>主机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName <p>主机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp <p>公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp <p>公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp <p>内网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp <p>内网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>操作系统</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsType <p>操作系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>操作系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsType <p>操作系统</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName <p>资产所属账号名称（后端富化）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>资产所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>资产所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资产所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>资产所属账号AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudType <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudType <p>云类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>扫描状态：WAIT/SCANNING/FINISHED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>风险数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount <p>风险数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount <p>风险数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixSuggestion <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixSuggestion <p>解决方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    public EDRScanTaskHostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanTaskHostItem(EDRScanTaskHostItem source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);

    }
}

