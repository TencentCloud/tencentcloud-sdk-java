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

public class CSVSerde extends AbstractModel{

    /**
    * CSV序列化转义符，默认为"\\"，最长8个字符，如 Escape: "/\"
    */
    @SerializedName("Escape")
    @Expose
    private String Escape;

    /**
    * CSV序列化字段域符，默认为"'"，最长8个字符, 如 Quote: "\""
    */
    @SerializedName("Quote")
    @Expose
    private String Quote;

    /**
    * CSV序列化分隔符，默认为"\t"，最长8个字符, 如 Separator: "\t"
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
     * Get CSV序列化转义符，默认为"\\"，最长8个字符，如 Escape: "/\" 
     * @return Escape CSV序列化转义符，默认为"\\"，最长8个字符，如 Escape: "/\"
     */
    public String getEscape() {
        return this.Escape;
    }

    /**
     * Set CSV序列化转义符，默认为"\\"，最长8个字符，如 Escape: "/\"
     * @param Escape CSV序列化转义符，默认为"\\"，最长8个字符，如 Escape: "/\"
     */
    public void setEscape(String Escape) {
        this.Escape = Escape;
    }

    /**
     * Get CSV序列化字段域符，默认为"'"，最长8个字符, 如 Quote: "\"" 
     * @return Quote CSV序列化字段域符，默认为"'"，最长8个字符, 如 Quote: "\""
     */
    public String getQuote() {
        return this.Quote;
    }

    /**
     * Set CSV序列化字段域符，默认为"'"，最长8个字符, 如 Quote: "\""
     * @param Quote CSV序列化字段域符，默认为"'"，最长8个字符, 如 Quote: "\""
     */
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }

    /**
     * Get CSV序列化分隔符，默认为"\t"，最长8个字符, 如 Separator: "\t" 
     * @return Separator CSV序列化分隔符，默认为"\t"，最长8个字符, 如 Separator: "\t"
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set CSV序列化分隔符，默认为"\t"，最长8个字符, 如 Separator: "\t"
     * @param Separator CSV序列化分隔符，默认为"\t"，最长8个字符, 如 Separator: "\t"
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    public CSVSerde() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSVSerde(CSVSerde source) {
        if (source.Escape != null) {
            this.Escape = new String(source.Escape);
        }
        if (source.Quote != null) {
            this.Quote = new String(source.Quote);
        }
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Escape", this.Escape);
        this.setParamSimple(map, prefix + "Quote", this.Quote);
        this.setParamSimple(map, prefix + "Separator", this.Separator);

    }
}

