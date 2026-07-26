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

public class CreateAlertCenterRuleAsyncRequest extends AbstractModel {

    /**
    * <p>必填的告警方向：0 出向，1 入向，3 内网。用于 HandleIpList 中 IP 目标的处置方向；其它目标也必须传上述有效值。从 DescribeCfwAlerts 复制方向时，将 alerts[].direction 的 outbound、inbound、lateral 分别转换为 JSON 整数 0、1、3。</p>
    */
    @SerializedName("AlertDirection")
    @Expose
    private Long AlertDirection;

    /**
    * <p>必填的处置生效方向。支持空字符串、0（互联网出向）、1（互联网入向）、0,1/1,0（互联网双向）、3（内网访问）、5（内网访问源）、6（内网访问目的）及 5,6/6,5。空字符串表示按告警原方向处置；同一 IP 的已有规则方向会与本次方向合并。</p>
    */
    @SerializedName("HandleDirection")
    @Expose
    private String HandleDirection;

    /**
    * <p>处置有效期：1 表示 1 天，7 表示 7 天，-2 表示永久。</p>
    */
    @SerializedName("HandleTime")
    @Expose
    private Long HandleTime;

    /**
    * <p>必填的处置类型：1 按 HandleIdList 或 HandleEventIdList 封禁，2 按 HandleIdList、HandleEventIdList 或 BlockDomain 加白，3 按 HandleIpList 加白 IP，4 按 HandleIpList 封禁 IP，5 将 HandleIdList 或 HandleEventIdList 对应的安全基线告警地址加入指定方向的安全基线列表，8 按 HandleEventIdList 关联资产或 AssetIdList 新增隔离。五类目标至少提供一类；HandleType=8 未能从事件解析出资产时必须提供 AssetIdList。IsolateType 和 WhiteIpList 仅用于类型 8。</p>
    */
    @SerializedName("HandleType")
    @Expose
    private Long HandleType;

    /**
    * <p>资产隔离目标列表，可省略；仅 HandleType=8 使用。直接按资产隔离时，调用 DescribeCfwAssets，传 AssetType=host 和目标 InstanceId，解析返回结果；仅在唯一 assets[].instance_id 与目标完全相等时将其写入本字段，不使用资产名称。</p>
    */
    @SerializedName("AssetIdList")
    @Expose
    private String [] AssetIdList;

    /**
    * <p>域名加白目标，传合法域名；HandleType 必须为 2，并同时传 TargetEventIdList。</p>
    */
    @SerializedName("BlockDomain")
    @Expose
    private String BlockDomain;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>可选处置说明，最多 50 个 Unicode 字符。</p>
    */
    @SerializedName("HandleComment")
    @Expose
    private String HandleComment;

    /**
    * <p>告警事件 ID 列表，可省略。通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。事件对应的告警日志会与 HandleIdList 合并后参与处置。</p>
    */
    @SerializedName("HandleEventIdList")
    @Expose
    private String [] HandleEventIdList;

    /**
    * <p>告警日志 ID 列表，可省略；可与 HandleEventIdList 同时使用。调用 DescribeLogs，传 Index=rule_threatinfo 和目标日志的查询条件，解析返回结果，仅使用目标记录的 log_id。告警事件 ID 使用 HandleEventIdList。</p>
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * <p>IP 处置目标列表，每项必须是有效 IP 地址。HandleType=3 表示加白，HandleType=4 表示封禁；可使用 DescribeCfwAlerts 返回的 alerts[].src_ip_list 或 alerts[].dst_ip_list。</p>
    */
    @SerializedName("HandleIpList")
    @Expose
    private String [] HandleIpList;

    /**
    * <p>处置原因，可省略：0 未指定原因，1 重复，2 误报，3 紧急加白；主要用于加白记录。</p>
    */
    @SerializedName("IgnoreReason")
    @Expose
    private Long IgnoreReason;

    /**
    * <p>隔离范围数组，可省略：1 互联网入站，2 互联网出站，4 内网访问。仅 HandleType=8 使用；组合多个范围时传入对应值且不要重复，重复值会改变最终隔离范围。</p>
    */
    @SerializedName("IsolateType")
    @Expose
    private Long [] IsolateType;

