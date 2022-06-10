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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApolloEnvParam extends AbstractModel{

    /**
    * 环境名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境内引擎的节点规格 ID
    */
    @SerializedName("EngineResourceSpec")
    @Expose
    private String EngineResourceSpec;

    /**
    * 环境内引擎的节点数量
    */
    @SerializedName("EngineNodeNum")
    @Expose
    private Long EngineNodeNum;

    /**
    * 配置存储空间大小，以GB为单位
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * VPC ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 环境名称 
     * @return Name 环境名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 环境名称
     * @param Name 环境名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 环境内引擎的节点规格 ID 
     * @return EngineResourceSpec 环境内引擎的节点规格 ID
     */
    public String getEngineResourceSpec() {
        return this.EngineResourceSpec;
    }

    /**
     * Set 环境内引擎的节点规格 ID
     * @param EngineResourceSpec 环境内引擎的节点规格 ID
     */
    public void setEngineResourceSpec(String EngineResourceSpec) {
        this.EngineResourceSpec = EngineResourceSpec;
    }

    /**
     * Get 环境内引擎的节点数量 
     * @return EngineNodeNum 环境内引擎的节点数量
     */
    public Long getEngineNodeNum() {
        return this.EngineNodeNum;
    }

    /**
     * Set 环境内引擎的节点数量
     * @param EngineNodeNum 环境内引擎的节点数量
     */
    public void setEngineNodeNum(Long EngineNodeNum) {
        this.EngineNodeNum = EngineNodeNum;
    }

    /**
     * Get 配置存储空间大小，以GB为单位 
     * @return StorageCapacity 配置存储空间大小，以GB为单位
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set 配置存储空间大小，以GB为单位
     * @param StorageCapacity 配置存储空间大小，以GB为单位
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get VPC ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址 
     * @return VpcId VPC ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     * @param VpcId VPC ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址 
     * @return SubnetId 子网 ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     * @param SubnetId 子网 ID。在 VPC 的子网内分配一个 IP 作为 ConfigServer 的访问地址
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public ApolloEnvParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApolloEnvParam(ApolloEnvParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EngineResourceSpec != null) {
            this.EngineResourceSpec = new String(source.EngineResourceSpec);
        }
        if (source.EngineNodeNum != null) {
            this.EngineNodeNum = new Long(source.EngineNodeNum);
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EngineResourceSpec", this.EngineResourceSpec);
        this.setParamSimple(map, prefix + "EngineNodeNum", this.EngineNodeNum);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

