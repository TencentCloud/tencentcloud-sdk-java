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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeRangeResponse extends AbstractModel{

    /**
    * 有效回归时间范围开始时间点
    */
    @SerializedName("TimeRangeStart")
    @Expose
    private String TimeRangeStart;

    /**
    * 有效回归时间范围结束时间点
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 有效回归时间范围开始时间点 
     * @return TimeRangeStart 有效回归时间范围开始时间点
     */
    public String getTimeRangeStart() {
        return this.TimeRangeStart;
    }

    /**
     * Set 有效回归时间范围开始时间点
     * @param TimeRangeStart 有效回归时间范围开始时间点
     */
    public void setTimeRangeStart(String TimeRangeStart) {
        this.TimeRangeStart = TimeRangeStart;
    }

    /**
     * Get 有效回归时间范围结束时间点 
     * @return TimeRangeEnd 有效回归时间范围结束时间点
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set 有效回归时间范围结束时间点
     * @param TimeRangeEnd 有效回归时间范围结束时间点
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRollbackTimeRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeRangeResponse(DescribeRollbackTimeRangeResponse source) {
        if (source.TimeRangeStart != null) {
            this.TimeRangeStart = new String(source.TimeRangeStart);
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRangeStart", this.TimeRangeStart);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

