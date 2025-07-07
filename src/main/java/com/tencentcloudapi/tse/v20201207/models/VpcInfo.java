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

public class VpcInfo extends AbstractModel {

    /**
    * Vpc Id
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
    * 内网访问地址
    */
    @SerializedName("IntranetAddress")
    @Expose
    private String IntranetAddress;

    /**
    * 负载均衡均衡接入点子网ID
    */
    @SerializedName("LbSubnetId")
    @Expose
    private String LbSubnetId;

    /**
     * Get Vpc Id 
     * @return VpcId Vpc Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc Id
     * @param VpcId Vpc Id
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
     * Get 内网访问地址 
     * @return IntranetAddress 内网访问地址
     */
    public String getIntranetAddress() {
        return this.IntranetAddress;
    }

    /**
     * Set 内网访问地址
     * @param IntranetAddress 内网访问地址
     */
    public void setIntranetAddress(String IntranetAddress) {
        this.IntranetAddress = IntranetAddress;
    }

    /**
     * Get 负载均衡均衡接入点子网ID 
     * @return LbSubnetId 负载均衡均衡接入点子网ID
     */
    public String getLbSubnetId() {
        return this.LbSubnetId;
    }

    /**
     * Set 负载均衡均衡接入点子网ID
     * @param LbSubnetId 负载均衡均衡接入点子网ID
     */
    public void setLbSubnetId(String LbSubnetId) {
        this.LbSubnetId = LbSubnetId;
    }

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IntranetAddress != null) {
            this.IntranetAddress = new String(source.IntranetAddress);
        }
        if (source.LbSubnetId != null) {
            this.LbSubnetId = new String(source.LbSubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IntranetAddress", this.IntranetAddress);
        this.setParamSimple(map, prefix + "LbSubnetId", this.LbSubnetId);

    }
}

