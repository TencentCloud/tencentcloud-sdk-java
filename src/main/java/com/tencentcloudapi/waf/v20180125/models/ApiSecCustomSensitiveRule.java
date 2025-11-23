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

public class ApiSecCustomSensitiveRule extends AbstractModel {

    /**
    * 参数位置
    */
    @SerializedName("Position")
    @Expose
    private String [] Position;

    /**
    * 匹配条件
    */
    @SerializedName("MatchKey")
    @Expose
    private String MatchKey;

    /**
    * 匹配值
    */
    @SerializedName("MatchValue")
    @Expose
    private String [] MatchValue;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 匹配符号，当匹配条件为关键字匹配和字符匹配的时候传该值,可传多个
    */
    @SerializedName("MatchCond")
    @Expose
    private String [] MatchCond;

    /**
    * 规则是否泛化，默认0表示不泛化
    */
    @SerializedName("IsPan")
    @Expose
    private Long IsPan;

    /**
     * Get 参数位置 
     * @return Position 参数位置
     */
    public String [] getPosition() {
        return this.Position;
    }

    /**
     * Set 参数位置
     * @param Position 参数位置
     */
    public void setPosition(String [] Position) {
        this.Position = Position;
    }

    /**
     * Get 匹配条件 
     * @return MatchKey 匹配条件
     */
    public String getMatchKey() {
        return this.MatchKey;
    }

    /**
     * Set 匹配条件
     * @param MatchKey 匹配条件
     */
    public void setMatchKey(String MatchKey) {
        this.MatchKey = MatchKey;
    }

    /**
     * Get 匹配值 
     * @return MatchValue 匹配值
     */
    public String [] getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set 匹配值
     * @param MatchValue 匹配值
     */
    public void setMatchValue(String [] MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 匹配符号，当匹配条件为关键字匹配和字符匹配的时候传该值,可传多个 
     * @return MatchCond 匹配符号，当匹配条件为关键字匹配和字符匹配的时候传该值,可传多个
     */
    public String [] getMatchCond() {
        return this.MatchCond;
    }

    /**
     * Set 匹配符号，当匹配条件为关键字匹配和字符匹配的时候传该值,可传多个
     * @param MatchCond 匹配符号，当匹配条件为关键字匹配和字符匹配的时候传该值,可传多个
     */
    public void setMatchCond(String [] MatchCond) {
        this.MatchCond = MatchCond;
    }

    /**
     * Get 规则是否泛化，默认0表示不泛化 
     * @return IsPan 规则是否泛化，默认0表示不泛化
     */
    public Long getIsPan() {
        return this.IsPan;
    }

    /**
     * Set 规则是否泛化，默认0表示不泛化
     * @param IsPan 规则是否泛化，默认0表示不泛化
     */
    public void setIsPan(Long IsPan) {
        this.IsPan = IsPan;
    }

    public ApiSecCustomSensitiveRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecCustomSensitiveRule(ApiSecCustomSensitiveRule source) {
        if (source.Position != null) {
            this.Position = new String[source.Position.length];
            for (int i = 0; i < source.Position.length; i++) {
                this.Position[i] = new String(source.Position[i]);
            }
        }
        if (source.MatchKey != null) {
            this.MatchKey = new String(source.MatchKey);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String[source.MatchValue.length];
            for (int i = 0; i < source.MatchValue.length; i++) {
                this.MatchValue[i] = new String(source.MatchValue[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.MatchCond != null) {
            this.MatchCond = new String[source.MatchCond.length];
            for (int i = 0; i < source.MatchCond.length; i++) {
                this.MatchCond[i] = new String(source.MatchCond[i]);
            }
        }
        if (source.IsPan != null) {
            this.IsPan = new Long(source.IsPan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Position.", this.Position);
        this.setParamSimple(map, prefix + "MatchKey", this.MatchKey);
        this.setParamArraySimple(map, prefix + "MatchValue.", this.MatchValue);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "MatchCond.", this.MatchCond);
        this.setParamSimple(map, prefix + "IsPan", this.IsPan);

    }
}

