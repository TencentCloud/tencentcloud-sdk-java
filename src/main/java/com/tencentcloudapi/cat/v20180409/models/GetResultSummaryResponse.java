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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResultSummaryResponse extends AbstractModel{

    /**
    * 实时统计数据
    */
    @SerializedName("RealData")
    @Expose
    private ResultSummary [] RealData;

    /**
    * 按天的统计数据
    */
    @SerializedName("DayData")
    @Expose
    private ResultSummary [] DayData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实时统计数据 
     * @return RealData 实时统计数据
     */
    public ResultSummary [] getRealData() {
        return this.RealData;
    }

    /**
     * Set 实时统计数据
     * @param RealData 实时统计数据
     */
    public void setRealData(ResultSummary [] RealData) {
        this.RealData = RealData;
    }

    /**
     * Get 按天的统计数据 
     * @return DayData 按天的统计数据
     */
    public ResultSummary [] getDayData() {
        return this.DayData;
    }

    /**
     * Set 按天的统计数据
     * @param DayData 按天的统计数据
     */
    public void setDayData(ResultSummary [] DayData) {
        this.DayData = DayData;
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
        this.setParamArrayObj(map, prefix + "RealData.", this.RealData);
        this.setParamArrayObj(map, prefix + "DayData.", this.DayData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

