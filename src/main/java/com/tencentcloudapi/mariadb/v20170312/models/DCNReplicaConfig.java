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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCNReplicaConfig extends AbstractModel {

    /**
    * DCN 运行状态，START为正常运行，STOP为暂停
    */
    @SerializedName("RoReplicationMode")
    @Expose
    private String RoReplicationMode;

    /**
    * 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
    */
    @SerializedName("DelayReplicationType")
    @Expose
    private String DelayReplicationType;

    /**
    * 延迟复制的指定时间
    */
    @SerializedName("DueTime")
    @Expose
    private String DueTime;

    /**
    * 延迟复制时的延迟秒数
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

    /**
     * Get DCN 运行状态，START为正常运行，STOP为暂停 
     * @return RoReplicationMode DCN 运行状态，START为正常运行，STOP为暂停
     */
    public String getRoReplicationMode() {
        return this.RoReplicationMode;
    }

    /**
     * Set DCN 运行状态，START为正常运行，STOP为暂停
     * @param RoReplicationMode DCN 运行状态，START为正常运行，STOP为暂停
     */
    public void setRoReplicationMode(String RoReplicationMode) {
        this.RoReplicationMode = RoReplicationMode;
    }

    /**
     * Get 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间 
     * @return DelayReplicationType 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
     */
    public String getDelayReplicationType() {
        return this.DelayReplicationType;
    }

    /**
     * Set 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
     * @param DelayReplicationType 延迟复制的类型，DEFAULT为正常，DUE_TIME为指定时间
     */
    public void setDelayReplicationType(String DelayReplicationType) {
        this.DelayReplicationType = DelayReplicationType;
    }

    /**
     * Get 延迟复制的指定时间 
     * @return DueTime 延迟复制的指定时间
     */
    public String getDueTime() {
        return this.DueTime;
    }

    /**
     * Set 延迟复制的指定时间
     * @param DueTime 延迟复制的指定时间
     */
    public void setDueTime(String DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get 延迟复制时的延迟秒数 
     * @return ReplicationDelay 延迟复制时的延迟秒数
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set 延迟复制时的延迟秒数
     * @param ReplicationDelay 延迟复制时的延迟秒数
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public DCNReplicaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCNReplicaConfig(DCNReplicaConfig source) {
        if (source.RoReplicationMode != null) {
            this.RoReplicationMode = new String(source.RoReplicationMode);
        }
        if (source.DelayReplicationType != null) {
            this.DelayReplicationType = new String(source.DelayReplicationType);
        }
        if (source.DueTime != null) {
            this.DueTime = new String(source.DueTime);
        }
        if (source.ReplicationDelay != null) {
            this.ReplicationDelay = new Long(source.ReplicationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoReplicationMode", this.RoReplicationMode);
        this.setParamSimple(map, prefix + "DelayReplicationType", this.DelayReplicationType);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

