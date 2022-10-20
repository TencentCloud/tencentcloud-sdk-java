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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalProcessLevelSummaryResponse extends AbstractModel{

    /**
    * 异常进程高危待处理事件数
    */
    @SerializedName("HighLevelEventCount")
    @Expose
    private Long HighLevelEventCount;

    /**
    * 异常进程中危待处理事件数
    */
    @SerializedName("MediumLevelEventCount")
    @Expose
    private Long MediumLevelEventCount;

    /**
    * 异常进程低危待处理事件数
    */
    @SerializedName("LowLevelEventCount")
    @Expose
    private Long LowLevelEventCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 异常进程高危待处理事件数 
     * @return HighLevelEventCount 异常进程高危待处理事件数
     */
    public Long getHighLevelEventCount() {
        return this.HighLevelEventCount;
    }

    /**
     * Set 异常进程高危待处理事件数
     * @param HighLevelEventCount 异常进程高危待处理事件数
     */
    public void setHighLevelEventCount(Long HighLevelEventCount) {
        this.HighLevelEventCount = HighLevelEventCount;
    }

    /**
     * Get 异常进程中危待处理事件数 
     * @return MediumLevelEventCount 异常进程中危待处理事件数
     */
    public Long getMediumLevelEventCount() {
        return this.MediumLevelEventCount;
    }

    /**
     * Set 异常进程中危待处理事件数
     * @param MediumLevelEventCount 异常进程中危待处理事件数
     */
    public void setMediumLevelEventCount(Long MediumLevelEventCount) {
        this.MediumLevelEventCount = MediumLevelEventCount;
    }

    /**
     * Get 异常进程低危待处理事件数 
     * @return LowLevelEventCount 异常进程低危待处理事件数
     */
    public Long getLowLevelEventCount() {
        return this.LowLevelEventCount;
    }

    /**
     * Set 异常进程低危待处理事件数
     * @param LowLevelEventCount 异常进程低危待处理事件数
     */
    public void setLowLevelEventCount(Long LowLevelEventCount) {
        this.LowLevelEventCount = LowLevelEventCount;
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

    public DescribeAbnormalProcessLevelSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalProcessLevelSummaryResponse(DescribeAbnormalProcessLevelSummaryResponse source) {
        if (source.HighLevelEventCount != null) {
            this.HighLevelEventCount = new Long(source.HighLevelEventCount);
        }
        if (source.MediumLevelEventCount != null) {
            this.MediumLevelEventCount = new Long(source.MediumLevelEventCount);
        }
        if (source.LowLevelEventCount != null) {
            this.LowLevelEventCount = new Long(source.LowLevelEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelEventCount", this.HighLevelEventCount);
        this.setParamSimple(map, prefix + "MediumLevelEventCount", this.MediumLevelEventCount);
        this.setParamSimple(map, prefix + "LowLevelEventCount", this.LowLevelEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

