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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeTWeSeeComprehensionRequest extends AbstractModel {

    /**
    * 输入视频 / 图片的 URL
    */
    @SerializedName("InputURL")
    @Expose
    private String InputURL;

    /**
    * 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 任务元数据
    */
    @SerializedName("Metadata")
    @Expose
    private SeeTaskMetadata Metadata;

    /**
    * 视觉理解配置项
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * 等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。
    */
    @SerializedName("WaitResultTimeout")
    @Expose
    private Long WaitResultTimeout;

    /**
    * 回调目标 ID
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
     * Get 输入视频 / 图片的 URL 
     * @return InputURL 输入视频 / 图片的 URL
     */
    public String getInputURL() {
        return this.InputURL;
    }

    /**
     * Set 输入视频 / 图片的 URL
     * @param InputURL 输入视频 / 图片的 URL
     */
    public void setInputURL(String InputURL) {
        this.InputURL = InputURL;
    }

    /**
     * Get 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解 
     * @return ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     * @param ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 任务元数据 
     * @return Metadata 任务元数据
     */
    public SeeTaskMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 任务元数据
     * @param Metadata 任务元数据
     */
    public void setMetadata(SeeTaskMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 视觉理解配置项 
     * @return ComprehensionConfig 视觉理解配置项
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set 视觉理解配置项
     * @param ComprehensionConfig 视觉理解配置项
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get 等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。 
     * @return WaitResultTimeout 等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。
     */
    public Long getWaitResultTimeout() {
        return this.WaitResultTimeout;
    }

    /**
     * Set 等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。
     * @param WaitResultTimeout 等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。
     */
    public void setWaitResultTimeout(Long WaitResultTimeout) {
        this.WaitResultTimeout = WaitResultTimeout;
    }

    /**
     * Get 回调目标 ID 
     * @return CallbackId 回调目标 ID
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set 回调目标 ID
     * @param CallbackId 回调目标 ID
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    public InvokeTWeSeeComprehensionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeTWeSeeComprehensionRequest(InvokeTWeSeeComprehensionRequest source) {
        if (source.InputURL != null) {
            this.InputURL = new String(source.InputURL);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Metadata != null) {
            this.Metadata = new SeeTaskMetadata(source.Metadata);
        }
        if (source.ComprehensionConfig != null) {
            this.ComprehensionConfig = new SeeComprehensionConfig(source.ComprehensionConfig);
        }
        if (source.WaitResultTimeout != null) {
            this.WaitResultTimeout = new Long(source.WaitResultTimeout);
        }
        if (source.CallbackId != null) {
            this.CallbackId = new String(source.CallbackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputURL", this.InputURL);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "ComprehensionConfig.", this.ComprehensionConfig);
        this.setParamSimple(map, prefix + "WaitResultTimeout", this.WaitResultTimeout);
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);

    }
}

