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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayCanaryRulesRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务 ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 列表数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列表offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务 ID 
     * @return ServiceId 服务 ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务 ID
     * @param ServiceId 服务 ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 列表数量 
     * @return Limit 列表数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表数量
     * @param Limit 列表数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 列表offset 
     * @return Offset 列表offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 列表offset
     * @param Offset 列表offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCloudNativeAPIGatewayCanaryRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesRequest(DescribeCloudNativeAPIGatewayCanaryRulesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

