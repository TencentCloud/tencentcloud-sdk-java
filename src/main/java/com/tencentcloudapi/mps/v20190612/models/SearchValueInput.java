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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchValueInput extends AbstractModel {

    /**
    * 检索输入的类型，目前支持：
Text：文本检索
    */
    @SerializedName("SearchValueType")
    @Expose
    private String SearchValueType;

    /**
    * 当SearchValueType为Text时有效且必填，用于检索视频的文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextInput")
    @Expose
    private String TextInput;

    /**
     * Get 检索输入的类型，目前支持：
Text：文本检索 
     * @return SearchValueType 检索输入的类型，目前支持：
Text：文本检索
     */
    public String getSearchValueType() {
        return this.SearchValueType;
    }

    /**
     * Set 检索输入的类型，目前支持：
Text：文本检索
     * @param SearchValueType 检索输入的类型，目前支持：
Text：文本检索
     */
    public void setSearchValueType(String SearchValueType) {
        this.SearchValueType = SearchValueType;
    }

    /**
     * Get 当SearchValueType为Text时有效且必填，用于检索视频的文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextInput 当SearchValueType为Text时有效且必填，用于检索视频的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextInput() {
        return this.TextInput;
    }

    /**
     * Set 当SearchValueType为Text时有效且必填，用于检索视频的文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextInput 当SearchValueType为Text时有效且必填，用于检索视频的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextInput(String TextInput) {
        this.TextInput = TextInput;
    }

    public SearchValueInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchValueInput(SearchValueInput source) {
        if (source.SearchValueType != null) {
            this.SearchValueType = new String(source.SearchValueType);
        }
        if (source.TextInput != null) {
            this.TextInput = new String(source.TextInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchValueType", this.SearchValueType);
        this.setParamSimple(map, prefix + "TextInput", this.TextInput);

    }
}

