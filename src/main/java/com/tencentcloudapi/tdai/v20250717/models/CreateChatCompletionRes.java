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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateChatCompletionRes extends AbstractModel {

    /**
    * 枚举值，返回的数据类型
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 消息时间戳
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * 输出模型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 用户标识
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账户标识
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 当前账户标识
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Request ID

    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 当前会话ID
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 当前流ID
    */
    @SerializedName("StreamingId")
    @Expose
    private String StreamingId;

    /**
    * 当前任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 消息的数据详情
    */
    @SerializedName("Choices")
    @Expose
    private UploadChoice [] Choices;

    /**
     * Get 枚举值，返回的数据类型 
     * @return Object 枚举值，返回的数据类型
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 枚举值，返回的数据类型
     * @param Object 枚举值，返回的数据类型
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 消息时间戳 
     * @return Created 消息时间戳
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set 消息时间戳
     * @param Created 消息时间戳
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get 输出模型 
     * @return Model 输出模型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 输出模型
     * @param Model 输出模型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 用户标识 
     * @return AppId 用户标识
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户标识
     * @param AppId 用户标识
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账户标识 
     * @return OwnerUin 主账户标识
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账户标识
     * @param OwnerUin 主账户标识
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 当前账户标识 
     * @return Uin 当前账户标识
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 当前账户标识
     * @param Uin 当前账户标识
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Request ID
 
     * @return RequestId Request ID

     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Request ID

     * @param RequestId Request ID

     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 当前会话ID 
     * @return ChatId 当前会话ID
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 当前会话ID
     * @param ChatId 当前会话ID
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 当前流ID 
     * @return StreamingId 当前流ID
     */
    public String getStreamingId() {
        return this.StreamingId;
    }

    /**
     * Set 当前流ID
     * @param StreamingId 当前流ID
     */
    public void setStreamingId(String StreamingId) {
        this.StreamingId = StreamingId;
    }

    /**
     * Get 当前任务ID 
     * @return TaskId 当前任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 当前任务ID
     * @param TaskId 当前任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 消息的数据详情 
     * @return Choices 消息的数据详情
     */
    public UploadChoice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 消息的数据详情
     * @param Choices 消息的数据详情
     */
    public void setChoices(UploadChoice [] Choices) {
        this.Choices = Choices;
    }

    public CreateChatCompletionRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChatCompletionRes(CreateChatCompletionRes source) {
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.StreamingId != null) {
            this.StreamingId = new String(source.StreamingId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Choices != null) {
            this.Choices = new UploadChoice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new UploadChoice(source.Choices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "StreamingId", this.StreamingId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);

    }
}

