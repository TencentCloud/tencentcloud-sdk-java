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

public class CommandSandboxFileRule extends AbstractModel {

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * <p>规则来源类型</p><p>枚举值：</p><ul><li>SYSTEM ： 系统预置规则</li><li>CUSTOM： 自定义规则</li></ul>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>规则更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>规则内容</p>
    */
    @SerializedName("RuleContent")
    @Expose
    private CommandSandboxFileRuleBase RuleContent;

    /**
     * Get <p>规则 ID</p> 
     * @return RuleID <p>规则 ID</p>
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>规则 ID</p>
     * @param RuleID <p>规则 ID</p>
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>规则来源类型</p><p>枚举值：</p><ul><li>SYSTEM ： 系统预置规则</li><li>CUSTOM： 自定义规则</li></ul> 
     * @return RuleType <p>规则来源类型</p><p>枚举值：</p><ul><li>SYSTEM ： 系统预置规则</li><li>CUSTOM： 自定义规则</li></ul>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则来源类型</p><p>枚举值：</p><ul><li>SYSTEM ： 系统预置规则</li><li>CUSTOM： 自定义规则</li></ul>
     * @param RuleType <p>规则来源类型</p><p>枚举值：</p><ul><li>SYSTEM ： 系统预置规则</li><li>CUSTOM： 自定义规则</li></ul>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>规则更新时间</p> 
     * @return UpdateTime <p>规则更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>规则更新时间</p>
     * @param UpdateTime <p>规则更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>规则内容</p> 
     * @return RuleContent <p>规则内容</p>
     */
    public CommandSandboxFileRuleBase getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set <p>规则内容</p>
     * @param RuleContent <p>规则内容</p>
     */
    public void setRuleContent(CommandSandboxFileRuleBase RuleContent) {
        this.RuleContent = RuleContent;
    }

    public CommandSandboxFileRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandSandboxFileRule(CommandSandboxFileRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new CommandSandboxFileRuleBase(source.RuleContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "RuleContent.", this.RuleContent);

    }
}

