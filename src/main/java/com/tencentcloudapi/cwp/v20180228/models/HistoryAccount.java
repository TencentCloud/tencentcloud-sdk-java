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

public class HistoryAccount extends AbstractModel {

    /**
    * 唯一ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机安全客户端唯一Uuid。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机内网IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 账号名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 账号变更类型。
<li>CREATE：表示新增账号</li>
<li>MODIFY：表示修改账号</li>
<li>DELETE：表示删除账号</li>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * 变更时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 唯一ID。 
     * @return Id 唯一ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID。
     * @param Id 唯一ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机安全客户端唯一Uuid。 
     * @return Uuid 主机安全客户端唯一Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全客户端唯一Uuid。
     * @param Uuid 主机安全客户端唯一Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机内网IP。 
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP。
     * @param MachineIp 主机内网IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名。 
     * @return MachineName 主机名。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名。
     * @param MachineName 主机名。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 账号名。 
     * @return Username 账号名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 账号名。
     * @param Username 账号名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 账号变更类型。
<li>CREATE：表示新增账号</li>
<li>MODIFY：表示修改账号</li>
<li>DELETE：表示删除账号</li> 
     * @return ModifyType 账号变更类型。
<li>CREATE：表示新增账号</li>
<li>MODIFY：表示修改账号</li>
<li>DELETE：表示删除账号</li>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 账号变更类型。
<li>CREATE：表示新增账号</li>
<li>MODIFY：表示修改账号</li>
<li>DELETE：表示删除账号</li>
     * @param ModifyType 账号变更类型。
<li>CREATE：表示新增账号</li>
<li>MODIFY：表示修改账号</li>
<li>DELETE：表示删除账号</li>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 变更时间。 
     * @return ModifyTime 变更时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 变更时间。
     * @param ModifyTime 变更时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public HistoryAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HistoryAccount(HistoryAccount source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

