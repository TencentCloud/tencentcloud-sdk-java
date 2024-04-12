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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressInfo extends AbstractModel {

    /**
    * 地址的资源id标识。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 地址所在的vpc。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 地址所在的子网。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 地址的vip。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 地址的端口。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 外网地址域名。
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网地址端口。
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
     * Get 地址的资源id标识。 
     * @return ResourceId 地址的资源id标识。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 地址的资源id标识。
     * @param ResourceId 地址的资源id标识。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 地址所在的vpc。 
     * @return UniqVpcId 地址所在的vpc。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 地址所在的vpc。
     * @param UniqVpcId 地址所在的vpc。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 地址所在的子网。 
     * @return UniqSubnetId 地址所在的子网。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 地址所在的子网。
     * @param UniqSubnetId 地址所在的子网。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 地址的vip。 
     * @return Vip 地址的vip。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 地址的vip。
     * @param Vip 地址的vip。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 地址的端口。 
     * @return VPort 地址的端口。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 地址的端口。
     * @param VPort 地址的端口。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 外网地址域名。 
     * @return WanDomain 外网地址域名。
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网地址域名。
     * @param WanDomain 外网地址域名。
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网地址端口。 
     * @return WanPort 外网地址端口。
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网地址端口。
     * @param WanPort 外网地址端口。
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    public AddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressInfo(AddressInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);

    }
}

