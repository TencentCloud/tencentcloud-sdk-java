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

public class ModifyInstanceLogDeliveryRequest extends AbstractModel {

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型。当前仅支持设置为slowlog，指慢查询日志。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 日志投递开启状态。
- true：开启。
- false：关闭。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 投递的日志集ID。通过接口[DescribeLogsets](https://cloud.tencent.com/document/api/614/58624)获取到日志集ID。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 投递的日志主题ID。通过接口[DescribeTopics](https://cloud.tencent.com/document/api/614/56454)获取到日志主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集名称。**LogsetId**为空时必传，系统会以LogsetName为名称来创建新的日志集并投递日志。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 日志主题名称。**TopicId**为空时必传，系统会以TopicName为名称来创建新的日志主题并投递日志。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志集所在地域，不传默认使用实例所在地域。
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * 日志存储时间，默认为30天，可选范围1-3600天。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 创建日志主题时，是否创建索引。
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志类型。当前仅支持设置为slowlog，指慢查询日志。 
     * @return LogType 日志类型。当前仅支持设置为slowlog，指慢查询日志。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型。当前仅支持设置为slowlog，指慢查询日志。
     * @param LogType 日志类型。当前仅支持设置为slowlog，指慢查询日志。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 日志投递开启状态。
- true：开启。
- false：关闭。 
     * @return Enabled 日志投递开启状态。
- true：开启。
- false：关闭。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 日志投递开启状态。
- true：开启。
- false：关闭。
     * @param Enabled 日志投递开启状态。
- true：开启。
- false：关闭。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 投递的日志集ID。通过接口[DescribeLogsets](https://cloud.tencent.com/document/api/614/58624)获取到日志集ID。 
     * @return LogsetId 投递的日志集ID。通过接口[DescribeLogsets](https://cloud.tencent.com/document/api/614/58624)获取到日志集ID。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 投递的日志集ID。通过接口[DescribeLogsets](https://cloud.tencent.com/document/api/614/58624)获取到日志集ID。
     * @param LogsetId 投递的日志集ID。通过接口[DescribeLogsets](https://cloud.tencent.com/document/api/614/58624)获取到日志集ID。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 投递的日志主题ID。通过接口[DescribeTopics](https://cloud.tencent.com/document/api/614/56454)获取到日志主题ID。 
     * @return TopicId 投递的日志主题ID。通过接口[DescribeTopics](https://cloud.tencent.com/document/api/614/56454)获取到日志主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递的日志主题ID。通过接口[DescribeTopics](https://cloud.tencent.com/document/api/614/56454)获取到日志主题ID。
     * @param TopicId 投递的日志主题ID。通过接口[DescribeTopics](https://cloud.tencent.com/document/api/614/56454)获取到日志主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集名称。**LogsetId**为空时必传，系统会以LogsetName为名称来创建新的日志集并投递日志。 
     * @return LogsetName 日志集名称。**LogsetId**为空时必传，系统会以LogsetName为名称来创建新的日志集并投递日志。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集名称。**LogsetId**为空时必传，系统会以LogsetName为名称来创建新的日志集并投递日志。
     * @param LogsetName 日志集名称。**LogsetId**为空时必传，系统会以LogsetName为名称来创建新的日志集并投递日志。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 日志主题名称。**TopicId**为空时必传，系统会以TopicName为名称来创建新的日志主题并投递日志。 
     * @return TopicName 日志主题名称。**TopicId**为空时必传，系统会以TopicName为名称来创建新的日志主题并投递日志。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称。**TopicId**为空时必传，系统会以TopicName为名称来创建新的日志主题并投递日志。
     * @param TopicName 日志主题名称。**TopicId**为空时必传，系统会以TopicName为名称来创建新的日志主题并投递日志。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志集所在地域，不传默认使用实例所在地域。 
     * @return LogRegion 日志集所在地域，不传默认使用实例所在地域。
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set 日志集所在地域，不传默认使用实例所在地域。
     * @param LogRegion 日志集所在地域，不传默认使用实例所在地域。
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get 日志存储时间，默认为30天，可选范围1-3600天。 
     * @return Period 日志存储时间，默认为30天，可选范围1-3600天。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志存储时间，默认为30天，可选范围1-3600天。
     * @param Period 日志存储时间，默认为30天，可选范围1-3600天。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 创建日志主题时，是否创建索引。 
     * @return CreateIndex 创建日志主题时，是否创建索引。
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set 创建日志主题时，是否创建索引。
     * @param CreateIndex 创建日志主题时，是否创建索引。
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    public ModifyInstanceLogDeliveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceLogDeliveryRequest(ModifyInstanceLogDeliveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.CreateIndex != null) {
            this.CreateIndex = new Boolean(source.CreateIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CreateIndex", this.CreateIndex);

    }
}

