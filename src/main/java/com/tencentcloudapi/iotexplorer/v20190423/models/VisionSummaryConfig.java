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

public class VisionSummaryConfig extends AbstractModel {

    /**
    * 主输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

    */
    @SerializedName("OutputLang")
    @Expose
    private String OutputLang;

    /**
    * 可选输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

    */
    @SerializedName("AlternativeOutputLang")
    @Expose
    private String AlternativeOutputLang;

    /**
    * 多摄像头布局定义。可能取值：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
    */
    @SerializedName("MultiCameraLayout")
    @Expose
    private String MultiCameraLayout;

    /**
     * Get 主输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语
 
     * @return OutputLang 主输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     */
    public String getOutputLang() {
        return this.OutputLang;
    }

    /**
     * Set 主输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     * @param OutputLang 主输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     */
    public void setOutputLang(String OutputLang) {
        this.OutputLang = OutputLang;
    }

    /**
     * Get 可选输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语
 
     * @return AlternativeOutputLang 可选输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     */
    public String getAlternativeOutputLang() {
        return this.AlternativeOutputLang;
    }

    /**
     * Set 可选输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     * @param AlternativeOutputLang 可选输出语言

支持列表如下：
zh 中文
en 英语
ja 日语
ko 韩文
pt-BR 葡萄牙语（巴西）
th 泰语

     */
    public void setAlternativeOutputLang(String AlternativeOutputLang) {
        this.AlternativeOutputLang = AlternativeOutputLang;
    }

    /**
     * Get 多摄像头布局定义。可能取值：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2` 
     * @return MultiCameraLayout 多摄像头布局定义。可能取值：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     */
    public String getMultiCameraLayout() {
        return this.MultiCameraLayout;
    }

    /**
     * Set 多摄像头布局定义。可能取值：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     * @param MultiCameraLayout 多摄像头布局定义。可能取值：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     */
    public void setMultiCameraLayout(String MultiCameraLayout) {
        this.MultiCameraLayout = MultiCameraLayout;
    }

    public VisionSummaryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionSummaryConfig(VisionSummaryConfig source) {
        if (source.OutputLang != null) {
            this.OutputLang = new String(source.OutputLang);
        }
        if (source.AlternativeOutputLang != null) {
            this.AlternativeOutputLang = new String(source.AlternativeOutputLang);
        }
        if (source.MultiCameraLayout != null) {
            this.MultiCameraLayout = new String(source.MultiCameraLayout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputLang", this.OutputLang);
        this.setParamSimple(map, prefix + "AlternativeOutputLang", this.AlternativeOutputLang);
        this.setParamSimple(map, prefix + "MultiCameraLayout", this.MultiCameraLayout);

    }
}

