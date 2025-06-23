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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CsipRiskCenterStatistics extends AbstractModel {

    /**
    * 端口风险总数
    */
    @SerializedName("PortTotal")
    @Expose
    private Long PortTotal;

    /**
    * 端口风险高危数量
    */
    @SerializedName("PortHighLevel")
    @Expose
    private Long PortHighLevel;

    /**
    * 	弱口令风险总数
    */
    @SerializedName("WeakPasswordTotal")
    @Expose
    private Long WeakPasswordTotal;

    /**
    * 弱口令风险高危数量
    */
    @SerializedName("WeakPasswordHighLevel")
    @Expose
    private Long WeakPasswordHighLevel;

    /**
    * 网站风险数量
    */
    @SerializedName("WebsiteTotal")
    @Expose
    private Long WebsiteTotal;

    /**
    * 网站高危风险数量
    */
    @SerializedName("WebsiteHighLevel")
    @Expose
    private Long WebsiteHighLevel;

    /**
    * 最新的扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 漏洞风险数
    */
    @SerializedName("VULTotal")
    @Expose
    private Long VULTotal;

    /**
    * 高危漏洞风险数
    */
    @SerializedName("VULHighLevel")
    @Expose
    private Long VULHighLevel;

    /**
    * 配置项风险数量
    */
    @SerializedName("CFGTotal")
    @Expose
    private Long CFGTotal;

    /**
    * 高危配置项风险数量
    */
    @SerializedName("CFGHighLevel")
    @Expose
    private Long CFGHighLevel;

    /**
    * 测绘服务风险数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerTotal")
    @Expose
    private Long ServerTotal;

    /**
    * 测绘服务高危数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerHighLevel")
    @Expose
    private Long ServerHighLevel;

    /**
    * 主机基线风险数量
    */
    @SerializedName("HostBaseLineRiskTotal")
    @Expose
    private Long HostBaseLineRiskTotal;

    /**
    * 主机基线高危风险数量
    */
    @SerializedName("HostBaseLineRiskHighLevel")
    @Expose
    private Long HostBaseLineRiskHighLevel;

    /**
    * 容器基线风险数量
    */
    @SerializedName("PodBaseLineRiskTotal")
    @Expose
    private Long PodBaseLineRiskTotal;

    /**
    * 容器基线高危风险数量
    */
    @SerializedName("PodBaseLineRiskHighLevel")
    @Expose
    private Long PodBaseLineRiskHighLevel;

    /**
     * Get 端口风险总数 
     * @return PortTotal 端口风险总数
     */
    public Long getPortTotal() {
        return this.PortTotal;
    }

    /**
     * Set 端口风险总数
     * @param PortTotal 端口风险总数
     */
    public void setPortTotal(Long PortTotal) {
        this.PortTotal = PortTotal;
    }

    /**
     * Get 端口风险高危数量 
     * @return PortHighLevel 端口风险高危数量
     */
    public Long getPortHighLevel() {
        return this.PortHighLevel;
    }

    /**
     * Set 端口风险高危数量
     * @param PortHighLevel 端口风险高危数量
     */
    public void setPortHighLevel(Long PortHighLevel) {
        this.PortHighLevel = PortHighLevel;
    }

    /**
     * Get 	弱口令风险总数 
     * @return WeakPasswordTotal 	弱口令风险总数
     */
    public Long getWeakPasswordTotal() {
        return this.WeakPasswordTotal;
    }

    /**
     * Set 	弱口令风险总数
     * @param WeakPasswordTotal 	弱口令风险总数
     */
    public void setWeakPasswordTotal(Long WeakPasswordTotal) {
        this.WeakPasswordTotal = WeakPasswordTotal;
    }

    /**
     * Get 弱口令风险高危数量 
     * @return WeakPasswordHighLevel 弱口令风险高危数量
     */
    public Long getWeakPasswordHighLevel() {
        return this.WeakPasswordHighLevel;
    }

    /**
     * Set 弱口令风险高危数量
     * @param WeakPasswordHighLevel 弱口令风险高危数量
     */
    public void setWeakPasswordHighLevel(Long WeakPasswordHighLevel) {
        this.WeakPasswordHighLevel = WeakPasswordHighLevel;
    }

    /**
     * Get 网站风险数量 
     * @return WebsiteTotal 网站风险数量
     */
    public Long getWebsiteTotal() {
        return this.WebsiteTotal;
    }

    /**
     * Set 网站风险数量
     * @param WebsiteTotal 网站风险数量
     */
    public void setWebsiteTotal(Long WebsiteTotal) {
        this.WebsiteTotal = WebsiteTotal;
    }

    /**
     * Get 网站高危风险数量 
     * @return WebsiteHighLevel 网站高危风险数量
     */
    public Long getWebsiteHighLevel() {
        return this.WebsiteHighLevel;
    }

    /**
     * Set 网站高危风险数量
     * @param WebsiteHighLevel 网站高危风险数量
     */
    public void setWebsiteHighLevel(Long WebsiteHighLevel) {
        this.WebsiteHighLevel = WebsiteHighLevel;
    }

    /**
     * Get 最新的扫描时间 
     * @return LastScanTime 最新的扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最新的扫描时间
     * @param LastScanTime 最新的扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 漏洞风险数 
     * @return VULTotal 漏洞风险数
     */
    public Long getVULTotal() {
        return this.VULTotal;
    }

    /**
     * Set 漏洞风险数
     * @param VULTotal 漏洞风险数
     */
    public void setVULTotal(Long VULTotal) {
        this.VULTotal = VULTotal;
    }

    /**
     * Get 高危漏洞风险数 
     * @return VULHighLevel 高危漏洞风险数
     */
    public Long getVULHighLevel() {
        return this.VULHighLevel;
    }

    /**
     * Set 高危漏洞风险数
     * @param VULHighLevel 高危漏洞风险数
     */
    public void setVULHighLevel(Long VULHighLevel) {
        this.VULHighLevel = VULHighLevel;
    }

    /**
     * Get 配置项风险数量 
     * @return CFGTotal 配置项风险数量
     */
    public Long getCFGTotal() {
        return this.CFGTotal;
    }

    /**
     * Set 配置项风险数量
     * @param CFGTotal 配置项风险数量
     */
    public void setCFGTotal(Long CFGTotal) {
        this.CFGTotal = CFGTotal;
    }

    /**
     * Get 高危配置项风险数量 
     * @return CFGHighLevel 高危配置项风险数量
     */
    public Long getCFGHighLevel() {
        return this.CFGHighLevel;
    }

    /**
     * Set 高危配置项风险数量
     * @param CFGHighLevel 高危配置项风险数量
     */
    public void setCFGHighLevel(Long CFGHighLevel) {
        this.CFGHighLevel = CFGHighLevel;
    }

    /**
     * Get 测绘服务风险数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerTotal 测绘服务风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServerTotal() {
        return this.ServerTotal;
    }

    /**
     * Set 测绘服务风险数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerTotal 测绘服务风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerTotal(Long ServerTotal) {
        this.ServerTotal = ServerTotal;
    }

    /**
     * Get 测绘服务高危数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerHighLevel 测绘服务高危数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServerHighLevel() {
        return this.ServerHighLevel;
    }

    /**
     * Set 测绘服务高危数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerHighLevel 测绘服务高危数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerHighLevel(Long ServerHighLevel) {
        this.ServerHighLevel = ServerHighLevel;
    }

    /**
     * Get 主机基线风险数量 
     * @return HostBaseLineRiskTotal 主机基线风险数量
     */
    public Long getHostBaseLineRiskTotal() {
        return this.HostBaseLineRiskTotal;
    }

    /**
     * Set 主机基线风险数量
     * @param HostBaseLineRiskTotal 主机基线风险数量
     */
    public void setHostBaseLineRiskTotal(Long HostBaseLineRiskTotal) {
        this.HostBaseLineRiskTotal = HostBaseLineRiskTotal;
    }

    /**
     * Get 主机基线高危风险数量 
     * @return HostBaseLineRiskHighLevel 主机基线高危风险数量
     */
    public Long getHostBaseLineRiskHighLevel() {
        return this.HostBaseLineRiskHighLevel;
    }

    /**
     * Set 主机基线高危风险数量
     * @param HostBaseLineRiskHighLevel 主机基线高危风险数量
     */
    public void setHostBaseLineRiskHighLevel(Long HostBaseLineRiskHighLevel) {
        this.HostBaseLineRiskHighLevel = HostBaseLineRiskHighLevel;
    }

    /**
     * Get 容器基线风险数量 
     * @return PodBaseLineRiskTotal 容器基线风险数量
     */
    public Long getPodBaseLineRiskTotal() {
        return this.PodBaseLineRiskTotal;
    }

    /**
     * Set 容器基线风险数量
     * @param PodBaseLineRiskTotal 容器基线风险数量
     */
    public void setPodBaseLineRiskTotal(Long PodBaseLineRiskTotal) {
        this.PodBaseLineRiskTotal = PodBaseLineRiskTotal;
    }

    /**
     * Get 容器基线高危风险数量 
     * @return PodBaseLineRiskHighLevel 容器基线高危风险数量
     */
    public Long getPodBaseLineRiskHighLevel() {
        return this.PodBaseLineRiskHighLevel;
    }

    /**
     * Set 容器基线高危风险数量
     * @param PodBaseLineRiskHighLevel 容器基线高危风险数量
     */
    public void setPodBaseLineRiskHighLevel(Long PodBaseLineRiskHighLevel) {
        this.PodBaseLineRiskHighLevel = PodBaseLineRiskHighLevel;
    }

    public CsipRiskCenterStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsipRiskCenterStatistics(CsipRiskCenterStatistics source) {
        if (source.PortTotal != null) {
            this.PortTotal = new Long(source.PortTotal);
        }
        if (source.PortHighLevel != null) {
            this.PortHighLevel = new Long(source.PortHighLevel);
        }
        if (source.WeakPasswordTotal != null) {
            this.WeakPasswordTotal = new Long(source.WeakPasswordTotal);
        }
        if (source.WeakPasswordHighLevel != null) {
            this.WeakPasswordHighLevel = new Long(source.WeakPasswordHighLevel);
        }
        if (source.WebsiteTotal != null) {
            this.WebsiteTotal = new Long(source.WebsiteTotal);
        }
        if (source.WebsiteHighLevel != null) {
            this.WebsiteHighLevel = new Long(source.WebsiteHighLevel);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.VULTotal != null) {
            this.VULTotal = new Long(source.VULTotal);
        }
        if (source.VULHighLevel != null) {
            this.VULHighLevel = new Long(source.VULHighLevel);
        }
        if (source.CFGTotal != null) {
            this.CFGTotal = new Long(source.CFGTotal);
        }
        if (source.CFGHighLevel != null) {
            this.CFGHighLevel = new Long(source.CFGHighLevel);
        }
        if (source.ServerTotal != null) {
            this.ServerTotal = new Long(source.ServerTotal);
        }
        if (source.ServerHighLevel != null) {
            this.ServerHighLevel = new Long(source.ServerHighLevel);
        }
        if (source.HostBaseLineRiskTotal != null) {
            this.HostBaseLineRiskTotal = new Long(source.HostBaseLineRiskTotal);
        }
        if (source.HostBaseLineRiskHighLevel != null) {
            this.HostBaseLineRiskHighLevel = new Long(source.HostBaseLineRiskHighLevel);
        }
        if (source.PodBaseLineRiskTotal != null) {
            this.PodBaseLineRiskTotal = new Long(source.PodBaseLineRiskTotal);
        }
        if (source.PodBaseLineRiskHighLevel != null) {
            this.PodBaseLineRiskHighLevel = new Long(source.PodBaseLineRiskHighLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortTotal", this.PortTotal);
        this.setParamSimple(map, prefix + "PortHighLevel", this.PortHighLevel);
        this.setParamSimple(map, prefix + "WeakPasswordTotal", this.WeakPasswordTotal);
        this.setParamSimple(map, prefix + "WeakPasswordHighLevel", this.WeakPasswordHighLevel);
        this.setParamSimple(map, prefix + "WebsiteTotal", this.WebsiteTotal);
        this.setParamSimple(map, prefix + "WebsiteHighLevel", this.WebsiteHighLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "VULTotal", this.VULTotal);
        this.setParamSimple(map, prefix + "VULHighLevel", this.VULHighLevel);
        this.setParamSimple(map, prefix + "CFGTotal", this.CFGTotal);
        this.setParamSimple(map, prefix + "CFGHighLevel", this.CFGHighLevel);
        this.setParamSimple(map, prefix + "ServerTotal", this.ServerTotal);
        this.setParamSimple(map, prefix + "ServerHighLevel", this.ServerHighLevel);
        this.setParamSimple(map, prefix + "HostBaseLineRiskTotal", this.HostBaseLineRiskTotal);
        this.setParamSimple(map, prefix + "HostBaseLineRiskHighLevel", this.HostBaseLineRiskHighLevel);
        this.setParamSimple(map, prefix + "PodBaseLineRiskTotal", this.PodBaseLineRiskTotal);
        this.setParamSimple(map, prefix + "PodBaseLineRiskHighLevel", this.PodBaseLineRiskHighLevel);

    }
}

