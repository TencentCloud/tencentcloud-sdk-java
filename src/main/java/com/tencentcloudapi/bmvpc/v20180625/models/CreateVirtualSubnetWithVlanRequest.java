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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVirtualSubnetWithVlanRequest extends AbstractModel {

    /**
    * 系统分配的私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网信息
    */
    @SerializedName("SubnetSet")
    @Expose
    private SubnetCreateInputInfo [] SubnetSet;

    /**
     * Get 系统分配的私有网络ID，例如：vpc-kd7d06of 
     * @return VpcId 系统分配的私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 系统分配的私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 系统分配的私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网信息 
     * @return SubnetSet 子网信息
     */
    public SubnetCreateInputInfo [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 子网信息
     * @param SubnetSet 子网信息
     */
    public void setSubnetSet(SubnetCreateInputInfo [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    public CreateVirtualSubnetWithVlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVirtualSubnetWithVlanRequest(CreateVirtualSubnetWithVlanRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new SubnetCreateInputInfo[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new SubnetCreateInputInfo(source.SubnetSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);

    }
}

