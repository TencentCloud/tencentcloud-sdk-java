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

public class DoHealthCheckOnMigratingTopicRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 是否忽略当前检查
    */
    @SerializedName("IgnoreCheck")
    @Expose
    private Boolean IgnoreCheck;

    /**
    * 命名空间，仅4.x集群有效
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

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
     * Get 主题名称 
     * @return TopicName 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称
     * @param TopicName 主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 是否忽略当前检查 
     * @return IgnoreCheck 是否忽略当前检查
     */
    public Boolean getIgnoreCheck() {
        return this.IgnoreCheck;
    }

    /**
     * Set 是否忽略当前检查
     * @param IgnoreCheck 是否忽略当前检查
     */
    public void setIgnoreCheck(Boolean IgnoreCheck) {
        this.IgnoreCheck = IgnoreCheck;
    }

    /**
     * Get 命名空间，仅4.x集群有效 
     * @return Namespace 命名空间，仅4.x集群有效
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，仅4.x集群有效
     * @param Namespace 命名空间，仅4.x集群有效
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DoHealthCheckOnMigratingTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoHealthCheckOnMigratingTopicRequest(DoHealthCheckOnMigratingTopicRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.IgnoreCheck != null) {
            this.IgnoreCheck = new Boolean(source.IgnoreCheck);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "IgnoreCheck", this.IgnoreCheck);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

