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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterStatus extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群状态
运行中：Running
集群等级中：ClusterLevelUpgrading
集群升级中：Upgrading
集群控制面扩容中：MasterScaling
托管集群修改参数中：RuntimeUpgrading
节点升级中：NodeUpgrading
集群删除中：Deleting
集群创建中：Creating
集群已隔离：Isolated
集群升级暂停：Pause
集群执行隔离：ResourceIsolate
集群隔离：ResourceIsolated
集群执行冲正：ResourceReverse
集群冲正：ResourceReversal
集群执行销毁：ResourceDestroy
集群销毁：ResourceDestroyed
集群变配交易中：ClusterLevelTrading
    */
    @SerializedName("ClusterState")
    @Expose
    private String ClusterState;

    /**
    * 集群下机器实例的状态
节点全部正常：AllNormal
节点全部异常：
AllAbnormal
节点部分异常：PartialAbnormal
    */
    @SerializedName("ClusterInstanceState")
    @Expose
    private String ClusterInstanceState;

    /**
    * 集群是否开启监控
    */
    @SerializedName("ClusterBMonitor")
    @Expose
    private Boolean ClusterBMonitor;

    /**
    * 集群创建中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
    */
    @SerializedName("ClusterInitNodeNum")
    @Expose
    private Long ClusterInitNodeNum;

    /**
    * 集群运行中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
    */
    @SerializedName("ClusterRunningNodeNum")
    @Expose
    private Long ClusterRunningNodeNum;

    /**
    * 集群异常的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
    */
    @SerializedName("ClusterFailedNodeNum")
    @Expose
    private Long ClusterFailedNodeNum;

    /**
    * 集群已关机的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
    */
    @SerializedName("ClusterClosedNodeNum")
    @Expose
    private Long ClusterClosedNodeNum;

    /**
    * 集群关机中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
    */
    @SerializedName("ClusterClosingNodeNum")
    @Expose
    private Long ClusterClosingNodeNum;

    /**
    * 集群是否开启删除保护
    */
    @SerializedName("ClusterDeletionProtection")
    @Expose
    private Boolean ClusterDeletionProtection;

    /**
    * 集群是否可审计
    */
    @SerializedName("ClusterAuditEnabled")
    @Expose
    private Boolean ClusterAuditEnabled;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群状态
运行中：Running
集群等级中：ClusterLevelUpgrading
集群升级中：Upgrading
集群控制面扩容中：MasterScaling
托管集群修改参数中：RuntimeUpgrading
节点升级中：NodeUpgrading
集群删除中：Deleting
集群创建中：Creating
集群已隔离：Isolated
集群升级暂停：Pause
集群执行隔离：ResourceIsolate
集群隔离：ResourceIsolated
集群执行冲正：ResourceReverse
集群冲正：ResourceReversal
集群执行销毁：ResourceDestroy
集群销毁：ResourceDestroyed
集群变配交易中：ClusterLevelTrading 
     * @return ClusterState 集群状态
