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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamRecordsRequest extends AbstractModel {

    /**
    * 实例 ID 。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页大小。默认为100，最大值为 200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍，默认值为0。计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例 ID 。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID 。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID 。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页大小。默认为100，最大值为 200。 
     * @return Limit 分页大小。默认为100，最大值为 200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小。默认为100，最大值为 200。
     * @param Limit 分页大小。默认为100，最大值为 200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍，默认值为0。计算公式：offset=limit*(页码-1)。 
     * @return Offset 偏移量，取Limit整数倍，默认值为0。计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍，默认值为0。计算公式：offset=limit*(页码-1)。
     * @param Offset 偏移量，取Limit整数倍，默认值为0。计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInstanceParamRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamRecordsRequest(DescribeInstanceParamRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

