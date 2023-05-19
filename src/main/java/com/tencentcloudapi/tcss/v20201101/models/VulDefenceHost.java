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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceHost extends AbstractModel{

    /**
    * 主机名称/超级节点名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机ip即内网ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 主机QUUID/超级节点ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 插件状态，正常：SUCCESS，异常：FAIL， NO_DEFENDED:未防御
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 外网ip
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 首次开启时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 节点类型[NORMAL:普通节点|SUPER:超级节点]
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 超级节点子网名称
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * 超级节点子网网段
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * 超级节点子网ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * 超级节点唯一ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 超级节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Pod Ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Pod 名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get 主机名称/超级节点名称 
     * @return HostName 主机名称/超级节点名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称/超级节点名称
     * @param HostName 主机名称/超级节点名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机ip即内网ip 
     * @return HostIP 主机ip即内网ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机ip即内网ip
     * @param HostIP 主机ip即内网ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 主机QUUID/超级节点ID 
     * @return HostID 主机QUUID/超级节点ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机QUUID/超级节点ID
     * @param HostID 主机QUUID/超级节点ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 插件状态，正常：SUCCESS，异常：FAIL， NO_DEFENDED:未防御 
     * @return Status 插件状态，正常：SUCCESS，异常：FAIL， NO_DEFENDED:未防御
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 插件状态，正常：SUCCESS，异常：FAIL， NO_DEFENDED:未防御
     * @param Status 插件状态，正常：SUCCESS，异常：FAIL， NO_DEFENDED:未防御
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 外网ip 
     * @return PublicIP 外网ip
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网ip
     * @param PublicIP 外网ip
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 首次开启时间 
     * @return CreateTime 首次开启时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次开启时间
     * @param CreateTime 首次开启时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 节点类型[NORMAL:普通节点|SUPER:超级节点] 
     * @return NodeType 节点类型[NORMAL:普通节点|SUPER:超级节点]
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型[NORMAL:普通节点|SUPER:超级节点]
     * @param NodeType 节点类型[NORMAL:普通节点|SUPER:超级节点]
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 超级节点子网名称 
     * @return NodeSubNetName 超级节点子网名称
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set 超级节点子网名称
     * @param NodeSubNetName 超级节点子网名称
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get 超级节点子网网段 
     * @return NodeSubNetCIDR 超级节点子网网段
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set 超级节点子网网段
     * @param NodeSubNetCIDR 超级节点子网网段
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
    }

    /**
     * Get 超级节点子网ID 
     * @return NodeSubNetID 超级节点子网ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set 超级节点子网ID
     * @param NodeSubNetID 超级节点子网ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get 超级节点唯一ID 
     * @return NodeUniqueID 超级节点唯一ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点唯一ID
     * @param NodeUniqueID 超级节点唯一ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 超级节点ID 
     * @return NodeID 超级节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 超级节点ID
     * @param NodeID 超级节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Pod Ip 
     * @return PodIP Pod Ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod Ip
     * @param PodIP Pod Ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Pod 名称 
     * @return PodName Pod 名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod 名称
     * @param PodName Pod 名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public VulDefenceHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceHost(VulDefenceHost source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

