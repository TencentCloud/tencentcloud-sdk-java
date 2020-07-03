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

public class RefererRule extends AbstractModel{

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * referer 配置类型
whitelist：白名单
blacklist：黑名单
    */
    @SerializedName("RefererType")
    @Expose
    private String RefererType;

    /**
    * referer 内容列表列表
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * 是否允许空 referer
true：允许空 referer
false：不允许空 referer
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Boolean AllowEmpty;

    /**
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效 
     * @return RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     * @param RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html 
     * @return RulePaths RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
     * @param RulePaths RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get referer 配置类型
whitelist：白名单
blacklist：黑名单 
     * @return RefererType referer 配置类型
whitelist：白名单
blacklist：黑名单
     */
    public String getRefererType() {
        return this.RefererType;
    }

    /**
     * Set referer 配置类型
whitelist：白名单
blacklist：黑名单
     * @param RefererType referer 配置类型
whitelist：白名单
blacklist：黑名单
     */
    public void setRefererType(String RefererType) {
        this.RefererType = RefererType;
    }

    /**
     * Get referer 内容列表列表 
     * @return Referers referer 内容列表列表
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set referer 内容列表列表
     * @param Referers referer 内容列表列表
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get 是否允许空 referer
true：允许空 referer
false：不允许空 referer 
     * @return AllowEmpty 是否允许空 referer
true：允许空 referer
false：不允许空 referer
     */
    public Boolean getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set 是否允许空 referer
true：允许空 referer
false：不允许空 referer
     * @param AllowEmpty 是否允许空 referer
true：允许空 referer
false：不允许空 referer
     */
    public void setAllowEmpty(Boolean AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RefererType", this.RefererType);
        this.setParamArraySimple(map, prefix + "Referers.", this.Referers);
        this.setParamSimple(map, prefix + "AllowEmpty", this.AllowEmpty);

    }
}

