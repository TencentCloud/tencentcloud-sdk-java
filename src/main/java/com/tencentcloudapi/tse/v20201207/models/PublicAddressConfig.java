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

public class PublicAddressConfig extends AbstractModel {

    /**
    * 公网 ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 公网最大带宽
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 公网所属分组 id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 公网所属分组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 公网负载均衡 id
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * 公网负载均衡描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 公网 ip 
     * @return Vip 公网 ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 公网 ip
     * @param Vip 公网 ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 公网最大带宽 
     * @return InternetMaxBandwidthOut 公网最大带宽
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网最大带宽
     * @param InternetMaxBandwidthOut 公网最大带宽
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 公网所属分组 id 
     * @return GroupId 公网所属分组 id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 公网所属分组 id
     * @param GroupId 公网所属分组 id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 公网所属分组名 
     * @return GroupName 公网所属分组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 公网所属分组名
     * @param GroupName 公网所属分组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 公网负载均衡 id 
     * @return NetworkId 公网负载均衡 id
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set 公网负载均衡 id
     * @param NetworkId 公网负载均衡 id
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get 公网负载均衡描述 
     * @return Description 公网负载均衡描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 公网负载均衡描述
     * @param Description 公网负载均衡描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PublicAddressConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicAddressConfig(PublicAddressConfig source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

