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

public class TestServiceProviderConnectionRequest extends AbstractModel {

    /**
    * <p>需要探测的模型列表</p><p>入参限制：上限为20个模型</p>
    */
    @SerializedName("Models")
    @Expose
    private String [] Models;

    /**
    * <p>需要探测的Key</p>
    */
    @SerializedName("ProviderKey")
    @Expose
    private String ProviderKey;

    /**
    * <p>需要探测的KeyId，和ProviderKey二者传一个即可</p>
    */
    @SerializedName("ProviderKeyId")
    @Expose
    private String ProviderKeyId;

    /**
    * <p>BYOK类型，当ProviderKey存在时必传</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>模型的厂商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>模型厂商协议，当ProviderKey存在时必传</p>
    */
    @SerializedName("ModelProtocol")
    @Expose
    private String ModelProtocol;

    /**
    * <p>BYOK类型，当AccessType为PublicCustom时生效</p>
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
    * <p>请求携带的Host头部，当AccessType为PrivateCustom时生效</p>
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * <p>BYOK的ID，当AccessType为PrivateCustom时生效</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>是否校验服务提供商的SSL证书</p><p>默认值：AccessType取值为：</p><ul><li>PublicBYOK时，该参数无效；</li><li>PublicCustom时，该参数默认为true；</li><li>PrivateCustom时，该参数默认为false；</li></ul>
    */
    @SerializedName("VerifySSL")
    @Expose
    private Boolean VerifySSL;

    /**
     * Get <p>需要探测的模型列表</p><p>入参限制：上限为20个模型</p> 
     * @return Models <p>需要探测的模型列表</p><p>入参限制：上限为20个模型</p>
     */
    public String [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>需要探测的模型列表</p><p>入参限制：上限为20个模型</p>
     * @param Models <p>需要探测的模型列表</p><p>入参限制：上限为20个模型</p>
     */
    public void setModels(String [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>需要探测的Key</p> 
     * @return ProviderKey <p>需要探测的Key</p>
     */
    public String getProviderKey() {
        return this.ProviderKey;
    }

    /**
     * Set <p>需要探测的Key</p>
     * @param ProviderKey <p>需要探测的Key</p>
     */
    public void setProviderKey(String ProviderKey) {
        this.ProviderKey = ProviderKey;
    }

    /**
     * Get <p>需要探测的KeyId，和ProviderKey二者传一个即可</p> 
     * @return ProviderKeyId <p>需要探测的KeyId，和ProviderKey二者传一个即可</p>
     */
    public String getProviderKeyId() {
        return this.ProviderKeyId;
    }

    /**
     * Set <p>需要探测的KeyId，和ProviderKey二者传一个即可</p>
     * @param ProviderKeyId <p>需要探测的KeyId，和ProviderKey二者传一个即可</p>
     */
    public void setProviderKeyId(String ProviderKeyId) {
        this.ProviderKeyId = ProviderKeyId;
    }

    /**
     * Get <p>BYOK类型，当ProviderKey存在时必传</p> 
     * @return AccessType <p>BYOK类型，当ProviderKey存在时必传</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>BYOK类型，当ProviderKey存在时必传</p>
     * @param AccessType <p>BYOK类型，当ProviderKey存在时必传</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>模型的厂商</p> 
     * @return ModelProvider <p>模型的厂商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>模型的厂商</p>
     * @param ModelProvider <p>模型的厂商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>模型厂商协议，当ProviderKey存在时必传</p> 
     * @return ModelProtocol <p>模型厂商协议，当ProviderKey存在时必传</p>
     */
    public String getModelProtocol() {
        return this.ModelProtocol;
    }

    /**
     * Set <p>模型厂商协议，当ProviderKey存在时必传</p>
     * @param ModelProtocol <p>模型厂商协议，当ProviderKey存在时必传</p>
     */
    public void setModelProtocol(String ModelProtocol) {
        this.ModelProtocol = ModelProtocol;
    }

    /**
     * Get <p>BYOK类型，当AccessType为PublicCustom时生效</p> 
     * @return ApiBase <p>BYOK类型，当AccessType为PublicCustom时生效</p>
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>BYOK类型，当AccessType为PublicCustom时生效</p>
     * @param ApiBase <p>BYOK类型，当AccessType为PublicCustom时生效</p>
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    /**
     * Get <p>请求携带的Host头部，当AccessType为PrivateCustom时生效</p> 
     * @return HostHeader <p>请求携带的Host头部，当AccessType为PrivateCustom时生效</p>
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>请求携带的Host头部，当AccessType为PrivateCustom时生效</p>
     * @param HostHeader <p>请求携带的Host头部，当AccessType为PrivateCustom时生效</p>
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get <p>BYOK的ID，当AccessType为PrivateCustom时生效</p> 
     * @return ServiceProviderId <p>BYOK的ID，当AccessType为PrivateCustom时生效</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK的ID，当AccessType为PrivateCustom时生效</p>
     * @param ServiceProviderId <p>BYOK的ID，当AccessType为PrivateCustom时生效</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>是否校验服务提供商的SSL证书</p><p>默认值：AccessType取值为：</p><ul><li>PublicBYOK时，该参数无效；</li><li>PublicCustom时，该参数默认为true；</li><li>PrivateCustom时，该参数默认为false；</li></ul> 
     * @return VerifySSL <p>是否校验服务提供商的SSL证书</p><p>默认值：AccessType取值为：</p><ul><li>PublicBYOK时，该参数无效；</li><li>PublicCustom时，该参数默认为true；</li><li>PrivateCustom时，该参数默认为false；</li></ul>
     */
    public Boolean getVerifySSL() {
        return this.VerifySSL;
    }

    /**
     * Set <p>是否校验服务提供商的SSL证书</p><p>默认值：AccessType取值为：</p><ul><li>PublicBYOK时，该参数无效；</li><li>PublicCustom时，该参数默认为true；</li><li>PrivateCustom时，该参数默认为false；</li></ul>
     * @param VerifySSL <p>是否校验服务提供商的SSL证书</p><p>默认值：AccessType取值为：</p><ul><li>PublicBYOK时，该参数无效；</li><li>PublicCustom时，该参数默认为true；</li><li>PrivateCustom时，该参数默认为false；</li></ul>
     */
    public void setVerifySSL(Boolean VerifySSL) {
        this.VerifySSL = VerifySSL;
    }

    public TestServiceProviderConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestServiceProviderConnectionRequest(TestServiceProviderConnectionRequest source) {
        if (source.Models != null) {
            this.Models = new String[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new String(source.Models[i]);
            }
        }
        if (source.ProviderKey != null) {
            this.ProviderKey = new String(source.ProviderKey);
        }
        if (source.ProviderKeyId != null) {
            this.ProviderKeyId = new String(source.ProviderKeyId);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.ModelProtocol != null) {
            this.ModelProtocol = new String(source.ModelProtocol);
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.VerifySSL != null) {
            this.VerifySSL = new Boolean(source.VerifySSL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "ProviderKey", this.ProviderKey);
        this.setParamSimple(map, prefix + "ProviderKeyId", this.ProviderKeyId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamSimple(map, prefix + "ModelProtocol", this.ModelProtocol);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "VerifySSL", this.VerifySSL);

    }
}

