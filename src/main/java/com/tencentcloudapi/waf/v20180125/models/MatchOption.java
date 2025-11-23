/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchOption extends AbstractModel {

    /**
    * 匹配参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 逻辑符号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * 匹配内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 匹配参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 匹配参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 匹配参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 匹配参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 逻辑符号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Func 逻辑符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set 逻辑符号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Func 逻辑符号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get 匹配内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 匹配内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 匹配内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public MatchOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchOption(MatchOption source) {
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Func != null) {
            this.Func = new String(source.Func);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

