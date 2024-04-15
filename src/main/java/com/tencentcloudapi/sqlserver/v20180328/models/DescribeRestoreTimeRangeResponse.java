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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRestoreTimeRangeResponse extends AbstractModel {

    /**
    * 按照时间点可回档的最小时间
    */
    @SerializedName("MinTime")
    @Expose
    private String MinTime;

    /**
    * 按照时间点可回档的最大时间
    */
    @SerializedName("MaxTime")
    @Expose
    private String MaxTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 按照时间点可回档的最小时间 
     * @return MinTime 按照时间点可回档的最小时间
     */
    public String getMinTime() {
        return this.MinTime;
    }

    /**
     * Set 按照时间点可回档的最小时间
     * @param MinTime 按照时间点可回档的最小时间
     */
    public void setMinTime(String MinTime) {
        this.MinTime = MinTime;
    }

    /**
     * Get 按照时间点可回档的最大时间 
     * @return MaxTime 按照时间点可回档的最大时间
     */
    public String getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set 按照时间点可回档的最大时间
     * @param MaxTime 按照时间点可回档的最大时间
     */
    public void setMaxTime(String MaxTime) {
        this.MaxTime = MaxTime;
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

    public DescribeRestoreTimeRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRestoreTimeRangeResponse(DescribeRestoreTimeRangeResponse source) {
        if (source.MinTime != null) {
            this.MinTime = new String(source.MinTime);
        }
        if (source.MaxTime != null) {
            this.MaxTime = new String(source.MaxTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTime", this.MinTime);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

