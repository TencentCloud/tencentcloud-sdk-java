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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExposeServiceRequest extends AbstractModel{

    /**
    * 服务Id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
    */
    @SerializedName("ExposeType")
    @Expose
    private String ExposeType;

    /**
    * 暴露方式为 VPC 时，填写需要打通的私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 暴露方式为 VPC 时，填写需要打通的子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 服务Id 
     * @return ServiceId 服务Id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务Id
     * @param ServiceId 服务Id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通） 
     * @return ExposeType 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     */
    public String getExposeType() {
        return this.ExposeType;
    }

    /**
     * Set 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     * @param ExposeType 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     */
    public void setExposeType(String ExposeType) {
        this.ExposeType = ExposeType;
    }

    /**
     * Get 暴露方式为 VPC 时，填写需要打通的私有网络Id 
     * @return VpcId 暴露方式为 VPC 时，填写需要打通的私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 暴露方式为 VPC 时，填写需要打通的私有网络Id
     * @param VpcId 暴露方式为 VPC 时，填写需要打通的私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 暴露方式为 VPC 时，填写需要打通的子网Id 
     * @return SubnetId 暴露方式为 VPC 时，填写需要打通的子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 暴露方式为 VPC 时，填写需要打通的子网Id
     * @param SubnetId 暴露方式为 VPC 时，填写需要打通的子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ExposeType", this.ExposeType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

