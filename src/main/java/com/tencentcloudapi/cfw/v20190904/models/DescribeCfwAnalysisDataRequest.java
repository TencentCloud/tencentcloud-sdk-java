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

public class DescribeCfwAnalysisDataRequest extends AbstractModel {

    /**
    * 分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
    * 查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分析对象类型。可选，默认 user；user 表示租户全局，asset 表示资产上下文，vpc 表示 VPC 上下文，domain 表示域名上下文。选择非 user 时建议同时传 ObjectId 以限定具体对象；当前未传 ObjectId 时仍按该对象类型执行宽查询。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 分析对象标识。ObjectType 为 asset、vpc 或 domain 时可传，用于限定具体 IP、实例 ID、VPC ID 或域名；当前为可选参数，省略时不会按具体对象过滤。
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 目标 IP 或域名过滤。可选，常用于 access_troubleshoot，也可用于其他 Scenario；传入后优先于 ObjectType/ObjectId，并对该场景全部分析段追加源 IP、目的 IP 或目的域名过滤。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 需要跳过的分析段名称列表。可选；不传或传空数组时执行该场景全部分析段。full_traffic 支持 beacon、dns_large、dns_dga、dns_dga_fine、dns_tunnel、icmp_tunnel、mining、p2p、remote_tool、file_transfer、high_risk_outbound、lateral_baseline、vpc_sensitive、smb_write、outbound_baseline、inbound_high_risk、tls_expired、tls_self_signed、first_seen_ip、first_seen_country、first_seen_port；east_west 支持 vpc_inter_vpc、subnet_inter、service_port、lateral_baseline、vpc_sensitive、smb_write、database_lateral；alert_comprehensive 支持 outbound_baseline、lateral_baseline、beacon、inbound_high_risk、first_seen_ip、first_seen_country、first_seen_port；asset_exposure 支持 inbound_high_risk、tls_expired、tls_self_signed、high_risk_outbound；access_troubleshoot 支持 acl_border_block、acl_nat_block、acl_vpc_block、ips_block。传入当前 Scenario 不支持的名称会返回 InvalidParameter。
    */
    @SerializedName("SkipSections")
    @Expose
    private String [] SkipSections;

    /**
     * Get 分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。 
     * @return Scenario 分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set 分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。
     * @param Scenario 分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get 查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。 
     * @return StartTime 查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。
     * @param StartTime 查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。 
     * @return EndTime 查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。
     * @param EndTime 查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分析对象类型。可选，默认 user；user 表示租户全局，asset 表示资产上下文，vpc 表示 VPC 上下文，domain 表示域名上下文。选择非 user 时建议同时传 ObjectId 以限定具体对象；当前未传 ObjectId 时仍按该对象类型执行宽查询。 
     * @return ObjectType 分析对象类型。可选，默认 user；user 表示租户全局，asset 表示资产上下文，vpc 表示 VPC 上下文，domain 表示域名上下文。选择非 user 时建议同时传 ObjectId 以限定具体对象；当前未传 ObjectId 时仍按该对象类型执行宽查询。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 分析对象类型。可选，默认 user；user 表示租户全局，asset 表示资产上下文，vpc 表示 VPC 上下文，domain 表示域名上下文。选择非 user 时建议同时传 ObjectId 以限定具体对象；当前未传 ObjectId 时仍按该对象类型执行宽查询。
     * @param ObjectType 分析对象类型。可选，默认 user；user 表示租户全局，asset 表示资产上下文，vpc 表示 VPC 上下文，domain 表示域名上下文。选择非 user 时建议同时传 ObjectId 以限定具体对象；当前未传 ObjectId 时仍按该对象类型执行宽查询。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 分析对象标识。ObjectType 为 asset、vpc 或 domain 时可传，用于限定具体 IP、实例 ID、VPC ID 或域名；当前为可选参数，省略时不会按具体对象过滤。 
     * @return ObjectId 分析对象标识。ObjectType 为 asset、vpc 或 domain 时可传，用于限定具体 IP、实例 ID、VPC ID 或域名；当前为可选参数，省略时不会按具体对象过滤。
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 分析对象标识。ObjectType 为 asset、vpc 或 domain 时可传，用于限定具体 IP、实例 ID、VPC ID 或域名；当前为可选参数，省略时不会按具体对象过滤。
     * @param ObjectId 分析对象标识。ObjectType 为 asset、vpc 或 domain 时可传，用于限定具体 IP、实例 ID、VPC ID 或域名；当前为可选参数，省略时不会按具体对象过滤。
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 目标 IP 或域名过滤。可选，常用于 access_troubleshoot，也可用于其他 Scenario；传入后优先于 ObjectType/ObjectId，并对该场景全部分析段追加源 IP、目的 IP 或目的域名过滤。 
     * @return Target 目标 IP 或域名过滤。可选，常用于 access_troubleshoot，也可用于其他 Scenario；传入后优先于 ObjectType/ObjectId，并对该场景全部分析段追加源 IP、目的 IP 或目的域名过滤。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标 IP 或域名过滤。可选，常用于 access_troubleshoot，也可用于其他 Scenario；传入后优先于 ObjectType/ObjectId，并对该场景全部分析段追加源 IP、目的 IP 或目的域名过滤。
     * @param Target 目标 IP 或域名过滤。可选，常用于 access_troubleshoot，也可用于其他 Scenario；传入后优先于 ObjectType/ObjectId，并对该场景全部分析段追加源 IP、目的 IP 或目的域名过滤。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 需要跳过的分析段名称列表。可选；不传或传空数组时执行该场景全部分析段。full_traffic 支持 beacon、dns_large、dns_dga、dns_dga_fine、dns_tunnel、icmp_tunnel、mining、p2p、remote_tool、file_transfer、high_risk_outbound、lateral_baseline、vpc_sensitive、smb_write、outbound_baseline、inbound_high_risk、tls_expired、tls_self_signed、first_seen_ip、first_seen_country、first_seen_port；east_west 支持 vpc_inter_vpc、subnet_inter、service_port、lateral_baseline、vpc_sensitive、smb_write、database_lateral；alert_comprehensive 支持 outbound_baseline、lateral_baseline、beacon、inbound_high_risk、first_seen_ip、first_seen_country、first_seen_port；asset_exposure 支持 inbound_high_risk、tls_expired、tls_self_signed、high_risk_outbound；access_troubleshoot 支持 acl_border_block、acl_nat_block、acl_vpc_block、ips_block。传入当前 Scenario 不支持的名称会返回 InvalidParameter。 
     * @return SkipSections 需要跳过的分析段名称列表。可选；不传或传空数组时执行该场景全部分析段。full_traffic 支持 beacon、dns_large、dns_dga、dns_dga_fine、dns_tunnel、icmp_tunnel、mining、p2p、remote_tool、file_transfer、high_risk_outbound、lateral_baseline、vpc_sensitive、smb_write、outbound_baseline、inbound_high_risk、tls_expired、tls_self_signed、first_seen_ip、first_seen_country、first_seen_port；east_west 支持 vpc_inter_vpc、subnet_inter、service_port、lateral_baseline、vpc_sensitive、smb_write、database_lateral；alert_comprehensive 支持 outbound_baseline、lateral_baseline、beacon、inbound_high_risk、first_seen_ip、first_seen_country、first_seen_port；asset_exposure 支持 inbound_high_risk、tls_expired、tls_self_signed、high_risk_outbound；access_troubleshoot 支持 acl_border_block、acl_nat_block、acl_vpc_block、ips_block。传入当前 Scenario 不支持的名称会返回 InvalidParameter。
     */
    public String [] getSkipSections() {
        return this.SkipSections;
    }

