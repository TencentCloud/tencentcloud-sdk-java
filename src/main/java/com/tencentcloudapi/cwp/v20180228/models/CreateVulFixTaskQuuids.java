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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulFixTaskQuuids extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 需要修复漏洞的主机，所有主机必须有VulId的这个漏洞且是待修复状态。
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 修复方式 0组件更新或者安装补丁,1禁用服务
    */
    @SerializedName("FixMethod")
    @Expose
    private Long FixMethod;

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 需要修复漏洞的主机，所有主机必须有VulId的这个漏洞且是待修复状态。 
     * @return Quuids 需要修复漏洞的主机，所有主机必须有VulId的这个漏洞且是待修复状态。
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 需要修复漏洞的主机，所有主机必须有VulId的这个漏洞且是待修复状态。
     * @param Quuids 需要修复漏洞的主机，所有主机必须有VulId的这个漏洞且是待修复状态。
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 修复方式 0组件更新或者安装补丁,1禁用服务 
     * @return FixMethod 修复方式 0组件更新或者安装补丁,1禁用服务
     */
    public Long getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 修复方式 0组件更新或者安装补丁,1禁用服务
     * @param FixMethod 修复方式 0组件更新或者安装补丁,1禁用服务
     */
    public void setFixMethod(Long FixMethod) {
        this.FixMethod = FixMethod;
    }

    public CreateVulFixTaskQuuids() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixTaskQuuids(CreateVulFixTaskQuuids source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.FixMethod != null) {
            this.FixMethod = new Long(source.FixMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);

    }
}

