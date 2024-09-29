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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyWordResult extends AbstractModel {

    /**
    * 关键词库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordLibID")
    @Expose
    private String KeyWordLibID;

    /**
    * 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWordLibName")
    @Expose
    private String KeyWordLibName;

    /**
    * 匹配到的关键词
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
     * Get 关键词库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordLibID 关键词库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyWordLibID() {
        return this.KeyWordLibID;
    }

    /**
     * Set 关键词库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordLibID 关键词库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordLibID(String KeyWordLibID) {
        this.KeyWordLibID = KeyWordLibID;
    }

    /**
     * Get 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWordLibName 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyWordLibName() {
        return this.KeyWordLibName;
    }

    /**
     * Set 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWordLibName 关键词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWordLibName(String KeyWordLibName) {
        this.KeyWordLibName = KeyWordLibName;
    }

    /**
     * Get 匹配到的关键词
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyWords 匹配到的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 匹配到的关键词
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyWords 匹配到的关键词
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    public KeyWordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyWordResult(KeyWordResult source) {
        if (source.KeyWordLibID != null) {
            this.KeyWordLibID = new String(source.KeyWordLibID);
        }
        if (source.KeyWordLibName != null) {
            this.KeyWordLibName = new String(source.KeyWordLibName);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String[source.KeyWords.length];
            for (int i = 0; i < source.KeyWords.length; i++) {
                this.KeyWords[i] = new String(source.KeyWords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyWordLibID", this.KeyWordLibID);
        this.setParamSimple(map, prefix + "KeyWordLibName", this.KeyWordLibName);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);

    }
}

