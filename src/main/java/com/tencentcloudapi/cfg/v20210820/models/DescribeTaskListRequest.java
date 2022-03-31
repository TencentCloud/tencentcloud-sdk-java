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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskListRequest extends AbstractModel{

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 演练名称
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 标签键
    */
    @SerializedName("TaskTag")
    @Expose
    private String [] TaskTag;

    /**
    * 状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 开始时间，固定格式%Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * 结束时间，固定格式%Y-%m-%d %H:%M:%S
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * 标签对
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 演练名称 
     * @return TaskTitle 演练名称
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 演练名称
     * @param TaskTitle 演练名称
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 标签键 
     * @return TaskTag 标签键
     */
    public String [] getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set 标签键
     * @param TaskTag 标签键
     */
    public void setTaskTag(String [] TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get 状态 
     * @return TaskStatus 状态
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 状态
     * @param TaskStatus 状态
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 开始时间，固定格式%Y-%m-%d %H:%M:%S 
     * @return TaskStartTime 开始时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set 开始时间，固定格式%Y-%m-%d %H:%M:%S
     * @param TaskStartTime 开始时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get 结束时间，固定格式%Y-%m-%d %H:%M:%S 
     * @return TaskEndTime 结束时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set 结束时间，固定格式%Y-%m-%d %H:%M:%S
     * @param TaskEndTime 结束时间，固定格式%Y-%m-%d %H:%M:%S
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get 标签对 
     * @return Tags 标签对
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签对
     * @param Tags 标签对
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String[source.TaskTag.length];
            for (int i = 0; i < source.TaskTag.length; i++) {
                this.TaskTag[i] = new String(source.TaskTag[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamArraySimple(map, prefix + "TaskTag.", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

