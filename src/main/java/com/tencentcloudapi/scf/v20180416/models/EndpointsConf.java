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

public class EndpointsConf extends AbstractModel {

    /**
    * 函数命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数名
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数别名或版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 路径,取值规范：/，/*，/xxx，/xxx/a，/xxx/*"
    */
    @SerializedName("PathMatch")
    @Expose
    private String PathMatch;

    /**
    * 路径重写策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathRewrite")
    @Expose
    private PathRewriteRule [] PathRewrite;

    /**
     * Get 函数命名空间 
     * @return Namespace 函数命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数命名空间
     * @param Namespace 函数命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数名 
     * @return FunctionName 函数名
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名
     * @param FunctionName 函数名
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数别名或版本 
     * @return Qualifier 函数别名或版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数别名或版本
     * @param Qualifier 函数别名或版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 路径,取值规范：/，/*，/xxx，/xxx/a，/xxx/*" 
     * @return PathMatch 路径,取值规范：/，/*，/xxx，/xxx/a，/xxx/*"
     */
    public String getPathMatch() {
        return this.PathMatch;
    }

    /**
     * Set 路径,取值规范：/，/*，/xxx，/xxx/a，/xxx/*"
     * @param PathMatch 路径,取值规范：/，/*，/xxx，/xxx/a，/xxx/*"
     */
    public void setPathMatch(String PathMatch) {
        this.PathMatch = PathMatch;
    }

    /**
     * Get 路径重写策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathRewrite 路径重写策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathRewriteRule [] getPathRewrite() {
        return this.PathRewrite;
    }

    /**
     * Set 路径重写策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathRewrite 路径重写策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathRewrite(PathRewriteRule [] PathRewrite) {
        this.PathRewrite = PathRewrite;
    }

    public EndpointsConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointsConf(EndpointsConf source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.PathMatch != null) {
            this.PathMatch = new String(source.PathMatch);
        }
        if (source.PathRewrite != null) {
            this.PathRewrite = new PathRewriteRule[source.PathRewrite.length];
            for (int i = 0; i < source.PathRewrite.length; i++) {
                this.PathRewrite[i] = new PathRewriteRule(source.PathRewrite[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "PathMatch", this.PathMatch);
        this.setParamArrayObj(map, prefix + "PathRewrite.", this.PathRewrite);

    }
}

