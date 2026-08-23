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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyImageRegistryTimedScanTaskConfigRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>任务id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>定时任务调度配置</p>
    */
    @SerializedName("Schedule")
    @Expose
    private ImageScanScheduleConfig Schedule;

    /**
    * <p>超时时间，单位秒</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>任务id</p> 
     * @return Id <p>任务id</p>
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set <p>任务id</p>
     * @param Id <p>任务id</p>
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enable <p>是否启用</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enable <p>是否启用</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul> 
     * @return ScanType <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     * @param ScanType <p>扫描类别</p><p>枚举值：</p><ul><li>CVE： 漏洞</li><li>RISK： 风险</li><li>VIRUS： 木马</li></ul>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>定时任务调度配置</p> 
     * @return Schedule <p>定时任务调度配置</p>
     */
    public ImageScanScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>定时任务调度配置</p>
     * @param Schedule <p>定时任务调度配置</p>
     */
    public void setSchedule(ImageScanScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>超时时间，单位秒</p> 
     * @return Timeout <p>超时时间，单位秒</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间，单位秒</p>
     * @param Timeout <p>超时时间，单位秒</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public BatchModifyImageRegistryTimedScanTaskConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyImageRegistryTimedScanTaskConfigRequest(BatchModifyImageRegistryTimedScanTaskConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Schedule != null) {
            this.Schedule = new ImageScanScheduleConfig(source.Schedule);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

