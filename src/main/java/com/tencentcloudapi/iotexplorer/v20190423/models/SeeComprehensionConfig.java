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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeComprehensionConfig extends AbstractModel {

    /**
    * <p>拓展的目标及事件检测类别</p>
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
    */
    @SerializedName("OutputLang")
    @Expose
    private String OutputLang;

    /**
    * <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
    */
    @SerializedName("AlternativeOutputLang")
    @Expose
    private String AlternativeOutputLang;

    /**
    * <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
    */
    @SerializedName("MultiCameraLayout")
    @Expose
    private String MultiCameraLayout;

    /**
    * <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
     * Get <p>拓展的目标及事件检测类别</p> 
     * @return DetectTypes <p>拓展的目标及事件检测类别</p>
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set <p>拓展的目标及事件检测类别</p>
     * @param DetectTypes <p>拓展的目标及事件检测类别</p>
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    /**
     * Get <p>使该视频 / 图片录入搜索库，后续可进行搜索</p> 
     * @return EnableSearch <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     * @param EnableSearch <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul> 
     * @return OutputLang <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public String getOutputLang() {
        return this.OutputLang;
    }

    /**
     * Set <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     * @param OutputLang <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public void setOutputLang(String OutputLang) {
        this.OutputLang = OutputLang;
    }

    /**
     * Get <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul> 
     * @return AlternativeOutputLang <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public String getAlternativeOutputLang() {
        return this.AlternativeOutputLang;
    }

    /**
     * Set <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     * @param AlternativeOutputLang <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public void setAlternativeOutputLang(String AlternativeOutputLang) {
        this.AlternativeOutputLang = AlternativeOutputLang;
    }

    /**
     * Get <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul> 
     * @return MultiCameraLayout <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     */
    public String getMultiCameraLayout() {
        return this.MultiCameraLayout;
    }

    /**
     * Set <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     * @param MultiCameraLayout <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     */
    public void setMultiCameraLayout(String MultiCameraLayout) {
        this.MultiCameraLayout = MultiCameraLayout;
    }

    /**
     * Get <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p> 
     * @return MaxDuration <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     * @param MaxDuration <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    public SeeComprehensionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeComprehensionConfig(SeeComprehensionConfig source) {
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.OutputLang != null) {
            this.OutputLang = new String(source.OutputLang);
        }
        if (source.AlternativeOutputLang != null) {
            this.AlternativeOutputLang = new String(source.AlternativeOutputLang);
        }
        if (source.MultiCameraLayout != null) {
            this.MultiCameraLayout = new String(source.MultiCameraLayout);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "OutputLang", this.OutputLang);
        this.setParamSimple(map, prefix + "AlternativeOutputLang", this.AlternativeOutputLang);
        this.setParamSimple(map, prefix + "MultiCameraLayout", this.MultiCameraLayout);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);

    }
}

