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

public class ClusterNodeListItem extends AbstractModel {

    /**
    * <p>资产 ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>节点id</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>公网ip</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网ip</p>
    */
    @SerializedName("InternalIP")
    @Expose
    private String InternalIP;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>核数</p>
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>运行状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>是否为新资产</p>
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

    /**
    * <p>节点唯一 ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
    * <p>客户端状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 未安装</li></ul>
    */
    @SerializedName("ClientStatus")
    @Expose
    private String ClientStatus;

    /**
    * <p>节点实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>资产 ID</p> 
     * @return AssetId <p>资产 ID</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产 ID</p>
     * @param AssetId <p>资产 ID</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>节点id</p> 
     * @return NodeId <p>节点id</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点id</p>
     * @param NodeId <p>节点id</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点名称</p> 
     * @return NodeName <p>节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
     * @param NodeName <p>节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>公网ip</p> 
     * @return PublicIP <p>公网ip</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网ip</p>
     * @param PublicIP <p>公网ip</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网ip</p> 
     * @return InternalIP <p>内网ip</p>
     */
    public String getInternalIP() {
        return this.InternalIP;
    }

    /**
     * Set <p>内网ip</p>
     * @param InternalIP <p>内网ip</p>
     */
    public void setInternalIP(String InternalIP) {
        this.InternalIP = InternalIP;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeType <p>节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeType <p>节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>核数</p> 
     * @return CoresCount <p>核数</p>
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set <p>核数</p>
     * @param CoresCount <p>核数</p>
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>运行状态</p> 
     * @return RunStatus <p>运行状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>运行状态</p>
     * @param RunStatus <p>运行状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>是否为新资产</p> 
     * @return IsNew <p>是否为新资产</p>
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set <p>是否为新资产</p>
     * @param IsNew <p>是否为新资产</p>
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get <p>节点唯一 ID</p> 
     * @return UniqueID <p>节点唯一 ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>节点唯一 ID</p>
     * @param UniqueID <p>节点唯一 ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * Get <p>客户端状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 未安装</li></ul> 
     * @return ClientStatus <p>客户端状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 未安装</li></ul>
     */
    public String getClientStatus() {
        return this.ClientStatus;
    }

    /**
     * Set <p>客户端状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 未安装</li></ul>
     * @param ClientStatus <p>客户端状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 未安装</li></ul>
     */
    public void setClientStatus(String ClientStatus) {
        this.ClientStatus = ClientStatus;
    }

    /**
     * Get <p>节点实例ID</p> 
     * @return InstanceId <p>节点实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>节点实例ID</p>
     * @param InstanceId <p>节点实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ClusterNodeListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNodeListItem(ClusterNodeListItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.InternalIP != null) {
            this.InternalIP = new String(source.InternalIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
        if (source.ClientStatus != null) {
            this.ClientStatus = new String(source.ClientStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "InternalIP", this.InternalIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "ClientStatus", this.ClientStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

