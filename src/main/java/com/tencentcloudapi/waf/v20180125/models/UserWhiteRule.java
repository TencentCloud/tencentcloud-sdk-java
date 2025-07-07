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
    * 匹配参数
    */
    @SerializedName("MatchParams")
    @Expose
    private String MatchParams;

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
    * 规则ID列表
    */
    @SerializedName("SignatureIds")
    @Expose
    private String [] SignatureIds;

    /**
    * 大类规则ID列表
    */
    @SerializedName("TypeIds")
    @Expose
    private String [] TypeIds;

    /**
    * 大类规则ID
    */
    @SerializedName("TypeId")
    @Expose
    private String TypeId;

    /**
    * 0:按照特定规则ID加白, 1:按照规则类型加白
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 匹配规则列表
    */
    @SerializedName("MatchInfo")
    @Expose
    private UserWhiteRuleItem [] MatchInfo;

    /**
    * MatchInfo字符串
    */
    @SerializedName("MatchInfoStr")
    @Expose
    private String MatchInfoStr;

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
     * Get 匹配参数 
     * @return MatchParams 匹配参数
     */
    public String getMatchParams() {
        return this.MatchParams;
    }

    /**
     * Set 匹配参数
     * @param MatchParams 匹配参数
     */
    public void setMatchParams(String MatchParams) {
        this.MatchParams = MatchParams;
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

    /**
     * Get 规则ID列表 
     * @return SignatureIds 规则ID列表
     */
    public String [] getSignatureIds() {
        return this.SignatureIds;
    }

    /**
     * Set 规则ID列表
     * @param SignatureIds 规则ID列表
     */
    public void setSignatureIds(String [] SignatureIds) {
        this.SignatureIds = SignatureIds;
    }

    /**
     * Get 大类规则ID列表 
     * @return TypeIds 大类规则ID列表
     */
    public String [] getTypeIds() {
        return this.TypeIds;
    }

    /**
     * Set 大类规则ID列表
     * @param TypeIds 大类规则ID列表
     */
    public void setTypeIds(String [] TypeIds) {
        this.TypeIds = TypeIds;
    }

    /**
     * Get 大类规则ID 
     * @return TypeId 大类规则ID
     */
    public String getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 大类规则ID
     * @param TypeId 大类规则ID
     */
    public void setTypeId(String TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 0:按照特定规则ID加白, 1:按照规则类型加白 
     * @return Mode 0:按照特定规则ID加白, 1:按照规则类型加白
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 0:按照特定规则ID加白, 1:按照规则类型加白
     * @param Mode 0:按照特定规则ID加白, 1:按照规则类型加白
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 规则名 
     * @return Name 规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名
     * @param Name 规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 匹配规则列表 
     * @return MatchInfo 匹配规则列表
     */
    public UserWhiteRuleItem [] getMatchInfo() {
        return this.MatchInfo;
    }

    /**
     * Set 匹配规则列表
     * @param MatchInfo 匹配规则列表
     */
    public void setMatchInfo(UserWhiteRuleItem [] MatchInfo) {
        this.MatchInfo = MatchInfo;
    }

    /**
     * Get MatchInfo字符串 
     * @return MatchInfoStr MatchInfo字符串
     */
    public String getMatchInfoStr() {
        return this.MatchInfoStr;
    }

    /**
     * Set MatchInfo字符串
     * @param MatchInfoStr MatchInfo字符串
     */
    public void setMatchInfoStr(String MatchInfoStr) {
        this.MatchInfoStr = MatchInfoStr;
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
        if (source.MatchParams != null) {
            this.MatchParams = new String(source.MatchParams);
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
        if (source.SignatureIds != null) {
            this.SignatureIds = new String[source.SignatureIds.length];
            for (int i = 0; i < source.SignatureIds.length; i++) {
                this.SignatureIds[i] = new String(source.SignatureIds[i]);
            }
        }
        if (source.TypeIds != null) {
            this.TypeIds = new String[source.TypeIds.length];
            for (int i = 0; i < source.TypeIds.length; i++) {
                this.TypeIds[i] = new String(source.TypeIds[i]);
            }
        }
        if (source.TypeId != null) {
            this.TypeId = new String(source.TypeId);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MatchInfo != null) {
            this.MatchInfo = new UserWhiteRuleItem[source.MatchInfo.length];
            for (int i = 0; i < source.MatchInfo.length; i++) {
                this.MatchInfo[i] = new UserWhiteRuleItem(source.MatchInfo[i]);
            }
        }
        if (source.MatchInfoStr != null) {
            this.MatchInfoStr = new String(source.MatchInfoStr);
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
        this.setParamSimple(map, prefix + "MatchParams", this.MatchParams);
        this.setParamSimple(map, prefix + "MatchMethod", this.MatchMethod);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "SignatureIds.", this.SignatureIds);
        this.setParamArraySimple(map, prefix + "TypeIds.", this.TypeIds);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "MatchInfo.", this.MatchInfo);
        this.setParamSimple(map, prefix + "MatchInfoStr", this.MatchInfoStr);

    }
}

