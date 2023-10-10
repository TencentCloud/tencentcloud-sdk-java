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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel{

    /**
    * 匹配检索条件的原始日志的数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 返回的是否为统计分析（即SQL）结果
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * 匹配检索条件的原始日志
    */
    @SerializedName("Data")
    @Expose
    private LogInfo [] Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配检索条件的原始日志的数量 
     * @return Count 匹配检索条件的原始日志的数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 匹配检索条件的原始日志的数量
     * @param Count 匹配检索条件的原始日志的数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时 
     * @return Context 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     * @param Context 透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志 
     * @return ListOver 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
     * @param ListOver 符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 返回的是否为统计分析（即SQL）结果 
     * @return Analysis 返回的是否为统计分析（即SQL）结果
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set 返回的是否为统计分析（即SQL）结果
     * @param Analysis 返回的是否为统计分析（即SQL）结果
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get 匹配检索条件的原始日志 
     * @return Data 匹配检索条件的原始日志
     */
    public LogInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 匹配检索条件的原始日志
     * @param Data 匹配检索条件的原始日志
     */
    public void setData(LogInfo [] Data) {
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

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.Data != null) {
            this.Data = new LogInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new LogInfo(source.Data[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "Analysis", this.Analysis);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

