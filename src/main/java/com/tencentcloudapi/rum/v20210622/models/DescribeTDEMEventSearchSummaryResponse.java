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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMEventSearchSummaryResponse extends AbstractModel {

    /**
    * <p>各分类窗口计数，Key 为分类 id</p>
    */
    @SerializedName("CategoryCounts")
    @Expose
    private IntKeyValue [] CategoryCounts;

    /**
    * <p>当前分类窗口条数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>访问用户（设备）</p>
    */
    @SerializedName("Visitors")
    @Expose
    private Long Visitors;

    /**
    * <p>业务用户</p>
    */
    @SerializedName("Users")
    @Expose
    private Long Users;

    /**
    * <p>实际分桶秒数</p>
    */
    @SerializedName("IntervalSec")
    @Expose
    private Long IntervalSec;

    /**
    * <p>分桶趋势</p>
    */
    @SerializedName("Series")
    @Expose
    private EventSearchSeriesPoint [] Series;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>各分类窗口计数，Key 为分类 id</p> 
     * @return CategoryCounts <p>各分类窗口计数，Key 为分类 id</p>
     */
    public IntKeyValue [] getCategoryCounts() {
        return this.CategoryCounts;
    }

    /**
     * Set <p>各分类窗口计数，Key 为分类 id</p>
     * @param CategoryCounts <p>各分类窗口计数，Key 为分类 id</p>
     */
    public void setCategoryCounts(IntKeyValue [] CategoryCounts) {
        this.CategoryCounts = CategoryCounts;
    }

    /**
     * Get <p>当前分类窗口条数</p> 
     * @return Total <p>当前分类窗口条数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>当前分类窗口条数</p>
     * @param Total <p>当前分类窗口条数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>访问用户（设备）</p> 
     * @return Visitors <p>访问用户（设备）</p>
     */
    public Long getVisitors() {
        return this.Visitors;
    }

    /**
     * Set <p>访问用户（设备）</p>
     * @param Visitors <p>访问用户（设备）</p>
     */
    public void setVisitors(Long Visitors) {
        this.Visitors = Visitors;
    }

    /**
     * Get <p>业务用户</p> 
     * @return Users <p>业务用户</p>
     */
    public Long getUsers() {
        return this.Users;
    }

    /**
     * Set <p>业务用户</p>
     * @param Users <p>业务用户</p>
     */
    public void setUsers(Long Users) {
        this.Users = Users;
    }

    /**
     * Get <p>实际分桶秒数</p> 
     * @return IntervalSec <p>实际分桶秒数</p>
     */
    public Long getIntervalSec() {
        return this.IntervalSec;
    }

    /**
     * Set <p>实际分桶秒数</p>
     * @param IntervalSec <p>实际分桶秒数</p>
     */
    public void setIntervalSec(Long IntervalSec) {
        this.IntervalSec = IntervalSec;
    }

    /**
     * Get <p>分桶趋势</p> 
     * @return Series <p>分桶趋势</p>
     */
    public EventSearchSeriesPoint [] getSeries() {
        return this.Series;
    }

    /**
     * Set <p>分桶趋势</p>
     * @param Series <p>分桶趋势</p>
     */
    public void setSeries(EventSearchSeriesPoint [] Series) {
        this.Series = Series;
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

    public DescribeTDEMEventSearchSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventSearchSummaryResponse(DescribeTDEMEventSearchSummaryResponse source) {
        if (source.CategoryCounts != null) {
            this.CategoryCounts = new IntKeyValue[source.CategoryCounts.length];
            for (int i = 0; i < source.CategoryCounts.length; i++) {
                this.CategoryCounts[i] = new IntKeyValue(source.CategoryCounts[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Visitors != null) {
            this.Visitors = new Long(source.Visitors);
        }
        if (source.Users != null) {
            this.Users = new Long(source.Users);
        }
        if (source.IntervalSec != null) {
            this.IntervalSec = new Long(source.IntervalSec);
        }
        if (source.Series != null) {
            this.Series = new EventSearchSeriesPoint[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new EventSearchSeriesPoint(source.Series[i]);
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
        this.setParamArrayObj(map, prefix + "CategoryCounts.", this.CategoryCounts);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Visitors", this.Visitors);
        this.setParamSimple(map, prefix + "Users", this.Users);
        this.setParamSimple(map, prefix + "IntervalSec", this.IntervalSec);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