    /**
    * <p>处置关联的来源事件 ID 列表，仅用于 HandleIpList 或 BlockDomain。BlockDomain 处置时必填，HandleIpList 处置时可省略；通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。</p>
    */
    @SerializedName("TargetEventIdList")
    @Expose
    private String [] TargetEventIdList;

    /**
    * <p>隔离后仍允许通信的 IPv4 地址列表，仅 HandleType=8 使用。可省略或传空数组；非空时每项必须是有效 IPv4 地址。</p>
    */
    @SerializedName("WhiteIpList")
    @Expose
    private String [] WhiteIpList;

    /**
     * Get <p>必填的告警方向：0 出向，1 入向，3 内网。用于 HandleIpList 中 IP 目标的处置方向；其它目标也必须传上述有效值。从 DescribeCfwAlerts 复制方向时，将 alerts[].direction 的 outbound、inbound、lateral 分别转换为 JSON 整数 0、1、3。</p> 
     * @return AlertDirection <p>必填的告警方向：0 出向，1 入向，3 内网。用于 HandleIpList 中 IP 目标的处置方向；其它目标也必须传上述有效值。从 DescribeCfwAlerts 复制方向时，将 alerts[].direction 的 outbound、inbound、lateral 分别转换为 JSON 整数 0、1、3。</p>
     */
    public Long getAlertDirection() {
        return this.AlertDirection;
    }

    /**
     * Set <p>必填的告警方向：0 出向，1 入向，3 内网。用于 HandleIpList 中 IP 目标的处置方向；其它目标也必须传上述有效值。从 DescribeCfwAlerts 复制方向时，将 alerts[].direction 的 outbound、inbound、lateral 分别转换为 JSON 整数 0、1、3。</p>
     * @param AlertDirection <p>必填的告警方向：0 出向，1 入向，3 内网。用于 HandleIpList 中 IP 目标的处置方向；其它目标也必须传上述有效值。从 DescribeCfwAlerts 复制方向时，将 alerts[].direction 的 outbound、inbound、lateral 分别转换为 JSON 整数 0、1、3。</p>
     */
    public void setAlertDirection(Long AlertDirection) {
        this.AlertDirection = AlertDirection;
    }

    /**
     * Get <p>必填的处置生效方向。支持空字符串、0（互联网出向）、1（互联网入向）、0,1/1,0（互联网双向）、3（内网访问）、5（内网访问源）、6（内网访问目的）及 5,6/6,5。空字符串表示按告警原方向处置；同一 IP 的已有规则方向会与本次方向合并。</p> 
     * @return HandleDirection <p>必填的处置生效方向。支持空字符串、0（互联网出向）、1（互联网入向）、0,1/1,0（互联网双向）、3（内网访问）、5（内网访问源）、6（内网访问目的）及 5,6/6,5。空字符串表示按告警原方向处置；同一 IP 的已有规则方向会与本次方向合并。</p>
     */
    public String getHandleDirection() {
        return this.HandleDirection;
    }

    /**
     * Set <p>必填的处置生效方向。支持空字符串、0（互联网出向）、1（互联网入向）、0,1/1,0（互联网双向）、3（内网访问）、5（内网访问源）、6（内网访问目的）及 5,6/6,5。空字符串表示按告警原方向处置；同一 IP 的已有规则方向会与本次方向合并。</p>
     * @param HandleDirection <p>必填的处置生效方向。支持空字符串、0（互联网出向）、1（互联网入向）、0,1/1,0（互联网双向）、3（内网访问）、5（内网访问源）、6（内网访问目的）及 5,6/6,5。空字符串表示按告警原方向处置；同一 IP 的已有规则方向会与本次方向合并。</p>
     */
    public void setHandleDirection(String HandleDirection) {
        this.HandleDirection = HandleDirection;
    }

    /**
     * Get <p>处置有效期：1 表示 1 天，7 表示 7 天，-2 表示永久。</p> 
     * @return HandleTime <p>处置有效期：1 表示 1 天，7 表示 7 天，-2 表示永久。</p>
     */
    public Long getHandleTime() {
        return this.HandleTime;
    }

    /**
     * Set <p>处置有效期：1 表示 1 天，7 表示 7 天，-2 表示永久。</p>
     * @param HandleTime <p>处置有效期：1 表示 1 天，7 表示 7 天，-2 表示永久。</p>
     */
    public void setHandleTime(Long HandleTime) {
        this.HandleTime = HandleTime;
    }

