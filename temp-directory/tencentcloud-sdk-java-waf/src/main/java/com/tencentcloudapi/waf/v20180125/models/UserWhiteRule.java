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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserWhiteRule extends AbstractModel {

    /**
    * 白名单的id
    */
    @SerializedName("WhiteRuleId")
    @Expose
    private Long WhiteRuleId;

    /**
    * 规则id
    */
    @SerializedName("SignatureId")
    @Expose
    private String SignatureId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 白名单的id 
     * @return WhiteRuleId 白名单的id
     */
    public Long getWhiteRuleId() {
        return this.WhiteRuleId;
    }

    /**
     * Set 白名单的id
     * @param WhiteRuleId 白名单的id
     */
    public void setWhiteRuleId(Long WhiteRuleId) {
        this.WhiteRuleId = WhiteRuleId;
    }

    /**
     * Get 规则id 
     * @return SignatureId 规则id
     */
    public String getSignatureId() {
        return this.SignatureId;
    }

    /**
     * Set 规则id
     * @param SignatureId 规则id
     */
    public void setSignatureId(String SignatureId) {
        this.SignatureId = SignatureId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public UserWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserWhiteRule(UserWhiteRule source) {
        if (source.WhiteRuleId != null) {
            this.WhiteRuleId = new Long(source.WhiteRuleId);
        }
        if (source.SignatureId != null) {
            this.SignatureId = new String(source.SignatureId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MatchField != null) {
            this.MatchField = new String(source.MatchField);
        }
        if (source.MatchMethod != null) {
            this.MatchMethod = new String(source.MatchMethod);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteRuleId", this.WhiteRuleId);
        this.setParamSimple(map, prefix + "SignatureId", this.SignatureId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MatchField", this.MatchField);
        this.setParamSimple(map, prefix + "MatchMethod", this.MatchMethod);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

