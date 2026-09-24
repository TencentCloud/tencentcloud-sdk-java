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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partitioning extends AbstractModel {

    /**
    * <p>转换策略</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>按年分区策略</p>
    */
    @SerializedName("YearPartitioning")
    @Expose
    private SingleFieldPartitioning YearPartitioning;

    /**
    * <p>按月分区策略</p>
    */
    @SerializedName("MonthPartitioning")
    @Expose
    private SingleFieldPartitioning MonthPartitioning;

    /**
    * <p>按天分区策略</p>
    */
    @SerializedName("DayPartitioning")
    @Expose
    private SingleFieldPartitioning DayPartitioning;

    /**
    * <p>按小时分区策略</p>
    */
    @SerializedName("HourPartitioning")
    @Expose
    private SingleFieldPartitioning HourPartitioning;

    /**
    * <p>按字段分区策略</p>
    */
    @SerializedName("IdentityPartitioning")
    @Expose
    private SingleFieldPartitioning IdentityPartitioning;

    /**
    * <p>列表分区策略</p>
    */
    @SerializedName("ListPartitioning")
    @Expose
    private ListPartitioning ListPartitioning;

    /**
    * <p>范围分区策略</p>
    */
    @SerializedName("RangePartitioning")
    @Expose
    private RangePartitioning RangePartitioning;

    /**
    * <p>分桶分区策略</p>
    */
    @SerializedName("BucketPartitioning")
    @Expose
    private BucketPartitioning BucketPartitioning;

    /**
    * <p>截断分区策略</p>
    */
    @SerializedName("TruncatePartitioning")
    @Expose
    private TruncatePartitioning TruncatePartitioning;

    /**
     * Get <p>转换策略</p> 
     * @return Strategy <p>转换策略</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>转换策略</p>
     * @param Strategy <p>转换策略</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>按年分区策略</p> 
     * @return YearPartitioning <p>按年分区策略</p>
     */
    public SingleFieldPartitioning getYearPartitioning() {
        return this.YearPartitioning;
    }

    /**
     * Set <p>按年分区策略</p>
     * @param YearPartitioning <p>按年分区策略</p>
     */
    public void setYearPartitioning(SingleFieldPartitioning YearPartitioning) {
        this.YearPartitioning = YearPartitioning;
    }

    /**
     * Get <p>按月分区策略</p> 
     * @return MonthPartitioning <p>按月分区策略</p>
     */
    public SingleFieldPartitioning getMonthPartitioning() {
        return this.MonthPartitioning;
    }

    /**
     * Set <p>按月分区策略</p>
     * @param MonthPartitioning <p>按月分区策略</p>
     */
    public void setMonthPartitioning(SingleFieldPartitioning MonthPartitioning) {
        this.MonthPartitioning = MonthPartitioning;
    }

    /**
     * Get <p>按天分区策略</p> 
     * @return DayPartitioning <p>按天分区策略</p>
     */
    public SingleFieldPartitioning getDayPartitioning() {
        return this.DayPartitioning;
    }

    /**
     * Set <p>按天分区策略</p>
     * @param DayPartitioning <p>按天分区策略</p>
     */
    public void setDayPartitioning(SingleFieldPartitioning DayPartitioning) {
        this.DayPartitioning = DayPartitioning;
    }

    /**
     * Get <p>按小时分区策略</p> 
     * @return HourPartitioning <p>按小时分区策略</p>
     */
    public SingleFieldPartitioning getHourPartitioning() {
        return this.HourPartitioning;
    }

    /**
     * Set <p>按小时分区策略</p>
     * @param HourPartitioning <p>按小时分区策略</p>
     */
    public void setHourPartitioning(SingleFieldPartitioning HourPartitioning) {
        this.HourPartitioning = HourPartitioning;
    }

    /**
     * Get <p>按字段分区策略</p> 
     * @return IdentityPartitioning <p>按字段分区策略</p>
     */
    public SingleFieldPartitioning getIdentityPartitioning() {
        return this.IdentityPartitioning;
    }

    /**
     * Set <p>按字段分区策略</p>
     * @param IdentityPartitioning <p>按字段分区策略</p>
     */
    public void setIdentityPartitioning(SingleFieldPartitioning IdentityPartitioning) {
        this.IdentityPartitioning = IdentityPartitioning;
    }

    /**
     * Get <p>列表分区策略</p> 
     * @return ListPartitioning <p>列表分区策略</p>
     */
    public ListPartitioning getListPartitioning() {
        return this.ListPartitioning;
    }

    /**
     * Set <p>列表分区策略</p>
     * @param ListPartitioning <p>列表分区策略</p>
     */
    public void setListPartitioning(ListPartitioning ListPartitioning) {
        this.ListPartitioning = ListPartitioning;
    }

    /**
     * Get <p>范围分区策略</p> 
     * @return RangePartitioning <p>范围分区策略</p>
     */
    public RangePartitioning getRangePartitioning() {
        return this.RangePartitioning;
    }

    /**
     * Set <p>范围分区策略</p>
     * @param RangePartitioning <p>范围分区策略</p>
     */
    public void setRangePartitioning(RangePartitioning RangePartitioning) {
        this.RangePartitioning = RangePartitioning;
    }

    /**
     * Get <p>分桶分区策略</p> 
     * @return BucketPartitioning <p>分桶分区策略</p>
     */
    public BucketPartitioning getBucketPartitioning() {
        return this.BucketPartitioning;
    }

    /**
     * Set <p>分桶分区策略</p>
     * @param BucketPartitioning <p>分桶分区策略</p>
     */
    public void setBucketPartitioning(BucketPartitioning BucketPartitioning) {
        this.BucketPartitioning = BucketPartitioning;
    }

    /**
     * Get <p>截断分区策略</p> 
     * @return TruncatePartitioning <p>截断分区策略</p>
     */
    public TruncatePartitioning getTruncatePartitioning() {
        return this.TruncatePartitioning;
    }

    /**
     * Set <p>截断分区策略</p>
     * @param TruncatePartitioning <p>截断分区策略</p>
     */
    public void setTruncatePartitioning(TruncatePartitioning TruncatePartitioning) {
        this.TruncatePartitioning = TruncatePartitioning;
    }

    public Partitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partitioning(Partitioning source) {
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.YearPartitioning != null) {
            this.YearPartitioning = new SingleFieldPartitioning(source.YearPartitioning);
        }
        if (source.MonthPartitioning != null) {
            this.MonthPartitioning = new SingleFieldPartitioning(source.MonthPartitioning);
        }
        if (source.DayPartitioning != null) {
            this.DayPartitioning = new SingleFieldPartitioning(source.DayPartitioning);
        }
        if (source.HourPartitioning != null) {
            this.HourPartitioning = new SingleFieldPartitioning(source.HourPartitioning);
        }
        if (source.IdentityPartitioning != null) {
            this.IdentityPartitioning = new SingleFieldPartitioning(source.IdentityPartitioning);
        }
        if (source.ListPartitioning != null) {
            this.ListPartitioning = new ListPartitioning(source.ListPartitioning);
        }
        if (source.RangePartitioning != null) {
            this.RangePartitioning = new RangePartitioning(source.RangePartitioning);
        }
        if (source.BucketPartitioning != null) {
            this.BucketPartitioning = new BucketPartitioning(source.BucketPartitioning);
        }
        if (source.TruncatePartitioning != null) {
            this.TruncatePartitioning = new TruncatePartitioning(source.TruncatePartitioning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamObj(map, prefix + "YearPartitioning.", this.YearPartitioning);
        this.setParamObj(map, prefix + "MonthPartitioning.", this.MonthPartitioning);
        this.setParamObj(map, prefix + "DayPartitioning.", this.DayPartitioning);
        this.setParamObj(map, prefix + "HourPartitioning.", this.HourPartitioning);
        this.setParamObj(map, prefix + "IdentityPartitioning.", this.IdentityPartitioning);
        this.setParamObj(map, prefix + "ListPartitioning.", this.ListPartitioning);
        this.setParamObj(map, prefix + "RangePartitioning.", this.RangePartitioning);
        this.setParamObj(map, prefix + "BucketPartitioning.", this.BucketPartitioning);
        this.setParamObj(map, prefix + "TruncatePartitioning.", this.TruncatePartitioning);

    }
}

