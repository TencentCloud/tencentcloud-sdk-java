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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReviewDetailsResponse extends AbstractModel{

    /**
    * 发起内容智能识别次数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 内容智能识别总时长。
    */
    @SerializedName("TotalDuration")
    @Expose
    private Long TotalDuration;

    /**
    * 内容智能识别时长统计数据，每天一个数据。
    */
    @SerializedName("Data")
    @Expose
    private StatDataItem [] Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发起内容智能识别次数。 
     * @return TotalCount 发起内容智能识别次数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 发起内容智能识别次数。
     * @param TotalCount 发起内容智能识别次数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 内容智能识别总时长。 
     * @return TotalDuration 内容智能识别总时长。
     */
    public Long getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 内容智能识别总时长。
     * @param TotalDuration 内容智能识别总时长。
     */
    public void setTotalDuration(Long TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    /**
     * Get 内容智能识别时长统计数据，每天一个数据。 
     * @return Data 内容智能识别时长统计数据，每天一个数据。
     */
    public StatDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set 内容智能识别时长统计数据，每天一个数据。
     * @param Data 内容智能识别时长统计数据，每天一个数据。
     */
    public void setData(StatDataItem [] Data) {
        this.Data = Data;
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

    public DescribeReviewDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReviewDetailsResponse(DescribeReviewDetailsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Long(source.TotalDuration);
        }
        if (source.Data != null) {
            this.Data = new StatDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new StatDataItem(source.Data[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

