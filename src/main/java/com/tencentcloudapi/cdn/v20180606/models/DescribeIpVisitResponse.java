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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpVisitResponse extends AbstractModel {

    /**
    * 数据统计的时间粒度，支持5min,  day，分别表示5分钟，1天的时间粒度。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 各个资源的回源数据详情。
    */
    @SerializedName("Data")
    @Expose
    private ResourceData [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据统计的时间粒度，支持5min,  day，分别表示5分钟，1天的时间粒度。 
     * @return Interval 数据统计的时间粒度，支持5min,  day，分别表示5分钟，1天的时间粒度。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 数据统计的时间粒度，支持5min,  day，分别表示5分钟，1天的时间粒度。
     * @param Interval 数据统计的时间粒度，支持5min,  day，分别表示5分钟，1天的时间粒度。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 各个资源的回源数据详情。 
     * @return Data 各个资源的回源数据详情。
     */
    public ResourceData [] getData() {
        return this.Data;
    }

    /**
     * Set 各个资源的回源数据详情。
     * @param Data 各个资源的回源数据详情。
     */
    public void setData(ResourceData [] Data) {
        this.Data = Data;
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

    public DescribeIpVisitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpVisitResponse(DescribeIpVisitResponse source) {
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Data != null) {
            this.Data = new ResourceData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ResourceData(source.Data[i]);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

