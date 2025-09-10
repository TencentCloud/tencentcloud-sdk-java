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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributesRequest extends AbstractModel {

    /**
    * ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例日志的最长保留时间，单位分钟，最大90天，最小为1min
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * ckafka集群实例Name
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
    * 用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * 公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写
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
    * 实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * 是否允许未同步的副本选为 leader: 1 开启  0 关闭
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * 实例删除保护开关: 1 开启  0 关闭
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
     * Get ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例日志的最长保留时间，单位分钟，最大90天，最小为1min 
     * @return MsgRetentionTime 实例日志的最长保留时间，单位分钟，最大90天，最小为1min
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 实例日志的最长保留时间，单位分钟，最大90天，最小为1min
     * @param MsgRetentionTime 实例日志的最长保留时间，单位分钟，最大90天，最小为1min
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get ckafka集群实例Name 
     * @return InstanceName ckafka集群实例Name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set ckafka集群实例Name
     * @param InstanceName ckafka集群实例Name
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
     * Get 用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒 
     * @return RebalanceTime 用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set 用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒
     * @param RebalanceTime 用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get 公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写 
     * @return PublicNetwork 公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写
     * @param PublicNetwork 公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get 动态硬盘扩容策略配置 
     * @return DynamicDiskConfig 动态硬盘扩容策略配置
     * @deprecated
     */
    @Deprecated
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set 动态硬盘扩容策略配置
     * @param DynamicDiskConfig 动态硬盘扩容策略配置
     * @deprecated
     */
    @Deprecated
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get 实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含) 
     * @return MaxMessageByte 实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set 实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)
     * @param MaxMessageByte 实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get 是否允许未同步的副本选为 leader: 1 开启  0 关闭 
     * @return UncleanLeaderElectionEnable 是否允许未同步的副本选为 leader: 1 开启  0 关闭
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 是否允许未同步的副本选为 leader: 1 开启  0 关闭
     * @param UncleanLeaderElectionEnable 是否允许未同步的副本选为 leader: 1 开启  0 关闭
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get 实例删除保护开关: 1 开启  0 关闭 
     * @return DeleteProtectionEnable 实例删除保护开关: 1 开启  0 关闭
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set 实例删除保护开关: 1 开启  0 关闭
     * @param DeleteProtectionEnable 实例删除保护开关: 1 开启  0 关闭
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
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
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.DeleteProtectionEnable != null) {
            this.DeleteProtectionEnable = new Long(source.DeleteProtectionEnable);
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
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "DeleteProtectionEnable", this.DeleteProtectionEnable);

    }
}

