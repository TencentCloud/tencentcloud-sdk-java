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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseParam extends AbstractModel{

    /**
    * 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取，SOURCE处理上层所有结果
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 分隔符、正则表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 需再次处理的KEY——模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputValueType")
    @Expose
    private String InputValueType;

    /**
    * 需再次处理的KEY——KEY表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputValue")
    @Expose
    private String InputValue;

    /**
     * Get 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取，SOURCE处理上层所有结果 
     * @return Format 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取，SOURCE处理上层所有结果
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取，SOURCE处理上层所有结果
     * @param Format 解析格式，JSON，DELIMITER分隔符，REGULAR正则提取，SOURCE处理上层所有结果
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 分隔符、正则表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regex 分隔符、正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 分隔符、正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regex 分隔符、正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 需再次处理的KEY——模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputValueType 需再次处理的KEY——模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputValueType() {
        return this.InputValueType;
    }

    /**
     * Set 需再次处理的KEY——模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputValueType 需再次处理的KEY——模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputValueType(String InputValueType) {
        this.InputValueType = InputValueType;
    }

    /**
     * Get 需再次处理的KEY——KEY表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputValue 需再次处理的KEY——KEY表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputValue() {
        return this.InputValue;
    }

    /**
     * Set 需再次处理的KEY——KEY表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputValue 需再次处理的KEY——KEY表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputValue(String InputValue) {
        this.InputValue = InputValue;
    }

    public AnalyseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseParam(AnalyseParam source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.InputValueType != null) {
            this.InputValueType = new String(source.InputValueType);
        }
        if (source.InputValue != null) {
            this.InputValue = new String(source.InputValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "InputValueType", this.InputValueType);
        this.setParamSimple(map, prefix + "InputValue", this.InputValue);

    }
}

