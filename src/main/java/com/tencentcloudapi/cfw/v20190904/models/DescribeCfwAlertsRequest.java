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

public class DescribeCfwAlertsRequest extends AbstractModel {

    /**
    * <p>告警开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认查询最近 1 小时。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>告警结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认当前时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>告警严重级别过滤。可选；枚举 low、middle、high。</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>流量方向过滤。可选；枚举 outbound 出站、inbound 入站、lateral 横向。</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>处置状态过滤。可选；枚举 unhandled、handled、blocked、passed、isolated、ignored。</p>
    */
    @SerializedName("ActionStatus")
    @Expose
    private String ActionStatus;

    /**
    * <p>攻击链阶段过滤。可选；枚举 recon、brute_force、delivery、exploit、c2、lateral_movement、exfiltration。</p>
    */
    @SerializedName("KillChain")
    @Expose
    private String KillChain;

    /**
    * <p>攻击结果过滤。可选；枚举 attempt、success、fail、unknown。</p>
    */
    @SerializedName("AttackResult")
    @Expose
    private String AttackResult;

    /**
    * <p>IPS 策略动作过滤。可选；枚举 observe、block。</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>攻击事件名称关键字过滤。可选，例如 SQL注入、暴力破解、恶意域名访问。</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>精确告警事件 ID 过滤。用于指定事件的写操作前检查和写操作后核验；事件重新聚合时返回原请求 ID 和当前事件 ID。无匹配返回空结果，多匹配或定位过程异常时失败，不退化为宽查询。</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>源 IP 过滤。可选。</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>目的 IP 过滤。可选。</p>
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * <p>云资源实例 ID 过滤。可选，例如 ins-xxxxxxxx。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>单页返回告警数。可选，默认 10，最大 50。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移。可选，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count。排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count；Count 表示按单个聚合告警事件的告警发生次数/命中次数排序，对应返回中的 occurrence_count</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方向。可选，默认 desc；枚举 desc、asc。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>告警开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认查询最近 1 小时。</p> 
     * @return StartTime <p>告警开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认查询最近 1 小时。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>告警开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认查询最近 1 小时。</p>
     * @param StartTime <p>告警开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认查询最近 1 小时。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>告警结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认当前时间。</p> 
     * @return EndTime <p>告警结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认当前时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>告警结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认当前时间。</p>
     * @param EndTime <p>告警结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；默认当前时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>告警严重级别过滤。可选；枚举 low、middle、high。</p> 
     * @return Level <p>告警严重级别过滤。可选；枚举 low、middle、high。</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警严重级别过滤。可选；枚举 low、middle、high。</p>
     * @param Level <p>告警严重级别过滤。可选；枚举 low、middle、high。</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>流量方向过滤。可选；枚举 outbound 出站、inbound 入站、lateral 横向。</p> 
     * @return Direction <p>流量方向过滤。可选；枚举 outbound 出站、inbound 入站、lateral 横向。</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>流量方向过滤。可选；枚举 outbound 出站、inbound 入站、lateral 横向。</p>
     * @param Direction <p>流量方向过滤。可选；枚举 outbound 出站、inbound 入站、lateral 横向。</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>处置状态过滤。可选；枚举 unhandled、handled、blocked、passed、isolated、ignored。</p> 
     * @return ActionStatus <p>处置状态过滤。可选；枚举 unhandled、handled、blocked、passed、isolated、ignored。</p>
     */
    public String getActionStatus() {
        return this.ActionStatus;
    }

    /**
     * Set <p>处置状态过滤。可选；枚举 unhandled、handled、blocked、passed、isolated、ignored。</p>
     * @param ActionStatus <p>处置状态过滤。可选；枚举 unhandled、handled、blocked、passed、isolated、ignored。</p>
     */
    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    /**
     * Get <p>攻击链阶段过滤。可选；枚举 recon、brute_force、delivery、exploit、c2、lateral_movement、exfiltration。</p> 
     * @return KillChain <p>攻击链阶段过滤。可选；枚举 recon、brute_force、delivery、exploit、c2、lateral_movement、exfiltration。</p>
     */
    public String getKillChain() {
        return this.KillChain;
    }

    /**
     * Set <p>攻击链阶段过滤。可选；枚举 recon、brute_force、delivery、exploit、c2、lateral_movement、exfiltration。</p>
     * @param KillChain <p>攻击链阶段过滤。可选；枚举 recon、brute_force、delivery、exploit、c2、lateral_movement、exfiltration。</p>
     */
    public void setKillChain(String KillChain) {
        this.KillChain = KillChain;
    }

    /**
     * Get <p>攻击结果过滤。可选；枚举 attempt、success、fail、unknown。</p> 
     * @return AttackResult <p>攻击结果过滤。可选；枚举 attempt、success、fail、unknown。</p>
     */
    public String getAttackResult() {
        return this.AttackResult;
    }

