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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestSummary extends AbstractModel{

    /**
    * 请求URL
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 请求方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 请求响应平均耗时，单位秒
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
    * 请求p90耗时，单位秒
    */
    @SerializedName("P90")
    @Expose
    private Float P90;

    /**
    * 请求p95耗时，单位秒
    */
    @SerializedName("P95")
    @Expose
    private Float P95;

    /**
    * 请求最小耗时，单位秒
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * 请求最大耗时，单位秒
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * 请求错误率
    */
    @SerializedName("ErrorPercentage")
    @Expose
    private Float ErrorPercentage;

    /**
    * 请求p99耗时，单位秒
    */
    @SerializedName("P99")
    @Expose
    private Float P99;

    /**
    * 响应状态码
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 响应详情
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 请求URL 
     * @return Service 请求URL
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 请求URL
     * @param Service 请求URL
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 请求方法 
     * @return Method 请求方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法
     * @param Method 请求方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求次数 
     * @return Count 请求次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 请求次数
     * @param Count 请求次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 请求响应平均耗时，单位秒 
     * @return Average 请求响应平均耗时，单位秒
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set 请求响应平均耗时，单位秒
     * @param Average 请求响应平均耗时，单位秒
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    /**
     * Get 请求p90耗时，单位秒 
     * @return P90 请求p90耗时，单位秒
     */
    public Float getP90() {
        return this.P90;
    }

    /**
     * Set 请求p90耗时，单位秒
     * @param P90 请求p90耗时，单位秒
     */
    public void setP90(Float P90) {
        this.P90 = P90;
    }

    /**
     * Get 请求p95耗时，单位秒 
     * @return P95 请求p95耗时，单位秒
     */
    public Float getP95() {
        return this.P95;
    }

    /**
     * Set 请求p95耗时，单位秒
     * @param P95 请求p95耗时，单位秒
     */
    public void setP95(Float P95) {
        this.P95 = P95;
    }

    /**
     * Get 请求最小耗时，单位秒 
     * @return Min 请求最小耗时，单位秒
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set 请求最小耗时，单位秒
     * @param Min 请求最小耗时，单位秒
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get 请求最大耗时，单位秒 
     * @return Max 请求最大耗时，单位秒
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set 请求最大耗时，单位秒
     * @param Max 请求最大耗时，单位秒
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get 请求错误率 
     * @return ErrorPercentage 请求错误率
     */
    public Float getErrorPercentage() {
        return this.ErrorPercentage;
    }

    /**
     * Set 请求错误率
     * @param ErrorPercentage 请求错误率
     */
    public void setErrorPercentage(Float ErrorPercentage) {
        this.ErrorPercentage = ErrorPercentage;
    }

    /**
     * Get 请求p99耗时，单位秒 
     * @return P99 请求p99耗时，单位秒
     */
    public Float getP99() {
        return this.P99;
    }

    /**
     * Set 请求p99耗时，单位秒
     * @param P99 请求p99耗时，单位秒
     */
    public void setP99(Float P99) {
        this.P99 = P99;
    }

    /**
     * Get 响应状态码 
     * @return Status 响应状态码
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 响应状态码
     * @param Status 响应状态码
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 响应详情 
     * @return Result 响应详情
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 响应详情
     * @param Result 响应详情
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public RequestSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestSummary(RequestSummary source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Average != null) {
            this.Average = new Float(source.Average);
        }
        if (source.P90 != null) {
            this.P90 = new Float(source.P90);
        }
        if (source.P95 != null) {
            this.P95 = new Float(source.P95);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.ErrorPercentage != null) {
            this.ErrorPercentage = new Float(source.ErrorPercentage);
        }
        if (source.P99 != null) {
            this.P99 = new Float(source.P99);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Average", this.Average);
        this.setParamSimple(map, prefix + "P90", this.P90);
        this.setParamSimple(map, prefix + "P95", this.P95);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "ErrorPercentage", this.ErrorPercentage);
        this.setParamSimple(map, prefix + "P99", this.P99);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

