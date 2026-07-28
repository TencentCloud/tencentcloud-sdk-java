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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveStreamModerationRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>直播流输入源</p>
    */
    @SerializedName("Input")
    @Expose
    private Input Input;

    /**
    * <p>直播流ai理解审核参数</p>
    */
    @SerializedName("LiveModerationParams")
    @Expose
    private LiveModerationParams LiveModerationParams;

    /**
    * <p>业务自定义唯一标识，原样透传到回调</p><p>入参限制：长度限制60字符</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>额外信息透传结构体（房间/主播/业务自定义），原样回带到回调</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private SourceInfo SourceInfo;

    /**
    * <p>直播流ai理解转存文件存储参数</p>
    */
    @SerializedName("LiveModerationStorageParams")
    @Expose
    private LiveModerationStorageParams LiveModerationStorageParams;

    /**
    * <p>单路任务最大的生命周期</p><p>取值范围：[1, 72]</p><p>单位：小时</p><p>默认值：48</p>
    */
    @SerializedName("ResourceExpiredHour")
    @Expose
    private Long ResourceExpiredHour;

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>。</p> 
     * @return SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>。</p>
     * @param SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>直播流输入源</p> 
     * @return Input <p>直播流输入源</p>
     */
    public Input getInput() {
        return this.Input;
    }

    /**
     * Set <p>直播流输入源</p>
     * @param Input <p>直播流输入源</p>
     */
    public void setInput(Input Input) {
        this.Input = Input;
    }

    /**
     * Get <p>直播流ai理解审核参数</p> 
     * @return LiveModerationParams <p>直播流ai理解审核参数</p>
     */
    public LiveModerationParams getLiveModerationParams() {
        return this.LiveModerationParams;
    }

    /**
     * Set <p>直播流ai理解审核参数</p>
     * @param LiveModerationParams <p>直播流ai理解审核参数</p>
     */
    public void setLiveModerationParams(LiveModerationParams LiveModerationParams) {
        this.LiveModerationParams = LiveModerationParams;
    }

    /**
     * Get <p>业务自定义唯一标识，原样透传到回调</p><p>入参限制：长度限制60字符</p> 
     * @return DataId <p>业务自定义唯一标识，原样透传到回调</p><p>入参限制：长度限制60字符</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>业务自定义唯一标识，原样透传到回调</p><p>入参限制：长度限制60字符</p>
     * @param DataId <p>业务自定义唯一标识，原样透传到回调</p><p>入参限制：长度限制60字符</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>额外信息透传结构体（房间/主播/业务自定义），原样回带到回调</p> 
     * @return SourceInfo <p>额外信息透传结构体（房间/主播/业务自定义），原样回带到回调</p>
     */
    public SourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>额外信息透传结构体（房间/主播/业务自定义），原样回带到回调</p>
     * @param SourceInfo <p>额外信息透传结构体（房间/主播/业务自定义），原样回带到回调</p>
     */
    public void setSourceInfo(SourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get <p>直播流ai理解转存文件存储参数</p> 
     * @return LiveModerationStorageParams <p>直播流ai理解转存文件存储参数</p>
     */
    public LiveModerationStorageParams getLiveModerationStorageParams() {
        return this.LiveModerationStorageParams;
    }

    /**
     * Set <p>直播流ai理解转存文件存储参数</p>
     * @param LiveModerationStorageParams <p>直播流ai理解转存文件存储参数</p>
     */
    public void setLiveModerationStorageParams(LiveModerationStorageParams LiveModerationStorageParams) {
        this.LiveModerationStorageParams = LiveModerationStorageParams;
    }

    /**
     * Get <p>单路任务最大的生命周期</p><p>取值范围：[1, 72]</p><p>单位：小时</p><p>默认值：48</p> 
     * @return ResourceExpiredHour <p>单路任务最大的生命周期</p><p>取值范围：[1, 72]</p><p>单位：小时</p><p>默认值：48</p>
     */
    public Long getResourceExpiredHour() {
        return this.ResourceExpiredHour;
    }

    /**
     * Set <p>单路任务最大的生命周期</p><p>取值范围：[1, 72]</p><p>单位：小时</p><p>默认值：48</p>
     * @param ResourceExpiredHour <p>单路任务最大的生命周期</p><p>取值范围：[1, 72]</p><p>单位：小时</p><p>默认值：48</p>
     */
    public void setResourceExpiredHour(Long ResourceExpiredHour) {
        this.ResourceExpiredHour = ResourceExpiredHour;
    }

    public CreateLiveStreamModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveStreamModerationRequest(CreateLiveStreamModerationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Input != null) {
            this.Input = new Input(source.Input);
        }
        if (source.LiveModerationParams != null) {
            this.LiveModerationParams = new LiveModerationParams(source.LiveModerationParams);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new SourceInfo(source.SourceInfo);
        }
        if (source.LiveModerationStorageParams != null) {
            this.LiveModerationStorageParams = new LiveModerationStorageParams(source.LiveModerationStorageParams);
        }
        if (source.ResourceExpiredHour != null) {
            this.ResourceExpiredHour = new Long(source.ResourceExpiredHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "LiveModerationParams.", this.LiveModerationParams);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamObj(map, prefix + "LiveModerationStorageParams.", this.LiveModerationStorageParams);
        this.setParamSimple(map, prefix + "ResourceExpiredHour", this.ResourceExpiredHour);

    }
}

