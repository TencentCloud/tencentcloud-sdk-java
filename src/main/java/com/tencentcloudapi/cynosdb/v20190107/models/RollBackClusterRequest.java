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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollBackClusterRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 回档策略 timeRollback-按时间点回档 snapRollback-按备份文件回档
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * 备份文件ID。
回档策略为按备份文件回档时必填。
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * 期望回档时间。
回档策略为timeRollback按时间点回档时必填。
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * 期望阈值（已废弃）
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * 回档数据库列表
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * 回档数据库表列表
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * 按时间点回档模式，full: 普通; db: 快速; table: 极速  （默认是普通）
    */
    @SerializedName("RollbackMode")
    @Expose
    private String RollbackMode;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 回档策略 timeRollback-按时间点回档 snapRollback-按备份文件回档 
     * @return RollbackStrategy 回档策略 timeRollback-按时间点回档 snapRollback-按备份文件回档
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set 回档策略 timeRollback-按时间点回档 snapRollback-按备份文件回档
     * @param RollbackStrategy 回档策略 timeRollback-按时间点回档 snapRollback-按备份文件回档
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get 备份文件ID。
回档策略为按备份文件回档时必填。 
     * @return RollbackId 备份文件ID。
回档策略为按备份文件回档时必填。
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set 备份文件ID。
回档策略为按备份文件回档时必填。
     * @param RollbackId 备份文件ID。
回档策略为按备份文件回档时必填。
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get 期望回档时间。
回档策略为timeRollback按时间点回档时必填。 
     * @return ExpectTime 期望回档时间。
回档策略为timeRollback按时间点回档时必填。
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set 期望回档时间。
回档策略为timeRollback按时间点回档时必填。
     * @param ExpectTime 期望回档时间。
回档策略为timeRollback按时间点回档时必填。
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get 期望阈值（已废弃） 
     * @return ExpectTimeThresh 期望阈值（已废弃）
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set 期望阈值（已废弃）
     * @param ExpectTimeThresh 期望阈值（已废弃）
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get 回档数据库列表 
     * @return RollbackDatabases 回档数据库列表
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set 回档数据库列表
     * @param RollbackDatabases 回档数据库列表
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get 回档数据库表列表 
     * @return RollbackTables 回档数据库表列表
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set 回档数据库表列表
     * @param RollbackTables 回档数据库表列表
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get 按时间点回档模式，full: 普通; db: 快速; table: 极速  （默认是普通） 
     * @return RollbackMode 按时间点回档模式，full: 普通; db: 快速; table: 极速  （默认是普通）
     */
    public String getRollbackMode() {
        return this.RollbackMode;
    }

    /**
     * Set 按时间点回档模式，full: 普通; db: 快速; table: 极速  （默认是普通）
     * @param RollbackMode 按时间点回档模式，full: 普通; db: 快速; table: 极速  （默认是普通）
     */
    public void setRollbackMode(String RollbackMode) {
        this.RollbackMode = RollbackMode;
    }

    public RollBackClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollBackClusterRequest(RollBackClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.ExpectTimeThresh != null) {
            this.ExpectTimeThresh = new Long(source.ExpectTimeThresh);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.RollbackMode != null) {
            this.RollbackMode = new String(source.RollbackMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "ExpectTimeThresh", this.ExpectTimeThresh);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamSimple(map, prefix + "RollbackMode", this.RollbackMode);

    }
}

