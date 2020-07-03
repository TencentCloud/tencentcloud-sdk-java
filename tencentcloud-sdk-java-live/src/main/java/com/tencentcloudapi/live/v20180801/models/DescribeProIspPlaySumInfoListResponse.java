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

public class DescribeProIspPlaySumInfoListResponse extends AbstractModel{

    /**
    * 总流量。
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * 总请求数。
    */
    @SerializedName("TotalRequest")
    @Expose
    private Long TotalRequest;

    /**
    * 统计的类型。
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 每页的记录数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页号。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 总记录数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 省份，运营商，国家或地区汇总数据列表。
    */
    @SerializedName("DataInfoList")
    @Expose
    private ProIspPlaySumInfo [] DataInfoList;

    /**
    * 下载速度，单位：MB/s，计算方式：总流量/总时长。
    */
    @SerializedName("AvgFluxPerSecond")
    @Expose
    private Float AvgFluxPerSecond;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总流量。 
     * @return TotalFlux 总流量。
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set 总流量。
     * @param TotalFlux 总流量。
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Get 总请求数。 
     * @return TotalRequest 总请求数。
     */
    public Long getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * Set 总请求数。
     * @param TotalRequest 总请求数。
     */
    public void setTotalRequest(Long TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * Get 统计的类型。 
     * @return StatType 统计的类型。
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set 统计的类型。
     * @param StatType 统计的类型。
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get 每页的记录数。 
     * @return PageSize 每页的记录数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页的记录数。
     * @param PageSize 每页的记录数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页号。 
     * @return PageNum 页号。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页号。
     * @param PageNum 页号。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 总记录数。 
     * @return TotalNum 总记录数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总记录数。
     * @param TotalNum 总记录数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 省份，运营商，国家或地区汇总数据列表。 
     * @return DataInfoList 省份，运营商，国家或地区汇总数据列表。
     */
    public ProIspPlaySumInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set 省份，运营商，国家或地区汇总数据列表。
     * @param DataInfoList 省份，运营商，国家或地区汇总数据列表。
     */
    public void setDataInfoList(ProIspPlaySumInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get 下载速度，单位：MB/s，计算方式：总流量/总时长。 
     * @return AvgFluxPerSecond 下载速度，单位：MB/s，计算方式：总流量/总时长。
     */
    public Float getAvgFluxPerSecond() {
        return this.AvgFluxPerSecond;
    }

    /**
     * Set 下载速度，单位：MB/s，计算方式：总流量/总时长。
     * @param AvgFluxPerSecond 下载速度，单位：MB/s，计算方式：总流量/总时长。
     */
    public void setAvgFluxPerSecond(Float AvgFluxPerSecond) {
        this.AvgFluxPerSecond = AvgFluxPerSecond;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "AvgFluxPerSecond", this.AvgFluxPerSecond);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

