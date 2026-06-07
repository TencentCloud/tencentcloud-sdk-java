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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfwInsStatus extends AbstractModel {

    /**
    * <p>防火墙实例id</p>
    */
    @SerializedName("CfwInsId")
    @Expose
    private String CfwInsId;

    /**
    * <p>防火墙类型，nat：nat防火墙；ew：vpc间防火墙</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中；BypassTcDrop：丢包触发bypass中</p><p>枚举值：</p><ul><li>Running： 正常运行</li><li>BypassAutoFix： 自动bypass已修复</li><li>Updating： 实例升级中</li><li>Expand： 实例扩容中</li><li>BypassManual： 手动触发bypass中</li><li>BypassAuto： 自动触发bypass中</li><li>BypassTcDrop： 丢包触发bypass中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>事件时间</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>恢复时间</p>
    */
    @SerializedName("RecoverTime")
    @Expose
    private String RecoverTime;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("CfwInsName")
    @Expose
    private String CfwInsName;

    /**
    * <p>Normal: 正常模式<br>OnlyRoute: 透明模式</p>
    */
    @SerializedName("TrafficMode")
    @Expose
    private String TrafficMode;

    /**
     * Get <p>防火墙实例id</p> 
     * @return CfwInsId <p>防火墙实例id</p>
     */
    public String getCfwInsId() {
        return this.CfwInsId;
    }

    /**
     * Set <p>防火墙实例id</p>
     * @param CfwInsId <p>防火墙实例id</p>
     */
    public void setCfwInsId(String CfwInsId) {
        this.CfwInsId = CfwInsId;
    }

    /**
     * Get <p>防火墙类型，nat：nat防火墙；ew：vpc间防火墙</p> 
     * @return FwType <p>防火墙类型，nat：nat防火墙；ew：vpc间防火墙</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>防火墙类型，nat：nat防火墙；ew：vpc间防火墙</p>
     * @param FwType <p>防火墙类型，nat：nat防火墙；ew：vpc间防火墙</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>实例所属地域</p> 
     * @return Region <p>实例所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所属地域</p>
     * @param Region <p>实例所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中；BypassTcDrop：丢包触发bypass中</p><p>枚举值：</p><ul><li>Running： 正常运行</li><li>BypassAutoFix： 自动bypass已修复</li><li>Updating： 实例升级中</li><li>Expand： 实例扩容中</li><li>BypassManual： 手动触发bypass中</li><li>BypassAuto： 自动触发bypass中</li><li>BypassTcDrop： 丢包触发bypass中</li></ul> 
     * @return Status <p>实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中；BypassTcDrop：丢包触发bypass中</p><p>枚举值：</p><ul><li>Running： 正常运行</li><li>BypassAutoFix： 自动bypass已修复</li><li>Updating： 实例升级中</li><li>Expand： 实例扩容中</li><li>BypassManual： 手动触发bypass中</li><li>BypassAuto： 自动触发bypass中</li><li>BypassTcDrop： 丢包触发bypass中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中；BypassTcDrop：丢包触发bypass中</p><p>枚举值：</p><ul><li>Running： 正常运行</li><li>BypassAutoFix： 自动bypass已修复</li><li>Updating： 实例升级中</li><li>Expand： 实例扩容中</li><li>BypassManual： 手动触发bypass中</li><li>BypassAuto： 自动触发bypass中</li><li>BypassTcDrop： 丢包触发bypass中</li></ul>
     * @param Status <p>实例运行状态，Running：正常运行；BypassAutoFix：bypass修复；Updating：升级中；Expand：扩容中；BypassManual：手动触发bypass中；BypassAuto：自动触发bypass中；BypassTcDrop：丢包触发bypass中</p><p>枚举值：</p><ul><li>Running： 正常运行</li><li>BypassAutoFix： 自动bypass已修复</li><li>Updating： 实例升级中</li><li>Expand： 实例扩容中</li><li>BypassManual： 手动触发bypass中</li><li>BypassAuto： 自动触发bypass中</li><li>BypassTcDrop： 丢包触发bypass中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>事件时间</p> 
     * @return EventTime <p>事件时间</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>事件时间</p>
     * @param EventTime <p>事件时间</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>恢复时间</p> 
     * @return RecoverTime <p>恢复时间</p>
     */
    public String getRecoverTime() {
        return this.RecoverTime;
    }

    /**
     * Set <p>恢复时间</p>
     * @param RecoverTime <p>恢复时间</p>
     */
    public void setRecoverTime(String RecoverTime) {
        this.RecoverTime = RecoverTime;
    }

    /**
     * Get <p>实例名称</p> 
     * @return CfwInsName <p>实例名称</p>
     */
    public String getCfwInsName() {
        return this.CfwInsName;
    }

    /**
     * Set <p>实例名称</p>
     * @param CfwInsName <p>实例名称</p>
     */
    public void setCfwInsName(String CfwInsName) {
        this.CfwInsName = CfwInsName;
    }

    /**
     * Get <p>Normal: 正常模式<br>OnlyRoute: 透明模式</p> 
     * @return TrafficMode <p>Normal: 正常模式<br>OnlyRoute: 透明模式</p>
     */
    public String getTrafficMode() {
        return this.TrafficMode;
    }

    /**
     * Set <p>Normal: 正常模式<br>OnlyRoute: 透明模式</p>
     * @param TrafficMode <p>Normal: 正常模式<br>OnlyRoute: 透明模式</p>
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