    /**
     * Get <p>必填的处置类型：1 按 HandleIdList 或 HandleEventIdList 封禁，2 按 HandleIdList、HandleEventIdList 或 BlockDomain 加白，3 按 HandleIpList 加白 IP，4 按 HandleIpList 封禁 IP，5 将 HandleIdList 或 HandleEventIdList 对应的安全基线告警地址加入指定方向的安全基线列表，8 按 HandleEventIdList 关联资产或 AssetIdList 新增隔离。五类目标至少提供一类；HandleType=8 未能从事件解析出资产时必须提供 AssetIdList。IsolateType 和 WhiteIpList 仅用于类型 8。</p> 
     * @return HandleType <p>必填的处置类型：1 按 HandleIdList 或 HandleEventIdList 封禁，2 按 HandleIdList、HandleEventIdList 或 BlockDomain 加白，3 按 HandleIpList 加白 IP，4 按 HandleIpList 封禁 IP，5 将 HandleIdList 或 HandleEventIdList 对应的安全基线告警地址加入指定方向的安全基线列表，8 按 HandleEventIdList 关联资产或 AssetIdList 新增隔离。五类目标至少提供一类；HandleType=8 未能从事件解析出资产时必须提供 AssetIdList。IsolateType 和 WhiteIpList 仅用于类型 8。</p>
     */
    public Long getHandleType() {
        return this.HandleType;
    }

    /**
     * Set <p>必填的处置类型：1 按 HandleIdList 或 HandleEventIdList 封禁，2 按 HandleIdList、HandleEventIdList 或 BlockDomain 加白，3 按 HandleIpList 加白 IP，4 按 HandleIpList 封禁 IP，5 将 HandleIdList 或 HandleEventIdList 对应的安全基线告警地址加入指定方向的安全基线列表，8 按 HandleEventIdList 关联资产或 AssetIdList 新增隔离。五类目标至少提供一类；HandleType=8 未能从事件解析出资产时必须提供 AssetIdList。IsolateType 和 WhiteIpList 仅用于类型 8。</p>
     * @param HandleType <p>必填的处置类型：1 按 HandleIdList 或 HandleEventIdList 封禁，2 按 HandleIdList、HandleEventIdList 或 BlockDomain 加白，3 按 HandleIpList 加白 IP，4 按 HandleIpList 封禁 IP，5 将 HandleIdList 或 HandleEventIdList 对应的安全基线告警地址加入指定方向的安全基线列表，8 按 HandleEventIdList 关联资产或 AssetIdList 新增隔离。五类目标至少提供一类；HandleType=8 未能从事件解析出资产时必须提供 AssetIdList。IsolateType 和 WhiteIpList 仅用于类型 8。</p>
     */
    public void setHandleType(Long HandleType) {
        this.HandleType = HandleType;
    }

    /**
     * Get <p>资产隔离目标列表，可省略；仅 HandleType=8 使用。直接按资产隔离时，调用 DescribeCfwAssets，传 AssetType=host 和目标 InstanceId，解析返回结果；仅在唯一 assets[].instance_id 与目标完全相等时将其写入本字段，不使用资产名称。</p> 
     * @return AssetIdList <p>资产隔离目标列表，可省略；仅 HandleType=8 使用。直接按资产隔离时，调用 DescribeCfwAssets，传 AssetType=host 和目标 InstanceId，解析返回结果；仅在唯一 assets[].instance_id 与目标完全相等时将其写入本字段，不使用资产名称。</p>
     */
    public String [] getAssetIdList() {
        return this.AssetIdList;
    }

    /**
     * Set <p>资产隔离目标列表，可省略；仅 HandleType=8 使用。直接按资产隔离时，调用 DescribeCfwAssets，传 AssetType=host 和目标 InstanceId，解析返回结果；仅在唯一 assets[].instance_id 与目标完全相等时将其写入本字段，不使用资产名称。</p>
     * @param AssetIdList <p>资产隔离目标列表，可省略；仅 HandleType=8 使用。直接按资产隔离时，调用 DescribeCfwAssets，传 AssetType=host 和目标 InstanceId，解析返回结果；仅在唯一 assets[].instance_id 与目标完全相等时将其写入本字段，不使用资产名称。</p>
     */
    public void setAssetIdList(String [] AssetIdList) {
        this.AssetIdList = AssetIdList;
    }

