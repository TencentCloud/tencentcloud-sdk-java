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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCMarketQualityDataRequest extends AbstractModel {

    /**
    * <p>用户SdkAppId（如：1400xxxxxx）</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * <p>查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，格式为YYYY-MM-DD。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>返回数据的粒度，支持设为以下值：<br>d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。<br>h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>返回数据是否为小数</p>
    */
    @SerializedName("IsFloat")
    @Expose
    private Boolean IsFloat;

    /**
     * Get <p>用户SdkAppId（如：1400xxxxxx）</p> 
     * @return SdkAppId <p>用户SdkAppId（如：1400xxxxxx）</p>
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>用户SdkAppId（如：1400xxxxxx）</p>
     * @param SdkAppId <p>用户SdkAppId（如：1400xxxxxx）</p>
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）</p> 
     * @return StartTime <p>查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）</p>
     * @param StartTime <p>查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，格式为YYYY-MM-DD。</p> 
     * @return EndTime <p>查询结束时间，格式为YYYY-MM-DD。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，格式为YYYY-MM-DD。</p>
     * @param EndTime <p>查询结束时间，格式为YYYY-MM-DD。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>返回数据的粒度，支持设为以下值：<br>d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。<br>h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。</p> 
     * @return Period <p>返回数据的粒度，支持设为以下值：<br>d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。<br>h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>返回数据的粒度，支持设为以下值：<br>d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。<br>h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。</p>
     * @param Period <p>返回数据的粒度，支持设为以下值：<br>d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。<br>h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>返回数据是否为小数</p> 
     * @return IsFloat <p>返回数据是否为小数</p>
     */
    public Boolean getIsFloat() {
        return this.IsFloat;
    }

    /**
     * Set <p>返回数据是否为小数</p>
     * @param IsFloat <p>返回数据是否为小数</p>
     */
    public void setIsFloat(Boolean IsFloat) {
        this.IsFloat = IsFloat;
    }

    public DescribeTRTCMarketQualityDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCMarketQualityDataRequest(DescribeTRTCMarketQualityDataRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.IsFloat != null) {
            this.IsFloat = new Boolean(source.IsFloat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "IsFloat", this.IsFloat);

    }
}

