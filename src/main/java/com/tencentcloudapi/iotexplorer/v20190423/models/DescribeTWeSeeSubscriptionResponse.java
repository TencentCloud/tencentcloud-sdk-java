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
    * 资源 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 套餐规格。可能取值：

- `BASIC`：包年包月基础版（适用于视频理解）
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * 到期时间，秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 启用状态，`true` 为开启，`false` 为关闭
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 订阅状态。可能取值：

- `NORMAL`：正常
- `ISOLATED`：隔离
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 视觉理解配置（适用于视频理解、图片理解）
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * 视频语义浓缩配置（适用于视频语义浓缩）
    */
    @SerializedName("CompHighlightConfig")
    @Expose
    private SeeCompHighlightConfig CompHighlightConfig;

    /**
    * 云存事件 ID 过滤规则配置项
    */
    @SerializedName("EventIdFilterConfig")
    @Expose
    private SeeEventIdFilterConfig EventIdFilterConfig;

    /**
    * 当前周期基础能力总额度
    */
    @SerializedName("QuotaBasic")
    @Expose
    private Long QuotaBasic;

    /**
    * 当前周期基础能力已用额度
    */
    @SerializedName("QuotaUsedBasic")
    @Expose
    private Long QuotaUsedBasic;

    /**
    * 当前周期高级能力总额度
    */
    @SerializedName("QuotaAdvanced")
    @Expose
    private Long QuotaAdvanced;

    /**
    * 当前周期高级能力已用额度
    */
    @SerializedName("QuotaUsedAdvanced")
    @Expose
    private Long QuotaUsedAdvanced;

    /**
    * 额度刷新时间
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
     * Get 资源 ID 
     * @return ResourceId 资源 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID
     * @param ResourceId 资源 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 套餐规格。可能取值：

- `BASIC`：包年包月基础版（适用于视频理解） 
     * @return ServiceTier 套餐规格。可能取值：

- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set 套餐规格。可能取值：

- `BASIC`：包年包月基础版（适用于视频理解）
     * @param ServiceTier 套餐规格。可能取值：

- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get 到期时间，秒级时间戳 
     * @return ExpireTime 到期时间，秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间，秒级时间戳
     * @param ExpireTime 到期时间，秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 启用状态，`true` 为开启，`false` 为关闭 
     * @return Enabled 启用状态，`true` 为开启，`false` 为关闭
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 启用状态，`true` 为开启，`false` 为关闭
     * @param Enabled 启用状态，`true` 为开启，`false` 为关闭
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 订阅状态。可能取值：

- `NORMAL`：正常
- `ISOLATED`：隔离 
     * @return Status 订阅状态。可能取值：

- `NORMAL`：正常
- `ISOLATED`：隔离
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅状态。可能取值：

- `NORMAL`：正常
- `ISOLATED`：隔离
     * @param Status 订阅状态。可能取值：

- `NORMAL`：正常
- `ISOLATED`：隔离
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 视觉理解配置（适用于视频理解、图片理解） 
     * @return ComprehensionConfig 视觉理解配置（适用于视频理解、图片理解）
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set 视觉理解配置（适用于视频理解、图片理解）
     * @param ComprehensionConfig 视觉理解配置（适用于视频理解、图片理解）
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get 视频语义浓缩配置（适用于视频语义浓缩） 
     * @return CompHighlightConfig 视频语义浓缩配置（适用于视频语义浓缩）
     */
    public SeeCompHighlightConfig getCompHighlightConfig() {
        return this.CompHighlightConfig;
    }

    /**
     * Set 视频语义浓缩配置（适用于视频语义浓缩）
     * @param CompHighlightConfig 视频语义浓缩配置（适用于视频语义浓缩）
     */
    public void setCompHighlightConfig(SeeCompHighlightConfig CompHighlightConfig) {
        this.CompHighlightConfig = CompHighlightConfig;
    }

    /**
     * Get 云存事件 ID 过滤规则配置项 
     * @return EventIdFilterConfig 云存事件 ID 过滤规则配置项
     */
    public SeeEventIdFilterConfig getEventIdFilterConfig() {
        return this.EventIdFilterConfig;
    }

    /**
     * Set 云存事件 ID 过滤规则配置项
     * @param EventIdFilterConfig 云存事件 ID 过滤规则配置项
     */
    public void setEventIdFilterConfig(SeeEventIdFilterConfig EventIdFilterConfig) {
        this.EventIdFilterConfig = EventIdFilterConfig;
    }

    /**
     * Get 当前周期基础能力总额度 
     * @return QuotaBasic 当前周期基础能力总额度
     */
    public Long getQuotaBasic() {
        return this.QuotaBasic;
    }

    /**
     * Set 当前周期基础能力总额度
     * @param QuotaBasic 当前周期基础能力总额度
     */
    public void setQuotaBasic(Long QuotaBasic) {
        this.QuotaBasic = QuotaBasic;
    }

    /**
     * Get 当前周期基础能力已用额度 
     * @return QuotaUsedBasic 当前周期基础能力已用额度
     */
    public Long getQuotaUsedBasic() {
        return this.QuotaUsedBasic;
    }

    /**
     * Set 当前周期基础能力已用额度
     * @param QuotaUsedBasic 当前周期基础能力已用额度
     */
    public void setQuotaUsedBasic(Long QuotaUsedBasic) {
        this.QuotaUsedBasic = QuotaUsedBasic;
    }

    /**
     * Get 当前周期高级能力总额度 
     * @return QuotaAdvanced 当前周期高级能力总额度
     */
    public Long getQuotaAdvanced() {
        return this.QuotaAdvanced;
    }

    /**
     * Set 当前周期高级能力总额度
     * @param QuotaAdvanced 当前周期高级能力总额度
     */
    public void setQuotaAdvanced(Long QuotaAdvanced) {
        this.QuotaAdvanced = QuotaAdvanced;
    }

    /**
     * Get 当前周期高级能力已用额度 
     * @return QuotaUsedAdvanced 当前周期高级能力已用额度
     */
    public Long getQuotaUsedAdvanced() {
        return this.QuotaUsedAdvanced;
    }

    /**
     * Set 当前周期高级能力已用额度
     * @param QuotaUsedAdvanced 当前周期高级能力已用额度
     */
    public void setQuotaUsedAdvanced(Long QuotaUsedAdvanced) {
        this.QuotaUsedAdvanced = QuotaUsedAdvanced;
    }

    /**
     * Get 额度刷新时间 
     * @return QuotaRefreshTime 额度刷新时间
     */
    public Long getQuotaRefreshTime() {
        return this.QuotaRefreshTime;
    }

    /**
     * Set 额度刷新时间
     * @param QuotaRefreshTime 额度刷新时间
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
        this.setParamSimple(map, prefix + "QuotaBasic", this.QuotaBasic);
        this.setParamSimple(map, prefix + "QuotaUsedBasic", this.QuotaUsedBasic);
        this.setParamSimple(map, prefix + "QuotaAdvanced", this.QuotaAdvanced);
        this.setParamSimple(map, prefix + "QuotaUsedAdvanced", this.QuotaUsedAdvanced);
        this.setParamSimple(map, prefix + "QuotaRefreshTime", this.QuotaRefreshTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

