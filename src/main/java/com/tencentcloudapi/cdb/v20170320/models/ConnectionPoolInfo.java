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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectionPoolInfo extends AbstractModel{

    /**
    * 是否开启了连接池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * 连接池类型：SessionConnectionPool（会话级别连接池）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 连接池保持阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolConnectionTimeOut")
    @Expose
    private Long PoolConnectionTimeOut;

    /**
     * Get 是否开启了连接池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPool 是否开启了连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set 是否开启了连接池
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPool 是否开启了连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get 连接池类型：SessionConnectionPool（会话级别连接池）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPoolType 连接池类型：SessionConnectionPool（会话级别连接池）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型：SessionConnectionPool（会话级别连接池）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPoolType 连接池类型：SessionConnectionPool（会话级别连接池）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 连接池保持阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolConnectionTimeOut 连接池保持阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPoolConnectionTimeOut() {
        return this.PoolConnectionTimeOut;
    }

    /**
     * Set 连接池保持阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolConnectionTimeOut 连接池保持阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolConnectionTimeOut(Long PoolConnectionTimeOut) {
        this.PoolConnectionTimeOut = PoolConnectionTimeOut;
    }

    public ConnectionPoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionPoolInfo(ConnectionPoolInfo source) {
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.PoolConnectionTimeOut != null) {
            this.PoolConnectionTimeOut = new Long(source.PoolConnectionTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "PoolConnectionTimeOut", this.PoolConnectionTimeOut);

    }
}

