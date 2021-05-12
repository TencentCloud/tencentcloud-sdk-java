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

public class ModifyRoTypeRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 只读实例源类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
    */
    @SerializedName("SrcRoInstType")
    @Expose
    private String SrcRoInstType;

    /**
    * 只读实例目标类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
    */
    @SerializedName("DstRoInstType")
    @Expose
    private String DstRoInstType;

    /**
    * 延迟时间（s），将实例修改为延迟只读实例时必传。最小值1，最大值259200。
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 只读实例源类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。 
     * @return SrcRoInstType 只读实例源类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     */
    public String getSrcRoInstType() {
        return this.SrcRoInstType;
    }

    /**
     * Set 只读实例源类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     * @param SrcRoInstType 只读实例源类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     */
    public void setSrcRoInstType(String SrcRoInstType) {
        this.SrcRoInstType = SrcRoInstType;
    }

    /**
     * Get 只读实例目标类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。 
     * @return DstRoInstType 只读实例目标类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     */
    public String getDstRoInstType() {
        return this.DstRoInstType;
    }

    /**
     * Set 只读实例目标类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     * @param DstRoInstType 只读实例目标类型，取值 NORMAL（普通只读实例）、DELAY_REPLICATION（延迟只读实例）。
     */
    public void setDstRoInstType(String DstRoInstType) {
        this.DstRoInstType = DstRoInstType;
    }

    /**
     * Get 延迟时间（s），将实例修改为延迟只读实例时必传。最小值1，最大值259200。 
     * @return ReplicationDelay 延迟时间（s），将实例修改为延迟只读实例时必传。最小值1，最大值259200。
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set 延迟时间（s），将实例修改为延迟只读实例时必传。最小值1，最大值259200。
     * @param ReplicationDelay 延迟时间（s），将实例修改为延迟只读实例时必传。最小值1，最大值259200。
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public ModifyRoTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoTypeRequest(ModifyRoTypeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SrcRoInstType != null) {
            this.SrcRoInstType = new String(source.SrcRoInstType);
        }
        if (source.DstRoInstType != null) {
            this.DstRoInstType = new String(source.DstRoInstType);
        }
        if (source.ReplicationDelay != null) {
            this.ReplicationDelay = new Long(source.ReplicationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcRoInstType", this.SrcRoInstType);
        this.setParamSimple(map, prefix + "DstRoInstType", this.DstRoInstType);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

