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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWModelNameRoute extends AbstractModel {

    /**
    * <p>用于入口路由匹配的模型名称或别名列表。配置 ModelNameRoute 时须提供 1-50 项，每项为 1-128 个 Unicode 字符的合法 UTF-8 字符串，不允许空值或重复项。按原始模型名称精确匹配，区分大小写，不自动去除首尾空白。</p>
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
     * Get <p>用于入口路由匹配的模型名称或别名列表。配置 ModelNameRoute 时须提供 1-50 项，每项为 1-128 个 Unicode 字符的合法 UTF-8 字符串，不允许空值或重复项。按原始模型名称精确匹配，区分大小写，不自动去除首尾空白。</p> 
     * @return ModelNames <p>用于入口路由匹配的模型名称或别名列表。配置 ModelNameRoute 时须提供 1-50 项，每项为 1-128 个 Unicode 字符的合法 UTF-8 字符串，不允许空值或重复项。按原始模型名称精确匹配，区分大小写，不自动去除首尾空白。</p>
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set <p>用于入口路由匹配的模型名称或别名列表。配置 ModelNameRoute 时须提供 1-50 项，每项为 1-128 个 Unicode 字符的合法 UTF-8 字符串，不允许空值或重复项。按原始模型名称精确匹配，区分大小写，不自动去除首尾空白。</p>
     * @param ModelNames <p>用于入口路由匹配的模型名称或别名列表。配置 ModelNameRoute 时须提供 1-50 项，每项为 1-128 个 Unicode 字符的合法 UTF-8 字符串，不允许空值或重复项。按原始模型名称精确匹配，区分大小写，不自动去除首尾空白。</p>
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    public AIGWModelNameRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWModelNameRoute(AIGWModelNameRoute source) {
        if (source.ModelNames != null) {
            this.ModelNames = new String[source.ModelNames.length];
            for (int i = 0; i < source.ModelNames.length; i++) {
                this.ModelNames[i] = new String(source.ModelNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ModelNames.", this.ModelNames);

    }
}

