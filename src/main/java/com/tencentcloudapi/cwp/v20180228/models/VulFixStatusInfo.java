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

public class VulFixStatusInfo extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞修复进度 1-100；
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 漏洞对应主机修复状态
    */
    @SerializedName("HostList")
    @Expose
    private VulFixStatusHostInfo [] HostList;

    /**
    * 漏洞修复失败主机数量
    */
    @SerializedName("FailCnt")
    @Expose
    private Long FailCnt;

    /**
    * 修复成功的数量
    */
    @SerializedName("FixSuccessCnt")
    @Expose
    private Long FixSuccessCnt;

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
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞修复进度 1-100； 
     * @return Progress 漏洞修复进度 1-100；
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 漏洞修复进度 1-100；
     * @param Progress 漏洞修复进度 1-100；
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 漏洞对应主机修复状态 
     * @return HostList 漏洞对应主机修复状态
     */
    public VulFixStatusHostInfo [] getHostList() {
        return this.HostList;
    }

    /**
     * Set 漏洞对应主机修复状态
     * @param HostList 漏洞对应主机修复状态
     */
    public void setHostList(VulFixStatusHostInfo [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get 漏洞修复失败主机数量 
     * @return FailCnt 漏洞修复失败主机数量
     */
    public Long getFailCnt() {
        return this.FailCnt;
    }

    /**
     * Set 漏洞修复失败主机数量
     * @param FailCnt 漏洞修复失败主机数量
     */
    public void setFailCnt(Long FailCnt) {
        this.FailCnt = FailCnt;
    }

    /**
     * Get 修复成功的数量 
     * @return FixSuccessCnt 修复成功的数量
     */
    public Long getFixSuccessCnt() {
        return this.FixSuccessCnt;
    }

    /**
     * Set 修复成功的数量
     * @param FixSuccessCnt 修复成功的数量
     */
    public void setFixSuccessCnt(Long FixSuccessCnt) {
        this.FixSuccessCnt = FixSuccessCnt;
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

    public VulFixStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusInfo(VulFixStatusInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.HostList != null) {
            this.HostList = new VulFixStatusHostInfo[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new VulFixStatusHostInfo(source.HostList[i]);
            }
        }
        if (source.FailCnt != null) {
            this.FailCnt = new Long(source.FailCnt);
        }
        if (source.FixSuccessCnt != null) {
            this.FixSuccessCnt = new Long(source.FixSuccessCnt);
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
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamSimple(map, prefix + "FailCnt", this.FailCnt);
        this.setParamSimple(map, prefix + "FixSuccessCnt", this.FixSuccessCnt);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);

    }
}

