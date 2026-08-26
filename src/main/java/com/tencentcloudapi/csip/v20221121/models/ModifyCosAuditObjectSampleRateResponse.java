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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosAuditObjectSampleRateResponse extends AbstractModel {

    /**
    * <p>本次是否实际提交了默认采样率</p>
    */
    @SerializedName("DefaultSampleRateUpdated")
    @Expose
    private Boolean DefaultSampleRateUpdated;

    /**
    * <p>DefaultSampleRateUpdated=true 时返回修改后的值</p>
    */
    @SerializedName("DefaultSampleRate")
    @Expose
    private Float DefaultSampleRate;

    /**
    * <p>本次成功提交的已有桶数量</p>
    */
    @SerializedName("UpdatedBucketCount")
    @Expose
    private Long UpdatedBucketCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>本次是否实际提交了默认采样率</p> 
     * @return DefaultSampleRateUpdated <p>本次是否实际提交了默认采样率</p>
     */
    public Boolean getDefaultSampleRateUpdated() {
        return this.DefaultSampleRateUpdated;
    }

    /**
     * Set <p>本次是否实际提交了默认采样率</p>
     * @param DefaultSampleRateUpdated <p>本次是否实际提交了默认采样率</p>
     */
    public void setDefaultSampleRateUpdated(Boolean DefaultSampleRateUpdated) {
        this.DefaultSampleRateUpdated = DefaultSampleRateUpdated;
    }

    /**
     * Get <p>DefaultSampleRateUpdated=true 时返回修改后的值</p> 
     * @return DefaultSampleRate <p>DefaultSampleRateUpdated=true 时返回修改后的值</p>
     */
    public Float getDefaultSampleRate() {
        return this.DefaultSampleRate;
    }

    /**
     * Set <p>DefaultSampleRateUpdated=true 时返回修改后的值</p>
     * @param DefaultSampleRate <p>DefaultSampleRateUpdated=true 时返回修改后的值</p>
     */
    public void setDefaultSampleRate(Float DefaultSampleRate) {
        this.DefaultSampleRate = DefaultSampleRate;
    }

    /**
     * Get <p>本次成功提交的已有桶数量</p> 
     * @return UpdatedBucketCount <p>本次成功提交的已有桶数量</p>
     */
    public Long getUpdatedBucketCount() {
        return this.UpdatedBucketCount;
    }

    /**
     * Set <p>本次成功提交的已有桶数量</p>
     * @param UpdatedBucketCount <p>本次成功提交的已有桶数量</p>
     */
    public void setUpdatedBucketCount(Long UpdatedBucketCount) {
        this.UpdatedBucketCount = UpdatedBucketCount;
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

    public ModifyCosAuditObjectSampleRateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditObjectSampleRateResponse(ModifyCosAuditObjectSampleRateResponse source) {
        if (source.DefaultSampleRateUpdated != null) {
            this.DefaultSampleRateUpdated = new Boolean(source.DefaultSampleRateUpdated);
        }
        if (source.DefaultSampleRate != null) {
            this.DefaultSampleRate = new Float(source.DefaultSampleRate);
        }
        if (source.UpdatedBucketCount != null) {
            this.UpdatedBucketCount = new Long(source.UpdatedBucketCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultSampleRateUpdated", this.DefaultSampleRateUpdated);
        this.setParamSimple(map, prefix + "DefaultSampleRate", this.DefaultSampleRate);
        this.setParamSimple(map, prefix + "UpdatedBucketCount", this.UpdatedBucketCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

