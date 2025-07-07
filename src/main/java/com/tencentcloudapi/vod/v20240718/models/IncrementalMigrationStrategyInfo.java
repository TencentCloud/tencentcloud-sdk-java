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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationStrategyInfo extends AbstractModel {

    /**
    * 策略 ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 策略名称。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <b>策略生效的点播专业版[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 策略生效的存储桶 ID。
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * 源站类型。取值有：<li>HTTP：HTTP 源。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 回源源站配置。
    */
    @SerializedName("HttpOriginConfig")
    @Expose
    private IncrementalMigrationHttpOriginConfig HttpOriginConfig;

    /**
     * Get 策略 ID。 
     * @return StrategyId 策略 ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略 ID。
     * @param StrategyId 策略 ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 策略名称。 
     * @return StrategyName 策略名称。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称。
     * @param StrategyName 策略名称。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <b>策略生效的点播专业版[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>策略生效的点播专业版[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>策略生效的点播专业版[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>策略生效的点播专业版[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 策略生效的存储桶 ID。 
     * @return BucketId 策略生效的存储桶 ID。
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set 策略生效的存储桶 ID。
     * @param BucketId 策略生效的存储桶 ID。
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get 源站类型。取值有：<li>HTTP：HTTP 源。</li> 
     * @return OriginType 源站类型。取值有：<li>HTTP：HTTP 源。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型。取值有：<li>HTTP：HTTP 源。</li>
     * @param OriginType 源站类型。取值有：<li>HTTP：HTTP 源。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 回源源站配置。 
     * @return HttpOriginConfig 回源源站配置。
     */
    public IncrementalMigrationHttpOriginConfig getHttpOriginConfig() {
        return this.HttpOriginConfig;
    }

    /**
     * Set 回源源站配置。
     * @param HttpOriginConfig 回源源站配置。
     */
    public void setHttpOriginConfig(IncrementalMigrationHttpOriginConfig HttpOriginConfig) {
        this.HttpOriginConfig = HttpOriginConfig;
    }

    public IncrementalMigrationStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationStrategyInfo(IncrementalMigrationStrategyInfo source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.HttpOriginConfig != null) {
            this.HttpOriginConfig = new IncrementalMigrationHttpOriginConfig(source.HttpOriginConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamObj(map, prefix + "HttpOriginConfig.", this.HttpOriginConfig);

    }
}

