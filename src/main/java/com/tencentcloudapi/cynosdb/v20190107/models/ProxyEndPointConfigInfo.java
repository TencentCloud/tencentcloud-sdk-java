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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyEndPointConfigInfo extends AbstractModel {

    /**
    * 所属VPC网络ID
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 所属子网ID
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 安全组id数组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 权重模式： system-系统分配，custom-自定义
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否自动添加只读实例，yes-是，no-不自动添加
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * 读写属性： READWRITE,READONLY
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * 权重信息
    */
    @SerializedName("InstanceNameWeights")
    @Expose
    private InstanceNameWeight [] InstanceNameWeights;

    /**
     * Get 所属VPC网络ID 
     * @return UniqueVpcId 所属VPC网络ID
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 所属VPC网络ID
     * @param UniqueVpcId 所属VPC网络ID
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 所属子网ID 
     * @return UniqueSubnetId 所属子网ID
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 所属子网ID
     * @param UniqueSubnetId 所属子网ID
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 安全组id数组 
     * @return SecurityGroupIds 安全组id数组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组id数组
     * @param SecurityGroupIds 安全组id数组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 权重模式： system-系统分配，custom-自定义 
     * @return WeightMode 权重模式： system-系统分配，custom-自定义
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重模式： system-系统分配，custom-自定义
     * @param WeightMode 权重模式： system-系统分配，custom-自定义
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否自动添加只读实例，yes-是，no-不自动添加 
     * @return AutoAddRo 是否自动添加只读实例，yes-是，no-不自动添加
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加只读实例，yes-是，no-不自动添加
     * @param AutoAddRo 是否自动添加只读实例，yes-是，no-不自动添加
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 读写属性： READWRITE,READONLY 
     * @return RwType 读写属性： READWRITE,READONLY
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set 读写属性： READWRITE,READONLY
     * @param RwType 读写属性： READWRITE,READONLY
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get 权重信息 
     * @return InstanceNameWeights 权重信息
     */
    public InstanceNameWeight [] getInstanceNameWeights() {
        return this.InstanceNameWeights;
    }

    /**
     * Set 权重信息
     * @param InstanceNameWeights 权重信息
     */
    public void setInstanceNameWeights(InstanceNameWeight [] InstanceNameWeights) {
        this.InstanceNameWeights = InstanceNameWeights;
    }

    public ProxyEndPointConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyEndPointConfigInfo(ProxyEndPointConfigInfo source) {
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.InstanceNameWeights != null) {
            this.InstanceNameWeights = new InstanceNameWeight[source.InstanceNameWeights.length];
            for (int i = 0; i < source.InstanceNameWeights.length; i++) {
                this.InstanceNameWeights[i] = new InstanceNameWeight(source.InstanceNameWeights[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamArrayObj(map, prefix + "InstanceNameWeights.", this.InstanceNameWeights);

    }
}

