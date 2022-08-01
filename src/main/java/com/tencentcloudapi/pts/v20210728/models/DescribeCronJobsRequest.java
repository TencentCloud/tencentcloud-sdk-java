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

public class DescribeCronJobsRequest extends AbstractModel{

    /**
    * 项目ID数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 定时任务ID数组
    */
    @SerializedName("CronJobIds")
    @Expose
    private String [] CronJobIds;

    /**
    * 定时任务名字，模糊查询
    */
    @SerializedName("CronJobName")
    @Expose
    private String CronJobName;

    /**
    * 定时任务状态数组
    */
    @SerializedName("CronJobStatus")
    @Expose
    private Long [] CronJobStatus;

    /**
    * 排序的列
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 是否正序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
     * Get 项目ID数组 
     * @return ProjectIds 项目ID数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组
     * @param ProjectIds 项目ID数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 定时任务ID数组 
     * @return CronJobIds 定时任务ID数组
     */
    public String [] getCronJobIds() {
        return this.CronJobIds;
    }

    /**
     * Set 定时任务ID数组
     * @param CronJobIds 定时任务ID数组
     */
    public void setCronJobIds(String [] CronJobIds) {
        this.CronJobIds = CronJobIds;
    }

    /**
     * Get 定时任务名字，模糊查询 
     * @return CronJobName 定时任务名字，模糊查询
     */
    public String getCronJobName() {
        return this.CronJobName;
    }

    /**
     * Set 定时任务名字，模糊查询
     * @param CronJobName 定时任务名字，模糊查询
     */
    public void setCronJobName(String CronJobName) {
        this.CronJobName = CronJobName;
    }

    /**
     * Get 定时任务状态数组 
     * @return CronJobStatus 定时任务状态数组
     */
    public Long [] getCronJobStatus() {
        return this.CronJobStatus;
    }

    /**
     * Set 定时任务状态数组
     * @param CronJobStatus 定时任务状态数组
     */
    public void setCronJobStatus(Long [] CronJobStatus) {
        this.CronJobStatus = CronJobStatus;
    }

    /**
     * Get 排序的列 
     * @return OrderBy 排序的列
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序的列
     * @param OrderBy 排序的列
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
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

    public DescribeCronJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCronJobsRequest(DescribeCronJobsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CronJobIds != null) {
            this.CronJobIds = new String[source.CronJobIds.length];
            for (int i = 0; i < source.CronJobIds.length; i++) {
                this.CronJobIds[i] = new String(source.CronJobIds[i]);
            }
        }
        if (source.CronJobName != null) {
            this.CronJobName = new String(source.CronJobName);
        }
        if (source.CronJobStatus != null) {
            this.CronJobStatus = new Long[source.CronJobStatus.length];
            for (int i = 0; i < source.CronJobStatus.length; i++) {
                this.CronJobStatus[i] = new Long(source.CronJobStatus[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "CronJobIds.", this.CronJobIds);
        this.setParamSimple(map, prefix + "CronJobName", this.CronJobName);
        this.setParamArraySimple(map, prefix + "CronJobStatus.", this.CronJobStatus);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);

    }
}

