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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelChatTaskResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>响应生成时间</p>
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * <p>错误描述</p>
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * <p>响应 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>响应对象类型标识</p>
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>候选回复数组</p>
    */
    @SerializedName("Choices")
    @Expose
    private ModelChatCompletionChoice [] Choices;

    /**
    * <p>token 用量统计</p>
    */
    @SerializedName("Usage")
    @Expose
    private ModelChatCompletionUsage Usage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>响应生成时间</p> 
     * @return Created <p>响应生成时间</p>
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set <p>响应生成时间</p>
     * @param Created <p>响应生成时间</p>
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get <p>错误描述</p> 
     * @return Msg <p>错误描述</p>
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set <p>错误描述</p>
     * @param Msg <p>错误描述</p>
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get <p>响应 ID</p> 
     * @return Id <p>响应 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>响应 ID</p>
     * @param Id <p>响应 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>响应对象类型标识</p> 
     * @return Object <p>响应对象类型标识</p>
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set <p>响应对象类型标识</p>
     * @param Object <p>响应对象类型标识</p>
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Model <p>模型名称</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称</p>
     * @param Model <p>模型名称</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>候选回复数组</p> 
     * @return Choices <p>候选回复数组</p>
     */
    public ModelChatCompletionChoice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set <p>候选回复数组</p>
     * @param Choices <p>候选回复数组</p>
     */
    public void setChoices(ModelChatCompletionChoice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get <p>token 用量统计</p> 
     * @return Usage <p>token 用量统计</p>
     */
    public ModelChatCompletionUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>token 用量统计</p>
     * @param Usage <p>token 用量统计</p>
     */
    public void setUsage(ModelChatCompletionUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeModelChatTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelChatTaskResponse(DescribeModelChatTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Choices != null) {
            this.Choices = new ModelChatCompletionChoice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new ModelChatCompletionChoice(source.Choices[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new ModelChatCompletionUsage(source.Usage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

