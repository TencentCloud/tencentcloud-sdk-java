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

public class KVParam extends AbstractModel{

    /**
    * 分隔符
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * key-value二次解析分隔符
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 保留源Key，默认为false不保留
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeepOriginalKey")
    @Expose
    private String KeepOriginalKey;

    /**
     * Get 分隔符 
     * @return Delimiter 分隔符
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 分隔符
     * @param Delimiter 分隔符
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get key-value二次解析分隔符 
     * @return Regex key-value二次解析分隔符
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set key-value二次解析分隔符
     * @param Regex key-value二次解析分隔符
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 保留源Key，默认为false不保留
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeepOriginalKey 保留源Key，默认为false不保留
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeepOriginalKey() {
        return this.KeepOriginalKey;
    }

    /**
     * Set 保留源Key，默认为false不保留
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeepOriginalKey 保留源Key，默认为false不保留
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeepOriginalKey(String KeepOriginalKey) {
        this.KeepOriginalKey = KeepOriginalKey;
    }

    public KVParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVParam(KVParam source) {
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.KeepOriginalKey != null) {
            this.KeepOriginalKey = new String(source.KeepOriginalKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "KeepOriginalKey", this.KeepOriginalKey);

    }
}

