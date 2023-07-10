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

public class ExternalRedis extends AbstractModel{

    /**
    * redis ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedisHost")
    @Expose
    private String RedisHost;

    /**
    * redis密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedisPassword")
    @Expose
    private String RedisPassword;

    /**
    * redis端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedisPort")
    @Expose
    private Long RedisPort;

    /**
    * 超时时间  ms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedisTimeout")
    @Expose
    private Long RedisTimeout;

    /**
     * Get redis ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedisHost redis ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedisHost() {
        return this.RedisHost;
    }

    /**
     * Set redis ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedisHost redis ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedisHost(String RedisHost) {
        this.RedisHost = RedisHost;
    }

    /**
     * Get redis密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedisPassword redis密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedisPassword() {
        return this.RedisPassword;
    }

    /**
     * Set redis密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedisPassword redis密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedisPassword(String RedisPassword) {
        this.RedisPassword = RedisPassword;
    }

    /**
     * Get redis端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedisPort redis端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedisPort() {
        return this.RedisPort;
    }

    /**
     * Set redis端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedisPort redis端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedisPort(Long RedisPort) {
        this.RedisPort = RedisPort;
    }

    /**
     * Get 超时时间  ms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedisTimeout 超时时间  ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedisTimeout() {
        return this.RedisTimeout;
    }

    /**
     * Set 超时时间  ms
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedisTimeout 超时时间  ms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedisTimeout(Long RedisTimeout) {
        this.RedisTimeout = RedisTimeout;
    }

    public ExternalRedis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalRedis(ExternalRedis source) {
        if (source.RedisHost != null) {
            this.RedisHost = new String(source.RedisHost);
        }
        if (source.RedisPassword != null) {
            this.RedisPassword = new String(source.RedisPassword);
        }
        if (source.RedisPort != null) {
            this.RedisPort = new Long(source.RedisPort);
        }
        if (source.RedisTimeout != null) {
            this.RedisTimeout = new Long(source.RedisTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedisHost", this.RedisHost);
        this.setParamSimple(map, prefix + "RedisPassword", this.RedisPassword);
        this.setParamSimple(map, prefix + "RedisPort", this.RedisPort);
        this.setParamSimple(map, prefix + "RedisTimeout", this.RedisTimeout);

    }
}

