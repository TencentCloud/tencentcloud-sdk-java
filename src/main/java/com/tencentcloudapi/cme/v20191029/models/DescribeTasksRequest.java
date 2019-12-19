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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型集合，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：视频编辑项目导出。</li>
    */
    @SerializedName("TaskTypeSet")
    @Expose
    private String [] TaskTypeSet;

    /**
    * 任务状态集合，取值有：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
    */
    @SerializedName("StatusSet")
    @Expose
    private String [] StatusSet;

    /**
    * 分页返回的起始偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务类型集合，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：视频编辑项目导出。</li> 
     * @return TaskTypeSet 任务类型集合，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：视频编辑项目导出。</li>
     */
    public String [] getTaskTypeSet() {
        return this.TaskTypeSet;
    }

    /**
     * Set 任务类型集合，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：视频编辑项目导出。</li>
     * @param TaskTypeSet 任务类型集合，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：视频编辑项目导出。</li>
     */
    public void setTaskTypeSet(String [] TaskTypeSet) {
        this.TaskTypeSet = TaskTypeSet;
    }

    /**
     * Get 任务状态集合，取值有：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li> 
     * @return StatusSet 任务状态集合，取值有：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public String [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 任务状态集合，取值有：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     * @param StatusSet 任务状态集合，取值有：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public void setStatusSet(String [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。 
     * @return Offset 分页返回的起始偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。
     * @param Offset 分页返回的起始偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：10。 
     * @return Limit 分页返回的记录条数，默认值：10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：10。
     * @param Limit 分页返回的记录条数，默认值：10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskTypeSet.", this.TaskTypeSet);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

