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

public class ModifyModelRouterAttributesRequest extends AbstractModel {

    /**
    * <p>模型路由ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>新的 HTTPS 证书ID，用于替换实例 HTTPS 服务端点当前绑定的证书。常用于证书到期前的更换场景。</p><p>使用限制：</p><ul><li>仅企业型（Enterprise）且服务端点协议为 HTTPS 的实例支持修改证书。</li><li>证书须为 SSL 证书控制台中状态为“已签发”（可用）且未过期的服务器证书（SVR 类型）。可在 <a href="https://console.cloud.tencent.com/ssl">SSL 证书控制台</a> 查看证书ID。</li><li>替换后新证书立即生效，过程中不会中断业务流量。</li><li>若传入的证书与当前绑定的证书相同，接口直接返回成功，不做任何变更。</li></ul><p>不传则证书保持不变。可通过 <code>DescribeModelRouterDetail</code> 接口的 <code>ServiceEndPoints.CertId</code> 字段查询当前绑定的证书。</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>模型路由名称</p>
    */
    @SerializedName("ModelRouterName")
    @Expose
    private String ModelRouterName;

    /**
    * <p>限速配置</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForModelRouter RateLimitConfig;

    /**
    * <p>路由配置</p>
    */
    @SerializedName("RouterSetting")
    @Expose
    private RouterSettingWithFallBack RouterSetting;

    /**
    * <p>带宽</p><p>取值范围：[1, 2048]</p><p>单位：Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
    */
    @SerializedName("Capability")
    @Expose
    private String Capability;

    /**
    * <p>Embedding 调度配置</p><p>传入该参数时，必须传Capability为embedding</p>
    */
    @SerializedName("EmbeddingConfig")
    @Expose
    private EmbeddingConfig EmbeddingConfig;

    /**
    * <p>Video 调度配置</p>
    */
    @SerializedName("VideoConfig")
    @Expose
    private VideoConfig VideoConfig;

    /**
    * <p>Rerank 调度配置</p><p>传入该参数时，必须传Capability为rerank</p>
    */
    @SerializedName("RerankConfig")
    @Expose
    private RerankConfig RerankConfig;

    /**
    * <p>Decisions 调度配置</p>
    */
    @SerializedName("DecisionsConfig")
    @Expose
    private DecisionsConfig DecisionsConfig;

