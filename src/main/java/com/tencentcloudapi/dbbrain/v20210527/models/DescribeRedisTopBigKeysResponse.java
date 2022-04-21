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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisTopBigKeysResponse extends AbstractModel{

    /**
    * top key列表。
    */
    @SerializedName("TopKeys")
    @Expose
    private RedisKeySpaceData [] TopKeys;

    /**
    * 采集时间戳（秒）。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get top key列表。 
     * @return TopKeys top key列表。
     */
    public RedisKeySpaceData [] getTopKeys() {
        return this.TopKeys;
    }

    /**
     * Set top key列表。
     * @param TopKeys top key列表。
     */
    public void setTopKeys(RedisKeySpaceData [] TopKeys) {
        this.TopKeys = TopKeys;
    }

    /**
     * Get 采集时间戳（秒）。 
     * @return Timestamp 采集时间戳（秒）。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 采集时间戳（秒）。
     * @param Timestamp 采集时间戳（秒）。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRedisTopBigKeysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisTopBigKeysResponse(DescribeRedisTopBigKeysResponse source) {
        if (source.TopKeys != null) {
            this.TopKeys = new RedisKeySpaceData[source.TopKeys.length];
            for (int i = 0; i < source.TopKeys.length; i++) {
                this.TopKeys[i] = new RedisKeySpaceData(source.TopKeys[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopKeys.", this.TopKeys);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

