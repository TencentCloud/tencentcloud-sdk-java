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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageDenyRule extends AbstractModel {

    /**
    * 规则RuleID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 生效的镜像数量
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
    */
    @SerializedName("IsEffectAllImage")
    @Expose
    private Long IsEffectAllImage;

    /**
    * 规则开始生效时间
    */
    @SerializedName("EffectTime")
    @Expose
    private String EffectTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 操作用户
    */
    @SerializedName("OperationUin")
    @Expose
    private String OperationUin;

    /**
    * 启用状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
    */
    @SerializedName("EffectStatus")
    @Expose
    private String EffectStatus;

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get 规则RuleID 
     * @return RuleID 规则RuleID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则RuleID
     * @param RuleID 规则RuleID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权 
     * @return RuleType 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     * @param RuleType 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 生效的镜像数量 
     * @return EffectImageCount 生效的镜像数量
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set 生效的镜像数量
     * @param EffectImageCount 生效的镜像数量
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像 
     * @return IsEffectAllImage 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     */
    public Long getIsEffectAllImage() {
        return this.IsEffectAllImage;
    }

    /**
     * Set 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     * @param IsEffectAllImage 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     */
    public void setIsEffectAllImage(Long IsEffectAllImage) {
        this.IsEffectAllImage = IsEffectAllImage;
    }

    /**
     * Get 规则开始生效时间 
     * @return EffectTime 规则开始生效时间
     */
    public String getEffectTime() {
        return this.EffectTime;
    }

    /**
     * Set 规则开始生效时间
     * @param EffectTime 规则开始生效时间
     */
    public void setEffectTime(String EffectTime) {
        this.EffectTime = EffectTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 操作用户 
     * @return OperationUin 操作用户
     */
    public String getOperationUin() {
        return this.OperationUin;
    }

    /**
     * Set 操作用户
     * @param OperationUin 操作用户
     */
    public void setOperationUin(String OperationUin) {
        this.OperationUin = OperationUin;
    }

    /**
     * Get 启用状态 
     * @return Status 启用状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态
     * @param Status 启用状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中 
     * @return EffectStatus 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public String getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     * @param EffectStatus 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public void setEffectStatus(String EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ImageDenyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageDenyRule(ImageDenyRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.IsEffectAllImage != null) {
            this.IsEffectAllImage = new Long(source.IsEffectAllImage);
        }
        if (source.EffectTime != null) {
            this.EffectTime = new String(source.EffectTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperationUin != null) {
            this.OperationUin = new String(source.OperationUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EffectStatus != null) {
            this.EffectStatus = new String(source.EffectStatus);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "IsEffectAllImage", this.IsEffectAllImage);
        this.setParamSimple(map, prefix + "EffectTime", this.EffectTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationUin", this.OperationUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EffectStatus", this.EffectStatus);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

