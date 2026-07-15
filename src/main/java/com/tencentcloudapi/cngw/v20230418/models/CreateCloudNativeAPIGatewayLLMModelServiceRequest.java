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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayLLMModelServiceRequest extends AbstractModel {

    /**
    * <p>网关 id。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>服务名称，最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>服务类型。目前仅支持 LLMService。</p><p>枚举值：</p><ul><li>LLMService： 大语言模型服务</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>选择模型提供商, 选项：OpenAI、Anthropic、Azure OpenAI等。</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>API协议标准，根据供应商动态变化：OpenAI→OpenAI/v1，Anthropic→Anthropic/v1等</p>
    */
    @SerializedName("ModelProtocol")
    @Expose
    private String ModelProtocol;

    /**
    * <p>模型选择方式，选项：Specify（指定模型）、PassThrough（透传请求模型）。</p>
    */
    @SerializedName("ModelSelector")
    @Expose
    private String ModelSelector;

    /**
    * <p>LLM 厂商颁发的认证信息 token 。</p>
    */
    @SerializedName("SecretKeyIds")
    @Expose
    private String [] SecretKeyIds;

    /**
    * <p>默认模型，模型选择方式为 Specify 时必填。</p>
    */
    @SerializedName("DefaultModel")
    @Expose
    private String DefaultModel;

    /**
    * <p>开启模型降级，模型选择方式为 Specify 时必填。</p>
    */
    @SerializedName("EnableModelFallback")
    @Expose
    private Boolean EnableModelFallback;

    /**
    * <p>可以配置备用模型规则，EnableSpecifyModelFallbackxa0为 true 时必填。</p>
    */
    @SerializedName("ModelFallbackRule")
    @Expose
    private CloudNativeAPIGatewayLLMModelFallbackRule ModelFallbackRule;

    /**
    * <p>开启模型参数校验，是否校验客户端传递的 model 参数,xa0模型选择方式为 PassThrough 时必填</p>
    */
    @SerializedName("EnableModelParamCheck")
    @Expose
    private Boolean EnableModelParamCheck;

    /**
    * <p>模型检验信息，EnableModelParamCheckxa0为 true 时必填。</p>
    */
    @SerializedName("ModelParamCheckRule")
    @Expose
    private CloudNativeAPIGatewayLLMModelParamCheckInfo ModelParamCheckRule;

    /**
    * <p>描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>服务提供商自定义 url</p>
    */
    @SerializedName("UpstreamURL")
    @Expose
    private String UpstreamURL;

    /**
    * <p>连接超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：10000</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>写入超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
    */
    @SerializedName("WriteTimeout")
    @Expose
    private Long WriteTimeout;

    /**
    * <p>读取超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
    */
    @SerializedName("ReadTimeout")
    @Expose
    private Long ReadTimeout;

    /**
    * <p>重试次数</p><p>取值范围：[0, 5]</p><p>单位：次</p><p>默认值：0</p>
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * <p>路径拼接模式</p><p>枚举值：</p><ul><li>FixedPath： 固定地址</li><li>AutoConcat： 自动拼接</li></ul>
    */
    @SerializedName("UpstreamUrlMode")
    @Expose
    private String UpstreamUrlMode;

    /**
    * <p>sni</p>
    */
    @SerializedName("SNI")
    @Expose
    private String SNI;

    /**
    * <p>模型服务级别的配额上限（RPM/TPM）。需要网关版本 ≥ 3.9.4。</p>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private AIGWLLMQuotaLimit QuotaLimit;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>参数改写规则</p>
    */
    @SerializedName("ModelRewriteRules")
    @Expose
    private AIGWModelRewriteRule [] ModelRewriteRules;

    /**
    * <p>模型自定义供应商名称</p>
    */
    @SerializedName("CustomProviderName")
    @Expose
    private String CustomProviderName;

    /**
    * <p>外部服务来源ID</p>
    */
    @SerializedName("ExternalInstanceId")
    @Expose
    private String ExternalInstanceId;

    /**
    * <p>其他参数</p>
    */
    @SerializedName("ExtParams")
    @Expose
    private KeyValue [] ExtParams;

    /**
    * <p>密钥轮转开关</p>
    */
    @SerializedName("KeyRotationEnabled")
    @Expose
    private Boolean KeyRotationEnabled;

    /**
    * <p>密钥轮转周期</p><p>单位：天数</p>
    */
    @SerializedName("KeyRotationPeriodDays")
    @Expose
    private Long KeyRotationPeriodDays;

    /**
     * Get <p>网关 id。</p> 
     * @return GatewayId <p>网关 id。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关 id。</p>
     * @param GatewayId <p>网关 id。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>服务名称，最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p> 
     * @return Name <p>服务名称，最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名称，最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     * @param Name <p>服务名称，最长60个字符，支持中英文大小写、数字及分隔符（“-”、“_”)，不能以数字和分隔符开头，不能以分隔符结尾。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>服务类型。目前仅支持 LLMService。</p><p>枚举值：</p><ul><li>LLMService： 大语言模型服务</li></ul> 
     * @return ServiceType <p>服务类型。目前仅支持 LLMService。</p><p>枚举值：</p><ul><li>LLMService： 大语言模型服务</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型。目前仅支持 LLMService。</p><p>枚举值：</p><ul><li>LLMService： 大语言模型服务</li></ul>
     * @param ServiceType <p>服务类型。目前仅支持 LLMService。</p><p>枚举值：</p><ul><li>LLMService： 大语言模型服务</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>选择模型提供商, 选项：OpenAI、Anthropic、Azure OpenAI等。</p> 
     * @return ModelProvider <p>选择模型提供商, 选项：OpenAI、Anthropic、Azure OpenAI等。</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>选择模型提供商, 选项：OpenAI、Anthropic、Azure OpenAI等。</p>
     * @param ModelProvider <p>选择模型提供商, 选项：OpenAI、Anthropic、Azure OpenAI等。</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>API协议标准，根据供应商动态变化：OpenAI→OpenAI/v1，Anthropic→Anthropic/v1等</p> 
     * @return ModelProtocol <p>API协议标准，根据供应商动态变化：OpenAI→OpenAI/v1，Anthropic→Anthropic/v1等</p>
     */
    public String getModelProtocol() {
        return this.ModelProtocol;
    }

    /**
     * Set <p>API协议标准，根据供应商动态变化：OpenAI→OpenAI/v1，Anthropic→Anthropic/v1等</p>
     * @param ModelProtocol <p>API协议标准，根据供应商动态变化：OpenAI→OpenAI/v1，Anthropic→Anthropic/v1等</p>
     */
    public void setModelProtocol(String ModelProtocol) {
        this.ModelProtocol = ModelProtocol;
    }

    /**
     * Get <p>模型选择方式，选项：Specify（指定模型）、PassThrough（透传请求模型）。</p> 
     * @return ModelSelector <p>模型选择方式，选项：Specify（指定模型）、PassThrough（透传请求模型）。</p>
     */
    public String getModelSelector() {
        return this.ModelSelector;
    }

    /**
     * Set <p>模型选择方式，选项：Specify（指定模型）、PassThrough（透传请求模型）。</p>
     * @param ModelSelector <p>模型选择方式，选项：Specify（指定模型）、PassThrough（透传请求模型）。</p>
     */
    public void setModelSelector(String ModelSelector) {
        this.ModelSelector = ModelSelector;
    }

    /**
     * Get <p>LLM 厂商颁发的认证信息 token 。</p> 
     * @return SecretKeyIds <p>LLM 厂商颁发的认证信息 token 。</p>
     */
    public String [] getSecretKeyIds() {
        return this.SecretKeyIds;
    }

    /**
     * Set <p>LLM 厂商颁发的认证信息 token 。</p>
     * @param SecretKeyIds <p>LLM 厂商颁发的认证信息 token 。</p>
     */
    public void setSecretKeyIds(String [] SecretKeyIds) {
        this.SecretKeyIds = SecretKeyIds;
    }

    /**
     * Get <p>默认模型，模型选择方式为 Specify 时必填。</p> 
     * @return DefaultModel <p>默认模型，模型选择方式为 Specify 时必填。</p>
     */
    public String getDefaultModel() {
        return this.DefaultModel;
    }

    /**
     * Set <p>默认模型，模型选择方式为 Specify 时必填。</p>
     * @param DefaultModel <p>默认模型，模型选择方式为 Specify 时必填。</p>
     */
    public void setDefaultModel(String DefaultModel) {
        this.DefaultModel = DefaultModel;
    }

    /**
     * Get <p>开启模型降级，模型选择方式为 Specify 时必填。</p> 
     * @return EnableModelFallback <p>开启模型降级，模型选择方式为 Specify 时必填。</p>
     */
    public Boolean getEnableModelFallback() {
        return this.EnableModelFallback;
    }

    /**
     * Set <p>开启模型降级，模型选择方式为 Specify 时必填。</p>
     * @param EnableModelFallback <p>开启模型降级，模型选择方式为 Specify 时必填。</p>
     */
    public void setEnableModelFallback(Boolean EnableModelFallback) {
        this.EnableModelFallback = EnableModelFallback;
    }

    /**
     * Get <p>可以配置备用模型规则，EnableSpecifyModelFallbackxa0为 true 时必填。</p> 
     * @return ModelFallbackRule <p>可以配置备用模型规则，EnableSpecifyModelFallbackxa0为 true 时必填。</p>
     */
    public CloudNativeAPIGatewayLLMModelFallbackRule getModelFallbackRule() {
        return this.ModelFallbackRule;
    }

    /**
     * Set <p>可以配置备用模型规则，EnableSpecifyModelFallbackxa0为 true 时必填。</p>
     * @param ModelFallbackRule <p>可以配置备用模型规则，EnableSpecifyModelFallbackxa0为 true 时必填。</p>
     */
    public void setModelFallbackRule(CloudNativeAPIGatewayLLMModelFallbackRule ModelFallbackRule) {
        this.ModelFallbackRule = ModelFallbackRule;
    }

    /**
     * Get <p>开启模型参数校验，是否校验客户端传递的 model 参数,xa0模型选择方式为 PassThrough 时必填</p> 
     * @return EnableModelParamCheck <p>开启模型参数校验，是否校验客户端传递的 model 参数,xa0模型选择方式为 PassThrough 时必填</p>
     */
    public Boolean getEnableModelParamCheck() {
        return this.EnableModelParamCheck;
    }

    /**
     * Set <p>开启模型参数校验，是否校验客户端传递的 model 参数,xa0模型选择方式为 PassThrough 时必填</p>
     * @param EnableModelParamCheck <p>开启模型参数校验，是否校验客户端传递的 model 参数,xa0模型选择方式为 PassThrough 时必填</p>
     */
    public void setEnableModelParamCheck(Boolean EnableModelParamCheck) {
        this.EnableModelParamCheck = EnableModelParamCheck;
    }

    /**
     * Get <p>模型检验信息，EnableModelParamCheckxa0为 true 时必填。</p> 
     * @return ModelParamCheckRule <p>模型检验信息，EnableModelParamCheckxa0为 true 时必填。</p>
     */
    public CloudNativeAPIGatewayLLMModelParamCheckInfo getModelParamCheckRule() {
        return this.ModelParamCheckRule;
    }

    /**
     * Set <p>模型检验信息，EnableModelParamCheckxa0为 true 时必填。</p>
     * @param ModelParamCheckRule <p>模型检验信息，EnableModelParamCheckxa0为 true 时必填。</p>
     */
    public void setModelParamCheckRule(CloudNativeAPIGatewayLLMModelParamCheckInfo ModelParamCheckRule) {
        this.ModelParamCheckRule = ModelParamCheckRule;
    }

    /**
     * Get <p>描述。</p> 
     * @return Description <p>描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述。</p>
     * @param Description <p>描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>服务提供商自定义 url</p> 
     * @return UpstreamURL <p>服务提供商自定义 url</p>
     */
    public String getUpstreamURL() {
        return this.UpstreamURL;
    }

    /**
     * Set <p>服务提供商自定义 url</p>
     * @param UpstreamURL <p>服务提供商自定义 url</p>
     */
    public void setUpstreamURL(String UpstreamURL) {
        this.UpstreamURL = UpstreamURL;
    }

    /**
     * Get <p>连接超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：10000</p> 
     * @return ConnectTimeout <p>连接超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：10000</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>连接超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：10000</p>
     * @param ConnectTimeout <p>连接超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：10000</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>写入超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p> 
     * @return WriteTimeout <p>写入超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     */
    public Long getWriteTimeout() {
        return this.WriteTimeout;
    }

    /**
     * Set <p>写入超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     * @param WriteTimeout <p>写入超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     */
    public void setWriteTimeout(Long WriteTimeout) {
        this.WriteTimeout = WriteTimeout;
    }

    /**
     * Get <p>读取超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p> 
     * @return ReadTimeout <p>读取超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     */
    public Long getReadTimeout() {
        return this.ReadTimeout;
    }

    /**
     * Set <p>读取超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     * @param ReadTimeout <p>读取超时时间</p><p>取值范围：[1, 3600000]</p><p>单位：毫秒</p><p>默认值：60000</p>
     */
    public void setReadTimeout(Long ReadTimeout) {
        this.ReadTimeout = ReadTimeout;
    }

    /**
     * Get <p>重试次数</p><p>取值范围：[0, 5]</p><p>单位：次</p><p>默认值：0</p> 
     * @return Retries <p>重试次数</p><p>取值范围：[0, 5]</p><p>单位：次</p><p>默认值：0</p>
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set <p>重试次数</p><p>取值范围：[0, 5]</p><p>单位：次</p><p>默认值：0</p>
     * @param Retries <p>重试次数</p><p>取值范围：[0, 5]</p><p>单位：次</p><p>默认值：0</p>
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get <p>路径拼接模式</p><p>枚举值：</p><ul><li>FixedPath： 固定地址</li><li>AutoConcat： 自动拼接</li></ul> 
     * @return UpstreamUrlMode <p>路径拼接模式</p><p>枚举值：</p><ul><li>FixedPath： 固定地址</li><li>AutoConcat： 自动拼接</li></ul>
     */
    public String getUpstreamUrlMode() {
        return this.UpstreamUrlMode;
    }

    /**
     * Set <p>路径拼接模式</p><p>枚举值：</p><ul><li>FixedPath： 固定地址</li><li>AutoConcat： 自动拼接</li></ul>
     * @param UpstreamUrlMode <p>路径拼接模式</p><p>枚举值：</p><ul><li>FixedPath： 固定地址</li><li>AutoConcat： 自动拼接</li></ul>
     */
    public void setUpstreamUrlMode(String UpstreamUrlMode) {
        this.UpstreamUrlMode = UpstreamUrlMode;
    }

    /**
     * Get <p>sni</p> 
     * @return SNI <p>sni</p>
     */
    public String getSNI() {
        return this.SNI;
    }

    /**
     * Set <p>sni</p>
     * @param SNI <p>sni</p>
     */
    public void setSNI(String SNI) {
        this.SNI = SNI;
    }

    /**
     * Get <p>模型服务级别的配额上限（RPM/TPM）。需要网关版本 ≥ 3.9.4。</p> 
     * @return QuotaLimit <p>模型服务级别的配额上限（RPM/TPM）。需要网关版本 ≥ 3.9.4。</p>
     */
    public AIGWLLMQuotaLimit getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>模型服务级别的配额上限（RPM/TPM）。需要网关版本 ≥ 3.9.4。</p>
     * @param QuotaLimit <p>模型服务级别的配额上限（RPM/TPM）。需要网关版本 ≥ 3.9.4。</p>
     */
    public void setQuotaLimit(AIGWLLMQuotaLimit QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>参数改写规则</p> 
     * @return ModelRewriteRules <p>参数改写规则</p>
     */
    public AIGWModelRewriteRule [] getModelRewriteRules() {
        return this.ModelRewriteRules;
    }

    /**
     * Set <p>参数改写规则</p>
     * @param ModelRewriteRules <p>参数改写规则</p>
     */
    public void setModelRewriteRules(AIGWModelRewriteRule [] ModelRewriteRules) {
        this.ModelRewriteRules = ModelRewriteRules;
    }

    /**
     * Get <p>模型自定义供应商名称</p> 
     * @return CustomProviderName <p>模型自定义供应商名称</p>
     */
    public String getCustomProviderName() {
        return this.CustomProviderName;
    }

    /**
     * Set <p>模型自定义供应商名称</p>
     * @param CustomProviderName <p>模型自定义供应商名称</p>
     */
    public void setCustomProviderName(String CustomProviderName) {
        this.CustomProviderName = CustomProviderName;
    }

    /**
     * Get <p>外部服务来源ID</p> 
     * @return ExternalInstanceId <p>外部服务来源ID</p>
     */
    public String getExternalInstanceId() {
        return this.ExternalInstanceId;
    }

    /**
     * Set <p>外部服务来源ID</p>
     * @param ExternalInstanceId <p>外部服务来源ID</p>
     */
    public void setExternalInstanceId(String ExternalInstanceId) {
        this.ExternalInstanceId = ExternalInstanceId;
    }

    /**
     * Get <p>其他参数</p> 
     * @return ExtParams <p>其他参数</p>
     */
    public KeyValue [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set <p>其他参数</p>
     * @param ExtParams <p>其他参数</p>
     */
    public void setExtParams(KeyValue [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get <p>密钥轮转开关</p> 
     * @return KeyRotationEnabled <p>密钥轮转开关</p>
     */
    public Boolean getKeyRotationEnabled() {
        return this.KeyRotationEnabled;
    }

    /**
     * Set <p>密钥轮转开关</p>
     * @param KeyRotationEnabled <p>密钥轮转开关</p>
     */
    public void setKeyRotationEnabled(Boolean KeyRotationEnabled) {
        this.KeyRotationEnabled = KeyRotationEnabled;
    }

    /**
     * Get <p>密钥轮转周期</p><p>单位：天数</p> 
     * @return KeyRotationPeriodDays <p>密钥轮转周期</p><p>单位：天数</p>
     */
    public Long getKeyRotationPeriodDays() {
        return this.KeyRotationPeriodDays;
    }

    /**
     * Set <p>密钥轮转周期</p><p>单位：天数</p>
     * @param KeyRotationPeriodDays <p>密钥轮转周期</p><p>单位：天数</p>
     */
    public void setKeyRotationPeriodDays(Long KeyRotationPeriodDays) {
        this.KeyRotationPeriodDays = KeyRotationPeriodDays;
    }

    public CreateCloudNativeAPIGatewayLLMModelServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayLLMModelServiceRequest(CreateCloudNativeAPIGatewayLLMModelServiceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.ModelProtocol != null) {
            this.ModelProtocol = new String(source.ModelProtocol);
        }
        if (source.ModelSelector != null) {
            this.ModelSelector = new String(source.ModelSelector);
        }
        if (source.SecretKeyIds != null) {
            this.SecretKeyIds = new String[source.SecretKeyIds.length];
            for (int i = 0; i < source.SecretKeyIds.length; i++) {
                this.SecretKeyIds[i] = new String(source.SecretKeyIds[i]);
            }
        }
        if (source.DefaultModel != null) {
            this.DefaultModel = new String(source.DefaultModel);
        }
        if (source.EnableModelFallback != null) {
            this.EnableModelFallback = new Boolean(source.EnableModelFallback);
        }
        if (source.ModelFallbackRule != null) {
            this.ModelFallbackRule = new CloudNativeAPIGatewayLLMModelFallbackRule(source.ModelFallbackRule);
        }
        if (source.EnableModelParamCheck != null) {
            this.EnableModelParamCheck = new Boolean(source.EnableModelParamCheck);
        }
        if (source.ModelParamCheckRule != null) {
            this.ModelParamCheckRule = new CloudNativeAPIGatewayLLMModelParamCheckInfo(source.ModelParamCheckRule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpstreamURL != null) {
            this.UpstreamURL = new String(source.UpstreamURL);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.WriteTimeout != null) {
            this.WriteTimeout = new Long(source.WriteTimeout);
        }
        if (source.ReadTimeout != null) {
            this.ReadTimeout = new Long(source.ReadTimeout);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.UpstreamUrlMode != null) {
            this.UpstreamUrlMode = new String(source.UpstreamUrlMode);
        }
        if (source.SNI != null) {
            this.SNI = new String(source.SNI);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new AIGWLLMQuotaLimit(source.QuotaLimit);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.ModelRewriteRules != null) {
            this.ModelRewriteRules = new AIGWModelRewriteRule[source.ModelRewriteRules.length];
            for (int i = 0; i < source.ModelRewriteRules.length; i++) {
                this.ModelRewriteRules[i] = new AIGWModelRewriteRule(source.ModelRewriteRules[i]);
            }
        }
        if (source.CustomProviderName != null) {
            this.CustomProviderName = new String(source.CustomProviderName);
        }
        if (source.ExternalInstanceId != null) {
            this.ExternalInstanceId = new String(source.ExternalInstanceId);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new KeyValue[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new KeyValue(source.ExtParams[i]);
            }
        }
        if (source.KeyRotationEnabled != null) {
            this.KeyRotationEnabled = new Boolean(source.KeyRotationEnabled);
        }
        if (source.KeyRotationPeriodDays != null) {
            this.KeyRotationPeriodDays = new Long(source.KeyRotationPeriodDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamSimple(map, prefix + "ModelProtocol", this.ModelProtocol);
        this.setParamSimple(map, prefix + "ModelSelector", this.ModelSelector);
        this.setParamArraySimple(map, prefix + "SecretKeyIds.", this.SecretKeyIds);
        this.setParamSimple(map, prefix + "DefaultModel", this.DefaultModel);
        this.setParamSimple(map, prefix + "EnableModelFallback", this.EnableModelFallback);
        this.setParamObj(map, prefix + "ModelFallbackRule.", this.ModelFallbackRule);
        this.setParamSimple(map, prefix + "EnableModelParamCheck", this.EnableModelParamCheck);
        this.setParamObj(map, prefix + "ModelParamCheckRule.", this.ModelParamCheckRule);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpstreamURL", this.UpstreamURL);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "WriteTimeout", this.WriteTimeout);
        this.setParamSimple(map, prefix + "ReadTimeout", this.ReadTimeout);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamUrlMode", this.UpstreamUrlMode);
        this.setParamSimple(map, prefix + "SNI", this.SNI);
        this.setParamObj(map, prefix + "QuotaLimit.", this.QuotaLimit);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "ModelRewriteRules.", this.ModelRewriteRules);
        this.setParamSimple(map, prefix + "CustomProviderName", this.CustomProviderName);
        this.setParamSimple(map, prefix + "ExternalInstanceId", this.ExternalInstanceId);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "KeyRotationEnabled", this.KeyRotationEnabled);
        this.setParamSimple(map, prefix + "KeyRotationPeriodDays", this.KeyRotationPeriodDays);

    }
}

