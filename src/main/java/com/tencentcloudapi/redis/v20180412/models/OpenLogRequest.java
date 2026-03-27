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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenLogRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写命令。</li><li>read： 读命令。</li><li>all： 读写命令。</li></ul>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

    /**
    * <p>日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7：  7 天</li><li>30： 30 天</li></ul><p>默认值：7</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>高频日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7： 7天</li></ul><p>默认值：7</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>日志降级策略阈值。当实例 P99 延迟达到该阈值后，系统将自动丢弃审计日志数据，以优先保障业务可用性。</p><ul><li>单位：毫秒。</li><li>默认值：500。</li><li>取值范围：[300, 1000]。</li></ul>
    */
    @SerializedName("DegradeStrategy")
    @Expose
    private Long DegradeStrategy;

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul> 
     * @return LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     * @param LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写命令。</li><li>read： 读命令。</li><li>all： 读写命令。</li></ul> 
     * @return LogSubType <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写命令。</li><li>read： 读命令。</li><li>all： 读写命令。</li></ul>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写命令。</li><li>read： 读命令。</li><li>all： 读写命令。</li></ul>
     * @param LogSubType <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写命令。</li><li>read： 读命令。</li><li>all： 读写命令。</li></ul>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    /**
     * Get <p>日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7：  7 天</li><li>30： 30 天</li></ul><p>默认值：7</p> 
     * @return LogExpireDay <p>日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7：  7 天</li><li>30： 30 天</li></ul><p>默认值：7</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7：  7 天</li><li>30： 30 天</li></ul><p>默认值：7</p>
     * @param LogExpireDay <p>日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7：  7 天</li><li>30： 30 天</li></ul><p>默认值：7</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>高频日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7： 7天</li></ul><p>默认值：7</p> 
     * @return HighLogExpireDay <p>高频日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7： 7天</li></ul><p>默认值：7</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>高频日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7： 7天</li></ul><p>默认值：7</p>
     * @param HighLogExpireDay <p>高频日志有效期, 单位：天。</p><p>枚举值：</p><ul><li>7： 7天</li></ul><p>默认值：7</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>日志降级策略阈值。当实例 P99 延迟达到该阈值后，系统将自动丢弃审计日志数据，以优先保障业务可用性。</p><ul><li>单位：毫秒。</li><li>默认值：500。</li><li>取值范围：[300, 1000]。</li></ul> 
     * @return DegradeStrategy <p>日志降级策略阈值。当实例 P99 延迟达到该阈值后，系统将自动丢弃审计日志数据，以优先保障业务可用性。</p><ul><li>单位：毫秒。</li><li>默认值：500。</li><li>取值范围：[300, 1000]。</li></ul>
     */
    public Long getDegradeStrategy() {
        return this.DegradeStrategy;
    }

    /**
     * Set <p>日志降级策略阈值。当实例 P99 延迟达到该阈值后，系统将自动丢弃审计日志数据，以优先保障业务可用性。</p><ul><li>单位：毫秒。</li><li>默认值：500。</li><li>取值范围：[300, 1000]。</li></ul>
     * @param DegradeStrategy <p>日志降级策略阈值。当实例 P99 延迟达到该阈值后，系统将自动丢弃审计日志数据，以优先保障业务可用性。</p><ul><li>单位：毫秒。</li><li>默认值：500。</li><li>取值范围：[300, 1000]。</li></ul>
     */
    public void setDegradeStrategy(Long DegradeStrategy) {
        this.DegradeStrategy = DegradeStrategy;
    }

    public OpenLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenLogRequest(OpenLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.DegradeStrategy != null) {
            this.DegradeStrategy = new Long(source.DegradeStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "DegradeStrategy", this.DegradeStrategy);

    }
}

