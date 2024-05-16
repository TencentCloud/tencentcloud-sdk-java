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
package com.tencentcloudapi.vtc.v20240223.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTranslateResult extends AbstractModel {

    /**
    * 原文本
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * 目标文本
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
     * Get 原文本 
     * @return SourceText 原文本
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set 原文本
     * @param SourceText 原文本
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get 目标文本 
     * @return TargetText 目标文本
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 目标文本
     * @param TargetText 目标文本
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    public AudioTranslateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTranslateResult(AudioTranslateResult source) {
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);

    }
}

