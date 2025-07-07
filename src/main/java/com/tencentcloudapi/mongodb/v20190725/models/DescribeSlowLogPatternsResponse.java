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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogPatternsResponse extends AbstractModel {

    /**
    * 慢日志统计信息总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 慢日志统计信息
    */
    @SerializedName("SlowLogPatterns")
    @Expose
    private SlowLogPattern [] SlowLogPatterns;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 慢日志统计信息总数 
     * @return Count 慢日志统计信息总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 慢日志统计信息总数
     * @param Count 慢日志统计信息总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 慢日志统计信息 
     * @return SlowLogPatterns 慢日志统计信息
     */
    public SlowLogPattern [] getSlowLogPatterns() {
        return this.SlowLogPatterns;
    }

    /**
     * Set 慢日志统计信息
     * @param SlowLogPatterns 慢日志统计信息
     */
    public void setSlowLogPatterns(SlowLogPattern [] SlowLogPatterns) {
        this.SlowLogPatterns = SlowLogPatterns;
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

    public DescribeSlowLogPatternsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogPatternsResponse(DescribeSlowLogPatternsResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SlowLogPatterns != null) {
            this.SlowLogPatterns = new SlowLogPattern[source.SlowLogPatterns.length];
            for (int i = 0; i < source.SlowLogPatterns.length; i++) {
                this.SlowLogPatterns[i] = new SlowLogPattern(source.SlowLogPatterns[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "SlowLogPatterns.", this.SlowLogPatterns);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

