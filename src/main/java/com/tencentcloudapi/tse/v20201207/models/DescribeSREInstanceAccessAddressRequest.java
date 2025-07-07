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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSREInstanceAccessAddressRequest extends AbstractModel {

    /**
    * 注册引擎实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 引擎其他组件名称（pushgateway、polaris-limiter）
    */
    @SerializedName("Workload")
    @Expose
    private String Workload;

    /**
    * 部署地域
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
     * Get 注册引擎实例Id 
     * @return InstanceId 注册引擎实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 注册引擎实例Id
     * @param InstanceId 注册引擎实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 引擎其他组件名称（pushgateway、polaris-limiter） 
     * @return Workload 引擎其他组件名称（pushgateway、polaris-limiter）
     */
    public String getWorkload() {
        return this.Workload;
    }

    /**
     * Set 引擎其他组件名称（pushgateway、polaris-limiter）
     * @param Workload 引擎其他组件名称（pushgateway、polaris-limiter）
     */
    public void setWorkload(String Workload) {
        this.Workload = Workload;
    }

    /**
     * Get 部署地域 
     * @return EngineRegion 部署地域
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 部署地域
     * @param EngineRegion 部署地域
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    public DescribeSREInstanceAccessAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSREInstanceAccessAddressRequest(DescribeSREInstanceAccessAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Workload != null) {
            this.Workload = new String(source.Workload);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Workload", this.Workload);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);

    }
}

