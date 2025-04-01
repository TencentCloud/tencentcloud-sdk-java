/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DeleteIncrementalMigrationStrategyRequest extends AbstractModel {

    /**
    * <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
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
    * 增量迁移策略 ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
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
     * Get 增量迁移策略 ID。 
     * @return StrategyId 增量迁移策略 ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 增量迁移策略 ID。
     * @param StrategyId 增量迁移策略 ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public DeleteIncrementalMigrationStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIncrementalMigrationStrategyRequest(DeleteIncrementalMigrationStrategyRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

