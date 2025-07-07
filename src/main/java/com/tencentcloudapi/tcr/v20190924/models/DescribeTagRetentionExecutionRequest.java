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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagRetentionExecutionRequest extends AbstractModel {

    /**
    * 主实例iD
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 规则Id
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * 分页PageSize
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Page
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 主实例iD 
     * @return RegistryId 主实例iD
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 主实例iD
     * @param RegistryId 主实例iD
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 规则Id 
     * @return RetentionId 规则Id
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set 规则Id
     * @param RetentionId 规则Id
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get 分页PageSize 
     * @return Limit 分页PageSize
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页PageSize
     * @param Limit 分页PageSize
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Page 
     * @return Offset 分页Page
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Page
     * @param Offset 分页Page
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTagRetentionExecutionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagRetentionExecutionRequest(DescribeTagRetentionExecutionRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
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
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

