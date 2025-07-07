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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMuskPromptsResponse extends AbstractModel {

    /**
    * total count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * prompt列表详情
    */
    @SerializedName("MuskPromptInfos")
    @Expose
    private MuskPromptInfo [] MuskPromptInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get total count 
     * @return TotalCount total count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set total count
     * @param TotalCount total count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get prompt列表详情 
     * @return MuskPromptInfos prompt列表详情
     */
    public MuskPromptInfo [] getMuskPromptInfos() {
        return this.MuskPromptInfos;
    }

    /**
     * Set prompt列表详情
     * @param MuskPromptInfos prompt列表详情
     */
    public void setMuskPromptInfos(MuskPromptInfo [] MuskPromptInfos) {
        this.MuskPromptInfos = MuskPromptInfos;
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

    public DescribeMuskPromptsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMuskPromptsResponse(DescribeMuskPromptsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MuskPromptInfos != null) {
            this.MuskPromptInfos = new MuskPromptInfo[source.MuskPromptInfos.length];
            for (int i = 0; i < source.MuskPromptInfos.length; i++) {
                this.MuskPromptInfos[i] = new MuskPromptInfo(source.MuskPromptInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "MuskPromptInfos.", this.MuskPromptInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

