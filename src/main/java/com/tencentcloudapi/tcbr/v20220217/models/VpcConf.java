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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcConf extends AbstractModel {

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc 网段
    */
    @SerializedName("VpcCIDR")
    @Expose
    private String VpcCIDR;

    /**
    * subnet id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * subnet 网段
    */
    @SerializedName("SubnetCIDR")
    @Expose
    private String SubnetCIDR;

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc 网段 
     * @return VpcCIDR vpc 网段
     */
    public String getVpcCIDR() {
        return this.VpcCIDR;
    }

    /**
     * Set vpc 网段
     * @param VpcCIDR vpc 网段
     */
    public void setVpcCIDR(String VpcCIDR) {
        this.VpcCIDR = VpcCIDR;
    }

    /**
     * Get subnet id 
     * @return SubnetId subnet id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnet id
     * @param SubnetId subnet id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get subnet 网段 
     * @return SubnetCIDR subnet 网段
     */
    public String getSubnetCIDR() {
        return this.SubnetCIDR;
    }

    /**
     * Set subnet 网段
     * @param SubnetCIDR subnet 网段
     */
    public void setSubnetCIDR(String SubnetCIDR) {
        this.SubnetCIDR = SubnetCIDR;
    }

    public VpcConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcConf(VpcConf source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCIDR != null) {
            this.VpcCIDR = new String(source.VpcCIDR);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetCIDR != null) {
            this.SubnetCIDR = new String(source.SubnetCIDR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCIDR", this.VpcCIDR);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetCIDR", this.SubnetCIDR);

    }
}

