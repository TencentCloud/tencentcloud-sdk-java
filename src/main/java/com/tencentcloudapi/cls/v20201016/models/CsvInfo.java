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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CsvInfo extends AbstractModel{

    /**
    * csv首行是否打印key
    */
    @SerializedName("PrintKey")
    @Expose
    private Boolean PrintKey;

    /**
    * 每列key的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * 各字段间的分隔符
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * 若字段内容中包含分隔符，则使用该转义符包裹改字段，只能填写单引号、双引号、空字符串
    */
    @SerializedName("EscapeChar")
    @Expose
    private String EscapeChar;

    /**
    * 对于上面指定的不存在字段使用该内容填充
    */
    @SerializedName("NonExistingField")
    @Expose
    private String NonExistingField;

    /**
     * Get csv首行是否打印key 
     * @return PrintKey csv首行是否打印key
     */
    public Boolean getPrintKey() {
        return this.PrintKey;
    }

    /**
     * Set csv首行是否打印key
     * @param PrintKey csv首行是否打印key
     */
    public void setPrintKey(Boolean PrintKey) {
        this.PrintKey = PrintKey;
    }

    /**
     * Get 每列key的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 每列key的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 每列key的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 每列key的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 各字段间的分隔符 
     * @return Delimiter 各字段间的分隔符
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 各字段间的分隔符
     * @param Delimiter 各字段间的分隔符
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get 若字段内容中包含分隔符，则使用该转义符包裹改字段，只能填写单引号、双引号、空字符串 
     * @return EscapeChar 若字段内容中包含分隔符，则使用该转义符包裹改字段，只能填写单引号、双引号、空字符串
     */
    public String getEscapeChar() {
        return this.EscapeChar;
    }

    /**
     * Set 若字段内容中包含分隔符，则使用该转义符包裹改字段，只能填写单引号、双引号、空字符串
     * @param EscapeChar 若字段内容中包含分隔符，则使用该转义符包裹改字段，只能填写单引号、双引号、空字符串
     */
    public void setEscapeChar(String EscapeChar) {
        this.EscapeChar = EscapeChar;
    }

    /**
     * Get 对于上面指定的不存在字段使用该内容填充 
     * @return NonExistingField 对于上面指定的不存在字段使用该内容填充
     */
    public String getNonExistingField() {
        return this.NonExistingField;
    }

    /**
     * Set 对于上面指定的不存在字段使用该内容填充
     * @param NonExistingField 对于上面指定的不存在字段使用该内容填充
     */
    public void setNonExistingField(String NonExistingField) {
        this.NonExistingField = NonExistingField;
    }

    public CsvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsvInfo(CsvInfo source) {
        if (source.PrintKey != null) {
            this.PrintKey = new Boolean(source.PrintKey);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.EscapeChar != null) {
            this.EscapeChar = new String(source.EscapeChar);
        }
        if (source.NonExistingField != null) {
            this.NonExistingField = new String(source.NonExistingField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrintKey", this.PrintKey);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "EscapeChar", this.EscapeChar);
        this.setParamSimple(map, prefix + "NonExistingField", this.NonExistingField);

    }
}

