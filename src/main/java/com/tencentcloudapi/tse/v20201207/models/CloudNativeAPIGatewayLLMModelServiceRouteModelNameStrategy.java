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

public class CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy extends AbstractModel {

    /**
    * <p>模型服务id</p>
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * <p>匹配模型服务</p>
    */
    @SerializedName("MatchModelName")
    @Expose
    private String MatchModelName;

    /**
    * <p>重写模型</p>
    */
    @SerializedName("RewriteModelName")
    @Expose
    private String RewriteModelName;

    /**
    * <p>当前模型名称匹配路由条目中 ModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
    */
    @SerializedName("StandardModelName")
    @Expose
    private String StandardModelName;

    /**
     * Get <p>模型服务id</p> 
     * @return ModelServiceId <p>模型服务id</p>
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set <p>模型服务id</p>
     * @param ModelServiceId <p>模型服务id</p>
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get <p>匹配模型服务</p> 
     * @return MatchModelName <p>匹配模型服务</p>
     */
    public String getMatchModelName() {
        return this.MatchModelName;
    }

    /**
     * Set <p>匹配模型服务</p>
     * @param MatchModelName <p>匹配模型服务</p>
     */
    public void setMatchModelName(String MatchModelName) {
        this.MatchModelName = MatchModelName;
    }

    /**
     * Get <p>重写模型</p> 
     * @return RewriteModelName <p>重写模型</p>
     */
    public String getRewriteModelName() {
        return this.RewriteModelName;
    }

    /**
     * Set <p>重写模型</p>
     * @param RewriteModelName <p>重写模型</p>
     */
    public void setRewriteModelName(String RewriteModelName) {
        this.RewriteModelName = RewriteModelName;
    }

    /**
     * Get <p>当前模型名称匹配路由条目中 ModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p> 
     * @return StandardModelName <p>当前模型名称匹配路由条目中 ModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public String getStandardModelName() {
        return this.StandardModelName;
    }

    /**
     * Set <p>当前模型名称匹配路由条目中 ModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     * @param StandardModelName <p>当前模型名称匹配路由条目中 ModelServiceId 对应的标准模型名称；为空表示未配置。仅对应 TIONE 模型服务时可配置。非空值最长 256 字节，支持中文、英文、数字、下划线和短横线，须以中文、英文或数字开头。同一网关内不同模型 API 不得使用相同的标准模型名称；同一模型 API 内同一模型服务在多处配置时须保持一致。</p>
     */
    public void setStandardModelName(String StandardModelName) {
        this.StandardModelName = StandardModelName;
    }

    public CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy(CloudNativeAPIGatewayLLMModelServiceRouteModelNameStrategy source) {
        if (source.ModelServiceId != null) {
            this.ModelServiceId = new String(source.ModelServiceId);
        }
        if (source.MatchModelName != null) {
            this.MatchModelName = new String(source.MatchModelName);
        }
        if (source.RewriteModelName != null) {
            this.RewriteModelName = new String(source.RewriteModelName);
        }
        if (source.StandardModelName != null) {
            this.StandardModelName = new String(source.StandardModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "MatchModelName", this.MatchModelName);
        this.setParamSimple(map, prefix + "RewriteModelName", this.RewriteModelName);
        this.setParamSimple(map, prefix + "StandardModelName", this.StandardModelName);

    }
}

