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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxyVersionRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * 数据库代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 升级时间 ：no（升级完成时）yes（实例维护时间）
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get 数据库代理组ID 
     * @return ProxyGroupId 数据库代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理组ID
     * @param ProxyGroupId 数据库代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 升级时间 ：no（升级完成时）yes（实例维护时间） 
     * @return IsInMaintainPeriod 升级时间 ：no（升级完成时）yes（实例维护时间）
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set 升级时间 ：no（升级完成时）yes（实例维护时间）
     * @param IsInMaintainPeriod 升级时间 ：no（升级完成时）yes（实例维护时间）
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public UpgradeProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyVersionRequest(UpgradeProxyVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SrcProxyVersion != null) {
            this.SrcProxyVersion = new String(source.SrcProxyVersion);
        }
        if (source.DstProxyVersion != null) {
            this.DstProxyVersion = new String(source.DstProxyVersion);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SrcProxyVersion", this.SrcProxyVersion);
        this.setParamSimple(map, prefix + "DstProxyVersion", this.DstProxyVersion);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

