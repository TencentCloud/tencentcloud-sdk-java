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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DidCluster extends AbstractModel{

    /**
    * 链ID
    */
    @SerializedName("ChainId")
    @Expose
    private Long ChainId;

    /**
    * 链名称
    */
    @SerializedName("ChainName")
    @Expose
    private String ChainName;

    /**
    * 组织数量
    */
    @SerializedName("AgencyCount")
    @Expose
    private Long AgencyCount;

    /**
    * 联盟ID
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 网络状态
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 联盟名称
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * 组织ID
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * 自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 网络节点总数
    */
    @SerializedName("TotalNetworkNode")
    @Expose
    private Long TotalNetworkNode;

    /**
    * 本机构节点数
    */
    @SerializedName("TotalCreateNode")
    @Expose
    private Long TotalCreateNode;

    /**
    * 总群组数
    */
    @SerializedName("TotalGroups")
    @Expose
    private Long TotalGroups;

    /**
    * DID总数
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
     * Get 链ID 
     * @return ChainId 链ID
     */
    public Long getChainId() {
        return this.ChainId;
    }

    /**
     * Set 链ID
     * @param ChainId 链ID
     */
    public void setChainId(Long ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get 链名称 
     * @return ChainName 链名称
     */
    public String getChainName() {
        return this.ChainName;
    }

    /**
     * Set 链名称
     * @param ChainName 链名称
     */
    public void setChainName(String ChainName) {
        this.ChainName = ChainName;
    }

    /**
     * Get 组织数量 
     * @return AgencyCount 组织数量
     */
    public Long getAgencyCount() {
        return this.AgencyCount;
    }

    /**
     * Set 组织数量
     * @param AgencyCount 组织数量
     */
    public void setAgencyCount(Long AgencyCount) {
        this.AgencyCount = AgencyCount;
    }

    /**
     * Get 联盟ID 
     * @return ConsortiumId 联盟ID
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set 联盟ID
     * @param ConsortiumId 联盟ID
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 网络状态 
     * @return ChainStatus 网络状态
     */
    public Long getChainStatus() {
        return this.ChainStatus;
    }

    /**
     * Set 网络状态
     * @param ChainStatus 网络状态
     */
    public void setChainStatus(Long ChainStatus) {
        this.ChainStatus = ChainStatus;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 联盟名称 
     * @return ConsortiumName 联盟名称
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set 联盟名称
     * @param ConsortiumName 联盟名称
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
    }

    /**
     * Get 组织ID 
     * @return AgencyId 组织ID
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set 组织ID
     * @param AgencyId 组织ID
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get 自动续费 
     * @return AutoRenewFlag 自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费
     * @param AutoRenewFlag 自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 网络节点总数 
     * @return TotalNetworkNode 网络节点总数
     */
    public Long getTotalNetworkNode() {
        return this.TotalNetworkNode;
    }

    /**
     * Set 网络节点总数
     * @param TotalNetworkNode 网络节点总数
     */
    public void setTotalNetworkNode(Long TotalNetworkNode) {
        this.TotalNetworkNode = TotalNetworkNode;
    }

    /**
     * Get 本机构节点数 
     * @return TotalCreateNode 本机构节点数
     */
    public Long getTotalCreateNode() {
        return this.TotalCreateNode;
    }

    /**
     * Set 本机构节点数
     * @param TotalCreateNode 本机构节点数
     */
    public void setTotalCreateNode(Long TotalCreateNode) {
        this.TotalCreateNode = TotalCreateNode;
    }

    /**
     * Get 总群组数 
     * @return TotalGroups 总群组数
     */
    public Long getTotalGroups() {
        return this.TotalGroups;
    }

    /**
     * Set 总群组数
     * @param TotalGroups 总群组数
     */
    public void setTotalGroups(Long TotalGroups) {
        this.TotalGroups = TotalGroups;
    }

    /**
     * Get DID总数 
     * @return DidCount DID总数
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set DID总数
     * @param DidCount DID总数
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    public DidCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidCluster(DidCluster source) {
        if (source.ChainId != null) {
            this.ChainId = new Long(source.ChainId);
        }
        if (source.ChainName != null) {
            this.ChainName = new String(source.ChainName);
        }
        if (source.AgencyCount != null) {
            this.AgencyCount = new Long(source.AgencyCount);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChainStatus != null) {
            this.ChainStatus = new Long(source.ChainStatus);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.TotalNetworkNode != null) {
            this.TotalNetworkNode = new Long(source.TotalNetworkNode);
        }
        if (source.TotalCreateNode != null) {
            this.TotalCreateNode = new Long(source.TotalCreateNode);
        }
        if (source.TotalGroups != null) {
            this.TotalGroups = new Long(source.TotalGroups);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "ChainName", this.ChainName);
        this.setParamSimple(map, prefix + "AgencyCount", this.AgencyCount);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TotalNetworkNode", this.TotalNetworkNode);
        this.setParamSimple(map, prefix + "TotalCreateNode", this.TotalCreateNode);
        this.setParamSimple(map, prefix + "TotalGroups", this.TotalGroups);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);

    }
}

