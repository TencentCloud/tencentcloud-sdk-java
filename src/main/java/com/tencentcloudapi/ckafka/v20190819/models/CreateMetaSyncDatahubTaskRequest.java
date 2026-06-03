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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMetaSyncDatahubTaskRequest extends AbstractModel {

    /**
    * <p>连接器任务名称</p><p>64字符内</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>同步源连接</p><p>参数格式：resource-test</p>
    */
    @SerializedName("SourceResourceId")
    @Expose
    private String SourceResourceId;

    /**
    * <p>同步目标连接</p><p>参数格式：resource-test</p>
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * <p>连接器任务描述</p><p>128字符内</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>连接器任务名称</p><p>64字符内</p> 
     * @return TaskName <p>连接器任务名称</p><p>64字符内</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>连接器任务名称</p><p>64字符内</p>
     * @param TaskName <p>连接器任务名称</p><p>64字符内</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>同步源连接</p><p>参数格式：resource-test</p> 
     * @return SourceResourceId <p>同步源连接</p><p>参数格式：resource-test</p>
     */
    public String getSourceResourceId() {
        return this.SourceResourceId;
    }

    /**
     * Set <p>同步源连接</p><p>参数格式：resource-test</p>
     * @param SourceResourceId <p>同步源连接</p><p>参数格式：resource-test</p>
     */
    public void setSourceResourceId(String SourceResourceId) {
        this.SourceResourceId = SourceResourceId;
    }

    /**
     * Get <p>同步目标连接</p><p>参数格式：resource-test</p> 
     * @return TargetResourceId <p>同步目标连接</p><p>参数格式：resource-test</p>
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set <p>同步目标连接</p><p>参数格式：resource-test</p>
     * @param TargetResourceId <p>同步目标连接</p><p>参数格式：resource-test</p>
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get <p>连接器任务描述</p><p>128字符内</p> 
     * @return Description <p>连接器任务描述</p><p>128字符内</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>连接器任务描述</p><p>128字符内</p>
     * @param Description <p>连接器任务描述</p><p>128字符内</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateMetaSyncDatahubTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetaSyncDatahubTaskRequest(CreateMetaSyncDatahubTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceResourceId != null) {
            this.SourceResourceId = new String(source.SourceResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceResourceId", this.SourceResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

