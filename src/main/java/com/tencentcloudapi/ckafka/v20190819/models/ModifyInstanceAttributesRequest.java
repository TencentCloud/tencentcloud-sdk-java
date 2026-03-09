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
    * <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例日志的最长保留时间，单位分钟，最大90天，最小为1min</p>
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>ckafka集群实例Name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例配置</p>
    */
    @SerializedName("Config")
    @Expose
    private ModifyInstanceAttributesConfig Config;

    /**
    * <p>动态消息保留策略配置</p>
    */
    @SerializedName("DynamicRetentionConfig")
    @Expose
    private DynamicRetentionTime DynamicRetentionConfig;

    /**
    * <p>用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒</p>
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>动态硬盘扩容策略配置</p>
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * <p>实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)</p>
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * <p>是否允许未同步的副本选为 leader: 1 开启  0 关闭</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>实例删除保护开关: 1 开启  0 关闭</p>
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
    * <p>实例级别消息保留大小</p>单位：byte<br>默认值：-1<br><p>实例级别消息保留大小</p>
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * <p>是否封禁高风险admin接口; true则封禁高风险adminApi; 关闭后不支持打开,仅专业版支持; 默认是false 对高风险admin接口不做处理</p>
    */
    @SerializedName("AdminSecurity")
    @Expose
    private Boolean AdminSecurity;

    /**
    * <p>事务ID最大空闲时间，超时未提交的事务将被标记为过期</p>取值范围：[3600000, 604800000]<br>单位：ms
    */
    @SerializedName("TransactionalIdExpirationMs")
    @Expose
    private Long TransactionalIdExpirationMs;

    /**
     * Get <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例日志的最长保留时间，单位分钟，最大90天，最小为1min</p> 
     * @return MsgRetentionTime <p>实例日志的最长保留时间，单位分钟，最大90天，最小为1min</p>
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <p>实例日志的最长保留时间，单位分钟，最大90天，最小为1min</p>
     * @param MsgRetentionTime <p>实例日志的最长保留时间，单位分钟，最大90天，最小为1min</p>
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>ckafka集群实例Name</p> 
     * @return InstanceName <p>ckafka集群实例Name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka集群实例Name</p>
     * @param InstanceName <p>ckafka集群实例Name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例配置</p> 
     * @return Config <p>实例配置</p>
     */
    public ModifyInstanceAttributesConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>实例配置</p>
     * @param Config <p>实例配置</p>
     */
    public void setConfig(ModifyInstanceAttributesConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>动态消息保留策略配置</p> 
     * @return DynamicRetentionConfig <p>动态消息保留策略配置</p>
     */
    public DynamicRetentionTime getDynamicRetentionConfig() {
        return this.DynamicRetentionConfig;
    }

    /**
     * Set <p>动态消息保留策略配置</p>
     * @param DynamicRetentionConfig <p>动态消息保留策略配置</p>
     */
    public void setDynamicRetentionConfig(DynamicRetentionTime DynamicRetentionConfig) {
        this.DynamicRetentionConfig = DynamicRetentionConfig;
    }

    /**
     * Get <p>用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒</p> 
     * @return RebalanceTime <p>用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒</p>
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set <p>用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒</p>
     * @param RebalanceTime <p>用于修改升级版本或升配定时任务的执行时间，Unix时间戳，精确到秒</p>
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p> 
     * @return PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     * @param PublicNetwork <p>公网带宽 最小3Mbps  最大999Mbps 仅专业版支持填写</p>
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>动态硬盘扩容策略配置</p> 
     * @return DynamicDiskConfig <p>动态硬盘扩容策略配置</p>
     * @deprecated
     */
    @Deprecated
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set <p>动态硬盘扩容策略配置</p>
     * @param DynamicDiskConfig <p>动态硬盘扩容策略配置</p>
     * @deprecated
     */
    @Deprecated
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get <p>实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)</p> 
     * @return MaxMessageByte <p>实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)</p>
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set <p>实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)</p>
     * @param MaxMessageByte <p>实例级别单条消息大小（单位byte)  最大 12582912(不包含)  最小1024(不包含)</p>
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get <p>是否允许未同步的副本选为 leader: 1 开启  0 关闭</p> 
     * @return UncleanLeaderElectionEnable <p>是否允许未同步的副本选为 leader: 1 开启  0 关闭</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>是否允许未同步的副本选为 leader: 1 开启  0 关闭</p>
     * @param UncleanLeaderElectionEnable <p>是否允许未同步的副本选为 leader: 1 开启  0 关闭</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>实例删除保护开关: 1 开启  0 关闭</p> 
     * @return DeleteProtectionEnable <p>实例删除保护开关: 1 开启  0 关闭</p>
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set <p>实例删除保护开关: 1 开启  0 关闭</p>
     * @param DeleteProtectionEnable <p>实例删除保护开关: 1 开启  0 关闭</p>
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
    }

    /**
     * Get <p>实例级别消息保留大小</p>单位：byte<br>默认值：-1<br><p>实例级别消息保留大小</p> 
     * @return RetentionBytes <p>实例级别消息保留大小</p>单位：byte<br>默认值：-1<br><p>实例级别消息保留大小</p>
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set <p>实例级别消息保留大小</p>单位：byte<br>默认值：-1<br><p>实例级别消息保留大小</p>
     * @param RetentionBytes <p>实例级别消息保留大小</p>单位：byte<br>默认值：-1<br><p>实例级别消息保留大小</p>
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get <p>是否封禁高风险admin接口; true则封禁高风险adminApi; 关闭后不支持打开,仅专业版支持; 默认是false 对高风险admin接口不做处理</p> 
     * @return AdminSecurity <p>是否封禁高风险admin接口; true则封禁高风险adminApi; 关闭后不支持打开,仅专业版支持; 默认是false 对高风险admin接口不做处理</p>
     */
    public Boolean getAdminSecurity() {
        return this.AdminSecurity;
    }

    /**
     * Set <p>是否封禁高风险admin接口; true则封禁高风险adminApi; 关闭后不支持打开,仅专业版支持; 默认是false 对高风险admin接口不做处理</p>
     * @param AdminSecurity <p>是否封禁高风险admin接口; true则封禁高风险adminApi; 关闭后不支持打开,仅专业版支持; 默认是false 对高风险admin接口不做处理</p>
     */
    public void setAdminSecurity(Boolean AdminSecurity) {
        this.AdminSecurity = AdminSecurity;
    }

    /**
     * Get <p>事务ID最大空闲时间，超时未提交的事务将被标记为过期</p>取值范围：[3600000, 604800000]<br>单位：ms 
     * @return TransactionalIdExpirationMs <p>事务ID最大空闲时间，超时未提交的事务将被标记为过期</p>取值范围：[3600000, 604800000]<br>单位：ms
     */
    public Long getTransactionalIdExpirationMs() {
        return this.TransactionalIdExpirationMs;
    }

    /**
     * Set <p>事务ID最大空闲时间，超时未提交的事务将被标记为过期</p>取值范围：[3600000, 604800000]<br>单位：ms
     * @param TransactionalIdExpirationMs <p>事务ID最大空闲时间，超时未提交的事务将被标记为过期</p>取值范围：[3600000, 604800000]<br>单位：ms
     */
    public void setTransactionalIdExpirationMs(Long TransactionalIdExpirationMs) {
        this.TransactionalIdExpirationMs = TransactionalIdExpirationMs;
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
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.AdminSecurity != null) {
            this.AdminSecurity = new Boolean(source.AdminSecurity);
        }
        if (source.TransactionalIdExpirationMs != null) {
            this.TransactionalIdExpirationMs = new Long(source.TransactionalIdExpirationMs);
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
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "AdminSecurity", this.AdminSecurity);
        this.setParamSimple(map, prefix + "TransactionalIdExpirationMs", this.TransactionalIdExpirationMs);

    }
}

