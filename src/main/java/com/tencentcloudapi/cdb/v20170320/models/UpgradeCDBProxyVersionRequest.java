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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeCDBProxyVersionRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库代理ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 数据库代理当前版本
    */
    @SerializedName("SrcProxyVersion")
    @Expose
    private String SrcProxyVersion;

    /**
    * 数据库代理升级版本
    */
    @SerializedName("DstProxyVersion")
    @Expose
    private String DstProxyVersion;

    /**
    * 升级时间 ：nowTime（升级完成时）timeWindow（实例维护时间）
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库代理ID 
     * @return ProxyGroupId 数据库代理ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理ID
     * @param ProxyGroupId 数据库代理ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 数据库代理当前版本 
     * @return SrcProxyVersion 数据库代理当前版本
     */
    public String getSrcProxyVersion() {
        return this.SrcProxyVersion;
    }

    /**
     * Set 数据库代理当前版本
     * @param SrcProxyVersion 数据库代理当前版本
     */
    public void setSrcProxyVersion(String SrcProxyVersion) {
        this.SrcProxyVersion = SrcProxyVersion;
    }

    /**
     * Get 数据库代理升级版本 
     * @return DstProxyVersion 数据库代理升级版本
     */
    public String getDstProxyVersion() {
        return this.DstProxyVersion;
    }

    /**
     * Set 数据库代理升级版本
     * @param DstProxyVersion 数据库代理升级版本
     */
    public void setDstProxyVersion(String DstProxyVersion) {
        this.DstProxyVersion = DstProxyVersion;
    }

    /**
     * Get 升级时间 ：nowTime（升级完成时）timeWindow（实例维护时间） 
     * @return UpgradeTime 升级时间 ：nowTime（升级完成时）timeWindow（实例维护时间）
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set 升级时间 ：nowTime（升级完成时）timeWindow（实例维护时间）
     * @param UpgradeTime 升级时间 ：nowTime（升级完成时）timeWindow（实例维护时间）
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    public UpgradeCDBProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeCDBProxyVersionRequest(UpgradeCDBProxyVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.SrcProxyVersion != null) {
            this.SrcProxyVersion = new String(source.SrcProxyVersion);
        }
        if (source.DstProxyVersion != null) {
            this.DstProxyVersion = new String(source.DstProxyVersion);
        }
        if (source.UpgradeTime != null) {
            this.UpgradeTime = new String(source.UpgradeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "SrcProxyVersion", this.SrcProxyVersion);
        this.setParamSimple(map, prefix + "DstProxyVersion", this.DstProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);

    }
}

