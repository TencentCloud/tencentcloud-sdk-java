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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIModelUsageResponse extends AbstractModel{

    /**
    * AI模型资源包总量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * AI模型资源包信息数组
    */
    @SerializedName("UsageInfo")
    @Expose
    private AIModelUsageInfo [] UsageInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get AI模型资源包总量 
     * @return TotalCount AI模型资源包总量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set AI模型资源包总量
     * @param TotalCount AI模型资源包总量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get AI模型资源包信息数组 
     * @return UsageInfo AI模型资源包信息数组
     */
    public AIModelUsageInfo [] getUsageInfo() {
        return this.UsageInfo;
    }

    /**
     * Set AI模型资源包信息数组
     * @param UsageInfo AI模型资源包信息数组
     */
    public void setUsageInfo(AIModelUsageInfo [] UsageInfo) {
        this.UsageInfo = UsageInfo;
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

    public DescribeAIModelUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIModelUsageResponse(DescribeAIModelUsageResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UsageInfo != null) {
            this.UsageInfo = new AIModelUsageInfo[source.UsageInfo.length];
            for (int i = 0; i < source.UsageInfo.length; i++) {
                this.UsageInfo[i] = new AIModelUsageInfo(source.UsageInfo[i]);
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
        this.setParamArrayObj(map, prefix + "UsageInfo.", this.UsageInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

