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

public class ModifyClusterSlaveZoneRequest extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 旧从可用区
    */
    @SerializedName("OldSlaveZone")
    @Expose
    private String OldSlaveZone;

    /**
    * 新从可用区
    */
    @SerializedName("NewSlaveZone")
    @Expose
    private String NewSlaveZone;

    /**
    * binlog同步方式。默认值：async。可选值：sync、semisync、async
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * 半同步超时时间，单位ms。为保证业务稳定性，半同步复制存在退化逻辑，当主可用区集群在等待备可用区集群确认事务时若超过该超时时间，复制方式将降为异步复制。最低设置为1000ms，最高支持4294967295ms，默认10000ms。
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

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
     * Get 旧从可用区 
     * @return OldSlaveZone 旧从可用区
     */
    public String getOldSlaveZone() {
        return this.OldSlaveZone;
    }

    /**
     * Set 旧从可用区
     * @param OldSlaveZone 旧从可用区
     */
    public void setOldSlaveZone(String OldSlaveZone) {
        this.OldSlaveZone = OldSlaveZone;
    }

    /**
     * Get 新从可用区 
     * @return NewSlaveZone 新从可用区
     */
    public String getNewSlaveZone() {
        return this.NewSlaveZone;
    }

    /**
     * Set 新从可用区
     * @param NewSlaveZone 新从可用区
     */
    public void setNewSlaveZone(String NewSlaveZone) {
        this.NewSlaveZone = NewSlaveZone;
    }

    /**
     * Get binlog同步方式。默认值：async。可选值：sync、semisync、async 
     * @return BinlogSyncWay binlog同步方式。默认值：async。可选值：sync、semisync、async
     */
    public String getBinlogSyncWay() {
        return this.BinlogSyncWay;
    }

    /**
     * Set binlog同步方式。默认值：async。可选值：sync、semisync、async
     * @param BinlogSyncWay binlog同步方式。默认值：async。可选值：sync、semisync、async
     */
    public void setBinlogSyncWay(String BinlogSyncWay) {
        this.BinlogSyncWay = BinlogSyncWay;
    }

    /**
     * Get 半同步超时时间，单位ms。为保证业务稳定性，半同步复制存在退化逻辑，当主可用区集群在等待备可用区集群确认事务时若超过该超时时间，复制方式将降为异步复制。最低设置为1000ms，最高支持4294967295ms，默认10000ms。 
     * @return SemiSyncTimeout 半同步超时时间，单位ms。为保证业务稳定性，半同步复制存在退化逻辑，当主可用区集群在等待备可用区集群确认事务时若超过该超时时间，复制方式将降为异步复制。最低设置为1000ms，最高支持4294967295ms，默认10000ms。
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set 半同步超时时间，单位ms。为保证业务稳定性，半同步复制存在退化逻辑，当主可用区集群在等待备可用区集群确认事务时若超过该超时时间，复制方式将降为异步复制。最低设置为1000ms，最高支持4294967295ms，默认10000ms。
     * @param SemiSyncTimeout 半同步超时时间，单位ms。为保证业务稳定性，半同步复制存在退化逻辑，当主可用区集群在等待备可用区集群确认事务时若超过该超时时间，复制方式将降为异步复制。最低设置为1000ms，最高支持4294967295ms，默认10000ms。
     */
    public void setSemiSyncTimeout(Long SemiSyncTimeout) {
        this.SemiSyncTimeout = SemiSyncTimeout;
    }

    public ModifyClusterSlaveZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterSlaveZoneRequest(ModifyClusterSlaveZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OldSlaveZone != null) {
            this.OldSlaveZone = new String(source.OldSlaveZone);
        }
        if (source.NewSlaveZone != null) {
            this.NewSlaveZone = new String(source.NewSlaveZone);
        }
        if (source.BinlogSyncWay != null) {
            this.BinlogSyncWay = new String(source.BinlogSyncWay);
        }
        if (source.SemiSyncTimeout != null) {
            this.SemiSyncTimeout = new Long(source.SemiSyncTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OldSlaveZone", this.OldSlaveZone);
        this.setParamSimple(map, prefix + "NewSlaveZone", this.NewSlaveZone);
        this.setParamSimple(map, prefix + "BinlogSyncWay", this.BinlogSyncWay);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);

    }
}

