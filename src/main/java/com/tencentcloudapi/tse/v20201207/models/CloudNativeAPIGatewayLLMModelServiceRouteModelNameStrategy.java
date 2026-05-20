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
    * 模型服务id
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * 匹配模型服务
    */
    @SerializedName("MatchModelName")
    @Expose
    private String MatchModelName;

    /**
    * 重写模型
    */
    @SerializedName("RewriteModelName")
    @Expose
    private String RewriteModelName;

    /**
     * Get 模型服务id 
     * @return ModelServiceId 模型服务id
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set 模型服务id
     * @param ModelServiceId 模型服务id
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get 匹配模型服务 
     * @return MatchModelName 匹配模型服务
     */
    public String getMatchModelName() {
        return this.MatchModelName;
    }

    /**
     * Set 匹配模型服务
     * @param MatchModelName 匹配模型服务
     */
    public void setMatchModelName(String MatchModelName) {
        this.MatchModelName = MatchModelName;
    }

    /**
     * Get 重写模型 
     * @return RewriteModelName 重写模型
     */
    public String getRewriteModelName() {
        return this.RewriteModelName;
    }

    /**
     * Set 重写模型
     * @param RewriteModelName 重写模型
     */
    public void setRewriteModelName(String RewriteModelName) {
        this.RewriteModelName = RewriteModelName;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "MatchModelName", this.MatchModelName);
        this.setParamSimple(map, prefix + "RewriteModelName", this.RewriteModelName);

    }
}

