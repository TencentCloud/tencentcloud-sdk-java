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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationParam extends AbstractModel {

    /**
    * <p>翻译的目标语言，示例值[&quot;en&quot;, &quot;ja&quot;]。目标语种列表[中文 &quot;zh&quot;，英语 &quot;en&quot;，越南语 &quot;vi&quot;，日语 &quot;ja&quot;，韩语 &quot;ko&quot;，印度尼西亚语 &quot;id&quot;，泰语 &quot;th&quot;，葡萄牙语 &quot;pt&quot;，阿拉伯语 &quot;ar&quot;，西班牙语 &quot;es&quot;，法语 &quot;fr&quot;，马来语 &quot;ms&quot;，德语 &quot;de&quot;，意大利语 &quot;it&quot;，俄语 &quot;ru&quot;]。</p>
    */
    @SerializedName("TargetLang")
    @Expose
    private String [] TargetLang;

    /**
    * <p>翻译术语表配置。</p>
    */
    @SerializedName("Terminologies")
    @Expose
    private TerminologyItem [] Terminologies;

    /**
     * Get <p>翻译的目标语言，示例值[&quot;en&quot;, &quot;ja&quot;]。目标语种列表[中文 &quot;zh&quot;，英语 &quot;en&quot;，越南语 &quot;vi&quot;，日语 &quot;ja&quot;，韩语 &quot;ko&quot;，印度尼西亚语 &quot;id&quot;，泰语 &quot;th&quot;，葡萄牙语 &quot;pt&quot;，阿拉伯语 &quot;ar&quot;，西班牙语 &quot;es&quot;，法语 &quot;fr&quot;，马来语 &quot;ms&quot;，德语 &quot;de&quot;，意大利语 &quot;it&quot;，俄语 &quot;ru&quot;]。</p> 
     * @return TargetLang <p>翻译的目标语言，示例值[&quot;en&quot;, &quot;ja&quot;]。目标语种列表[中文 &quot;zh&quot;，英语 &quot;en&quot;，越南语 &quot;vi&quot;，日语 &quot;ja&quot;，韩语 &quot;ko&quot;，印度尼西亚语 &quot;id&quot;，泰语 &quot;th&quot;，葡萄牙语 &quot;pt&quot;，阿拉伯语 &quot;ar&quot;，西班牙语 &quot;es&quot;，法语 &quot;fr&quot;，马来语 &quot;ms&quot;，德语 &quot;de&quot;，意大利语 &quot;it&quot;，俄语 &quot;ru&quot;]。</p>
     */
    public String [] getTargetLang() {
        return this.TargetLang;
    }

    /**
     * Set <p>翻译的目标语言，示例值[&quot;en&quot;, &quot;ja&quot;]。目标语种列表[中文 &quot;zh&quot;，英语 &quot;en&quot;，越南语 &quot;vi&quot;，日语 &quot;ja&quot;，韩语 &quot;ko&quot;，印度尼西亚语 &quot;id&quot;，泰语 &quot;th&quot;，葡萄牙语 &quot;pt&quot;，阿拉伯语 &quot;ar&quot;，西班牙语 &quot;es&quot;，法语 &quot;fr&quot;，马来语 &quot;ms&quot;，德语 &quot;de&quot;，意大利语 &quot;it&quot;，俄语 &quot;ru&quot;]。</p>
     * @param TargetLang <p>翻译的目标语言，示例值[&quot;en&quot;, &quot;ja&quot;]。目标语种列表[中文 &quot;zh&quot;，英语 &quot;en&quot;，越南语 &quot;vi&quot;，日语 &quot;ja&quot;，韩语 &quot;ko&quot;，印度尼西亚语 &quot;id&quot;，泰语 &quot;th&quot;，葡萄牙语 &quot;pt&quot;，阿拉伯语 &quot;ar&quot;，西班牙语 &quot;es&quot;，法语 &quot;fr&quot;，马来语 &quot;ms&quot;，德语 &quot;de&quot;，意大利语 &quot;it&quot;，俄语 &quot;ru&quot;]。</p>
     */
    public void setTargetLang(String [] TargetLang) {
        this.TargetLang = TargetLang;
    }

    /**
     * Get <p>翻译术语表配置。</p> 
     * @return Terminologies <p>翻译术语表配置。</p>
     */
    public TerminologyItem [] getTerminologies() {
        return this.Terminologies;
    }

    /**
     * Set <p>翻译术语表配置。</p>
     * @param Terminologies <p>翻译术语表配置。</p>
     */
    public void setTerminologies(TerminologyItem [] Terminologies) {
        this.Terminologies = Terminologies;
    }

    public TranslationParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationParam(TranslationParam source) {
        if (source.TargetLang != null) {
            this.TargetLang = new String[source.TargetLang.length];
            for (int i = 0; i < source.TargetLang.length; i++) {
                this.TargetLang[i] = new String(source.TargetLang[i]);
            }
        }
        if (source.Terminologies != null) {
            this.Terminologies = new TerminologyItem[source.Terminologies.length];
            for (int i = 0; i < source.Terminologies.length; i++) {
                this.Terminologies[i] = new TerminologyItem(source.Terminologies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetLang.", this.TargetLang);
        this.setParamArrayObj(map, prefix + "Terminologies.", this.Terminologies);

    }
}

