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

public class DescribeEdrAlertCountForAssetRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>主机instance_id列表，为空时返回MemberId对应appid范围内的汇总统计，非空时按每个instance_id粒度分别返回统计</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>筛选条件列表，与DescribeEdrAlertList保持一致。支持的Name取值及对应Values枚举：Status - string - 是否必填：否 - 告警状态。Values取值：PENDING（待处理）、WHITELISTED（已加白）、PROCESSED（已处理）、IGNORED（已忽略）Level - string - 是否必填：否 - 告警等级。Values取值：CRITICAL（严重）、HIGH（高危）、MEDIUM（中危）、LOW（低危）、INFO（提示）DetectMode - string - 是否必填：否 - 检测模式。Values取值：PRECISE（精准）、BALANCED（均衡）、DEEP（深度）AlertCategory - string - 是否必填：否 - 告警大类。Values取值：VIRUS_TROJAN（病毒木马）、ABNORMAL_LOGIN（异常登录）、HOST_BEHAVIOR（主机行为）、NETWORK_BEHAVIOR（网络行为）、AI_LINK_ENGINE（AI关联引擎）AlertSubType - string - 是否必填：否 - 告警子类型。Values取值：MALWARE_FILE（恶意文件）、MALWARE_PROCESS（恶意进程）、RISK_LOGIN（异常登录）、BRUTE_FORCE（密码破解）、DNS（恶意请求）、BASH（高危命令）、PRIV_ESCALATION（本地提权）、REVERSE_SHELL（反弹Shell）、NET_ATTACK（网络攻击）、VUL_DEFENCE（漏洞防御）、MEMORY_SHELL_INJECT（内存马注入）、MEMORY_SHELL_SCAN（内存马扫描）、MULTI_BEHAVIOR_ATTACK（多行为攻击）AttackStage - string - 是否必填：否 - ATT&amp;CK攻击阶段。Values取值：TA0001~TA0011、TA0040、TA0042、TA0043，空字符串表示未分类AlertSource - string - 是否必填：否 - 告警来源。Values取值：HOST（主机）StartTime - string - 是否必填：否 - 起始时间，格式YYYY-MM-DD HH:MM:SS，不传默认近180天EndTime - string - 是否必填：否 - 结束时间，格式YYYY-MM-DD HH:MM:SS，不传默认当前时间</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilters [] Filters;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>主机instance_id列表，为空时返回MemberId对应appid范围内的汇总统计，非空时按每个instance_id粒度分别返回统计</p> 
     * @return InstanceIds <p>主机instance_id列表，为空时返回MemberId对应appid范围内的汇总统计，非空时按每个instance_id粒度分别返回统计</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>主机instance_id列表，为空时返回MemberId对应appid范围内的汇总统计，非空时按每个instance_id粒度分别返回统计</p>
     * @param InstanceIds <p>主机instance_id列表，为空时返回MemberId对应appid范围内的汇总统计，非空时按每个instance_id粒度分别返回统计</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>筛选条件列表，与DescribeEdrAlertList保持一致。支持的Name取值及对应Values枚举：Status - string - 是否必填：否 - 告警状态。Values取值：PENDING（待处理）、WHITELISTED（已加白）、PROCESSED（已处理）、IGNORED（已忽略）Level - string - 是否必填：否 - 告警等级。Values取值：CRITICAL（严重）、HIGH（高危）、MEDIUM（中危）、LOW（低危）、INFO（提示）DetectMode - string - 是否必填：否 - 检测模式。Values取值：PRECISE（精准）、BALANCED（均衡）、DEEP（深度）AlertCategory - string - 是否必填：否 - 告警大类。Values取值：VIRUS_TROJAN（病毒木马）、ABNORMAL_LOGIN（异常登录）、HOST_BEHAVIOR（主机行为）、NETWORK_BEHAVIOR（网络行为）、AI_LINK_ENGINE（AI关联引擎）AlertSubType - string - 是否必填：否 - 告警子类型。Values取值：MALWARE_FILE（恶意文件）、MALWARE_PROCESS（恶意进程）、RISK_LOGIN（异常登录）、BRUTE_FORCE（密码破解）、DNS（恶意请求）、BASH（高危命令）、PRIV_ESCALATION（本地提权）、REVERSE_SHELL（反弹Shell）、NET_ATTACK（网络攻击）、VUL_DEFENCE（漏洞防御）、MEMORY_SHELL_INJECT（内存马注入）、MEMORY_SHELL_SCAN（内存马扫描）、MULTI_BEHAVIOR_ATTACK（多行为攻击）AttackStage - string - 是否必填：否 - ATT&amp;CK攻击阶段。Values取值：TA0001~TA0011、TA0040、TA0042、TA0043，空字符串表示未分类AlertSource - string - 是否必填：否 - 告警来源。Values取值：HOST（主机）StartTime - string - 是否必填：否 - 起始时间，格式YYYY-MM-DD HH:MM:SS，不传默认近180天EndTime - string - 是否必填：否 - 结束时间，格式YYYY-MM-DD HH:MM:SS，不传默认当前时间</p> 
     * @return Filters <p>筛选条件列表，与DescribeEdrAlertList保持一致。支持的Name取值及对应Values枚举：Status - string - 是否必填：否 - 告警状态。Values取值：PENDING（待处理）、WHITELISTED（已加白）、PROCESSED（已处理）、IGNORED（已忽略）Level - string - 是否必填：否 - 告警等级。Values取值：CRITICAL（严重）、HIGH（高危）、MEDIUM（中危）、LOW（低危）、INFO（提示）DetectMode - string - 是否必填：否 - 检测模式。Values取值：PRECISE（精准）、BALANCED（均衡）、DEEP（深度）AlertCategory - string - 是否必填：否 - 告警大类。Values取值：VIRUS_TROJAN（病毒木马）、ABNORMAL_LOGIN（异常登录）、HOST_BEHAVIOR（主机行为）、NETWORK_BEHAVIOR（网络行为）、AI_LINK_ENGINE（AI关联引擎）AlertSubType - string - 是否必填：否 - 告警子类型。Values取值：MALWARE_FILE（恶意文件）、MALWARE_PROCESS（恶意进程）、RISK_LOGIN（异常登录）、BRUTE_FORCE（密码破解）、DNS（恶意请求）、BASH（高危命令）、PRIV_ESCALATION（本地提权）、REVERSE_SHELL（反弹Shell）、NET_ATTACK（网络攻击）、VUL_DEFENCE（漏洞防御）、MEMORY_SHELL_INJECT（内存马注入）、MEMORY_SHELL_SCAN（内存马扫描）、MULTI_BEHAVIOR_ATTACK（多行为攻击）AttackStage - string - 是否必填：否 - ATT&amp;CK攻击阶段。Values取值：TA0001~TA0011、TA0040、TA0042、TA0043，空字符串表示未分类AlertSource - string - 是否必填：否 - 告警来源。Values取值：HOST（主机）StartTime - string - 是否必填：否 - 起始时间，格式YYYY-MM-DD HH:MM:SS，不传默认近180天EndTime - string - 是否必填：否 - 结束时间，格式YYYY-MM-DD HH:MM:SS，不传默认当前时间</p>
     */
    public EDRFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件列表，与DescribeEdrAlertList保持一致。支持的Name取值及对应Values枚举：Status - string - 是否必填：否 - 告警状态。Values取值：PENDING（待处理）、WHITELISTED（已加白）、PROCESSED（已处理）、IGNORED（已忽略）Level - string - 是否必填：否 - 告警等级。Values取值：CRITICAL（严重）、HIGH（高危）、MEDIUM（中危）、LOW（低危）、INFO（提示）DetectMode - string - 是否必填：否 - 检测模式。Values取值：PRECISE（精准）、BALANCED（均衡）、DEEP（深度）AlertCategory - string - 是否必填：否 - 告警大类。Values取值：VIRUS_TROJAN（病毒木马）、ABNORMAL_LOGIN（异常登录）、HOST_BEHAVIOR（主机行为）、NETWORK_BEHAVIOR（网络行为）、AI_LINK_ENGINE（AI关联引擎）AlertSubType - string - 是否必填：否 - 告警子类型。Values取值：MALWARE_FILE（恶意文件）、MALWARE_PROCESS（恶意进程）、RISK_LOGIN（异常登录）、BRUTE_FORCE（密码破解）、DNS（恶意请求）、BASH（高危命令）、PRIV_ESCALATION（本地提权）、REVERSE_SHELL（反弹Shell）、NET_ATTACK（网络攻击）、VUL_DEFENCE（漏洞防御）、MEMORY_SHELL_INJECT（内存马注入）、MEMORY_SHELL_SCAN（内存马扫描）、MULTI_BEHAVIOR_ATTACK（多行为攻击）AttackStage - string - 是否必填：否 - ATT&amp;CK攻击阶段。Values取值：TA0001~TA0011、TA0040、TA0042、TA0043，空字符串表示未分类AlertSource - string - 是否必填：否 - 告警来源。Values取值：HOST（主机）StartTime - string - 是否必填：否 - 起始时间，格式YYYY-MM-DD HH:MM:SS，不传默认近180天EndTime - string - 是否必填：否 - 结束时间，格式YYYY-MM-DD HH:MM:SS，不传默认当前时间</p>
     * @param Filters <p>筛选条件列表，与DescribeEdrAlertList保持一致。支持的Name取值及对应Values枚举：Status - string - 是否必填：否 - 告警状态。Values取值：PENDING（待处理）、WHITELISTED（已加白）、PROCESSED（已处理）、IGNORED（已忽略）Level - string - 是否必填：否 - 告警等级。Values取值：CRITICAL（严重）、HIGH（高危）、MEDIUM（中危）、LOW（低危）、INFO（提示）DetectMode - string - 是否必填：否 - 检测模式。Values取值：PRECISE（精准）、BALANCED（均衡）、DEEP（深度）AlertCategory - string - 是否必填：否 - 告警大类。Values取值：VIRUS_TROJAN（病毒木马）、ABNORMAL_LOGIN（异常登录）、HOST_BEHAVIOR（主机行为）、NETWORK_BEHAVIOR（网络行为）、AI_LINK_ENGINE（AI关联引擎）AlertSubType - string - 是否必填：否 - 告警子类型。Values取值：MALWARE_FILE（恶意文件）、MALWARE_PROCESS（恶意进程）、RISK_LOGIN（异常登录）、BRUTE_FORCE（密码破解）、DNS（恶意请求）、BASH（高危命令）、PRIV_ESCALATION（本地提权）、REVERSE_SHELL（反弹Shell）、NET_ATTACK（网络攻击）、VUL_DEFENCE（漏洞防御）、MEMORY_SHELL_INJECT（内存马注入）、MEMORY_SHELL_SCAN（内存马扫描）、MULTI_BEHAVIOR_ATTACK（多行为攻击）AttackStage - string - 是否必填：否 - ATT&amp;CK攻击阶段。Values取值：TA0001~TA0011、TA0040、TA0042、TA0043，空字符串表示未分类AlertSource - string - 是否必填：否 - 告警来源。Values取值：HOST（主机）StartTime - string - 是否必填：否 - 起始时间，格式YYYY-MM-DD HH:MM:SS，不传默认近180天EndTime - string - 是否必填：否 - 结束时间，格式YYYY-MM-DD HH:MM:SS，不传默认当前时间</p>
     */
    public void setFilters(EDRFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEdrAlertCountForAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertCountForAssetRequest(DescribeEdrAlertCountForAssetRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

