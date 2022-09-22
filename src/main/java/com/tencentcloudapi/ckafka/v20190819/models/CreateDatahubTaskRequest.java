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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatahubTaskRequest extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型，SOURCE数据接入，SINK数据流出
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 数据源
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * 数据目标
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * 数据处理规则
    */
    @SerializedName("TransformParam")
    @Expose
    private TransformParam TransformParam;

    /**
    * 实例连接参数【已废弃】
    */
    @SerializedName("PrivateLinkParam")
    @Expose
    private PrivateLinkParam PrivateLinkParam;

    /**
    * 选择所要绑定的SchemaId
    */
    @SerializedName("SchemaId")
    @Expose
    private String SchemaId;

    /**
    * 数据处理规则
    */
    @SerializedName("TransformsParam")
    @Expose
    private TransformsParam TransformsParam;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型，SOURCE数据接入，SINK数据流出 
     * @return TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，SOURCE数据接入，SINK数据流出
     * @param TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 数据源 
     * @return SourceResource 数据源
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set 数据源
     * @param SourceResource 数据源
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get 数据目标 
     * @return TargetResource 数据目标
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set 数据目标
     * @param TargetResource 数据目标
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get 数据处理规则 
     * @return TransformParam 数据处理规则
     */
    public TransformParam getTransformParam() {
        return this.TransformParam;
    }

    /**
     * Set 数据处理规则
     * @param TransformParam 数据处理规则
     */
    public void setTransformParam(TransformParam TransformParam) {
        this.TransformParam = TransformParam;
    }

    /**
     * Get 实例连接参数【已废弃】 
     * @return PrivateLinkParam 实例连接参数【已废弃】
     */
    public PrivateLinkParam getPrivateLinkParam() {
        return this.PrivateLinkParam;
    }

    /**
     * Set 实例连接参数【已废弃】
     * @param PrivateLinkParam 实例连接参数【已废弃】
     */
    public void setPrivateLinkParam(PrivateLinkParam PrivateLinkParam) {
        this.PrivateLinkParam = PrivateLinkParam;
    }

    /**
     * Get 选择所要绑定的SchemaId 
     * @return SchemaId 选择所要绑定的SchemaId
     */
    public String getSchemaId() {
        return this.SchemaId;
    }

    /**
     * Set 选择所要绑定的SchemaId
     * @param SchemaId 选择所要绑定的SchemaId
     */
    public void setSchemaId(String SchemaId) {
        this.SchemaId = SchemaId;
    }

    /**
     * Get 数据处理规则 
     * @return TransformsParam 数据处理规则
     */
    public TransformsParam getTransformsParam() {
        return this.TransformsParam;
    }

    /**
     * Set 数据处理规则
     * @param TransformsParam 数据处理规则
     */
    public void setTransformsParam(TransformsParam TransformsParam) {
        this.TransformsParam = TransformsParam;
    }

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
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDatahubTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatahubTaskRequest(CreateDatahubTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.SourceResource != null) {
            this.SourceResource = new DatahubResource(source.SourceResource);
        }
        if (source.TargetResource != null) {
            this.TargetResource = new DatahubResource(source.TargetResource);
        }
        if (source.TransformParam != null) {
            this.TransformParam = new TransformParam(source.TransformParam);
        }
        if (source.PrivateLinkParam != null) {
            this.PrivateLinkParam = new PrivateLinkParam(source.PrivateLinkParam);
        }
        if (source.SchemaId != null) {
            this.SchemaId = new String(source.SchemaId);
        }
        if (source.TransformsParam != null) {
            this.TransformsParam = new TransformsParam(source.TransformsParam);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamObj(map, prefix + "SourceResource.", this.SourceResource);
        this.setParamObj(map, prefix + "TargetResource.", this.TargetResource);
        this.setParamObj(map, prefix + "TransformParam.", this.TransformParam);
        this.setParamObj(map, prefix + "PrivateLinkParam.", this.PrivateLinkParam);
        this.setParamSimple(map, prefix + "SchemaId", this.SchemaId);
        this.setParamObj(map, prefix + "TransformsParam.", this.TransformsParam);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

