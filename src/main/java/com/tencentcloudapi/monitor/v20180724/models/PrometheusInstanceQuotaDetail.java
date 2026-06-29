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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceQuotaDetail extends AbstractModel {

    /**
    * <p>prometheus实例创建总限制数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>当前账号下创建prometheus实例数量</p>
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
    * <p>剩余可用prometheus实例创建数量</p>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get <p>prometheus实例创建总限制数量</p> 
     * @return Limit <p>prometheus实例创建总限制数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>prometheus实例创建总限制数量</p>
     * @param Limit <p>prometheus实例创建总限制数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>当前账号下创建prometheus实例数量</p> 
     * @return Usage <p>当前账号下创建prometheus实例数量</p>
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>当前账号下创建prometheus实例数量</p>
     * @param Usage <p>当前账号下创建prometheus实例数量</p>
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p>剩余可用prometheus实例创建数量</p> 
     * @return Available <p>剩余可用prometheus实例创建数量</p>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>剩余可用prometheus实例创建数量</p>
     * @param Available <p>剩余可用prometheus实例创建数量</p>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public PrometheusInstanceQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceQuotaDetail(PrometheusInstanceQuotaDetail source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