运行中：Running
集群等级中：ClusterLevelUpgrading
集群升级中：Upgrading
集群控制面扩容中：MasterScaling
托管集群修改参数中：RuntimeUpgrading
节点升级中：NodeUpgrading
集群删除中：Deleting
集群创建中：Creating
集群已隔离：Isolated
集群升级暂停：Pause
集群执行隔离：ResourceIsolate
集群隔离：ResourceIsolated
集群执行冲正：ResourceReverse
集群冲正：ResourceReversal
集群执行销毁：ResourceDestroy
集群销毁：ResourceDestroyed
集群变配交易中：ClusterLevelTrading
     */
    public String getClusterState() {
        return this.ClusterState;
    }

    /**
     * Set 集群状态
运行中：Running
集群等级中：ClusterLevelUpgrading
集群升级中：Upgrading
集群控制面扩容中：MasterScaling
托管集群修改参数中：RuntimeUpgrading
节点升级中：NodeUpgrading
集群删除中：Deleting
集群创建中：Creating
集群已隔离：Isolated
集群升级暂停：Pause
集群执行隔离：ResourceIsolate
集群隔离：ResourceIsolated
集群执行冲正：ResourceReverse
集群冲正：ResourceReversal
集群执行销毁：ResourceDestroy
集群销毁：ResourceDestroyed
集群变配交易中：ClusterLevelTrading
     * @param ClusterState 集群状态
运行中：Running
集群等级中：ClusterLevelUpgrading
集群升级中：Upgrading
集群控制面扩容中：MasterScaling
托管集群修改参数中：RuntimeUpgrading
节点升级中：NodeUpgrading
集群删除中：Deleting
集群创建中：Creating
集群已隔离：Isolated
集群升级暂停：Pause
集群执行隔离：ResourceIsolate
集群隔离：ResourceIsolated
集群执行冲正：ResourceReverse
集群冲正：ResourceReversal
集群执行销毁：ResourceDestroy
集群销毁：ResourceDestroyed
集群变配交易中：ClusterLevelTrading
     */
    public void setClusterState(String ClusterState) {
        this.ClusterState = ClusterState;
    }

    /**
     * Get 集群下机器实例的状态
节点全部正常：AllNormal
节点全部异常：
AllAbnormal
节点部分异常：PartialAbnormal 
     * @return ClusterInstanceState 集群下机器实例的状态
节点全部正常：AllNormal
节点全部异常：
AllAbnormal
节点部分异常：PartialAbnormal
     */
    public String getClusterInstanceState() {
        return this.ClusterInstanceState;
    }

    /**
     * Set 集群下机器实例的状态
节点全部正常：AllNormal
节点全部异常：
AllAbnormal
节点部分异常：PartialAbnormal
     * @param ClusterInstanceState 集群下机器实例的状态
节点全部正常：AllNormal
节点全部异常：
AllAbnormal
节点部分异常：PartialAbnormal
     */
    public void setClusterInstanceState(String ClusterInstanceState) {
        this.ClusterInstanceState = ClusterInstanceState;
    }

    /**
     * Get 集群是否开启监控 
     * @return ClusterBMonitor 集群是否开启监控
     */
    public Boolean getClusterBMonitor() {
        return this.ClusterBMonitor;
    }

    /**
     * Set 集群是否开启监控
     * @param ClusterBMonitor 集群是否开启监控
     */
    public void setClusterBMonitor(Boolean ClusterBMonitor) {
        this.ClusterBMonitor = ClusterBMonitor;
    }

    /**
     * Get 集群创建中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败 
     * @return ClusterInitNodeNum 集群创建中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public Long getClusterInitNodeNum() {
        return this.ClusterInitNodeNum;
    }

    /**
     * Set 集群创建中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     * @param ClusterInitNodeNum 集群创建中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public void setClusterInitNodeNum(Long ClusterInitNodeNum) {
        this.ClusterInitNodeNum = ClusterInitNodeNum;
    }

    /**
     * Get 集群运行中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败 
     * @return ClusterRunningNodeNum 集群运行中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public Long getClusterRunningNodeNum() {
        return this.ClusterRunningNodeNum;
    }

    /**
     * Set 集群运行中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     * @param ClusterRunningNodeNum 集群运行中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public void setClusterRunningNodeNum(Long ClusterRunningNodeNum) {
        this.ClusterRunningNodeNum = ClusterRunningNodeNum;
    }

    /**
     * Get 集群异常的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败 
     * @return ClusterFailedNodeNum 集群异常的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public Long getClusterFailedNodeNum() {
        return this.ClusterFailedNodeNum;
    }

    /**
     * Set 集群异常的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     * @param ClusterFailedNodeNum 集群异常的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public void setClusterFailedNodeNum(Long ClusterFailedNodeNum) {
        this.ClusterFailedNodeNum = ClusterFailedNodeNum;
    }

    /**
     * Get 集群已关机的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败 
     * @return ClusterClosedNodeNum 集群已关机的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public Long getClusterClosedNodeNum() {
        return this.ClusterClosedNodeNum;
    }

    /**
     * Set 集群已关机的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     * @param ClusterClosedNodeNum 集群已关机的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public void setClusterClosedNodeNum(Long ClusterClosedNodeNum) {
        this.ClusterClosedNodeNum = ClusterClosedNodeNum;
    }

    /**
     * Get 集群关机中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败 
     * @return ClusterClosingNodeNum 集群关机中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public Long getClusterClosingNodeNum() {
        return this.ClusterClosingNodeNum;
    }

    /**
     * Set 集群关机中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     * @param ClusterClosingNodeNum 集群关机中的节点数，-1表示获取节点状态超时，-2表示获取节点状态失败
     */
    public void setClusterClosingNodeNum(Long ClusterClosingNodeNum) {
        this.ClusterClosingNodeNum = ClusterClosingNodeNum;
    }

    /**
     * Get 集群是否开启删除保护 
     * @return ClusterDeletionProtection 集群是否开启删除保护
     */
    public Boolean getClusterDeletionProtection() {
        return this.ClusterDeletionProtection;
    }

    /**
     * Set 集群是否开启删除保护
     * @param ClusterDeletionProtection 集群是否开启删除保护
     */
    public void setClusterDeletionProtection(Boolean ClusterDeletionProtection) {
        this.ClusterDeletionProtection = ClusterDeletionProtection;
    }

    /**
     * Get 集群是否可审计 
     * @return ClusterAuditEnabled 集群是否可审计
     */
    public Boolean getClusterAuditEnabled() {
        return this.ClusterAuditEnabled;
    }

    /**
     * Set 集群是否可审计
     * @param ClusterAuditEnabled 集群是否可审计
     */
    public void setClusterAuditEnabled(Boolean ClusterAuditEnabled) {
        this.ClusterAuditEnabled = ClusterAuditEnabled;
    }

    public ClusterStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterStatus(ClusterStatus source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterState != null) {
            this.ClusterState = new String(source.ClusterState);
        }
        if (source.ClusterInstanceState != null) {
            this.ClusterInstanceState = new String(source.ClusterInstanceState);
        }
        if (source.ClusterBMonitor != null) {
            this.ClusterBMonitor = new Boolean(source.ClusterBMonitor);
        }
        if (source.ClusterInitNodeNum != null) {
            this.ClusterInitNodeNum = new Long(source.ClusterInitNodeNum);
        }
        if (source.ClusterRunningNodeNum != null) {
            this.ClusterRunningNodeNum = new Long(source.ClusterRunningNodeNum);
        }
        if (source.ClusterFailedNodeNum != null) {
            this.ClusterFailedNodeNum = new Long(source.ClusterFailedNodeNum);
        }
        if (source.ClusterClosedNodeNum != null) {
            this.ClusterClosedNodeNum = new Long(source.ClusterClosedNodeNum);
        }
        if (source.ClusterClosingNodeNum != null) {
            this.ClusterClosingNodeNum = new Long(source.ClusterClosingNodeNum);
        }
        if (source.ClusterDeletionProtection != null) {
            this.ClusterDeletionProtection = new Boolean(source.ClusterDeletionProtection);
        }
        if (source.ClusterAuditEnabled != null) {
            this.ClusterAuditEnabled = new Boolean(source.ClusterAuditEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterState", this.ClusterState);
        this.setParamSimple(map, prefix + "ClusterInstanceState", this.ClusterInstanceState);
        this.setParamSimple(map, prefix + "ClusterBMonitor", this.ClusterBMonitor);
        this.setParamSimple(map, prefix + "ClusterInitNodeNum", this.ClusterInitNodeNum);
        this.setParamSimple(map, prefix + "ClusterRunningNodeNum", this.ClusterRunningNodeNum);
        this.setParamSimple(map, prefix + "ClusterFailedNodeNum", this.ClusterFailedNodeNum);
        this.setParamSimple(map, prefix + "ClusterClosedNodeNum", this.ClusterClosedNodeNum);
        this.setParamSimple(map, prefix + "ClusterClosingNodeNum", this.ClusterClosingNodeNum);
        this.setParamSimple(map, prefix + "ClusterDeletionProtection", this.ClusterDeletionProtection);
        this.setParamSimple(map, prefix + "ClusterAuditEnabled", this.ClusterAuditEnabled);

    }
}

