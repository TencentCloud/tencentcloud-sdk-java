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

public class EditPrivilegeRuleRequest extends AbstractModel{

    /**
    * 规则ID(新增时请留空)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 是否S权限进程
    */
    @SerializedName("SMode")
    @Expose
    private Long SMode;

    /**
    * 是否全局规则(默认否)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
     * Get 规则ID(新增时请留空) 
     * @return Id 规则ID(新增时请留空)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID(新增时请留空)
     * @param Id 规则ID(新增时请留空)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个) 
     * @return Uuid 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     * @param Uuid 客户端ID(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机IP(IsGlobal为1时，Uuid或Hostip必填一个) 
     * @return Hostip 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     * @param Hostip 主机IP(IsGlobal为1时，Uuid或Hostip必填一个)
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 是否S权限进程 
     * @return SMode 是否S权限进程
     */
    public Long getSMode() {
        return this.SMode;
    }

    /**
     * Set 是否S权限进程
     * @param SMode 是否S权限进程
     */
    public void setSMode(Long SMode) {
        this.SMode = SMode;
    }

    /**
     * Get 是否全局规则(默认否) 
     * @return IsGlobal 是否全局规则(默认否)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(默认否)
     * @param IsGlobal 是否全局规则(默认否)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "SMode", this.SMode);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);

    }
}

