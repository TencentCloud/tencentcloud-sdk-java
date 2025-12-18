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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterprisePackageConfig extends AbstractModel {

    /**
    * 购买高防包所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 防护IP数
    */
    @SerializedName("ProtectIpCount")
    @Expose
    private Long ProtectIpCount;

    /**
    * 保底防护带宽
    */
    @SerializedName("BasicProtectBandwidth")
    @Expose
    private Long BasicProtectBandwidth;

    /**
    * 业务带宽规模
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 弹性带宽 Gbps，可选择的弹性带宽[0,400,500,600,800,1000]
默认为0
    */
    @SerializedName("ElasticProtectBandwidth")
    @Expose
    private Long ElasticProtectBandwidth;

    /**
    * 是否开启弹性业务带宽
默认为false
    */
    @SerializedName("ElasticBandwidthFlag")
    @Expose
    private Boolean ElasticBandwidthFlag;

    /**
     * Get 购买高防包所属地域 
     * @return Region 购买高防包所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 购买高防包所属地域
     * @param Region 购买高防包所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 防护IP数 
     * @return ProtectIpCount 防护IP数
     */
    public Long getProtectIpCount() {
        return this.ProtectIpCount;
    }

    /**
     * Set 防护IP数
     * @param ProtectIpCount 防护IP数
     */
    public void setProtectIpCount(Long ProtectIpCount) {
        this.ProtectIpCount = ProtectIpCount;
    }

    /**
     * Get 保底防护带宽 
     * @return BasicProtectBandwidth 保底防护带宽
     */
    public Long getBasicProtectBandwidth() {
        return this.BasicProtectBandwidth;
    }

    /**
     * Set 保底防护带宽
     * @param BasicProtectBandwidth 保底防护带宽
     */
    public void setBasicProtectBandwidth(Long BasicProtectBandwidth) {
        this.BasicProtectBandwidth = BasicProtectBandwidth;
    }

    /**
     * Get 业务带宽规模 
     * @return Bandwidth 业务带宽规模
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 业务带宽规模
     * @param Bandwidth 业务带宽规模
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 弹性带宽 Gbps，可选择的弹性带宽[0,400,500,600,800,1000]
默认为0 
     * @return ElasticProtectBandwidth 弹性带宽 Gbps，可选择的弹性带宽[0,400,500,600,800,1000]
默认为0
     */
    public Long getElasticProtectBandwidth() {
        return this.ElasticProtectBandwidth;
    }

    /**
     * Set 弹性带宽 Gbps，可选择的弹性带宽[0,400,500,600,800,1000]
默认为0
     * @param ElasticProtectBandwidth 弹性带宽 Gbps，可选择的弹性带宽[0,400,500,600,800,1000]
默认为0
     */
    public void setElasticProtectBandwidth(Long ElasticProtectBandwidth) {
        this.ElasticProtectBandwidth = ElasticProtectBandwidth;
    }

    /**
     * Get 是否开启弹性业务带宽
默认为false 
     * @return ElasticBandwidthFlag 是否开启弹性业务带宽
默认为false
     */
    public Boolean getElasticBandwidthFlag() {
        return this.ElasticBandwidthFlag;
    }

    /**
     * Set 是否开启弹性业务带宽
默认为false
     * @param ElasticBandwidthFlag 是否开启弹性业务带宽
默认为false
     */
    public void setElasticBandwidthFlag(Boolean ElasticBandwidthFlag) {
        this.ElasticBandwidthFlag = ElasticBandwidthFlag;
    }

    public EnterprisePackageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterprisePackageConfig(EnterprisePackageConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectIpCount != null) {
            this.ProtectIpCount = new Long(source.ProtectIpCount);
        }
        if (source.BasicProtectBandwidth != null) {
            this.BasicProtectBandwidth = new Long(source.BasicProtectBandwidth);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ElasticProtectBandwidth != null) {
            this.ElasticProtectBandwidth = new Long(source.ElasticProtectBandwidth);
        }
        if (source.ElasticBandwidthFlag != null) {
            this.ElasticBandwidthFlag = new Boolean(source.ElasticBandwidthFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProtectIpCount", this.ProtectIpCount);
        this.setParamSimple(map, prefix + "BasicProtectBandwidth", this.BasicProtectBandwidth);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ElasticProtectBandwidth", this.ElasticProtectBandwidth);
        this.setParamSimple(map, prefix + "ElasticBandwidthFlag", this.ElasticBandwidthFlag);

    }
}

