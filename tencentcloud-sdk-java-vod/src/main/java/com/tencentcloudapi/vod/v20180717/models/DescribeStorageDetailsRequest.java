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

public class DescribeStorageDetailsRequest extends AbstractModel{

    /**
    * 起始时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，需大于开始日期，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询时间间隔，有效值：
<li>Minute：每分钟一个统计数据。</li>
<li>Hour：每小时一个统计数据。</li>
<li>Day：每天一个统计数据。</li>
默认按时间跨度决定，小于1小时按分钟，小于等于7天按小时，大于7天按天展示。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 查询的存储类型，有效值：
<li>TotalStorage：存储总量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
默认值为 TotalStorage。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
当该字段为1时，表示以管理员身份查询所有子应用（含主应用）的用量合计。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 起始时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartTime 起始时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartTime 起始时间，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，需大于开始日期，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return EndTime 结束时间，需大于开始日期，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，需大于开始日期，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param EndTime 结束时间，需大于开始日期，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询时间间隔，有效值：
<li>Minute：每分钟一个统计数据。</li>
<li>Hour：每小时一个统计数据。</li>
<li>Day：每天一个统计数据。</li>
默认按时间跨度决定，小于1小时按分钟，小于等于7天按小时，大于7天按天展示。 
     * @return Interval 查询时间间隔，有效值：
<li>Minute：每分钟一个统计数据。</li>
<li>Hour：每小时一个统计数据。</li>
<li>Day：每天一个统计数据。</li>
默认按时间跨度决定，小于1小时按分钟，小于等于7天按小时，大于7天按天展示。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间间隔，有效值：
<li>Minute：每分钟一个统计数据。</li>
<li>Hour：每小时一个统计数据。</li>
<li>Day：每天一个统计数据。</li>
默认按时间跨度决定，小于1小时按分钟，小于等于7天按小时，大于7天按天展示。
     * @param Interval 查询时间间隔，有效值：
<li>Minute：每分钟一个统计数据。</li>
<li>Hour：每小时一个统计数据。</li>
<li>Day：每天一个统计数据。</li>
默认按时间跨度决定，小于1小时按分钟，小于等于7天按小时，大于7天按天展示。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 查询的存储类型，有效值：
<li>TotalStorage：存储总量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
默认值为 TotalStorage。 
     * @return StorageType 查询的存储类型，有效值：
<li>TotalStorage：存储总量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
默认值为 TotalStorage。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 查询的存储类型，有效值：
<li>TotalStorage：存储总量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
默认值为 TotalStorage。
     * @param StorageType 查询的存储类型，有效值：
<li>TotalStorage：存储总量。</li>
<li>StandardStorage：标准存储。</li>
<li>InfrequentStorage：低频存储。</li>
默认值为 TotalStorage。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
当该字段为1时，表示以管理员身份查询所有子应用（含主应用）的用量合计。 
     * @return SubAppId 点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
当该字段为1时，表示以管理员身份查询所有子应用（含主应用）的用量合计。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
当该字段为1时，表示以管理员身份查询所有子应用（含主应用）的用量合计。
     * @param SubAppId 点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
当该字段为1时，表示以管理员身份查询所有子应用（含主应用）的用量合计。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

