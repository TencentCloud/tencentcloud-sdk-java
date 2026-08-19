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

public class ScfCustomDomainEndpointItem extends AbstractModel {

    /**
    * <p>匹配路径</p>
    */
    @SerializedName("PathMatch")
    @Expose
    private String PathMatch;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>函数名称</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>函数版本</p>
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get <p>匹配路径</p> 
     * @return PathMatch <p>匹配路径</p>
     */
    public String getPathMatch() {
        return this.PathMatch;
    }

    /**
     * Set <p>匹配路径</p>
     * @param PathMatch <p>匹配路径</p>
     */
    public void setPathMatch(String PathMatch) {
        this.PathMatch = PathMatch;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>函数名称</p> 
     * @return FunctionName <p>函数名称</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>函数名称</p>
     * @param FunctionName <p>函数名称</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>函数版本</p> 
     * @return Qualifier <p>函数版本</p>
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set <p>函数版本</p>
     * @param Qualifier <p>函数版本</p>
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public ScfCustomDomainEndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScfCustomDomainEndpointItem(ScfCustomDomainEndpointItem source) {
        if (source.PathMatch != null) {
            this.PathMatch = new String(source.PathMatch);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathMatch", this.PathMatch);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

