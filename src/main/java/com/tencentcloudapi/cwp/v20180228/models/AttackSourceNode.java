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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSourceNode extends AbstractModel{

    /**
    * 事件ID，为空的时候表示没有对应事件
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * BRUTEFORCE:密码破解、MALWARE:木马、BASH:高危命令、RISK_DNS:恶意请求、LOGIN:异地登录、HOST:主机节点, TIME_ORDER：通用节点
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 节点ip 当节点为HOST时
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 等级  0：提示，1：低危,  2：中危,  3：高危,  4：严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 通用节点的描述
    */
    @SerializedName("NodeDesc")
    @Expose
    private String NodeDesc;

    /**
    * 时间线编号，同一个编号的节点属于同一个时间线
    */
    @SerializedName("TimeLineNum")
    @Expose
    private Long TimeLineNum;

    /**
    * 节点详情
    */
    @SerializedName("NodeDetail")
    @Expose
    private String NodeDetail;

    /**
     * Get 事件ID，为空的时候表示没有对应事件 
     * @return EventId 事件ID，为空的时候表示没有对应事件
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID，为空的时候表示没有对应事件
     * @param EventId 事件ID，为空的时候表示没有对应事件
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get BRUTEFORCE:密码破解、MALWARE:木马、BASH:高危命令、RISK_DNS:恶意请求、LOGIN:异地登录、HOST:主机节点, TIME_ORDER：通用节点 
     * @return EventType BRUTEFORCE:密码破解、MALWARE:木马、BASH:高危命令、RISK_DNS:恶意请求、LOGIN:异地登录、HOST:主机节点, TIME_ORDER：通用节点
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set BRUTEFORCE:密码破解、MALWARE:木马、BASH:高危命令、RISK_DNS:恶意请求、LOGIN:异地登录、HOST:主机节点, TIME_ORDER：通用节点
     * @param EventType BRUTEFORCE:密码破解、MALWARE:木马、BASH:高危命令、RISK_DNS:恶意请求、LOGIN:异地登录、HOST:主机节点, TIME_ORDER：通用节点
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 节点ip 当节点为HOST时 
     * @return Ip 节点ip 当节点为HOST时
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点ip 当节点为HOST时
     * @param Ip 节点ip 当节点为HOST时
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 等级  0：提示，1：低危,  2：中危,  3：高危,  4：严重 
     * @return Level 等级  0：提示，1：低危,  2：中危,  3：高危,  4：严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 等级  0：提示，1：低危,  2：中危,  3：高危,  4：严重
     * @param Level 等级  0：提示，1：低危,  2：中危,  3：高危,  4：严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通用节点的描述 
     * @return NodeDesc 通用节点的描述
     */
    public String getNodeDesc() {
        return this.NodeDesc;
    }

    /**
     * Set 通用节点的描述
     * @param NodeDesc 通用节点的描述
     */
    public void setNodeDesc(String NodeDesc) {
        this.NodeDesc = NodeDesc;
    }

    /**
     * Get 时间线编号，同一个编号的节点属于同一个时间线 
     * @return TimeLineNum 时间线编号，同一个编号的节点属于同一个时间线
     */
    public Long getTimeLineNum() {
        return this.TimeLineNum;
    }

    /**
     * Set 时间线编号，同一个编号的节点属于同一个时间线
     * @param TimeLineNum 时间线编号，同一个编号的节点属于同一个时间线
     */
    public void setTimeLineNum(Long TimeLineNum) {
        this.TimeLineNum = TimeLineNum;
    }

    /**
     * Get 节点详情 
     * @return NodeDetail 节点详情
     */
    public String getNodeDetail() {
        return this.NodeDetail;
    }

    /**
     * Set 节点详情
     * @param NodeDetail 节点详情
     */
    public void setNodeDetail(String NodeDetail) {
        this.NodeDetail = NodeDetail;
    }

    public AttackSourceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSourceNode(AttackSourceNode source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeDesc != null) {
            this.NodeDesc = new String(source.NodeDesc);
        }
        if (source.TimeLineNum != null) {
            this.TimeLineNum = new Long(source.TimeLineNum);
        }
        if (source.NodeDetail != null) {
            this.NodeDetail = new String(source.NodeDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NodeDesc", this.NodeDesc);
        this.setParamSimple(map, prefix + "TimeLineNum", this.TimeLineNum);
        this.setParamSimple(map, prefix + "NodeDetail", this.NodeDetail);

    }
}

