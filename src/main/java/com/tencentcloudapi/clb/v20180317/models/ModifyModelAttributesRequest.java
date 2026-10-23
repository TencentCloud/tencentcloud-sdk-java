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

public class ModifyModelAttributesRequest extends AbstractModel {

    /**
    * <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>BYOK的自定义名字</p><p>入参限制：1～255个字符</p>
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>多协议 Api Base URL</p>
    */
    @SerializedName("ApiBases")
    @Expose
    private ApiBaseItem [] ApiBases;

    /**
    * <p>非chat输出模态的Api Base URL</p>
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
    * <p>非chat输出模态的请求后缀</p>
    */
    @SerializedName("EndpointPath")
    @Expose
    private String EndpointPath;

    /**
    * <p>所属厂商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>所使用的CMR 私网管道 ID</p>
    */
    @SerializedName("CMRPrivateNetworkTunnelId")
    @Expose
    private String CMRPrivateNetworkTunnelId;

    /**
    * <p>携带的Host Header</p>
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * <p>是否需要进行ssl校验</p>
    */
    @SerializedName("VerifySSL")
    @Expose
    private Boolean VerifySSL;

    /**
     * Get <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p> 
     * @return ServiceProviderId <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     * @param ServiceProviderId <p>BYOK的ID</p><p>参数格式：byok-kot39u7j</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>BYOK的自定义名字</p><p>入参限制：1～255个字符</p> 
     * @return ServiceProviderName <p>BYOK的自定义名字</p><p>入参限制：1～255个字符</p>
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>BYOK的自定义名字</p><p>入参限制：1～255个字符</p>
     * @param ServiceProviderName <p>BYOK的自定义名字</p><p>入参限制：1～255个字符</p>
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>多协议 Api Base URL</p> 
     * @return ApiBases <p>多协议 Api Base URL</p>
     */
    public ApiBaseItem [] getApiBases() {
        return this.ApiBases;
    }

    /**
     * Set <p>多协议 Api Base URL</p>
     * @param ApiBases <p>多协议 Api Base URL</p>
     */
    public void setApiBases(ApiBaseItem [] ApiBases) {
        this.ApiBases = ApiBases;
    }

    /**
     * Get <p>非chat输出模态的Api Base URL</p> 
     * @return ApiBase <p>非chat输出模态的Api Base URL</p>
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>非chat输出模态的Api Base URL</p>
     * @param ApiBase <p>非chat输出模态的Api Base URL</p>
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    /**
     * Get <p>非chat输出模态的请求后缀</p> 
     * @return EndpointPath <p>非chat输出模态的请求后缀</p>
     */
    public String getEndpointPath() {
        return this.EndpointPath;
    }

    /**
     * Set <p>非chat输出模态的请求后缀</p>
     * @param EndpointPath <p>非chat输出模态的请求后缀</p>
     */
    public void setEndpointPath(String EndpointPath) {
        this.EndpointPath = EndpointPath;
    }

    /**
     * Get <p>所属厂商</p> 
     * @return ModelProvider <p>所属厂商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>所属厂商</p>
     * @param ModelProvider <p>所属厂商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>协议</p> 
     * @return Protocol <p>协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议</p>
     * @param Protocol <p>协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>所使用的CMR 私网管道 ID</p> 
     * @return CMRPrivateNetworkTunnelId <p>所使用的CMR 私网管道 ID</p>
     */
    public String getCMRPrivateNetworkTunnelId() {
        return this.CMRPrivateNetworkTunnelId;
    }

    /**
     * Set <p>所使用的CMR 私网管道 ID</p>
     * @param CMRPrivateNetworkTunnelId <p>所使用的CMR 私网管道 ID</p>
     */
    public void setCMRPrivateNetworkTunnelId(String CMRPrivateNetworkTunnelId) {
        this.CMRPrivateNetworkTunnelId = CMRPrivateNetworkTunnelId;
    }

    /**
     * Get <p>携带的Host Header</p> 
     * @return HostHeader <p>携带的Host Header</p>
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set <p>携带的Host Header</p>
     * @param HostHeader <p>携带的Host Header</p>
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get <p>是否需要进行ssl校验</p> 
     * @return VerifySSL <p>是否需要进行ssl校验</p>
     */
    public Boolean getVerifySSL() {
        return this.VerifySSL;
    }

    /**
     * Set <p>是否需要进行ssl校验</p>
     * @param VerifySSL <p>是否需要进行ssl校验</p>
     */
    public void setVerifySSL(Boolean VerifySSL) {
        this.VerifySSL = VerifySSL;
    }

    public ModifyModelAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelAttributesRequest(ModifyModelAttributesRequest source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.ApiBases != null) {
            this.ApiBases = new ApiBaseItem[source.ApiBases.length];
            for (int i = 0; i < source.ApiBases.length; i++) {
                this.ApiBases[i] = new ApiBaseItem(source.ApiBases[i]);
            }
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
        if (source.EndpointPath != null) {
            this.EndpointPath = new String(source.EndpointPath);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CMRPrivateNetworkTunnelId != null) {
            this.CMRPrivateNetworkTunnelId = new String(source.CMRPrivateNetworkTunnelId);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
        if (source.VerifySSL != null) {
            this.VerifySSL = new Boolean(source.VerifySSL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamArrayObj(map, prefix + "ApiBases.", this.ApiBases);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);
        this.setParamSimple(map, prefix + "EndpointPath", this.EndpointPath);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CMRPrivateNetworkTunnelId", this.CMRPrivateNetworkTunnelId);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamSimple(map, prefix + "VerifySSL", this.VerifySSL);

    }
}

