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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractBlindWatermarkRequest extends AbstractModel {

    /**
    * 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-trace：溯源ab序列水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 媒体处理的文件输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private ExtractBlindWatermarkInputInfo InputInfo;

    /**
    * 添加水印时的点播应用 ID。注意不管是传入FILEID还是URL，都必须与添加水印时的SubAppId吻合才能提取到水印。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 提取数字水印任务配置
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * 标识来源上下文，用于透传用户请求信息，在 ExtractBlindWatermarkComplete 回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-trace：溯源ab序列水印；</li> 
     * @return Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-trace：溯源ab序列水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-trace：溯源ab序列水印；</li>
     * @param Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-trace：溯源ab序列水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 媒体处理的文件输入信息。 
     * @return InputInfo 媒体处理的文件输入信息。
     */
    public ExtractBlindWatermarkInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的文件输入信息。
     * @param InputInfo 媒体处理的文件输入信息。
     */
    public void setInputInfo(ExtractBlindWatermarkInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 添加水印时的点播应用 ID。注意不管是传入FILEID还是URL，都必须与添加水印时的SubAppId吻合才能提取到水印。 
     * @return SubAppId 添加水印时的点播应用 ID。注意不管是传入FILEID还是URL，都必须与添加水印时的SubAppId吻合才能提取到水印。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 添加水印时的点播应用 ID。注意不管是传入FILEID还是URL，都必须与添加水印时的SubAppId吻合才能提取到水印。
     * @param SubAppId 添加水印时的点播应用 ID。注意不管是传入FILEID还是URL，都必须与添加水印时的SubAppId吻合才能提取到水印。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get 标识来源上下文，用于透传用户请求信息，在 ExtractBlindWatermarkComplete 回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 标识来源上下文，用于透传用户请求信息，在 ExtractBlindWatermarkComplete 回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 标识来源上下文，用于透传用户请求信息，在 ExtractBlindWatermarkComplete 回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 标识来源上下文，用于透传用户请求信息，在 ExtractBlindWatermarkComplete 回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。 
     * @return TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
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
            this.InputInfo = new ExtractBlindWatermarkInputInfo(source.InputInfo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

