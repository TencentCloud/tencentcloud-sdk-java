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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayQos extends AbstractModel {

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 云服务器内网IP。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 网关流控出方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 网关流控入方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
    */
    @SerializedName("InBandwidth")
    @Expose
    private Long InBandwidth;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 云服务器内网IP。 
     * @return IpAddress 云服务器内网IP。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 云服务器内网IP。
     * @param IpAddress 云服务器内网IP。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 网关流控出方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。 
     * @return Bandwidth 网关流控出方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 网关流控出方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     * @param Bandwidth 网关流控出方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 网关流控入方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。 
     * @return InBandwidth 网关流控入方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     */
    public Long getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 网关流控入方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     * @param InBandwidth 网关流控入方向带宽值，当值为-1时，代表未限速；当值大于等于0时，限速带宽上限为返回值。
     */
    public void setInBandwidth(Long InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    public GatewayQos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayQos(GatewayQos source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InBandwidth != null) {
            this.InBandwidth = new Long(source.InBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InBandwidth", this.InBandwidth);

    }
}

