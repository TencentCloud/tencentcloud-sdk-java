/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ModifySmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * 智能字幕模板唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 智能字幕模板名称
长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能字幕模板描述信息
长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 智能字幕视频源语言
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
zh-PY：中英粤
zh-medical：中文医疗
yue：中文粤语
vi：越南语
ms：马来语
id：印度尼西亚语
fil：菲律宾语
th：泰语
pt：葡萄牙语
tr：土耳其语
ar：阿拉伯语
es：西班牙语
hi：印地语
fr：法语
de：德语
zh_dialect：中文方言
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * 智能字幕文件格式
 vtt: WebVTT 格式
不填或填空：不生成字幕文件
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
    * ASR热词库参数
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

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
     * Get 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译 
     * @return TranslateSwitch 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
     * @param TranslateSwitch 字幕翻译开关
ON: 开启翻译
OFF: 关闭翻译
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get 智能字幕模板名称
长度限制：64 个字符。 
     * @return Name 智能字幕模板名称
长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能字幕模板名称
长度限制：64 个字符。
     * @param Name 智能字幕模板名称
长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能字幕模板描述信息
长度限制：256 个字符。 
     * @return Comment 智能字幕模板描述信息
长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能字幕模板描述信息
长度限制：256 个字符。
     * @param Comment 智能字幕模板描述信息
长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 智能字幕视频源语言
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
zh-PY：中英粤
zh-medical：中文医疗
yue：中文粤语
vi：越南语
ms：马来语
id：印度尼西亚语
fil：菲律宾语
th：泰语
pt：葡萄牙语
tr：土耳其语
ar：阿拉伯语
es：西班牙语
hi：印地语
fr：法语
de：德语
zh_dialect：中文方言 
     * @return VideoSrcLanguage 智能字幕视频源语言
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
zh-PY：中英粤
zh-medical：中文医疗
yue：中文粤语
vi：越南语
ms：马来语
id：印度尼西亚语
fil：菲律宾语
th：泰语
pt：葡萄牙语
tr：土耳其语
ar：阿拉伯语
es：西班牙语
hi：印地语
fr：法语
de：德语
zh_dialect：中文方言
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set 智能字幕视频源语言
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
zh-PY：中英粤
zh-medical：中文医疗
yue：中文粤语
vi：越南语
ms：马来语
id：印度尼西亚语
fil：菲律宾语
th：泰语
pt：葡萄牙语
tr：土耳其语
ar：阿拉伯语
es：西班牙语
hi：印地语
fr：法语
de：德语
zh_dialect：中文方言
     * @param VideoSrcLanguage 智能字幕视频源语言
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
zh-PY：中英粤
zh-medical：中文医疗
yue：中文粤语
vi：越南语
ms：马来语
id：印度尼西亚语
fil：菲律宾语
th：泰语
pt：葡萄牙语
tr：土耳其语
ar：阿拉伯语
es：西班牙语
hi：印地语
fr：法语
de：德语
zh_dialect：中文方言
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get 智能字幕文件格式
 vtt: WebVTT 格式
不填或填空：不生成字幕文件 
     * @return SubtitleFormat 智能字幕文件格式
 vtt: WebVTT 格式
不填或填空：不生成字幕文件
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 智能字幕文件格式
 vtt: WebVTT 格式
不填或填空：不生成字幕文件
     * @param SubtitleFormat 智能字幕文件格式
 vtt: WebVTT 格式
不填或填空：不生成字幕文件
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
     * Get ASR热词库参数 
     * @return AsrHotWordsConfigure ASR热词库参数
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set ASR热词库参数
     * @param AsrHotWordsConfigure ASR热词库参数
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语 
     * @return TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     * @param TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    public ModifySmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmartSubtitleTemplateRequest(ModifySmartSubtitleTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);

    }
}

