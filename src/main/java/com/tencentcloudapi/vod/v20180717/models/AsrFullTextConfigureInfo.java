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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrFullTextConfigureInfo extends AbstractModel {

    /**
    * 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 生成的字幕文件格式列表，不填或者填空数组表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li><font color=red>注意：</font>云点播媒资信息仅支持添加 vtt 字幕，因此当且仅当 SubtitleFormats 包含 vtt 时，云点播将生成的字幕添加到媒资。
    */
    @SerializedName("SubtitleFormats")
    @Expose
    private String [] SubtitleFormats;

    /**
    * 生成的字幕文件格式，不填或者填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormats。</font>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
<font color=red>注意：</font> 填空字符串，或者不填该参数，则自动识别（效果较难保证，推荐填写原始媒体对应的语言，以提高识别的准确率）。
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示，若不填则云点播自动生成。
<font color=red>注意：</font>仅当 SubtitleFormats 包含 vtt 时，该字段有效。
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li> 
     * @return Switch 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li>
     * @param Switch 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 生成的字幕文件格式列表，不填或者填空数组表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li><font color=red>注意：</font>云点播媒资信息仅支持添加 vtt 字幕，因此当且仅当 SubtitleFormats 包含 vtt 时，云点播将生成的字幕添加到媒资。 
     * @return SubtitleFormats 生成的字幕文件格式列表，不填或者填空数组表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li><font color=red>注意：</font>云点播媒资信息仅支持添加 vtt 字幕，因此当且仅当 SubtitleFormats 包含 vtt 时，云点播将生成的字幕添加到媒资。
     */
    public String [] getSubtitleFormats() {
        return this.SubtitleFormats;
    }

    /**
     * Set 生成的字幕文件格式列表，不填或者填空数组表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li><font color=red>注意：</font>云点播媒资信息仅支持添加 vtt 字幕，因此当且仅当 SubtitleFormats 包含 vtt 时，云点播将生成的字幕添加到媒资。
     * @param SubtitleFormats 生成的字幕文件格式列表，不填或者填空数组表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li><font color=red>注意：</font>云点播媒资信息仅支持添加 vtt 字幕，因此当且仅当 SubtitleFormats 包含 vtt 时，云点播将生成的字幕添加到媒资。
     */
    public void setSubtitleFormats(String [] SubtitleFormats) {
        this.SubtitleFormats = SubtitleFormats;
    }

    /**
     * Get 生成的字幕文件格式，不填或者填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormats。</font> 
     * @return SubtitleFormat 生成的字幕文件格式，不填或者填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormats。</font>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 生成的字幕文件格式，不填或者填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormats。</font>
     * @param SubtitleFormat 生成的字幕文件格式，不填或者填空字符串表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormats。</font>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
<font color=red>注意：</font> 填空字符串，或者不填该参数，则自动识别（效果较难保证，推荐填写原始媒体对应的语言，以提高识别的准确率）。 
     * @return SrcLanguage 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
<font color=red>注意：</font> 填空字符串，或者不填该参数，则自动识别（效果较难保证，推荐填写原始媒体对应的语言，以提高识别的准确率）。
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
<font color=red>注意：</font> 填空字符串，或者不填该参数，则自动识别（效果较难保证，推荐填写原始媒体对应的语言，以提高识别的准确率）。
     * @param SrcLanguage 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
<font color=red>注意：</font> 填空字符串，或者不填该参数，则自动识别（效果较难保证，推荐填写原始媒体对应的语言，以提高识别的准确率）。
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示，若不填则云点播自动生成。
<font color=red>注意：</font>仅当 SubtitleFormats 包含 vtt 时，该字段有效。 
     * @return SubtitleName 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示，若不填则云点播自动生成。
<font color=red>注意：</font>仅当 SubtitleFormats 包含 vtt 时，该字段有效。
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示，若不填则云点播自动生成。
<font color=red>注意：</font>仅当 SubtitleFormats 包含 vtt 时，该字段有效。
     * @param SubtitleName 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示，若不填则云点播自动生成。
<font color=red>注意：</font>仅当 SubtitleFormats 包含 vtt 时，该字段有效。
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrFullTextConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrFullTextConfigureInfo(AsrFullTextConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubtitleFormats != null) {
            this.SubtitleFormats = new String[source.SubtitleFormats.length];
            for (int i = 0; i < source.SubtitleFormats.length; i++) {
                this.SubtitleFormats[i] = new String(source.SubtitleFormats[i]);
            }
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.SubtitleName != null) {
            this.SubtitleName = new String(source.SubtitleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "SubtitleFormats.", this.SubtitleFormats);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

