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

public class SlaveZoneAttrItem extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * binlog同步方式
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * 半同步超时时间，单位ms
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get binlog同步方式 
     * @return BinlogSyncWay binlog同步方式
     */
    public String getBinlogSyncWay() {
        return this.BinlogSyncWay;
    }

    /**
     * Set binlog同步方式
     * @param BinlogSyncWay binlog同步方式
     */
    public void setBinlogSyncWay(String BinlogSyncWay) {
        this.BinlogSyncWay = BinlogSyncWay;
    }

    /**
     * Get 半同步超时时间，单位ms 
     * @return SemiSyncTimeout 半同步超时时间，单位ms
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set 半同步超时时间，单位ms
     * @param SemiSyncTimeout 半同步超时时间，单位ms
     */
    public void setSemiSyncTimeout(Long SemiSyncTimeout) {
        this.SemiSyncTimeout = SemiSyncTimeout;
    }

    public SlaveZoneAttrItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveZoneAttrItem(SlaveZoneAttrItem source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "BinlogSyncWay", this.BinlogSyncWay);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);

    }
}

