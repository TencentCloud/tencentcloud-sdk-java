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

public class DescribeK8sApiAbnormalSummaryResponse extends AbstractModel{

    /**
    * 待处理事件个数
    */
    @SerializedName("UnhandleEventCount")
    @Expose
    private Long UnhandleEventCount;

    /**
    * 待处理高危事件个数
    */
    @SerializedName("UnhandleHighLevelEventCount")
    @Expose
    private Long UnhandleHighLevelEventCount;

    /**
    * 待处理中危事件个数
    */
    @SerializedName("UnhandleMediumLevelEventCount")
    @Expose
    private Long UnhandleMediumLevelEventCount;

    /**
    * 待处理低危事件个数
    */
    @SerializedName("UnhandleLowLevelEventCount")
    @Expose
    private Long UnhandleLowLevelEventCount;

    /**
    * 待处理提示级别事件个数
    */
    @SerializedName("UnhandleNoticeLevelEventCount")
    @Expose
    private Long UnhandleNoticeLevelEventCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 待处理事件个数 
     * @return UnhandleEventCount 待处理事件个数
     */
    public Long getUnhandleEventCount() {
        return this.UnhandleEventCount;
    }

    /**
     * Set 待处理事件个数
     * @param UnhandleEventCount 待处理事件个数
     */
    public void setUnhandleEventCount(Long UnhandleEventCount) {
        this.UnhandleEventCount = UnhandleEventCount;
    }

    /**
     * Get 待处理高危事件个数 
     * @return UnhandleHighLevelEventCount 待处理高危事件个数
     */
    public Long getUnhandleHighLevelEventCount() {
        return this.UnhandleHighLevelEventCount;
    }

    /**
     * Set 待处理高危事件个数
     * @param UnhandleHighLevelEventCount 待处理高危事件个数
     */
    public void setUnhandleHighLevelEventCount(Long UnhandleHighLevelEventCount) {
        this.UnhandleHighLevelEventCount = UnhandleHighLevelEventCount;
    }

    /**
     * Get 待处理中危事件个数 
     * @return UnhandleMediumLevelEventCount 待处理中危事件个数
     */
    public Long getUnhandleMediumLevelEventCount() {
        return this.UnhandleMediumLevelEventCount;
    }

    /**
     * Set 待处理中危事件个数
     * @param UnhandleMediumLevelEventCount 待处理中危事件个数
     */
    public void setUnhandleMediumLevelEventCount(Long UnhandleMediumLevelEventCount) {
        this.UnhandleMediumLevelEventCount = UnhandleMediumLevelEventCount;
    }

    /**
     * Get 待处理低危事件个数 
     * @return UnhandleLowLevelEventCount 待处理低危事件个数
     */
    public Long getUnhandleLowLevelEventCount() {
        return this.UnhandleLowLevelEventCount;
    }

    /**
     * Set 待处理低危事件个数
     * @param UnhandleLowLevelEventCount 待处理低危事件个数
     */
    public void setUnhandleLowLevelEventCount(Long UnhandleLowLevelEventCount) {
        this.UnhandleLowLevelEventCount = UnhandleLowLevelEventCount;
    }

    /**
     * Get 待处理提示级别事件个数 
     * @return UnhandleNoticeLevelEventCount 待处理提示级别事件个数
     */
    public Long getUnhandleNoticeLevelEventCount() {
        return this.UnhandleNoticeLevelEventCount;
    }

    /**
     * Set 待处理提示级别事件个数
     * @param UnhandleNoticeLevelEventCount 待处理提示级别事件个数
     */
    public void setUnhandleNoticeLevelEventCount(Long UnhandleNoticeLevelEventCount) {
        this.UnhandleNoticeLevelEventCount = UnhandleNoticeLevelEventCount;
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

    public DescribeK8sApiAbnormalSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalSummaryResponse(DescribeK8sApiAbnormalSummaryResponse source) {
        if (source.UnhandleEventCount != null) {
            this.UnhandleEventCount = new Long(source.UnhandleEventCount);
        }
        if (source.UnhandleHighLevelEventCount != null) {
            this.UnhandleHighLevelEventCount = new Long(source.UnhandleHighLevelEventCount);
        }
        if (source.UnhandleMediumLevelEventCount != null) {
            this.UnhandleMediumLevelEventCount = new Long(source.UnhandleMediumLevelEventCount);
        }
        if (source.UnhandleLowLevelEventCount != null) {
            this.UnhandleLowLevelEventCount = new Long(source.UnhandleLowLevelEventCount);
        }
        if (source.UnhandleNoticeLevelEventCount != null) {
            this.UnhandleNoticeLevelEventCount = new Long(source.UnhandleNoticeLevelEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnhandleEventCount", this.UnhandleEventCount);
        this.setParamSimple(map, prefix + "UnhandleHighLevelEventCount", this.UnhandleHighLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleMediumLevelEventCount", this.UnhandleMediumLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleLowLevelEventCount", this.UnhandleLowLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleNoticeLevelEventCount", this.UnhandleNoticeLevelEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