    /**
     * Set <p>攻击结果过滤。可选；枚举 attempt、success、fail、unknown。</p>
     * @param AttackResult <p>攻击结果过滤。可选；枚举 attempt、success、fail、unknown。</p>
     */
    public void setAttackResult(String AttackResult) {
        this.AttackResult = AttackResult;
    }

    /**
     * Get <p>IPS 策略动作过滤。可选；枚举 observe、block。</p> 
     * @return Strategy <p>IPS 策略动作过滤。可选；枚举 observe、block。</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>IPS 策略动作过滤。可选；枚举 observe、block。</p>
     * @param Strategy <p>IPS 策略动作过滤。可选；枚举 observe、block。</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>攻击事件名称关键字过滤。可选，例如 SQL注入、暴力破解、恶意域名访问。</p> 
     * @return EventName <p>攻击事件名称关键字过滤。可选，例如 SQL注入、暴力破解、恶意域名访问。</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>攻击事件名称关键字过滤。可选，例如 SQL注入、暴力破解、恶意域名访问。</p>
     * @param EventName <p>攻击事件名称关键字过滤。可选，例如 SQL注入、暴力破解、恶意域名访问。</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>精确告警事件 ID 过滤。用于指定事件的写操作前检查和写操作后核验；事件重新聚合时返回原请求 ID 和当前事件 ID。无匹配返回空结果，多匹配或定位过程异常时失败，不退化为宽查询。</p> 
     * @return EventId <p>精确告警事件 ID 过滤。用于指定事件的写操作前检查和写操作后核验；事件重新聚合时返回原请求 ID 和当前事件 ID。无匹配返回空结果，多匹配或定位过程异常时失败，不退化为宽查询。</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>精确告警事件 ID 过滤。用于指定事件的写操作前检查和写操作后核验；事件重新聚合时返回原请求 ID 和当前事件 ID。无匹配返回空结果，多匹配或定位过程异常时失败，不退化为宽查询。</p>
     * @param EventId <p>精确告警事件 ID 过滤。用于指定事件的写操作前检查和写操作后核验；事件重新聚合时返回原请求 ID 和当前事件 ID。无匹配返回空结果，多匹配或定位过程异常时失败，不退化为宽查询。</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>源 IP 过滤。可选。</p> 
     * @return SrcIp <p>源 IP 过滤。可选。</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>源 IP 过滤。可选。</p>
     * @param SrcIp <p>源 IP 过滤。可选。</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>目的 IP 过滤。可选。</p> 
     * @return DstIp <p>目的 IP 过滤。可选。</p>
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set <p>目的 IP 过滤。可选。</p>
     * @param DstIp <p>目的 IP 过滤。可选。</p>
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get <p>云资源实例 ID 过滤。可选，例如 ins-xxxxxxxx。</p> 
     * @return InstanceId <p>云资源实例 ID 过滤。可选，例如 ins-xxxxxxxx。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云资源实例 ID 过滤。可选，例如 ins-xxxxxxxx。</p>
     * @param InstanceId <p>云资源实例 ID 过滤。可选，例如 ins-xxxxxxxx。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>单页返回告警数。可选，默认 10，最大 50。</p> 
     * @return Limit <p>单页返回告警数。可选，默认 10，最大 50。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页返回告警数。可选，默认 10，最大 50。</p>
     * @param Limit <p>单页返回告警数。可选，默认 10，最大 50。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移。可选，默认 0。</p> 
     * @return Offset <p>分页偏移。可选，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移。可选，默认 0。</p>
     * @param Offset <p>分页偏移。可选，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count。排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count；Count 表示按单个聚合告警事件的告警发生次数/命中次数排序，对应返回中的 occurrence_count</p> 
     * @return OrderBy <p>排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count。排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count；Count 表示按单个聚合告警事件的告警发生次数/命中次数排序，对应返回中的 occurrence_count</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count。排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count；Count 表示按单个聚合告警事件的告警发生次数/命中次数排序，对应返回中的 occurrence_count</p>
     * @param OrderBy <p>排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count。排序字段。可选，默认 EndTime；枚举 EndTime、StartTime、Count；Count 表示按单个聚合告警事件的告警发生次数/命中次数排序，对应返回中的 occurrence_count</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方向。可选，默认 desc；枚举 desc、asc。</p> 
     * @return Order <p>排序方向。可选，默认 desc；枚举 desc、asc。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向。可选，默认 desc；枚举 desc、asc。</p>
     * @param Order <p>排序方向。可选，默认 desc；枚举 desc、asc。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeCfwAlertsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAlertsRequest(DescribeCfwAlertsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.ActionStatus != null) {
            this.ActionStatus = new String(source.ActionStatus);
        }
        if (source.KillChain != null) {
            this.KillChain = new String(source.KillChain);
        }
        if (source.AttackResult != null) {
            this.AttackResult = new String(source.AttackResult);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "ActionStatus", this.ActionStatus);
        this.setParamSimple(map, prefix + "KillChain", this.KillChain);
        this.setParamSimple(map, prefix + "AttackResult", this.AttackResult);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

