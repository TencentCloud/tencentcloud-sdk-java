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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityMetricsResponse extends AbstractModel{

    /**
    * 输入的查询指标
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 时间序列
    */
    @SerializedName("Content")
    @Expose
    private TimeValue [] Content;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 输入的查询指标 
     * @return Metric 输入的查询指标
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 输入的查询指标
     * @param Metric 输入的查询指标
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 时间序列 
     * @return Content 时间序列
     */
    public TimeValue [] getContent() {
        return this.Content;
    }

    /**
     * Set 时间序列
     * @param Content 时间序列
     */
    public void setContent(TimeValue [] Content) {
        this.Content = Content;
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

    public DescribeQualityMetricsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityMetricsResponse(DescribeQualityMetricsResponse source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Content != null) {
            this.Content = new TimeValue[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new TimeValue(source.Content[i]);
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
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

