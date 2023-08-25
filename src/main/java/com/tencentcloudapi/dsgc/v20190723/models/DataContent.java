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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataContent extends AbstractModel{

    /**
    * 规则内容，可以是正则规则，关键词，
忽略词扥
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * 是否区分大小写
false: 不区分大小写
true:区分大小写
    */
    @SerializedName("IsIgnoreCase")
    @Expose
    private Boolean IsIgnoreCase;

    /**
     * Get 规则内容，可以是正则规则，关键词，
忽略词扥 
     * @return RuleContent 规则内容，可以是正则规则，关键词，
忽略词扥
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set 规则内容，可以是正则规则，关键词，
忽略词扥
     * @param RuleContent 规则内容，可以是正则规则，关键词，
忽略词扥
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get 是否区分大小写
false: 不区分大小写
true:区分大小写 
     * @return IsIgnoreCase 是否区分大小写
false: 不区分大小写
true:区分大小写
     */
    public Boolean getIsIgnoreCase() {
        return this.IsIgnoreCase;
    }

    /**
     * Set 是否区分大小写
false: 不区分大小写
true:区分大小写
     * @param IsIgnoreCase 是否区分大小写
false: 不区分大小写
true:区分大小写
     */
    public void setIsIgnoreCase(Boolean IsIgnoreCase) {
        this.IsIgnoreCase = IsIgnoreCase;
    }

    public DataContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataContent(DataContent source) {
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.IsIgnoreCase != null) {
            this.IsIgnoreCase = new Boolean(source.IsIgnoreCase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "IsIgnoreCase", this.IsIgnoreCase);

    }
}

