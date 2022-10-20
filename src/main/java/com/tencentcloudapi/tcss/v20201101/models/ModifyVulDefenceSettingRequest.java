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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceSettingRequest extends AbstractModel{

    /**
    * 是否开启:0: 关闭 1:开启
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 漏洞防御主机范围:0：自选 1: 全部主机。IsEnabled为1时必填
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 自选漏洞防御主机,Scope为0时必填
    */
    @SerializedName("HostIDs")
    @Expose
    private String [] HostIDs;

    /**
     * Get 是否开启:0: 关闭 1:开启 
     * @return IsEnabled 是否开启:0: 关闭 1:开启
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否开启:0: 关闭 1:开启
     * @param IsEnabled 是否开启:0: 关闭 1:开启
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 漏洞防御主机范围:0：自选 1: 全部主机。IsEnabled为1时必填 
     * @return Scope 漏洞防御主机范围:0：自选 1: 全部主机。IsEnabled为1时必填
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 漏洞防御主机范围:0：自选 1: 全部主机。IsEnabled为1时必填
     * @param Scope 漏洞防御主机范围:0：自选 1: 全部主机。IsEnabled为1时必填
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 自选漏洞防御主机,Scope为0时必填 
     * @return HostIDs 自选漏洞防御主机,Scope为0时必填
     */
    public String [] getHostIDs() {
        return this.HostIDs;
    }

    /**
     * Set 自选漏洞防御主机,Scope为0时必填
     * @param HostIDs 自选漏洞防御主机,Scope为0时必填
     */
    public void setHostIDs(String [] HostIDs) {
        this.HostIDs = HostIDs;
    }

    public ModifyVulDefenceSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceSettingRequest(ModifyVulDefenceSettingRequest source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.HostIDs != null) {
            this.HostIDs = new String[source.HostIDs.length];
            for (int i = 0; i < source.HostIDs.length; i++) {
                this.HostIDs[i] = new String(source.HostIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "HostIDs.", this.HostIDs);

    }
}

