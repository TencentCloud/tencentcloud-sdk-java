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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEndUsersRequest extends AbstractModel{

    /**
    * 开发者的环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 可选参数，偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 可选参数，拉取数量，默认 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按照 uuid 列表过滤，最大个数为100
    */
    @SerializedName("UUIds")
    @Expose
    private String [] UUIds;

    /**
     * Get 开发者的环境ID 
     * @return EnvId 开发者的环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 开发者的环境ID
     * @param EnvId 开发者的环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 可选参数，偏移量，默认 0 
     * @return Offset 可选参数，偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 可选参数，偏移量，默认 0
     * @param Offset 可选参数，偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 可选参数，拉取数量，默认 20 
     * @return Limit 可选参数，拉取数量，默认 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 可选参数，拉取数量，默认 20
     * @param Limit 可选参数，拉取数量，默认 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按照 uuid 列表过滤，最大个数为100 
     * @return UUIds 按照 uuid 列表过滤，最大个数为100
     */
    public String [] getUUIds() {
        return this.UUIds;
    }

    /**
     * Set 按照 uuid 列表过滤，最大个数为100
     * @param UUIds 按照 uuid 列表过滤，最大个数为100
     */
    public void setUUIds(String [] UUIds) {
        this.UUIds = UUIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "UUIds.", this.UUIds);

    }
}

