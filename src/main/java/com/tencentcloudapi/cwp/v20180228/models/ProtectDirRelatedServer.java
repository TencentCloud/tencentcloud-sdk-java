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

public class ProtectDirRelatedServer extends AbstractModel{

    /**
    * 唯一ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 服务器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 服务器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 服务器系统
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * 关联目录数
    */
    @SerializedName("RelateDirNum")
    @Expose
    private Long RelateDirNum;

    /**
    * 防护状态
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * 防护开关
    */
    @SerializedName("ProtectSwitch")
    @Expose
    private Long ProtectSwitch;

    /**
    * 自动恢复开关
    */
    @SerializedName("AutoRestoreSwitchStatus")
    @Expose
    private Long AutoRestoreSwitchStatus;

    /**
    * 服务器唯一ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 是否已经授权
    */
    @SerializedName("Authorization")
    @Expose
    private Boolean Authorization;

    /**
    * 异常状态
    */
    @SerializedName("Exception")
    @Expose
    private Long Exception;

    /**
    * 过渡进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 异常信息
    */
    @SerializedName("ExceptionMessage")
    @Expose
    private String ExceptionMessage;

    /**
     * Get 唯一ID 
     * @return Id 唯一ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID
     * @param Id 唯一ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 服务器系统 
     * @return MachineOs 服务器系统
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set 服务器系统
     * @param MachineOs 服务器系统
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get 关联目录数 
     * @return RelateDirNum 关联目录数
     */
    public Long getRelateDirNum() {
        return this.RelateDirNum;
    }

    /**
     * Set 关联目录数
     * @param RelateDirNum 关联目录数
     */
    public void setRelateDirNum(Long RelateDirNum) {
        this.RelateDirNum = RelateDirNum;
    }

    /**
     * Get 防护状态 
     * @return ProtectStatus 防护状态
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set 防护状态
     * @param ProtectStatus 防护状态
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get 防护开关 
     * @return ProtectSwitch 防护开关
     */
    public Long getProtectSwitch() {
        return this.ProtectSwitch;
    }

    /**
     * Set 防护开关
     * @param ProtectSwitch 防护开关
     */
    public void setProtectSwitch(Long ProtectSwitch) {
        this.ProtectSwitch = ProtectSwitch;
    }

    /**
     * Get 自动恢复开关 
     * @return AutoRestoreSwitchStatus 自动恢复开关
     */
    public Long getAutoRestoreSwitchStatus() {
        return this.AutoRestoreSwitchStatus;
    }

    /**
     * Set 自动恢复开关
     * @param AutoRestoreSwitchStatus 自动恢复开关
     */
    public void setAutoRestoreSwitchStatus(Long AutoRestoreSwitchStatus) {
        this.AutoRestoreSwitchStatus = AutoRestoreSwitchStatus;
    }

    /**
     * Get 服务器唯一ID 
     * @return Quuid 服务器唯一ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器唯一ID
     * @param Quuid 服务器唯一ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 是否已经授权 
     * @return Authorization 是否已经授权
     */
    public Boolean getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 是否已经授权
     * @param Authorization 是否已经授权
     */
    public void setAuthorization(Boolean Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 异常状态 
     * @return Exception 异常状态
     */
    public Long getException() {
        return this.Exception;
    }

    /**
     * Set 异常状态
     * @param Exception 异常状态
     */
    public void setException(Long Exception) {
        this.Exception = Exception;
    }

    /**
     * Get 过渡进度 
     * @return Progress 过渡进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 过渡进度
     * @param Progress 过渡进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 异常信息 
     * @return ExceptionMessage 异常信息
     */
    public String getExceptionMessage() {
        return this.ExceptionMessage;
    }

    /**
     * Set 异常信息
     * @param ExceptionMessage 异常信息
     */
    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
    }

    public ProtectDirRelatedServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectDirRelatedServer(ProtectDirRelatedServer source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.RelateDirNum != null) {
            this.RelateDirNum = new Long(source.RelateDirNum);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectSwitch != null) {
            this.ProtectSwitch = new Long(source.ProtectSwitch);
        }
        if (source.AutoRestoreSwitchStatus != null) {
            this.AutoRestoreSwitchStatus = new Long(source.AutoRestoreSwitchStatus);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Authorization != null) {
            this.Authorization = new Boolean(source.Authorization);
        }
        if (source.Exception != null) {
            this.Exception = new Long(source.Exception);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.ExceptionMessage != null) {
            this.ExceptionMessage = new String(source.ExceptionMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "RelateDirNum", this.RelateDirNum);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectSwitch", this.ProtectSwitch);
        this.setParamSimple(map, prefix + "AutoRestoreSwitchStatus", this.AutoRestoreSwitchStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "Exception", this.Exception);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ExceptionMessage", this.ExceptionMessage);

    }
}

