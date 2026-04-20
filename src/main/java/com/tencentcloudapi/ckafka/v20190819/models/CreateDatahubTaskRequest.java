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

public class CreateDatahubTaskRequest extends AbstractModel {

    /**
    * <p>任务名称,只能以字母起始,允许包含字母、数字、- 、.  、 下划线且长度不超过64 (、为分割符号规则不包含)</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务类型，SOURCE数据接入，SINK数据流出</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>数据源</p>
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * <p>数据目标</p>
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * <p>数据处理规则</p>
    */
    @SerializedName("TransformParam")
    @Expose
    private TransformParam TransformParam;

    /**
    * <p>实例连接参数【已废弃】</p>
    */
    @SerializedName("PrivateLinkParam")
    @Expose
    private PrivateLinkParam PrivateLinkParam;

    /**
    * <p>选择所要绑定的SchemaId</p>
    */
    @SerializedName("SchemaId")
    @Expose
    private String SchemaId;

    /**
    * <p>数据处理规则</p>
    */
    @SerializedName("TransformsParam")
    @Expose
    private TransformsParam TransformsParam;

    /**
    * <p>任务Id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>任务描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>任务名称,只能以字母起始,允许包含字母、数字、- 、.  、 下划线且长度不超过64 (、为分割符号规则不包含)</p> 
     * @return TaskName <p>任务名称,只能以字母起始,允许包含字母、数字、- 、.  、 下划线且长度不超过64 (、为分割符号规则不包含)</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称,只能以字母起始,允许包含字母、数字、- 、.  、 下划线且长度不超过64 (、为分割符号规则不包含)</p>
     * @param TaskName <p>任务名称,只能以字母起始,允许包含字母、数字、- 、.  、 下划线且长度不超过64 (、为分割符号规则不包含)</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务类型，SOURCE数据接入，SINK数据流出</p> 
     * @return TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     * @param TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>数据源</p> 
     * @return SourceResource <p>数据源</p>
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set <p>数据源</p>
     * @param SourceResource <p>数据源</p>
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get <p>数据目标</p> 
     * @return TargetResource <p>数据目标</p>
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set <p>数据目标</p>
     * @param TargetResource <p>数据目标</p>
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get <p>数据处理规则</p> 
     * @return TransformParam <p>数据处理规则</p>
     */
    public TransformParam getTransformParam() {
        return this.TransformParam;
    }

    /**
     * Set <p>数据处理规则</p>
     * @param TransformParam <p>数据处理规则</p>
     */
    public void setTransformParam(TransformParam TransformParam) {
        this.TransformParam = TransformParam;
    }

    /**
     * Get <p>实例连接参数【已废弃】</p> 
     * @return PrivateLinkParam <p>实例连接参数【已废弃】</p>
     * @deprecated
     */
    @Deprecated
    public PrivateLinkParam getPrivateLinkParam() {
        return this.PrivateLinkParam;
    }

    /**
     * Set <p>实例连接参数【已废弃】</p>
     * @param PrivateLinkParam <p>实例连接参数【已废弃】</p>
     * @deprecated
     */
    @Deprecated
    public void setPrivateLinkParam(PrivateLinkParam PrivateLinkParam) {
        this.PrivateLinkParam = PrivateLinkParam;
    }

    /**
     * Get <p>选择所要绑定的SchemaId</p> 
     * @return SchemaId <p>选择所要绑定的SchemaId</p>
     */
    public String getSchemaId() {
        return this.SchemaId;
    }

    /**
     * Set <p>选择所要绑定的SchemaId</p>
     * @param SchemaId <p>选择所要绑定的SchemaId</p>
     */
    public void setSchemaId(String SchemaId) {
        this.SchemaId = SchemaId;
    }

    /**
     * Get <p>数据处理规则</p> 
     * @return TransformsParam <p>数据处理规则</p>
     */
    public TransformsParam getTransformsParam() {
        return this.TransformsParam;
    }

    /**
     * Set <p>数据处理规则</p>
     * @param TransformsParam <p>数据处理规则</p>
     */
    public void setTransformsParam(TransformsParam TransformsParam) {
        this.TransformsParam = TransformsParam;
    }

    /**
     * Get <p>任务Id</p> 
     * @return TaskId <p>任务Id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务Id</p>
     * @param TaskId <p>任务Id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    /**
     * Get <p>任务描述信息</p> 
     * @return Description <p>任务描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述信息</p>
     * @param Description <p>任务描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

