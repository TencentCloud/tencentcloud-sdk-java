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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewQuotaDetail extends AbstractModel {

    /**
    * <p>已使用公网 IP 数量。</p>
    */
    @SerializedName("PublicIpUsed")
    @Expose
    private Long PublicIpUsed;

    /**
    * <p>公网 IP 总配额数量。</p>
    */
    @SerializedName("PublicIpTotal")
    @Expose
    private Long PublicIpTotal;

    /**
    * <p>通用实例总配额数量。</p>
    */
    @SerializedName("CommonInstanceTotal")
    @Expose
    private Long CommonInstanceTotal;

    /**
    * <p>通用实例剩余配额数量。</p>
    */
    @SerializedName("CommonInstanceRemain")
    @Expose
    private Long CommonInstanceRemain;

    /**
    * <p>通用实例已使用数量。</p>
    */
    @SerializedName("CommonInstanceUsed")
    @Expose
    private Long CommonInstanceUsed;

    /**
    * <p>访问控制规则已使用数量。</p>
    */
    @SerializedName("AccessControlRuleUsed")
    @Expose
    private Long AccessControlRuleUsed;

    /**
    * <p>访问控制规则总配额数量。</p>
    */
    @SerializedName("AccessControlRuleTotal")
    @Expose
    private Long AccessControlRuleTotal;

    /**
    * <p>已使用串行地域数量。</p>
    */
    @SerializedName("SerialRegionUsed")
    @Expose
    private Long SerialRegionUsed;

    /**
    * <p>已使用 NAT 防火墙实例数量。</p>
    */
    @SerializedName("NatInstanceUsed")
    @Expose
    private Long NatInstanceUsed;

    /**
    * <p>已使用 VPC 防火墙实例数量。</p>
    */
    @SerializedName("VpcInstanceUsed")
    @Expose
    private Long VpcInstanceUsed;

    /**
    * <p>边界规则配额详情。</p>
    */
    @SerializedName("BorderRuleQuota")
    @Expose
    private OverviewCommonRuleQuotaDetail BorderRuleQuota;

    /**
    * <p>NAT 规则配额详情。</p>
    */
    @SerializedName("NatRuleQuota")
    @Expose
    private OverviewCommonRuleQuotaDetail NatRuleQuota;

    /**
    * <p>VPC 规则配额详情。</p>
    */
    @SerializedName("VpcRuleQuota")
    @Expose
    private OverviewVpcRuleQuotaDetail VpcRuleQuota;

    /**
    * <p>封禁列表配额统计信息。</p>
    */
    @SerializedName("BlockListQuota")
    @Expose
    private OverviewBlockListQuota BlockListQuota;

    /**
    * <p>封禁 IP 总数量。</p>
    */
    @SerializedName("BlockIpCount")
    @Expose
    private Long BlockIpCount;

    /**
    * <p>已使用封禁 IP 数量。</p>
    */
    @SerializedName("BlockIpUsed")
    @Expose
    private Long BlockIpUsed;

    /**
    * <p>封禁 IP 总配额数量。</p>
    */
    @SerializedName("BlockIpTotal")
    @Expose
    private Long BlockIpTotal;

    /**
    * <p>封禁列表基础包与扩容包配额详情。</p>
    */
    @SerializedName("BlockListQuotaDetail")
    @Expose
    private OverviewBlockListQuotaDetail BlockListQuotaDetail;

    /**
    * <p>安全组规则已使用数量。</p>
    */
    @SerializedName("SgRuleQuotaUsed")
    @Expose
    private Long SgRuleQuotaUsed;

    /**
    * <p>安全组规则总配额数量。</p>
    */
    @SerializedName("SgRuleQuotaTotal")
    @Expose
    private Long SgRuleQuotaTotal;

    /**
    * <p>总扩容资源已使用数量。</p>
    */
    @SerializedName("TotalExtensionUsed")
    @Expose
    private Long TotalExtensionUsed;

    /**
    * <p>总扩容资源配额数量。</p>
    */
    @SerializedName("TotalExtensionNum")
    @Expose
    private Long TotalExtensionNum;

    /**
    * <p>地址模板已使用数量。</p>
    */
    @SerializedName("AddressTemplateUsed")
    @Expose
    private Long AddressTemplateUsed;

    /**
    * <p>地址模板总配额数量。</p>
    */
    @SerializedName("AddressTemplateTotal")
    @Expose
    private Long AddressTemplateTotal;

    /**
    * <p>蜜罐已使用数量。</p>
    */
    @SerializedName("HoneyPotUsed")
    @Expose
    private Long HoneyPotUsed;

    /**
    * <p>蜜罐总配额数量。</p>
    */
    @SerializedName("HoneyPotTotal")
    @Expose
    private Long HoneyPotTotal;

    /**
     * Get <p>已使用公网 IP 数量。</p> 
     * @return PublicIpUsed <p>已使用公网 IP 数量。</p>
     */
    public Long getPublicIpUsed() {
        return this.PublicIpUsed;
    }

    /**
     * Set <p>已使用公网 IP 数量。</p>
     * @param PublicIpUsed <p>已使用公网 IP 数量。</p>
     */
    public void setPublicIpUsed(Long PublicIpUsed) {
        this.PublicIpUsed = PublicIpUsed;
    }

    /**
     * Get <p>公网 IP 总配额数量。</p> 
     * @return PublicIpTotal <p>公网 IP 总配额数量。</p>
     */
    public Long getPublicIpTotal() {
        return this.PublicIpTotal;
    }

    /**
     * Set <p>公网 IP 总配额数量。</p>
     * @param PublicIpTotal <p>公网 IP 总配额数量。</p>
     */
    public void setPublicIpTotal(Long PublicIpTotal) {
        this.PublicIpTotal = PublicIpTotal;
    }

    /**
     * Get <p>通用实例总配额数量。</p> 
     * @return CommonInstanceTotal <p>通用实例总配额数量。</p>
     */
    public Long getCommonInstanceTotal() {
        return this.CommonInstanceTotal;
    }

    /**
     * Set <p>通用实例总配额数量。</p>
     * @param CommonInstanceTotal <p>通用实例总配额数量。</p>
     */
    public void setCommonInstanceTotal(Long CommonInstanceTotal) {
        this.CommonInstanceTotal = CommonInstanceTotal;
    }

    /**
     * Get <p>通用实例剩余配额数量。</p> 
     * @return CommonInstanceRemain <p>通用实例剩余配额数量。</p>
     */
    public Long getCommonInstanceRemain() {
        return this.CommonInstanceRemain;
    }

    /**
     * Set <p>通用实例剩余配额数量。</p>
     * @param CommonInstanceRemain <p>通用实例剩余配额数量。</p>
     */
    public void setCommonInstanceRemain(Long CommonInstanceRemain) {
        this.CommonInstanceRemain = CommonInstanceRemain;
    }

    /**
     * Get <p>通用实例已使用数量。</p> 
     * @return CommonInstanceUsed <p>通用实例已使用数量。</p>
     */
    public Long getCommonInstanceUsed() {
        return this.CommonInstanceUsed;
    }

    /**
     * Set <p>通用实例已使用数量。</p>
     * @param CommonInstanceUsed <p>通用实例已使用数量。</p>
     */
    public void setCommonInstanceUsed(Long CommonInstanceUsed) {
        this.CommonInstanceUsed = CommonInstanceUsed;
    }

    /**
     * Get <p>访问控制规则已使用数量。</p> 
     * @return AccessControlRuleUsed <p>访问控制规则已使用数量。</p>
     */
    public Long getAccessControlRuleUsed() {
        return this.AccessControlRuleUsed;
    }

    /**
     * Set <p>访问控制规则已使用数量。</p>
     * @param AccessControlRuleUsed <p>访问控制规则已使用数量。</p>
     */
    public void setAccessControlRuleUsed(Long AccessControlRuleUsed) {
        this.AccessControlRuleUsed = AccessControlRuleUsed;
    }

    /**
     * Get <p>访问控制规则总配额数量。</p> 
     * @return AccessControlRuleTotal <p>访问控制规则总配额数量。</p>
     */
    public Long getAccessControlRuleTotal() {
        return this.AccessControlRuleTotal;
    }

    /**
     * Set <p>访问控制规则总配额数量。</p>
     * @param AccessControlRuleTotal <p>访问控制规则总配额数量。</p>
     */
    public void setAccessControlRuleTotal(Long AccessControlRuleTotal) {
        this.AccessControlRuleTotal = AccessControlRuleTotal;
    }

    /**
     * Get <p>已使用串行地域数量。</p> 
     * @return SerialRegionUsed <p>已使用串行地域数量。</p>
     */
    public Long getSerialRegionUsed() {
        return this.SerialRegionUsed;
    }

    /**
     * Set <p>已使用串行地域数量。</p>
     * @param SerialRegionUsed <p>已使用串行地域数量。</p>
     */
    public void setSerialRegionUsed(Long SerialRegionUsed) {
        this.SerialRegionUsed = SerialRegionUsed;
    }

    /**
     * Get <p>已使用 NAT 防火墙实例数量。</p> 
     * @return NatInstanceUsed <p>已使用 NAT 防火墙实例数量。</p>
     */
    public Long getNatInstanceUsed() {
        return this.NatInstanceUsed;
    }

    /**
     * Set <p>已使用 NAT 防火墙实例数量。</p>
     * @param NatInstanceUsed <p>已使用 NAT 防火墙实例数量。</p>
     */
    public void setNatInstanceUsed(Long NatInstanceUsed) {
        this.NatInstanceUsed = NatInstanceUsed;
    }

    /**
     * Get <p>已使用 VPC 防火墙实例数量。</p> 
     * @return VpcInstanceUsed <p>已使用 VPC 防火墙实例数量。</p>
     */
    public Long getVpcInstanceUsed() {
        return this.VpcInstanceUsed;
    }

    /**
     * Set <p>已使用 VPC 防火墙实例数量。</p>
     * @param VpcInstanceUsed <p>已使用 VPC 防火墙实例数量。</p>
     */
    public void setVpcInstanceUsed(Long VpcInstanceUsed) {
        this.VpcInstanceUsed = VpcInstanceUsed;
    }

    /**
     * Get <p>边界规则配额详情。</p> 
     * @return BorderRuleQuota <p>边界规则配额详情。</p>
     */
    public OverviewCommonRuleQuotaDetail getBorderRuleQuota() {
        return this.BorderRuleQuota;
    }

    /**
     * Set <p>边界规则配额详情。</p>
     * @param BorderRuleQuota <p>边界规则配额详情。</p>
     */
    public void setBorderRuleQuota(OverviewCommonRuleQuotaDetail BorderRuleQuota) {
        this.BorderRuleQuota = BorderRuleQuota;
    }

    /**
     * Get <p>NAT 规则配额详情。</p> 
     * @return NatRuleQuota <p>NAT 规则配额详情。</p>
     */
    public OverviewCommonRuleQuotaDetail getNatRuleQuota() {
        return this.NatRuleQuota;
    }

    /**
     * Set <p>NAT 规则配额详情。</p>
     * @param NatRuleQuota <p>NAT 规则配额详情。</p>
     */
    public void setNatRuleQuota(OverviewCommonRuleQuotaDetail NatRuleQuota) {
        this.NatRuleQuota = NatRuleQuota;
    }

    /**
     * Get <p>VPC 规则配额详情。</p> 
     * @return VpcRuleQuota <p>VPC 规则配额详情。</p>
     */
    public OverviewVpcRuleQuotaDetail getVpcRuleQuota() {
        return this.VpcRuleQuota;
    }

    /**
     * Set <p>VPC 规则配额详情。</p>
     * @param VpcRuleQuota <p>VPC 规则配额详情。</p>
     */
    public void setVpcRuleQuota(OverviewVpcRuleQuotaDetail VpcRuleQuota) {
        this.VpcRuleQuota = VpcRuleQuota;
    }

    /**
     * Get <p>封禁列表配额统计信息。</p> 
     * @return BlockListQuota <p>封禁列表配额统计信息。</p>
     */
    public OverviewBlockListQuota getBlockListQuota() {
        return this.BlockListQuota;
    }

    /**
     * Set <p>封禁列表配额统计信息。</p>
     * @param BlockListQuota <p>封禁列表配额统计信息。</p>
     */
    public void setBlockListQuota(OverviewBlockListQuota BlockListQuota) {
        this.BlockListQuota = BlockListQuota;
    }

    /**
     * Get <p>封禁 IP 总数量。</p> 
     * @return BlockIpCount <p>封禁 IP 总数量。</p>
     */
    public Long getBlockIpCount() {
        return this.BlockIpCount;
    }

    /**
     * Set <p>封禁 IP 总数量。</p>
     * @param BlockIpCount <p>封禁 IP 总数量。</p>
     */
    public void setBlockIpCount(Long BlockIpCount) {
        this.BlockIpCount = BlockIpCount;
    }

    /**
     * Get <p>已使用封禁 IP 数量。</p> 
     * @return BlockIpUsed <p>已使用封禁 IP 数量。</p>
     */
    public Long getBlockIpUsed() {
        return this.BlockIpUsed;
    }

    /**
     * Set <p>已使用封禁 IP 数量。</p>
     * @param BlockIpUsed <p>已使用封禁 IP 数量。</p>
     */
    public void setBlockIpUsed(Long BlockIpUsed) {
        this.BlockIpUsed = BlockIpUsed;
    }

    /**
     * Get <p>封禁 IP 总配额数量。</p> 
     * @return BlockIpTotal <p>封禁 IP 总配额数量。</p>
     */
    public Long getBlockIpTotal() {
        return this.BlockIpTotal;
    }

    /**
     * Set <p>封禁 IP 总配额数量。</p>
     * @param BlockIpTotal <p>封禁 IP 总配额数量。</p>
     */
    public void setBlockIpTotal(Long BlockIpTotal) {
        this.BlockIpTotal = BlockIpTotal;
    }

    /**
     * Get <p>封禁列表基础包与扩容包配额详情。</p> 
     * @return BlockListQuotaDetail <p>封禁列表基础包与扩容包配额详情。</p>
     */
    public OverviewBlockListQuotaDetail getBlockListQuotaDetail() {
        return this.BlockListQuotaDetail;
    }

    /**
     * Set <p>封禁列表基础包与扩容包配额详情。</p>
     * @param BlockListQuotaDetail <p>封禁列表基础包与扩容包配额详情。</p>
     */
    public void setBlockListQuotaDetail(OverviewBlockListQuotaDetail BlockListQuotaDetail) {
        this.BlockListQuotaDetail = BlockListQuotaDetail;
    }

    /**
     * Get <p>安全组规则已使用数量。</p> 
     * @return SgRuleQuotaUsed <p>安全组规则已使用数量。</p>
     */
    public Long getSgRuleQuotaUsed() {
        return this.SgRuleQuotaUsed;
    }

    /**
     * Set <p>安全组规则已使用数量。</p>
     * @param SgRuleQuotaUsed <p>安全组规则已使用数量。</p>
     */
    public void setSgRuleQuotaUsed(Long SgRuleQuotaUsed) {
        this.SgRuleQuotaUsed = SgRuleQuotaUsed;
    }

    /**
     * Get <p>安全组规则总配额数量。</p> 
     * @return SgRuleQuotaTotal <p>安全组规则总配额数量。</p>
     */
    public Long getSgRuleQuotaTotal() {
        return this.SgRuleQuotaTotal;
    }

    /**
     * Set <p>安全组规则总配额数量。</p>
     * @param SgRuleQuotaTotal <p>安全组规则总配额数量。</p>
     */
    public void setSgRuleQuotaTotal(Long SgRuleQuotaTotal) {
        this.SgRuleQuotaTotal = SgRuleQuotaTotal;
    }

    /**
     * Get <p>总扩容资源已使用数量。</p> 
     * @return TotalExtensionUsed <p>总扩容资源已使用数量。</p>
     */
    public Long getTotalExtensionUsed() {
        return this.TotalExtensionUsed;
    }

    /**
     * Set <p>总扩容资源已使用数量。</p>
     * @param TotalExtensionUsed <p>总扩容资源已使用数量。</p>
     */
    public void setTotalExtensionUsed(Long TotalExtensionUsed) {
        this.TotalExtensionUsed = TotalExtensionUsed;
    }

    /**
     * Get <p>总扩容资源配额数量。</p> 
     * @return TotalExtensionNum <p>总扩容资源配额数量。</p>
     */
    public Long getTotalExtensionNum() {
        return this.TotalExtensionNum;
    }

    /**
     * Set <p>总扩容资源配额数量。</p>
     * @param TotalExtensionNum <p>总扩容资源配额数量。</p>
     */
    public void setTotalExtensionNum(Long TotalExtensionNum) {
        this.TotalExtensionNum = TotalExtensionNum;
    }

    /**
     * Get <p>地址模板已使用数量。</p> 
     * @return AddressTemplateUsed <p>地址模板已使用数量。</p>
     */
    public Long getAddressTemplateUsed() {
        return this.AddressTemplateUsed;
    }

    /**
     * Set <p>地址模板已使用数量。</p>
     * @param AddressTemplateUsed <p>地址模板已使用数量。</p>
     */
    public void setAddressTemplateUsed(Long AddressTemplateUsed) {
        this.AddressTemplateUsed = AddressTemplateUsed;
    }

    /**
     * Get <p>地址模板总配额数量。</p> 
     * @return AddressTemplateTotal <p>地址模板总配额数量。</p>
     */
    public Long getAddressTemplateTotal() {
        return this.AddressTemplateTotal;
    }

    /**
     * Set <p>地址模板总配额数量。</p>
     * @param AddressTemplateTotal <p>地址模板总配额数量。</p>
     */
    public void setAddressTemplateTotal(Long AddressTemplateTotal) {
        this.AddressTemplateTotal = AddressTemplateTotal;
    }

    /**
     * Get <p>蜜罐已使用数量。</p> 
     * @return HoneyPotUsed <p>蜜罐已使用数量。</p>
     */
    public Long getHoneyPotUsed() {
        return this.HoneyPotUsed;
    }

    /**
     * Set <p>蜜罐已使用数量。</p>
     * @param HoneyPotUsed <p>蜜罐已使用数量。</p>
     */
    public void setHoneyPotUsed(Long HoneyPotUsed) {
        this.HoneyPotUsed = HoneyPotUsed;
    }

    /**
     * Get <p>蜜罐总配额数量。</p> 
     * @return HoneyPotTotal <p>蜜罐总配额数量。</p>
     */
    public Long getHoneyPotTotal() {
        return this.HoneyPotTotal;
    }

    /**
     * Set <p>蜜罐总配额数量。</p>
     * @param HoneyPotTotal <p>蜜罐总配额数量。</p>
     */
    public void setHoneyPotTotal(Long HoneyPotTotal) {
        this.HoneyPotTotal = HoneyPotTotal;
    }

    public OverviewQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewQuotaDetail(OverviewQuotaDetail source) {
        if (source.PublicIpUsed != null) {
            this.PublicIpUsed = new Long(source.PublicIpUsed);
        }
        if (source.PublicIpTotal != null) {
            this.PublicIpTotal = new Long(source.PublicIpTotal);
        }
        if (source.CommonInstanceTotal != null) {
            this.CommonInstanceTotal = new Long(source.CommonInstanceTotal);
        }
        if (source.CommonInstanceRemain != null) {
            this.CommonInstanceRemain = new Long(source.CommonInstanceRemain);
        }
        if (source.CommonInstanceUsed != null) {
            this.CommonInstanceUsed = new Long(source.CommonInstanceUsed);
        }
        if (source.AccessControlRuleUsed != null) {
            this.AccessControlRuleUsed = new Long(source.AccessControlRuleUsed);
        }
        if (source.AccessControlRuleTotal != null) {
            this.AccessControlRuleTotal = new Long(source.AccessControlRuleTotal);
        }
        if (source.SerialRegionUsed != null) {
            this.SerialRegionUsed = new Long(source.SerialRegionUsed);
        }
        if (source.NatInstanceUsed != null) {
            this.NatInstanceUsed = new Long(source.NatInstanceUsed);
        }
        if (source.VpcInstanceUsed != null) {
            this.VpcInstanceUsed = new Long(source.VpcInstanceUsed);
        }
        if (source.BorderRuleQuota != null) {
            this.BorderRuleQuota = new OverviewCommonRuleQuotaDetail(source.BorderRuleQuota);
        }
        if (source.NatRuleQuota != null) {
            this.NatRuleQuota = new OverviewCommonRuleQuotaDetail(source.NatRuleQuota);
        }
        if (source.VpcRuleQuota != null) {
            this.VpcRuleQuota = new OverviewVpcRuleQuotaDetail(source.VpcRuleQuota);
        }
        if (source.BlockListQuota != null) {
            this.BlockListQuota = new OverviewBlockListQuota(source.BlockListQuota);
        }
        if (source.BlockIpCount != null) {
            this.BlockIpCount = new Long(source.BlockIpCount);
        }
        if (source.BlockIpUsed != null) {
            this.BlockIpUsed = new Long(source.BlockIpUsed);
        }
        if (source.BlockIpTotal != null) {
            this.BlockIpTotal = new Long(source.BlockIpTotal);
        }
        if (source.BlockListQuotaDetail != null) {
            this.BlockListQuotaDetail = new OverviewBlockListQuotaDetail(source.BlockListQuotaDetail);
        }
        if (source.SgRuleQuotaUsed != null) {
            this.SgRuleQuotaUsed = new Long(source.SgRuleQuotaUsed);
        }
        if (source.SgRuleQuotaTotal != null) {
            this.SgRuleQuotaTotal = new Long(source.SgRuleQuotaTotal);
        }
        if (source.TotalExtensionUsed != null) {
            this.TotalExtensionUsed = new Long(source.TotalExtensionUsed);
        }
        if (source.TotalExtensionNum != null) {
            this.TotalExtensionNum = new Long(source.TotalExtensionNum);
        }
        if (source.AddressTemplateUsed != null) {
            this.AddressTemplateUsed = new Long(source.AddressTemplateUsed);
        }
        if (source.AddressTemplateTotal != null) {
            this.AddressTemplateTotal = new Long(source.AddressTemplateTotal);
        }
        if (source.HoneyPotUsed != null) {
            this.HoneyPotUsed = new Long(source.HoneyPotUsed);
        }
        if (source.HoneyPotTotal != null) {
            this.HoneyPotTotal = new Long(source.HoneyPotTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIpUsed", this.PublicIpUsed);
        this.setParamSimple(map, prefix + "PublicIpTotal", this.PublicIpTotal);
        this.setParamSimple(map, prefix + "CommonInstanceTotal", this.CommonInstanceTotal);
        this.setParamSimple(map, prefix + "CommonInstanceRemain", this.CommonInstanceRemain);
        this.setParamSimple(map, prefix + "CommonInstanceUsed", this.CommonInstanceUsed);
        this.setParamSimple(map, prefix + "AccessControlRuleUsed", this.AccessControlRuleUsed);
        this.setParamSimple(map, prefix + "AccessControlRuleTotal", this.AccessControlRuleTotal);
        this.setParamSimple(map, prefix + "SerialRegionUsed", this.SerialRegionUsed);
        this.setParamSimple(map, prefix + "NatInstanceUsed", this.NatInstanceUsed);
        this.setParamSimple(map, prefix + "VpcInstanceUsed", this.VpcInstanceUsed);
        this.setParamObj(map, prefix + "BorderRuleQuota.", this.BorderRuleQuota);
        this.setParamObj(map, prefix + "NatRuleQuota.", this.NatRuleQuota);
        this.setParamObj(map, prefix + "VpcRuleQuota.", this.VpcRuleQuota);
        this.setParamObj(map, prefix + "BlockListQuota.", this.BlockListQuota);
        this.setParamSimple(map, prefix + "BlockIpCount", this.BlockIpCount);
        this.setParamSimple(map, prefix + "BlockIpUsed", this.BlockIpUsed);
        this.setParamSimple(map, prefix + "BlockIpTotal", this.BlockIpTotal);
        this.setParamObj(map, prefix + "BlockListQuotaDetail.", this.BlockListQuotaDetail);
        this.setParamSimple(map, prefix + "SgRuleQuotaUsed", this.SgRuleQuotaUsed);
        this.setParamSimple(map, prefix + "SgRuleQuotaTotal", this.SgRuleQuotaTotal);
        this.setParamSimple(map, prefix + "TotalExtensionUsed", this.TotalExtensionUsed);
        this.setParamSimple(map, prefix + "TotalExtensionNum", this.TotalExtensionNum);
        this.setParamSimple(map, prefix + "AddressTemplateUsed", this.AddressTemplateUsed);
        this.setParamSimple(map, prefix + "AddressTemplateTotal", this.AddressTemplateTotal);
        this.setParamSimple(map, prefix + "HoneyPotUsed", this.HoneyPotUsed);
        this.setParamSimple(map, prefix + "HoneyPotTotal", this.HoneyPotTotal);

    }
}

