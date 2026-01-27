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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterSelector extends AbstractModel {

    /**
    * <p>过滤规则类型，在tag过滤中，可选值为matches（匹配），excludes(排除)，在仓库过滤中，可选值为repoMatches（仓库匹配），repoExcludes（仓库排除）</p>
    */
    @SerializedName("Decoration")
    @Expose
    private String Decoration;

    /**
    * <p>过滤表达式</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
     * Get <p>过滤规则类型，在tag过滤中，可选值为matches（匹配），excludes(排除)，在仓库过滤中，可选值为repoMatches（仓库匹配），repoExcludes（仓库排除）</p> 
     * @return Decoration <p>过滤规则类型，在tag过滤中，可选值为matches（匹配），excludes(排除)，在仓库过滤中，可选值为repoMatches（仓库匹配），repoExcludes（仓库排除）</p>
     */
    public String getDecoration() {
        return this.Decoration;
    }

    /**
     * Set <p>过滤规则类型，在tag过滤中，可选值为matches（匹配），excludes(排除)，在仓库过滤中，可选值为repoMatches（仓库匹配），repoExcludes（仓库排除）</p>
     * @param Decoration <p>过滤规则类型，在tag过滤中，可选值为matches（匹配），excludes(排除)，在仓库过滤中，可选值为repoMatches（仓库匹配），repoExcludes（仓库排除）</p>
     */
    public void setDecoration(String Decoration) {
        this.Decoration = Decoration;
    }

    /**
     * Get <p>过滤表达式</p> 
     * @return Pattern <p>过滤表达式</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>过滤表达式</p>
     * @param Pattern <p>过滤表达式</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    public FilterSelector() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterSelector(FilterSelector source) {
        if (source.Decoration != null) {
            this.Decoration = new String(source.Decoration);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Decoration", this.Decoration);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);

    }
}

