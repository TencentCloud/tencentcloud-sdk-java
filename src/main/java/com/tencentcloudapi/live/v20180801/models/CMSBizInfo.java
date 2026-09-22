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

public class CMSBizInfo extends AbstractModel {

    /**
    * <p>策略类型，可选值：<br>Text：文本ShortAudio：音频<br>Image:<br>图片。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>策略标识（自动生成）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>策略开通状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>策略配置。<br>json字符串。</p><p>具体取值方式如下：举例：色情：&quot;{"ability":{"asr_text":true,"audio":true},"asr_text_labels":{"porn":["OVR","Pornography","PornographyObscene"]},"audio_labels":{},"user_text_libs":["320fb40e-9305-4b00-a191-945c219b5cc0"]}&quot;    可选项： {     value: &#39;OVR&#39;,     text: t(&#39;低俗语音识别&#39;),     msg: t(&#39;示例：呻吟、娇喘、娇喘等性暗示相关的语音&#39;),   },   {     value: &#39;Pornography&#39;,     text: t(&#39;严重色情&#39;),     msg: t(&#39;性行为、性器官等相关描述&#39;),   },   {     value: &#39;PornographyObscene&#39;,     text: t(&#39;色情低俗&#39;),     msg: t(&#39;低俗行为、性暗示等相关描述&#39;),   }</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyConfig")
    @Expose
    private String StrategyConfig;

    /**
     * Get <p>策略类型，可选值：<br>Text：文本ShortAudio：音频<br>Image:<br>图片。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType <p>策略类型，可选值：<br>Text：文本ShortAudio：音频<br>Image:<br>图片。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>策略类型，可选值：<br>Text：文本ShortAudio：音频<br>Image:<br>图片。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType <p>策略类型，可选值：<br>Text：文本ShortAudio：音频<br>Image:<br>图片。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>策略标识（自动生成）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizType <p>策略标识（自动生成）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>策略标识（自动生成）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizType <p>策略标识（自动生成）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>策略开通状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>策略开通状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>策略开通状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>策略开通状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>策略配置。<br>json字符串。</p><p>具体取值方式如下：举例：色情：&quot;{"ability":{"asr_text":true,"audio":true},"asr_text_labels":{"porn":["OVR","Pornography","PornographyObscene"]},"audio_labels":{},"user_text_libs":["320fb40e-9305-4b00-a191-945c219b5cc0"]}&quot;    可选项： {     value: &#39;OVR&#39;,     text: t(&#39;低俗语音识别&#39;),     msg: t(&#39;示例：呻吟、娇喘、娇喘等性暗示相关的语音&#39;),   },   {     value: &#39;Pornography&#39;,     text: t(&#39;严重色情&#39;),     msg: t(&#39;性行为、性器官等相关描述&#39;),   },   {     value: &#39;PornographyObscene&#39;,     text: t(&#39;色情低俗&#39;),     msg: t(&#39;低俗行为、性暗示等相关描述&#39;),   }</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyConfig <p>策略配置。<br>json字符串。</p><p>具体取值方式如下：举例：色情：&quot;{"ability":{"asr_text":true,"audio":true},"asr_text_labels":{"porn":["OVR","Pornography","PornographyObscene"]},"audio_labels":{},"user_text_libs":["320fb40e-9305-4b00-a191-945c219b5cc0"]}&quot;    可选项： {     value: &#39;OVR&#39;,     text: t(&#39;低俗语音识别&#39;),     msg: t(&#39;示例：呻吟、娇喘、娇喘等性暗示相关的语音&#39;),   },   {     value: &#39;Pornography&#39;,     text: t(&#39;严重色情&#39;),     msg: t(&#39;性行为、性器官等相关描述&#39;),   },   {     value: &#39;PornographyObscene&#39;,     text: t(&#39;色情低俗&#39;),     msg: t(&#39;低俗行为、性暗示等相关描述&#39;),   }</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set <p>策略配置。<br>json字符串。</p><p>具体取值方式如下：举例：色情：&quot;{"ability":{"asr_text":true,"audio":true},"asr_text_labels":{"porn":["OVR","Pornography","PornographyObscene"]},"audio_labels":{},"user_text_libs":["320fb40e-9305-4b00-a191-945c219b5cc0"]}&quot;    可选项： {     value: &#39;OVR&#39;,     text: t(&#39;低俗语音识别&#39;),     msg: t(&#39;示例：呻吟、娇喘、娇喘等性暗示相关的语音&#39;),   },   {     value: &#39;Pornography&#39;,     text: t(&#39;严重色情&#39;),     msg: t(&#39;性行为、性器官等相关描述&#39;),   },   {     value: &#39;PornographyObscene&#39;,     text: t(&#39;色情低俗&#39;),     msg: t(&#39;低俗行为、性暗示等相关描述&#39;),   }</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyConfig <p>策略配置。<br>json字符串。</p><p>具体取值方式如下：举例：色情：&quot;{"ability":{"asr_text":true,"audio":true},"asr_text_labels":{"porn":["OVR","Pornography","PornographyObscene"]},"audio_labels":{},"user_text_libs":["320fb40e-9305-4b00-a191-945c219b5cc0"]}&quot;    可选项： {     value: &#39;OVR&#39;,     text: t(&#39;低俗语音识别&#39;),     msg: t(&#39;示例：呻吟、娇喘、娇喘等性暗示相关的语音&#39;),   },   {     value: &#39;Pornography&#39;,     text: t(&#39;严重色情&#39;),     msg: t(&#39;性行为、性器官等相关描述&#39;),   },   {     value: &#39;PornographyObscene&#39;,     text: t(&#39;色情低俗&#39;),     msg: t(&#39;低俗行为、性暗示等相关描述&#39;),   }</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyConfig(String StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    public CMSBizInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CMSBizInfo(CMSBizInfo source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.StrategyConfig != null) {
            this.StrategyConfig = new String(source.StrategyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StrategyConfig", this.StrategyConfig);

    }
}

