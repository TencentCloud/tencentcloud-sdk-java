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

public class MigrateBandwidthPackageResourcesRequest extends AbstractModel {

    /**
    * 当前资源所在的共享带宽包ID
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 要迁移的目标共享带宽包的ID
    */
    @SerializedName("TargetBandwidthPackageId")
    @Expose
    private String TargetBandwidthPackageId;

    /**
    * 要迁移的资源的ID列表
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get 当前资源所在的共享带宽包ID 
     * @return BandwidthPackageId 当前资源所在的共享带宽包ID
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 当前资源所在的共享带宽包ID
     * @param BandwidthPackageId 当前资源所在的共享带宽包ID
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 要迁移的目标共享带宽包的ID 
     * @return TargetBandwidthPackageId 要迁移的目标共享带宽包的ID
     */
    public String getTargetBandwidthPackageId() {
        return this.TargetBandwidthPackageId;
    }

    /**
     * Set 要迁移的目标共享带宽包的ID
     * @param TargetBandwidthPackageId 要迁移的目标共享带宽包的ID
     */
    public void setTargetBandwidthPackageId(String TargetBandwidthPackageId) {
        this.TargetBandwidthPackageId = TargetBandwidthPackageId;
    }

    /**
     * Get 要迁移的资源的ID列表 
     * @return ResourceIds 要迁移的资源的ID列表
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 要迁移的资源的ID列表
     * @param ResourceIds 要迁移的资源的ID列表
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public MigrateBandwidthPackageResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateBandwidthPackageResourcesRequest(MigrateBandwidthPackageResourcesRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.TargetBandwidthPackageId != null) {
            this.TargetBandwidthPackageId = new String(source.TargetBandwidthPackageId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "TargetBandwidthPackageId", this.TargetBandwidthPackageId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

