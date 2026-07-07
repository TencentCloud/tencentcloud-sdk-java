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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpperModelsRequest extends AbstractModel {

    /**
    * <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>上游 Provider API 地址</p><p>示例：https://api.moonshot.cn</p>
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
    * <p>上游 Provider API Key</p><p>用于鉴权访问上游模型列表接口</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>自定义 Host Header，可选</p><p>仅 VPC 内网场景需要，用于指定请求的 Host 头</p>
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * <p>Key Id 配合ServiceProviderId一同输入，不指定则默认选用最近创建的Key</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>模型列表端点路径，可选</p><p>默认值：/v1/models</p>
    */
    @SerializedName("ModelPath")
    @Expose
    private String ModelPath;

    /**
    * <p>模型协议</p>
    */
    @SerializedName("ModelProtocol")
    @Expose
    private String ModelProtocol;

    /**
    * <p>模型提供商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>BYOK 业务 ID，可选</p><p>格式：byok-xxxxxxxx</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
     * Get <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p> 
     * @return AccessType <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     * @param AccessType <p>接入类型：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>上游 Provider API 地址</p><p>示例：https://api.moonshot.cn</p> 
     * @return ApiBase <p>上游 Provider API 地址</p><p>示例：https://api.moonshot.cn</p>
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>上游 Provider API 地址</p><p>示例：https://api.moonshot.cn</p>
     * @param ApiBase <p>上游 Provider API 地址</p><p>示例：https://api.moonshot.cn</p>
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    /**
     * Get <p>上游 Provider API Key</p><p>用于鉴权访问上游模型列表接口</p> 
     * @return ApiKey <p>上游 Provider API Key</p><p>用于鉴权访问上游模型列表接口</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>上游 Provider API Key</p><p>用于鉴权访问上游模型列表接口</p>
     * @param ApiKey <p>上游 Provider API Key</p><p>用于鉴权访问上游模型列表接口</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>自定义 Host Header，可选</p><p>仅 VPC 内网场景需要，用于指定请求的 Host 头</p> 
     * @return HostHeader <p>自定义 Host Header，可选</p><p>仅 VPC 内网场景需要，用于指定请求的 Host 头</p>
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>自定义 Host Header，可选</p><p>仅 VPC 内网场景需要，用于指定请求的 Host 头</p>
     * @param HostHeader <p>自定义 Host Header，可选</p><p>仅 VPC 内网场景需要，用于指定请求的 Host 头</p>
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get <p>Key Id 配合ServiceProviderId一同输入，不指定则默认选用最近创建的Key</p> 
     * @return KeyId <p>Key Id 配合ServiceProviderId一同输入，不指定则默认选用最近创建的Key</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Key Id 配合ServiceProviderId一同输入，不指定则默认选用最近创建的Key</p>
     * @param KeyId <p>Key Id 配合ServiceProviderId一同输入，不指定则默认选用最近创建的Key</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>模型列表端点路径，可选</p><p>默认值：/v1/models</p> 
     * @return ModelPath <p>模型列表端点路径，可选</p><p>默认值：/v1/models</p>
     */
    public String getModelPath() {
        return this.ModelPath;
    }

    /**
     * Set <p>模型列表端点路径，可选</p><p>默认值：/v1/models</p>
     * @param ModelPath <p>模型列表端点路径，可选</p><p>默认值：/v1/models</p>
     */
    public void setModelPath(String ModelPath) {
        this.ModelPath = ModelPath;
    }

    /**
     * Get <p>模型协议</p> 
     * @return ModelProtocol <p>模型协议</p>
     */
    public String getModelProtocol() {
        return this.ModelProtocol;
    }

    /**
     * Set <p>模型协议</p>
     * @param ModelProtocol <p>模型协议</p>
     */
    public void setModelProtocol(String ModelProtocol) {
        this.ModelProtocol = ModelProtocol;
    }

    /**
     * Get <p>模型提供商</p> 
     * @return ModelProvider <p>模型提供商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>模型提供商</p>
     * @param ModelProvider <p>模型提供商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>BYOK 业务 ID，可选</p><p>格式：byok-xxxxxxxx</p> 
     * @return ServiceProviderId <p>BYOK 业务 ID，可选</p><p>格式：byok-xxxxxxxx</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK 业务 ID，可选</p><p>格式：byok-xxxxxxxx</p>
     * @param ServiceProviderId <p>BYOK 业务 ID，可选</p><p>格式：byok-xxxxxxxx</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    public DescribeUpperModelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpperModelsRequest(DescribeUpperModelsRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ModelPath != null) {
            this.ModelPath = new String(source.ModelPath);
        }
        if (source.ModelProtocol != null) {
            this.ModelProtocol = new String(source.ModelProtocol);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ModelPath", this.ModelPath);
        this.setParamSimple(map, prefix + "ModelProtocol", this.ModelProtocol);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);

    }
}

