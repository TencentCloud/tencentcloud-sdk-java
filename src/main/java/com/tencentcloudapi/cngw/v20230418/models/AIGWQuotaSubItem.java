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

public class AIGWQuotaSubItem extends AbstractModel {

    /**
    * <p>子资源 ID（如：模型服务 ID）</p>
    */
    @SerializedName("SubResourceId")
    @Expose
    private String SubResourceId;

    /**
    * <p>该子资源独立配额上限，必须 &gt; 0；单位与 QuotaType 对齐（Cost=元 TotalToken=tokens RequestCount=次）</p>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
     * Get <p>子资源 ID（如：模型服务 ID）</p> 
     * @return SubResourceId <p>子资源 ID（如：模型服务 ID）</p>
     */
    public String getSubResourceId() {
        return this.SubResourceId;
    }

    /**
     * Set <p>子资源 ID（如：模型服务 ID）</p>
     * @param SubResourceId <p>子资源 ID（如：模型服务 ID）</p>
     */
    public void setSubResourceId(String SubResourceId) {
        this.SubResourceId = SubResourceId;
    }

    /**
     * Get <p>该子资源独立配额上限，必须 &gt; 0；单位与 QuotaType 对齐（Cost=元 TotalToken=tokens RequestCount=次）</p> 
     * @return QuotaLimit <p>该子资源独立配额上限，必须 &gt; 0；单位与 QuotaType 对齐（Cost=元 TotalToken=tokens RequestCount=次）</p>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>该子资源独立配额上限，必须 &gt; 0；单位与 QuotaType 对齐（Cost=元 TotalToken=tokens RequestCount=次）</p>
     * @param QuotaLimit <p>该子资源独立配额上限，必须 &gt; 0；单位与 QuotaType 对齐（Cost=元 TotalToken=tokens RequestCount=次）</p>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    public AIGWQuotaSubItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWQuotaSubItem(AIGWQuotaSubItem source) {
        if (source.SubResourceId != null) {
            this.SubResourceId = new String(source.SubResourceId);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubResourceId", this.SubResourceId);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

