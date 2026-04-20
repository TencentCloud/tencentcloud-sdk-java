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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedGroup extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 共享订阅组名
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * 共享组消费负载均衡策略 1.RANDOM 2.HASH_PARTITION
    */
    @SerializedName("LbStrategy")
    @Expose
    private Long LbStrategy;

    /**
    * HASH_PARTITION 策略下生效，表示Client掉线或新Client上线加入共享订阅组消费的延迟时间。
范围：0～600秒
    */
    @SerializedName("ExpiryInterval")
    @Expose
    private Long ExpiryInterval;

    /**
    * 备注，长度不超过128个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间，毫秒级时间戳 。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 上次更新时间，毫秒级时间戳 。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 腾讯云MQTT实例ID 
     * @return InstanceId 腾讯云MQTT实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID
     * @param InstanceId 腾讯云MQTT实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 共享订阅组名 
     * @return SharedName 共享订阅组名
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set 共享订阅组名
     * @param SharedName 共享订阅组名
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get 共享组消费负载均衡策略 1.RANDOM 2.HASH_PARTITION 
     * @return LbStrategy 共享组消费负载均衡策略 1.RANDOM 2.HASH_PARTITION
     */
    public Long getLbStrategy() {
        return this.LbStrategy;
    }

    /**
     * Set 共享组消费负载均衡策略 1.RANDOM 2.HASH_PARTITION
     * @param LbStrategy 共享组消费负载均衡策略 1.RANDOM 2.HASH_PARTITION
     */
    public void setLbStrategy(Long LbStrategy) {
        this.LbStrategy = LbStrategy;
    }

    /**
     * Get HASH_PARTITION 策略下生效，表示Client掉线或新Client上线加入共享订阅组消费的延迟时间。
范围：0～600秒 
     * @return ExpiryInterval HASH_PARTITION 策略下生效，表示Client掉线或新Client上线加入共享订阅组消费的延迟时间。
范围：0～600秒
     */
    public Long getExpiryInterval() {
        return this.ExpiryInterval;
    }

    /**
     * Set HASH_PARTITION 策略下生效，表示Client掉线或新Client上线加入共享订阅组消费的延迟时间。
范围：0～600秒
     * @param ExpiryInterval HASH_PARTITION 策略下生效，表示Client掉线或新Client上线加入共享订阅组消费的延迟时间。
范围：0～600秒
     */
    public void setExpiryInterval(Long ExpiryInterval) {
        this.ExpiryInterval = ExpiryInterval;
    }

    /**
     * Get 备注，长度不超过128个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注，长度不超过128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，长度不超过128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注，长度不超过128个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间，毫秒级时间戳 。 
     * @return CreateTime 创建时间，毫秒级时间戳 。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒级时间戳 。
     * @param CreateTime 创建时间，毫秒级时间戳 。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 上次更新时间，毫秒级时间戳 。 
     * @return UpdateTime 上次更新时间，毫秒级时间戳 。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 上次更新时间，毫秒级时间戳 。
     * @param UpdateTime 上次更新时间，毫秒级时间戳 。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SharedGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedGroup(SharedGroup source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.LbStrategy != null) {
            this.LbStrategy = new Long(source.LbStrategy);
        }
        if (source.ExpiryInterval != null) {
            this.ExpiryInterval = new Long(source.ExpiryInterval);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamSimple(map, prefix + "LbStrategy", this.LbStrategy);
        this.setParamSimple(map, prefix + "ExpiryInterval", this.ExpiryInterval);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

