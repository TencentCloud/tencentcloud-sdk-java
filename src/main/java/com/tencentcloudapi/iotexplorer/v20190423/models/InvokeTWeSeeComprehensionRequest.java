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
    * <p>输入视频 / 图片的 URL</p>
    */
    @SerializedName("InputURL")
    @Expose
    private String InputURL;

    /**
    * <p>算法类型。可选值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>任务元数据</p>
    */
    @SerializedName("Metadata")
    @Expose
    private SeeTaskMetadata Metadata;

    /**
    * <p>视觉理解配置项</p>
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * <p>等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。</p>
    */
    @SerializedName("WaitResultTimeout")
    @Expose
    private Long WaitResultTimeout;

    /**
    * <p>回调目标 ID</p>
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
     * Get <p>输入视频 / 图片的 URL</p> 
     * @return InputURL <p>输入视频 / 图片的 URL</p>
     */
    public String getInputURL() {
        return this.InputURL;
    }

    /**
     * Set <p>输入视频 / 图片的 URL</p>
     * @param InputURL <p>输入视频 / 图片的 URL</p>
     */
    public void setInputURL(String InputURL) {
        this.InputURL = InputURL;
    }

    /**
     * Get <p>算法类型。可选值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li></ul> 
     * @return ServiceType <p>算法类型。可选值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>算法类型。可选值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li></ul>
     * @param ServiceType <p>算法类型。可选值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>任务元数据</p> 
     * @return Metadata <p>任务元数据</p>
     */
    public SeeTaskMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>任务元数据</p>
     * @param Metadata <p>任务元数据</p>
     */
    public void setMetadata(SeeTaskMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>视觉理解配置项</p> 
     * @return ComprehensionConfig <p>视觉理解配置项</p>
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set <p>视觉理解配置项</p>
     * @param ComprehensionConfig <p>视觉理解配置项</p>
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get <p>等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。</p> 
     * @return WaitResultTimeout <p>等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。</p>
     */
    public Long getWaitResultTimeout() {
        return this.WaitResultTimeout;
    }

    /**
     * Set <p>等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。</p>
     * @param WaitResultTimeout <p>等待结果的超时时间（单位：秒）。填 0 表示无需等待结果。最大超时时长 25 秒，默认超时时长 20 秒。</p>
     */
    public void setWaitResultTimeout(Long WaitResultTimeout) {
        this.WaitResultTimeout = WaitResultTimeout;
    }

    /**
     * Get <p>回调目标 ID</p> 
     * @return CallbackId <p>回调目标 ID</p>
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set <p>回调目标 ID</p>
     * @param CallbackId <p>回调目标 ID</p>
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

