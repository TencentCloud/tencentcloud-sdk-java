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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCMarketScaleMetricDataRequest extends AbstractModel{

    /**
    * 用户SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，格式为YYYY-MM-DD。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 返回数据的粒度，支持设为以下值：
d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。
h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get 用户SdkAppId 
     * @return SdkAppId 用户SdkAppId
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 用户SdkAppId
     * @param SdkAppId 用户SdkAppId
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天） 
     * @return StartTime 查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）
     * @param StartTime 查询开始时间，格式为YYYY-MM-DD。（查询时间范围根据监控仪表盘功能版本而定，【基础版】可查近30天，【进阶版】可查近60天）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，格式为YYYY-MM-DD。 
     * @return EndTime 查询结束时间，格式为YYYY-MM-DD。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，格式为YYYY-MM-DD。
     * @param EndTime 查询结束时间，格式为YYYY-MM-DD。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 返回数据的粒度，支持设为以下值：
d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。
h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。 
     * @return Period 返回数据的粒度，支持设为以下值：
d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。
h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 返回数据的粒度，支持设为以下值：
d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。
h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。
     * @param Period 返回数据的粒度，支持设为以下值：
d：按天。此时返回查询时间范围内 UTC 时间为零点的数据。
h：按小时。此时返回查询时间范围内 UTC 时间为整小时的数据。
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public DescribeTRTCMarketScaleMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCMarketScaleMetricDataRequest(DescribeTRTCMarketScaleMetricDataRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

