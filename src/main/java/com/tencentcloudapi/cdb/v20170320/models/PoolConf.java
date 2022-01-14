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

public class PoolConf extends AbstractModel{

    /**
    * 连接池类型：SessionConnectionPool（会话级别连接池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 最大可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPoolConnectionTimeOut")
    @Expose
    private Long MaxPoolConnectionTimeOut;

    /**
    * 最小可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinPoolConnectionTimeOut")
    @Expose
    private Long MinPoolConnectionTimeOut;

    /**
     * Get 连接池类型：SessionConnectionPool（会话级别连接池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPoolType 连接池类型：SessionConnectionPool（会话级别连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型：SessionConnectionPool（会话级别连接池
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPoolType 连接池类型：SessionConnectionPool（会话级别连接池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 最大可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPoolConnectionTimeOut 最大可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPoolConnectionTimeOut() {
        return this.MaxPoolConnectionTimeOut;
    }

    /**
     * Set 最大可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPoolConnectionTimeOut 最大可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPoolConnectionTimeOut(Long MaxPoolConnectionTimeOut) {
        this.MaxPoolConnectionTimeOut = MaxPoolConnectionTimeOut;
    }

    /**
     * Get 最小可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinPoolConnectionTimeOut 最小可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinPoolConnectionTimeOut() {
        return this.MinPoolConnectionTimeOut;
    }

    /**
     * Set 最小可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinPoolConnectionTimeOut 最小可保持连接阈值：单位（秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinPoolConnectionTimeOut(Long MinPoolConnectionTimeOut) {
        this.MinPoolConnectionTimeOut = MinPoolConnectionTimeOut;
    }

    public PoolConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoolConf(PoolConf source) {
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.MaxPoolConnectionTimeOut != null) {
            this.MaxPoolConnectionTimeOut = new Long(source.MaxPoolConnectionTimeOut);
        }
        if (source.MinPoolConnectionTimeOut != null) {
            this.MinPoolConnectionTimeOut = new Long(source.MinPoolConnectionTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "MaxPoolConnectionTimeOut", this.MaxPoolConnectionTimeOut);
        this.setParamSimple(map, prefix + "MinPoolConnectionTimeOut", this.MinPoolConnectionTimeOut);

    }
}

