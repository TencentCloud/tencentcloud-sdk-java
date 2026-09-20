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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInfo extends AbstractModel {

    /**
    * <p>网络类型。 0：公网，1：内网</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private Long NetworkType;

    /**
    * <p>私有网络id</p>
    */
    @SerializedName("VpcID")
    @Expose
    private String VpcID;

    /**
    * <p>私有网络所属用户app id</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>网络服务类型。0：CVM，3：专线网关，11：云联网，1025：CLB</p>
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * <p>专线网关id或者云联网id</p>
    */
    @SerializedName("VpcGatewayIndex")
    @Expose
    private String VpcGatewayIndex;

    /**
    * <p>私有域名映射地址</p>
    */
    @SerializedName("PrivateDomainNames")
    @Expose
    private PrivateDomainNames [] PrivateDomainNames;

    /**
     * Get <p>网络类型。 0：公网，1：内网</p> 
     * @return NetworkType <p>网络类型。 0：公网，1：内网</p>
     */
    public Long getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型。 0：公网，1：内网</p>
     * @param NetworkType <p>网络类型。 0：公网，1：内网</p>
     */
    public void setNetworkType(Long NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>私有网络id</p> 
     * @return VpcID <p>私有网络id</p>
     */
    public String getVpcID() {
        return this.VpcID;
    }

    /**
     * Set <p>私有网络id</p>
     * @param VpcID <p>私有网络id</p>
     */
    public void setVpcID(String VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get <p>私有网络所属用户app id</p> 
     * @return AppID <p>私有网络所属用户app id</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>私有网络所属用户app id</p>
     * @param AppID <p>私有网络所属用户app id</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>网络服务类型。0：CVM，3：专线网关，11：云联网，1025：CLB</p> 
     * @return VirtualGatewayType <p>网络服务类型。0：CVM，3：专线网关，11：云联网，1025：CLB</p>
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set <p>网络服务类型。0：CVM，3：专线网关，11：云联网，1025：CLB</p>
     * @param VirtualGatewayType <p>网络服务类型。0：CVM，3：专线网关，11：云联网，1025：CLB</p>
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get <p>专线网关id或者云联网id</p> 
     * @return VpcGatewayIndex <p>专线网关id或者云联网id</p>
     */
    public String getVpcGatewayIndex() {
        return this.VpcGatewayIndex;
    }

    /**
     * Set <p>专线网关id或者云联网id</p>
     * @param VpcGatewayIndex <p>专线网关id或者云联网id</p>
     */
    public void setVpcGatewayIndex(String VpcGatewayIndex) {
        this.VpcGatewayIndex = VpcGatewayIndex;
    }

    /**
     * Get <p>私有域名映射地址</p> 
     * @return PrivateDomainNames <p>私有域名映射地址</p>
     */
    public PrivateDomainNames [] getPrivateDomainNames() {
        return this.PrivateDomainNames;
    }

    /**
     * Set <p>私有域名映射地址</p>
     * @param PrivateDomainNames <p>私有域名映射地址</p>
     */
    public void setPrivateDomainNames(PrivateDomainNames [] PrivateDomainNames) {
        this.PrivateDomainNames = PrivateDomainNames;
    }

    public NetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInfo(NetworkInfo source) {
        if (source.NetworkType != null) {
            this.NetworkType = new Long(source.NetworkType);
        }
        if (source.VpcID != null) {
            this.VpcID = new String(source.VpcID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.VpcGatewayIndex != null) {
            this.VpcGatewayIndex = new String(source.VpcGatewayIndex);
        }
        if (source.PrivateDomainNames != null) {
            this.PrivateDomainNames = new PrivateDomainNames[source.PrivateDomainNames.length];
            for (int i = 0; i < source.PrivateDomainNames.length; i++) {
                this.PrivateDomainNames[i] = new PrivateDomainNames(source.PrivateDomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "VpcGatewayIndex", this.VpcGatewayIndex);
        this.setParamArrayObj(map, prefix + "PrivateDomainNames.", this.PrivateDomainNames);

    }
}

