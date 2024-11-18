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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellPluginSetting extends AbstractModel {

    /**
    * 容器quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 服务器ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * javashell插件开关 0: 关闭 1: 开启
    */
    @SerializedName("JavaShellStatus")
    @Expose
    private Long JavaShellStatus;

    /**
    * 插件是否存在异常 0: 正常 1: 异常
    */
    @SerializedName("Exception")
    @Expose
    private Long Exception;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 服务器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 容器quuid 
     * @return Quuid 容器quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 容器quuid
     * @param Quuid 容器quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器名 
     * @return Alias 服务器名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务器名
     * @param Alias 服务器名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 服务器ip 
     * @return HostIp 服务器ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器ip
     * @param HostIp 服务器ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get javashell插件开关 0: 关闭 1: 开启 
     * @return JavaShellStatus javashell插件开关 0: 关闭 1: 开启
     */
    public Long getJavaShellStatus() {
        return this.JavaShellStatus;
    }

    /**
     * Set javashell插件开关 0: 关闭 1: 开启
     * @param JavaShellStatus javashell插件开关 0: 关闭 1: 开启
     */
    public void setJavaShellStatus(Long JavaShellStatus) {
        this.JavaShellStatus = JavaShellStatus;
    }

    /**
     * Get 插件是否存在异常 0: 正常 1: 异常 
     * @return Exception 插件是否存在异常 0: 正常 1: 异常
     */
    public Long getException() {
        return this.Exception;
    }

    /**
     * Set 插件是否存在异常 0: 正常 1: 异常
     * @param Exception 插件是否存在异常 0: 正常 1: 异常
     */
    public void setException(Long Exception) {
        this.Exception = Exception;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 服务器uuid 
     * @return Uuid 服务器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器uuid
     * @param Uuid 服务器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机额外信息 
     * @return MachineExtraInfo 主机额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
     * @param MachineExtraInfo 主机额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public JavaMemShellPluginSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellPluginSetting(JavaMemShellPluginSetting source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.JavaShellStatus != null) {
            this.JavaShellStatus = new Long(source.JavaShellStatus);
        }
        if (source.Exception != null) {
            this.Exception = new Long(source.Exception);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "JavaShellStatus", this.JavaShellStatus);
        this.setParamSimple(map, prefix + "Exception", this.Exception);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

