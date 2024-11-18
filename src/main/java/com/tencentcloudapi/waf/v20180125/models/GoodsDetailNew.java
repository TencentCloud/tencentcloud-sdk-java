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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsDetailNew extends AbstractModel {

    /**
    * 时间间隔
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 单位，支持购买d、m、y 即（日、月、年）
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 子产品标签,。新购，续费必传，变配时放在oldConfig newConfig里面

Saas 高级版 ：sp_wsm_waf_premium
Saas企业版 ：sp_wsm_waf_enterprise
Saas旗舰版 ：sp_wsm_waf_ultimate
Saas 业务扩展包：sp_wsm_waf_qpsep
Saas 域名扩展包：sp_wsm_waf_domain

高级版-CLB:sp_wsm_waf_premium_clb
企业版-CLB : sp_wsm_waf_enterprise_clb
旗舰版-CLB:sp_wsm_waf_ultimate_clb
 业务扩展包-CLB：sp_wsm_waf_qpsep_clb
域名扩展包-CLB：sp_wsm_waf_domain_clb

    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 业务产品申请的pid（对应一个定价公式），通过pid计费查询到定价模型
高级版 ：1000827
企业版 ：1000830
旗舰版 ：1000832
域名包 : 1000834
业务扩展包 : 1000481
高级版-CLB:1001150
企业版-CLB : 1001152
旗舰版-CLB:1001154
域名包-CLB: 1001156
业务扩展包-CLB : 1001160

    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * waf实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 1:自动续费，0:不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * waf购买的实际地域信息
    */
    @SerializedName("RealRegion")
    @Expose
    private Long RealRegion;

    /**
    * 计费细项标签数组
Saas 高级版  sv_wsm_waf_package_premium 
Saas 企业版  sv_wsm_waf_package_enterprise
Saas 旗舰版  sv_wsm_waf_package_ultimate 
Saas 非中国大陆高级版  sv_wsm_waf_package_premium_intl
Saas 非中国大陆企业版   sv_wsm_waf_package_enterprise_intl
Saas 非中国大陆旗舰版  sv_wsm_waf_package_ultimate _intl
Saas 业务扩展包  sv_wsm_waf_qps_ep
Saas 域名扩展包  sv_wsm_waf_domain

高级版CLB   sv_wsm_waf_package_premium_clb
企业版CLB  sv_wsm_waf_package_enterprise_clb
旗舰版CLB   sv_wsm_waf_package_ultimate_clb
非中国大陆高级版 CLB sv_wsm_waf_package_premium_clb_intl
非中国大陆企业版CLB   sv_wsm_waf_package_premium_clb_intl
非中国大陆旗舰版CLB  sv_wsm_waf_package_ultimate_clb _intl
业务扩展包CLB sv_wsm_waf_qps_ep_clb
域名扩展包CLB  sv_wsm_waf_domain_clb

    */
    @SerializedName("LabelTypes")
    @Expose
    private String [] LabelTypes;

    /**
    * 计费细项标签数量，一般和SvLabelType一一对应
    */
    @SerializedName("LabelCounts")
    @Expose
    private Long [] LabelCounts;

    /**
    * 变配使用，实例到期时间
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * 对存在的实例购买bot 或api 安全
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 模式clb-waf或者saas-waf
    */
    @SerializedName("MicroVersion")
    @Expose
    private String MicroVersion;

    /**
     * Get 时间间隔 
     * @return TimeSpan 时间间隔
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间间隔
     * @param TimeSpan 时间间隔
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 单位，支持购买d、m、y 即（日、月、年） 
     * @return TimeUnit 单位，支持购买d、m、y 即（日、月、年）
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 单位，支持购买d、m、y 即（日、月、年）
     * @param TimeUnit 单位，支持购买d、m、y 即（日、月、年）
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 子产品标签,。新购，续费必传，变配时放在oldConfig newConfig里面

Saas 高级版 ：sp_wsm_waf_premium
Saas企业版 ：sp_wsm_waf_enterprise
Saas旗舰版 ：sp_wsm_waf_ultimate
Saas 业务扩展包：sp_wsm_waf_qpsep
Saas 域名扩展包：sp_wsm_waf_domain

高级版-CLB:sp_wsm_waf_premium_clb
企业版-CLB : sp_wsm_waf_enterprise_clb
旗舰版-CLB:sp_wsm_waf_ultimate_clb
 业务扩展包-CLB：sp_wsm_waf_qpsep_clb
域名扩展包-CLB：sp_wsm_waf_domain_clb
 
     * @return SubProductCode 子产品标签,。新购，续费必传，变配时放在oldConfig newConfig里面

Saas 高级版 ：sp_wsm_waf_premium
Saas企业版 ：sp_wsm_waf_enterprise
Saas旗舰版 ：sp_wsm_waf_ultimate
Saas 业务扩展包：sp_wsm_waf_qpsep
Saas 域名扩展包：sp_wsm_waf_domain

高级版-CLB:sp_wsm_waf_premium_clb
企业版-CLB : sp_wsm_waf_enterprise_clb
旗舰版-CLB:sp_wsm_waf_ultimate_clb
 业务扩展包-CLB：sp_wsm_waf_qpsep_clb
域名扩展包-CLB：sp_wsm_waf_domain_clb

     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品标签,。新购，续费必传，变配时放在oldConfig newConfig里面

Saas 高级版 ：sp_wsm_waf_premium
Saas企业版 ：sp_wsm_waf_enterprise
Saas旗舰版 ：sp_wsm_waf_ultimate
Saas 业务扩展包：sp_wsm_waf_qpsep
Saas 域名扩展包：sp_wsm_waf_domain

高级版-CLB:sp_wsm_waf_premium_clb
企业版-CLB : sp_wsm_waf_enterprise_clb
旗舰版-CLB:sp_wsm_waf_ultimate_clb
 业务扩展包-CLB：sp_wsm_waf_qpsep_clb
域名扩展包-CLB：sp_wsm_waf_domain_clb

     * @param SubProductCode 子产品标签,。新购，续费必传，变配时放在oldConfig newConfig里面

Saas 高级版 ：sp_wsm_waf_premium
Saas企业版 ：sp_wsm_waf_enterprise
Saas旗舰版 ：sp_wsm_waf_ultimate
Saas 业务扩展包：sp_wsm_waf_qpsep
Saas 域名扩展包：sp_wsm_waf_domain

高级版-CLB:sp_wsm_waf_premium_clb
企业版-CLB : sp_wsm_waf_enterprise_clb
旗舰版-CLB:sp_wsm_waf_ultimate_clb
 业务扩展包-CLB：sp_wsm_waf_qpsep_clb
域名扩展包-CLB：sp_wsm_waf_domain_clb

     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 业务产品申请的pid（对应一个定价公式），通过pid计费查询到定价模型
高级版 ：1000827
企业版 ：1000830
旗舰版 ：1000832
域名包 : 1000834
业务扩展包 : 1000481
高级版-CLB:1001150
企业版-CLB : 1001152
旗舰版-CLB:1001154
域名包-CLB: 1001156
业务扩展包-CLB : 1001160
 
     * @return Pid 业务产品申请的pid（对应一个定价公式），通过pid计费查询到定价模型
高级版 ：1000827
企业版 ：1000830
旗舰版 ：1000832
域名包 : 1000834
业务扩展包 : 1000481
高级版-CLB:1001150
企业版-CLB : 1001152
旗舰版-CLB:1001154
域名包-CLB: 1001156
业务扩展包-CLB : 1001160

     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 业务产品申请的pid（对应一个定价公式），通过pid计费查询到定价模型
高级版 ：1000827
企业版 ：1000830
旗舰版 ：1000832
域名包 : 1000834
业务扩展包 : 1000481
高级版-CLB:1001150
企业版-CLB : 1001152
旗舰版-CLB:1001154
域名包-CLB: 1001156
业务扩展包-CLB : 1001160

     * @param Pid 业务产品申请的pid（对应一个定价公式），通过pid计费查询到定价模型
高级版 ：1000827
企业版 ：1000830
旗舰版 ：1000832
域名包 : 1000834
业务扩展包 : 1000481
高级版-CLB:1001150
企业版-CLB : 1001152
旗舰版-CLB:1001154
域名包-CLB: 1001156
业务扩展包-CLB : 1001160

     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get waf实例名 
     * @return InstanceName waf实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set waf实例名
     * @param InstanceName waf实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 1:自动续费，0:不自动续费 
     * @return AutoRenewFlag 1:自动续费，0:不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 1:自动续费，0:不自动续费
     * @param AutoRenewFlag 1:自动续费，0:不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get waf购买的实际地域信息 
     * @return RealRegion waf购买的实际地域信息
     */
    public Long getRealRegion() {
        return this.RealRegion;
    }

    /**
     * Set waf购买的实际地域信息
     * @param RealRegion waf购买的实际地域信息
     */
    public void setRealRegion(Long RealRegion) {
        this.RealRegion = RealRegion;
    }

    /**
     * Get 计费细项标签数组
Saas 高级版  sv_wsm_waf_package_premium 
Saas 企业版  sv_wsm_waf_package_enterprise
Saas 旗舰版  sv_wsm_waf_package_ultimate 
Saas 非中国大陆高级版  sv_wsm_waf_package_premium_intl
Saas 非中国大陆企业版   sv_wsm_waf_package_enterprise_intl
Saas 非中国大陆旗舰版  sv_wsm_waf_package_ultimate _intl
Saas 业务扩展包  sv_wsm_waf_qps_ep
Saas 域名扩展包  sv_wsm_waf_domain

高级版CLB   sv_wsm_waf_package_premium_clb
企业版CLB  sv_wsm_waf_package_enterprise_clb
旗舰版CLB   sv_wsm_waf_package_ultimate_clb
非中国大陆高级版 CLB sv_wsm_waf_package_premium_clb_intl
非中国大陆企业版CLB   sv_wsm_waf_package_premium_clb_intl
非中国大陆旗舰版CLB  sv_wsm_waf_package_ultimate_clb _intl
业务扩展包CLB sv_wsm_waf_qps_ep_clb
域名扩展包CLB  sv_wsm_waf_domain_clb
 
     * @return LabelTypes 计费细项标签数组
Saas 高级版  sv_wsm_waf_package_premium 
Saas 企业版  sv_wsm_waf_package_enterprise
Saas 旗舰版  sv_wsm_waf_package_ultimate 
Saas 非中国大陆高级版  sv_wsm_waf_package_premium_intl
Saas 非中国大陆企业版   sv_wsm_waf_package_enterprise_intl
Saas 非中国大陆旗舰版  sv_wsm_waf_package_ultimate _intl
Saas 业务扩展包  sv_wsm_waf_qps_ep
Saas 域名扩展包  sv_wsm_waf_domain

高级版CLB   sv_wsm_waf_package_premium_clb
企业版CLB  sv_wsm_waf_package_enterprise_clb
旗舰版CLB   sv_wsm_waf_package_ultimate_clb
非中国大陆高级版 CLB sv_wsm_waf_package_premium_clb_intl
非中国大陆企业版CLB   sv_wsm_waf_package_premium_clb_intl
非中国大陆旗舰版CLB  sv_wsm_waf_package_ultimate_clb _intl
业务扩展包CLB sv_wsm_waf_qps_ep_clb
域名扩展包CLB  sv_wsm_waf_domain_clb

     */
    public String [] getLabelTypes() {
        return this.LabelTypes;
    }

    /**
     * Set 计费细项标签数组
Saas 高级版  sv_wsm_waf_package_premium 
Saas 企业版  sv_wsm_waf_package_enterprise
Saas 旗舰版  sv_wsm_waf_package_ultimate 
Saas 非中国大陆高级版  sv_wsm_waf_package_premium_intl
Saas 非中国大陆企业版   sv_wsm_waf_package_enterprise_intl
Saas 非中国大陆旗舰版  sv_wsm_waf_package_ultimate _intl
Saas 业务扩展包  sv_wsm_waf_qps_ep
Saas 域名扩展包  sv_wsm_waf_domain

高级版CLB   sv_wsm_waf_package_premium_clb
企业版CLB  sv_wsm_waf_package_enterprise_clb
旗舰版CLB   sv_wsm_waf_package_ultimate_clb
非中国大陆高级版 CLB sv_wsm_waf_package_premium_clb_intl
非中国大陆企业版CLB   sv_wsm_waf_package_premium_clb_intl
非中国大陆旗舰版CLB  sv_wsm_waf_package_ultimate_clb _intl
业务扩展包CLB sv_wsm_waf_qps_ep_clb
域名扩展包CLB  sv_wsm_waf_domain_clb

     * @param LabelTypes 计费细项标签数组
Saas 高级版  sv_wsm_waf_package_premium 
Saas 企业版  sv_wsm_waf_package_enterprise
Saas 旗舰版  sv_wsm_waf_package_ultimate 
Saas 非中国大陆高级版  sv_wsm_waf_package_premium_intl
Saas 非中国大陆企业版   sv_wsm_waf_package_enterprise_intl
Saas 非中国大陆旗舰版  sv_wsm_waf_package_ultimate _intl
Saas 业务扩展包  sv_wsm_waf_qps_ep
Saas 域名扩展包  sv_wsm_waf_domain

高级版CLB   sv_wsm_waf_package_premium_clb
企业版CLB  sv_wsm_waf_package_enterprise_clb
旗舰版CLB   sv_wsm_waf_package_ultimate_clb
非中国大陆高级版 CLB sv_wsm_waf_package_premium_clb_intl
非中国大陆企业版CLB   sv_wsm_waf_package_premium_clb_intl
非中国大陆旗舰版CLB  sv_wsm_waf_package_ultimate_clb _intl
业务扩展包CLB sv_wsm_waf_qps_ep_clb
域名扩展包CLB  sv_wsm_waf_domain_clb

     */
    public void setLabelTypes(String [] LabelTypes) {
        this.LabelTypes = LabelTypes;
    }

    /**
     * Get 计费细项标签数量，一般和SvLabelType一一对应 
     * @return LabelCounts 计费细项标签数量，一般和SvLabelType一一对应
     */
    public Long [] getLabelCounts() {
        return this.LabelCounts;
    }

    /**
     * Set 计费细项标签数量，一般和SvLabelType一一对应
     * @param LabelCounts 计费细项标签数量，一般和SvLabelType一一对应
     */
    public void setLabelCounts(Long [] LabelCounts) {
        this.LabelCounts = LabelCounts;
    }

    /**
     * Get 变配使用，实例到期时间 
     * @return CurDeadline 变配使用，实例到期时间
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 变配使用，实例到期时间
     * @param CurDeadline 变配使用，实例到期时间
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get 对存在的实例购买bot 或api 安全 
     * @return InstanceId 对存在的实例购买bot 或api 安全
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 对存在的实例购买bot 或api 安全
     * @param InstanceId 对存在的实例购买bot 或api 安全
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 模式clb-waf或者saas-waf 
     * @return MicroVersion 模式clb-waf或者saas-waf
     */
    public String getMicroVersion() {
        return this.MicroVersion;
    }

    /**
     * Set 模式clb-waf或者saas-waf
     * @param MicroVersion 模式clb-waf或者saas-waf
     */
    public void setMicroVersion(String MicroVersion) {
        this.MicroVersion = MicroVersion;
    }

    public GoodsDetailNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsDetailNew(GoodsDetailNew source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RealRegion != null) {
            this.RealRegion = new Long(source.RealRegion);
        }
        if (source.LabelTypes != null) {
            this.LabelTypes = new String[source.LabelTypes.length];
            for (int i = 0; i < source.LabelTypes.length; i++) {
                this.LabelTypes[i] = new String(source.LabelTypes[i]);
            }
        }
        if (source.LabelCounts != null) {
            this.LabelCounts = new Long[source.LabelCounts.length];
            for (int i = 0; i < source.LabelCounts.length; i++) {
                this.LabelCounts[i] = new Long(source.LabelCounts[i]);
            }
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MicroVersion != null) {
            this.MicroVersion = new String(source.MicroVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RealRegion", this.RealRegion);
        this.setParamArraySimple(map, prefix + "LabelTypes.", this.LabelTypes);
        this.setParamArraySimple(map, prefix + "LabelCounts.", this.LabelCounts);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "MicroVersion", this.MicroVersion);

    }
}

