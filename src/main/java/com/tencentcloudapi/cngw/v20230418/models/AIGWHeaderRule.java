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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWHeaderRule extends AbstractModel {

    /**
    * <p>Header的Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Header匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * <p>Header匹配的值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>Header的Key</p> 
     * @return Key <p>Header的Key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Header的Key</p>
     * @param Key <p>Header的Key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Header匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul> 
     * @return MatchType <p>Header匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>Header匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     * @param MatchType <p>Header匹配规则</p><p>枚举值：</p><ul><li>Exact： 精确</li><li>Prefix： 前缀</li><li>Regex： 正则</li></ul>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get <p>Header匹配的值</p> 
     * @return Value <p>Header匹配的值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Header匹配的值</p>
     * @param Value <p>Header匹配的值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AIGWHeaderRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWHeaderRule(AIGWHeaderRule source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

