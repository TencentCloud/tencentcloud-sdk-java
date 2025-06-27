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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResult extends AbstractModel {

    /**
    * 请求时传入的DataId
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * TaskId，任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误码。如果code为OK，则表示创建成功，其他则参考公共错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 如果错误，该字段表示错误详情
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 请求时传入的DataId 
     * @return DataId 请求时传入的DataId
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 请求时传入的DataId
     * @param DataId 请求时传入的DataId
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get TaskId，任务ID 
     * @return TaskId TaskId，任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set TaskId，任务ID
     * @param TaskId TaskId，任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 错误码。如果code为OK，则表示创建成功，其他则参考公共错误码 
     * @return Code 错误码。如果code为OK，则表示创建成功，其他则参考公共错误码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码。如果code为OK，则表示创建成功，其他则参考公共错误码
     * @param Code 错误码。如果code为OK，则表示创建成功，其他则参考公共错误码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 如果错误，该字段表示错误详情 
     * @return Message 如果错误，该字段表示错误详情
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 如果错误，该字段表示错误详情
     * @param Message 如果错误，该字段表示错误详情
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public TaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResult(TaskResult source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

