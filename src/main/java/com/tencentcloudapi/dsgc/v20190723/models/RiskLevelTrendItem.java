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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskLevelTrendItem extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 高风险数量
    */
    @SerializedName("High")
    @Expose
    private Long High;

    /**
    * 中风险数量
    */
    @SerializedName("Medium")
    @Expose
    private Long Medium;

    /**
    * 低风险数量
    */
    @SerializedName("Low")
    @Expose
    private Long Low;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 高风险数量 
     * @return High 高风险数量
     */
    public Long getHigh() {
        return this.High;
    }

    /**
     * Set 高风险数量
     * @param High 高风险数量
     */
    public void setHigh(Long High) {
        this.High = High;
    }

    /**
     * Get 中风险数量 
     * @return Medium 中风险数量
     */
    public Long getMedium() {
        return this.Medium;
    }

    /**
     * Set 中风险数量
     * @param Medium 中风险数量
     */
    public void setMedium(Long Medium) {
        this.Medium = Medium;
    }

    /**
     * Get 低风险数量 
     * @return Low 低风险数量
     */
    public Long getLow() {
        return this.Low;
    }

    /**
     * Set 低风险数量
     * @param Low 低风险数量
     */
    public void setLow(Long Low) {
        this.Low = Low;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public RiskLevelTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskLevelTrendItem(RiskLevelTrendItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.High != null) {
            this.High = new Long(source.High);
        }
        if (source.Medium != null) {
            this.Medium = new Long(source.Medium);
        }
        if (source.Low != null) {
            this.Low = new Long(source.Low);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "High", this.High);
        this.setParamSimple(map, prefix + "Medium", this.Medium);
        this.setParamSimple(map, prefix + "Low", this.Low);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