    /**
     * Set 需要跳过的分析段名称列表。可选；不传或传空数组时执行该场景全部分析段。full_traffic 支持 beacon、dns_large、dns_dga、dns_dga_fine、dns_tunnel、icmp_tunnel、mining、p2p、remote_tool、file_transfer、high_risk_outbound、lateral_baseline、vpc_sensitive、smb_write、outbound_baseline、inbound_high_risk、tls_expired、tls_self_signed、first_seen_ip、first_seen_country、first_seen_port；east_west 支持 vpc_inter_vpc、subnet_inter、service_port、lateral_baseline、vpc_sensitive、smb_write、database_lateral；alert_comprehensive 支持 outbound_baseline、lateral_baseline、beacon、inbound_high_risk、first_seen_ip、first_seen_country、first_seen_port；asset_exposure 支持 inbound_high_risk、tls_expired、tls_self_signed、high_risk_outbound；access_troubleshoot 支持 acl_border_block、acl_nat_block、acl_vpc_block、ips_block。传入当前 Scenario 不支持的名称会返回 InvalidParameter。
     * @param SkipSections 需要跳过的分析段名称列表。可选；不传或传空数组时执行该场景全部分析段。full_traffic 支持 beacon、dns_large、dns_dga、dns_dga_fine、dns_tunnel、icmp_tunnel、mining、p2p、remote_tool、file_transfer、high_risk_outbound、lateral_baseline、vpc_sensitive、smb_write、outbound_baseline、inbound_high_risk、tls_expired、tls_self_signed、first_seen_ip、first_seen_country、first_seen_port；east_west 支持 vpc_inter_vpc、subnet_inter、service_port、lateral_baseline、vpc_sensitive、smb_write、database_lateral；alert_comprehensive 支持 outbound_baseline、lateral_baseline、beacon、inbound_high_risk、first_seen_ip、first_seen_country、first_seen_port；asset_exposure 支持 inbound_high_risk、tls_expired、tls_self_signed、high_risk_outbound；access_troubleshoot 支持 acl_border_block、acl_nat_block、acl_vpc_block、ips_block。传入当前 Scenario 不支持的名称会返回 InvalidParameter。
     */
    public void setSkipSections(String [] SkipSections) {
        this.SkipSections = SkipSections;
    }

    public DescribeCfwAnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAnalysisDataRequest(DescribeCfwAnalysisDataRequest source) {
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.SkipSections != null) {
            this.SkipSections = new String[source.SkipSections.length];
            for (int i = 0; i < source.SkipSections.length; i++) {
                this.SkipSections[i] = new String(source.SkipSections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "SkipSections.", this.SkipSections);

    }
}

