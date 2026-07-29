/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel {

    /**
    * <p>匹配检索条件的原始日志的数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * <p>返回的是否为统计分析（即SQL）结果</p>
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * <p>匹配检索条件的原始日志</p>
    */
    @SerializedName("Data")
    @Expose
    private LogInfo [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>匹配检索条件的原始日志的数量</p> 
     * @return Count <p>匹配检索条件的原始日志的数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>匹配检索条件的原始日志的数量</p>
     * @param Count <p>匹配检索条件的原始日志的数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时</p> 
     * @return Context <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时</p>
     * @param Context <p>透传本次接口返回的Context值，可获取后续更多日志，过期时间1小时</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志</p> 
     * @return ListOver <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志</p>
     * @param ListOver <p>符合检索条件的日志是否已全部返回，如未全部返回可使用Context参数获取后续更多日志</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get <p>返回的是否为统计分析（即SQL）结果</p> 
     * @return Analysis <p>返回的是否为统计分析（即SQL）结果</p>
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set <p>返回的是否为统计分析（即SQL）结果</p>
     * @param Analysis <p>返回的是否为统计分析（即SQL）结果</p>
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get <p>匹配检索条件的原始日志</p> 
     * @return Data <p>匹配检索条件的原始日志</p>
     */
    public LogInfo [] getData() {
        return this.Data;
    }

    /**
     * Set <p>匹配检索条件的原始日志</p>
     * @param Data <p>匹配检索条件的原始日志</p>
     */
    public void setData(LogInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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

