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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * 带宽包资源类型，包括'Address'和'LoadBalance'
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 带宽包资源Id，形如'eip-xxxx', 'lb-xxxx'
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 带宽包资源Ip
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get 带宽包资源类型，包括'Address'和'LoadBalance' 
     * @return ResourceType 带宽包资源类型，包括'Address'和'LoadBalance'
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 带宽包资源类型，包括'Address'和'LoadBalance'
     * @param ResourceType 带宽包资源类型，包括'Address'和'LoadBalance'
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 带宽包资源Id，形如'eip-xxxx', 'lb-xxxx' 
     * @return ResourceId 带宽包资源Id，形如'eip-xxxx', 'lb-xxxx'
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 带宽包资源Id，形如'eip-xxxx', 'lb-xxxx'
     * @param ResourceId 带宽包资源Id，形如'eip-xxxx', 'lb-xxxx'
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 带宽包资源Ip 
     * @return AddressIp 带宽包资源Ip
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 带宽包资源Ip
     * @param AddressIp 带宽包资源Ip
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

