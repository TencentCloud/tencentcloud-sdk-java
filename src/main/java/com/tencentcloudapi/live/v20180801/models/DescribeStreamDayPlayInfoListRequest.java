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

public class DescribeStreamDayPlayInfoListRequest extends AbstractModel{

    /**
    * 日期，格式：YYYY-mm-dd。
第二天凌晨3点出昨天的数据，建议在这个时间点之后查询最新数据。支持最近3个月的数据查询。
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * 播放域名。
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * 页号，范围[1,1000]，默认值是1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页个数，范围[100,1000]，默认值是1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 可选值：
Mainland：查询国内数据，
Oversea：则查询国外数据，
默认：查询国内+国外的数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * 服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get 日期，格式：YYYY-mm-dd。
第二天凌晨3点出昨天的数据，建议在这个时间点之后查询最新数据。支持最近3个月的数据查询。 
     * @return DayTime 日期，格式：YYYY-mm-dd。
第二天凌晨3点出昨天的数据，建议在这个时间点之后查询最新数据。支持最近3个月的数据查询。
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set 日期，格式：YYYY-mm-dd。
第二天凌晨3点出昨天的数据，建议在这个时间点之后查询最新数据。支持最近3个月的数据查询。
     * @param DayTime 日期，格式：YYYY-mm-dd。
第二天凌晨3点出昨天的数据，建议在这个时间点之后查询最新数据。支持最近3个月的数据查询。
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get 播放域名。 
     * @return PlayDomain 播放域名。
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set 播放域名。
     * @param PlayDomain 播放域名。
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get 页号，范围[1,1000]，默认值是1。 
     * @return PageNum 页号，范围[1,1000]，默认值是1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页号，范围[1,1000]，默认值是1。
     * @param PageNum 页号，范围[1,1000]，默认值是1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页个数，范围[100,1000]，默认值是1000。 
     * @return PageSize 每页个数，范围[100,1000]，默认值是1000。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页个数，范围[100,1000]，默认值是1000。
     * @param PageSize 每页个数，范围[100,1000]，默认值是1000。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 可选值：
Mainland：查询国内数据，
Oversea：则查询国外数据，
默认：查询国内+国外的数据。 
     * @return MainlandOrOversea 可选值：
Mainland：查询国内数据，
Oversea：则查询国外数据，
默认：查询国内+国外的数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 可选值：
Mainland：查询国内数据，
Oversea：则查询国外数据，
默认：查询国内+国外的数据。
     * @param MainlandOrOversea 可选值：
Mainland：查询国内数据，
Oversea：则查询国外数据，
默认：查询国内+国外的数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get 服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。 
     * @return ServiceName 服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。
     * @param ServiceName 服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public DescribeStreamDayPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamDayPlayInfoListRequest(DescribeStreamDayPlayInfoListRequest source) {
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

