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

public class SyncDubbingRequest extends AbstractModel {

    /**
    * 合成文本，语音合成时必填，文本长度不超过2000字符
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文本语言，不填默认中文。
当前支持语言：
zh	中文 (Chinese)
en	英语 (English)
ja	日语 (Japanese)
de	德语 (German)
fr	法语 (French)
ko	韩语 (Korean)
ru	俄语 (Russian)
uk	乌克兰语 (Ukrainian)
pt	葡萄牙语 (Portuguese)
it	意大利语 (Italian)
es	西班牙语 (Spanish)
id	印度尼西亚语 (Indonesian)
nl	荷兰语 (Dutch)
tr	土耳其语 (Turkish)
fil	菲律宾语 (Filipino)
ms	马来语 (Malay)
el	希腊语 (Greek)
fi	芬兰语 (Finnish)
hr	克罗地亚语 (Croatian)
sk	斯洛伐克语 (Slovak)
pl	波兰语 (Polish)
sv	瑞典语 (Swedish)
hi	印地语 (Hindi)
bg	保加利亚语 (Bulgarian)
ro	罗马尼亚语 (Romanian)
ar	阿拉伯语 (Arabic)
cs	捷克语 (Czech)
da	丹麦语 (Danish)
ta	泰米尔语 (Tamil)
hun	匈牙利语（Hungarian）
vi	越南语（Vietnamese）
no	挪威语（Norwegian）
yue	粤语（Cantonese）
th	泰语（Thai）
he	希伯来语（Hebrew）
ca	加泰罗尼亚语（Catalan）
nn	尼诺斯克语（Nynorsk）
af	阿非利卡语（Afrikaans）
fa	波斯语（Persian）
sl	斯洛文尼亚语（Slovenian）

    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * 音色Id，指定音色合成时填写，支持系统音色和克隆音色。
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 克隆音频base64编码。
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 克隆音频语言，默认中文。
当前支持语言同TextLang
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * 扩展参数，json字符串
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get 合成文本，语音合成时必填，文本长度不超过2000字符 
     * @return Text 合成文本，语音合成时必填，文本长度不超过2000字符
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 合成文本，语音合成时必填，文本长度不超过2000字符
     * @param Text 合成文本，语音合成时必填，文本长度不超过2000字符
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文本语言，不填默认中文。
当前支持语言：
zh	中文 (Chinese)
en	英语 (English)
ja	日语 (Japanese)
de	德语 (German)
fr	法语 (French)
ko	韩语 (Korean)
ru	俄语 (Russian)
uk	乌克兰语 (Ukrainian)
pt	葡萄牙语 (Portuguese)
it	意大利语 (Italian)
es	西班牙语 (Spanish)
id	印度尼西亚语 (Indonesian)
nl	荷兰语 (Dutch)
tr	土耳其语 (Turkish)
fil	菲律宾语 (Filipino)
ms	马来语 (Malay)
el	希腊语 (Greek)
fi	芬兰语 (Finnish)
hr	克罗地亚语 (Croatian)
sk	斯洛伐克语 (Slovak)
pl	波兰语 (Polish)
sv	瑞典语 (Swedish)
hi	印地语 (Hindi)
bg	保加利亚语 (Bulgarian)
ro	罗马尼亚语 (Romanian)
ar	阿拉伯语 (Arabic)
cs	捷克语 (Czech)
da	丹麦语 (Danish)
ta	泰米尔语 (Tamil)
hun	匈牙利语（Hungarian）
vi	越南语（Vietnamese）
no	挪威语（Norwegian）
yue	粤语（Cantonese）
th	泰语（Thai）
he	希伯来语（Hebrew）
ca	加泰罗尼亚语（Catalan）
nn	尼诺斯克语（Nynorsk）
af	阿非利卡语（Afrikaans）
fa	波斯语（Persian）
sl	斯洛文尼亚语（Slovenian）
 
     * @return TextLang 文本语言，不填默认中文。
当前支持语言：
zh	中文 (Chinese)
en	英语 (English)
ja	日语 (Japanese)
de	德语 (German)
fr	法语 (French)
ko	韩语 (Korean)
ru	俄语 (Russian)
uk	乌克兰语 (Ukrainian)
pt	葡萄牙语 (Portuguese)
it	意大利语 (Italian)
es	西班牙语 (Spanish)
id	印度尼西亚语 (Indonesian)
nl	荷兰语 (Dutch)
tr	土耳其语 (Turkish)
fil	菲律宾语 (Filipino)
ms	马来语 (Malay)
el	希腊语 (Greek)
fi	芬兰语 (Finnish)
hr	克罗地亚语 (Croatian)
sk	斯洛伐克语 (Slovak)
pl	波兰语 (Polish)
sv	瑞典语 (Swedish)
hi	印地语 (Hindi)
bg	保加利亚语 (Bulgarian)
ro	罗马尼亚语 (Romanian)
ar	阿拉伯语 (Arabic)
cs	捷克语 (Czech)
da	丹麦语 (Danish)
ta	泰米尔语 (Tamil)
hun	匈牙利语（Hungarian）
vi	越南语（Vietnamese）
no	挪威语（Norwegian）
yue	粤语（Cantonese）
th	泰语（Thai）
he	希伯来语（Hebrew）
ca	加泰罗尼亚语（Catalan）
nn	尼诺斯克语（Nynorsk）
af	阿非利卡语（Afrikaans）
fa	波斯语（Persian）
sl	斯洛文尼亚语（Slovenian）

     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set 文本语言，不填默认中文。
当前支持语言：
zh	中文 (Chinese)
en	英语 (English)
ja	日语 (Japanese)
de	德语 (German)
fr	法语 (French)
ko	韩语 (Korean)
ru	俄语 (Russian)
uk	乌克兰语 (Ukrainian)
pt	葡萄牙语 (Portuguese)
it	意大利语 (Italian)
es	西班牙语 (Spanish)
id	印度尼西亚语 (Indonesian)
nl	荷兰语 (Dutch)
tr	土耳其语 (Turkish)
fil	菲律宾语 (Filipino)
ms	马来语 (Malay)
el	希腊语 (Greek)
fi	芬兰语 (Finnish)
hr	克罗地亚语 (Croatian)
sk	斯洛伐克语 (Slovak)
pl	波兰语 (Polish)
sv	瑞典语 (Swedish)
hi	印地语 (Hindi)
bg	保加利亚语 (Bulgarian)
ro	罗马尼亚语 (Romanian)
ar	阿拉伯语 (Arabic)
cs	捷克语 (Czech)
da	丹麦语 (Danish)
ta	泰米尔语 (Tamil)
hun	匈牙利语（Hungarian）
vi	越南语（Vietnamese）
no	挪威语（Norwegian）
yue	粤语（Cantonese）
th	泰语（Thai）
he	希伯来语（Hebrew）
ca	加泰罗尼亚语（Catalan）
nn	尼诺斯克语（Nynorsk）
af	阿非利卡语（Afrikaans）
fa	波斯语（Persian）
sl	斯洛文尼亚语（Slovenian）

     * @param TextLang 文本语言，不填默认中文。
当前支持语言：
zh	中文 (Chinese)
en	英语 (English)
ja	日语 (Japanese)
de	德语 (German)
fr	法语 (French)
ko	韩语 (Korean)
ru	俄语 (Russian)
uk	乌克兰语 (Ukrainian)
pt	葡萄牙语 (Portuguese)
it	意大利语 (Italian)
es	西班牙语 (Spanish)
id	印度尼西亚语 (Indonesian)
nl	荷兰语 (Dutch)
tr	土耳其语 (Turkish)
fil	菲律宾语 (Filipino)
ms	马来语 (Malay)
el	希腊语 (Greek)
fi	芬兰语 (Finnish)
hr	克罗地亚语 (Croatian)
sk	斯洛伐克语 (Slovak)
pl	波兰语 (Polish)
sv	瑞典语 (Swedish)
hi	印地语 (Hindi)
bg	保加利亚语 (Bulgarian)
ro	罗马尼亚语 (Romanian)
ar	阿拉伯语 (Arabic)
cs	捷克语 (Czech)
da	丹麦语 (Danish)
ta	泰米尔语 (Tamil)
hun	匈牙利语（Hungarian）
vi	越南语（Vietnamese）
no	挪威语（Norwegian）
yue	粤语（Cantonese）
th	泰语（Thai）
he	希伯来语（Hebrew）
ca	加泰罗尼亚语（Catalan）
nn	尼诺斯克语（Nynorsk）
af	阿非利卡语（Afrikaans）
fa	波斯语（Persian）
sl	斯洛文尼亚语（Slovenian）

     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get 音色Id，指定音色合成时填写，支持系统音色和克隆音色。 
     * @return VoiceId 音色Id，指定音色合成时填写，支持系统音色和克隆音色。
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 音色Id，指定音色合成时填写，支持系统音色和克隆音色。
     * @param VoiceId 音色Id，指定音色合成时填写，支持系统音色和克隆音色。
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get 克隆音频base64编码。 
     * @return AudioData 克隆音频base64编码。
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set 克隆音频base64编码。
     * @param AudioData 克隆音频base64编码。
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get 克隆音频语言，默认中文。
当前支持语言同TextLang 
     * @return AudioLang 克隆音频语言，默认中文。
当前支持语言同TextLang
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set 克隆音频语言，默认中文。
当前支持语言同TextLang
     * @param AudioLang 克隆音频语言，默认中文。
当前支持语言同TextLang
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get 扩展参数，json字符串 
     * @return ExtParam 扩展参数，json字符串
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 扩展参数，json字符串
     * @param ExtParam 扩展参数，json字符串
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public SyncDubbingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingRequest(SyncDubbingRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioLang != null) {
            this.AudioLang = new String(source.AudioLang);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioLang", this.AudioLang);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

