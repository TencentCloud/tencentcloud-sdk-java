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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partitioning extends AbstractModel {

    /**
    * 转换策略
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 分桶策略参数
    */
    @SerializedName("NumBuckets")
    @Expose
    private Long NumBuckets;

    /**
    * 字段名称
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * 策略参数
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String [] FieldName;

    /**
    * 按年分区策略
    */
    @SerializedName("YearPartitioning")
    @Expose
    private SingleFieldPartitioning YearPartitioning;

    /**
    * 按月分区策略
    */
    @SerializedName("MonthPartitioning")
    @Expose
    private SingleFieldPartitioning MonthPartitioning;

    /**
    * 按天分区策略
    */
    @SerializedName("DayPartitioning")
    @Expose
    private SingleFieldPartitioning DayPartitioning;

    /**
    * 按小时分区策略
    */
    @SerializedName("HourPartitioning")
    @Expose
    private SingleFieldPartitioning HourPartitioning;

    /**
    * 按字段分区策略
    */
    @SerializedName("IdentityPartitioning")
    @Expose
    private SingleFieldPartitioning IdentityPartitioning;

    /**
    * 列表分区策略
    */
    @SerializedName("ListPartitioning")
    @Expose
    private ListPartitioning ListPartitioning;

    /**
    * 范围分区策略
    */
    @SerializedName("RangePartitioning")
    @Expose
    private RangePartitioning RangePartitioning;

    /**
    * 分桶分区策略
    */
    @SerializedName("BucketPartitioning")
    @Expose
    private BucketPartitioning BucketPartitioning;

    /**
    * 截断分区策略
    */
    @SerializedName("TruncatePartitioning")
    @Expose
    private TruncatePartitioning TruncatePartitioning;

    /**
     * Get 转换策略 
     * @return Strategy 转换策略
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 转换策略
     * @param Strategy 转换策略
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 分桶策略参数 
     * @return NumBuckets 分桶策略参数
     */
    public Long getNumBuckets() {
        return this.NumBuckets;
    }

    /**
     * Set 分桶策略参数
     * @param NumBuckets 分桶策略参数
     */
    public void setNumBuckets(Long NumBuckets) {
        this.NumBuckets = NumBuckets;
    }

    /**
     * Get 字段名称 
     * @return FieldNames 字段名称
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set 字段名称
     * @param FieldNames 字段名称
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get 策略参数 
     * @return Width 策略参数
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 策略参数
     * @param Width 策略参数
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 字段名称 
     * @return FieldName 字段名称
     */
    public String [] getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称
     * @param FieldName 字段名称
     */
    public void setFieldName(String [] FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 按年分区策略 
     * @return YearPartitioning 按年分区策略
     */
    public SingleFieldPartitioning getYearPartitioning() {
        return this.YearPartitioning;
    }

    /**
     * Set 按年分区策略
     * @param YearPartitioning 按年分区策略
     */
    public void setYearPartitioning(SingleFieldPartitioning YearPartitioning) {
        this.YearPartitioning = YearPartitioning;
    }

    /**
     * Get 按月分区策略 
     * @return MonthPartitioning 按月分区策略
     */
    public SingleFieldPartitioning getMonthPartitioning() {
        return this.MonthPartitioning;
    }

    /**
     * Set 按月分区策略
     * @param MonthPartitioning 按月分区策略
     */
    public void setMonthPartitioning(SingleFieldPartitioning MonthPartitioning) {
        this.MonthPartitioning = MonthPartitioning;
    }

    /**
     * Get 按天分区策略 
     * @return DayPartitioning 按天分区策略
     */
    public SingleFieldPartitioning getDayPartitioning() {
        return this.DayPartitioning;
    }

    /**
     * Set 按天分区策略
     * @param DayPartitioning 按天分区策略
     */
    public void setDayPartitioning(SingleFieldPartitioning DayPartitioning) {
        this.DayPartitioning = DayPartitioning;
    }

    /**
     * Get 按小时分区策略 
     * @return HourPartitioning 按小时分区策略
     */
    public SingleFieldPartitioning getHourPartitioning() {
        return this.HourPartitioning;
    }

    /**
     * Set 按小时分区策略
     * @param HourPartitioning 按小时分区策略
     */
    public void setHourPartitioning(SingleFieldPartitioning HourPartitioning) {
        this.HourPartitioning = HourPartitioning;
    }

    /**
     * Get 按字段分区策略 
     * @return IdentityPartitioning 按字段分区策略
     */
    public SingleFieldPartitioning getIdentityPartitioning() {
        return this.IdentityPartitioning;
    }

    /**
     * Set 按字段分区策略
     * @param IdentityPartitioning 按字段分区策略
     */
    public void setIdentityPartitioning(SingleFieldPartitioning IdentityPartitioning) {
        this.IdentityPartitioning = IdentityPartitioning;
    }

    /**
     * Get 列表分区策略 
     * @return ListPartitioning 列表分区策略
     */
    public ListPartitioning getListPartitioning() {
        return this.ListPartitioning;
    }

    /**
     * Set 列表分区策略
     * @param ListPartitioning 列表分区策略
     */
    public void setListPartitioning(ListPartitioning ListPartitioning) {
        this.ListPartitioning = ListPartitioning;
    }

    /**
     * Get 范围分区策略 
     * @return RangePartitioning 范围分区策略
     */
    public RangePartitioning getRangePartitioning() {
        return this.RangePartitioning;
    }

    /**
     * Set 范围分区策略
     * @param RangePartitioning 范围分区策略
     */
    public void setRangePartitioning(RangePartitioning RangePartitioning) {
        this.RangePartitioning = RangePartitioning;
    }

    /**
     * Get 分桶分区策略 
     * @return BucketPartitioning 分桶分区策略
     */
    public BucketPartitioning getBucketPartitioning() {
        return this.BucketPartitioning;
    }

    /**
     * Set 分桶分区策略
     * @param BucketPartitioning 分桶分区策略
     */
    public void setBucketPartitioning(BucketPartitioning BucketPartitioning) {
        this.BucketPartitioning = BucketPartitioning;
    }

    /**
     * Get 截断分区策略 
     * @return TruncatePartitioning 截断分区策略
     */
    public TruncatePartitioning getTruncatePartitioning() {
        return this.TruncatePartitioning;
    }

    /**
     * Set 截断分区策略
     * @param TruncatePartitioning 截断分区策略
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
        if (source.NumBuckets != null) {
            this.NumBuckets = new Long(source.NumBuckets);
        }
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.FieldName != null) {
            this.FieldName = new String[source.FieldName.length];
            for (int i = 0; i < source.FieldName.length; i++) {
                this.FieldName[i] = new String(source.FieldName[i]);
            }
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
        this.setParamSimple(map, prefix + "NumBuckets", this.NumBuckets);
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamArraySimple(map, prefix + "FieldName.", this.FieldName);
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

