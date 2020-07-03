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

public class HttpHeaderPathRule extends AbstractModel{

    /**
    * http 头部设置方式
add：添加头部，若已存在头部，则会存在重复头部
set：仅回源头部配置支持，若头部已存在则会覆盖原有头部值，若不存在，则会增加该头部及值
del：删除头部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderMode")
    @Expose
    private String HeaderMode;

    /**
    * http 头部名称，最多可设置 100 个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * http 头部值，最多可设置 1000 个字符
Mode 为 del 时非必填
Mode 为 add/set 时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderValue")
    @Expose
    private String HeaderValue;

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
     * Get http 头部设置方式
add：添加头部，若已存在头部，则会存在重复头部
set：仅回源头部配置支持，若头部已存在则会覆盖原有头部值，若不存在，则会增加该头部及值
del：删除头部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderMode http 头部设置方式
add：添加头部，若已存在头部，则会存在重复头部
set：仅回源头部配置支持，若头部已存在则会覆盖原有头部值，若不存在，则会增加该头部及值
del：删除头部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderMode() {
        return this.HeaderMode;
    }

    /**
     * Set http 头部设置方式
add：添加头部，若已存在头部，则会存在重复头部
set：仅回源头部配置支持，若头部已存在则会覆盖原有头部值，若不存在，则会增加该头部及值
del：删除头部
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderMode http 头部设置方式
add：添加头部，若已存在头部，则会存在重复头部
set：仅回源头部配置支持，若头部已存在则会覆盖原有头部值，若不存在，则会增加该头部及值
del：删除头部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderMode(String HeaderMode) {
        this.HeaderMode = HeaderMode;
    }

    /**
     * Get http 头部名称，最多可设置 100 个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderName http 头部名称，最多可设置 100 个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set http 头部名称，最多可设置 100 个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderName http 头部名称，最多可设置 100 个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get http 头部值，最多可设置 1000 个字符
Mode 为 del 时非必填
Mode 为 add/set 时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderValue http 头部值，最多可设置 1000 个字符
Mode 为 del 时非必填
Mode 为 add/set 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeaderValue() {
        return this.HeaderValue;
    }

    /**
     * Set http 头部值，最多可设置 1000 个字符
Mode 为 del 时非必填
Mode 为 add/set 时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderValue http 头部值，最多可设置 1000 个字符
Mode 为 del 时非必填
Mode 为 add/set 时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderValue(String HeaderValue) {
        this.HeaderValue = HeaderValue;
    }

    /**
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths RuleType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderMode", this.HeaderMode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HeaderValue", this.HeaderValue);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);

    }
}

