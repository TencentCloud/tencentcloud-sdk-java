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

public class ExtractBlindWatermarkTask extends AbstractModel {

    /**
    * 媒体处理任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，0 表示成功，其他值表示失败。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 媒体处理的目标文件信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li> <li>blind-ab：ab版权数字水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 标记是否检测到水印，如果该参数为true， Result字段将返回水印提取结果，如果该参数为false，Result字段不会返回。
    */
    @SerializedName("IsDetected")
    @Expose
    private Boolean IsDetected;

    /**
    * 提取出的数字水印内容，当没有检测到水印时该字段不会返回。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 提取数字水印配置。
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
     * Get 媒体处理任务 ID。 
     * @return TaskId 媒体处理任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 媒体处理任务 ID。
     * @param TaskId 媒体处理任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务流状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li> 
     * @return Status 任务流状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务流状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务流状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，0 表示成功，其他值表示失败。 
     * @return ErrCode 错误码，0 表示成功，其他值表示失败。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码，0 表示成功，其他值表示失败。
     * @param ErrCode 错误码，0 表示成功，其他值表示失败。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 媒体处理的目标文件信息。 
     * @return InputInfo 媒体处理的目标文件信息。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的目标文件信息。
     * @param InputInfo 媒体处理的目标文件信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li> <li>blind-ab：ab版权数字水印；</li> 
     * @return Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li> <li>blind-ab：ab版权数字水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li> <li>blind-ab：ab版权数字水印；</li>
     * @param Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li> <li>blind-ab：ab版权数字水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 标记是否检测到水印，如果该参数为true， Result字段将返回水印提取结果，如果该参数为false，Result字段不会返回。 
     * @return IsDetected 标记是否检测到水印，如果该参数为true， Result字段将返回水印提取结果，如果该参数为false，Result字段不会返回。
     */
    public Boolean getIsDetected() {
        return this.IsDetected;
    }

    /**
     * Set 标记是否检测到水印，如果该参数为true， Result字段将返回水印提取结果，如果该参数为false，Result字段不会返回。
     * @param IsDetected 标记是否检测到水印，如果该参数为true， Result字段将返回水印提取结果，如果该参数为false，Result字段不会返回。
     */
    public void setIsDetected(Boolean IsDetected) {
        this.IsDetected = IsDetected;
    }

    /**
     * Get 提取出的数字水印内容，当没有检测到水印时该字段不会返回。 
     * @return Result 提取出的数字水印内容，当没有检测到水印时该字段不会返回。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 提取出的数字水印内容，当没有检测到水印时该字段不会返回。
     * @param Result 提取出的数字水印内容，当没有检测到水印时该字段不会返回。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 提取数字水印配置。 
     * @return ExtractBlindWatermarkConfig 提取数字水印配置。
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set 提取数字水印配置。
     * @param ExtractBlindWatermarkConfig 提取数字水印配置。
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
    }

    public ExtractBlindWatermarkTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkTask(ExtractBlindWatermarkTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IsDetected != null) {
            this.IsDetected = new Boolean(source.IsDetected);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsDetected", this.IsDetected);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);

    }
}

