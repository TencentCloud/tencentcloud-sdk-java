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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewResourceQuotaDataLite extends AbstractModel {

    /**
    * <p>资源与配额详情核心数据，包含南北向带宽、东西向带宽、NDR 带宽、资源配额和日志存储信息。</p>
    */
    @SerializedName("Detail")
    @Expose
    private OverviewResourceQuotaDetail Detail;

    /**
    * <p>纯按量计费使用情况</p>
    */
    @SerializedName("VolumeUsageDetail")
    @Expose
    private VolumeUsageDetail VolumeUsageDetail;

    /**
     * Get <p>资源与配额详情核心数据，包含南北向带宽、东西向带宽、NDR 带宽、资源配额和日志存储信息。</p> 
     * @return Detail <p>资源与配额详情核心数据，包含南北向带宽、东西向带宽、NDR 带宽、资源配额和日志存储信息。</p>
     */
    public OverviewResourceQuotaDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>资源与配额详情核心数据，包含南北向带宽、东西向带宽、NDR 带宽、资源配额和日志存储信息。</p>
     * @param Detail <p>资源与配额详情核心数据，包含南北向带宽、东西向带宽、NDR 带宽、资源配额和日志存储信息。</p>
     */
    public void setDetail(OverviewResourceQuotaDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>纯按量计费使用情况</p> 
     * @return VolumeUsageDetail <p>纯按量计费使用情况</p>
     */
    public VolumeUsageDetail getVolumeUsageDetail() {
        return this.VolumeUsageDetail;
    }

    /**
     * Set <p>纯按量计费使用情况</p>
     * @param VolumeUsageDetail <p>纯按量计费使用情况</p>
     */
    public void setVolumeUsageDetail(VolumeUsageDetail VolumeUsageDetail) {
        this.VolumeUsageDetail = VolumeUsageDetail;
    }

    public OverviewResourceQuotaDataLite() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewResourceQuotaDataLite(OverviewResourceQuotaDataLite source) {
        if (source.Detail != null) {
            this.Detail = new OverviewResourceQuotaDetail(source.Detail);
        }
        if (source.VolumeUsageDetail != null) {
            this.VolumeUsageDetail = new VolumeUsageDetail(source.VolumeUsageDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamObj(map, prefix + "VolumeUsageDetail.", this.VolumeUsageDetail);

    }
}

