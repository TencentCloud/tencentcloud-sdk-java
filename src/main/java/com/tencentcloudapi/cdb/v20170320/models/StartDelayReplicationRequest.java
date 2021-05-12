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

public class StartDelayReplicationRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 延迟复制类型。可选值 DEFAULT（按照延迟复制时间进行复制）、GTID（回放到指定GTID）、DUE_TIME（回放到指定时间点）。
    */
    @SerializedName("DelayReplicationType")
    @Expose
    private String DelayReplicationType;

    /**
    * 指定时间点，默认为0，最大值不能超过当前时间。
    */
    @SerializedName("DueTime")
    @Expose
    private Long DueTime;

    /**
    * 指定GITD。回放到指定GTID时必传。
    */
    @SerializedName("Gtid")
    @Expose
    private String Gtid;

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
     * Get 延迟复制类型。可选值 DEFAULT（按照延迟复制时间进行复制）、GTID（回放到指定GTID）、DUE_TIME（回放到指定时间点）。 
     * @return DelayReplicationType 延迟复制类型。可选值 DEFAULT（按照延迟复制时间进行复制）、GTID（回放到指定GTID）、DUE_TIME（回放到指定时间点）。
     */
    public String getDelayReplicationType() {
        return this.DelayReplicationType;
    }

    /**
     * Set 延迟复制类型。可选值 DEFAULT（按照延迟复制时间进行复制）、GTID（回放到指定GTID）、DUE_TIME（回放到指定时间点）。
     * @param DelayReplicationType 延迟复制类型。可选值 DEFAULT（按照延迟复制时间进行复制）、GTID（回放到指定GTID）、DUE_TIME（回放到指定时间点）。
     */
    public void setDelayReplicationType(String DelayReplicationType) {
        this.DelayReplicationType = DelayReplicationType;
    }

    /**
     * Get 指定时间点，默认为0，最大值不能超过当前时间。 
     * @return DueTime 指定时间点，默认为0，最大值不能超过当前时间。
     */
    public Long getDueTime() {
        return this.DueTime;
    }

    /**
     * Set 指定时间点，默认为0，最大值不能超过当前时间。
     * @param DueTime 指定时间点，默认为0，最大值不能超过当前时间。
     */
    public void setDueTime(Long DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get 指定GITD。回放到指定GTID时必传。 
     * @return Gtid 指定GITD。回放到指定GTID时必传。
     */
    public String getGtid() {
        return this.Gtid;
    }

    /**
     * Set 指定GITD。回放到指定GTID时必传。
     * @param Gtid 指定GITD。回放到指定GTID时必传。
     */
    public void setGtid(String Gtid) {
        this.Gtid = Gtid;
    }

    public StartDelayReplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartDelayReplicationRequest(StartDelayReplicationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DelayReplicationType != null) {
            this.DelayReplicationType = new String(source.DelayReplicationType);
        }
        if (source.DueTime != null) {
            this.DueTime = new Long(source.DueTime);
        }
        if (source.Gtid != null) {
            this.Gtid = new String(source.Gtid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DelayReplicationType", this.DelayReplicationType);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "Gtid", this.Gtid);

    }
}

