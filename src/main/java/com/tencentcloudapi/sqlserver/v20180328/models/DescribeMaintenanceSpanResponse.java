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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMaintenanceSpanResponse extends AbstractModel{

    /**
    * 以周为单位，表示周几允许维护，例如：[1,2,3,4,5,6,7]表示周一到周日均为可维护日。
    */
    @SerializedName("Weekly")
    @Expose
    private Long [] Weekly;

    /**
    * 每天可维护的开始时间，例如：10:24标识可维护时间窗10点24分开始。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 每天可维护的持续时间，单位是h，例如：1 表示从可维护的开始时间起持续1小时。
    */
    @SerializedName("Span")
    @Expose
    private Long Span;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 以周为单位，表示周几允许维护，例如：[1,2,3,4,5,6,7]表示周一到周日均为可维护日。 
     * @return Weekly 以周为单位，表示周几允许维护，例如：[1,2,3,4,5,6,7]表示周一到周日均为可维护日。
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set 以周为单位，表示周几允许维护，例如：[1,2,3,4,5,6,7]表示周一到周日均为可维护日。
     * @param Weekly 以周为单位，表示周几允许维护，例如：[1,2,3,4,5,6,7]表示周一到周日均为可维护日。
     */
    public void setWeekly(Long [] Weekly) {
        this.Weekly = Weekly;
    }

    /**
     * Get 每天可维护的开始时间，例如：10:24标识可维护时间窗10点24分开始。 
     * @return StartTime 每天可维护的开始时间，例如：10:24标识可维护时间窗10点24分开始。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 每天可维护的开始时间，例如：10:24标识可维护时间窗10点24分开始。
     * @param StartTime 每天可维护的开始时间，例如：10:24标识可维护时间窗10点24分开始。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 每天可维护的持续时间，单位是h，例如：1 表示从可维护的开始时间起持续1小时。 
     * @return Span 每天可维护的持续时间，单位是h，例如：1 表示从可维护的开始时间起持续1小时。
     */
    public Long getSpan() {
        return this.Span;
    }

    /**
     * Set 每天可维护的持续时间，单位是h，例如：1 表示从可维护的开始时间起持续1小时。
     * @param Span 每天可维护的持续时间，单位是h，例如：1 表示从可维护的开始时间起持续1小时。
     */
    public void setSpan(Long Span) {
        this.Span = Span;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Weekly.", this.Weekly);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Span", this.Span);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

