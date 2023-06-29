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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributesRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例日志的最长保留时间，单位分钟，最大30天，0代表不开启日志保留时间回收策略
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例配置
    */
    @SerializedName("Config")
    @Expose
    private ModifyInstanceAttributesConfig Config;

    /**
    * 动态消息保留策略配置
    */
    @SerializedName("DynamicRetentionConfig")
    @Expose
    private DynamicRetentionTime DynamicRetentionConfig;

    /**
    * 升配Rebalance时间
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * 公网带宽
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * 动态硬盘扩容策略配置
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * 实例级别单条消息大小（单位byte)
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例日志的最长保留时间，单位分钟，最大30天，0代表不开启日志保留时间回收策略 
     * @return MsgRetentionTime 实例日志的最长保留时间，单位分钟，最大30天，0代表不开启日志保留时间回收策略
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 实例日志的最长保留时间，单位分钟，最大30天，0代表不开启日志保留时间回收策略
     * @param MsgRetentionTime 实例日志的最长保留时间，单位分钟，最大30天，0代表不开启日志保留时间回收策略
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例配置 
     * @return Config 实例配置
     */
    public ModifyInstanceAttributesConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 实例配置
     * @param Config 实例配置
     */
    public void setConfig(ModifyInstanceAttributesConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 动态消息保留策略配置 
     * @return DynamicRetentionConfig 动态消息保留策略配置
     */
    public DynamicRetentionTime getDynamicRetentionConfig() {
        return this.DynamicRetentionConfig;
    }

    /**
     * Set 动态消息保留策略配置
     * @param DynamicRetentionConfig 动态消息保留策略配置
     */
    public void setDynamicRetentionConfig(DynamicRetentionTime DynamicRetentionConfig) {
        this.DynamicRetentionConfig = DynamicRetentionConfig;
    }

    /**
     * Get 升配Rebalance时间 
     * @return RebalanceTime 升配Rebalance时间
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set 升配Rebalance时间
     * @param RebalanceTime 升配Rebalance时间
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get 公网带宽 
     * @return PublicNetwork 公网带宽
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽
     * @param PublicNetwork 公网带宽
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get 动态硬盘扩容策略配置 
     * @return DynamicDiskConfig 动态硬盘扩容策略配置
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set 动态硬盘扩容策略配置
     * @param DynamicDiskConfig 动态硬盘扩容策略配置
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get 实例级别单条消息大小（单位byte) 
     * @return MaxMessageByte 实例级别单条消息大小（单位byte)
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set 实例级别单条消息大小（单位byte)
     * @param MaxMessageByte 实例级别单条消息大小（单位byte)
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    public ModifyInstanceAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributesRequest(ModifyInstanceAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Config != null) {
            this.Config = new ModifyInstanceAttributesConfig(source.Config);
        }
        if (source.DynamicRetentionConfig != null) {
            this.DynamicRetentionConfig = new DynamicRetentionTime(source.DynamicRetentionConfig);
        }
        if (source.RebalanceTime != null) {
            this.RebalanceTime = new Long(source.RebalanceTime);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.DynamicDiskConfig != null) {
            this.DynamicDiskConfig = new DynamicDiskConfig(source.DynamicDiskConfig);
        }
        if (source.MaxMessageByte != null) {
            this.MaxMessageByte = new Long(source.MaxMessageByte);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "DynamicRetentionConfig.", this.DynamicRetentionConfig);
        this.setParamSimple(map, prefix + "RebalanceTime", this.RebalanceTime);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamObj(map, prefix + "DynamicDiskConfig.", this.DynamicDiskConfig);
        this.setParamSimple(map, prefix + "MaxMessageByte", this.MaxMessageByte);

    }
}

