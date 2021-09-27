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

public class AssetWebLocationInfo extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 站点端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 站点协议
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 服务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 安全模块状态：0未启用，1启用，999空，仅nginx
    */
    @SerializedName("SafeStatus")
    @Expose
    private Long SafeStatus;

    /**
    * 运行用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 主目录
    */
    @SerializedName("MainPath")
    @Expose
    private String MainPath;

    /**
    * 启动命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 绑定IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 域名 
     * @return Name 域名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 域名
     * @param Name 域名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 站点端口 
     * @return Port 站点端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 站点端口
     * @param Port 站点端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 站点协议 
     * @return Proto 站点协议
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 站点协议
     * @param Proto 站点协议
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get 服务类型 
     * @return ServiceType 服务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
     * @param ServiceType 服务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 安全模块状态：0未启用，1启用，999空，仅nginx 
     * @return SafeStatus 安全模块状态：0未启用，1启用，999空，仅nginx
     */
    public Long getSafeStatus() {
        return this.SafeStatus;
    }

    /**
     * Set 安全模块状态：0未启用，1启用，999空，仅nginx
     * @param SafeStatus 安全模块状态：0未启用，1启用，999空，仅nginx
     */
    public void setSafeStatus(Long SafeStatus) {
        this.SafeStatus = SafeStatus;
    }

    /**
     * Get 运行用户 
     * @return User 运行用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 运行用户
     * @param User 运行用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 主目录 
     * @return MainPath 主目录
     */
    public String getMainPath() {
        return this.MainPath;
    }

    /**
     * Set 主目录
     * @param MainPath 主目录
     */
    public void setMainPath(String MainPath) {
        this.MainPath = MainPath;
    }

    /**
     * Get 启动命令 
     * @return Command 启动命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 启动命令
     * @param Command 启动命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 绑定IP 
     * @return Ip 绑定IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 绑定IP
     * @param Ip 绑定IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetWebLocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationInfo(AssetWebLocationInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.SafeStatus != null) {
            this.SafeStatus = new Long(source.SafeStatus);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.MainPath != null) {
            this.MainPath = new String(source.MainPath);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "SafeStatus", this.SafeStatus);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "MainPath", this.MainPath);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

