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

public class AdjustCdbProxyRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>节点规格配置<br>备注：数据库代理支持的节点规格为：2C4000MB、4C8000MB、8C16000MB。<br>示例中参数说明：<br>NodeCount：节点个数<br>Region：节点地域<br>Zone：节点可用区<br>Cpu：单个代理节点核数（单位：核）<br>Mem：单个代理节点内存数（单位：MB）</p>
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * <p>重新负载均衡：auto(自动),manual(手动)</p>
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * <p>升级切换时间。</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 维护时间内</li><li>rollUpgrade： 滚动升级</li></ul>
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
    * <p>滚动升级或平滑变配等待时间</p><p>取值范围：[0, 3600]</p><p>单位：秒</p>
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
     * Get <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p> 
     * @return ProxyGroupId <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     * @param ProxyGroupId <p>代理组 ID。可通过 <a href="https://cloud.tencent.com/document/api/236/90585">DescribeCdbProxyInfo</a> 接口获取。</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>节点规格配置<br>备注：数据库代理支持的节点规格为：2C4000MB、4C8000MB、8C16000MB。<br>示例中参数说明：<br>NodeCount：节点个数<br>Region：节点地域<br>Zone：节点可用区<br>Cpu：单个代理节点核数（单位：核）<br>Mem：单个代理节点内存数（单位：MB）</p> 
     * @return ProxyNodeCustom <p>节点规格配置<br>备注：数据库代理支持的节点规格为：2C4000MB、4C8000MB、8C16000MB。<br>示例中参数说明：<br>NodeCount：节点个数<br>Region：节点地域<br>Zone：节点可用区<br>Cpu：单个代理节点核数（单位：核）<br>Mem：单个代理节点内存数（单位：MB）</p>
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set <p>节点规格配置<br>备注：数据库代理支持的节点规格为：2C4000MB、4C8000MB、8C16000MB。<br>示例中参数说明：<br>NodeCount：节点个数<br>Region：节点地域<br>Zone：节点可用区<br>Cpu：单个代理节点核数（单位：核）<br>Mem：单个代理节点内存数（单位：MB）</p>
     * @param ProxyNodeCustom <p>节点规格配置<br>备注：数据库代理支持的节点规格为：2C4000MB、4C8000MB、8C16000MB。<br>示例中参数说明：<br>NodeCount：节点个数<br>Region：节点地域<br>Zone：节点可用区<br>Cpu：单个代理节点核数（单位：核）<br>Mem：单个代理节点内存数（单位：MB）</p>
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get <p>重新负载均衡：auto(自动),manual(手动)</p> 
     * @return ReloadBalance <p>重新负载均衡：auto(自动),manual(手动)</p>
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set <p>重新负载均衡：auto(自动),manual(手动)</p>
     * @param ReloadBalance <p>重新负载均衡：auto(自动),manual(手动)</p>
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get <p>升级切换时间。</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 维护时间内</li><li>rollUpgrade： 滚动升级</li></ul> 
     * @return UpgradeTime <p>升级切换时间。</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 维护时间内</li><li>rollUpgrade： 滚动升级</li></ul>
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set <p>升级切换时间。</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 维护时间内</li><li>rollUpgrade： 滚动升级</li></ul>
     * @param UpgradeTime <p>升级切换时间。</p><p>枚举值：</p><ul><li>nowTime： 升级完成时</li><li>timeWindow： 维护时间内</li><li>rollUpgrade： 滚动升级</li></ul>
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    /**
     * Get <p>滚动升级或平滑变配等待时间</p><p>取值范围：[0, 3600]</p><p>单位：秒</p> 
     * @return RollUpgradeWaitingTime <p>滚动升级或平滑变配等待时间</p><p>取值范围：[0, 3600]</p><p>单位：秒</p>
     */
    public Long getRollUpgradeWaitingTime() {
        return this.RollUpgradeWaitingTime;
    }

    /**
     * Set <p>滚动升级或平滑变配等待时间</p><p>取值范围：[0, 3600]</p><p>单位：秒</p>
     * @param RollUpgradeWaitingTime <p>滚动升级或平滑变配等待时间</p><p>取值范围：[0, 3600]</p><p>单位：秒</p>
     */
    public void setRollUpgradeWaitingTime(Long RollUpgradeWaitingTime) {
        this.RollUpgradeWaitingTime = RollUpgradeWaitingTime;
    }

    public AdjustCdbProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyRequest(AdjustCdbProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCustom != null) {
            this.ProxyNodeCustom = new ProxyNodeCustom[source.ProxyNodeCustom.length];
            for (int i = 0; i < source.ProxyNodeCustom.length; i++) {
                this.ProxyNodeCustom[i] = new ProxyNodeCustom(source.ProxyNodeCustom[i]);
            }
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
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
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);
        this.setParamSimple(map, prefix + "RollUpgradeWaitingTime", this.RollUpgradeWaitingTime);

    }
}

