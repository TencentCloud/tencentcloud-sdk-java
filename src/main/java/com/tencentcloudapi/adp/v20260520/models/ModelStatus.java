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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelStatus extends AbstractModel {

    /**
    * <p>专属并发数</p>
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * <p>是否专属并发</p>
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * <p>是否支持在智能工作台直接体验（模型广场详情页：依赖 space_id 动态判定；false 时前端置灰「立即体验」按钮）</p>
    */
    @SerializedName("IsExperienceSupported")
    @Expose
    private Boolean IsExperienceSupported;

    /**
    * <p>资源状态</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>资源可用</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>资源已用尽</td></tr></table>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * <p>调用 RPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
    */
    @SerializedName("RpmLimit")
    @Expose
    private String RpmLimit;

    /**
    * <p>调用 TPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
    */
    @SerializedName("TpmLimit")
    @Expose
    private String TpmLimit;

    /**
     * Get <p>专属并发数</p> 
     * @return Concurrency <p>专属并发数</p>
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set <p>专属并发数</p>
     * @param Concurrency <p>专属并发数</p>
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get <p>是否专属并发</p> 
     * @return IsExclusive <p>是否专属并发</p>
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set <p>是否专属并发</p>
     * @param IsExclusive <p>是否专属并发</p>
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get <p>是否支持在智能工作台直接体验（模型广场详情页：依赖 space_id 动态判定；false 时前端置灰「立即体验」按钮）</p> 
     * @return IsExperienceSupported <p>是否支持在智能工作台直接体验（模型广场详情页：依赖 space_id 动态判定；false 时前端置灰「立即体验」按钮）</p>
     */
    public Boolean getIsExperienceSupported() {
        return this.IsExperienceSupported;
    }

    /**
     * Set <p>是否支持在智能工作台直接体验（模型广场详情页：依赖 space_id 动态判定；false 时前端置灰「立即体验」按钮）</p>
     * @param IsExperienceSupported <p>是否支持在智能工作台直接体验（模型广场详情页：依赖 space_id 动态判定；false 时前端置灰「立即体验」按钮）</p>
     */
    public void setIsExperienceSupported(Boolean IsExperienceSupported) {
        this.IsExperienceSupported = IsExperienceSupported;
    }

    /**
     * Get <p>资源状态</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>资源可用</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>资源已用尽</td></tr></table> 
     * @return ResourceStatus <p>资源状态</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>资源可用</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>资源已用尽</td></tr></table>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>资源状态</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>资源可用</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>资源已用尽</td></tr></table>
     * @param ResourceStatus <p>资源状态</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>资源可用</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>资源已用尽</td></tr></table>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get <p>调用 RPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p> 
     * @return RpmLimit <p>调用 RPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     */
    public String getRpmLimit() {
        return this.RpmLimit;
    }

    /**
     * Set <p>调用 RPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     * @param RpmLimit <p>调用 RPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     */
    public void setRpmLimit(String RpmLimit) {
        this.RpmLimit = RpmLimit;
    }

    /**
     * Get <p>调用 TPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p> 
     * @return TpmLimit <p>调用 TPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     */
    public String getTpmLimit() {
        return this.TpmLimit;
    }

    /**
     * Set <p>调用 TPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     * @param TpmLimit <p>调用 TPM 上限（当前账号维度：有配置取配置，无配置取默认；0 表示未获取到）</p>
     */
    public void setTpmLimit(String TpmLimit) {
        this.TpmLimit = TpmLimit;
    }

    public ModelStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelStatus(ModelStatus source) {
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.IsExperienceSupported != null) {
            this.IsExperienceSupported = new Boolean(source.IsExperienceSupported);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.RpmLimit != null) {
            this.RpmLimit = new String(source.RpmLimit);
        }
        if (source.TpmLimit != null) {
            this.TpmLimit = new String(source.TpmLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "IsExperienceSupported", this.IsExperienceSupported);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "RpmLimit", this.RpmLimit);
        this.setParamSimple(map, prefix + "TpmLimit", this.TpmLimit);

    }
}

