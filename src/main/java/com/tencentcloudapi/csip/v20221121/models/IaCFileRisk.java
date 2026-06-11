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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IaCFileRisk extends AbstractModel {

    /**
    * <p>风险等级(0:低危,1:中危,2:高危,3:严重)</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>风险所在行数</p>
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>问题描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>修复建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get <p>风险等级(0:低危,1:中危,2:高危,3:严重)</p> 
     * @return Level <p>风险等级(0:低危,1:中危,2:高危,3:严重)</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>风险等级(0:低危,1:中危,2:高危,3:严重)</p>
     * @param Level <p>风险等级(0:低危,1:中危,2:高危,3:严重)</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>风险所在行数</p> 
     * @return Line <p>风险所在行数</p>
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set <p>风险所在行数</p>
     * @param Line <p>风险所在行数</p>
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>问题描述</p> 
     * @return Description <p>问题描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>问题描述</p>
     * @param Description <p>问题描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>修复建议</p> 
     * @return Suggestion <p>修复建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>修复建议</p>
     * @param Suggestion <p>修复建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public IaCFileRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IaCFileRisk(IaCFileRisk source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

