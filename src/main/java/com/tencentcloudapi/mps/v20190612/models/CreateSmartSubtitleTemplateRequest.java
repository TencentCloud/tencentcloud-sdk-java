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

public class CreateSmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * <p>智能字幕模板名称<br>长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>智能字幕视频源语言</p><p>ASR识别和纯字幕翻译取值参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 识别支持语种</a></p><p>下面列举部分常用取值</p><p><code>auto</code>：自动识别，<code>zh</code>：简体中文，<code>en</code>：英语，<code>ja</code>：日语，<code>ko</code>：韩语，<code>zh-PY</code>：中英粤，<code>zh_medical</code>：中文医疗，<code>vi</code>：越南语，<code>ms</code>：马来语，<code>id</code>：印度尼西亚语，<code>fil</code>：菲律宾语，<code>th</code>：泰语，<code>pt</code>：葡萄牙语，<code>tr</code>：土耳其语，<code>ar</code>：阿拉伯语，<code>es</code>：西班牙语，<code>hi</code>：印地语，<code>fr</code>：法语，<code>de</code>：德语，<code>it</code>：意大利语，<code>zh_dialect</code>：中文方言，<code>zh_en</code>：中英，<code>yue</code>：粤语，<code>ru</code>：俄语，<code>prime_zh</code>：中英方言</p><p>OCR 识别仅支持以下取值：</p><p><code>zh_en</code>：中英<br><code>multi</code>：其他</p><p>不同取值支持的语种参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 识别支持语种</a></p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>智能字幕模板描述信息<br>长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>ASR热词库参数</p>
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>字幕翻译目标语言当TranslateSwitch为ON的时候生效，翻译语言列表：</p><p>ASR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 翻译支持语种</a><br>OCR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 翻译支持语种</a></p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p><p>部分常用语种示例：</p><p><code>ar</code>：阿拉伯语<br><code>en</code>：英语<br><code>fr</code>：法语<br><code>it</code>：意大利语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>ru</code>：俄语<br><code>th</code>：泰语<br><code>tr</code>：土耳其语<br><code>vi</code>：越南语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文</p>
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>字幕OCR提取框选区域配置</p>
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写。开启多个翻译语言时，不允许填写。</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>说话人识别开关，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认不开启说话人识别。</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认不输出到字幕文件。</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>智能字幕模板名称<br>长度限制：64 个字符。</p> 
     * @return Name <p>智能字幕模板名称<br>长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>智能字幕模板名称<br>长度限制：64 个字符。</p>
     * @param Name <p>智能字幕模板名称<br>长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>智能字幕视频源语言</p><p>ASR识别和纯字幕翻译取值参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 识别支持语种</a></p><p>下面列举部分常用取值</p><p><code>auto</code>：自动识别，<code>zh</code>：简体中文，<code>en</code>：英语，<code>ja</code>：日语，<code>ko</code>：韩语，<code>zh-PY</code>：中英粤，<code>zh_medical</code>：中文医疗，<code>vi</code>：越南语，<code>ms</code>：马来语，<code>id</code>：印度尼西亚语，<code>fil</code>：菲律宾语，<code>th</code>：泰语，<code>pt</code>：葡萄牙语，<code>tr</code>：土耳其语，<code>ar</code>：阿拉伯语，<code>es</code>：西班牙语，<code>hi</code>：印地语，<code>fr</code>：法语，<code>de</code>：德语，<code>it</code>：意大利语，<code>zh_dialect</code>：中文方言，<code>zh_en</code>：中英，<code>yue</code>：粤语，<code>ru</code>：俄语，<code>prime_zh</code>：中英方言</p><p>OCR 识别仅支持以下取值：</p><p><code>zh_en</code>：中英<br><code>multi</code>：其他</p><p>不同取值支持的语种参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 识别支持语种</a></p> 
     * @return VideoSrcLanguage <p>智能字幕视频源语言</p><p>ASR识别和纯字幕翻译取值参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 识别支持语种</a></p><p>下面列举部分常用取值</p><p><code>auto</code>：自动识别，<code>zh</code>：简体中文，<code>en</code>：英语，<code>ja</code>：日语，<code>ko</code>：韩语，<code>zh-PY</code>：中英粤，<code>zh_medical</code>：中文医疗，<code>vi</code>：越南语，<code>ms</code>：马来语，<code>id</code>：印度尼西亚语，<code>fil</code>：菲律宾语，<code>th</code>：泰语，<code>pt</code>：葡萄牙语，<code>tr</code>：土耳其语，<code>ar</code>：阿拉伯语，<code>es</code>：西班牙语，<code>hi</code>：印地语，<code>fr</code>：法语，<code>de</code>：德语，<code>it</code>：意大利语，<code>zh_dialect</code>：中文方言，<code>zh_en</code>：中英，<code>yue</code>：粤语，<code>ru</code>：俄语，<code>prime_zh</code>：中英方言</p><p>OCR 识别仅支持以下取值：</p><p><code>zh_en</code>：中英<br><code>multi</code>：其他</p><p>不同取值支持的语种参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 识别支持语种</a></p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>智能字幕视频源语言</p><p>ASR识别和纯字幕翻译取值参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 识别支持语种</a></p><p>下面列举部分常用取值</p><p><code>auto</code>：自动识别，<code>zh</code>：简体中文，<code>en</code>：英语，<code>ja</code>：日语，<code>ko</code>：韩语，<code>zh-PY</code>：中英粤，<code>zh_medical</code>：中文医疗，<code>vi</code>：越南语，<code>ms</code>：马来语，<code>id</code>：印度尼西亚语，<code>fil</code>：菲律宾语，<code>th</code>：泰语，<code>pt</code>：葡萄牙语，<code>tr</code>：土耳其语，<code>ar</code>：阿拉伯语，<code>es</code>：西班牙语，<code>hi</code>：印地语，<code>fr</code>：法语，<code>de</code>：德语，<code>it</code>：意大利语，<code>zh_dialect</code>：中文方言，<code>zh_en</code>：中英，<code>yue</code>：粤语，<code>ru</code>：俄语，<code>prime_zh</code>：中英方言</p><p>OCR 识别仅支持以下取值：</p><p><code>zh_en</code>：中英<br><code>multi</code>：其他</p><p>不同取值支持的语种参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 识别支持语种</a></p>
     * @param VideoSrcLanguage <p>智能字幕视频源语言</p><p>ASR识别和纯字幕翻译取值参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 识别支持语种</a></p><p>下面列举部分常用取值</p><p><code>auto</code>：自动识别，<code>zh</code>：简体中文，<code>en</code>：英语，<code>ja</code>：日语，<code>ko</code>：韩语，<code>zh-PY</code>：中英粤，<code>zh_medical</code>：中文医疗，<code>vi</code>：越南语，<code>ms</code>：马来语，<code>id</code>：印度尼西亚语，<code>fil</code>：菲律宾语，<code>th</code>：泰语，<code>pt</code>：葡萄牙语，<code>tr</code>：土耳其语，<code>ar</code>：阿拉伯语，<code>es</code>：西班牙语，<code>hi</code>：印地语，<code>fr</code>：法语，<code>de</code>：德语，<code>it</code>：意大利语，<code>zh_dialect</code>：中文方言，<code>zh_en</code>：中英，<code>yue</code>：粤语，<code>ru</code>：俄语，<code>prime_zh</code>：中英方言</p><p>OCR 识别仅支持以下取值：</p><p><code>zh_en</code>：中英<br><code>multi</code>：其他</p><p>不同取值支持的语种参考文档：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 识别支持语种</a></p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
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
     * Get <p>智能字幕模板描述信息<br>长度限制：256 个字符。</p> 
     * @return Comment <p>智能字幕模板描述信息<br>长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>智能字幕模板描述信息<br>长度限制：256 个字符。</p>
     * @param Comment <p>智能字幕模板描述信息<br>长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul> 
     * @return SubtitleFormat <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
     * @param SubtitleFormat <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>ASR热词库参数</p> 
     * @return AsrHotWordsConfigure <p>ASR热词库参数</p>
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR热词库参数</p>
     * @param AsrHotWordsConfigure <p>ASR热词库参数</p>
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p> 
     * @return TranslateSwitch <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
     * @param TranslateSwitch <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>字幕翻译目标语言当TranslateSwitch为ON的时候生效，翻译语言列表：</p><p>ASR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 翻译支持语种</a><br>OCR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 翻译支持语种</a></p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p><p>部分常用语种示例：</p><p><code>ar</code>：阿拉伯语<br><code>en</code>：英语<br><code>fr</code>：法语<br><code>it</code>：意大利语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>ru</code>：俄语<br><code>th</code>：泰语<br><code>tr</code>：土耳其语<br><code>vi</code>：越南语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文</p> 
     * @return TranslateDstLanguage <p>字幕翻译目标语言当TranslateSwitch为ON的时候生效，翻译语言列表：</p><p>ASR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 翻译支持语种</a><br>OCR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 翻译支持语种</a></p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p><p>部分常用语种示例：</p><p><code>ar</code>：阿拉伯语<br><code>en</code>：英语<br><code>fr</code>：法语<br><code>it</code>：意大利语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>ru</code>：俄语<br><code>th</code>：泰语<br><code>tr</code>：土耳其语<br><code>vi</code>：越南语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文</p>
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>字幕翻译目标语言当TranslateSwitch为ON的时候生效，翻译语言列表：</p><p>ASR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 翻译支持语种</a><br>OCR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 翻译支持语种</a></p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p><p>部分常用语种示例：</p><p><code>ar</code>：阿拉伯语<br><code>en</code>：英语<br><code>fr</code>：法语<br><code>it</code>：意大利语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>ru</code>：俄语<br><code>th</code>：泰语<br><code>tr</code>：土耳其语<br><code>vi</code>：越南语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文</p>
     * @param TranslateDstLanguage <p>字幕翻译目标语言当TranslateSwitch为ON的时候生效，翻译语言列表：</p><p>ASR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#ASRlanguages">ASR 翻译支持语种</a><br>OCR 提取翻译参考语种列表：<a href="https://cloud.tencent.com/document/product/862/116243#OCRlanguages">OCR 翻译支持语种</a></p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p><p>部分常用语种示例：</p><p><code>ar</code>：阿拉伯语<br><code>en</code>：英语<br><code>fr</code>：法语<br><code>it</code>：意大利语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>ru</code>：俄语<br><code>th</code>：泰语<br><code>tr</code>：土耳其语<br><code>vi</code>：越南语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：繁体中文</p>
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p> 
     * @return ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     * @param ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>字幕OCR提取框选区域配置</p> 
     * @return SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置</p>
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>字幕OCR提取框选区域配置</p>
     * @param SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置</p>
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写。开启多个翻译语言时，不允许填写。</p> 
     * @return SubtitleEmbedId <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写。开启多个翻译语言时，不允许填写。</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写。开启多个翻译语言时，不允许填写。</p>
     * @param SubtitleEmbedId <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写。开启多个翻译语言时，不允许填写。</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>说话人识别开关，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认不开启说话人识别。</p> 
     * @return SpeakerMode <p>说话人识别开关，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认不开启说话人识别。</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>说话人识别开关，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认不开启说话人识别。</p>
     * @param SpeakerMode <p>说话人识别开关，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认不开启说话人识别。</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认不输出到字幕文件。</p> 
     * @return SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认不输出到字幕文件。</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认不输出到字幕文件。</p>
     * @param SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认不输出到字幕文件。</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public CreateSmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSmartSubtitleTemplateRequest(CreateSmartSubtitleTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

