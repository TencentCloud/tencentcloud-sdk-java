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

public class AsrTranslateConfigureInfoForUpdate extends AbstractModel {

    /**
    * 语音翻译任务开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 媒体源语言，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * 翻译目标语言。
当 SrcLanguage 为 zh（中文）时，取值范围：
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语。</li>
当 SrcLanguage 为 en（英文）时，取值范围：
<li>zh：中文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语；</li>
<li>ar：阿拉伯语；</li>
<li>hi：印地语。</li>
当 SrcLanguage 为 ja（日文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ko：韩文。</li>
当 SrcLanguage 为 ko（韩文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文。</li>
当 SrcLanguage 为 vi（越南语）或 ms（马来语）或 th（泰语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文。</li>
当 SrcLanguage 为 pt（葡萄牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语。</li>
当 SrcLanguage 为 tr（土耳其语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 es（西班牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 ar（阿拉伯语）或 hi（印地语）时，取值范围：
<li>en：英文。</li>
当 SrcLanguage 为 fr（法语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * 字幕格式列表操作信息。
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * 指定字幕名称，长度限制：64 个字符。该值将用于播放器展示。
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get 语音翻译任务开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li> 
     * @return Switch 语音翻译任务开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 语音翻译任务开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     * @param Switch 语音翻译任务开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 媒体源语言，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li> 
     * @return SrcLanguage 媒体源语言，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set 媒体源语言，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
     * @param SrcLanguage 媒体源语言，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get 翻译目标语言。
当 SrcLanguage 为 zh（中文）时，取值范围：
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语。</li>
当 SrcLanguage 为 en（英文）时，取值范围：
<li>zh：中文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语；</li>
<li>ar：阿拉伯语；</li>
<li>hi：印地语。</li>
当 SrcLanguage 为 ja（日文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ko：韩文。</li>
当 SrcLanguage 为 ko（韩文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文。</li>
当 SrcLanguage 为 vi（越南语）或 ms（马来语）或 th（泰语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文。</li>
当 SrcLanguage 为 pt（葡萄牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语。</li>
当 SrcLanguage 为 tr（土耳其语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 es（西班牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 ar（阿拉伯语）或 hi（印地语）时，取值范围：
<li>en：英文。</li>
当 SrcLanguage 为 fr（法语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li> 
     * @return DstLanguage 翻译目标语言。
当 SrcLanguage 为 zh（中文）时，取值范围：
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语。</li>
当 SrcLanguage 为 en（英文）时，取值范围：
<li>zh：中文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语；</li>
<li>ar：阿拉伯语；</li>
<li>hi：印地语。</li>
当 SrcLanguage 为 ja（日文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ko：韩文。</li>
当 SrcLanguage 为 ko（韩文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文。</li>
当 SrcLanguage 为 vi（越南语）或 ms（马来语）或 th（泰语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文。</li>
当 SrcLanguage 为 pt（葡萄牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语。</li>
当 SrcLanguage 为 tr（土耳其语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 es（西班牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 ar（阿拉伯语）或 hi（印地语）时，取值范围：
<li>en：英文。</li>
当 SrcLanguage 为 fr（法语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set 翻译目标语言。
当 SrcLanguage 为 zh（中文）时，取值范围：
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语。</li>
当 SrcLanguage 为 en（英文）时，取值范围：
<li>zh：中文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语；</li>
<li>ar：阿拉伯语；</li>
<li>hi：印地语。</li>
当 SrcLanguage 为 ja（日文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ko：韩文。</li>
当 SrcLanguage 为 ko（韩文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文。</li>
当 SrcLanguage 为 vi（越南语）或 ms（马来语）或 th（泰语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文。</li>
当 SrcLanguage 为 pt（葡萄牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语。</li>
当 SrcLanguage 为 tr（土耳其语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 es（西班牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 ar（阿拉伯语）或 hi（印地语）时，取值范围：
<li>en：英文。</li>
当 SrcLanguage 为 fr（法语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
     * @param DstLanguage 翻译目标语言。
当 SrcLanguage 为 zh（中文）时，取值范围：
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语。</li>
当 SrcLanguage 为 en（英文）时，取值范围：
<li>zh：中文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语；</li>
<li>vi：越南语；</li>
<li>id：印尼语；</li>
<li>th：泰语；</li>
<li>ms：马来语；</li>
<li>ar：阿拉伯语；</li>
<li>hi：印地语。</li>
当 SrcLanguage 为 ja（日文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ko：韩文。</li>
当 SrcLanguage 为 ko（韩文）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文。</li>
当 SrcLanguage 为 vi（越南语）或 ms（马来语）或 th（泰语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文。</li>
当 SrcLanguage 为 pt（葡萄牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语。</li>
当 SrcLanguage 为 tr（土耳其语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 es（西班牙语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>fr：法语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
当 SrcLanguage 为 ar（阿拉伯语）或 hi（印地语）时，取值范围：
<li>en：英文。</li>
当 SrcLanguage 为 fr（法语）时，取值范围：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>es：西班牙语；</li>
<li>it：意大利语；</li>
<li>de：德语；</li>
<li>tr：土耳其语；</li>
<li>ru：俄语；</li>
<li>pt：葡萄牙语。</li>
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
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

    public AsrTranslateConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrTranslateConfigureInfoForUpdate(AsrTranslateConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
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
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "DstLanguage", this.DstLanguage);
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

