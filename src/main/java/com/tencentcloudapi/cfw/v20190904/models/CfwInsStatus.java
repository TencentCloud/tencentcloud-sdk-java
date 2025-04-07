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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfwInsStatus extends AbstractModel {

    /**
    * 防火墙实例id
    */
    @SerializedName("CfwInsId")
    @Expose
    private String CfwInsId;

    /**
    * 防火墙类型，nat：nat防火墙；ew：vpc间防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 恢复时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverTime")
    @Expose
    private String RecoverTime;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CfwInsName")
    @Expose
    private String CfwInsName;

    /**
    * Normal: 正常模式
OnlyRoute: 透明模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
     * Get 防火墙实例id 
     * @return CfwInsId 防火墙实例id
     */
    public String getCfwInsId() {
        return this.CfwInsId;
    }

    /**
     * Set 防火墙实例id
     * @param CfwInsId 防火墙实例id
     */
    public void setCfwInsId(String CfwInsId) {
        this.CfwInsId = CfwInsId;
    }

    /**
     * Get 防火墙类型，nat：nat防火墙；ew：vpc间防火墙 
     * @return FwType 防火墙类型，nat：nat防火墙；ew：vpc间防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 防火墙类型，nat：nat防火墙；ew：vpc间防火墙
     * @param FwType 防火墙类型，nat：nat防火墙；ew：vpc间防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 实例所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中 
     * @return Status 实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中
     * @param Status 实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventTime 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventTime 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 恢复时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverTime 恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecoverTime() {
        return this.RecoverTime;
    }

    /**
     * Set 恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverTime 恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverTime(String RecoverTime) {
        this.RecoverTime = RecoverTime;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CfwInsName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCfwInsName() {
        return this.CfwInsName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CfwInsName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCfwInsName(String CfwInsName) {
        this.CfwInsName = CfwInsName;
    }

    /**
     * Get Normal: 正常模式
OnlyRoute: 透明模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficMode Normal: 正常模式
OnlyRoute: 透明模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrafficMode() {
        return this.TrafficMode;
    }

    /**
     * Set Normal: 正常模式
OnlyRoute: 透明模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficMode Normal: 正常模式
OnlyRoute: 透明模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficMode(String TrafficMode) {
        this.TrafficMode = TrafficMode;
    }

    public CfwInsStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CfwInsStatus(CfwInsStatus source) {
        if (source.CfwInsId != null) {
            this.CfwInsId = new String(source.CfwInsId);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.RecoverTime != null) {
            this.RecoverTime = new String(source.RecoverTime);
        }
        if (source.CfwInsName != null) {
            this.CfwInsName = new String(source.CfwInsName);
        }
        if (source.TrafficMode != null) {
            this.TrafficMode = new String(source.TrafficMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CfwInsId", this.CfwInsId);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "RecoverTime", this.RecoverTime);
        this.setParamSimple(map, prefix + "CfwInsName", this.CfwInsName);
        this.setParamSimple(map, prefix + "TrafficMode", this.TrafficMode);

    }
}

