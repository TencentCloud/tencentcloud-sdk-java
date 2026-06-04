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
    * 专属并发数
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * 是否专属并发
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * 资源状态。1-资源可用, 2-资源已用尽
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get 专属并发数 
     * @return Concurrency 专属并发数
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set 专属并发数
     * @param Concurrency 专属并发数
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get 是否专属并发 
     * @return IsExclusive 是否专属并发
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set 是否专属并发
     * @param IsExclusive 是否专属并发
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get 资源状态。1-资源可用, 2-资源已用尽 
     * @return ResourceStatus 资源状态。1-资源可用, 2-资源已用尽
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态。1-资源可用, 2-资源已用尽
     * @param ResourceStatus 资源状态。1-资源可用, 2-资源已用尽
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
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
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

