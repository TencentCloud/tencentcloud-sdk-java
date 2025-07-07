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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskTemplateRequest extends AbstractModel {

    /**
    * 任务模板名称，最大长度限制60个字符。
    */
    @SerializedName("TaskTemplateName")
    @Expose
    private String TaskTemplateName;

    /**
    * 任务模板内容，参数要求与任务一致
    */
    @SerializedName("TaskTemplateInfo")
    @Expose
    private Task TaskTemplateInfo;

    /**
    * 任务模板描述，最大长度限制200个字符。
    */
    @SerializedName("TaskTemplateDescription")
    @Expose
    private String TaskTemplateDescription;

    /**
    * 标签列表。通过指定该参数可以支持绑定标签到任务模板。每个任务模板最多绑定10个标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 任务模板名称，最大长度限制60个字符。 
     * @return TaskTemplateName 任务模板名称，最大长度限制60个字符。
     */
    public String getTaskTemplateName() {
        return this.TaskTemplateName;
    }

    /**
     * Set 任务模板名称，最大长度限制60个字符。
     * @param TaskTemplateName 任务模板名称，最大长度限制60个字符。
     */
    public void setTaskTemplateName(String TaskTemplateName) {
        this.TaskTemplateName = TaskTemplateName;
    }

    /**
     * Get 任务模板内容，参数要求与任务一致 
     * @return TaskTemplateInfo 任务模板内容，参数要求与任务一致
     */
    public Task getTaskTemplateInfo() {
        return this.TaskTemplateInfo;
    }

    /**
     * Set 任务模板内容，参数要求与任务一致
     * @param TaskTemplateInfo 任务模板内容，参数要求与任务一致
     */
    public void setTaskTemplateInfo(Task TaskTemplateInfo) {
        this.TaskTemplateInfo = TaskTemplateInfo;
    }

    /**
     * Get 任务模板描述，最大长度限制200个字符。 
     * @return TaskTemplateDescription 任务模板描述，最大长度限制200个字符。
     */
    public String getTaskTemplateDescription() {
        return this.TaskTemplateDescription;
    }

    /**
     * Set 任务模板描述，最大长度限制200个字符。
     * @param TaskTemplateDescription 任务模板描述，最大长度限制200个字符。
     */
    public void setTaskTemplateDescription(String TaskTemplateDescription) {
        this.TaskTemplateDescription = TaskTemplateDescription;
    }

    /**
     * Get 标签列表。通过指定该参数可以支持绑定标签到任务模板。每个任务模板最多绑定10个标签。 
     * @return Tags 标签列表。通过指定该参数可以支持绑定标签到任务模板。每个任务模板最多绑定10个标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表。通过指定该参数可以支持绑定标签到任务模板。每个任务模板最多绑定10个标签。
     * @param Tags 标签列表。通过指定该参数可以支持绑定标签到任务模板。每个任务模板最多绑定10个标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateTaskTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskTemplateRequest(CreateTaskTemplateRequest source) {
        if (source.TaskTemplateName != null) {
            this.TaskTemplateName = new String(source.TaskTemplateName);
        }
        if (source.TaskTemplateInfo != null) {
            this.TaskTemplateInfo = new Task(source.TaskTemplateInfo);
        }
        if (source.TaskTemplateDescription != null) {
            this.TaskTemplateDescription = new String(source.TaskTemplateDescription);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTemplateName", this.TaskTemplateName);
        this.setParamObj(map, prefix + "TaskTemplateInfo.", this.TaskTemplateInfo);
        this.setParamSimple(map, prefix + "TaskTemplateDescription", this.TaskTemplateDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

