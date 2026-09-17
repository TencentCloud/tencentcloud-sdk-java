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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlatformsRequest extends AbstractModel {

    /**
    * <p>平台版套餐id列表</p><p>默认值：若不指定，则分页返回当前账号下所有平台版资源</p>
    */
    @SerializedName("PlatformIds")
    @Expose
    private String [] PlatformIds;

    /**
    * <p>分页限制</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>平台版套餐id列表</p><p>默认值：若不指定，则分页返回当前账号下所有平台版资源</p> 
     * @return PlatformIds <p>平台版套餐id列表</p><p>默认值：若不指定，则分页返回当前账号下所有平台版资源</p>
     */
    public String [] getPlatformIds() {
        return this.PlatformIds;
    }

    /**
     * Set <p>平台版套餐id列表</p><p>默认值：若不指定，则分页返回当前账号下所有平台版资源</p>
     * @param PlatformIds <p>平台版套餐id列表</p><p>默认值：若不指定，则分页返回当前账号下所有平台版资源</p>
     */
    public void setPlatformIds(String [] PlatformIds) {
        this.PlatformIds = PlatformIds;
    }

    /**
     * Get <p>分页限制</p><p>取值范围：[10, 100]</p><p>默认值：10</p> 
     * @return Limit <p>分页限制</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     * @param Limit <p>分页限制</p><p>取值范围：[10, 100]</p><p>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量</p><p>默认值：0</p> 
     * @return Offset <p>分页偏移量</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p><p>默认值：0</p>
     * @param Offset <p>分页偏移量</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribePlatformsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlatformsRequest(DescribePlatformsRequest source) {
        if (source.PlatformIds != null) {
            this.PlatformIds = new String[source.PlatformIds.length];
            for (int i = 0; i < source.PlatformIds.length; i++) {
                this.PlatformIds[i] = new String(source.PlatformIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PlatformIds.", this.PlatformIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

