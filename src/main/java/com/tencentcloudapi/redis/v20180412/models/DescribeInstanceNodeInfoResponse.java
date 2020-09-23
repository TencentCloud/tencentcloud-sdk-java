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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodeInfoResponse extends AbstractModel{

    /**
    * proxy节点数量
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * proxy节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proxy")
    @Expose
    private ProxyNodes [] Proxy;

    /**
    * redis节点数量
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * redis节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Redis")
    @Expose
    private RedisNodes [] Redis;

    /**
    * tendis节点数量
    */
    @SerializedName("TendisCount")
    @Expose
    private Long TendisCount;

    /**
    * tendis节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tendis")
    @Expose
    private TendisNodes [] Tendis;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get proxy节点数量 
     * @return ProxyCount proxy节点数量
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set proxy节点数量
     * @param ProxyCount proxy节点数量
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get proxy节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proxy proxy节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodes [] getProxy() {
        return this.Proxy;
    }

    /**
     * Set proxy节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proxy proxy节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxy(ProxyNodes [] Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get redis节点数量 
     * @return RedisCount redis节点数量
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set redis节点数量
     * @param RedisCount redis节点数量
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get redis节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Redis redis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RedisNodes [] getRedis() {
        return this.Redis;
    }

    /**
     * Set redis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Redis redis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedis(RedisNodes [] Redis) {
        this.Redis = Redis;
    }

    /**
     * Get tendis节点数量 
     * @return TendisCount tendis节点数量
     */
    public Long getTendisCount() {
        return this.TendisCount;
    }

    /**
     * Set tendis节点数量
     * @param TendisCount tendis节点数量
     */
    public void setTendisCount(Long TendisCount) {
        this.TendisCount = TendisCount;
    }

    /**
     * Get tendis节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tendis tendis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TendisNodes [] getTendis() {
        return this.Tendis;
    }

    /**
     * Set tendis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tendis tendis节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTendis(TendisNodes [] Tendis) {
        this.Tendis = Tendis;
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

