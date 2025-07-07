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

public class GetFunctionRequest extends AbstractModel {

    /**
    * 需要获取详情的函数名称，ResourceId和FunctionName只能传一个
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本号
默认值: $LATEST
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 函数所属命名空间
默认值: default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
    */
    @SerializedName("ShowCode")
    @Expose
    private String ShowCode;

    /**
     * Get 需要获取详情的函数名称，ResourceId和FunctionName只能传一个 
     * @return FunctionName 需要获取详情的函数名称，ResourceId和FunctionName只能传一个
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 需要获取详情的函数名称，ResourceId和FunctionName只能传一个
     * @param FunctionName 需要获取详情的函数名称，ResourceId和FunctionName只能传一个
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数的版本号
默认值: $LATEST 
     * @return Qualifier 函数的版本号
默认值: $LATEST
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数的版本号
默认值: $LATEST
     * @param Qualifier 函数的版本号
默认值: $LATEST
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 函数所属命名空间
默认值: default 
     * @return Namespace 函数所属命名空间
默认值: default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间
默认值: default
     * @param Namespace 函数所属命名空间
默认值: default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示 
     * @return ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public String getShowCode() {
        return this.ShowCode;
    }

    /**
     * Set 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     * @param ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public void setShowCode(String ShowCode) {
        this.ShowCode = ShowCode;
    }

    public GetFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionRequest(GetFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ShowCode != null) {
            this.ShowCode = new String(source.ShowCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ShowCode", this.ShowCode);

    }
}

