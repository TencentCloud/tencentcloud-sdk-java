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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAILatencyResponse extends AbstractModel {

    /**
    * 时延明细数据
 -1表示无对应数据
    */
    @SerializedName("AILatencyDetail")
    @Expose
    private AILatencyDetail [] AILatencyDetail;

    /**
    * 时延统计数据
 -1表示无对应数据
    */
    @SerializedName("AILatencyStatistics")
    @Expose
    private AILatencyStatistics AILatencyStatistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 时延明细数据
 -1表示无对应数据 
     * @return AILatencyDetail 时延明细数据
 -1表示无对应数据
     */
    public AILatencyDetail [] getAILatencyDetail() {
        return this.AILatencyDetail;
    }

    /**
     * Set 时延明细数据
 -1表示无对应数据
     * @param AILatencyDetail 时延明细数据
 -1表示无对应数据
     */
    public void setAILatencyDetail(AILatencyDetail [] AILatencyDetail) {
        this.AILatencyDetail = AILatencyDetail;
    }

    /**
     * Get 时延统计数据
 -1表示无对应数据 
     * @return AILatencyStatistics 时延统计数据
 -1表示无对应数据
     */
    public AILatencyStatistics getAILatencyStatistics() {
        return this.AILatencyStatistics;
    }

    /**
     * Set 时延统计数据
 -1表示无对应数据
     * @param AILatencyStatistics 时延统计数据
 -1表示无对应数据
     */
    public void setAILatencyStatistics(AILatencyStatistics AILatencyStatistics) {
        this.AILatencyStatistics = AILatencyStatistics;
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

    public DescribeAILatencyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAILatencyResponse(DescribeAILatencyResponse source) {
        if (source.AILatencyDetail != null) {
            this.AILatencyDetail = new AILatencyDetail[source.AILatencyDetail.length];
            for (int i = 0; i < source.AILatencyDetail.length; i++) {
                this.AILatencyDetail[i] = new AILatencyDetail(source.AILatencyDetail[i]);
            }
        }
        if (source.AILatencyStatistics != null) {
            this.AILatencyStatistics = new AILatencyStatistics(source.AILatencyStatistics);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AILatencyDetail.", this.AILatencyDetail);
        this.setParamObj(map, prefix + "AILatencyStatistics.", this.AILatencyStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