    /**
     * Get <p>模型路由ID</p> 
     * @return ModelRouterId <p>模型路由ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由ID</p>
     * @param ModelRouterId <p>模型路由ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>新的 HTTPS 证书ID，用于替换实例 HTTPS 服务端点当前绑定的证书。常用于证书到期前的更换场景。</p><p>使用限制：</p><ul><li>仅企业型（Enterprise）且服务端点协议为 HTTPS 的实例支持修改证书。</li><li>证书须为 SSL 证书控制台中状态为“已签发”（可用）且未过期的服务器证书（SVR 类型）。可在 <a href="https://console.cloud.tencent.com/ssl">SSL 证书控制台</a> 查看证书ID。</li><li>替换后新证书立即生效，过程中不会中断业务流量。</li><li>若传入的证书与当前绑定的证书相同，接口直接返回成功，不做任何变更。</li></ul><p>不传则证书保持不变。可通过 <code>DescribeModelRouterDetail</code> 接口的 <code>ServiceEndPoints.CertId</code> 字段查询当前绑定的证书。</p> 
     * @return CertId <p>新的 HTTPS 证书ID，用于替换实例 HTTPS 服务端点当前绑定的证书。常用于证书到期前的更换场景。</p><p>使用限制：</p><ul><li>仅企业型（Enterprise）且服务端点协议为 HTTPS 的实例支持修改证书。</li><li>证书须为 SSL 证书控制台中状态为“已签发”（可用）且未过期的服务器证书（SVR 类型）。可在 <a href="https://console.cloud.tencent.com/ssl">SSL 证书控制台</a> 查看证书ID。</li><li>替换后新证书立即生效，过程中不会中断业务流量。</li><li>若传入的证书与当前绑定的证书相同，接口直接返回成功，不做任何变更。</li></ul><p>不传则证书保持不变。可通过 <code>DescribeModelRouterDetail</code> 接口的 <code>ServiceEndPoints.CertId</code> 字段查询当前绑定的证书。</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>新的 HTTPS 证书ID，用于替换实例 HTTPS 服务端点当前绑定的证书。常用于证书到期前的更换场景。</p><p>使用限制：</p><ul><li>仅企业型（Enterprise）且服务端点协议为 HTTPS 的实例支持修改证书。</li><li>证书须为 SSL 证书控制台中状态为“已签发”（可用）且未过期的服务器证书（SVR 类型）。可在 <a href="https://console.cloud.tencent.com/ssl">SSL 证书控制台</a> 查看证书ID。</li><li>替换后新证书立即生效，过程中不会中断业务流量。</li><li>若传入的证书与当前绑定的证书相同，接口直接返回成功，不做任何变更。</li></ul><p>不传则证书保持不变。可通过 <code>DescribeModelRouterDetail</code> 接口的 <code>ServiceEndPoints.CertId</code> 字段查询当前绑定的证书。</p>
     * @param CertId <p>新的 HTTPS 证书ID，用于替换实例 HTTPS 服务端点当前绑定的证书。常用于证书到期前的更换场景。</p><p>使用限制：</p><ul><li>仅企业型（Enterprise）且服务端点协议为 HTTPS 的实例支持修改证书。</li><li>证书须为 SSL 证书控制台中状态为“已签发”（可用）且未过期的服务器证书（SVR 类型）。可在 <a href="https://console.cloud.tencent.com/ssl">SSL 证书控制台</a> 查看证书ID。</li><li>替换后新证书立即生效，过程中不会中断业务流量。</li><li>若传入的证书与当前绑定的证书相同，接口直接返回成功，不做任何变更。</li></ul><p>不传则证书保持不变。可通过 <code>DescribeModelRouterDetail</code> 接口的 <code>ServiceEndPoints.CertId</code> 字段查询当前绑定的证书。</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>模型路由名称</p> 
     * @return ModelRouterName <p>模型路由名称</p>
     */
    public String getModelRouterName() {
        return this.ModelRouterName;
    }

    /**
     * Set <p>模型路由名称</p>
     * @param ModelRouterName <p>模型路由名称</p>
     */
    public void setModelRouterName(String ModelRouterName) {
        this.ModelRouterName = ModelRouterName;
    }

