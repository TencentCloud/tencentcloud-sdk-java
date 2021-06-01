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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineInfo extends AbstractModel{

    /**
    * 机器的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 机器状态，0:异常，1:正常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 机器离线时间，空为正常，异常返回具体时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 机器是否开启自动升级。0:关闭，1:开启
    */
    @SerializedName("AutoUpdate")
    @Expose
    private Long AutoUpdate;

    /**
    * 机器当前版本号。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 机器升级功能状态。
    */
    @SerializedName("UpdateStatus")
    @Expose
    private Long UpdateStatus;

    /**
    * 机器升级结果标识。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 机器升级结果信息。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 机器的IP 
     * @return Ip 机器的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 机器的IP
     * @param Ip 机器的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 机器状态，0:异常，1:正常 
     * @return Status 机器状态，0:异常，1:正常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 机器状态，0:异常，1:正常
     * @param Status 机器状态，0:异常，1:正常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 机器离线时间，空为正常，异常返回具体时间 
     * @return OfflineTime 机器离线时间，空为正常，异常返回具体时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 机器离线时间，空为正常，异常返回具体时间
     * @param OfflineTime 机器离线时间，空为正常，异常返回具体时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 机器是否开启自动升级。0:关闭，1:开启 
     * @return AutoUpdate 机器是否开启自动升级。0:关闭，1:开启
     */
    public Long getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set 机器是否开启自动升级。0:关闭，1:开启
     * @param AutoUpdate 机器是否开启自动升级。0:关闭，1:开启
     */
    public void setAutoUpdate(Long AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get 机器当前版本号。 
     * @return Version 机器当前版本号。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 机器当前版本号。
     * @param Version 机器当前版本号。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 机器升级功能状态。 
     * @return UpdateStatus 机器升级功能状态。
     */
    public Long getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set 机器升级功能状态。
     * @param UpdateStatus 机器升级功能状态。
     */
    public void setUpdateStatus(Long UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    /**
     * Get 机器升级结果标识。 
     * @return ErrCode 机器升级结果标识。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 机器升级结果标识。
     * @param ErrCode 机器升级结果标识。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 机器升级结果信息。 
     * @return ErrMsg 机器升级结果信息。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 机器升级结果信息。
     * @param ErrMsg 机器升级结果信息。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public MachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineInfo(MachineInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new Long(source.AutoUpdate);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UpdateStatus != null) {
            this.UpdateStatus = new Long(source.UpdateStatus);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

