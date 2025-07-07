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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAPIDocRequest extends AbstractModel {

    /**
    * API文档名称
    */
    @SerializedName("ApiDocName")
    @Expose
    private String ApiDocName;

    /**
    * 服务名称
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 环境名称
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 生成文档的API列表
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get API文档名称 
     * @return ApiDocName API文档名称
     */
    public String getApiDocName() {
        return this.ApiDocName;
    }

    /**
     * Set API文档名称
     * @param ApiDocName API文档名称
     */
    public void setApiDocName(String ApiDocName) {
        this.ApiDocName = ApiDocName;
    }

    /**
     * Get 服务名称 
     * @return ServiceId 服务名称
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务名称
     * @param ServiceId 服务名称
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 环境名称 
     * @return Environment 环境名称
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境名称
     * @param Environment 环境名称
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 生成文档的API列表 
     * @return ApiIds 生成文档的API列表
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set 生成文档的API列表
     * @param ApiIds 生成文档的API列表
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateAPIDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAPIDocRequest(CreateAPIDocRequest source) {
        if (source.ApiDocName != null) {
            this.ApiDocName = new String(source.ApiDocName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