    /**
     * Get <p>限速配置</p> 
     * @return RateLimitConfig <p>限速配置</p>
     */
    public RateLimitConfigForModelRouter getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速配置</p>
     * @param RateLimitConfig <p>限速配置</p>
     */
    public void setRateLimitConfig(RateLimitConfigForModelRouter RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>路由配置</p> 
     * @return RouterSetting <p>路由配置</p>
     */
    public RouterSettingWithFallBack getRouterSetting() {
        return this.RouterSetting;
    }

    /**
     * Set <p>路由配置</p>
     * @param RouterSetting <p>路由配置</p>
     */
    public void setRouterSetting(RouterSettingWithFallBack RouterSetting) {
        this.RouterSetting = RouterSetting;
    }

    /**
     * Get <p>带宽</p><p>取值范围：[1, 2048]</p><p>单位：Mbps</p> 
     * @return Bandwidth <p>带宽</p><p>取值范围：[1, 2048]</p><p>单位：Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽</p><p>取值范围：[1, 2048]</p><p>单位：Mbps</p>
     * @param Bandwidth <p>带宽</p><p>取值范围：[1, 2048]</p><p>单位：Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul> 
     * @return Capability <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     */
    public String getCapability() {
        return this.Capability;
    }

    /**
     * Set <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     * @param Capability <p>模型输出模态</p><p>枚举值：</p><ul><li>chat： 文本</li><li>embedding： 向量</li><li>video： 视频</li><li>rerank： 重排序</li></ul>
     */
    public void setCapability(String Capability) {
        this.Capability = Capability;
    }

    /**
     * Get <p>Embedding 调度配置</p><p>传入该参数时，必须传Capability为embedding</p> 
     * @return EmbeddingConfig <p>Embedding 调度配置</p><p>传入该参数时，必须传Capability为embedding</p>
     */
    public EmbeddingConfig getEmbeddingConfig() {
        return this.EmbeddingConfig;
    }

    /**
     * Set <p>Embedding 调度配置</p><p>传入该参数时，必须传Capability为embedding</p>
     * @param EmbeddingConfig <p>Embedding 调度配置</p><p>传入该参数时，必须传Capability为embedding</p>
     */
    public void setEmbeddingConfig(EmbeddingConfig EmbeddingConfig) {
        this.EmbeddingConfig = EmbeddingConfig;
    }

    /**
     * Get <p>Video 调度配置</p> 
     * @return VideoConfig <p>Video 调度配置</p>
     */
    public VideoConfig getVideoConfig() {
        return this.VideoConfig;
    }

    /**
     * Set <p>Video 调度配置</p>
     * @param VideoConfig <p>Video 调度配置</p>
     */
    public void setVideoConfig(VideoConfig VideoConfig) {
        this.VideoConfig = VideoConfig;
    }

    /**
     * Get <p>Rerank 调度配置</p><p>传入该参数时，必须传Capability为rerank</p> 
     * @return RerankConfig <p>Rerank 调度配置</p><p>传入该参数时，必须传Capability为rerank</p>
     */
    public RerankConfig getRerankConfig() {
        return this.RerankConfig;
    }

    /**
     * Set <p>Rerank 调度配置</p><p>传入该参数时，必须传Capability为rerank</p>
     * @param RerankConfig <p>Rerank 调度配置</p><p>传入该参数时，必须传Capability为rerank</p>
     */
    public void setRerankConfig(RerankConfig RerankConfig) {
        this.RerankConfig = RerankConfig;
    }

    /**
     * Get <p>Decisions 调度配置</p> 
     * @return DecisionsConfig <p>Decisions 调度配置</p>
     */
    public DecisionsConfig getDecisionsConfig() {
        return this.DecisionsConfig;
    }

    /**
     * Set <p>Decisions 调度配置</p>
     * @param DecisionsConfig <p>Decisions 调度配置</p>
     */
    public void setDecisionsConfig(DecisionsConfig DecisionsConfig) {
        this.DecisionsConfig = DecisionsConfig;
    }

    public ModifyModelRouterAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModelRouterAttributesRequest(ModifyModelRouterAttributesRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.ModelRouterName != null) {
            this.ModelRouterName = new String(source.ModelRouterName);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForModelRouter(source.RateLimitConfig);
        }
        if (source.RouterSetting != null) {
            this.RouterSetting = new RouterSettingWithFallBack(source.RouterSetting);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Capability != null) {
            this.Capability = new String(source.Capability);
        }
        if (source.EmbeddingConfig != null) {
            this.EmbeddingConfig = new EmbeddingConfig(source.EmbeddingConfig);
        }
        if (source.VideoConfig != null) {
            this.VideoConfig = new VideoConfig(source.VideoConfig);
        }
        if (source.RerankConfig != null) {
            this.RerankConfig = new RerankConfig(source.RerankConfig);
        }
        if (source.DecisionsConfig != null) {
            this.DecisionsConfig = new DecisionsConfig(source.DecisionsConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "ModelRouterName", this.ModelRouterName);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "RouterSetting.", this.RouterSetting);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Capability", this.Capability);
        this.setParamObj(map, prefix + "EmbeddingConfig.", this.EmbeddingConfig);
        this.setParamObj(map, prefix + "VideoConfig.", this.VideoConfig);
        this.setParamObj(map, prefix + "RerankConfig.", this.RerankConfig);
        this.setParamObj(map, prefix + "DecisionsConfig.", this.DecisionsConfig);

    }
}

