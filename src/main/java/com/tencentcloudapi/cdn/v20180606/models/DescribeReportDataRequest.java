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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportDataRequest extends AbstractModel{

    /**
    * 查询起始时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 报表类型
daily：日报表
weekly：周报表（周一至周日）
monthly：月报表（自然月）
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * 域名加速区域
mainland：中国境内
overseas：中国境外
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据个数，默认1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按项目ID筛选
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
     * Get 查询起始时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天 
     * @return StartTime 查询起始时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     * @param StartTime 查询起始时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天 
     * @return EndTime 查询结束时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     * @param EndTime 查询结束时间：yyyy-MM-dd
当报表类型为daily，起始时间和结束时间必须为同一天
当报表类型为weekly，起始时间须为周一，结束时间须为同一周的周日
当报表类型为monthly，起始时间须为自然月第一天，即1号，结束时间须为该自然月最后一天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 报表类型
daily：日报表
weekly：周报表（周一至周日）
monthly：月报表（自然月） 
     * @return ReportType 报表类型
daily：日报表
weekly：周报表（周一至周日）
monthly：月报表（自然月）
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报表类型
daily：日报表
weekly：周报表（周一至周日）
monthly：月报表（自然月）
     * @param ReportType 报表类型
daily：日报表
weekly：周报表（周一至周日）
monthly：月报表（自然月）
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 域名加速区域
mainland：中国境内
overseas：中国境外 
     * @return Area 域名加速区域
mainland：中国境内
overseas：中国境外
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 域名加速区域
mainland：中国境内
overseas：中国境外
     * @param Area 域名加速区域
mainland：中国境内
overseas：中国境外
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据个数，默认1000。 
     * @return Limit 数据个数，默认1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据个数，默认1000。
     * @param Limit 数据个数，默认1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按项目ID筛选 
     * @return Project 按项目ID筛选
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set 按项目ID筛选
     * @param Project 按项目ID筛选
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    public DescribeReportDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportDataRequest(DescribeReportDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReportType != null) {
            this.ReportType = new String(source.ReportType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Project", this.Project);

    }
}

