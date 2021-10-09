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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageInternalEndpointRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Create/Delete
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 需要接入的用户vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 需要接入的用户子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 请求的地域ID，用于实例复制地域
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 请求的地域名称，用于实例复制地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Create/Delete 
     * @return Operation Create/Delete
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Create/Delete
     * @param Operation Create/Delete
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 需要接入的用户vpcid 
     * @return VpcId 需要接入的用户vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 需要接入的用户vpcid
     * @param VpcId 需要接入的用户vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 需要接入的用户子网id 
     * @return SubnetId 需要接入的用户子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 需要接入的用户子网id
     * @param SubnetId 需要接入的用户子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 请求的地域ID，用于实例复制地域 
     * @return RegionId 请求的地域ID，用于实例复制地域
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 请求的地域ID，用于实例复制地域
     * @param RegionId 请求的地域ID，用于实例复制地域
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 请求的地域名称，用于实例复制地域 
     * @return RegionName 请求的地域名称，用于实例复制地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 请求的地域名称，用于实例复制地域
     * @param RegionName 请求的地域名称，用于实例复制地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public ManageInternalEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageInternalEndpointRequest(ManageInternalEndpointRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

