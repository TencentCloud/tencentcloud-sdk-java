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
    * <p>智能字幕模板唯一标识</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>智能字幕模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>智能字幕模板描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>模板类型，取值范围：</p><ul><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>模板关联热词库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsLibraryName")
    @Expose
    private String AsrHotWordsLibraryName;

    /**
    * <p>智能字幕视频源语言列表：</p><p><code>zh</code>：简体中文<br><code>yue</code>：中文粵语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>zh_dialect</code>：中文方言<br><code>prime_zh</code>：中英方言<br><code>zh_en</code>：中英<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语<br><code>auto</code>：自动识别（仅在纯字幕翻译中支持）</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>智能字幕文件格式</p><ul><li>vtt: WebVTT 格式</li><li>srt: SRT格式</li><li>original：与源字幕文件一致（用于纯字幕翻译模板）</li><li>不填或填空：不生成字幕文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>字幕翻译开关<br>ON: 开启翻译<br>OFF: 关闭翻译</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>智能字幕预设模板别名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2:  OCR识别字幕</li></ul>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>字幕OCR提取框选区域配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>字幕压制模板id</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>智能字幕模板唯一标识</p> 
     * @return Definition <p>智能字幕模板唯一标识</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>智能字幕模板唯一标识</p>
     * @param Definition <p>智能字幕模板唯一标识</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>智能字幕模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>智能字幕模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>智能字幕模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>智能字幕模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>智能字幕模板描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>智能字幕模板描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>智能字幕模板描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>智能字幕模板描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>模板类型，取值范围：</p><ul><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>模板类型，取值范围：</p><ul><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型，取值范围：</p><ul><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>模板类型，取值范围：</p><ul><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrHotWordsConfigure <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrHotWordsConfigure <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>模板关联热词库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrHotWordsLibraryName <p>模板关联热词库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrHotWordsLibraryName() {
        return this.AsrHotWordsLibraryName;
    }

    /**
     * Set <p>模板关联热词库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrHotWordsLibraryName <p>模板关联热词库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrHotWordsLibraryName(String AsrHotWordsLibraryName) {
        this.AsrHotWordsLibraryName = AsrHotWordsLibraryName;
    }

    /**
     * Get <p>智能字幕视频源语言列表：</p><p><code>zh</code>：简体中文<br><code>yue</code>：中文粵语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>zh_dialect</code>：中文方言<br><code>prime_zh</code>：中英方言<br><code>zh_en</code>：中英<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语<br><code>auto</code>：自动识别（仅在纯字幕翻译中支持）</p> 
     * @return VideoSrcLanguage <p>智能字幕视频源语言列表：</p><p><code>zh</code>：简体中文<br><code>yue</code>：中文粵语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>zh_dialect</code>：中文方言<br><code>prime_zh</code>：中英方言<br><code>zh_en</code>：中英<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语<br><code>auto</code>：自动识别（仅在纯字幕翻译中支持）</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>智能字幕视频源语言列表：</p><p><code>zh</code>：简体中文<br><code>yue</code>：中文粵语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>zh_dialect</code>：中文方言<br><code>prime_zh</code>：中英方言<br><code>zh_en</code>：中英<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语<br><code>auto</code>：自动识别（仅在纯字幕翻译中支持）</p>
     * @param VideoSrcLanguage <p>智能字幕视频源语言列表：</p><p><code>zh</code>：简体中文<br><code>yue</code>：中文粵语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>zh_dialect</code>：中文方言<br><code>prime_zh</code>：中英方言<br><code>zh_en</code>：中英<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语<br><code>auto</code>：自动识别（仅在纯字幕翻译中支持）</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>智能字幕文件格式</p><ul><li>vtt: WebVTT 格式</li><li>srt: SRT格式</li><li>original：与源字幕文件一致（用于纯字幕翻译模板）</li><li>不填或填空：不生成字幕文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleFormat <p>智能字幕文件格式</p><ul><li>vtt: WebVTT 格式</li><li>srt: SRT格式</li><li>original：与源字幕文件一致（用于纯字幕翻译模板）</li><li>不填或填空：不生成字幕文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>智能字幕文件格式</p><ul><li>vtt: WebVTT 格式</li><li>srt: SRT格式</li><li>original：与源字幕文件一致（用于纯字幕翻译模板）</li><li>不填或填空：不生成字幕文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleFormat <p>智能字幕文件格式</p><ul><li>vtt: WebVTT 格式</li><li>srt: SRT格式</li><li>original：与源字幕文件一致（用于纯字幕翻译模板）</li><li>不填或填空：不生成字幕文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p> 
     * @return SubtitleType <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     * @param SubtitleType <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>字幕翻译开关<br>ON: 开启翻译<br>OFF: 关闭翻译</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateSwitch <p>字幕翻译开关<br>ON: 开启翻译<br>OFF: 关闭翻译</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>字幕翻译开关<br>ON: 开启翻译<br>OFF: 关闭翻译</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateSwitch <p>字幕翻译开关<br>ON: 开启翻译<br>OFF: 关闭翻译</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateDstLanguage <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateDstLanguage <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>fr</code>：法语<br><code>es</code>：西班牙语<br><code>it</code>：意大利语<br><code>de</code>：德语<br><code>tr</code>：土耳其语<br><code>ru</code>：俄语<br><code>pt</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>vi</code>：越南语<br><code>id</code>：印度尼西亚语<br><code>ms</code>：马来语<br><code>th</code>：泰语<br><code>ar</code>：阿拉伯语<br><code>hi</code>：印地语<br><code>fil</code>：菲律宾语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     * @param CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p> 
     * @return UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     * @param UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/862/37710#52">ISO 日期格式</a>。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>智能字幕预设模板别名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName <p>智能字幕预设模板别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set <p>智能字幕预设模板别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName <p>智能字幕预设模板别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2:  OCR识别字幕</li></ul> 
     * @return ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2:  OCR识别字幕</li></ul>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2:  OCR识别字幕</li></ul>
     * @param ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2:  OCR识别字幕</li></ul>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>字幕OCR提取框选区域配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>字幕OCR提取框选区域配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>字幕压制模板id</p> 
     * @return SubtitleEmbedId <p>字幕压制模板id</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>字幕压制模板id</p>
     * @param SubtitleEmbedId <p>字幕压制模板id</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p> 
     * @return SpeakerMode <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     * @param SpeakerMode <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p> 
     * @return SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     * @param SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
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
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.SpeakerMode != null) {
            this.SpeakerMode = new Long(source.SpeakerMode);
        }
        if (source.SpeakerLabel != null) {
            this.SpeakerLabel = new Long(source.SpeakerLabel);
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
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

