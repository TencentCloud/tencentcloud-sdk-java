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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationTaskRequest extends AbstractModel{

    /**
    * 业务类型, 定义 模版策略，输出存储配置。如果没有BizType，可以先参考 【创建业务配置】接口进行创建
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 审核类型，这里可选：AUDIO (点播音频)和 LIVE_AUDIO（直播音频）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 回调签名key，具体可以查看签名文档。
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * 接收审核信息回调地址，如果设置，则审核过程中产生的违规音频片段和画面截帧发送此接口
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 输入的任务信息，最多可以同时创建10个任务
    */
    @SerializedName("Tasks")
    @Expose
    private TaskInput [] Tasks;

    /**
     * Get 业务类型, 定义 模版策略，输出存储配置。如果没有BizType，可以先参考 【创建业务配置】接口进行创建 
     * @return BizType 业务类型, 定义 模版策略，输出存储配置。如果没有BizType，可以先参考 【创建业务配置】接口进行创建
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型, 定义 模版策略，输出存储配置。如果没有BizType，可以先参考 【创建业务配置】接口进行创建
     * @param BizType 业务类型, 定义 模版策略，输出存储配置。如果没有BizType，可以先参考 【创建业务配置】接口进行创建
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 审核类型，这里可选：AUDIO (点播音频)和 LIVE_AUDIO（直播音频） 
     * @return Type 审核类型，这里可选：AUDIO (点播音频)和 LIVE_AUDIO（直播音频）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 审核类型，这里可选：AUDIO (点播音频)和 LIVE_AUDIO（直播音频）
     * @param Type 审核类型，这里可选：AUDIO (点播音频)和 LIVE_AUDIO（直播音频）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 回调签名key，具体可以查看签名文档。 
     * @return Seed 回调签名key，具体可以查看签名文档。
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set 回调签名key，具体可以查看签名文档。
     * @param Seed 回调签名key，具体可以查看签名文档。
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 接收审核信息回调地址，如果设置，则审核过程中产生的违规音频片段和画面截帧发送此接口 
     * @return CallbackUrl 接收审核信息回调地址，如果设置，则审核过程中产生的违规音频片段和画面截帧发送此接口
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 接收审核信息回调地址，如果设置，则审核过程中产生的违规音频片段和画面截帧发送此接口
     * @param CallbackUrl 接收审核信息回调地址，如果设置，则审核过程中产生的违规音频片段和画面截帧发送此接口
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 输入的任务信息，最多可以同时创建10个任务 
     * @return Tasks 输入的任务信息，最多可以同时创建10个任务
     */
    public TaskInput [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 输入的任务信息，最多可以同时创建10个任务
     * @param Tasks 输入的任务信息，最多可以同时创建10个任务
     */
    public void setTasks(TaskInput [] Tasks) {
        this.Tasks = Tasks;
    }

    public CreateAudioModerationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationTaskRequest(CreateAudioModerationTaskRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskInput[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInput(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

