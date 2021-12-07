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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleBaseInfo extends AbstractModel{

    /**
    * true: 默认策略，false:自定义策略
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 策略生效镜像数量
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * 策略Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 策略更新时间, 存在为空的情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 策略名字
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 编辑用户名称
    */
    @SerializedName("EditUserName")
    @Expose
    private String EditUserName;

    /**
    * true: 策略启用，false：策略禁用
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
     * Get true: 默认策略，false:自定义策略 
     * @return IsDefault true: 默认策略，false:自定义策略
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set true: 默认策略，false:自定义策略
     * @param IsDefault true: 默认策略，false:自定义策略
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 策略生效镜像数量 
     * @return EffectImageCount 策略生效镜像数量
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set 策略生效镜像数量
     * @param EffectImageCount 策略生效镜像数量
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get 策略Id 
     * @return RuleId 策略Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略Id
     * @param RuleId 策略Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 策略更新时间, 存在为空的情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 策略更新时间, 存在为空的情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 策略更新时间, 存在为空的情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 策略更新时间, 存在为空的情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 策略名字 
     * @return RuleName 策略名字
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 策略名字
     * @param RuleName 策略名字
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 编辑用户名称 
     * @return EditUserName 编辑用户名称
     */
    public String getEditUserName() {
        return this.EditUserName;
    }

    /**
     * Set 编辑用户名称
     * @param EditUserName 编辑用户名称
     */
    public void setEditUserName(String EditUserName) {
        this.EditUserName = EditUserName;
    }

    /**
     * Get true: 策略启用，false：策略禁用 
     * @return IsEnable true: 策略启用，false：策略禁用
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set true: 策略启用，false：策略禁用
     * @param IsEnable true: 策略启用，false：策略禁用
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public RuleBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleBaseInfo(RuleBaseInfo source) {
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.EditUserName != null) {
            this.EditUserName = new String(source.EditUserName);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "EditUserName", this.EditUserName);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);

    }
}

