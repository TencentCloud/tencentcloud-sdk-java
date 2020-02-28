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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScreenShotSheetNumListRequest extends AbstractModel{

    /**
    * utc起始时间，格式为yyyy-mm-ddTHH:MM:SSZ
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * utc结束时间，格式为yyyy-mm-ddTHH:MM:SSZ，支持查询最近1年数据。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 地域信息，可选值包括Mainland，Oversea，前者是查询中国大陆范围内的数据，后者是除中国大陆范围之外的数据，若不传该参数，则查询所有地区的数据。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 推流域名（支持查询2019年11 月1日之后的域名维度数据）。
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * 数据维度，数据延迟1个半小时，可选值包括：1、Minute（5分钟粒度，最大支持查询时间范围是31天），2、Day（天粒度，默认值，最大支持查询时间范围是186天当天）。
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
     * Get utc起始时间，格式为yyyy-mm-ddTHH:MM:SSZ 
     * @return StartTime utc起始时间，格式为yyyy-mm-ddTHH:MM:SSZ
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set utc起始时间，格式为yyyy-mm-ddTHH:MM:SSZ
     * @param StartTime utc起始时间，格式为yyyy-mm-ddTHH:MM:SSZ
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get utc结束时间，格式为yyyy-mm-ddTHH:MM:SSZ，支持查询最近1年数据。 
     * @return EndTime utc结束时间，格式为yyyy-mm-ddTHH:MM:SSZ，支持查询最近1年数据。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set utc结束时间，格式为yyyy-mm-ddTHH:MM:SSZ，支持查询最近1年数据。
     * @param EndTime utc结束时间，格式为yyyy-mm-ddTHH:MM:SSZ，支持查询最近1年数据。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 地域信息，可选值包括Mainland，Oversea，前者是查询中国大陆范围内的数据，后者是除中国大陆范围之外的数据，若不传该参数，则查询所有地区的数据。 
     * @return Zone 地域信息，可选值包括Mainland，Oversea，前者是查询中国大陆范围内的数据，后者是除中国大陆范围之外的数据，若不传该参数，则查询所有地区的数据。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域信息，可选值包括Mainland，Oversea，前者是查询中国大陆范围内的数据，后者是除中国大陆范围之外的数据，若不传该参数，则查询所有地区的数据。
     * @param Zone 地域信息，可选值包括Mainland，Oversea，前者是查询中国大陆范围内的数据，后者是除中国大陆范围之外的数据，若不传该参数，则查询所有地区的数据。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 推流域名（支持查询2019年11 月1日之后的域名维度数据）。 
     * @return PushDomains 推流域名（支持查询2019年11 月1日之后的域名维度数据）。
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set 推流域名（支持查询2019年11 月1日之后的域名维度数据）。
     * @param PushDomains 推流域名（支持查询2019年11 月1日之后的域名维度数据）。
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get 数据维度，数据延迟1个半小时，可选值包括：1、Minute（5分钟粒度，最大支持查询时间范围是31天），2、Day（天粒度，默认值，最大支持查询时间范围是186天当天）。 
     * @return Granularity 数据维度，数据延迟1个半小时，可选值包括：1、Minute（5分钟粒度，最大支持查询时间范围是31天），2、Day（天粒度，默认值，最大支持查询时间范围是186天当天）。
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 数据维度，数据延迟1个半小时，可选值包括：1、Minute（5分钟粒度，最大支持查询时间范围是31天），2、Day（天粒度，默认值，最大支持查询时间范围是186天当天）。
     * @param Granularity 数据维度，数据延迟1个半小时，可选值包括：1、Minute（5分钟粒度，最大支持查询时间范围是31天），2、Day（天粒度，默认值，最大支持查询时间范围是186天当天）。
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

