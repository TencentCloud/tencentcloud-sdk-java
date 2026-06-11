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

public class TerminologyItem extends AbstractModel {

    /**
    * <p>翻译目标语言。</p>
    */
    @SerializedName("TargetLang")
    @Expose
    private String TargetLang;

    /**
    * <p>翻译目标语言对应的翻译术语配置。</p>
    */
    @SerializedName("Terminology")
    @Expose
    private TermPair [] Terminology;

    /**
     * Get <p>翻译目标语言。</p> 
     * @return TargetLang <p>翻译目标语言。</p>
     */
    public String getTargetLang() {
        return this.TargetLang;
    }

    /**
     * Set <p>翻译目标语言。</p>
     * @param TargetLang <p>翻译目标语言。</p>
     */
    public void setTargetLang(String TargetLang) {
        this.TargetLang = TargetLang;
    }

    /**
     * Get <p>翻译目标语言对应的翻译术语配置。</p> 
     * @return Terminology <p>翻译目标语言对应的翻译术语配置。</p>
     */
    public TermPair [] getTerminology() {
        return this.Terminology;
    }

    /**
     * Set <p>翻译目标语言对应的翻译术语配置。</p>
     * @param Terminology <p>翻译目标语言对应的翻译术语配置。</p>
     */
    public void setTerminology(TermPair [] Terminology) {
        this.Terminology = Terminology;
    }

    public TerminologyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminologyItem(TerminologyItem source) {
        if (source.TargetLang != null) {
            this.TargetLang = new String(source.TargetLang);
        }
        if (source.Terminology != null) {
            this.Terminology = new TermPair[source.Terminology.length];
            for (int i = 0; i < source.Terminology.length; i++) {
                this.Terminology[i] = new TermPair(source.Terminology[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetLang", this.TargetLang);
        this.setParamArrayObj(map, prefix + "Terminology.", this.Terminology);

    }
}

