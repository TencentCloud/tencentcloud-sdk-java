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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInboundEndpointRequest extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * 地域
    */
    @SerializedName("EndpointRegion")
    @Expose
    private String EndpointRegion;

    /**
    * vpcid
    */
    @SerializedName("EndpointVpc")
    @Expose
    private String EndpointVpc;

    /**
    * 子网信息
    */
    @SerializedName("SubnetIp")
    @Expose
    private SubnetIpInfo [] SubnetIp;

    /**
     * Get 名称 
     * @return EndpointName 名称
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set 名称
     * @param EndpointName 名称
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get 地域 
     * @return EndpointRegion 地域
     */
    public String getEndpointRegion() {
        return this.EndpointRegion;
    }

    /**
     * Set 地域
     * @param EndpointRegion 地域
     */
    public void setEndpointRegion(String EndpointRegion) {
        this.EndpointRegion = EndpointRegion;
    }

    /**
     * Get vpcid 
     * @return EndpointVpc vpcid
     */
    public String getEndpointVpc() {
        return this.EndpointVpc;
    }

    /**
     * Set vpcid
     * @param EndpointVpc vpcid
     */
    public void setEndpointVpc(String EndpointVpc) {
        this.EndpointVpc = EndpointVpc;
    }

    /**
     * Get 子网信息 
     * @return SubnetIp 子网信息
     */
    public SubnetIpInfo [] getSubnetIp() {
        return this.SubnetIp;
    }

    /**
     * Set 子网信息
     * @param SubnetIp 子网信息
     */
    public void setSubnetIp(SubnetIpInfo [] SubnetIp) {
        this.SubnetIp = SubnetIp;
    }

    public CreateInboundEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInboundEndpointRequest(CreateInboundEndpointRequest source) {
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.EndpointRegion != null) {
            this.EndpointRegion = new String(source.EndpointRegion);
        }
        if (source.EndpointVpc != null) {
            this.EndpointVpc = new String(source.EndpointVpc);
        }
        if (source.SubnetIp != null) {
            this.SubnetIp = new SubnetIpInfo[source.SubnetIp.length];
            for (int i = 0; i < source.SubnetIp.length; i++) {
                this.SubnetIp[i] = new SubnetIpInfo(source.SubnetIp[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "EndpointRegion", this.EndpointRegion);
        this.setParamSimple(map, prefix + "EndpointVpc", this.EndpointVpc);
        this.setParamArrayObj(map, prefix + "SubnetIp.", this.SubnetIp);

    }
}

