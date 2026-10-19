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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchGetVLPlanSourceFileURLRequest extends AbstractModel {

    /**
    * <p>分析结果 ID 列表，最多 200 个</p>
    */
    @SerializedName("VLPlanResultIds")
    @Expose
    private String [] VLPlanResultIds;

    /**
    * <p>URL 有效期（秒），范围 [60, 86400]，默认 600</p>
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get <p>分析结果 ID 列表，最多 200 个</p> 
     * @return VLPlanResultIds <p>分析结果 ID 列表，最多 200 个</p>
     */
    public String [] getVLPlanResultIds() {
        return this.VLPlanResultIds;
    }

    /**
     * Set <p>分析结果 ID 列表，最多 200 个</p>
     * @param VLPlanResultIds <p>分析结果 ID 列表，最多 200 个</p>
     */
    public void setVLPlanResultIds(String [] VLPlanResultIds) {
        this.VLPlanResultIds = VLPlanResultIds;
    }

    /**
     * Get <p>URL 有效期（秒），范围 [60, 86400]，默认 600</p> 
     * @return Expire <p>URL 有效期（秒），范围 [60, 86400]，默认 600</p>
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set <p>URL 有效期（秒），范围 [60, 86400]，默认 600</p>
     * @param Expire <p>URL 有效期（秒），范围 [60, 86400]，默认 600</p>
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public BatchGetVLPlanSourceFileURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchGetVLPlanSourceFileURLRequest(BatchGetVLPlanSourceFileURLRequest source) {
        if (source.VLPlanResultIds != null) {
            this.VLPlanResultIds = new String[source.VLPlanResultIds.length];
            for (int i = 0; i < source.VLPlanResultIds.length; i++) {
                this.VLPlanResultIds[i] = new String(source.VLPlanResultIds[i]);
            }
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VLPlanResultIds.", this.VLPlanResultIds);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

