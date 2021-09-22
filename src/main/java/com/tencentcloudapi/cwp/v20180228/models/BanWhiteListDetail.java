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

public class BanWhiteListDetail extends AbstractModel{

    /**
    * 白名单ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 白名单别名
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 阻断来源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 修改白名单时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建白名单时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 白名单是否全局
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 机器的UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机安全程序的UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 机器IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 机器名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
     * Get 白名单ID 
     * @return Id 白名单ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 白名单ID
     * @param Id 白名单ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 白名单别名 
     * @return Remark 白名单别名
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 白名单别名
     * @param Remark 白名单别名
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 阻断来源IP 
     * @return SrcIp 阻断来源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 阻断来源IP
     * @param SrcIp 阻断来源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 修改白名单时间 
     * @return ModifyTime 修改白名单时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改白名单时间
     * @param ModifyTime 修改白名单时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建白名单时间 
     * @return CreateTime 创建白名单时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建白名单时间
     * @param CreateTime 创建白名单时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 白名单是否全局 
     * @return IsGlobal 白名单是否全局
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 白名单是否全局
     * @param IsGlobal 白名单是否全局
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 机器的UUID 
     * @return Quuid 机器的UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器的UUID
     * @param Quuid 机器的UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机安全程序的UUID 
     * @return Uuid 主机安全程序的UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全程序的UUID
     * @param Uuid 主机安全程序的UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 机器IP 
     * @return MachineIp 机器IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 机器IP
     * @param MachineIp 机器IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 机器名称 
     * @return MachineName 机器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名称
     * @param MachineName 机器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    public BanWhiteListDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanWhiteListDetail(BanWhiteListDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);

    }
}

