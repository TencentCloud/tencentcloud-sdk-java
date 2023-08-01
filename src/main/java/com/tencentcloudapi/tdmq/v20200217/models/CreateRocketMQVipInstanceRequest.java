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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQVipInstanceRequest extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例规格：
基础型，rocket-vip-basic-1
标准型，rocket-vip-basic-2
高阶Ⅰ型，rocket-vip-basic-3
高阶Ⅱ型，rocket-vip-basic-4
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 节点数量，最小2，最大20
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 单节点存储空间，GB为单位，最低200GB
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * VPC信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo VpcInfo;

    /**
    * 购买时长，月为单位
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例规格：
基础型，rocket-vip-basic-1
标准型，rocket-vip-basic-2
高阶Ⅰ型，rocket-vip-basic-3
高阶Ⅱ型，rocket-vip-basic-4 
     * @return Spec 实例规格：
基础型，rocket-vip-basic-1
标准型，rocket-vip-basic-2
高阶Ⅰ型，rocket-vip-basic-3
高阶Ⅱ型，rocket-vip-basic-4
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 实例规格：
基础型，rocket-vip-basic-1
标准型，rocket-vip-basic-2
高阶Ⅰ型，rocket-vip-basic-3
高阶Ⅱ型，rocket-vip-basic-4
     * @param Spec 实例规格：
基础型，rocket-vip-basic-1
标准型，rocket-vip-basic-2
高阶Ⅰ型，rocket-vip-basic-3
高阶Ⅱ型，rocket-vip-basic-4
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 节点数量，最小2，最大20 
     * @return NodeCount 节点数量，最小2，最大20
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量，最小2，最大20
     * @param NodeCount 节点数量，最小2，最大20
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 单节点存储空间，GB为单位，最低200GB 
     * @return StorageSize 单节点存储空间，GB为单位，最低200GB
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 单节点存储空间，GB为单位，最低200GB
     * @param StorageSize 单节点存储空间，GB为单位，最低200GB
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网 
     * @return ZoneIds 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     * @param ZoneIds 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get VPC信息 
     * @return VpcInfo VPC信息
     */
    public VpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set VPC信息
     * @param VpcInfo VPC信息
     */
    public void setVpcInfo(VpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 购买时长，月为单位 
     * @return TimeSpan 购买时长，月为单位
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长，月为单位
     * @param TimeSpan 购买时长，月为单位
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public CreateRocketMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQVipInstanceRequest(CreateRocketMQVipInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo(source.VpcInfo);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

