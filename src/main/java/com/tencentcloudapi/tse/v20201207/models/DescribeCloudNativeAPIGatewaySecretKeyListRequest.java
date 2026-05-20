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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewaySecretKeyListRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 每页数量，最大20个
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例 ID 
     * @return GatewayId 实例 ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 实例 ID
     * @param GatewayId 实例 ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 每页数量，最大20个 
     * @return Limit 每页数量，最大20个
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，最大20个
     * @param Limit 每页数量，最大20个
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始值 
     * @return Offset 起始值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始值
     * @param Offset 起始值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCloudNativeAPIGatewaySecretKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewaySecretKeyListRequest(DescribeCloudNativeAPIGatewaySecretKeyListRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
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
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

