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

public class SceneVideoExtraParam extends AbstractModel {

    /**
    * <p>指定输出分辨率。选项:720P, 1080P, 2K, 4K。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>指定输出视频的宽高比，示例：16:9。</p>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * <p>错峰模型，仅支持的模型可使用。</p>
    */
    @SerializedName("OffPeak")
    @Expose
    private Boolean OffPeak;

    /**
    * <p>自动添加水印，默认左上角添加 &quot;AI生成&quot; 标识。</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Boolean LogoAdd;

    /**
    * <p>使用音画同出。</p>
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * <p>生成背景音乐。</p>
    */
    @SerializedName("EnableBgm")
    @Expose
    private Boolean EnableBgm;

    /**
    * <p>对输入的Prompt进行优化。</p>
    */
    @SerializedName("EnablePromptEnhance")
    @Expose
    private Boolean EnablePromptEnhance;

    /**
    * <p>回调URL。</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get <p>指定输出分辨率。选项:720P, 1080P, 2K, 4K。</p> 
     * @return Resolution <p>指定输出分辨率。选项:720P, 1080P, 2K, 4K。</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>指定输出分辨率。选项:720P, 1080P, 2K, 4K。</p>
     * @param Resolution <p>指定输出分辨率。选项:720P, 1080P, 2K, 4K。</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>指定输出视频的宽高比，示例：16:9。</p> 
     * @return AspectRatio <p>指定输出视频的宽高比，示例：16:9。</p>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set <p>指定输出视频的宽高比，示例：16:9。</p>
     * @param AspectRatio <p>指定输出视频的宽高比，示例：16:9。</p>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get <p>错峰模型，仅支持的模型可使用。</p> 
     * @return OffPeak <p>错峰模型，仅支持的模型可使用。</p>
     */
    public Boolean getOffPeak() {
        return this.OffPeak;
    }

    /**
     * Set <p>错峰模型，仅支持的模型可使用。</p>
     * @param OffPeak <p>错峰模型，仅支持的模型可使用。</p>
     */
    public void setOffPeak(Boolean OffPeak) {
        this.OffPeak = OffPeak;
    }

    /**
     * Get <p>自动添加水印，默认左上角添加 &quot;AI生成&quot; 标识。</p> 
     * @return LogoAdd <p>自动添加水印，默认左上角添加 &quot;AI生成&quot; 标识。</p>
     */
    public Boolean getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>自动添加水印，默认左上角添加 &quot;AI生成&quot; 标识。</p>
     * @param LogoAdd <p>自动添加水印，默认左上角添加 &quot;AI生成&quot; 标识。</p>
     */
    public void setLogoAdd(Boolean LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>使用音画同出。</p> 
     * @return EnableAudio <p>使用音画同出。</p>
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set <p>使用音画同出。</p>
     * @param EnableAudio <p>使用音画同出。</p>
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get <p>生成背景音乐。</p> 
     * @return EnableBgm <p>生成背景音乐。</p>
     */
    public Boolean getEnableBgm() {
        return this.EnableBgm;
    }

    /**
     * Set <p>生成背景音乐。</p>
     * @param EnableBgm <p>生成背景音乐。</p>
     */
    public void setEnableBgm(Boolean EnableBgm) {
        this.EnableBgm = EnableBgm;
    }

    /**
     * Get <p>对输入的Prompt进行优化。</p> 
     * @return EnablePromptEnhance <p>对输入的Prompt进行优化。</p>
     */
    public Boolean getEnablePromptEnhance() {
        return this.EnablePromptEnhance;
    }

    /**
     * Set <p>对输入的Prompt进行优化。</p>
     * @param EnablePromptEnhance <p>对输入的Prompt进行优化。</p>
     */
    public void setEnablePromptEnhance(Boolean EnablePromptEnhance) {
        this.EnablePromptEnhance = EnablePromptEnhance;
    }

    /**
     * Get <p>回调URL。</p> 
     * @return CallbackUrl <p>回调URL。</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调URL。</p>
     * @param CallbackUrl <p>回调URL。</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public SceneVideoExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneVideoExtraParam(SceneVideoExtraParam source) {
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.OffPeak != null) {
            this.OffPeak = new Boolean(source.OffPeak);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Boolean(source.LogoAdd);
        }
        if (source.EnableAudio != null) {
            this.EnableAudio = new Boolean(source.EnableAudio);
        }
        if (source.EnableBgm != null) {
            this.EnableBgm = new Boolean(source.EnableBgm);
        }
        if (source.EnablePromptEnhance != null) {
            this.EnablePromptEnhance = new Boolean(source.EnablePromptEnhance);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "OffPeak", this.OffPeak);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamSimple(map, prefix + "EnableAudio", this.EnableAudio);
        this.setParamSimple(map, prefix + "EnableBgm", this.EnableBgm);
        this.setParamSimple(map, prefix + "EnablePromptEnhance", this.EnablePromptEnhance);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

