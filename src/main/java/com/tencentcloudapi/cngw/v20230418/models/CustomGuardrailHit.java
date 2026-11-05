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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailHit extends AbstractModel {

    /**
    * <p>业务网关请求 ID；不是本次云 API 响应的 RequestId。流式同一业务请求可产生多条审核记录。</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>审核记录 Unix 毫秒级时间戳；注意查询入参 StartTime/EndTime 为秒级。</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>策略 ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>业务资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>业务资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Kong Route ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>业务协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>审核方向：request 或 response</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>是否为流式审核</p>
    */
    @SerializedName("Streaming")
    @Expose
    private Boolean Streaming;

    /**
    * <p>该审核单元是否标记为最终单元；不是是否命中/是否连接正常结束的判断依据。</p>
    */
    @SerializedName("Final")
    @Expose
    private Boolean Final;

    /**
    * <p>归一化后的审核判定，可能为 allow、block、replace、error；不是原始自定义字段的任意值。观察模式仍可记录命中判定。</p>
    */
    @SerializedName("Decision")
    @Expose
    private String Decision;

    /**
    * <p>策略配置动作</p>
    */
    @SerializedName("ConfiguredAction")
    @Expose
    private String ConfiguredAction;

    /**
    * <p>该审核记录的策略处理结果，如 allow、block、replace、error。需与 Decision、ConfiguredAction、ErrorCode 联合分析；记录不等于客户端已成功收到全部响应。</p>
    */
    @SerializedName("EffectiveAction")
    @Expose
    private String EffectiveAction;

    /**
    * <p>内容是否被改写</p>
    */
    @SerializedName("Rewritten")
    @Expose
    private Boolean Rewritten;

    /**
    * <p>请求或响应是否被拦截</p>
    */
    @SerializedName("Blocked")
    @Expose
    private Boolean Blocked;

    /**
    * <p>本审核记录是否因失败放行发生降级；为 true 时不能认为内容已经审核通过。</p>
    */
    @SerializedName("Downgraded")
    @Expose
    private Boolean Downgraded;

    /**
    * <p>审核服务 HTTP 状态码</p>
    */
    @SerializedName("ProviderStatusCode")
    @Expose
    private Long ProviderStatusCode;

    /**
    * <p>该审核调用耗时，单位毫秒，可含小数；不是完整模型请求时长或客户端首字延迟。</p>
    */
    @SerializedName("LatencyMs")
    @Expose
    private Float LatencyMs;

    /**
    * <p>稳定错误码</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>审核原因或错误摘要</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>业务网关请求 ID；不是本次云 API 响应的 RequestId。流式同一业务请求可产生多条审核记录。</p> 
     * @return RequestId <p>业务网关请求 ID；不是本次云 API 响应的 RequestId。流式同一业务请求可产生多条审核记录。</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>业务网关请求 ID；不是本次云 API 响应的 RequestId。流式同一业务请求可产生多条审核记录。</p>
     * @param RequestId <p>业务网关请求 ID；不是本次云 API 响应的 RequestId。流式同一业务请求可产生多条审核记录。</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>审核记录 Unix 毫秒级时间戳；注意查询入参 StartTime/EndTime 为秒级。</p> 
     * @return Timestamp <p>审核记录 Unix 毫秒级时间戳；注意查询入参 StartTime/EndTime 为秒级。</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>审核记录 Unix 毫秒级时间戳；注意查询入参 StartTime/EndTime 为秒级。</p>
     * @param Timestamp <p>审核记录 Unix 毫秒级时间戳；注意查询入参 StartTime/EndTime 为秒级。</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>网关实例 ID</p> 
     * @return GatewayId <p>网关实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 ID</p>
     * @param GatewayId <p>网关实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>策略 ID</p> 
     * @return PolicyId <p>策略 ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略 ID</p>
     * @param PolicyId <p>策略 ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略名称</p> 
     * @return PolicyName <p>策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>策略名称</p>
     * @param PolicyName <p>策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>业务资源类型</p> 
     * @return ResourceType <p>业务资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>业务资源类型</p>
     * @param ResourceType <p>业务资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>业务资源 ID</p> 
     * @return ResourceId <p>业务资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>业务资源 ID</p>
     * @param ResourceId <p>业务资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Kong Route ID</p> 
     * @return RouteId <p>Kong Route ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>Kong Route ID</p>
     * @param RouteId <p>Kong Route ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>业务协议</p> 
     * @return Protocol <p>业务协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>业务协议</p>
     * @param Protocol <p>业务协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>审核方向：request 或 response</p> 
     * @return Direction <p>审核方向：request 或 response</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>审核方向：request 或 response</p>
     * @param Direction <p>审核方向：request 或 response</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>是否为流式审核</p> 
     * @return Streaming <p>是否为流式审核</p>
     */
    public Boolean getStreaming() {
        return this.Streaming;
    }

    /**
     * Set <p>是否为流式审核</p>
     * @param Streaming <p>是否为流式审核</p>
     */
    public void setStreaming(Boolean Streaming) {
        this.Streaming = Streaming;
    }

    /**
     * Get <p>该审核单元是否标记为最终单元；不是是否命中/是否连接正常结束的判断依据。</p> 
     * @return Final <p>该审核单元是否标记为最终单元；不是是否命中/是否连接正常结束的判断依据。</p>
     */
    public Boolean getFinal() {
        return this.Final;
    }

    /**
     * Set <p>该审核单元是否标记为最终单元；不是是否命中/是否连接正常结束的判断依据。</p>
     * @param Final <p>该审核单元是否标记为最终单元；不是是否命中/是否连接正常结束的判断依据。</p>
     */
    public void setFinal(Boolean Final) {
        this.Final = Final;
    }

    /**
     * Get <p>归一化后的审核判定，可能为 allow、block、replace、error；不是原始自定义字段的任意值。观察模式仍可记录命中判定。</p> 
     * @return Decision <p>归一化后的审核判定，可能为 allow、block、replace、error；不是原始自定义字段的任意值。观察模式仍可记录命中判定。</p>
     */
    public String getDecision() {
        return this.Decision;
    }

    /**
     * Set <p>归一化后的审核判定，可能为 allow、block、replace、error；不是原始自定义字段的任意值。观察模式仍可记录命中判定。</p>
     * @param Decision <p>归一化后的审核判定，可能为 allow、block、replace、error；不是原始自定义字段的任意值。观察模式仍可记录命中判定。</p>
     */
    public void setDecision(String Decision) {
        this.Decision = Decision;
    }

    /**
     * Get <p>策略配置动作</p> 
     * @return ConfiguredAction <p>策略配置动作</p>
     */
    public String getConfiguredAction() {
        return this.ConfiguredAction;
    }

    /**
     * Set <p>策略配置动作</p>
     * @param ConfiguredAction <p>策略配置动作</p>
     */
    public void setConfiguredAction(String ConfiguredAction) {
        this.ConfiguredAction = ConfiguredAction;
    }

    /**
     * Get <p>该审核记录的策略处理结果，如 allow、block、replace、error。需与 Decision、ConfiguredAction、ErrorCode 联合分析；记录不等于客户端已成功收到全部响应。</p> 
     * @return EffectiveAction <p>该审核记录的策略处理结果，如 allow、block、replace、error。需与 Decision、ConfiguredAction、ErrorCode 联合分析；记录不等于客户端已成功收到全部响应。</p>
     */
    public String getEffectiveAction() {
        return this.EffectiveAction;
    }

    /**
     * Set <p>该审核记录的策略处理结果，如 allow、block、replace、error。需与 Decision、ConfiguredAction、ErrorCode 联合分析；记录不等于客户端已成功收到全部响应。</p>
     * @param EffectiveAction <p>该审核记录的策略处理结果，如 allow、block、replace、error。需与 Decision、ConfiguredAction、ErrorCode 联合分析；记录不等于客户端已成功收到全部响应。</p>
     */
    public void setEffectiveAction(String EffectiveAction) {
        this.EffectiveAction = EffectiveAction;
    }

    /**
     * Get <p>内容是否被改写</p> 
     * @return Rewritten <p>内容是否被改写</p>
     */
    public Boolean getRewritten() {
        return this.Rewritten;
    }

    /**
     * Set <p>内容是否被改写</p>
     * @param Rewritten <p>内容是否被改写</p>
     */
    public void setRewritten(Boolean Rewritten) {
        this.Rewritten = Rewritten;
    }

    /**
     * Get <p>请求或响应是否被拦截</p> 
     * @return Blocked <p>请求或响应是否被拦截</p>
     */
    public Boolean getBlocked() {
        return this.Blocked;
    }

    /**
     * Set <p>请求或响应是否被拦截</p>
     * @param Blocked <p>请求或响应是否被拦截</p>
     */
    public void setBlocked(Boolean Blocked) {
        this.Blocked = Blocked;
    }

    /**
     * Get <p>本审核记录是否因失败放行发生降级；为 true 时不能认为内容已经审核通过。</p> 
     * @return Downgraded <p>本审核记录是否因失败放行发生降级；为 true 时不能认为内容已经审核通过。</p>
     */
    public Boolean getDowngraded() {
        return this.Downgraded;
    }

    /**
     * Set <p>本审核记录是否因失败放行发生降级；为 true 时不能认为内容已经审核通过。</p>
     * @param Downgraded <p>本审核记录是否因失败放行发生降级；为 true 时不能认为内容已经审核通过。</p>
     */
    public void setDowngraded(Boolean Downgraded) {
        this.Downgraded = Downgraded;
    }

    /**
     * Get <p>审核服务 HTTP 状态码</p> 
     * @return ProviderStatusCode <p>审核服务 HTTP 状态码</p>
     */
    public Long getProviderStatusCode() {
        return this.ProviderStatusCode;
    }

    /**
     * Set <p>审核服务 HTTP 状态码</p>
     * @param ProviderStatusCode <p>审核服务 HTTP 状态码</p>
     */
    public void setProviderStatusCode(Long ProviderStatusCode) {
        this.ProviderStatusCode = ProviderStatusCode;
    }

    /**
     * Get <p>该审核调用耗时，单位毫秒，可含小数；不是完整模型请求时长或客户端首字延迟。</p> 
     * @return LatencyMs <p>该审核调用耗时，单位毫秒，可含小数；不是完整模型请求时长或客户端首字延迟。</p>
     */
    public Float getLatencyMs() {
        return this.LatencyMs;
    }

    /**
     * Set <p>该审核调用耗时，单位毫秒，可含小数；不是完整模型请求时长或客户端首字延迟。</p>
     * @param LatencyMs <p>该审核调用耗时，单位毫秒，可含小数；不是完整模型请求时长或客户端首字延迟。</p>
     */
    public void setLatencyMs(Float LatencyMs) {
        this.LatencyMs = LatencyMs;
    }

    /**
     * Get <p>稳定错误码</p> 
     * @return ErrorCode <p>稳定错误码</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>稳定错误码</p>
     * @param ErrorCode <p>稳定错误码</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>审核原因或错误摘要</p> 
     * @return Reason <p>审核原因或错误摘要</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>审核原因或错误摘要</p>
     * @param Reason <p>审核原因或错误摘要</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CustomGuardrailHit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailHit(CustomGuardrailHit source) {
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Streaming != null) {
            this.Streaming = new Boolean(source.Streaming);
        }
        if (source.Final != null) {
            this.Final = new Boolean(source.Final);
        }
        if (source.Decision != null) {
            this.Decision = new String(source.Decision);
        }
        if (source.ConfiguredAction != null) {
            this.ConfiguredAction = new String(source.ConfiguredAction);
        }
        if (source.EffectiveAction != null) {
            this.EffectiveAction = new String(source.EffectiveAction);
        }
        if (source.Rewritten != null) {
            this.Rewritten = new Boolean(source.Rewritten);
        }
        if (source.Blocked != null) {
            this.Blocked = new Boolean(source.Blocked);
        }
        if (source.Downgraded != null) {
            this.Downgraded = new Boolean(source.Downgraded);
        }
        if (source.ProviderStatusCode != null) {
            this.ProviderStatusCode = new Long(source.ProviderStatusCode);
        }
        if (source.LatencyMs != null) {
            this.LatencyMs = new Float(source.LatencyMs);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Streaming", this.Streaming);
        this.setParamSimple(map, prefix + "Final", this.Final);
        this.setParamSimple(map, prefix + "Decision", this.Decision);
        this.setParamSimple(map, prefix + "ConfiguredAction", this.ConfiguredAction);
        this.setParamSimple(map, prefix + "EffectiveAction", this.EffectiveAction);
        this.setParamSimple(map, prefix + "Rewritten", this.Rewritten);
        this.setParamSimple(map, prefix + "Blocked", this.Blocked);
        this.setParamSimple(map, prefix + "Downgraded", this.Downgraded);
        this.setParamSimple(map, prefix + "ProviderStatusCode", this.ProviderStatusCode);
        this.setParamSimple(map, prefix + "LatencyMs", this.LatencyMs);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

