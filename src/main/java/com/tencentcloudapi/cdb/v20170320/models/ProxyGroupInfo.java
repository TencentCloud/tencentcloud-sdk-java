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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel{

    /**
    * 代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 代理版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * 代理支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportUpgradeProxyVersion")
    @Expose
    private String SupportUpgradeProxyVersion;

    /**
    * 代理状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代理任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNode [] ProxyNode;

    /**
    * 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAddress")
    @Expose
    private ProxyAddress [] ProxyAddress;

    /**
    * 连接池阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * 支持创建地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportCreateProxyAddress")
    @Expose
    private Boolean SupportCreateProxyAddress;

    /**
    * 支持升级代理版本所需的cdb版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportUpgradeProxyMysqlVersion")
    @Expose
    private String SupportUpgradeProxyMysqlVersion;

    /**
     * Get 代理组ID 
     * @return ProxyGroupId 代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
     * @param ProxyGroupId 代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 代理版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyVersion 代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set 代理版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyVersion 代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get 代理支持升级版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportUpgradeProxyVersion 代理支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportUpgradeProxyVersion() {
        return this.SupportUpgradeProxyVersion;
    }

    /**
     * Set 代理支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportUpgradeProxyVersion 代理支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportUpgradeProxyVersion(String SupportUpgradeProxyVersion) {
        this.SupportUpgradeProxyVersion = SupportUpgradeProxyVersion;
    }

    /**
     * Get 代理状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 代理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 代理状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 代理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代理任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 代理任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 代理任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 代理任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNode 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNode [] getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNode 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNode(ProxyNode [] ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAddress 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyAddress [] getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAddress 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAddress(ProxyAddress [] ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get 连接池阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPoolLimit 连接池阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set 连接池阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPoolLimit 连接池阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get 支持创建地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportCreateProxyAddress 支持创建地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportCreateProxyAddress() {
        return this.SupportCreateProxyAddress;
    }

    /**
     * Set 支持创建地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportCreateProxyAddress 支持创建地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportCreateProxyAddress(Boolean SupportCreateProxyAddress) {
        this.SupportCreateProxyAddress = SupportCreateProxyAddress;
    }

    /**
     * Get 支持升级代理版本所需的cdb版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportUpgradeProxyMysqlVersion 支持升级代理版本所需的cdb版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportUpgradeProxyMysqlVersion() {
        return this.SupportUpgradeProxyMysqlVersion;
    }

    /**
     * Set 支持升级代理版本所需的cdb版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportUpgradeProxyMysqlVersion 支持升级代理版本所需的cdb版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportUpgradeProxyMysqlVersion(String SupportUpgradeProxyMysqlVersion) {
        this.SupportUpgradeProxyMysqlVersion = SupportUpgradeProxyMysqlVersion;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.SupportUpgradeProxyVersion != null) {
            this.SupportUpgradeProxyVersion = new String(source.SupportUpgradeProxyVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNode[source.ProxyNode.length];
            for (int i = 0; i < source.ProxyNode.length; i++) {
                this.ProxyNode[i] = new ProxyNode(source.ProxyNode[i]);
            }
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new ProxyAddress[source.ProxyAddress.length];
            for (int i = 0; i < source.ProxyAddress.length; i++) {
                this.ProxyAddress[i] = new ProxyAddress(source.ProxyAddress[i]);
            }
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
        if (source.SupportCreateProxyAddress != null) {
            this.SupportCreateProxyAddress = new Boolean(source.SupportCreateProxyAddress);
        }
        if (source.SupportUpgradeProxyMysqlVersion != null) {
            this.SupportUpgradeProxyMysqlVersion = new String(source.SupportUpgradeProxyMysqlVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyVersion", this.SupportUpgradeProxyVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArrayObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamArrayObj(map, prefix + "ProxyAddress.", this.ProxyAddress);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);
        this.setParamSimple(map, prefix + "SupportCreateProxyAddress", this.SupportCreateProxyAddress);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyMysqlVersion", this.SupportUpgradeProxyMysqlVersion);

    }
}

