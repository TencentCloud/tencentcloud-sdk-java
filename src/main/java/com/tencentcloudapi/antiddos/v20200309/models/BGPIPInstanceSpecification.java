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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstanceSpecification extends AbstractModel{

    /**
    * 保底防护峰值，单位Mbps
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * CC防护峰值，单位qps
    */
    @SerializedName("ProtectCCQPS")
    @Expose
    private Long ProtectCCQPS;

    /**
    * 正常业务带宽，单位Mbps
    */
    @SerializedName("NormalBandwidth")
    @Expose
    private Long NormalBandwidth;

    /**
    * 转发规则数，单位条
    */
    @SerializedName("ForwardRulesLimit")
    @Expose
    private Long ForwardRulesLimit;

    /**
    * 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 高防IP线路，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * 弹性防护峰值，单位Mbps
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
     * Get 保底防护峰值，单位Mbps 
     * @return ProtectBandwidth 保底防护峰值，单位Mbps
     */
    public Long getProtectBandwidth() {
        return this.ProtectBandwidth;
    }

    /**
     * Set 保底防护峰值，单位Mbps
     * @param ProtectBandwidth 保底防护峰值，单位Mbps
     */
    public void setProtectBandwidth(Long ProtectBandwidth) {
        this.ProtectBandwidth = ProtectBandwidth;
    }

    /**
     * Get CC防护峰值，单位qps 
     * @return ProtectCCQPS CC防护峰值，单位qps
     */
    public Long getProtectCCQPS() {
        return this.ProtectCCQPS;
    }

    /**
     * Set CC防护峰值，单位qps
     * @param ProtectCCQPS CC防护峰值，单位qps
     */
    public void setProtectCCQPS(Long ProtectCCQPS) {
        this.ProtectCCQPS = ProtectCCQPS;
    }

    /**
     * Get 正常业务带宽，单位Mbps 
     * @return NormalBandwidth 正常业务带宽，单位Mbps
     */
    public Long getNormalBandwidth() {
        return this.NormalBandwidth;
    }

    /**
     * Set 正常业务带宽，单位Mbps
     * @param NormalBandwidth 正常业务带宽，单位Mbps
     */
    public void setNormalBandwidth(Long NormalBandwidth) {
        this.NormalBandwidth = NormalBandwidth;
    }

    /**
     * Get 转发规则数，单位条 
     * @return ForwardRulesLimit 转发规则数，单位条
     */
    public Long getForwardRulesLimit() {
        return this.ForwardRulesLimit;
    }

    /**
     * Set 转发规则数，单位条
     * @param ForwardRulesLimit 转发规则数，单位条
     */
    public void setForwardRulesLimit(Long ForwardRulesLimit) {
        this.ForwardRulesLimit = ForwardRulesLimit;
    }

    /**
     * Get 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
] 
     * @return AutoRenewFlag 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     * @param AutoRenewFlag 自动续费状态，取值[
0：没有开启自动续费
1：开启了自动续费
]
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 高防IP线路，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
] 
     * @return Line 高防IP线路，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set 高防IP线路，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     * @param Line 高防IP线路，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get 弹性防护峰值，单位Mbps 
     * @return ElasticBandwidth 弹性防护峰值，单位Mbps
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set 弹性防护峰值，单位Mbps
     * @param ElasticBandwidth 弹性防护峰值，单位Mbps
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    public BGPIPInstanceSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstanceSpecification(BGPIPInstanceSpecification source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
        if (source.ProtectCCQPS != null) {
            this.ProtectCCQPS = new Long(source.ProtectCCQPS);
        }
        if (source.NormalBandwidth != null) {
            this.NormalBandwidth = new Long(source.NormalBandwidth);
        }
        if (source.ForwardRulesLimit != null) {
            this.ForwardRulesLimit = new Long(source.ForwardRulesLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "ProtectCCQPS", this.ProtectCCQPS);
        this.setParamSimple(map, prefix + "NormalBandwidth", this.NormalBandwidth);
        this.setParamSimple(map, prefix + "ForwardRulesLimit", this.ForwardRulesLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);

    }
}

