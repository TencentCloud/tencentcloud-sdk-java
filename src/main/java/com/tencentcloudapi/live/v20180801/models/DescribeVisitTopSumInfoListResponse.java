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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVisitTopSumInfoListResponse extends AbstractModel {

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
    * 峰值指标，可选值包括”Domain”，”StreamId”。
    */
    @SerializedName("TopIndex")
    @Expose
    private String TopIndex;

    /**
    * 排序指标，可选值包括” AvgFluxPerSecond”(按每秒平均流量排序)，”TotalRequest”（默认，按总请求数排序）,“TotalFlux”（按总流量排序）。
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
    * 记录总数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 记录总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 数据内容。
    */
    @SerializedName("DataInfoList")
    @Expose
    private PlaySumStatInfo [] DataInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 排序指标，可选值包括” AvgFluxPerSecond”(按每秒平均流量排序)，”TotalRequest”（默认，按总请求数排序）,“TotalFlux”（按总流量排序）。 
     * @return OrderParam 排序指标，可选值包括” AvgFluxPerSecond”(按每秒平均流量排序)，”TotalRequest”（默认，按总请求数排序）,“TotalFlux”（按总流量排序）。
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * Set 排序指标，可选值包括” AvgFluxPerSecond”(按每秒平均流量排序)，”TotalRequest”（默认，按总请求数排序）,“TotalFlux”（按总流量排序）。
     * @param OrderParam 排序指标，可选值包括” AvgFluxPerSecond”(按每秒平均流量排序)，”TotalRequest”（默认，按总请求数排序）,“TotalFlux”（按总流量排序）。
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
    }

    /**
     * Get 记录总数。 
     * @return TotalNum 记录总数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 记录总数。
     * @param TotalNum 记录总数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 记录总页数。 
     * @return TotalPage 记录总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 记录总页数。
     * @param TotalPage 记录总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 数据内容。 
     * @return DataInfoList 数据内容。
     */
    public PlaySumStatInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set 数据内容。
     * @param DataInfoList 数据内容。
     */
    public void setDataInfoList(PlaySumStatInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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

    public DescribeVisitTopSumInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVisitTopSumInfoListResponse(DescribeVisitTopSumInfoListResponse source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TopIndex != null) {
            this.TopIndex = new String(source.TopIndex);
        }
        if (source.OrderParam != null) {
            this.OrderParam = new String(source.OrderParam);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.DataInfoList != null) {
            this.DataInfoList = new PlaySumStatInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new PlaySumStatInfo(source.DataInfoList[i]);
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
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TopIndex", this.TopIndex);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

