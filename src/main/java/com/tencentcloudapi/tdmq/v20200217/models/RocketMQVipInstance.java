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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQVipInstance extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例版本</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>节点数量</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>实例配置规格名称</p>
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * <p>峰值TPS</p>
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * <p>峰值带宽，Mbps为单位</p>
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * <p>存储容量，GB为单位</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>实例到期时间，毫秒为单位</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>0-后付费，1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>实例规格</p><p>枚举值：</p><ul><li>rocket-vip-basic-0： 通用集群</li><li>rocket-vip-basic-1： 专享集群-基础型</li><li>rocket-vip-basic-2： 专享集群-标准型</li><li>rocket-vip-basic-3： 专享集群-高阶I型</li><li>rocket-vip-basic-4： 专享集群-高阶II型</li></ul>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>最大可设置消息保留时间，小时为单位</p>
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * <p>最小可设置消息保留时间，小时为单位</p>
    */
    @SerializedName("MinRetention")
    @Expose
    private Long MinRetention;

    /**
    * <p>实例消息保留时间，小时为单位</p>
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * <p>是否开启ACL鉴权</p>
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * <p>销毁时间</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例版本</p> 
     * @return InstanceVersion <p>实例版本</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>实例版本</p>
     * @param InstanceVersion <p>实例版本</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p> 
     * @return Status <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
     * @param Status <p>实例状态，0表示创建中，1表示正常，2表示隔离中，3表示已销毁，4 - 异常, 5 - 发货失败，6 - 变配中，7 - 变配失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>节点数量</p> 
     * @return NodeCount <p>节点数量</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点数量</p>
     * @param NodeCount <p>节点数量</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>实例配置规格名称</p> 
     * @return ConfigDisplay <p>实例配置规格名称</p>
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set <p>实例配置规格名称</p>
     * @param ConfigDisplay <p>实例配置规格名称</p>
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get <p>峰值TPS</p> 
     * @return MaxTps <p>峰值TPS</p>
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set <p>峰值TPS</p>
     * @param MaxTps <p>峰值TPS</p>
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get <p>峰值带宽，Mbps为单位</p> 
     * @return MaxBandWidth <p>峰值带宽，Mbps为单位</p>
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set <p>峰值带宽，Mbps为单位</p>
     * @param MaxBandWidth <p>峰值带宽，Mbps为单位</p>
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get <p>存储容量，GB为单位</p> 
     * @return MaxStorage <p>存储容量，GB为单位</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>存储容量，GB为单位</p>
     * @param MaxStorage <p>存储容量，GB为单位</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>实例到期时间，毫秒为单位</p> 
     * @return ExpireTime <p>实例到期时间，毫秒为单位</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例到期时间，毫秒为单位</p>
     * @param ExpireTime <p>实例到期时间，毫秒为单位</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p> 
     * @return AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     * @param AutoRenewFlag <p>自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>0-后付费，1-预付费</p> 
     * @return PayMode <p>0-后付费，1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>0-后付费，1-预付费</p>
     * @param PayMode <p>0-后付费，1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>实例规格</p><p>枚举值：</p><ul><li>rocket-vip-basic-0： 通用集群</li><li>rocket-vip-basic-1： 专享集群-基础型</li><li>rocket-vip-basic-2： 专享集群-标准型</li><li>rocket-vip-basic-3： 专享集群-高阶I型</li><li>rocket-vip-basic-4： 专享集群-高阶II型</li></ul> 
     * @return SpecName <p>实例规格</p><p>枚举值：</p><ul><li>rocket-vip-basic-0： 通用集群</li><li>rocket-vip-basic-1： 专享集群-基础型</li><li>rocket-vip-basic-2： 专享集群-标准型</li><li>rocket-vip-basic-3： 专享集群-高阶I型</li><li>rocket-vip-basic-4： 专享集群-高阶II型</li></ul>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>实例规格</p><p>枚举值：</p><ul><li>rocket-vip-basic-0： 通用集群</li><li>rocket-vip-basic-1： 专享集群-基础型</li><li>rocket-vip-basic-2： 专享集群-标准型</li><li>rocket-vip-basic-3： 专享集群-高阶I型</li><li>rocket-vip-basic-4： 专享集群-高阶II型</li></ul>
     * @param SpecName <p>实例规格</p><p>枚举值：</p><ul><li>rocket-vip-basic-0： 通用集群</li><li>rocket-vip-basic-1： 专享集群-基础型</li><li>rocket-vip-basic-2： 专享集群-标准型</li><li>rocket-vip-basic-3： 专享集群-高阶I型</li><li>rocket-vip-basic-4： 专享集群-高阶II型</li></ul>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>最大可设置消息保留时间，小时为单位</p> 
     * @return MaxRetention <p>最大可设置消息保留时间，小时为单位</p>
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set <p>最大可设置消息保留时间，小时为单位</p>
     * @param MaxRetention <p>最大可设置消息保留时间，小时为单位</p>
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get <p>最小可设置消息保留时间，小时为单位</p> 
     * @return MinRetention <p>最小可设置消息保留时间，小时为单位</p>
     */
    public Long getMinRetention() {
        return this.MinRetention;
    }

    /**
     * Set <p>最小可设置消息保留时间，小时为单位</p>
     * @param MinRetention <p>最小可设置消息保留时间，小时为单位</p>
     */
    public void setMinRetention(Long MinRetention) {
        this.MinRetention = MinRetention;
    }

    /**
     * Get <p>实例消息保留时间，小时为单位</p> 
     * @return Retention <p>实例消息保留时间，小时为单位</p>
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set <p>实例消息保留时间，小时为单位</p>
     * @param Retention <p>实例消息保留时间，小时为单位</p>
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get <p>是否开启ACL鉴权</p> 
     * @return AclEnabled <p>是否开启ACL鉴权</p>
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set <p>是否开启ACL鉴权</p>
     * @param AclEnabled <p>是否开启ACL鉴权</p>
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get <p>销毁时间</p> 
     * @return DestroyTime <p>销毁时间</p>
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>销毁时间</p>
     * @param DestroyTime <p>销毁时间</p>
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    public RocketMQVipInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQVipInstance(RocketMQVipInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.MinRetention != null) {
            this.MinRetention = new Long(source.MinRetention);
        }
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new Long(source.DestroyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "MinRetention", this.MinRetention);
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);

    }
}

