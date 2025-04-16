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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeMigratingTopicToNextStageRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主题名称列表
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
    * 命名空间列表，仅4.x集群有效，与TopicNameList一一对应
    */
    @SerializedName("NamespaceList")
    @Expose
    private String [] NamespaceList;

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
     * Get 主题名称列表 
     * @return TopicNameList 主题名称列表
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set 主题名称列表
     * @param TopicNameList 主题名称列表
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    /**
     * Get 命名空间列表，仅4.x集群有效，与TopicNameList一一对应 
     * @return NamespaceList 命名空间列表，仅4.x集群有效，与TopicNameList一一对应
     */
    public String [] getNamespaceList() {
        return this.NamespaceList;
    }

    /**
     * Set 命名空间列表，仅4.x集群有效，与TopicNameList一一对应
     * @param NamespaceList 命名空间列表，仅4.x集群有效，与TopicNameList一一对应
     */
    public void setNamespaceList(String [] NamespaceList) {
        this.NamespaceList = NamespaceList;
    }

    public ChangeMigratingTopicToNextStageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeMigratingTopicToNextStageRequest(ChangeMigratingTopicToNextStageRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
        if (source.NamespaceList != null) {
            this.NamespaceList = new String[source.NamespaceList.length];
            for (int i = 0; i < source.NamespaceList.length; i++) {
                this.NamespaceList[i] = new String(source.NamespaceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);
        this.setParamArraySimple(map, prefix + "NamespaceList.", this.NamespaceList);

    }
}

