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

public class AddClusterSlaveZoneRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 从可用区
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

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
     * Get 从可用区 
     * @return SlaveZone 从可用区
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 从可用区
     * @param SlaveZone 从可用区
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
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

    public AddClusterSlaveZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddClusterSlaveZoneRequest(AddClusterSlaveZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
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
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BinlogSyncWay", this.BinlogSyncWay);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);

    }
}

