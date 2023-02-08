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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodeInfoResponse extends AbstractModel{

    /**
    * Proxy 节点数量。
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * Proxy 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Proxy")
    @Expose
    private ProxyNodeInfo [] Proxy;

    /**
    * Redis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * Redis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Redis")
    @Expose
    private RedisNodeInfo [] Redis;

    /**
    * Tendis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
    */
    @SerializedName("TendisCount")
    @Expose
    private Long TendisCount;

    /**
    * Tendis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tendis")
    @Expose
    private InstanceNodeInfo [] Tendis;

    /**
    * KeewiDB 节点数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeeWiDBCount")
    @Expose
    private Long KeeWiDBCount;

    /**
    * KeewiDB 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeeWiDB")
    @Expose
    private InstanceNodeInfo [] KeeWiDB;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Proxy 节点数量。 
     * @return ProxyCount Proxy 节点数量。
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set Proxy 节点数量。
     * @param ProxyCount Proxy 节点数量。
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get Proxy 节点信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Proxy Proxy 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodeInfo [] getProxy() {
        return this.Proxy;
    }

    /**
     * Set Proxy 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Proxy Proxy 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxy(ProxyNodeInfo [] Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get Redis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。 
     * @return RedisCount Redis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set Redis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     * @param RedisCount Redis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get Redis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Redis Redis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RedisNodeInfo [] getRedis() {
        return this.Redis;
    }

    /**
     * Set Redis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Redis Redis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedis(RedisNodeInfo [] Redis) {
        this.Redis = Redis;
    }

    /**
     * Get Tendis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。 
     * @return TendisCount Tendis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     */
    public Long getTendisCount() {
        return this.TendisCount;
    }

    /**
     * Set Tendis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     * @param TendisCount Tendis 节点数量。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
     */
    public void setTendisCount(Long TendisCount) {
        this.TendisCount = TendisCount;
    }

    /**
     * Get Tendis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tendis Tendis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeInfo [] getTendis() {
        return this.Tendis;
    }

    /**
     * Set Tendis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tendis Tendis 节点信息。该参数仅为产品兼容性而保留，并不具有实际意义，可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTendis(InstanceNodeInfo [] Tendis) {
        this.Tendis = Tendis;
    }

    /**
     * Get KeewiDB 节点数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeeWiDBCount KeewiDB 节点数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKeeWiDBCount() {
        return this.KeeWiDBCount;
    }

    /**
     * Set KeewiDB 节点数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeeWiDBCount KeewiDB 节点数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeeWiDBCount(Long KeeWiDBCount) {
        this.KeeWiDBCount = KeeWiDBCount;
    }

    /**
     * Get KeewiDB 节点信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeeWiDB KeewiDB 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeInfo [] getKeeWiDB() {
        return this.KeeWiDB;
    }

    /**
     * Set KeewiDB 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeeWiDB KeewiDB 节点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeeWiDB(InstanceNodeInfo [] KeeWiDB) {
        this.KeeWiDB = KeeWiDB;
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
            this.Proxy = new ProxyNodeInfo[source.Proxy.length];
            for (int i = 0; i < source.Proxy.length; i++) {
                this.Proxy[i] = new ProxyNodeInfo(source.Proxy[i]);
            }
        }
        if (source.RedisCount != null) {
            this.RedisCount = new Long(source.RedisCount);
        }
        if (source.Redis != null) {
            this.Redis = new RedisNodeInfo[source.Redis.length];
            for (int i = 0; i < source.Redis.length; i++) {
                this.Redis[i] = new RedisNodeInfo(source.Redis[i]);
            }
        }
        if (source.TendisCount != null) {
            this.TendisCount = new Long(source.TendisCount);
        }
        if (source.Tendis != null) {
            this.Tendis = new InstanceNodeInfo[source.Tendis.length];
            for (int i = 0; i < source.Tendis.length; i++) {
                this.Tendis[i] = new InstanceNodeInfo(source.Tendis[i]);
            }
        }
        if (source.KeeWiDBCount != null) {
            this.KeeWiDBCount = new Long(source.KeeWiDBCount);
        }
        if (source.KeeWiDB != null) {
            this.KeeWiDB = new InstanceNodeInfo[source.KeeWiDB.length];
            for (int i = 0; i < source.KeeWiDB.length; i++) {
                this.KeeWiDB[i] = new InstanceNodeInfo(source.KeeWiDB[i]);
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
        this.setParamSimple(map, prefix + "KeeWiDBCount", this.KeeWiDBCount);
        this.setParamArrayObj(map, prefix + "KeeWiDB.", this.KeeWiDB);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

