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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ACLCondition extends AbstractModel{

    /**
    * 匹配字段
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * 匹配字符串
    */
    @SerializedName("MatchParam")
    @Expose
    private String MatchParam;

    /**
    * 匹配关系
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 匹配内容
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get 匹配字段 
     * @return MatchFrom 匹配字段
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set 匹配字段
     * @param MatchFrom 匹配字段
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get 匹配字符串 
     * @return MatchParam 匹配字符串
     */
    public String getMatchParam() {
        return this.MatchParam;
    }

    /**
     * Set 匹配字符串
     * @param MatchParam 匹配字符串
     */
    public void setMatchParam(String MatchParam) {
        this.MatchParam = MatchParam;
    }

    /**
     * Get 匹配关系 
     * @return Operator 匹配关系
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 匹配关系
     * @param Operator 匹配关系
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
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

    public ACLCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ACLCondition(ACLCondition source) {
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.MatchParam != null) {
            this.MatchParam = new String(source.MatchParam);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchParam", this.MatchParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

