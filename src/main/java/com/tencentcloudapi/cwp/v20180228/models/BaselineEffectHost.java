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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineEffectHost extends AbstractModel {

    /**
    * 通过项
    */
    @SerializedName("PassCount")
    @Expose
    private Long PassCount;

    /**
    * 风险项
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 首次检测事件
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * 最后检测时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 风险项处理状态状态：0-未通过，1-通过
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 检测中状态
    */
    @SerializedName("MaxStatus")
    @Expose
    private Long MaxStatus;

    /**
     * Get 通过项 
     * @return PassCount 通过项
     */
    public Long getPassCount() {
        return this.PassCount;
    }

    /**
     * Set 通过项
     * @param PassCount 通过项
     */
    public void setPassCount(Long PassCount) {
        this.PassCount = PassCount;
    }

    /**
     * Get 风险项 
     * @return FailCount 风险项
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 风险项
     * @param FailCount 风险项
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 首次检测事件 
     * @return FirstScanTime 首次检测事件
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set 首次检测事件
     * @param FirstScanTime 首次检测事件
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get 最后检测时间 
     * @return LastScanTime 最后检测时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后检测时间
     * @param LastScanTime 最后检测时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 风险项处理状态状态：0-未通过，1-通过 
     * @return Status 风险项处理状态状态：0-未通过，1-通过
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险项处理状态状态：0-未通过，1-通过
     * @param Status 风险项处理状态状态：0-未通过，1-通过
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
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
     * Get 主机别名 
     * @return AliasName 主机别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 主机别名
     * @param AliasName 主机别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 检测中状态 
     * @return MaxStatus 检测中状态
     */
    public Long getMaxStatus() {
        return this.MaxStatus;
    }

    /**
     * Set 检测中状态
     * @param MaxStatus 检测中状态
     */
    public void setMaxStatus(Long MaxStatus) {
        this.MaxStatus = MaxStatus;
    }

    public BaselineEffectHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineEffectHost(BaselineEffectHost source) {
        if (source.PassCount != null) {
            this.PassCount = new Long(source.PassCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MaxStatus != null) {
            this.MaxStatus = new Long(source.MaxStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PassCount", this.PassCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MaxStatus", this.MaxStatus);

    }
}

