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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindVpcIpRequest extends AbstractModel{

    /**
    * Eip实例ID
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * EIP归属VpcId，例如vpc-k7j1t2x1
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 绑定的VPC内IP地址
    */
    @SerializedName("VpcIp")
    @Expose
    private String VpcIp;

    /**
     * Get Eip实例ID 
     * @return EipId Eip实例ID
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * Set Eip实例ID
     * @param EipId Eip实例ID
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * Get EIP归属VpcId，例如vpc-k7j1t2x1 
     * @return VpcId EIP归属VpcId，例如vpc-k7j1t2x1
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set EIP归属VpcId，例如vpc-k7j1t2x1
     * @param VpcId EIP归属VpcId，例如vpc-k7j1t2x1
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 绑定的VPC内IP地址 
     * @return VpcIp 绑定的VPC内IP地址
     */
    public String getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set 绑定的VPC内IP地址
     * @param VpcIp 绑定的VPC内IP地址
     */
    public void setVpcIp(String VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcIp", this.VpcIp);

    }
}

