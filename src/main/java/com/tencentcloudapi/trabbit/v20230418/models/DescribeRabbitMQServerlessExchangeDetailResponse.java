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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessExchangeDetailResponse extends AbstractModel {

    /**
    * exchange 名
    */
    @SerializedName("ExchangeName")
    @Expose
    private String ExchangeName;

    /**
    * 备注说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否为持久化 exchange, 当集群重启时, 将会清除所有该字段为 "false" 的 exchange
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * 是否自动删除该 exchange, 如果为 "true", 当解绑所有当前 exchange 上的路由关系时, 该 exchange 将会被自动删除
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * 是否为内部 exchange, 如果为 "true", 则无法直接投递消息到该 exchange, 需要在路由设置中通过其他 exchange 进行转发
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
    * 替代 exchange, 如果消息没有匹配当前 exchange 绑定的所有 queue 或 exchange, 就会发送到该替代 exchange
    */
    @SerializedName("AlternateExchange")
    @Expose
    private String AlternateExchange;

    /**
    * exchange 类型, 支持 "fanout","direct","topic","headers"
    */
    @SerializedName("ExchangeType")
    @Expose
    private String ExchangeType;

    /**
    * VHost参数
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * exchange 创建者, "system":"系统创建", "user":"用户创建"
    */
    @SerializedName("ExchangeCreator")
    @Expose
    private String ExchangeCreator;

    /**
    * 扩展参数 key-value 字符串
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get exchange 名 
     * @return ExchangeName exchange 名
     */
    public String getExchangeName() {
        return this.ExchangeName;
    }

    /**
     * Set exchange 名
     * @param ExchangeName exchange 名
     */
    public void setExchangeName(String ExchangeName) {
        this.ExchangeName = ExchangeName;
    }

    /**
     * Get 备注说明 
     * @return Remark 备注说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明
     * @param Remark 备注说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否为持久化 exchange, 当集群重启时, 将会清除所有该字段为 "false" 的 exchange 
     * @return Durable 是否为持久化 exchange, 当集群重启时, 将会清除所有该字段为 "false" 的 exchange
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set 是否为持久化 exchange, 当集群重启时, 将会清除所有该字段为 "false" 的 exchange
     * @param Durable 是否为持久化 exchange, 当集群重启时, 将会清除所有该字段为 "false" 的 exchange
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get 是否自动删除该 exchange, 如果为 "true", 当解绑所有当前 exchange 上的路由关系时, 该 exchange 将会被自动删除 
     * @return AutoDelete 是否自动删除该 exchange, 如果为 "true", 当解绑所有当前 exchange 上的路由关系时, 该 exchange 将会被自动删除
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 是否自动删除该 exchange, 如果为 "true", 当解绑所有当前 exchange 上的路由关系时, 该 exchange 将会被自动删除
     * @param AutoDelete 是否自动删除该 exchange, 如果为 "true", 当解绑所有当前 exchange 上的路由关系时, 该 exchange 将会被自动删除
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 是否为内部 exchange, 如果为 "true", 则无法直接投递消息到该 exchange, 需要在路由设置中通过其他 exchange 进行转发 
     * @return Internal 是否为内部 exchange, 如果为 "true", 则无法直接投递消息到该 exchange, 需要在路由设置中通过其他 exchange 进行转发
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set 是否为内部 exchange, 如果为 "true", 则无法直接投递消息到该 exchange, 需要在路由设置中通过其他 exchange 进行转发
     * @param Internal 是否为内部 exchange, 如果为 "true", 则无法直接投递消息到该 exchange, 需要在路由设置中通过其他 exchange 进行转发
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    /**
     * Get 替代 exchange, 如果消息没有匹配当前 exchange 绑定的所有 queue 或 exchange, 就会发送到该替代 exchange 
     * @return AlternateExchange 替代 exchange, 如果消息没有匹配当前 exchange 绑定的所有 queue 或 exchange, 就会发送到该替代 exchange
     */
    public String getAlternateExchange() {
        return this.AlternateExchange;
    }

    /**
     * Set 替代 exchange, 如果消息没有匹配当前 exchange 绑定的所有 queue 或 exchange, 就会发送到该替代 exchange
     * @param AlternateExchange 替代 exchange, 如果消息没有匹配当前 exchange 绑定的所有 queue 或 exchange, 就会发送到该替代 exchange
     */
    public void setAlternateExchange(String AlternateExchange) {
        this.AlternateExchange = AlternateExchange;
    }

    /**
     * Get exchange 类型, 支持 "fanout","direct","topic","headers" 
     * @return ExchangeType exchange 类型, 支持 "fanout","direct","topic","headers"
     */
    public String getExchangeType() {
        return this.ExchangeType;
    }

    /**
     * Set exchange 类型, 支持 "fanout","direct","topic","headers"
     * @param ExchangeType exchange 类型, 支持 "fanout","direct","topic","headers"
     */
    public void setExchangeType(String ExchangeType) {
        this.ExchangeType = ExchangeType;
    }

    /**
     * Get VHost参数 
     * @return VirtualHost VHost参数
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VHost参数
     * @param VirtualHost VHost参数
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get exchange 创建者, "system":"系统创建", "user":"用户创建" 
     * @return ExchangeCreator exchange 创建者, "system":"系统创建", "user":"用户创建"
     */
    public String getExchangeCreator() {
        return this.ExchangeCreator;
    }

    /**
     * Set exchange 创建者, "system":"系统创建", "user":"用户创建"
     * @param ExchangeCreator exchange 创建者, "system":"系统创建", "user":"用户创建"
     */
    public void setExchangeCreator(String ExchangeCreator) {
        this.ExchangeCreator = ExchangeCreator;
    }

    /**
     * Get 扩展参数 key-value 字符串 
     * @return Arguments 扩展参数 key-value 字符串
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set 扩展参数 key-value 字符串
     * @param Arguments 扩展参数 key-value 字符串
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRabbitMQServerlessExchangeDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessExchangeDetailResponse(DescribeRabbitMQServerlessExchangeDetailResponse source) {
        if (source.ExchangeName != null) {
            this.ExchangeName = new String(source.ExchangeName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
        if (source.AlternateExchange != null) {
            this.AlternateExchange = new String(source.AlternateExchange);
        }
        if (source.ExchangeType != null) {
            this.ExchangeType = new String(source.ExchangeType);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ExchangeCreator != null) {
            this.ExchangeCreator = new String(source.ExchangeCreator);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExchangeName", this.ExchangeName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "AlternateExchange", this.AlternateExchange);
        this.setParamSimple(map, prefix + "ExchangeType", this.ExchangeType);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ExchangeCreator", this.ExchangeCreator);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

