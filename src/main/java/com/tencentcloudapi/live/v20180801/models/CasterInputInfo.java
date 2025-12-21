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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterInputInfo extends AbstractModel {

    /**
    * <p>输入源Index。范围[1, 24]</p>
    */
    @SerializedName("InputIndex")
    @Expose
    private Long InputIndex;

    /**
    * <p>输入源类型。范围[0,1,2,3,4]。0：推流地址。1：点播文件地址。2：直播拉流地址。3：图片地址。4：webrtc协议推流地址。</p>
    */
    @SerializedName("InputType")
    @Expose
    private Long InputType;

    /**
    * <p>输入源的源地址。最大允许长度512。当InputType为0（推流地址），2（直播拉流地址），3（图片地址）,4（webrtc推流地址）这几种类型时，URL需填入该字段。</p>
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * <p>输入源描述。最大允许长度256字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>点播地址列表。仅当input type为1（点播地址）时，将一个或多个点播地址，填入该字段。单个地址最大允许长度512字符。最多允许同时填入5个地址。注：此时需保持InputUrl字段为空。</p>
    */
    @SerializedName("InputUrls")
    @Expose
    private String [] InputUrls;

    /**
    * <p>是否启用点播无限循环播放。注：当前该字段未生效，默认为True。</p>
    */
    @SerializedName("LoopEnable")
    @Expose
    private Boolean LoopEnable;

    /**
    * <p>点播循环次数。允许值-1或正整数。当值为-1时，表示无限循环。当值为其他正整数时，表示循环对应次数。注：该字段暂未生效。</p>
    */
    @SerializedName("LoopNumber")
    @Expose
    private Long LoopNumber;

    /**
    * <p>是否启用拉取到导播台。注：该字段默认强制为true。</p>
    */
    @SerializedName("PullPushEnable")
    @Expose
    private Boolean PullPushEnable;

    /**
    * <p>输入源音量百分比。默认为100。表示音量为原始大小。允许值[0,200]。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get <p>输入源Index。范围[1, 24]</p> 
     * @return InputIndex <p>输入源Index。范围[1, 24]</p>
     */
    public Long getInputIndex() {
        return this.InputIndex;
    }

    /**
     * Set <p>输入源Index。范围[1, 24]</p>
     * @param InputIndex <p>输入源Index。范围[1, 24]</p>
     */
    public void setInputIndex(Long InputIndex) {
        this.InputIndex = InputIndex;
    }

    /**
     * Get <p>输入源类型。范围[0,1,2,3,4]。0：推流地址。1：点播文件地址。2：直播拉流地址。3：图片地址。4：webrtc协议推流地址。</p> 
     * @return InputType <p>输入源类型。范围[0,1,2,3,4]。0：推流地址。1：点播文件地址。2：直播拉流地址。3：图片地址。4：webrtc协议推流地址。</p>
     */
    public Long getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>输入源类型。范围[0,1,2,3,4]。0：推流地址。1：点播文件地址。2：直播拉流地址。3：图片地址。4：webrtc协议推流地址。</p>
     * @param InputType <p>输入源类型。范围[0,1,2,3,4]。0：推流地址。1：点播文件地址。2：直播拉流地址。3：图片地址。4：webrtc协议推流地址。</p>
     */
    public void setInputType(Long InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>输入源的源地址。最大允许长度512。当InputType为0（推流地址），2（直播拉流地址），3（图片地址）,4（webrtc推流地址）这几种类型时，URL需填入该字段。</p> 
     * @return InputUrl <p>输入源的源地址。最大允许长度512。当InputType为0（推流地址），2（直播拉流地址），3（图片地址）,4（webrtc推流地址）这几种类型时，URL需填入该字段。</p>
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set <p>输入源的源地址。最大允许长度512。当InputType为0（推流地址），2（直播拉流地址），3（图片地址）,4（webrtc推流地址）这几种类型时，URL需填入该字段。</p>
     * @param InputUrl <p>输入源的源地址。最大允许长度512。当InputType为0（推流地址），2（直播拉流地址），3（图片地址）,4（webrtc推流地址）这几种类型时，URL需填入该字段。</p>
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get <p>输入源描述。最大允许长度256字符。</p> 
     * @return Description <p>输入源描述。最大允许长度256字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>输入源描述。最大允许长度256字符。</p>
     * @param Description <p>输入源描述。最大允许长度256字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>点播地址列表。仅当input type为1（点播地址）时，将一个或多个点播地址，填入该字段。单个地址最大允许长度512字符。最多允许同时填入5个地址。注：此时需保持InputUrl字段为空。</p> 
     * @return InputUrls <p>点播地址列表。仅当input type为1（点播地址）时，将一个或多个点播地址，填入该字段。单个地址最大允许长度512字符。最多允许同时填入5个地址。注：此时需保持InputUrl字段为空。</p>
     */
    public String [] getInputUrls() {
        return this.InputUrls;
    }

    /**
     * Set <p>点播地址列表。仅当input type为1（点播地址）时，将一个或多个点播地址，填入该字段。单个地址最大允许长度512字符。最多允许同时填入5个地址。注：此时需保持InputUrl字段为空。</p>
     * @param InputUrls <p>点播地址列表。仅当input type为1（点播地址）时，将一个或多个点播地址，填入该字段。单个地址最大允许长度512字符。最多允许同时填入5个地址。注：此时需保持InputUrl字段为空。</p>
     */
    public void setInputUrls(String [] InputUrls) {
        this.InputUrls = InputUrls;
    }

    /**
     * Get <p>是否启用点播无限循环播放。注：当前该字段未生效，默认为True。</p> 
     * @return LoopEnable <p>是否启用点播无限循环播放。注：当前该字段未生效，默认为True。</p>
     */
    public Boolean getLoopEnable() {
        return this.LoopEnable;
    }

    /**
     * Set <p>是否启用点播无限循环播放。注：当前该字段未生效，默认为True。</p>
     * @param LoopEnable <p>是否启用点播无限循环播放。注：当前该字段未生效，默认为True。</p>
     */
    public void setLoopEnable(Boolean LoopEnable) {
        this.LoopEnable = LoopEnable;
    }

    /**
     * Get <p>点播循环次数。允许值-1或正整数。当值为-1时，表示无限循环。当值为其他正整数时，表示循环对应次数。注：该字段暂未生效。</p> 
     * @return LoopNumber <p>点播循环次数。允许值-1或正整数。当值为-1时，表示无限循环。当值为其他正整数时，表示循环对应次数。注：该字段暂未生效。</p>
     */
    public Long getLoopNumber() {
        return this.LoopNumber;
    }

    /**
     * Set <p>点播循环次数。允许值-1或正整数。当值为-1时，表示无限循环。当值为其他正整数时，表示循环对应次数。注：该字段暂未生效。</p>
     * @param LoopNumber <p>点播循环次数。允许值-1或正整数。当值为-1时，表示无限循环。当值为其他正整数时，表示循环对应次数。注：该字段暂未生效。</p>
     */
    public void setLoopNumber(Long LoopNumber) {
        this.LoopNumber = LoopNumber;
    }

    /**
     * Get <p>是否启用拉取到导播台。注：该字段默认强制为true。</p> 
     * @return PullPushEnable <p>是否启用拉取到导播台。注：该字段默认强制为true。</p>
     */
    public Boolean getPullPushEnable() {
        return this.PullPushEnable;
    }

    /**
     * Set <p>是否启用拉取到导播台。注：该字段默认强制为true。</p>
     * @param PullPushEnable <p>是否启用拉取到导播台。注：该字段默认强制为true。</p>
     */
    public void setPullPushEnable(Boolean PullPushEnable) {
        this.PullPushEnable = PullPushEnable;
    }

    /**
     * Get <p>输入源音量百分比。默认为100。表示音量为原始大小。允许值[0,200]。</p> 
     * @return Volume <p>输入源音量百分比。默认为100。表示音量为原始大小。允许值[0,200]。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>输入源音量百分比。默认为100。表示音量为原始大小。允许值[0,200]。</p>
     * @param Volume <p>输入源音量百分比。默认为100。表示音量为原始大小。允许值[0,200]。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public CasterInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterInputInfo(CasterInputInfo source) {
        if (source.InputIndex != null) {
            this.InputIndex = new Long(source.InputIndex);
        }
        if (source.InputType != null) {
            this.InputType = new Long(source.InputType);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputUrls != null) {
            this.InputUrls = new String[source.InputUrls.length];
            for (int i = 0; i < source.InputUrls.length; i++) {
                this.InputUrls[i] = new String(source.InputUrls[i]);
            }
        }
        if (source.LoopEnable != null) {
            this.LoopEnable = new Boolean(source.LoopEnable);
        }
        if (source.LoopNumber != null) {
            this.LoopNumber = new Long(source.LoopNumber);
        }
        if (source.PullPushEnable != null) {
            this.PullPushEnable = new Boolean(source.PullPushEnable);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputIndex", this.InputIndex);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "InputUrls.", this.InputUrls);
        this.setParamSimple(map, prefix + "LoopEnable", this.LoopEnable);
        this.setParamSimple(map, prefix + "LoopNumber", this.LoopNumber);
        this.setParamSimple(map, prefix + "PullPushEnable", this.PullPushEnable);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

