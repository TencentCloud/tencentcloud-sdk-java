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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDetailInfoRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 实例的第几次执行
    */
    @SerializedName("LifeRound")
    @Expose
    private Long LifeRound;

    /**
    * 生命周期查询起始index
    */
    @SerializedName("LifeRoundStartIndex")
    @Expose
    private Long LifeRoundStartIndex;

    /**
    * 生命周期查询批次数量
    */
    @SerializedName("LifeRoundSize")
    @Expose
    private Long LifeRoundSize;

    /**
    * 生命周期总数，可省略
    */
    @SerializedName("TotalLifeRound")
    @Expose
    private String TotalLifeRound;

    /**
    * 动态加载日志标识
    */
    @SerializedName("Dynamic")
    @Expose
    private Boolean Dynamic;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例数据时间 
     * @return CurRunDate 实例数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 实例数据时间
     * @param CurRunDate 实例数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
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
     * Get 实例的第几次执行 
     * @return LifeRound 实例的第几次执行
     */
    public Long getLifeRound() {
        return this.LifeRound;
    }

    /**
     * Set 实例的第几次执行
     * @param LifeRound 实例的第几次执行
     */
    public void setLifeRound(Long LifeRound) {
        this.LifeRound = LifeRound;
    }

    /**
     * Get 生命周期查询起始index 
     * @return LifeRoundStartIndex 生命周期查询起始index
     */
    public Long getLifeRoundStartIndex() {
        return this.LifeRoundStartIndex;
    }

    /**
     * Set 生命周期查询起始index
     * @param LifeRoundStartIndex 生命周期查询起始index
     */
    public void setLifeRoundStartIndex(Long LifeRoundStartIndex) {
        this.LifeRoundStartIndex = LifeRoundStartIndex;
    }

    /**
     * Get 生命周期查询批次数量 
     * @return LifeRoundSize 生命周期查询批次数量
     */
    public Long getLifeRoundSize() {
        return this.LifeRoundSize;
    }

    /**
     * Set 生命周期查询批次数量
     * @param LifeRoundSize 生命周期查询批次数量
     */
    public void setLifeRoundSize(Long LifeRoundSize) {
        this.LifeRoundSize = LifeRoundSize;
    }

    /**
     * Get 生命周期总数，可省略 
     * @return TotalLifeRound 生命周期总数，可省略
     */
    public String getTotalLifeRound() {
        return this.TotalLifeRound;
    }

    /**
     * Set 生命周期总数，可省略
     * @param TotalLifeRound 生命周期总数，可省略
     */
    public void setTotalLifeRound(String TotalLifeRound) {
        this.TotalLifeRound = TotalLifeRound;
    }

    /**
     * Get 动态加载日志标识 
     * @return Dynamic 动态加载日志标识
     */
    public Boolean getDynamic() {
        return this.Dynamic;
    }

    /**
     * Set 动态加载日志标识
     * @param Dynamic 动态加载日志标识
     */
    public void setDynamic(Boolean Dynamic) {
        this.Dynamic = Dynamic;
    }

    public DescribeInstanceDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceDetailInfoRequest(DescribeInstanceDetailInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.LifeRound != null) {
            this.LifeRound = new Long(source.LifeRound);
        }
        if (source.LifeRoundStartIndex != null) {
            this.LifeRoundStartIndex = new Long(source.LifeRoundStartIndex);
        }
        if (source.LifeRoundSize != null) {
            this.LifeRoundSize = new Long(source.LifeRoundSize);
        }
        if (source.TotalLifeRound != null) {
            this.TotalLifeRound = new String(source.TotalLifeRound);
        }
        if (source.Dynamic != null) {
            this.Dynamic = new Boolean(source.Dynamic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LifeRound", this.LifeRound);
        this.setParamSimple(map, prefix + "LifeRoundStartIndex", this.LifeRoundStartIndex);
        this.setParamSimple(map, prefix + "LifeRoundSize", this.LifeRoundSize);
        this.setParamSimple(map, prefix + "TotalLifeRound", this.TotalLifeRound);
        this.setParamSimple(map, prefix + "Dynamic", this.Dynamic);

    }
}

