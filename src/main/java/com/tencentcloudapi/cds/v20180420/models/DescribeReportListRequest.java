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
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 报告名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 报告类型
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 报告状态
    */
    @SerializedName("ReportStatus")
    @Expose
    private Long ReportStatus;

    /**
    * 报表模版id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 需要排序的字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 排序顺序 asc desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 报告名称 
     * @return Name 报告名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 报告名称
     * @param Name 报告名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 报告类型 
     * @return ReportType 报告类型
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型
     * @param ReportType 报告类型
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 报告状态 
     * @return ReportStatus 报告状态
     */
    public Long getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set 报告状态
     * @param ReportStatus 报告状态
     */
    public void setReportStatus(Long ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get 报表模版id 
     * @return TemplateId 报表模版id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 报表模版id
     * @param TemplateId 报表模版id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 需要排序的字段 
     * @return Field 需要排序的字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 需要排序的字段
     * @param Field 需要排序的字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 排序顺序 asc desc 
     * @return Sort 排序顺序 asc desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序顺序 asc desc
     * @param Sort 排序顺序 asc desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0 
     * @return CntDay 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
     */
    public Long getCntDay() {
        return this.CntDay;
    }

    /**
     * Set 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
     * @param CntDay 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
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

