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

public class ExtractBlindWatermarkRequest extends AbstractModel {

    /**
    * 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 媒体处理的文件输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 提取数字水印任务配置
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * 资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li> 
     * @return Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li>
     * @param Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 媒体处理的文件输入信息。 
     * @return InputInfo 媒体处理的文件输入信息。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的文件输入信息。
     * @param InputInfo 媒体处理的文件输入信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 任务的事件通知信息，不填代表不获取事件通知。 
     * @return TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知信息，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 提取数字水印任务配置 
     * @return ExtractBlindWatermarkConfig 提取数字水印任务配置
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set 提取数字水印任务配置
     * @param ExtractBlindWatermarkConfig 提取数字水印任务配置
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
    }

    /**
     * Get 资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。 
     * @return ResourceId 资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。
     * @param ResourceId 资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ExtractBlindWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkRequest(ExtractBlindWatermarkRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

