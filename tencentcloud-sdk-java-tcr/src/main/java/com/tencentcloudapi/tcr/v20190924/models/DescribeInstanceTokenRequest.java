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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceTokenRequest extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 分页单页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例 ID 
     * @return RegistryId 实例 ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例 ID
     * @param RegistryId 实例 ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 分页单页数量 
     * @return Limit 分页单页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页数量
     * @param Limit 分页单页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

