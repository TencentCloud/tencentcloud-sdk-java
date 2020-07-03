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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHostedInterfaceRequest extends AbstractModel{

    /**
    * 托管机器唯一ID 数组
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 私有网络ID或者私有网络统一ID，建议使用统一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID或者子网统一ID，建议使用统一ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 托管机器唯一ID 数组 
     * @return InstanceIds 托管机器唯一ID 数组
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 托管机器唯一ID 数组
     * @param InstanceIds 托管机器唯一ID 数组
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 私有网络ID或者私有网络统一ID，建议使用统一ID 
     * @return VpcId 私有网络ID或者私有网络统一ID，建议使用统一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID或者私有网络统一ID，建议使用统一ID
     * @param VpcId 私有网络ID或者私有网络统一ID，建议使用统一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID或者子网统一ID，建议使用统一ID 
     * @return SubnetId 子网ID或者子网统一ID，建议使用统一ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID或者子网统一ID，建议使用统一ID
     * @param SubnetId 子网ID或者子网统一ID，建议使用统一ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

