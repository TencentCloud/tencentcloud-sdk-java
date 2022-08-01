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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlertRecordsRequest extends AbstractModel{

    /**
    * 项目 ID 列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 场景 ID 列表
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * 任务 ID 列表
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * 是否正序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * 排序项
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按场景名筛选
    */
    @SerializedName("ScenarioNames")
    @Expose
    private String [] ScenarioNames;

    /**
     * Get 项目 ID 列表 
     * @return ProjectIds 项目 ID 列表
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 ID 列表
     * @param ProjectIds 项目 ID 列表
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 场景 ID 列表 
     * @return ScenarioIds 场景 ID 列表
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set 场景 ID 列表
     * @param ScenarioIds 场景 ID 列表
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    /**
     * Get 任务 ID 列表 
     * @return JobIds 任务 ID 列表
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 任务 ID 列表
     * @param JobIds 任务 ID 列表
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get 是否正序 
     * @return Ascend 是否正序
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set 是否正序
     * @param Ascend 是否正序
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get 排序项 
     * @return OrderBy 排序项
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序项
     * @param OrderBy 排序项
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大为100 
     * @return Limit 返回数量，默认为20，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大为100
     * @param Limit 返回数量，默认为20，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按场景名筛选 
     * @return ScenarioNames 按场景名筛选
     */
    public String [] getScenarioNames() {
        return this.ScenarioNames;
    }

    /**
     * Set 按场景名筛选
     * @param ScenarioNames 按场景名筛选
     */
    public void setScenarioNames(String [] ScenarioNames) {
        this.ScenarioNames = ScenarioNames;
    }

    public DescribeAlertRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertRecordsRequest(DescribeAlertRecordsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScenarioNames != null) {
            this.ScenarioNames = new String[source.ScenarioNames.length];
            for (int i = 0; i < source.ScenarioNames.length; i++) {
                this.ScenarioNames[i] = new String(source.ScenarioNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ScenarioNames.", this.ScenarioNames);

    }
}

