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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSLInstanceRequest extends AbstractModel {

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * 实例要绑定的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 预付费参数
    */
    @SerializedName("PrePaySetting")
    @Expose
    private PrePaySetting PrePaySetting;

    /**
    * 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-****-****-****-fae360632808	
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 部署模式
    */
    @SerializedName("DeploymentMode")
    @Expose
    private String DeploymentMode;

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。 
     * @return PayMode 实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。
     * @param PayMode 实例计费模式，0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。 
     * @return DiskType 实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。
     * @param DiskType 实例存储类型，CLOUD_HSSD表示性能云存储， CLOUD_BSSD表示标准云存储。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。 
     * @return DiskSize 实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。
     * @param DiskSize 实例单节点磁盘容量，单位GB，单节点磁盘容量需大于等于100，小于等于250*CPU核心数，容量调整步长为100。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。 
     * @return NodeType 实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。
     * @param NodeType 实例节点规格，可填写4C16G、8C32G、16C64G、32C128G，不区分大小写。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。 
     * @return ZoneSettings 实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set 实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。
     * @param ZoneSettings 实例可用区详细配置，当前支持多可用区，可用区数量只能为1或3，包含区域名称，VPC信息、节点数量，其中所有区域节点总数需大于等于3，小于等于50。
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get 实例要绑定的标签列表。 
     * @return Tags 实例要绑定的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例要绑定的标签列表。
     * @param Tags 实例要绑定的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 预付费参数 
     * @return PrePaySetting 预付费参数
     */
    public PrePaySetting getPrePaySetting() {
        return this.PrePaySetting;
    }

    /**
     * Set 预付费参数
     * @param PrePaySetting 预付费参数
     */
    public void setPrePaySetting(PrePaySetting PrePaySetting) {
        this.PrePaySetting = PrePaySetting;
    }

    /**
     * Get 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-****-****-****-fae360632808	 
     * @return ClientToken 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-****-****-****-fae360632808	
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-****-****-****-fae360632808	
     * @param ClientToken 唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-****-****-****-fae360632808	
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 部署模式 
     * @return DeploymentMode 部署模式
     */
    public String getDeploymentMode() {
        return this.DeploymentMode;
    }

    /**
     * Set 部署模式
     * @param DeploymentMode 部署模式
     */
    public void setDeploymentMode(String DeploymentMode) {
        this.DeploymentMode = DeploymentMode;
    }

    public CreateSLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSLInstanceRequest(CreateSLInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PrePaySetting != null) {
            this.PrePaySetting = new PrePaySetting(source.PrePaySetting);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeploymentMode != null) {
            this.DeploymentMode = new String(source.DeploymentMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "PrePaySetting.", this.PrePaySetting);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeploymentMode", this.DeploymentMode);

    }
}

