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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskCenterOverviewTrendAnalysis extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 端口数
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 漏洞数
    */
    @SerializedName("VUL")
    @Expose
    private Long VUL;

    /**
    * 弱口令数
    */
    @SerializedName("WeakPassword")
    @Expose
    private Long WeakPassword;

    /**
    * 网站数
    */
    @SerializedName("Website")
    @Expose
    private Long Website;

    /**
    * 配置数
    */
    @SerializedName("CFG")
    @Expose
    private Long CFG;

    /**
    * 测绘风险数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private Long Server;

    /**
    * 主机风险配置数量
    */
    @SerializedName("HostCFG")
    @Expose
    private Long HostCFG;

    /**
    * 容器基线风险配置数量
    */
    @SerializedName("PodCFG")
    @Expose
    private Long PodCFG;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 端口数 
     * @return Port 端口数
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口数
     * @param Port 端口数
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 漏洞数 
     * @return VUL 漏洞数
     */
    public Long getVUL() {
        return this.VUL;
    }

    /**
     * Set 漏洞数
     * @param VUL 漏洞数
     */
    public void setVUL(Long VUL) {
        this.VUL = VUL;
    }

    /**
     * Get 弱口令数 
     * @return WeakPassword 弱口令数
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set 弱口令数
     * @param WeakPassword 弱口令数
     */
    public void setWeakPassword(Long WeakPassword) {
        this.WeakPassword = WeakPassword;
    }

    /**
     * Get 网站数 
     * @return Website 网站数
     */
    public Long getWebsite() {
        return this.Website;
    }

    /**
     * Set 网站数
     * @param Website 网站数
     */
    public void setWebsite(Long Website) {
        this.Website = Website;
    }

    /**
     * Get 配置数 
     * @return CFG 配置数
     */
    public Long getCFG() {
        return this.CFG;
    }

    /**
     * Set 配置数
     * @param CFG 配置数
     */
    public void setCFG(Long CFG) {
        this.CFG = CFG;
    }

    /**
     * Get 测绘风险数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 测绘风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServer() {
        return this.Server;
    }

    /**
     * Set 测绘风险数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 测绘风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(Long Server) {
        this.Server = Server;
    }

    /**
     * Get 主机风险配置数量 
     * @return HostCFG 主机风险配置数量
     */
    public Long getHostCFG() {
        return this.HostCFG;
    }

    /**
     * Set 主机风险配置数量
     * @param HostCFG 主机风险配置数量
     */
    public void setHostCFG(Long HostCFG) {
        this.HostCFG = HostCFG;
    }

    /**
     * Get 容器基线风险配置数量 
     * @return PodCFG 容器基线风险配置数量
     */
    public Long getPodCFG() {
        return this.PodCFG;
    }

    /**
     * Set 容器基线风险配置数量
     * @param PodCFG 容器基线风险配置数量
     */
    public void setPodCFG(Long PodCFG) {
        this.PodCFG = PodCFG;
    }

    public RiskCenterOverviewTrendAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCenterOverviewTrendAnalysis(RiskCenterOverviewTrendAnalysis source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VUL != null) {
            this.VUL = new Long(source.VUL);
        }
        if (source.WeakPassword != null) {
            this.WeakPassword = new Long(source.WeakPassword);
        }
        if (source.Website != null) {
            this.Website = new Long(source.Website);
        }
        if (source.CFG != null) {
            this.CFG = new Long(source.CFG);
        }
        if (source.Server != null) {
            this.Server = new Long(source.Server);
        }
        if (source.HostCFG != null) {
            this.HostCFG = new Long(source.HostCFG);
        }
        if (source.PodCFG != null) {
            this.PodCFG = new Long(source.PodCFG);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VUL", this.VUL);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "Website", this.Website);
        this.setParamSimple(map, prefix + "CFG", this.CFG);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "HostCFG", this.HostCFG);
        this.setParamSimple(map, prefix + "PodCFG", this.PodCFG);

    }
}

