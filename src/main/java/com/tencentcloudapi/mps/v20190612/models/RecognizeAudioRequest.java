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

public class RecognizeAudioRequest extends AbstractModel {

    /**
    * base64编码的音频数据
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 识别目标语言，为空默认 auto 自动识别语种。
注：如果自动识别语种识别效果不佳，可以指定语种提高准确率

当前支持语言：
auto: 自动识别
zh: 简体中文
en: 英语
ja: 日语
ko: 韩语
vi: 越南语
ms: 马来语
id: 印度尼西亚语
fil: 菲律宾语
th: 泰语
pt: 葡萄牙语
tr: 土耳其语
ar: 阿拉伯语
es: 西班牙语
hi: 印地语
fr: 法语
de: 德语
it: 意大利语
yue: 粤语
ru: 俄语
af: 南非荷兰语
sq: 阿尔巴尼亚语
am: 阿姆哈拉语
hy: 亚美尼亚语
az: 阿塞拜疆语
eu: 巴斯克语
bn: 孟加拉语
bs: 波斯尼亚语
bg: 保加利亚语
my: 缅甸语
ca: 加泰罗尼亚语
hr: 克罗地亚语
cs: 捷克语
da: 丹麦语
nl: 荷兰语
et: 爱沙尼亚语
fi: 芬兰语
gl: 加利西亚语
ka: 格鲁吉亚语
el: 希腊语
gu: 古吉拉特语
iw: 希伯来语
hu: 匈牙利语
is: 冰岛语
jv: 爪哇语
kn: 卡纳达语
kk: 哈萨克语
km: 高棉语
rw: 卢旺达语
lo: 老挝语
lv: 拉脱维亚语
lt: 立陶宛语
mk: 马其顿语
ml: 马拉雅拉姆语
mr: 马拉地语
mn: 蒙古语
ne: 尼泊尔语
no: 博克马尔挪威语
fa: 波斯语
pl: 波兰语
ro: 罗马尼亚语
sr: 塞尔维亚语
si: 僧伽罗语
sk: 斯洛伐克语
sl: 斯洛文尼亚语
st: 南索托语
su: 巽他语
sw: 斯瓦希里语
sv: 瑞典语
ta: 泰米尔语
te: 泰卢固语
ts: 聪加语
uk: 乌克兰语
ur: 乌尔都语
uz: 乌兹别克语
ve: 文达语
xh: 科萨语
zu: 祖鲁语

    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 音频数据格式，默认为 pcm

支持的格式：pcm (16k 采样率的单声道 16 位采样 pcm 数据)
    */
    @SerializedName("AudioFormat")
    @Expose
    private String AudioFormat;

