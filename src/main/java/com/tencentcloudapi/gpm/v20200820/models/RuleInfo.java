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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInfo extends AbstractModel{

    /**
    * 规则名称 [a-zA-Z0-9-\.]*
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 规则脚本
    */
    @SerializedName("RuleScript")
    @Expose
    private String RuleScript;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
    * 关联匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchCodeList")
    @Expose
    private StringKV [] MatchCodeList;

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * 地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户OwnerUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
     * Get 规则名称 [a-zA-Z0-9-\.]* 
     * @return RuleName 规则名称 [a-zA-Z0-9-\.]*
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称 [a-zA-Z0-9-\.]*
     * @param RuleName 规则名称 [a-zA-Z0-9-\.]*
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDesc 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDesc 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 规则脚本 
     * @return RuleScript 规则脚本
     */
    public String getRuleScript() {
        return this.RuleScript;
    }

    /**
     * Set 规则脚本
     * @param RuleScript 规则脚本
     */
    public void setRuleScript(String RuleScript) {
        this.RuleScript = RuleScript;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 关联匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchCodeList 关联匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKV [] getMatchCodeList() {
        return this.MatchCodeList;
    }

    /**
     * Set 关联匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchCodeList 关联匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchCodeList(StringKV [] MatchCodeList) {
        this.MatchCodeList = MatchCodeList;
    }

    /**
     * Get 规则code 
     * @return RuleCode 规则code
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set 规则code
     * @param RuleCode 规则code
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
    }

    /**
     * Get 地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户OwnerUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 用户OwnerUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 用户OwnerUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 用户OwnerUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.RuleScript != null) {
            this.RuleScript = new String(source.RuleScript);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
        if (source.MatchCodeList != null) {
            this.MatchCodeList = new StringKV[source.MatchCodeList.length];
            for (int i = 0; i < source.MatchCodeList.length; i++) {
                this.MatchCodeList[i] = new StringKV(source.MatchCodeList[i]);
            }
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "RuleScript", this.RuleScript);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "MatchCodeList.", this.MatchCodeList);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);

    }
}

