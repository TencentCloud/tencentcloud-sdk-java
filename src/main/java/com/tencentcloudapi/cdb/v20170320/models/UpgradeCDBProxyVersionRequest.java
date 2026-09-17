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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeCDBProxyVersionRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库代理 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>数据库代理当前版本</p>
    */
    @SerializedName("SrcProxyVersion")
    @Expose
    private String SrcProxyVersion;

    /**
    * <p>数据库代理升级版本</p>
    */
    @SerializedName("DstProxyVersion")
    @Expose
    private String DstProxyVersion;

    /**
    * <p>升级切换时间</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 实例维护时间</li><li>rollUpgrade： 滚动升级</li></ul>
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
    * <p>滚动升级等待时间</p><p>取值范围：[10, 3600]</p><p>单位：秒</p>
    */
    @SerializedName("RollUpgradeWaitingTime")
    @Expose
    private Long RollUpgradeWaitingTime;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库代理 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p> 
     * @return ProxyGroupId <p>数据库代理 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>数据库代理 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     * @param ProxyGroupId <p>数据库代理 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>数据库代理当前版本</p> 
     * @return SrcProxyVersion <p>数据库代理当前版本</p>
     */
    public String getSrcProxyVersion() {
        return this.SrcProxyVersion;
    }

    /**
     * Set <p>数据库代理当前版本</p>
     * @param SrcProxyVersion <p>数据库代理当前版本</p>
     */
    public void setSrcProxyVersion(String SrcProxyVersion) {
        this.SrcProxyVersion = SrcProxyVersion;
    }

    /**
     * Get <p>数据库代理升级版本</p> 
     * @return DstProxyVersion <p>数据库代理升级版本</p>
     */
    public String getDstProxyVersion() {
        return this.DstProxyVersion;
    }

    /**
     * Set <p>数据库代理升级版本</p>
     * @param DstProxyVersion <p>数据库代理升级版本</p>
     */
    public void setDstProxyVersion(String DstProxyVersion) {
        this.DstProxyVersion = DstProxyVersion;
    }

    /**
     * Get <p>升级切换时间</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 实例维护时间</li><li>rollUpgrade： 滚动升级</li></ul> 
     * @return UpgradeTime <p>升级切换时间</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 实例维护时间</li><li>rollUpgrade： 滚动升级</li></ul>
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set <p>升级切换时间</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 实例维护时间</li><li>rollUpgrade： 滚动升级</li></ul>
     * @param UpgradeTime <p>升级切换时间</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 实例维护时间</li><li>rollUpgrade： 滚动升级</li></ul>
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    /**
     * Get <p>滚动升级等待时间</p><p>取值范围：[10, 3600]</p><p>单位：秒</p> 
     * @return RollUpgradeWaitingTime <p>滚动升级等待时间</p><p>取值范围：[10, 3600]</p><p>单位：秒</p>
     */
    public Long getRollUpgradeWaitingTime() {
        return this.RollUpgradeWaitingTime;
    }

    /**
     * Set <p>滚动升级等待时间</p><p>取值范围：[10, 3600]</p><p>单位：秒</p>
     * @param RollUpgradeWaitingTime <p>滚动升级等待时间</p><p>取值范围：[10, 3600]</p><p>单位：秒</p>
     */
    public void setRollUpgradeWaitingTime(Long RollUpgradeWaitingTime) {
        this.RollUpgradeWaitingTime = RollUpgradeWaitingTime;
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
        if (source.RollUpgradeWaitingTime != null) {
            this.RollUpgradeWaitingTime = new Long(source.RollUpgradeWaitingTime);
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
        this.setParamSimple(map, prefix + "RollUpgradeWaitingTime", this.RollUpgradeWaitingTime);

    }
}

