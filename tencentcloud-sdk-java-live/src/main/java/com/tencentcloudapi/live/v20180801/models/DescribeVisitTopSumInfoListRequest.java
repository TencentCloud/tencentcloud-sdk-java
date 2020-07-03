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

public class DescribeVisitTopSumInfoListRequest extends AbstractModel{

    /**
    * 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，格式为yyyy-mm-dd HH:MM:SS
时间跨度在(0,4小时]，支持最近1天数据查询。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 峰值指标，可选值包括”Domain”，”StreamId”。
    */
    @SerializedName("TopIndex")
    @Expose
    private String TopIndex;

    /**
    * 播放域名，默认为不填，表示求总体数据。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * 页号，
范围是[1,1000]，
默认值是1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页个数，范围是[1,1000]，
默认值是20。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
     * Get 起始时间点，格式为yyyy-mm-dd HH:MM:SS。 
     * @return StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @param StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，格式为yyyy-mm-dd HH:MM:SS
时间跨度在(0,4小时]，支持最近1天数据查询。 
     * @return EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS
时间跨度在(0,4小时]，支持最近1天数据查询。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，格式为yyyy-mm-dd HH:MM:SS
时间跨度在(0,4小时]，支持最近1天数据查询。
     * @param EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS
时间跨度在(0,4小时]，支持最近1天数据查询。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 峰值指标，可选值包括”Domain”，”StreamId”。 
     * @return TopIndex 峰值指标，可选值包括”Domain”，”StreamId”。
     */
    public String getTopIndex() {
        return this.TopIndex;
    }

    /**
     * Set 峰值指标，可选值包括”Domain”，”StreamId”。
     * @param TopIndex 峰值指标，可选值包括”Domain”，”StreamId”。
     */
    public void setTopIndex(String TopIndex) {
        this.TopIndex = TopIndex;
    }

    /**
     * Get 播放域名，默认为不填，表示求总体数据。 
     * @return PlayDomains 播放域名，默认为不填，表示求总体数据。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 播放域名，默认为不填，表示求总体数据。
     * @param PlayDomains 播放域名，默认为不填，表示求总体数据。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get 页号，
范围是[1,1000]，
默认值是1。 
     * @return PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页号，
范围是[1,1000]，
默认值是1。
     * @param PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页个数，范围是[1,1000]，
默认值是20。 
     * @return PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页个数，范围是[1,1000]，
默认值是20。
     * @param PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。 
     * @return OrderParam 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * Set 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     * @param OrderParam 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TopIndex", this.TopIndex);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);

    }
}

