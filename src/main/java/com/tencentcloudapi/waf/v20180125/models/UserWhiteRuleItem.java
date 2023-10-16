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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserWhiteRuleItem extends AbstractModel{

    /**
    * 匹配域
    */
    @SerializedName("MatchField")
    @Expose
    private String MatchField;

    /**
    * 匹配方法
    */
    @SerializedName("MatchMethod")
    @Expose
    private String MatchMethod;

    /**
    * 匹配内容
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get 匹配域 
     * @return MatchField 匹配域
     */
    public String getMatchField() {
        return this.MatchField;
    }

    /**
     * Set 匹配域
     * @param MatchField 匹配域
     */
    public void setMatchField(String MatchField) {
        this.MatchField = MatchField;
    }

    /**
     * Get 匹配方法 
     * @return MatchMethod 匹配方法
     */
    public String getMatchMethod() {
        return this.MatchMethod;
    }

    /**
     * Set 匹配方法
     * @param MatchMethod 匹配方法
     */
    public void setMatchMethod(String MatchMethod) {
        this.MatchMethod = MatchMethod;
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

    public UserWhiteRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserWhiteRuleItem(UserWhiteRuleItem source) {
        if (source.MatchField != null) {
            this.MatchField = new String(source.MatchField);
        }
        if (source.MatchMethod != null) {
            this.MatchMethod = new String(source.MatchMethod);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchField", this.MatchField);
        this.setParamSimple(map, prefix + "MatchMethod", this.MatchMethod);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

