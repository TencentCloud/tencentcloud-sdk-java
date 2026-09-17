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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlatformEnvUsageResponse extends AbstractModel {

    /**
    * <p>资源用量信息</p>
    */
    @SerializedName("Resources")
    @Expose
    private PlatformResUsageItem [] Resources;

    /**
    * <p>资源点</p>
    */
    @SerializedName("TotalCredits")
    @Expose
    private Long TotalCredits;

    /**
    * <p>资源点取整倍数</p>
    */
    @SerializedName("CreditsScale")
    @Expose
    private Long CreditsScale;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源用量信息</p> 
     * @return Resources <p>资源用量信息</p>
     */
    public PlatformResUsageItem [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源用量信息</p>
     * @param Resources <p>资源用量信息</p>
     */
    public void setResources(PlatformResUsageItem [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>资源点</p> 
     * @return TotalCredits <p>资源点</p>
     */
    public Long getTotalCredits() {
        return this.TotalCredits;
    }

    /**
     * Set <p>资源点</p>
     * @param TotalCredits <p>资源点</p>
     */
    public void setTotalCredits(Long TotalCredits) {
        this.TotalCredits = TotalCredits;
    }

    /**
     * Get <p>资源点取整倍数</p> 
     * @return CreditsScale <p>资源点取整倍数</p>
     */
    public Long getCreditsScale() {
        return this.CreditsScale;
    }

    /**
     * Set <p>资源点取整倍数</p>
     * @param CreditsScale <p>资源点取整倍数</p>
     */
    public void setCreditsScale(Long CreditsScale) {
        this.CreditsScale = CreditsScale;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePlatformEnvUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlatformEnvUsageResponse(DescribePlatformEnvUsageResponse source) {
        if (source.Resources != null) {
            this.Resources = new PlatformResUsageItem[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new PlatformResUsageItem(source.Resources[i]);
            }
        }
        if (source.TotalCredits != null) {
            this.TotalCredits = new Long(source.TotalCredits);
        }
        if (source.CreditsScale != null) {
            this.CreditsScale = new Long(source.CreditsScale);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "TotalCredits", this.TotalCredits);
        this.setParamSimple(map, prefix + "CreditsScale", this.CreditsScale);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

