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

public class DescribeInstanceNodeInfoResponse extends AbstractModel {

    /**
    * Proxy节点数量。
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * Proxy节点信息。
    */
    @SerializedName("Proxy")
    @Expose
    private ProxyNodes [] Proxy;

    /**
    * Redis节点数量。
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * Redis节点信息。
    */
    @SerializedName("Redis")
    @Expose
    private RedisNodes [] Redis;

    /**
    * 该参数不再使用，请忽略。
    */
    @SerializedName("TendisCount")
    @Expose
    private Long TendisCount;

    /**
    * 该参数不再使用，请忽略。
    */
    @SerializedName("Tendis")
    @Expose
    private TendisNodes [] Tendis;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Proxy节点数量。 
     * @return ProxyCount Proxy节点数量。
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Proxy节点数量。
     * @param ProxyCount Proxy节点数量。
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get Proxy节点信息。 
     * @return Proxy Proxy节点信息。
     */
    public ProxyNodes [] getProxy() {
        return this.Proxy;
    }

    /**
     * Set Proxy节点信息。
     * @param Proxy Proxy节点信息。
     */
    public void setProxy(ProxyNodes [] Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get Redis节点数量。 
     * @return RedisCount Redis节点数量。
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set Redis节点数量。
     * @param RedisCount Redis节点数量。
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get Redis节点信息。 
     * @return Redis Redis节点信息。
     */
    public RedisNodes [] getRedis() {
        return this.Redis;
    }

    /**
     * Set Redis节点信息。
     * @param Redis Redis节点信息。
     */
    public void setRedis(RedisNodes [] Redis) {
        this.Redis = Redis;
    }

    /**
     * Get 该参数不再使用，请忽略。 
     * @return TendisCount 该参数不再使用，请忽略。
     */
    public Long getTendisCount() {
        return this.TendisCount;
    }

    /**
     * Set 该参数不再使用，请忽略。
     * @param TendisCount 该参数不再使用，请忽略。
     */
    public void setTendisCount(Long TendisCount) {
        this.TendisCount = TendisCount;
    }

    /**
     * Get 该参数不再使用，请忽略。 
     * @return Tendis 该参数不再使用，请忽略。
     */
    public TendisNodes [] getTendis() {
        return this.Tendis;
    }

    /**
     * Set 该参数不再使用，请忽略。
     * @param Tendis 该参数不再使用，请忽略。
     */
    public void setTendis(TendisNodes [] Tendis) {
        this.Tendis = Tendis;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceNodeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodeInfoResponse(DescribeInstanceNodeInfoResponse source) {
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Proxy != null) {
            this.Proxy = new ProxyNodes[source.Proxy.length];
            for (int i = 0; i < source.Proxy.length; i++) {
                this.Proxy[i] = new ProxyNodes(source.Proxy[i]);
            }
        }
        if (source.RedisCount != null) {
            this.RedisCount = new Long(source.RedisCount);
        }
        if (source.Redis != null) {
            this.Redis = new RedisNodes[source.Redis.length];
            for (int i = 0; i < source.Redis.length; i++) {
                this.Redis[i] = new RedisNodes(source.Redis[i]);
            }
        }
        if (source.TendisCount != null) {
            this.TendisCount = new Long(source.TendisCount);
        }
        if (source.Tendis != null) {
            this.Tendis = new TendisNodes[source.Tendis.length];
            for (int i = 0; i < source.Tendis.length; i++) {
                this.Tendis[i] = new TendisNodes(source.Tendis[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamArrayObj(map, prefix + "Proxy.", this.Proxy);
        this.setParamSimple(map, prefix + "RedisCount", this.RedisCount);
        this.setParamArrayObj(map, prefix + "Redis.", this.Redis);
        this.setParamSimple(map, prefix + "TendisCount", this.TendisCount);
        this.setParamArrayObj(map, prefix + "Tendis.", this.Tendis);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

