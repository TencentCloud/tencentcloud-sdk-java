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

public class DescribeReportMissionListRequest extends AbstractModel {

    /**
    * 报表名 可模糊查询
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 报表类型 1:单次报表 2:周期报表 0全查
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 报表模板 1:综合分析报告 2:等保合规报告 0全查
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 任务状态0全查 1:生成中 2:待生成 3:已生成 4:生成失败 5:已暂停
    */
    @SerializedName("MissionStatus")
    @Expose
    private Long MissionStatus;

    /**
    * 排序字段 支持“NextStartTime” 与 “MissionStatus”
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * ‘desc' | 'asc'
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 限制条数
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
     * Get 报表名 可模糊查询 
     * @return TplName 报表名 可模糊查询
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 报表名 可模糊查询
     * @param TplName 报表名 可模糊查询
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 报表类型 1:单次报表 2:周期报表 0全查 
     * @return ReportType 报表类型 1:单次报表 2:周期报表 0全查
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报表类型 1:单次报表 2:周期报表 0全查
     * @param ReportType 报表类型 1:单次报表 2:周期报表 0全查
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 报表模板 1:综合分析报告 2:等保合规报告 0全查 
     * @return TemplateId 报表模板 1:综合分析报告 2:等保合规报告 0全查
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 报表模板 1:综合分析报告 2:等保合规报告 0全查
     * @param TemplateId 报表模板 1:综合分析报告 2:等保合规报告 0全查
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 任务状态0全查 1:生成中 2:待生成 3:已生成 4:生成失败 5:已暂停 
     * @return MissionStatus 任务状态0全查 1:生成中 2:待生成 3:已生成 4:生成失败 5:已暂停
     */
    public Long getMissionStatus() {
        return this.MissionStatus;
    }

    /**
     * Set 任务状态0全查 1:生成中 2:待生成 3:已生成 4:生成失败 5:已暂停
     * @param MissionStatus 任务状态0全查 1:生成中 2:待生成 3:已生成 4:生成失败 5:已暂停
     */
    public void setMissionStatus(Long MissionStatus) {
        this.MissionStatus = MissionStatus;
    }

    /**
     * Get 排序字段 支持“NextStartTime” 与 “MissionStatus” 
     * @return Field 排序字段 支持“NextStartTime” 与 “MissionStatus”
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段 支持“NextStartTime” 与 “MissionStatus”
     * @param Field 排序字段 支持“NextStartTime” 与 “MissionStatus”
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get ‘desc' | 'asc' 
     * @return Sort ‘desc' | 'asc'
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set ‘desc' | 'asc'
     * @param Sort ‘desc' | 'asc'
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
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

    public DescribeReportMissionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportMissionListRequest(DescribeReportMissionListRequest source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.MissionStatus != null) {
            this.MissionStatus = new Long(source.MissionStatus);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "MissionStatus", this.MissionStatus);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

