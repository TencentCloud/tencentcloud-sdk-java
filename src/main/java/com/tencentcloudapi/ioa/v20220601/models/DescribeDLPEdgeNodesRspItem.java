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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPEdgeNodesRspItem extends AbstractModel {

    /**
    * 自增id，数据库中唯一
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点分组唯一id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 节点id
    */
    @SerializedName("EdgeNodeId")
    @Expose
    private String EdgeNodeId;

    /**
    * 节点名称
    */
    @SerializedName("EdgeNodeName")
    @Expose
    private String EdgeNodeName;

    /**
    * 是否活跃/连通
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
    * 节点分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 节点IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 是否支持升级连接器
    */
    @SerializedName("IsUpgradeEnable")
    @Expose
    private Boolean IsUpgradeEnable;

    /**
    * 升级状态: 0(升级中) , 1(升级失败) 或 2(升级成功)
    */
    @SerializedName("UpgradeStatus")
    @Expose
    private Long UpgradeStatus;

    /**
    * 升级状态描述
    */
    @SerializedName("UpgradeDescription")
    @Expose
    private String UpgradeDescription;

    /**
    * 规则版本
    */
    @SerializedName("RuleVersion")
    @Expose
    private String RuleVersion;

    /**
     * Get 自增id，数据库中唯一 
     * @return Id 自增id，数据库中唯一
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自增id，数据库中唯一
     * @param Id 自增id，数据库中唯一
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点分组唯一id 
     * @return GroupId 节点分组唯一id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 节点分组唯一id
     * @param GroupId 节点分组唯一id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 节点id 
     * @return EdgeNodeId 节点id
     */
    public String getEdgeNodeId() {
        return this.EdgeNodeId;
    }

    /**
     * Set 节点id
     * @param EdgeNodeId 节点id
     */
    public void setEdgeNodeId(String EdgeNodeId) {
        this.EdgeNodeId = EdgeNodeId;
    }

    /**
     * Get 节点名称 
     * @return EdgeNodeName 节点名称
     */
    public String getEdgeNodeName() {
        return this.EdgeNodeName;
    }

    /**
     * Set 节点名称
     * @param EdgeNodeName 节点名称
     */
    public void setEdgeNodeName(String EdgeNodeName) {
        this.EdgeNodeName = EdgeNodeName;
    }

    /**
     * Get 是否活跃/连通 
     * @return IsActive 是否活跃/连通
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否活跃/连通
     * @param IsActive 是否活跃/连通
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 节点分组名称 
     * @return GroupName 节点分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 节点分组名称
     * @param GroupName 节点分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 节点IP 
     * @return Ip 节点IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点IP
     * @param Ip 节点IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点版本 
     * @return Version 节点版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 节点版本
     * @param Version 节点版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 是否支持升级连接器 
     * @return IsUpgradeEnable 是否支持升级连接器
     */
    public Boolean getIsUpgradeEnable() {
        return this.IsUpgradeEnable;
    }

    /**
     * Set 是否支持升级连接器
     * @param IsUpgradeEnable 是否支持升级连接器
     */
    public void setIsUpgradeEnable(Boolean IsUpgradeEnable) {
        this.IsUpgradeEnable = IsUpgradeEnable;
    }

    /**
     * Get 升级状态: 0(升级中) , 1(升级失败) 或 2(升级成功) 
     * @return UpgradeStatus 升级状态: 0(升级中) , 1(升级失败) 或 2(升级成功)
     */
    public Long getUpgradeStatus() {
        return this.UpgradeStatus;
    }

    /**
     * Set 升级状态: 0(升级中) , 1(升级失败) 或 2(升级成功)
     * @param UpgradeStatus 升级状态: 0(升级中) , 1(升级失败) 或 2(升级成功)
     */
    public void setUpgradeStatus(Long UpgradeStatus) {
        this.UpgradeStatus = UpgradeStatus;
    }

    /**
     * Get 升级状态描述 
     * @return UpgradeDescription 升级状态描述
     */
    public String getUpgradeDescription() {
        return this.UpgradeDescription;
    }

    /**
     * Set 升级状态描述
     * @param UpgradeDescription 升级状态描述
     */
    public void setUpgradeDescription(String UpgradeDescription) {
        this.UpgradeDescription = UpgradeDescription;
    }

    /**
     * Get 规则版本 
     * @return RuleVersion 规则版本
     */
    public String getRuleVersion() {
        return this.RuleVersion;
    }

    /**
     * Set 规则版本
     * @param RuleVersion 规则版本
     */
    public void setRuleVersion(String RuleVersion) {
        this.RuleVersion = RuleVersion;
    }

    public DescribeDLPEdgeNodesRspItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPEdgeNodesRspItem(DescribeDLPEdgeNodesRspItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EdgeNodeId != null) {
            this.EdgeNodeId = new String(source.EdgeNodeId);
        }
        if (source.EdgeNodeName != null) {
            this.EdgeNodeName = new String(source.EdgeNodeName);
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.IsUpgradeEnable != null) {
            this.IsUpgradeEnable = new Boolean(source.IsUpgradeEnable);
        }
        if (source.UpgradeStatus != null) {
            this.UpgradeStatus = new Long(source.UpgradeStatus);
        }
        if (source.UpgradeDescription != null) {
            this.UpgradeDescription = new String(source.UpgradeDescription);
        }
        if (source.RuleVersion != null) {
            this.RuleVersion = new String(source.RuleVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EdgeNodeId", this.EdgeNodeId);
        this.setParamSimple(map, prefix + "EdgeNodeName", this.EdgeNodeName);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "IsUpgradeEnable", this.IsUpgradeEnable);
        this.setParamSimple(map, prefix + "UpgradeStatus", this.UpgradeStatus);
        this.setParamSimple(map, prefix + "UpgradeDescription", this.UpgradeDescription);
        this.setParamSimple(map, prefix + "RuleVersion", this.RuleVersion);

    }
}

