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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserAgentFilterRule extends AbstractModel{

    /**
    * 访问路径生效类型
all: 所有访问路径生效
file: 根据文件后缀类型生效
directory: 根据目录生效
path: 根据完整访问路径生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 访问路径生效内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * UserAgent列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAgents")
    @Expose
    private String [] UserAgents;

    /**
    * 黑名单或白名单，blacklist或whitelist
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get 访问路径生效类型
all: 所有访问路径生效
file: 根据文件后缀类型生效
directory: 根据目录生效
path: 根据完整访问路径生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 访问路径生效类型
all: 所有访问路径生效
file: 根据文件后缀类型生效
directory: 根据目录生效
path: 根据完整访问路径生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 访问路径生效类型
all: 所有访问路径生效
file: 根据文件后缀类型生效
directory: 根据目录生效
path: 根据完整访问路径生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 访问路径生效类型
all: 所有访问路径生效
file: 根据文件后缀类型生效
directory: 根据目录生效
path: 根据完整访问路径生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 访问路径生效内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths 访问路径生效内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set 访问路径生效内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths 访问路径生效内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get UserAgent列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAgents UserAgent列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserAgents() {
        return this.UserAgents;
    }

    /**
     * Set UserAgent列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAgents UserAgent列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAgents(String [] UserAgents) {
        this.UserAgents = UserAgents;
    }

    /**
     * Get 黑名单或白名单，blacklist或whitelist
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType 黑名单或白名单，blacklist或whitelist
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 黑名单或白名单，blacklist或whitelist
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType 黑名单或白名单，blacklist或whitelist
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamArraySimple(map, prefix + "UserAgents.", this.UserAgents);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);

    }
}

