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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityScoreTrendRequest extends AbstractModel{

    /**
    * 统计开始日期
    */
    @SerializedName("StatisticsStartDate")
    @Expose
    private Long StatisticsStartDate;

    /**
    * 统计结束日期
    */
    @SerializedName("StatisticsEndDate")
    @Expose
    private Long StatisticsEndDate;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据来源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 1:按全维度权重计算,2:按已配置维度权重计算,3:不按维度权重计算,默认1
    */
    @SerializedName("ScoreType")
    @Expose
    private String ScoreType;

    /**
    * 过滤参数
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 统计开始日期 
     * @return StatisticsStartDate 统计开始日期
     */
    public Long getStatisticsStartDate() {
        return this.StatisticsStartDate;
    }

    /**
     * Set 统计开始日期
     * @param StatisticsStartDate 统计开始日期
     */
    public void setStatisticsStartDate(Long StatisticsStartDate) {
        this.StatisticsStartDate = StatisticsStartDate;
    }

    /**
     * Get 统计结束日期 
     * @return StatisticsEndDate 统计结束日期
     */
    public Long getStatisticsEndDate() {
        return this.StatisticsEndDate;
    }

    /**
     * Set 统计结束日期
     * @param StatisticsEndDate 统计结束日期
     */
    public void setStatisticsEndDate(Long StatisticsEndDate) {
        this.StatisticsEndDate = StatisticsEndDate;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据来源id 
     * @return DatasourceId 数据来源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据来源id
     * @param DatasourceId 数据来源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 1:按全维度权重计算,2:按已配置维度权重计算,3:不按维度权重计算,默认1 
     * @return ScoreType 1:按全维度权重计算,2:按已配置维度权重计算,3:不按维度权重计算,默认1
     */
    public String getScoreType() {
        return this.ScoreType;
    }

    /**
     * Set 1:按全维度权重计算,2:按已配置维度权重计算,3:不按维度权重计算,默认1
     * @param ScoreType 1:按全维度权重计算,2:按已配置维度权重计算,3:不按维度权重计算,默认1
     */
    public void setScoreType(String ScoreType) {
        this.ScoreType = ScoreType;
    }

    /**
     * Get 过滤参数 
     * @return Filters 过滤参数
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数
     * @param Filters 过滤参数
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeQualityScoreTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityScoreTrendRequest(DescribeQualityScoreTrendRequest source) {
        if (source.StatisticsStartDate != null) {
            this.StatisticsStartDate = new Long(source.StatisticsStartDate);
        }
        if (source.StatisticsEndDate != null) {
            this.StatisticsEndDate = new Long(source.StatisticsEndDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ScoreType != null) {
            this.ScoreType = new String(source.ScoreType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsStartDate", this.StatisticsStartDate);
        this.setParamSimple(map, prefix + "StatisticsEndDate", this.StatisticsEndDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ScoreType", this.ScoreType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

