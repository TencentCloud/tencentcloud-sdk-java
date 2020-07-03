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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnBlockStatisResponse extends AbstractModel{

    /**
    * 解封总配额数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已使用次数
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * 统计起始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 统计结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 解封总配额数 
     * @return Total 解封总配额数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 解封总配额数
     * @param Total 解封总配额数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已使用次数 
     * @return Used 已使用次数
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用次数
     * @param Used 已使用次数
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get 统计起始时间 
     * @return BeginTime 统计起始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 统计起始时间
     * @param BeginTime 统计起始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 统计结束时间 
     * @return EndTime 统计结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间
     * @param EndTime 统计结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

