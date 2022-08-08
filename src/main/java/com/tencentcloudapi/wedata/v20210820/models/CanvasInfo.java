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

public class CanvasInfo extends AbstractModel{

    /**
    * 画布任务信息
    */
    @SerializedName("TasksList")
    @Expose
    private TaskCanvasInfo [] TasksList;

    /**
    * 画布任务链接信息
    */
    @SerializedName("LinksList")
    @Expose
    private TaskLinkInfo [] LinksList;

    /**
     * Get 画布任务信息 
     * @return TasksList 画布任务信息
     */
    public TaskCanvasInfo [] getTasksList() {
        return this.TasksList;
    }

    /**
     * Set 画布任务信息
     * @param TasksList 画布任务信息
     */
    public void setTasksList(TaskCanvasInfo [] TasksList) {
        this.TasksList = TasksList;
    }

    /**
     * Get 画布任务链接信息 
     * @return LinksList 画布任务链接信息
     */
    public TaskLinkInfo [] getLinksList() {
        return this.LinksList;
    }

    /**
     * Set 画布任务链接信息
     * @param LinksList 画布任务链接信息
     */
    public void setLinksList(TaskLinkInfo [] LinksList) {
        this.LinksList = LinksList;
    }

    public CanvasInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CanvasInfo(CanvasInfo source) {
        if (source.TasksList != null) {
            this.TasksList = new TaskCanvasInfo[source.TasksList.length];
            for (int i = 0; i < source.TasksList.length; i++) {
                this.TasksList[i] = new TaskCanvasInfo(source.TasksList[i]);
            }
        }
        if (source.LinksList != null) {
            this.LinksList = new TaskLinkInfo[source.LinksList.length];
            for (int i = 0; i < source.LinksList.length; i++) {
                this.LinksList[i] = new TaskLinkInfo(source.LinksList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TasksList.", this.TasksList);
        this.setParamArrayObj(map, prefix + "LinksList.", this.LinksList);

    }
}

