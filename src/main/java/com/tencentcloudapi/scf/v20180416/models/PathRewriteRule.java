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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathRewriteRule extends AbstractModel {

    /**
    * 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 替换值：比如/, /$
    */
    @SerializedName("Rewrite")
    @Expose
    private String Rewrite;

    /**
     * Get 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/* 
     * @return Path 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
     * @param Path 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配 
     * @return Type 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
     * @param Type 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 替换值：比如/, /$ 
     * @return Rewrite 替换值：比如/, /$
     */
    public String getRewrite() {
        return this.Rewrite;
    }

    /**
     * Set 替换值：比如/, /$
     * @param Rewrite 替换值：比如/, /$
     */
    public void setRewrite(String Rewrite) {
        this.Rewrite = Rewrite;
    }

    public PathRewriteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathRewriteRule(PathRewriteRule source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Rewrite != null) {
            this.Rewrite = new String(source.Rewrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Rewrite", this.Rewrite);

    }
}

