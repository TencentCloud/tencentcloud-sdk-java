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

public class SmartSubtitleTemplateItem extends AbstractModel {

    /**
    * 智能字幕模板唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 智能字幕模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能字幕模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ASR热词库参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * 模板关联热词库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsLibraryName")
    @Expose
    private String AsrHotWordsLibraryName;

    /**
    * 智能字幕视频源语言列表：

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
    * 智能字幕文件格式
- vtt: WebVTT 格式
- srt: SRT格式
- original：与源字幕文件一致（用于纯字幕翻译模版）
- 不填或填空：不生成字幕文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

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
    * 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
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
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 智能字幕预设模板别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
     * Get 智能字幕模板唯一标识 
     * @return Definition 智能字幕模板唯一标识
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能字幕模板唯一标识
     * @param Definition 智能字幕模板唯一标识
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 智能字幕模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 智能字幕模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能字幕模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 智能字幕模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能字幕模板描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 智能字幕模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能字幕模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 智能字幕模板描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 模板类型，取值范围：
* Preset：系统预置模板；
* Custom：用户自定义模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 模板关联热词库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrHotWordsLibraryName 模板关联热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrHotWordsLibraryName() {
        return this.AsrHotWordsLibraryName;
    }

    /**
     * Set 模板关联热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrHotWordsLibraryName 模板关联热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrHotWordsLibraryName(String AsrHotWordsLibraryName) {
        this.AsrHotWordsLibraryName = AsrHotWordsLibraryName;
    }

    /**
     * Get 智能字幕视频源语言列表：

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
     * @return VideoSrcLanguage 智能字幕视频源语言列表：

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
     * Set 智能字幕视频源语言列表：

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
     * @param VideoSrcLanguage 智能字幕视频源语言列表：

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
     * Get 智能字幕文件格式
- vtt: WebVTT 格式
- srt: SRT格式
- original：与源字幕文件一致（用于纯字幕翻译模版）
- 不填或填空：不生成字幕文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleFormat 智能字幕文件格式
- vtt: WebVTT 格式
- srt: SRT格式
- original：与源字幕文件一致（用于纯字幕翻译模版）
- 不填或填空：不生成字幕文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 智能字幕文件格式
- vtt: WebVTT 格式
- srt: SRT格式
- original：与源字幕文件一致（用于纯字幕翻译模版）
- 不填或填空：不生成字幕文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleFormat 智能字幕文件格式
- vtt: WebVTT 格式
- srt: SRT格式
- original：与源字幕文件一致（用于纯字幕翻译模版）
- 不填或填空：不生成字幕文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

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
     * Get 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateSwitch 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateSwitch 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
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
当TranslateSwitch为ON的时候生效
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
当TranslateSwitch为ON的时候生效
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
当TranslateSwitch为ON的时候生效
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
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 智能字幕预设模板别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 智能字幕预设模板别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 智能字幕预设模板别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 智能字幕预设模板别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译 
     * @return ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
     * @param ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    public SmartSubtitleTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTemplateItem(SmartSubtitleTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.AsrHotWordsLibraryName != null) {
            this.AsrHotWordsLibraryName = new String(source.AsrHotWordsLibraryName);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "AsrHotWordsLibraryName", this.AsrHotWordsLibraryName);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);

    }
}

