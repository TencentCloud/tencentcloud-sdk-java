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

public class DescribeTableQualityDetailsRequest extends AbstractModel{

    /**
    * 统计日期
    */
    @SerializedName("StatisticsDate")
    @Expose
    private Long StatisticsDate;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页序号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤参数TableName、DatabaseId 、DatabaseName、OwnerUserName
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序参数 排序方式 DESC 或者 ASC，表得分排序 TableScore
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

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
     * Get 统计日期 
     * @return StatisticsDate 统计日期
     */
    public Long getStatisticsDate() {
        return this.StatisticsDate;
    }

    /**
     * Set 统计日期
     * @param StatisticsDate 统计日期
     */
    public void setStatisticsDate(Long StatisticsDate) {
        this.StatisticsDate = StatisticsDate;
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
     * Get 分页序号 
     * @return PageNumber 分页序号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页序号
     * @param PageNumber 分页序号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤参数TableName、DatabaseId 、DatabaseName、OwnerUserName 
     * @return Filters 过滤参数TableName、DatabaseId 、DatabaseName、OwnerUserName
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数TableName、DatabaseId 、DatabaseName、OwnerUserName
     * @param Filters 过滤参数TableName、DatabaseId 、DatabaseName、OwnerUserName
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序参数 排序方式 DESC 或者 ASC，表得分排序 TableScore 
     * @return OrderFields 排序参数 排序方式 DESC 或者 ASC，表得分排序 TableScore
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序参数 排序方式 DESC 或者 ASC，表得分排序 TableScore
     * @param OrderFields 排序参数 排序方式 DESC 或者 ASC，表得分排序 TableScore
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
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

    public DescribeTableQualityDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableQualityDetailsRequest(DescribeTableQualityDetailsRequest source) {
        if (source.StatisticsDate != null) {
            this.StatisticsDate = new Long(source.StatisticsDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ScoreType != null) {
            this.ScoreType = new String(source.ScoreType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsDate", this.StatisticsDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ScoreType", this.ScoreType);

    }
}

