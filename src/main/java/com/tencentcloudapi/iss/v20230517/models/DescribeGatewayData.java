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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayData extends AbstractModel {

    /**
    * 网关索引ID，用于网关查询，更新，删除操作
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关编码，由网关设备生成的唯一编码
    */
    @SerializedName("GwId")
    @Expose
    private String GwId;

    /**
    * 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 服务节点id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 服务节点名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 网关状态，0：离线，1:在线
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 网关版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private GatewayVersion [] Version;

    /**
    * 网关下挂设备数量
    */
    @SerializedName("DeviceNum")
    @Expose
    private Long DeviceNum;

    /**
    * 激活时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 网关索引ID，用于网关查询，更新，删除操作 
     * @return GatewayId 网关索引ID，用于网关查询，更新，删除操作
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关索引ID，用于网关查询，更新，删除操作
     * @param GatewayId 网关索引ID，用于网关查询，更新，删除操作
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关编码，由网关设备生成的唯一编码 
     * @return GwId 网关编码，由网关设备生成的唯一编码
     */
    public String getGwId() {
        return this.GwId;
    }

    /**
     * Set 网关编码，由网关设备生成的唯一编码
     * @param GwId 网关编码，由网关设备生成的唯一编码
     */
    public void setGwId(String GwId) {
        this.GwId = GwId;
    }

    /**
     * Get 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符 
     * @return Name 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
     * @param Name 网关名称，仅支持中文、英文、数字、_、-，长度不超过32个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     * @return Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     * @param Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 服务节点id 
     * @return ClusterId 服务节点id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 服务节点id
     * @param ClusterId 服务节点id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 服务节点名称 
     * @return ClusterName 服务节点名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 服务节点名称
     * @param ClusterName 服务节点名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 网关状态，0：离线，1:在线 
     * @return Status 网关状态，0：离线，1:在线
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网关状态，0：离线，1:在线
     * @param Status 网关状态，0：离线，1:在线
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 网关版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 网关版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayVersion [] getVersion() {
        return this.Version;
    }

    /**
     * Set 网关版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 网关版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(GatewayVersion [] Version) {
        this.Version = Version;
    }

    /**
     * Get 网关下挂设备数量 
     * @return DeviceNum 网关下挂设备数量
     */
    public Long getDeviceNum() {
        return this.DeviceNum;
    }

    /**
     * Set 网关下挂设备数量
     * @param DeviceNum 网关下挂设备数量
     */
    public void setDeviceNum(Long DeviceNum) {
        this.DeviceNum = DeviceNum;
    }

    /**
     * Get 激活时间 
     * @return CreatedAt 激活时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 激活时间
     * @param CreatedAt 激活时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
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

    public DescribeGatewayData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayData(DescribeGatewayData source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GwId != null) {
            this.GwId = new String(source.GwId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new GatewayVersion[source.Version.length];
            for (int i = 0; i < source.Version.length; i++) {
                this.Version[i] = new GatewayVersion(source.Version[i]);
            }
        }
        if (source.DeviceNum != null) {
            this.DeviceNum = new Long(source.DeviceNum);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GwId", this.GwId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "DeviceNum", this.DeviceNum);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

