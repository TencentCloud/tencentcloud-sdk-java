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

public class DescribeBillingInfoRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>环境列表，当环境列表不为空时，查询的环境以该参数为准</p>
    */
    @SerializedName("EnvIds")
    @Expose
    private String [] EnvIds;

    /**
    * <p>每页条数（用于拉取列表时分页）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>环境列表，当环境列表不为空时，查询的环境以该参数为准</p> 
     * @return EnvIds <p>环境列表，当环境列表不为空时，查询的环境以该参数为准</p>
     */
    public String [] getEnvIds() {
        return this.EnvIds;
    }

    /**
     * Set <p>环境列表，当环境列表不为空时，查询的环境以该参数为准</p>
     * @param EnvIds <p>环境列表，当环境列表不为空时，查询的环境以该参数为准</p>
     */
    public void setEnvIds(String [] EnvIds) {
        this.EnvIds = EnvIds;
    }

    /**
     * Get <p>每页条数（用于拉取列表时分页）</p> 
     * @return Limit <p>每页条数（用于拉取列表时分页）</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数（用于拉取列表时分页）</p>
     * @param Limit <p>每页条数（用于拉取列表时分页）</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移</p> 
     * @return Offset <p>偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移</p>
     * @param Offset <p>偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeBillingInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingInfoRequest(DescribeBillingInfoRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnvIds != null) {
            this.EnvIds = new String[source.EnvIds.length];
            for (int i = 0; i < source.EnvIds.length; i++) {
                this.EnvIds[i] = new String(source.EnvIds[i]);
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
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "EnvIds.", this.EnvIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

