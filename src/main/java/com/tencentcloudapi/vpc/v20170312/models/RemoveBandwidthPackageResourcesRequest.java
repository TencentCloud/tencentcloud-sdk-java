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

public class RemoveBandwidthPackageResourcesRequest extends AbstractModel{

    /**
    * 带宽包唯一标识ID，形如'bwp-xxxx'
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 资源类型，包括‘Address’, ‘LoadBalance’
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源ID，可支持资源形如'eip-xxxx', 'lb-xxxx'
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get 带宽包唯一标识ID，形如'bwp-xxxx' 
     * @return BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一标识ID，形如'bwp-xxxx'
     * @param BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 资源类型，包括‘Address’, ‘LoadBalance’ 
     * @return ResourceType 资源类型，包括‘Address’, ‘LoadBalance’
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，包括‘Address’, ‘LoadBalance’
     * @param ResourceType 资源类型，包括‘Address’, ‘LoadBalance’
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源ID，可支持资源形如'eip-xxxx', 'lb-xxxx' 
     * @return ResourceIds 资源ID，可支持资源形如'eip-xxxx', 'lb-xxxx'
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID，可支持资源形如'eip-xxxx', 'lb-xxxx'
     * @param ResourceIds 资源ID，可支持资源形如'eip-xxxx', 'lb-xxxx'
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

