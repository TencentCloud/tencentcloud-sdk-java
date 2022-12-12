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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFinancialDataUrlRequest extends AbstractModel{

    /**
    * 数据查询范围:结束时间 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据查询范围:开始时间 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 数据类型：ADDED_INVOICE_REPORT  增值税开票数据，NATURAL_FINANCE_REPORT 自然人金融数据,
NATURAL_FINANCE_REPORT_BY_TIME 按次报税数据导出,
NATURAL_FINANCE_REPORT_STAT_BY_DAY 按日累计报税数据导出
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get 数据查询范围:结束时间 yyyy-MM-dd HH:mm:ss 
     * @return EndTime 数据查询范围:结束时间 yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 数据查询范围:结束时间 yyyy-MM-dd HH:mm:ss
     * @param EndTime 数据查询范围:结束时间 yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据查询范围:开始时间 yyyy-MM-dd HH:mm:ss 
     * @return StartTime 数据查询范围:开始时间 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 数据查询范围:开始时间 yyyy-MM-dd HH:mm:ss
     * @param StartTime 数据查询范围:开始时间 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 数据类型：ADDED_INVOICE_REPORT  增值税开票数据，NATURAL_FINANCE_REPORT 自然人金融数据,
NATURAL_FINANCE_REPORT_BY_TIME 按次报税数据导出,
NATURAL_FINANCE_REPORT_STAT_BY_DAY 按日累计报税数据导出 
     * @return DataType 数据类型：ADDED_INVOICE_REPORT  增值税开票数据，NATURAL_FINANCE_REPORT 自然人金融数据,
NATURAL_FINANCE_REPORT_BY_TIME 按次报税数据导出,
NATURAL_FINANCE_REPORT_STAT_BY_DAY 按日累计报税数据导出
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型：ADDED_INVOICE_REPORT  增值税开票数据，NATURAL_FINANCE_REPORT 自然人金融数据,
NATURAL_FINANCE_REPORT_BY_TIME 按次报税数据导出,
NATURAL_FINANCE_REPORT_STAT_BY_DAY 按日累计报税数据导出
     * @param DataType 数据类型：ADDED_INVOICE_REPORT  增值税开票数据，NATURAL_FINANCE_REPORT 自然人金融数据,
NATURAL_FINANCE_REPORT_BY_TIME 按次报税数据导出,
NATURAL_FINANCE_REPORT_STAT_BY_DAY 按日累计报税数据导出
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    public QueryFinancialDataUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFinancialDataUrlRequest(QueryFinancialDataUrlRequest source) {
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

