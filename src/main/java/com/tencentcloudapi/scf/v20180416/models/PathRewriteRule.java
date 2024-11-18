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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathRewriteRule extends AbstractModel {

    /**
    * 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 替换值：比如/, /$
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rewrite")
    @Expose
    private String Rewrite;

    /**
     * Get 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 需要重路由的路径，取值规范：/，/*，/xxx，/xxx/a，/xxx/*
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 匹配规，取值范围： WildcardRules 通配符匹配， ExactRules 精确匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 替换值：比如/, /$
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rewrite 替换值：比如/, /$
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRewrite() {
        return this.Rewrite;
    }

    /**
     * Set 替换值：比如/, /$
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rewrite 替换值：比如/, /$
注意：此字段可能返回 null，表示取不到有效值。
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

