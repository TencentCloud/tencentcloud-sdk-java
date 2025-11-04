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

public class RawSmartSubtitleParameter extends AbstractModel {

    /**
    * 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * 智能字幕视频源语言
当前支持以下语言：
`zh`：简体中文
`yue`：中文粵语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`zh_dialect`：中文方言
`prime_zh`：中英方言
`zh_en`：中英
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语
`auto`：自动识别（仅在纯字幕翻译中支持）
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译方式下，不允许传空或不传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`zh`：简体中文
`zh-TW`：繁体中文
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语 
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语 
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * 自定义参数
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译

**注意**：不传的情况下默认类型为 ASR识别字幕
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
     * Get 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2 
     * @return SubtitleType 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     * @param SubtitleType 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get 智能字幕视频源语言
当前支持以下语言：
`zh`：简体中文
`yue`：中文粵语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`zh_dialect`：中文方言
`prime_zh`：中英方言
`zh_en`：中英
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语
`auto`：自动识别（仅在纯字幕翻译中支持） 
     * @return VideoSrcLanguage 智能字幕视频源语言
当前支持以下语言：
`zh`：简体中文
`yue`：中文粵语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`zh_dialect`：中文方言
`prime_zh`：中英方言
`zh_en`：中英
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语
`auto`：自动识别（仅在纯字幕翻译中支持）
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set 智能字幕视频源语言
当前支持以下语言：
`zh`：简体中文
`yue`：中文粵语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`zh_dialect`：中文方言
`prime_zh`：中英方言
`zh_en`：中英
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语
`auto`：自动识别（仅在纯字幕翻译中支持）
     * @param VideoSrcLanguage 智能字幕视频源语言
当前支持以下语言：
`zh`：简体中文
`yue`：中文粵语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`zh_dialect`：中文方言
`prime_zh`：中英方言
`zh_en`：中英
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语
`auto`：自动识别（仅在纯字幕翻译中支持）
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译方式下，不允许传空或不传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleFormat 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译方式下，不允许传空或不传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译方式下，不允许传空或不传
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleFormat 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译方式下，不允许传空或不传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateSwitch 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateSwitch 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`zh`：简体中文
`zh-TW`：繁体中文
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语 
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语 
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`zh`：简体中文
`zh-TW`：繁体中文
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语 
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语 
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`zh`：简体中文
`zh-TW`：繁体中文
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语 
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语 
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`zh`：简体中文
`zh-TW`：繁体中文
`en`：英语
`ja`：日语
`ko`：韩语
`fr`：法语
`es`：西班牙语 
`it`：意大利语
`de`：德语
`tr`：土耳其语
`ru`：俄语
`pt`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`vi`：越南语
`id`：印度尼西亚语 
`ms`：马来语
`th`：泰语
`ar`：阿拉伯语
`hi`：印地语
`fil`：菲律宾语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrHotWordsConfigure ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrHotWordsConfigure ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get 自定义参数 
     * @return ExtInfo 自定义参数
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 自定义参数
     * @param ExtInfo 自定义参数
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译

**注意**：不传的情况下默认类型为 ASR识别字幕 
     * @return ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译

**注意**：不传的情况下默认类型为 ASR识别字幕
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译

**注意**：不传的情况下默认类型为 ASR识别字幕
     * @param ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译

**注意**：不传的情况下默认类型为 ASR识别字幕
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    public RawSmartSubtitleParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartSubtitleParameter(RawSmartSubtitleParameter source) {
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);

    }
}

