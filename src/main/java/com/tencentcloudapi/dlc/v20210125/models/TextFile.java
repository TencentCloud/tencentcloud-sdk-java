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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextFile extends AbstractModel{

    /**
    * 文本类型，本参数取值为TextFile。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 处理文本用的正则表达式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get 文本类型，本参数取值为TextFile。 
     * @return Format 文本类型，本参数取值为TextFile。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 文本类型，本参数取值为TextFile。
     * @param Format 文本类型，本参数取值为TextFile。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 处理文本用的正则表达式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex 处理文本用的正则表达式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 处理文本用的正则表达式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex 处理文本用的正则表达式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public TextFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextFile(TextFile source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

