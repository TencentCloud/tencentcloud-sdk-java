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

public class PathBasedOriginRule extends AbstractModel{

    /**
    * 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * RuleType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 源站列表，支持域名或ipv4地址
    */
    @SerializedName("Origin")
    @Expose
    private String [] Origin;

    /**
     * Get 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效 
     * @return RuleType 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     * @param RuleType 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get RuleType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 / 
     * @return RulePaths RuleType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set RuleType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     * @param RulePaths RuleType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get 源站列表，支持域名或ipv4地址 
     * @return Origin 源站列表，支持域名或ipv4地址
     */
    public String [] getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站列表，支持域名或ipv4地址
     * @param Origin 源站列表，支持域名或ipv4地址
     */
    public void setOrigin(String [] Origin) {
        this.Origin = Origin;
    }

    public PathBasedOriginRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathBasedOriginRule(PathBasedOriginRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.Origin != null) {
            this.Origin = new String[source.Origin.length];
            for (int i = 0; i < source.Origin.length; i++) {
                this.Origin[i] = new String(source.Origin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamArraySimple(map, prefix + "Origin.", this.Origin);

    }
}

