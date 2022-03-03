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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFilter extends AbstractModel{

    /**
    * 媒资文件类型
    */
    @SerializedName("MediaTypeSet")
    @Expose
    private Long [] MediaTypeSet;

    /**
    * 待筛选的任务状态列表
    */
    @SerializedName("TaskStatusSet")
    @Expose
    private Long [] TaskStatusSet;

    /**
    * 待筛选的任务名称数组
    */
    @SerializedName("TaskNameSet")
    @Expose
    private String [] TaskNameSet;

    /**
    * TaskId数组
    */
    @SerializedName("TaskIdSet")
    @Expose
    private String [] TaskIdSet;

    /**
    * 媒资文件名数组
    */
    @SerializedName("MediaNameSet")
    @Expose
    private String [] MediaNameSet;

    /**
    * 媒资语言类型
    */
    @SerializedName("MediaLangSet")
    @Expose
    private Long [] MediaLangSet;

    /**
    * 媒资素材一级类型
    */
    @SerializedName("MediaLabelSet")
    @Expose
    private Long [] MediaLabelSet;

    /**
    * 媒资自定义标签数组
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get 媒资文件类型 
     * @return MediaTypeSet 媒资文件类型
     */
    public Long [] getMediaTypeSet() {
        return this.MediaTypeSet;
    }

    /**
     * Set 媒资文件类型
     * @param MediaTypeSet 媒资文件类型
     */
    public void setMediaTypeSet(Long [] MediaTypeSet) {
        this.MediaTypeSet = MediaTypeSet;
    }

    /**
     * Get 待筛选的任务状态列表 
     * @return TaskStatusSet 待筛选的任务状态列表
     */
    public Long [] getTaskStatusSet() {
        return this.TaskStatusSet;
    }

    /**
     * Set 待筛选的任务状态列表
     * @param TaskStatusSet 待筛选的任务状态列表
     */
    public void setTaskStatusSet(Long [] TaskStatusSet) {
        this.TaskStatusSet = TaskStatusSet;
    }

    /**
     * Get 待筛选的任务名称数组 
     * @return TaskNameSet 待筛选的任务名称数组
     */
    public String [] getTaskNameSet() {
        return this.TaskNameSet;
    }

    /**
     * Set 待筛选的任务名称数组
     * @param TaskNameSet 待筛选的任务名称数组
     */
    public void setTaskNameSet(String [] TaskNameSet) {
        this.TaskNameSet = TaskNameSet;
    }

    /**
     * Get TaskId数组 
     * @return TaskIdSet TaskId数组
     */
    public String [] getTaskIdSet() {
        return this.TaskIdSet;
    }

    /**
     * Set TaskId数组
     * @param TaskIdSet TaskId数组
     */
    public void setTaskIdSet(String [] TaskIdSet) {
        this.TaskIdSet = TaskIdSet;
    }

    /**
     * Get 媒资文件名数组 
     * @return MediaNameSet 媒资文件名数组
     */
    public String [] getMediaNameSet() {
        return this.MediaNameSet;
    }

    /**
     * Set 媒资文件名数组
     * @param MediaNameSet 媒资文件名数组
     */
    public void setMediaNameSet(String [] MediaNameSet) {
        this.MediaNameSet = MediaNameSet;
    }

    /**
     * Get 媒资语言类型 
     * @return MediaLangSet 媒资语言类型
     */
    public Long [] getMediaLangSet() {
        return this.MediaLangSet;
    }

    /**
     * Set 媒资语言类型
     * @param MediaLangSet 媒资语言类型
     */
    public void setMediaLangSet(Long [] MediaLangSet) {
        this.MediaLangSet = MediaLangSet;
    }

    /**
     * Get 媒资素材一级类型 
     * @return MediaLabelSet 媒资素材一级类型
     */
    public Long [] getMediaLabelSet() {
        return this.MediaLabelSet;
    }

    /**
     * Set 媒资素材一级类型
     * @param MediaLabelSet 媒资素材一级类型
     */
    public void setMediaLabelSet(Long [] MediaLabelSet) {
        this.MediaLabelSet = MediaLabelSet;
    }

    /**
     * Get 媒资自定义标签数组 
     * @return LabelSet 媒资自定义标签数组
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set 媒资自定义标签数组
     * @param LabelSet 媒资自定义标签数组
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    public TaskFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFilter(TaskFilter source) {
        if (source.MediaTypeSet != null) {
            this.MediaTypeSet = new Long[source.MediaTypeSet.length];
            for (int i = 0; i < source.MediaTypeSet.length; i++) {
                this.MediaTypeSet[i] = new Long(source.MediaTypeSet[i]);
            }
        }
        if (source.TaskStatusSet != null) {
            this.TaskStatusSet = new Long[source.TaskStatusSet.length];
            for (int i = 0; i < source.TaskStatusSet.length; i++) {
                this.TaskStatusSet[i] = new Long(source.TaskStatusSet[i]);
            }
        }
        if (source.TaskNameSet != null) {
            this.TaskNameSet = new String[source.TaskNameSet.length];
            for (int i = 0; i < source.TaskNameSet.length; i++) {
                this.TaskNameSet[i] = new String(source.TaskNameSet[i]);
            }
        }
        if (source.TaskIdSet != null) {
            this.TaskIdSet = new String[source.TaskIdSet.length];
            for (int i = 0; i < source.TaskIdSet.length; i++) {
                this.TaskIdSet[i] = new String(source.TaskIdSet[i]);
            }
        }
        if (source.MediaNameSet != null) {
            this.MediaNameSet = new String[source.MediaNameSet.length];
            for (int i = 0; i < source.MediaNameSet.length; i++) {
                this.MediaNameSet[i] = new String(source.MediaNameSet[i]);
            }
        }
        if (source.MediaLangSet != null) {
            this.MediaLangSet = new Long[source.MediaLangSet.length];
            for (int i = 0; i < source.MediaLangSet.length; i++) {
                this.MediaLangSet[i] = new Long(source.MediaLangSet[i]);
            }
        }
        if (source.MediaLabelSet != null) {
            this.MediaLabelSet = new Long[source.MediaLabelSet.length];
            for (int i = 0; i < source.MediaLabelSet.length; i++) {
                this.MediaLabelSet[i] = new Long(source.MediaLabelSet[i]);
            }
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MediaTypeSet.", this.MediaTypeSet);
        this.setParamArraySimple(map, prefix + "TaskStatusSet.", this.TaskStatusSet);
        this.setParamArraySimple(map, prefix + "TaskNameSet.", this.TaskNameSet);
        this.setParamArraySimple(map, prefix + "TaskIdSet.", this.TaskIdSet);
        this.setParamArraySimple(map, prefix + "MediaNameSet.", this.MediaNameSet);
        this.setParamArraySimple(map, prefix + "MediaLangSet.", this.MediaLangSet);
        this.setParamArraySimple(map, prefix + "MediaLabelSet.", this.MediaLabelSet);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

