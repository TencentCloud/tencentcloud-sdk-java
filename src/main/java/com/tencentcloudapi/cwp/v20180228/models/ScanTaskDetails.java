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

public class ScanTaskDetails extends AbstractModel{

    /**
    * 服务器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 服务器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 操作系统
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 风险数量
    */
    @SerializedName("RiskNum")
    @Expose
    private Long RiskNum;

    /**
    * 扫描开始时间
    */
    @SerializedName("ScanBeginTime")
    @Expose
    private String ScanBeginTime;

    /**
    * 扫描结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 唯一Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 唯一Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 状态码
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * id唯一
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 失败详情
    */
    @SerializedName("FailType")
    @Expose
    private Long FailType;

    /**
     * Get 服务器IP 
     * @return HostIp 服务器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器IP
     * @param HostIp 服务器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 服务器名称 
     * @return HostName 服务器名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 服务器名称
     * @param HostName 服务器名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 操作系统 
     * @return OsName 操作系统
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统
     * @param OsName 操作系统
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 风险数量 
     * @return RiskNum 风险数量
     */
    public Long getRiskNum() {
        return this.RiskNum;
    }

    /**
     * Set 风险数量
     * @param RiskNum 风险数量
     */
    public void setRiskNum(Long RiskNum) {
        this.RiskNum = RiskNum;
    }

    /**
     * Get 扫描开始时间 
     * @return ScanBeginTime 扫描开始时间
     */
    public String getScanBeginTime() {
        return this.ScanBeginTime;
    }

    /**
     * Set 扫描开始时间
     * @param ScanBeginTime 扫描开始时间
     */
    public void setScanBeginTime(String ScanBeginTime) {
        this.ScanBeginTime = ScanBeginTime;
    }

    /**
     * Get 扫描结束时间 
     * @return ScanEndTime 扫描结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 扫描结束时间
     * @param ScanEndTime 扫描结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get 唯一Uuid 
     * @return Uuid 唯一Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 唯一Uuid
     * @param Uuid 唯一Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 唯一Quuid 
     * @return Quuid 唯一Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 唯一Quuid
     * @param Quuid 唯一Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 状态码 
     * @return Status 状态码
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态码
     * @param Status 状态码
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get id唯一 
     * @return Id id唯一
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id唯一
     * @param Id id唯一
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 失败详情 
     * @return FailType 失败详情
     */
    public Long getFailType() {
        return this.FailType;
    }

    /**
     * Set 失败详情
     * @param FailType 失败详情
     */
    public void setFailType(Long FailType) {
        this.FailType = FailType;
    }

    public ScanTaskDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskDetails(ScanTaskDetails source) {
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.RiskNum != null) {
            this.RiskNum = new Long(source.RiskNum);
        }
        if (source.ScanBeginTime != null) {
            this.ScanBeginTime = new String(source.ScanBeginTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FailType != null) {
            this.FailType = new Long(source.FailType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "RiskNum", this.RiskNum);
        this.setParamSimple(map, prefix + "ScanBeginTime", this.ScanBeginTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FailType", this.FailType);

    }
}

