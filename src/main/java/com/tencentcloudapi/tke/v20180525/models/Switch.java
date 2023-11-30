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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Switch extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 审计开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Audit")
    @Expose
    private SwitchInfo Audit;

    /**
    * 事件开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Event")
    @Expose
    private SwitchInfo Event;

    /**
    * 普通日志的详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private SwitchInfo Log;

    /**
    * master 日志详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterLog")
    @Expose
    private SwitchInfo MasterLog;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 审计开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Audit 审计开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchInfo getAudit() {
        return this.Audit;
    }

    /**
     * Set 审计开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Audit 审计开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudit(SwitchInfo Audit) {
        this.Audit = Audit;
    }

    /**
     * Get 事件开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Event 事件开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchInfo getEvent() {
        return this.Event;
    }

    /**
     * Set 事件开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Event 事件开关的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvent(SwitchInfo Event) {
        this.Event = Event;
    }

    /**
     * Get 普通日志的详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 普通日志的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchInfo getLog() {
        return this.Log;
    }

    /**
     * Set 普通日志的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 普通日志的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(SwitchInfo Log) {
        this.Log = Log;
    }

    /**
     * Get master 日志详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterLog master 日志详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SwitchInfo getMasterLog() {
        return this.MasterLog;
    }

    /**
     * Set master 日志详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterLog master 日志详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterLog(SwitchInfo MasterLog) {
        this.MasterLog = MasterLog;
    }

    public Switch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Switch(Switch source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Audit != null) {
            this.Audit = new SwitchInfo(source.Audit);
        }
        if (source.Event != null) {
            this.Event = new SwitchInfo(source.Event);
        }
        if (source.Log != null) {
            this.Log = new SwitchInfo(source.Log);
        }
        if (source.MasterLog != null) {
            this.MasterLog = new SwitchInfo(source.MasterLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Audit.", this.Audit);
        this.setParamObj(map, prefix + "Event.", this.Event);
        this.setParamObj(map, prefix + "Log.", this.Log);
        this.setParamObj(map, prefix + "MasterLog.", this.MasterLog);

    }
}

