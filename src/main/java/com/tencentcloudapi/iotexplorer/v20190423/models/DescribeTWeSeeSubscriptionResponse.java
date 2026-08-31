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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTWeSeeSubscriptionResponse extends AbstractModel {

    /**
    * <p>资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>套餐规格。可能取值：</p><ul><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * <p>到期时间，秒级时间戳</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>启用状态，<code>true</code> 为开启，<code>false</code> 为关闭</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>订阅状态。可能取值：</p><ul><li><code>NORMAL</code>：正常</li><li><code>ISOLATED</code>：隔离</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>视觉理解配置（适用于视频理解、图片理解）</p>
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * <p>视频语义浓缩配置（适用于视频语义浓缩）</p>
    */
    @SerializedName("CompHighlightConfig")
    @Expose
    private SeeCompHighlightConfig CompHighlightConfig;

    /**
    * <p>云存事件 ID 过滤规则配置项</p>
    */
    @SerializedName("EventIdFilterConfig")
    @Expose
    private SeeEventIdFilterConfig EventIdFilterConfig;

    /**
    * <p>每日与每周总结配置</p>
    */
    @SerializedName("SummarizeConfig")
    @Expose
    private SeeSummarizeConfig SummarizeConfig;

    /**
    * <p>当前周期基础能力总额度</p>
    */
    @SerializedName("QuotaBasic")
    @Expose
    private Long QuotaBasic;

    /**
    * <p>当前周期基础能力已用额度</p>
    */
    @SerializedName("QuotaUsedBasic")
    @Expose
    private Long QuotaUsedBasic;

    /**
    * <p>当前周期高级能力总额度</p>
    */
    @SerializedName("QuotaAdvanced")
    @Expose
    private Long QuotaAdvanced;

    /**
    * <p>当前周期高级能力已用额度</p>
    */
    @SerializedName("QuotaUsedAdvanced")
    @Expose
    private Long QuotaUsedAdvanced;

    /**
    * <p>额度刷新时间</p>
    */
    @SerializedName("QuotaRefreshTime")
    @Expose
    private Long QuotaRefreshTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源 ID</p> 
     * @return ResourceId <p>资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID</p>
     * @param ResourceId <p>资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>套餐规格。可能取值：</p><ul><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul> 
     * @return ServiceTier <p>套餐规格。可能取值：</p><ul><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set <p>套餐规格。可能取值：</p><ul><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     * @param ServiceTier <p>套餐规格。可能取值：</p><ul><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get <p>到期时间，秒级时间戳</p> 
     * @return ExpireTime <p>到期时间，秒级时间戳</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>到期时间，秒级时间戳</p>
     * @param ExpireTime <p>到期时间，秒级时间戳</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>启用状态，<code>true</code> 为开启，<code>false</code> 为关闭</p> 
     * @return Enabled <p>启用状态，<code>true</code> 为开启，<code>false</code> 为关闭</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>启用状态，<code>true</code> 为开启，<code>false</code> 为关闭</p>
     * @param Enabled <p>启用状态，<code>true</code> 为开启，<code>false</code> 为关闭</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>订阅状态。可能取值：</p><ul><li><code>NORMAL</code>：正常</li><li><code>ISOLATED</code>：隔离</li></ul> 
     * @return Status <p>订阅状态。可能取值：</p><ul><li><code>NORMAL</code>：正常</li><li><code>ISOLATED</code>：隔离</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订阅状态。可能取值：</p><ul><li><code>NORMAL</code>：正常</li><li><code>ISOLATED</code>：隔离</li></ul>
     * @param Status <p>订阅状态。可能取值：</p><ul><li><code>NORMAL</code>：正常</li><li><code>ISOLATED</code>：隔离</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>视觉理解配置（适用于视频理解、图片理解）</p> 
     * @return ComprehensionConfig <p>视觉理解配置（适用于视频理解、图片理解）</p>
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set <p>视觉理解配置（适用于视频理解、图片理解）</p>
     * @param ComprehensionConfig <p>视觉理解配置（适用于视频理解、图片理解）</p>
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get <p>视频语义浓缩配置（适用于视频语义浓缩）</p> 
     * @return CompHighlightConfig <p>视频语义浓缩配置（适用于视频语义浓缩）</p>
     */
    public SeeCompHighlightConfig getCompHighlightConfig() {
        return this.CompHighlightConfig;
    }

    /**
     * Set <p>视频语义浓缩配置（适用于视频语义浓缩）</p>
     * @param CompHighlightConfig <p>视频语义浓缩配置（适用于视频语义浓缩）</p>
     */
    public void setCompHighlightConfig(SeeCompHighlightConfig CompHighlightConfig) {
        this.CompHighlightConfig = CompHighlightConfig;
    }

    /**
     * Get <p>云存事件 ID 过滤规则配置项</p> 
     * @return EventIdFilterConfig <p>云存事件 ID 过滤规则配置项</p>
     */
    public SeeEventIdFilterConfig getEventIdFilterConfig() {
        return this.EventIdFilterConfig;
    }

    /**
     * Set <p>云存事件 ID 过滤规则配置项</p>
     * @param EventIdFilterConfig <p>云存事件 ID 过滤规则配置项</p>
     */
    public void setEventIdFilterConfig(SeeEventIdFilterConfig EventIdFilterConfig) {
        this.EventIdFilterConfig = EventIdFilterConfig;
    }

    /**
     * Get <p>每日与每周总结配置</p> 
     * @return SummarizeConfig <p>每日与每周总结配置</p>
     */
    public SeeSummarizeConfig getSummarizeConfig() {
        return this.SummarizeConfig;
    }

    /**
     * Set <p>每日与每周总结配置</p>
     * @param SummarizeConfig <p>每日与每周总结配置</p>
     */
    public void setSummarizeConfig(SeeSummarizeConfig SummarizeConfig) {
        this.SummarizeConfig = SummarizeConfig;
    }

    /**
     * Get <p>当前周期基础能力总额度</p> 
     * @return QuotaBasic <p>当前周期基础能力总额度</p>
     */
    public Long getQuotaBasic() {
        return this.QuotaBasic;
    }

    /**
     * Set <p>当前周期基础能力总额度</p>
     * @param QuotaBasic <p>当前周期基础能力总额度</p>
     */
    public void setQuotaBasic(Long QuotaBasic) {
        this.QuotaBasic = QuotaBasic;
    }

    /**
     * Get <p>当前周期基础能力已用额度</p> 
     * @return QuotaUsedBasic <p>当前周期基础能力已用额度</p>
     */
    public Long getQuotaUsedBasic() {
        return this.QuotaUsedBasic;
    }

    /**
     * Set <p>当前周期基础能力已用额度</p>
     * @param QuotaUsedBasic <p>当前周期基础能力已用额度</p>
     */
    public void setQuotaUsedBasic(Long QuotaUsedBasic) {
        this.QuotaUsedBasic = QuotaUsedBasic;
    }

    /**
     * Get <p>当前周期高级能力总额度</p> 
     * @return QuotaAdvanced <p>当前周期高级能力总额度</p>
     */
    public Long getQuotaAdvanced() {
        return this.QuotaAdvanced;
    }

    /**
     * Set <p>当前周期高级能力总额度</p>
     * @param QuotaAdvanced <p>当前周期高级能力总额度</p>
     */
    public void setQuotaAdvanced(Long QuotaAdvanced) {
        this.QuotaAdvanced = QuotaAdvanced;
    }

    /**
     * Get <p>当前周期高级能力已用额度</p> 
     * @return QuotaUsedAdvanced <p>当前周期高级能力已用额度</p>
     */
    public Long getQuotaUsedAdvanced() {
        return this.QuotaUsedAdvanced;
    }

    /**
     * Set <p>当前周期高级能力已用额度</p>
     * @param QuotaUsedAdvanced <p>当前周期高级能力已用额度</p>
     */
    public void setQuotaUsedAdvanced(Long QuotaUsedAdvanced) {
        this.QuotaUsedAdvanced = QuotaUsedAdvanced;
    }

    /**
     * Get <p>额度刷新时间</p> 
     * @return QuotaRefreshTime <p>额度刷新时间</p>
     */
    public Long getQuotaRefreshTime() {
        return this.QuotaRefreshTime;
    }

    /**
     * Set <p>额度刷新时间</p>
     * @param QuotaRefreshTime <p>额度刷新时间</p>
     */
    public void setQuotaRefreshTime(Long QuotaRefreshTime) {
        this.QuotaRefreshTime = QuotaRefreshTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTWeSeeSubscriptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeeSubscriptionResponse(DescribeTWeSeeSubscriptionResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ServiceTier != null) {
            this.ServiceTier = new String(source.ServiceTier);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComprehensionConfig != null) {
            this.ComprehensionConfig = new SeeComprehensionConfig(source.ComprehensionConfig);
        }
        if (source.CompHighlightConfig != null) {
            this.CompHighlightConfig = new SeeCompHighlightConfig(source.CompHighlightConfig);
        }
        if (source.EventIdFilterConfig != null) {
            this.EventIdFilterConfig = new SeeEventIdFilterConfig(source.EventIdFilterConfig);
        }
        if (source.SummarizeConfig != null) {
            this.SummarizeConfig = new SeeSummarizeConfig(source.SummarizeConfig);
        }
        if (source.QuotaBasic != null) {
            this.QuotaBasic = new Long(source.QuotaBasic);
        }
        if (source.QuotaUsedBasic != null) {
            this.QuotaUsedBasic = new Long(source.QuotaUsedBasic);
        }
        if (source.QuotaAdvanced != null) {
            this.QuotaAdvanced = new Long(source.QuotaAdvanced);
        }
        if (source.QuotaUsedAdvanced != null) {
            this.QuotaUsedAdvanced = new Long(source.QuotaUsedAdvanced);
        }
        if (source.QuotaRefreshTime != null) {
            this.QuotaRefreshTime = new Long(source.QuotaRefreshTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ServiceTier", this.ServiceTier);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ComprehensionConfig.", this.ComprehensionConfig);
        this.setParamObj(map, prefix + "CompHighlightConfig.", this.CompHighlightConfig);
        this.setParamObj(map, prefix + "EventIdFilterConfig.", this.EventIdFilterConfig);
        this.setParamObj(map, prefix + "SummarizeConfig.", this.SummarizeConfig);
        this.setParamSimple(map, prefix + "QuotaBasic", this.QuotaBasic);
        this.setParamSimple(map, prefix + "QuotaUsedBasic", this.QuotaUsedBasic);
        this.setParamSimple(map, prefix + "QuotaAdvanced", this.QuotaAdvanced);
        this.setParamSimple(map, prefix + "QuotaUsedAdvanced", this.QuotaUsedAdvanced);
        this.setParamSimple(map, prefix + "QuotaRefreshTime", this.QuotaRefreshTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

