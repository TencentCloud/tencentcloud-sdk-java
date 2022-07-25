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

public class ValueParam extends AbstractModel{

    /**
    * 处理模式，REPLACE替换，SUBSTR截取，DATE日期转换，TRIM去除前后空格，REGEX_REPLACE正则替换
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 替换，TYPE=REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replace")
    @Expose
    private ReplaceParam Replace;

    /**
    * 截取，TYPE=SUBSTR时必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Substr")
    @Expose
    private SubstrParam Substr;

    /**
    * 时间转换，TYPE=DATE时必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private DateParam Date;

    /**
    * 正则替换，TYPE=REGEX_REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegexReplace")
    @Expose
    private RegexReplaceParam RegexReplace;

    /**
     * Get 处理模式，REPLACE替换，SUBSTR截取，DATE日期转换，TRIM去除前后空格，REGEX_REPLACE正则替换 
     * @return Type 处理模式，REPLACE替换，SUBSTR截取，DATE日期转换，TRIM去除前后空格，REGEX_REPLACE正则替换
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 处理模式，REPLACE替换，SUBSTR截取，DATE日期转换，TRIM去除前后空格，REGEX_REPLACE正则替换
     * @param Type 处理模式，REPLACE替换，SUBSTR截取，DATE日期转换，TRIM去除前后空格，REGEX_REPLACE正则替换
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 替换，TYPE=REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replace 替换，TYPE=REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReplaceParam getReplace() {
        return this.Replace;
    }

    /**
     * Set 替换，TYPE=REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replace 替换，TYPE=REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplace(ReplaceParam Replace) {
        this.Replace = Replace;
    }

    /**
     * Get 截取，TYPE=SUBSTR时必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Substr 截取，TYPE=SUBSTR时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubstrParam getSubstr() {
        return this.Substr;
    }

    /**
     * Set 截取，TYPE=SUBSTR时必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Substr 截取，TYPE=SUBSTR时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubstr(SubstrParam Substr) {
        this.Substr = Substr;
    }

    /**
     * Get 时间转换，TYPE=DATE时必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 时间转换，TYPE=DATE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DateParam getDate() {
        return this.Date;
    }

    /**
     * Set 时间转换，TYPE=DATE时必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 时间转换，TYPE=DATE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(DateParam Date) {
        this.Date = Date;
    }

    /**
     * Get 正则替换，TYPE=REGEX_REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegexReplace 正则替换，TYPE=REGEX_REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegexReplaceParam getRegexReplace() {
        return this.RegexReplace;
    }

    /**
     * Set 正则替换，TYPE=REGEX_REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegexReplace 正则替换，TYPE=REGEX_REPLACE时必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegexReplace(RegexReplaceParam RegexReplace) {
        this.RegexReplace = RegexReplace;
    }

    public ValueParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueParam(ValueParam source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Replace != null) {
            this.Replace = new ReplaceParam(source.Replace);
        }
        if (source.Substr != null) {
            this.Substr = new SubstrParam(source.Substr);
        }
        if (source.Date != null) {
            this.Date = new DateParam(source.Date);
        }
        if (source.RegexReplace != null) {
            this.RegexReplace = new RegexReplaceParam(source.RegexReplace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Replace.", this.Replace);
        this.setParamObj(map, prefix + "Substr.", this.Substr);
        this.setParamObj(map, prefix + "Date.", this.Date);
        this.setParamObj(map, prefix + "RegexReplace.", this.RegexReplace);

    }
}

