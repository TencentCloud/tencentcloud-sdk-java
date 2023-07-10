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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayRateLimitDetail extends AbstractModel{

    /**
    * 插件启用状态
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * qps阈值
    */
    @SerializedName("QpsThresholds")
    @Expose
    private QpsThreshold [] QpsThresholds;

    /**
    * 限流依据
ip service consumer credential path header
    */
    @SerializedName("LimitBy")
    @Expose
    private String LimitBy;

    /**
    * 响应策略
url请求转发
text 响应配置
default 直接返回

    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 是否隐藏限流客户端响应头
    */
    @SerializedName("HideClientHeaders")
    @Expose
    private Boolean HideClientHeaders;

    /**
    * 是否开启请求排队
    */
    @SerializedName("IsDelay")
    @Expose
    private Boolean IsDelay;

    /**
    * 需要进行流量控制的请求路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 需要进行流量控制的请求头Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Header")
    @Expose
    private String Header;

    /**
    * 外部redis配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalRedis")
    @Expose
    private ExternalRedis ExternalRedis;

    /**
    * 计数器策略 
local 单机
redis  默认redis
external_redis 外部redis

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 响应配置，响应策略为text

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitResponse")
    @Expose
    private RateLimitResponse RateLimitResponse;

    /**
    * 请求转发地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitResponseUrl")
    @Expose
    private String RateLimitResponseUrl;

    /**
    * 排队时间
    */
    @SerializedName("LineUpTime")
    @Expose
    private Long LineUpTime;

    /**
     * Get 插件启用状态 
     * @return Enabled 插件启用状态
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 插件启用状态
     * @param Enabled 插件启用状态
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get qps阈值 
     * @return QpsThresholds qps阈值
     */
    public QpsThreshold [] getQpsThresholds() {
        return this.QpsThresholds;
    }

    /**
     * Set qps阈值
     * @param QpsThresholds qps阈值
     */
    public void setQpsThresholds(QpsThreshold [] QpsThresholds) {
        this.QpsThresholds = QpsThresholds;
    }

    /**
     * Get 限流依据
ip service consumer credential path header 
     * @return LimitBy 限流依据
ip service consumer credential path header
     */
    public String getLimitBy() {
        return this.LimitBy;
    }

    /**
     * Set 限流依据
ip service consumer credential path header
     * @param LimitBy 限流依据
ip service consumer credential path header
     */
    public void setLimitBy(String LimitBy) {
        this.LimitBy = LimitBy;
    }

    /**
     * Get 响应策略
url请求转发
text 响应配置
default 直接返回
 
     * @return ResponseType 响应策略
url请求转发
text 响应配置
default 直接返回

     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 响应策略
url请求转发
text 响应配置
default 直接返回

     * @param ResponseType 响应策略
url请求转发
text 响应配置
default 直接返回

     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 是否隐藏限流客户端响应头 
     * @return HideClientHeaders 是否隐藏限流客户端响应头
     */
    public Boolean getHideClientHeaders() {
        return this.HideClientHeaders;
    }

    /**
     * Set 是否隐藏限流客户端响应头
     * @param HideClientHeaders 是否隐藏限流客户端响应头
     */
    public void setHideClientHeaders(Boolean HideClientHeaders) {
        this.HideClientHeaders = HideClientHeaders;
    }

    /**
     * Get 是否开启请求排队 
     * @return IsDelay 是否开启请求排队
     */
    public Boolean getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set 是否开启请求排队
     * @param IsDelay 是否开启请求排队
     */
    public void setIsDelay(Boolean IsDelay) {
        this.IsDelay = IsDelay;
    }

    /**
     * Get 需要进行流量控制的请求路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 需要进行流量控制的请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 需要进行流量控制的请求路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 需要进行流量控制的请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 需要进行流量控制的请求头Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Header 需要进行流量控制的请求头Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeader() {
        return this.Header;
    }

    /**
     * Set 需要进行流量控制的请求头Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Header 需要进行流量控制的请求头Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeader(String Header) {
        this.Header = Header;
    }

    /**
     * Get 外部redis配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalRedis 外部redis配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalRedis getExternalRedis() {
        return this.ExternalRedis;
    }

    /**
     * Set 外部redis配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalRedis 外部redis配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalRedis(ExternalRedis ExternalRedis) {
        this.ExternalRedis = ExternalRedis;
    }

    /**
     * Get 计数器策略 
local 单机
redis  默认redis
external_redis 外部redis

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 计数器策略 
local 单机
redis  默认redis
external_redis 外部redis

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 计数器策略 
local 单机
redis  默认redis
external_redis 外部redis

注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 计数器策略 
local 单机
redis  默认redis
external_redis 外部redis

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 响应配置，响应策略为text

注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitResponse 响应配置，响应策略为text

注意：此字段可能返回 null，表示取不到有效值。
     */
    public RateLimitResponse getRateLimitResponse() {
        return this.RateLimitResponse;
    }

    /**
     * Set 响应配置，响应策略为text

注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitResponse 响应配置，响应策略为text

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitResponse(RateLimitResponse RateLimitResponse) {
        this.RateLimitResponse = RateLimitResponse;
    }

    /**
     * Get 请求转发地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitResponseUrl 请求转发地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRateLimitResponseUrl() {
        return this.RateLimitResponseUrl;
    }

    /**
     * Set 请求转发地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitResponseUrl 请求转发地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitResponseUrl(String RateLimitResponseUrl) {
        this.RateLimitResponseUrl = RateLimitResponseUrl;
    }

    /**
     * Get 排队时间 
     * @return LineUpTime 排队时间
     */
    public Long getLineUpTime() {
        return this.LineUpTime;
    }

    /**
     * Set 排队时间
     * @param LineUpTime 排队时间
     */
    public void setLineUpTime(Long LineUpTime) {
        this.LineUpTime = LineUpTime;
    }

    public CloudNativeAPIGatewayRateLimitDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayRateLimitDetail(CloudNativeAPIGatewayRateLimitDetail source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.QpsThresholds != null) {
            this.QpsThresholds = new QpsThreshold[source.QpsThresholds.length];
            for (int i = 0; i < source.QpsThresholds.length; i++) {
                this.QpsThresholds[i] = new QpsThreshold(source.QpsThresholds[i]);
            }
        }
        if (source.LimitBy != null) {
            this.LimitBy = new String(source.LimitBy);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.HideClientHeaders != null) {
            this.HideClientHeaders = new Boolean(source.HideClientHeaders);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Boolean(source.IsDelay);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Header != null) {
            this.Header = new String(source.Header);
        }
        if (source.ExternalRedis != null) {
            this.ExternalRedis = new ExternalRedis(source.ExternalRedis);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.RateLimitResponse != null) {
            this.RateLimitResponse = new RateLimitResponse(source.RateLimitResponse);
        }
        if (source.RateLimitResponseUrl != null) {
            this.RateLimitResponseUrl = new String(source.RateLimitResponseUrl);
        }
        if (source.LineUpTime != null) {
            this.LineUpTime = new Long(source.LineUpTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "QpsThresholds.", this.QpsThresholds);
        this.setParamSimple(map, prefix + "LimitBy", this.LimitBy);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "HideClientHeaders", this.HideClientHeaders);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Header", this.Header);
        this.setParamObj(map, prefix + "ExternalRedis.", this.ExternalRedis);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamObj(map, prefix + "RateLimitResponse.", this.RateLimitResponse);
        this.setParamSimple(map, prefix + "RateLimitResponseUrl", this.RateLimitResponseUrl);
        this.setParamSimple(map, prefix + "LineUpTime", this.LineUpTime);

    }
}