    /**
     * Get <p>域名加白目标，传合法域名；HandleType 必须为 2，并同时传 TargetEventIdList。</p> 
     * @return BlockDomain <p>域名加白目标，传合法域名；HandleType 必须为 2，并同时传 TargetEventIdList。</p>
     */
    public String getBlockDomain() {
        return this.BlockDomain;
    }

    /**
     * Set <p>域名加白目标，传合法域名；HandleType 必须为 2，并同时传 TargetEventIdList。</p>
     * @param BlockDomain <p>域名加白目标，传合法域名；HandleType 必须为 2，并同时传 TargetEventIdList。</p>
     */
    public void setBlockDomain(String BlockDomain) {
        this.BlockDomain = BlockDomain;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>可选处置说明，最多 50 个 Unicode 字符。</p> 
     * @return HandleComment <p>可选处置说明，最多 50 个 Unicode 字符。</p>
     */
    public String getHandleComment() {
        return this.HandleComment;
    }

    /**
     * Set <p>可选处置说明，最多 50 个 Unicode 字符。</p>
     * @param HandleComment <p>可选处置说明，最多 50 个 Unicode 字符。</p>
     */
    public void setHandleComment(String HandleComment) {
        this.HandleComment = HandleComment;
    }

    /**
     * Get <p>告警事件 ID 列表，可省略。通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。事件对应的告警日志会与 HandleIdList 合并后参与处置。</p> 
     * @return HandleEventIdList <p>告警事件 ID 列表，可省略。通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。事件对应的告警日志会与 HandleIdList 合并后参与处置。</p>
     */
    public String [] getHandleEventIdList() {
        return this.HandleEventIdList;
    }

    /**
     * Set <p>告警事件 ID 列表，可省略。通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。事件对应的告警日志会与 HandleIdList 合并后参与处置。</p>
     * @param HandleEventIdList <p>告警事件 ID 列表，可省略。通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。事件对应的告警日志会与 HandleIdList 合并后参与处置。</p>
     */
    public void setHandleEventIdList(String [] HandleEventIdList) {
        this.HandleEventIdList = HandleEventIdList;
    }

    /**
     * Get <p>告警日志 ID 列表，可省略；可与 HandleEventIdList 同时使用。调用 DescribeLogs，传 Index=rule_threatinfo 和目标日志的查询条件，解析返回结果，仅使用目标记录的 log_id。告警事件 ID 使用 HandleEventIdList。</p> 
     * @return HandleIdList <p>告警日志 ID 列表，可省略；可与 HandleEventIdList 同时使用。调用 DescribeLogs，传 Index=rule_threatinfo 和目标日志的查询条件，解析返回结果，仅使用目标记录的 log_id。告警事件 ID 使用 HandleEventIdList。</p>
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set <p>告警日志 ID 列表，可省略；可与 HandleEventIdList 同时使用。调用 DescribeLogs，传 Index=rule_threatinfo 和目标日志的查询条件，解析返回结果，仅使用目标记录的 log_id。告警事件 ID 使用 HandleEventIdList。</p>
     * @param HandleIdList <p>告警日志 ID 列表，可省略；可与 HandleEventIdList 同时使用。调用 DescribeLogs，传 Index=rule_threatinfo 和目标日志的查询条件，解析返回结果，仅使用目标记录的 log_id。告警事件 ID 使用 HandleEventIdList。</p>
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get <p>IP 处置目标列表，每项必须是有效 IP 地址。HandleType=3 表示加白，HandleType=4 表示封禁；可使用 DescribeCfwAlerts 返回的 alerts[].src_ip_list 或 alerts[].dst_ip_list。</p> 
     * @return HandleIpList <p>IP 处置目标列表，每项必须是有效 IP 地址。HandleType=3 表示加白，HandleType=4 表示封禁；可使用 DescribeCfwAlerts 返回的 alerts[].src_ip_list 或 alerts[].dst_ip_list。</p>
     */
    public String [] getHandleIpList() {
        return this.HandleIpList;
    }

    /**
     * Set <p>IP 处置目标列表，每项必须是有效 IP 地址。HandleType=3 表示加白，HandleType=4 表示封禁；可使用 DescribeCfwAlerts 返回的 alerts[].src_ip_list 或 alerts[].dst_ip_list。</p>
     * @param HandleIpList <p>IP 处置目标列表，每项必须是有效 IP 地址。HandleType=3 表示加白，HandleType=4 表示封禁；可使用 DescribeCfwAlerts 返回的 alerts[].src_ip_list 或 alerts[].dst_ip_list。</p>
     */
    public void setHandleIpList(String [] HandleIpList) {
        this.HandleIpList = HandleIpList;
    }

    /**
     * Get <p>处置原因，可省略：0 未指定原因，1 重复，2 误报，3 紧急加白；主要用于加白记录。</p> 
     * @return IgnoreReason <p>处置原因，可省略：0 未指定原因，1 重复，2 误报，3 紧急加白；主要用于加白记录。</p>
     */
    public Long getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set <p>处置原因，可省略：0 未指定原因，1 重复，2 误报，3 紧急加白；主要用于加白记录。</p>
     * @param IgnoreReason <p>处置原因，可省略：0 未指定原因，1 重复，2 误报，3 紧急加白；主要用于加白记录。</p>
     */
    public void setIgnoreReason(Long IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get <p>隔离范围数组，可省略：1 互联网入站，2 互联网出站，4 内网访问。仅 HandleType=8 使用；组合多个范围时传入对应值且不要重复，重复值会改变最终隔离范围。</p> 
     * @return IsolateType <p>隔离范围数组，可省略：1 互联网入站，2 互联网出站，4 内网访问。仅 HandleType=8 使用；组合多个范围时传入对应值且不要重复，重复值会改变最终隔离范围。</p>
     */
    public Long [] getIsolateType() {
        return this.IsolateType;
    }

    /**
     * Set <p>隔离范围数组，可省略：1 互联网入站，2 互联网出站，4 内网访问。仅 HandleType=8 使用；组合多个范围时传入对应值且不要重复，重复值会改变最终隔离范围。</p>
     * @param IsolateType <p>隔离范围数组，可省略：1 互联网入站，2 互联网出站，4 内网访问。仅 HandleType=8 使用；组合多个范围时传入对应值且不要重复，重复值会改变最终隔离范围。</p>
     */
    public void setIsolateType(Long [] IsolateType) {
        this.IsolateType = IsolateType;
    }

    /**
     * Get <p>处置关联的来源事件 ID 列表，仅用于 HandleIpList 或 BlockDomain。BlockDomain 处置时必填，HandleIpList 处置时可省略；通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。</p> 
     * @return TargetEventIdList <p>处置关联的来源事件 ID 列表，仅用于 HandleIpList 或 BlockDomain。BlockDomain 处置时必填，HandleIpList 处置时可省略；通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。</p>
     */
    public String [] getTargetEventIdList() {
        return this.TargetEventIdList;
    }

    /**
     * Set <p>处置关联的来源事件 ID 列表，仅用于 HandleIpList 或 BlockDomain。BlockDomain 处置时必填，HandleIpList 处置时可省略；通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。</p>
     * @param TargetEventIdList <p>处置关联的来源事件 ID 列表，仅用于 HandleIpList 或 BlockDomain。BlockDomain 处置时必填，HandleIpList 处置时可省略；通过 DescribeCfwAlerts 获取，返回 alerts[].current_event_id 时使用该值，否则使用 alerts[].event_id。</p>
     */
    public void setTargetEventIdList(String [] TargetEventIdList) {
        this.TargetEventIdList = TargetEventIdList;
    }

    /**
     * Get <p>隔离后仍允许通信的 IPv4 地址列表，仅 HandleType=8 使用。可省略或传空数组；非空时每项必须是有效 IPv4 地址。</p> 
     * @return WhiteIpList <p>隔离后仍允许通信的 IPv4 地址列表，仅 HandleType=8 使用。可省略或传空数组；非空时每项必须是有效 IPv4 地址。</p>
     */
    public String [] getWhiteIpList() {
        return this.WhiteIpList;
    }

    /**
     * Set <p>隔离后仍允许通信的 IPv4 地址列表，仅 HandleType=8 使用。可省略或传空数组；非空时每项必须是有效 IPv4 地址。</p>
     * @param WhiteIpList <p>隔离后仍允许通信的 IPv4 地址列表，仅 HandleType=8 使用。可省略或传空数组；非空时每项必须是有效 IPv4 地址。</p>
     */
    public void setWhiteIpList(String [] WhiteIpList) {
        this.WhiteIpList = WhiteIpList;
    }

    public CreateAlertCenterRuleAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterRuleAsyncRequest(CreateAlertCenterRuleAsyncRequest source) {
        if (source.AlertDirection != null) {
            this.AlertDirection = new Long(source.AlertDirection);
        }
        if (source.HandleDirection != null) {
            this.HandleDirection = new String(source.HandleDirection);
        }
        if (source.HandleTime != null) {
            this.HandleTime = new Long(source.HandleTime);
        }
        if (source.HandleType != null) {
            this.HandleType = new Long(source.HandleType);
        }
        if (source.AssetIdList != null) {
            this.AssetIdList = new String[source.AssetIdList.length];
            for (int i = 0; i < source.AssetIdList.length; i++) {
                this.AssetIdList[i] = new String(source.AssetIdList[i]);
            }
        }
        if (source.BlockDomain != null) {
            this.BlockDomain = new String(source.BlockDomain);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.HandleComment != null) {
            this.HandleComment = new String(source.HandleComment);
        }
        if (source.HandleEventIdList != null) {
            this.HandleEventIdList = new String[source.HandleEventIdList.length];
            for (int i = 0; i < source.HandleEventIdList.length; i++) {
                this.HandleEventIdList[i] = new String(source.HandleEventIdList[i]);
            }
        }
        if (source.HandleIdList != null) {
            this.HandleIdList = new String[source.HandleIdList.length];
            for (int i = 0; i < source.HandleIdList.length; i++) {
                this.HandleIdList[i] = new String(source.HandleIdList[i]);
            }
        }
        if (source.HandleIpList != null) {
            this.HandleIpList = new String[source.HandleIpList.length];
            for (int i = 0; i < source.HandleIpList.length; i++) {
                this.HandleIpList[i] = new String(source.HandleIpList[i]);
            }
        }
        if (source.IgnoreReason != null) {
            this.IgnoreReason = new Long(source.IgnoreReason);
        }
        if (source.IsolateType != null) {
            this.IsolateType = new Long[source.IsolateType.length];
            for (int i = 0; i < source.IsolateType.length; i++) {
                this.IsolateType[i] = new Long(source.IsolateType[i]);
            }
        }
        if (source.TargetEventIdList != null) {
            this.TargetEventIdList = new String[source.TargetEventIdList.length];
            for (int i = 0; i < source.TargetEventIdList.length; i++) {
                this.TargetEventIdList[i] = new String(source.TargetEventIdList[i]);
            }
        }
        if (source.WhiteIpList != null) {
            this.WhiteIpList = new String[source.WhiteIpList.length];
            for (int i = 0; i < source.WhiteIpList.length; i++) {
                this.WhiteIpList[i] = new String(source.WhiteIpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertDirection", this.AlertDirection);
        this.setParamSimple(map, prefix + "HandleDirection", this.HandleDirection);
        this.setParamSimple(map, prefix + "HandleTime", this.HandleTime);
        this.setParamSimple(map, prefix + "HandleType", this.HandleType);
        this.setParamArraySimple(map, prefix + "AssetIdList.", this.AssetIdList);
        this.setParamSimple(map, prefix + "BlockDomain", this.BlockDomain);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "HandleComment", this.HandleComment);
        this.setParamArraySimple(map, prefix + "HandleEventIdList.", this.HandleEventIdList);
        this.setParamArraySimple(map, prefix + "HandleIdList.", this.HandleIdList);
        this.setParamArraySimple(map, prefix + "HandleIpList.", this.HandleIpList);
        this.setParamSimple(map, prefix + "IgnoreReason", this.IgnoreReason);
        this.setParamArraySimple(map, prefix + "IsolateType.", this.IsolateType);
        this.setParamArraySimple(map, prefix + "TargetEventIdList.", this.TargetEventIdList);
        this.setParamArraySimple(map, prefix + "WhiteIpList.", this.WhiteIpList);

    }
}

