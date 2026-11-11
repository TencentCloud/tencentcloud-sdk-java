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
    * <p>数字水印类型，可选值：</p><li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li><li>blind-vega：vega数字水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>媒体处理的文件输入信息。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>任务的事件通知信息，不填代表不获取事件通知。</p>
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * <p>提取数字水印任务配置</p>
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>数字水印类型，可选值：</p><li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li><li>blind-vega：vega数字水印；</li> 
     * @return Type <p>数字水印类型，可选值：</p><li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li><li>blind-vega：vega数字水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数字水印类型，可选值：</p><li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li><li>blind-vega：vega数字水印；</li>
     * @param Type <p>数字水印类型，可选值：</p><li>blind-basic：基础版权数字水印；</li><li>blind-abseq：ab序列版权数字水印；</li><li>blind-vega：vega数字水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>媒体处理的文件输入信息。</p> 
     * @return InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>媒体处理的文件输入信息。</p>
     * @param InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>任务的事件通知信息，不填代表不获取事件通知。</p> 
     * @return TaskNotifyConfig <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     * @param TaskNotifyConfig <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get <p>提取数字水印任务配置</p> 
     * @return ExtractBlindWatermarkConfig <p>提取数字水印任务配置</p>
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set <p>提取数字水印任务配置</p>
     * @param ExtractBlindWatermarkConfig <p>提取数字水印任务配置</p>
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
    }

    /**
     * Get <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p> 
     * @return ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
     * @param ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
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

