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

public class VulScanTaskDetail extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>创建者AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>公网ip</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网ip</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>扫描状态（SUCCESS: 扫描完成/成功, OFFLINE: 客户端离线, TIMEOUT: 扫描超时, FAILED: 扫描失败, UNSUPPORTED: 客户端版本过低/不支持扫描, TERMINATED: 已终止, TERMINATING: 终止中）</p><p>枚举值：</p><ul><li>SCANNING： 扫描中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>扫描开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>扫描结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>漏洞数量</p>
    */
    @SerializedName("Vuls")
    @Expose
    private Long Vuls;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>任务id</p> 
     * @return Id <p>任务id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>任务id</p>
     * @param Id <p>任务id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>创建者AppId</p> 
     * @return AppId <p>创建者AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>创建者AppId</p>
     * @param AppId <p>创建者AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>公网ip</p> 
     * @return PublicIp <p>公网ip</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网ip</p>
     * @param PublicIp <p>公网ip</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网ip</p> 
     * @return PrivateIp <p>内网ip</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网ip</p>
     * @param PrivateIp <p>内网ip</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>操作系统</p> 
     * @return OS <p>操作系统</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>操作系统</p>
     * @param OS <p>操作系统</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>扫描状态（SUCCESS: 扫描完成/成功, OFFLINE: 客户端离线, TIMEOUT: 扫描超时, FAILED: 扫描失败, UNSUPPORTED: 客户端版本过低/不支持扫描, TERMINATED: 已终止, TERMINATING: 终止中）</p><p>枚举值：</p><ul><li>SCANNING： 扫描中</li></ul> 
     * @return Status <p>扫描状态（SUCCESS: 扫描完成/成功, OFFLINE: 客户端离线, TIMEOUT: 扫描超时, FAILED: 扫描失败, UNSUPPORTED: 客户端版本过低/不支持扫描, TERMINATED: 已终止, TERMINATING: 终止中）</p><p>枚举值：</p><ul><li>SCANNING： 扫描中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扫描状态（SUCCESS: 扫描完成/成功, OFFLINE: 客户端离线, TIMEOUT: 扫描超时, FAILED: 扫描失败, UNSUPPORTED: 客户端版本过低/不支持扫描, TERMINATED: 已终止, TERMINATING: 终止中）</p><p>枚举值：</p><ul><li>SCANNING： 扫描中</li></ul>
     * @param Status <p>扫描状态（SUCCESS: 扫描完成/成功, OFFLINE: 客户端离线, TIMEOUT: 扫描超时, FAILED: 扫描失败, UNSUPPORTED: 客户端版本过低/不支持扫描, TERMINATED: 已终止, TERMINATING: 终止中）</p><p>枚举值：</p><ul><li>SCANNING： 扫描中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>扫描开始时间</p> 
     * @return StartTime <p>扫描开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>扫描开始时间</p>
     * @param StartTime <p>扫描开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>扫描结束时间</p> 
     * @return EndTime <p>扫描结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>扫描结束时间</p>
     * @param EndTime <p>扫描结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>漏洞数量</p> 
     * @return Vuls <p>漏洞数量</p>
     */
    public Long getVuls() {
        return this.Vuls;
    }

    /**
     * Set <p>漏洞数量</p>
     * @param Vuls <p>漏洞数量</p>
     */
    public void setVuls(Long Vuls) {
        this.Vuls = Vuls;
    }

    /**
     * Get <p>失败原因</p> 
     * @return Description <p>失败原因</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>失败原因</p>
     * @param Description <p>失败原因</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public VulScanTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanTaskDetail(VulScanTaskDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Vuls != null) {
            this.Vuls = new Long(source.Vuls);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Vuls", this.Vuls);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

