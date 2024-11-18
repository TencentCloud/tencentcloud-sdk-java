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

public class AsrFullTextConfigureInfoForUpdate extends AbstractModel {

    /**
    * 语音全文识别任务开关，可选值：
<li>ON：开启智能语音全文识别任务；</li>
<li>OFF：关闭智能语音全文识别任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 字幕格式列表操作信息。
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * 生成的字幕文件格式，<font color='red'>填空字符串</font>表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormatsOperation。</font>
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
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。
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
     * Get 字幕格式列表操作信息。 
     * @return SubtitleFormatsOperation 字幕格式列表操作信息。
     */
    public SubtitleFormatsOperation getSubtitleFormatsOperation() {
        return this.SubtitleFormatsOperation;
    }

    /**
     * Set 字幕格式列表操作信息。
     * @param SubtitleFormatsOperation 字幕格式列表操作信息。
     */
    public void setSubtitleFormatsOperation(SubtitleFormatsOperation SubtitleFormatsOperation) {
        this.SubtitleFormatsOperation = SubtitleFormatsOperation;
    }

    /**
     * Get 生成的字幕文件格式，<font color='red'>填空字符串</font>表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormatsOperation。</font> 
     * @return SubtitleFormat 生成的字幕文件格式，<font color='red'>填空字符串</font>表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormatsOperation。</font>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 生成的字幕文件格式，<font color='red'>填空字符串</font>表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormatsOperation。</font>
     * @param SubtitleFormat 生成的字幕文件格式，<font color='red'>填空字符串</font>表示不生成字幕文件，可选值：
<li>vtt：生成 WebVTT 字幕文件；</li>
<li>srt：生成 SRT 字幕文件。</li>
<font color='red'>注意：此字段已废弃，建议使用 SubtitleFormatsOperation。</font>
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
     * @return SrcLanguage 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
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
     * @param SrcLanguage 媒体源语言，取值范围：
<li>zh：中文普通话；</li>
<li>en：英语；</li>
<li>ja：日语；</li>
<li>zh-ca：粤语。</li>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。 
     * @return SubtitleName 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。
     * @param SubtitleName 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrFullTextConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrFullTextConfigureInfoForUpdate(AsrFullTextConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
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
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

