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

public class SecurityButlerInfo extends AbstractModel{

    /**
    * 数据id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private Long OrderId;

    /**
    * cvm id
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务状态 0-服务中,1-已到期 2已销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 服务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机Ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机 uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机风险数
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
     * Get 数据id 
     * @return Id 数据id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据id
     * @param Id 数据id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public Long getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get cvm id 
     * @return Quuid cvm id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm id
     * @param Quuid cvm id
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务状态 0-服务中,1-已到期 2已销毁 
     * @return Status 服务状态 0-服务中,1-已到期 2已销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态 0-服务中,1-已到期 2已销毁
     * @param Status 服务状态 0-服务中,1-已到期 2已销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 服务开始时间 
     * @return StartTime 服务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 服务开始时间
     * @param StartTime 服务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 服务结束时间 
     * @return EndTime 服务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 服务结束时间
     * @param EndTime 服务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机Ip 
     * @return HostIp 主机Ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机Ip
     * @param HostIp 主机Ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机 uuid 
     * @return Uuid 主机 uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机 uuid
     * @param Uuid 主机 uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机风险数 
     * @return RiskCount 主机风险数
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 主机风险数
     * @param RiskCount 主机风险数
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    public SecurityButlerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityButlerInfo(SecurityButlerInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OrderId != null) {
            this.OrderId = new Long(source.OrderId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);

    }
}

