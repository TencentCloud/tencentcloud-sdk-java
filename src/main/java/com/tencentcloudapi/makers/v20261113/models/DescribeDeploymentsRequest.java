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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeploymentsRequest extends AbstractModel {

    /**
    * <p>Makers 站点 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>按部署 ID 查询</p>
    */
    @SerializedName("DeploymentIds")
    @Expose
    private String [] DeploymentIds;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private DeploymentFilter [] Filters;

    /**
    * <p>偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>CreatedOn 或 ModifiedOn</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Asc 或 Desc</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>Makers 站点 ID</p> 
     * @return ZoneId <p>Makers 站点 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Makers 站点 ID</p>
     * @param ZoneId <p>Makers 站点 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>项目 ID</p> 
     * @return ProjectId <p>项目 ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
     * @param ProjectId <p>项目 ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>按部署 ID 查询</p> 
     * @return DeploymentIds <p>按部署 ID 查询</p>
     */
    public String [] getDeploymentIds() {
        return this.DeploymentIds;
    }

    /**
     * Set <p>按部署 ID 查询</p>
     * @param DeploymentIds <p>按部署 ID 查询</p>
     */
    public void setDeploymentIds(String [] DeploymentIds) {
        this.DeploymentIds = DeploymentIds;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public DeploymentFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(DeploymentFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移</p> 
     * @return Offset <p>偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移</p>
     * @param Offset <p>偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，最大 100</p> 
     * @return Limit <p>每页数量，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，最大 100</p>
     * @param Limit <p>每页数量，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>CreatedOn 或 ModifiedOn</p> 
     * @return OrderBy <p>CreatedOn 或 ModifiedOn</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>CreatedOn 或 ModifiedOn</p>
     * @param OrderBy <p>CreatedOn 或 ModifiedOn</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Asc 或 Desc</p> 
     * @return OrderType <p>Asc 或 Desc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Asc 或 Desc</p>
     * @param OrderType <p>Asc 或 Desc</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDeploymentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeploymentsRequest(DescribeDeploymentsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeploymentIds != null) {
            this.DeploymentIds = new String[source.DeploymentIds.length];
            for (int i = 0; i < source.DeploymentIds.length; i++) {
                this.DeploymentIds[i] = new String(source.DeploymentIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new DeploymentFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DeploymentFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "DeploymentIds.", this.DeploymentIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