    /**
    * 扩展参数，默认不填，特殊需求使用
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get base64编码的音频数据 
     * @return AudioData base64编码的音频数据
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set base64编码的音频数据
     * @param AudioData base64编码的音频数据
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get 识别目标语言，为空默认 auto 自动识别语种。
注：如果自动识别语种识别效果不佳，可以指定语种提高准确率

当前支持语言：
auto: 自动识别
zh: 简体中文
en: 英语
ja: 日语
ko: 韩语
vi: 越南语
ms: 马来语
id: 印度尼西亚语
fil: 菲律宾语
th: 泰语
pt: 葡萄牙语
tr: 土耳其语
ar: 阿拉伯语
es: 西班牙语
hi: 印地语
fr: 法语
de: 德语
it: 意大利语
yue: 粤语
ru: 俄语
af: 南非荷兰语
sq: 阿尔巴尼亚语
am: 阿姆哈拉语
hy: 亚美尼亚语
az: 阿塞拜疆语
eu: 巴斯克语
bn: 孟加拉语
bs: 波斯尼亚语
bg: 保加利亚语
my: 缅甸语
ca: 加泰罗尼亚语
hr: 克罗地亚语
cs: 捷克语
da: 丹麦语
nl: 荷兰语
et: 爱沙尼亚语
fi: 芬兰语
gl: 加利西亚语
ka: 格鲁吉亚语
el: 希腊语
gu: 古吉拉特语
iw: 希伯来语
hu: 匈牙利语
is: 冰岛语
jv: 爪哇语
kn: 卡纳达语
kk: 哈萨克语
km: 高棉语
rw: 卢旺达语
lo: 老挝语
lv: 拉脱维亚语
lt: 立陶宛语
mk: 马其顿语
ml: 马拉雅拉姆语
mr: 马拉地语
mn: 蒙古语
ne: 尼泊尔语
no: 博克马尔挪威语
fa: 波斯语
pl: 波兰语
ro: 罗马尼亚语
sr: 塞尔维亚语
si: 僧伽罗语
sk: 斯洛伐克语
sl: 斯洛文尼亚语
st: 南索托语
su: 巽他语
sw: 斯瓦希里语
sv: 瑞典语
ta: 泰米尔语
te: 泰卢固语
ts: 聪加语
uk: 乌克兰语
ur: 乌尔都语
uz: 乌兹别克语
ve: 文达语
xh: 科萨语
zu: 祖鲁语
 
     * @return Source 识别目标语言，为空默认 auto 自动识别语种。
注：如果自动识别语种识别效果不佳，可以指定语种提高准确率

当前支持语言：
auto: 自动识别
zh: 简体中文
en: 英语
ja: 日语
ko: 韩语
vi: 越南语
ms: 马来语
id: 印度尼西亚语
fil: 菲律宾语
th: 泰语
pt: 葡萄牙语
tr: 土耳其语
ar: 阿拉伯语
es: 西班牙语
hi: 印地语
fr: 法语
de: 德语
it: 意大利语
yue: 粤语
ru: 俄语
af: 南非荷兰语
sq: 阿尔巴尼亚语
am: 阿姆哈拉语
hy: 亚美尼亚语
az: 阿塞拜疆语
eu: 巴斯克语
bn: 孟加拉语
bs: 波斯尼亚语
bg: 保加利亚语
my: 缅甸语
ca: 加泰罗尼亚语
hr: 克罗地亚语
cs: 捷克语
da: 丹麦语
nl: 荷兰语
et: 爱沙尼亚语
fi: 芬兰语
gl: 加利西亚语
ka: 格鲁吉亚语
el: 希腊语
gu: 古吉拉特语
iw: 希伯来语
hu: 匈牙利语
is: 冰岛语
jv: 爪哇语
kn: 卡纳达语
kk: 哈萨克语
km: 高棉语
rw: 卢旺达语
lo: 老挝语
lv: 拉脱维亚语
lt: 立陶宛语
mk: 马其顿语
ml: 马拉雅拉姆语
mr: 马拉地语
mn: 蒙古语
ne: 尼泊尔语
no: 博克马尔挪威语
fa: 波斯语
pl: 波兰语
ro: 罗马尼亚语
sr: 塞尔维亚语
si: 僧伽罗语
sk: 斯洛伐克语
sl: 斯洛文尼亚语
st: 南索托语
su: 巽他语
sw: 斯瓦希里语
sv: 瑞典语
ta: 泰米尔语
te: 泰卢固语
ts: 聪加语
uk: 乌克兰语
ur: 乌尔都语
uz: 乌兹别克语
ve: 文达语
xh: 科萨语
zu: 祖鲁语

     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 识别目标语言，为空默认 auto 自动识别语种。
注：如果自动识别语种识别效果不佳，可以指定语种提高准确率

当前支持语言：
auto: 自动识别
zh: 简体中文
en: 英语
ja: 日语
ko: 韩语
vi: 越南语
ms: 马来语
id: 印度尼西亚语
fil: 菲律宾语
th: 泰语
pt: 葡萄牙语
tr: 土耳其语
ar: 阿拉伯语
es: 西班牙语
hi: 印地语
fr: 法语
de: 德语
it: 意大利语
yue: 粤语
ru: 俄语
af: 南非荷兰语
sq: 阿尔巴尼亚语
am: 阿姆哈拉语
hy: 亚美尼亚语
az: 阿塞拜疆语
eu: 巴斯克语
bn: 孟加拉语
bs: 波斯尼亚语
bg: 保加利亚语
my: 缅甸语
ca: 加泰罗尼亚语
hr: 克罗地亚语
cs: 捷克语
da: 丹麦语
nl: 荷兰语
et: 爱沙尼亚语
fi: 芬兰语
gl: 加利西亚语
ka: 格鲁吉亚语
el: 希腊语
gu: 古吉拉特语
iw: 希伯来语
hu: 匈牙利语
is: 冰岛语
jv: 爪哇语
kn: 卡纳达语
kk: 哈萨克语
km: 高棉语
rw: 卢旺达语
lo: 老挝语
lv: 拉脱维亚语
lt: 立陶宛语
mk: 马其顿语
ml: 马拉雅拉姆语
mr: 马拉地语
mn: 蒙古语
ne: 尼泊尔语
no: 博克马尔挪威语
fa: 波斯语
pl: 波兰语
ro: 罗马尼亚语
sr: 塞尔维亚语
si: 僧伽罗语
sk: 斯洛伐克语
sl: 斯洛文尼亚语
st: 南索托语
su: 巽他语
sw: 斯瓦希里语
sv: 瑞典语
ta: 泰米尔语
te: 泰卢固语
ts: 聪加语
uk: 乌克兰语
ur: 乌尔都语
uz: 乌兹别克语
ve: 文达语
xh: 科萨语
zu: 祖鲁语

     * @param Source 识别目标语言，为空默认 auto 自动识别语种。
注：如果自动识别语种识别效果不佳，可以指定语种提高准确率

当前支持语言：
auto: 自动识别
zh: 简体中文
en: 英语
ja: 日语
ko: 韩语
vi: 越南语
ms: 马来语
id: 印度尼西亚语
fil: 菲律宾语
th: 泰语
pt: 葡萄牙语
tr: 土耳其语
ar: 阿拉伯语
es: 西班牙语
hi: 印地语
fr: 法语
de: 德语
it: 意大利语
yue: 粤语
ru: 俄语
af: 南非荷兰语
sq: 阿尔巴尼亚语
am: 阿姆哈拉语
hy: 亚美尼亚语
az: 阿塞拜疆语
eu: 巴斯克语
bn: 孟加拉语
bs: 波斯尼亚语
bg: 保加利亚语
my: 缅甸语
ca: 加泰罗尼亚语
hr: 克罗地亚语
cs: 捷克语
da: 丹麦语
nl: 荷兰语
et: 爱沙尼亚语
fi: 芬兰语
gl: 加利西亚语
ka: 格鲁吉亚语
el: 希腊语
gu: 古吉拉特语
iw: 希伯来语
hu: 匈牙利语
is: 冰岛语
jv: 爪哇语
kn: 卡纳达语
kk: 哈萨克语
km: 高棉语
rw: 卢旺达语
lo: 老挝语
lv: 拉脱维亚语
lt: 立陶宛语
mk: 马其顿语
ml: 马拉雅拉姆语
mr: 马拉地语
mn: 蒙古语
ne: 尼泊尔语
no: 博克马尔挪威语
fa: 波斯语
pl: 波兰语
ro: 罗马尼亚语
sr: 塞尔维亚语
si: 僧伽罗语
sk: 斯洛伐克语
sl: 斯洛文尼亚语
st: 南索托语
su: 巽他语
sw: 斯瓦希里语
sv: 瑞典语
ta: 泰米尔语
te: 泰卢固语
ts: 聪加语
uk: 乌克兰语
ur: 乌尔都语
uz: 乌兹别克语
ve: 文达语
xh: 科萨语
zu: 祖鲁语

     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 音频数据格式，默认为 pcm

支持的格式：pcm (16k 采样率的单声道 16 位采样 pcm 数据) 
     * @return AudioFormat 音频数据格式，默认为 pcm

支持的格式：pcm (16k 采样率的单声道 16 位采样 pcm 数据)
     */
    public String getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 音频数据格式，默认为 pcm

支持的格式：pcm (16k 采样率的单声道 16 位采样 pcm 数据)
     * @param AudioFormat 音频数据格式，默认为 pcm

支持的格式：pcm (16k 采样率的单声道 16 位采样 pcm 数据)
     */
    public void setAudioFormat(String AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get 扩展参数，默认不填，特殊需求使用 
     * @return UserExtPara 扩展参数，默认不填，特殊需求使用
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set 扩展参数，默认不填，特殊需求使用
     * @param UserExtPara 扩展参数，默认不填，特殊需求使用
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public RecognizeAudioRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAudioRequest(RecognizeAudioRequest source) {
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new String(source.AudioFormat);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

