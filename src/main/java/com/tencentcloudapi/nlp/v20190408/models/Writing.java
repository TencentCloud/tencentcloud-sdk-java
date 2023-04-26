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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Writing extends AbstractModel{

    /**
    * 续写的文本。
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 续写的前缀。
    */
    @SerializedName("PrefixText")
    @Expose
    private String PrefixText;

    /**
     * Get 续写的文本。 
     * @return TargetText 续写的文本。
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 续写的文本。
     * @param TargetText 续写的文本。
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 续写的前缀。 
     * @return PrefixText 续写的前缀。
     */
    public String getPrefixText() {
        return this.PrefixText;
    }

    /**
     * Set 续写的前缀。
     * @param PrefixText 续写的前缀。
     */
    public void setPrefixText(String PrefixText) {
        this.PrefixText = PrefixText;
    }

    public Writing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Writing(Writing source) {
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.PrefixText != null) {
            this.PrefixText = new String(source.PrefixText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "PrefixText", this.PrefixText);

    }
}

