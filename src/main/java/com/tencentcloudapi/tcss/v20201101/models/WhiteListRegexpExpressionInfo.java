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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteListRegexpExpressionInfo extends AbstractModel {

    /**
    * 逻辑符号
与 (AND)
或 (OR)
非 (NOT)
    */
    @SerializedName("LogicSymbol")
    @Expose
    private String LogicSymbol;

    /**
    * 匹配字段
    */
    @SerializedName("MatchField")
    @Expose
    private String MatchField;

    /**
    * 匹配内容
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get 逻辑符号
与 (AND)
或 (OR)
非 (NOT) 
     * @return LogicSymbol 逻辑符号
与 (AND)
或 (OR)
非 (NOT)
     */
    public String getLogicSymbol() {
        return this.LogicSymbol;
    }

    /**
     * Set 逻辑符号
与 (AND)
或 (OR)
非 (NOT)
     * @param LogicSymbol 逻辑符号
与 (AND)
或 (OR)
非 (NOT)
     */
    public void setLogicSymbol(String LogicSymbol) {
        this.LogicSymbol = LogicSymbol;
    }

    /**
     * Get 匹配字段 
     * @return MatchField 匹配字段
     */
    public String getMatchField() {
        return this.MatchField;
    }

    /**
     * Set 匹配字段
     * @param MatchField 匹配字段
     */
    public void setMatchField(String MatchField) {
        this.MatchField = MatchField;
    }

    /**
     * Get 匹配内容 
     * @return MatchContent 匹配内容
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set 匹配内容
     * @param MatchContent 匹配内容
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public WhiteListRegexpExpressionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteListRegexpExpressionInfo(WhiteListRegexpExpressionInfo source) {
        if (source.LogicSymbol != null) {
            this.LogicSymbol = new String(source.LogicSymbol);
        }
        if (source.MatchField != null) {
            this.MatchField = new String(source.MatchField);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicSymbol", this.LogicSymbol);
        this.setParamSimple(map, prefix + "MatchField", this.MatchField);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

