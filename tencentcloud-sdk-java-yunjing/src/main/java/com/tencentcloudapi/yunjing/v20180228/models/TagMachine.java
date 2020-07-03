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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagMachine extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 主机ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机区域
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 主机区域类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 主机ID 
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 主机内网IP 
     * @return MachineIp 主机内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP
     * @param MachineIp 主机内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机外网IP 
     * @return MachineWanIp 主机外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP
     * @param MachineWanIp 主机外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 主机区域 
     * @return MachineRegion 主机区域
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 主机区域
     * @param MachineRegion 主机区域
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 主机区域类型 
     * @return MachineType 主机区域类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机区域类型
     * @param MachineType 主机区域类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

