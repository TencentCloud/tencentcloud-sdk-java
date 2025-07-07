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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyRule extends AbstractModel {

    /**
    * CacheType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullUrlCache")
    @Expose
    private String FullUrlCache;

    /**
    * 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreCase")
    @Expose
    private String IgnoreCase;

    /**
    * CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryString")
    @Expose
    private RuleQueryString QueryString;

    /**
    * 路径缓存键标签，传 user
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTag")
    @Expose
    private String RuleTag;

    /**
     * Get CacheType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePaths CacheType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set CacheType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePaths CacheType 对应类型下的匹配内容：
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型：
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index：首页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullUrlCache() {
        return this.FullUrlCache;
    }

    /**
     * Set 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullUrlCache 是否开启全路径缓存
on：开启全路径缓存（即关闭参数忽略）
off：关闭全路径缓存（即开启参数忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullUrlCache(String FullUrlCache) {
        this.FullUrlCache = FullUrlCache;
    }

    /**
     * Get 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreCase 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreCase() {
        return this.IgnoreCase;
    }

    /**
     * Set 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreCase 是否忽略大小写缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreCase(String IgnoreCase) {
        this.IgnoreCase = IgnoreCase;
    }

    /**
     * Get CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryString CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryString CacheKey中包含请求参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryString(RuleQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 路径缓存键标签，传 user
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTag 路径缓存键标签，传 user
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTag() {
        return this.RuleTag;
    }

    /**
     * Set 路径缓存键标签，传 user
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTag 路径缓存键标签，传 user
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTag(String RuleTag) {
        this.RuleTag = RuleTag;
    }

    public KeyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyRule(KeyRule source) {
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.FullUrlCache != null) {
            this.FullUrlCache = new String(source.FullUrlCache);
        }
        if (source.IgnoreCase != null) {
            this.IgnoreCase = new String(source.IgnoreCase);
        }
        if (source.QueryString != null) {
            this.QueryString = new RuleQueryString(source.QueryString);
        }
        if (source.RuleTag != null) {
            this.RuleTag = new String(source.RuleTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "FullUrlCache", this.FullUrlCache);
        this.setParamSimple(map, prefix + "IgnoreCase", this.IgnoreCase);
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamSimple(map, prefix + "RuleTag", this.RuleTag);

    }
}

