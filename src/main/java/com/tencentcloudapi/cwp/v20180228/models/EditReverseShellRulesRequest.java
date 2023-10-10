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

public class EditReverseShellRulesRequest extends AbstractModel{

    /**
    * 规则ID(新增时请留空)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID数组
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 目标IP
    */
    @SerializedName("DestIp")
    @Expose
    private String DestIp;

    /**
    * 目标端口
    */
    @SerializedName("DestPort")
    @Expose
    private String DestPort;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 是否全局规则(默认否)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 事件列表和详情点击加白时关联的事件id (新增规则时请留空)
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get 规则ID(新增时请留空) 
     * @return Id 规则ID(新增时请留空)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID(新增时请留空)
     * @param Id 规则ID(新增时请留空)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID数组 
     * @return Uuids 客户端ID数组
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 客户端ID数组
     * @param Uuids 客户端ID数组
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 主机IP 
     * @return HostIp 主机IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机IP
     * @param HostIp 主机IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 目标IP 
     * @return DestIp 目标IP
     */
    public String getDestIp() {
        return this.DestIp;
    }

    /**
     * Set 目标IP
     * @param DestIp 目标IP
     */
    public void setDestIp(String DestIp) {
        this.DestIp = DestIp;
    }

    /**
     * Get 目标端口 
     * @return DestPort 目标端口
     */
    public String getDestPort() {
        return this.DestPort;
    }

    /**
     * Set 目标端口
     * @param DestPort 目标端口
     */
    public void setDestPort(String DestPort) {
        this.DestPort = DestPort;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 是否全局规则(默认否) 
     * @return IsGlobal 是否全局规则(默认否)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(默认否)
     * @param IsGlobal 是否全局规则(默认否)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 事件列表和详情点击加白时关联的事件id (新增规则时请留空) 
     * @return EventId 事件列表和详情点击加白时关联的事件id (新增规则时请留空)
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件列表和详情点击加白时关联的事件id (新增规则时请留空)
     * @param EventId 事件列表和详情点击加白时关联的事件id (新增规则时请留空)
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public EditReverseShellRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditReverseShellRulesRequest(EditReverseShellRulesRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.DestIp != null) {
            this.DestIp = new String(source.DestIp);
        }
        if (source.DestPort != null) {
            this.DestPort = new String(source.DestPort);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "DestIp", this.DestIp);
        this.setParamSimple(map, prefix + "DestPort", this.DestPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

