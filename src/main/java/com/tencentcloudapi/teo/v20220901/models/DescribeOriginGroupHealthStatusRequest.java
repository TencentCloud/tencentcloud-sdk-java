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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginGroupHealthStatusRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LBInstanceId")
    @Expose
    private String LBInstanceId;

    /**
    * 源站组 ID。不填写时默认获取负载均衡下所有源站组的健康状态。
    */
    @SerializedName("OriginGroupIds")
    @Expose
    private String [] OriginGroupIds;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 负载均衡实例 ID。 
     * @return LBInstanceId 负载均衡实例 ID。
     */
    public String getLBInstanceId() {
        return this.LBInstanceId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LBInstanceId 负载均衡实例 ID。
     */
    public void setLBInstanceId(String LBInstanceId) {
        this.LBInstanceId = LBInstanceId;
    }

    /**
     * Get 源站组 ID。不填写时默认获取负载均衡下所有源站组的健康状态。 
     * @return OriginGroupIds 源站组 ID。不填写时默认获取负载均衡下所有源站组的健康状态。
     */
    public String [] getOriginGroupIds() {
        return this.OriginGroupIds;
    }

    /**
     * Set 源站组 ID。不填写时默认获取负载均衡下所有源站组的健康状态。
     * @param OriginGroupIds 源站组 ID。不填写时默认获取负载均衡下所有源站组的健康状态。
     */
    public void setOriginGroupIds(String [] OriginGroupIds) {
        this.OriginGroupIds = OriginGroupIds;
    }

    public DescribeOriginGroupHealthStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupHealthStatusRequest(DescribeOriginGroupHealthStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LBInstanceId != null) {
            this.LBInstanceId = new String(source.LBInstanceId);
        }
        if (source.OriginGroupIds != null) {
            this.OriginGroupIds = new String[source.OriginGroupIds.length];
            for (int i = 0; i < source.OriginGroupIds.length; i++) {
                this.OriginGroupIds[i] = new String(source.OriginGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LBInstanceId", this.LBInstanceId);
        this.setParamArraySimple(map, prefix + "OriginGroupIds.", this.OriginGroupIds);

    }
}

