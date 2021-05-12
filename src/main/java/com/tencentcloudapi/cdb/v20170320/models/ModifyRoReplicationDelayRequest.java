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

public class ModifyRoReplicationDelayRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 延迟时间（s）。最小值1，最大值259200。
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
     * Get 延迟时间（s）。最小值1，最大值259200。 
     * @return ReplicationDelay 延迟时间（s）。最小值1，最大值259200。
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set 延迟时间（s）。最小值1，最大值259200。
     * @param ReplicationDelay 延迟时间（s）。最小值1，最大值259200。
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public ModifyRoReplicationDelayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoReplicationDelayRequest(ModifyRoReplicationDelayRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

