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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetClusterListItem extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群状态<br>CSR_RUNNING: 运行中<br>CSR_EXCEPTION:异常<br>CSR_DEL:已经删除</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>绑定的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindRuleID")
    @Expose
    private String BindRuleID;

    /**
    * <p>绑定规则名称</p>
    */
    @SerializedName("BindRuleName")
    @Expose
    private String BindRuleName;

    /**
    * <p>集群类型:<br>CT_TKE:TKE集群;<br>CT_USER_CREATE:用户自建集群;<br>CT_TKE_SERVERLESS:TKE Serverless集群;</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群版本</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>内存量</p>
    */
    @SerializedName("MemLimit")
    @Expose
    private Long MemLimit;

    /**
    * <p>cpu</p>
    */
    @SerializedName("CpuLimit")
    @Expose
    private Long CpuLimit;

    /**
    * <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
    */
    @SerializedName("ClusterAuditStatus")
    @Expose
    private String ClusterAuditStatus;

    /**
    * <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterID <p>集群ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterID <p>集群ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群状态<br>CSR_RUNNING: 运行中<br>CSR_EXCEPTION:异常<br>CSR_DEL:已经删除</p> 
     * @return Status <p>集群状态<br>CSR_RUNNING: 运行中<br>CSR_EXCEPTION:异常<br>CSR_DEL:已经删除</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>集群状态<br>CSR_RUNNING: 运行中<br>CSR_EXCEPTION:异常<br>CSR_DEL:已经删除</p>
     * @param Status <p>集群状态<br>CSR_RUNNING: 运行中<br>CSR_EXCEPTION:异常<br>CSR_DEL:已经删除</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>绑定的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindRuleID <p>绑定的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindRuleID() {
        return this.BindRuleID;
    }

    /**
     * Set <p>绑定的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindRuleID <p>绑定的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindRuleID(String BindRuleID) {
        this.BindRuleID = BindRuleID;
    }

    /**
     * Get <p>绑定规则名称</p> 
     * @return BindRuleName <p>绑定规则名称</p>
     */
    public String getBindRuleName() {
        return this.BindRuleName;
    }

    /**
     * Set <p>绑定规则名称</p>
     * @param BindRuleName <p>绑定规则名称</p>
     */
    public void setBindRuleName(String BindRuleName) {
        this.BindRuleName = BindRuleName;
    }

    /**
     * Get <p>集群类型:<br>CT_TKE:TKE集群;<br>CT_USER_CREATE:用户自建集群;<br>CT_TKE_SERVERLESS:TKE Serverless集群;</p> 
     * @return ClusterType <p>集群类型:<br>CT_TKE:TKE集群;<br>CT_USER_CREATE:用户自建集群;<br>CT_TKE_SERVERLESS:TKE Serverless集群;</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型:<br>CT_TKE:TKE集群;<br>CT_USER_CREATE:用户自建集群;<br>CT_TKE_SERVERLESS:TKE Serverless集群;</p>
     * @param ClusterType <p>集群类型:<br>CT_TKE:TKE集群;<br>CT_USER_CREATE:用户自建集群;<br>CT_TKE_SERVERLESS:TKE Serverless集群;</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群版本</p> 
     * @return ClusterVersion <p>集群版本</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>集群版本</p>
     * @param ClusterVersion <p>集群版本</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>内存量</p> 
     * @return MemLimit <p>内存量</p>
     */
    public Long getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set <p>内存量</p>
     * @param MemLimit <p>内存量</p>
     */
    public void setMemLimit(Long MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get <p>cpu</p> 
     * @return CpuLimit <p>cpu</p>
     */
    public Long getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>cpu</p>
     * @param CpuLimit <p>cpu</p>
     */
    public void setCpuLimit(Long CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p> 
     * @return ClusterAuditStatus <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     */
    public String getClusterAuditStatus() {
        return this.ClusterAuditStatus;
    }

    /**
     * Set <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     * @param ClusterAuditStatus <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     */
    public void setClusterAuditStatus(String ClusterAuditStatus) {
        this.ClusterAuditStatus = ClusterAuditStatus;
    }

    /**
     * Get <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p> 
     * @return AccessedStatus <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     * @param AccessedStatus <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    public AssetClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterListItem(AssetClusterListItem source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindRuleID != null) {
            this.BindRuleID = new String(source.BindRuleID);
        }
        if (source.BindRuleName != null) {
            this.BindRuleName = new String(source.BindRuleName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new Long(source.MemLimit);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Long(source.CpuLimit);
        }
        if (source.ClusterAuditStatus != null) {
            this.ClusterAuditStatus = new String(source.ClusterAuditStatus);
        }
        if (source.AccessedStatus != null) {
            this.AccessedStatus = new String(source.AccessedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindRuleID", this.BindRuleID);
        this.setParamSimple(map, prefix + "BindRuleName", this.BindRuleName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "ClusterAuditStatus", this.ClusterAuditStatus);
        this.setParamSimple(map, prefix + "AccessedStatus", this.AccessedStatus);

    }
}

