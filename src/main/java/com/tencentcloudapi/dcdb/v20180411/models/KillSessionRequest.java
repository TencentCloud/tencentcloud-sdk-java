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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillSessionRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 会话ID列表
    */
    @SerializedName("SessionId")
    @Expose
    private Long [] SessionId;

    /**
    * 分片ID，与ShardSerialId设置一个
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 分片序列ID，与ShardId设置一个
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 会话ID列表 
     * @return SessionId 会话ID列表
     */
    public Long [] getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID列表
     * @param SessionId 会话ID列表
     */
    public void setSessionId(Long [] SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 分片ID，与ShardSerialId设置一个 
     * @return ShardId 分片ID，与ShardSerialId设置一个
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 分片ID，与ShardSerialId设置一个
     * @param ShardId 分片ID，与ShardSerialId设置一个
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 分片序列ID，与ShardId设置一个 
     * @return ShardSerialId 分片序列ID，与ShardId设置一个
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片序列ID，与ShardId设置一个
     * @param ShardSerialId 分片序列ID，与ShardId设置一个
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    public KillSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillSessionRequest(KillSessionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SessionId != null) {
            this.SessionId = new Long[source.SessionId.length];
            for (int i = 0; i < source.SessionId.length; i++) {
                this.SessionId[i] = new Long(source.SessionId[i]);
            }
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SessionId.", this.SessionId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);

    }
}

