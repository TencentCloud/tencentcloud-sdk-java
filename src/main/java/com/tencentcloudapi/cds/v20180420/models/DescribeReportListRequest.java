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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportListRequest extends AbstractModel {

    /**
    * <p>限制数目</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>报告名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>报告类型</p>
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * <p>报告状态</p>
    */
    @SerializedName("ReportStatus")
    @Expose
    private Long ReportStatus;

    /**
    * <p>报表模板id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>需要排序的字段</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>排序顺序 asc desc</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
     * Get <p>限制数目</p> 
     * @return Limit <p>限制数目</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目</p>
     * @param Limit <p>限制数目</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>报告名称</p> 
     * @return Name <p>报告名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>报告名称</p>
     * @param Name <p>报告名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>报告类型</p> 
     * @return ReportType <p>报告类型</p>
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set <p>报告类型</p>
     * @param ReportType <p>报告类型</p>
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get <p>报告状态</p> 
     * @return ReportStatus <p>报告状态</p>
     */
    public Long getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set <p>报告状态</p>
     * @param ReportStatus <p>报告状态</p>
     */
    public void setReportStatus(Long ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get <p>报表模板id</p> 
     * @return TemplateId <p>报表模板id</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>报表模板id</p>
     * @param TemplateId <p>报表模板id</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>需要排序的字段</p> 
     * @return Field <p>需要排序的字段</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>需要排序的字段</p>
     * @param Field <p>需要排序的字段</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>排序顺序 asc desc</p> 
     * @return Sort <p>排序顺序 asc desc</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序顺序 asc desc</p>
     * @param Sort <p>排序顺序 asc desc</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p> 
     * @return CntDay <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     */
    public Long getCntDay() {
        return this.CntDay;
    }

    /**
     * Set <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     * @param CntDay <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     */
    public void setCntDay(Long CntDay) {
        this.CntDay = CntDay;
    }

    public DescribeReportListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportListRequest(DescribeReportListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new Long(source.ReportStatus);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.CntDay != null) {
            this.CntDay = new Long(source.CntDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "CntDay", this.CntDay);

    }
}

