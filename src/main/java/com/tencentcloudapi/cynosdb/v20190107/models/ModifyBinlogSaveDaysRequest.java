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

public class ModifyBinlogSaveDaysRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Binlog保留天数</p>
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * <p>跨地域备份保留时间</p><p>单位：天</p>
    */
    @SerializedName("BinlogCrossRegionSaveDays")
    @Expose
    private Long BinlogCrossRegionSaveDays;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Binlog保留天数</p> 
     * @return BinlogSaveDays <p>Binlog保留天数</p>
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set <p>Binlog保留天数</p>
     * @param BinlogSaveDays <p>Binlog保留天数</p>
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
    }

    /**
     * Get <p>跨地域备份保留时间</p><p>单位：天</p> 
     * @return BinlogCrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public Long getBinlogCrossRegionSaveDays() {
        return this.BinlogCrossRegionSaveDays;
    }

    /**
     * Set <p>跨地域备份保留时间</p><p>单位：天</p>
     * @param BinlogCrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public void setBinlogCrossRegionSaveDays(Long BinlogCrossRegionSaveDays) {
        this.BinlogCrossRegionSaveDays = BinlogCrossRegionSaveDays;
    }

    public ModifyBinlogSaveDaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBinlogSaveDaysRequest(ModifyBinlogSaveDaysRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.BinlogCrossRegionSaveDays != null) {
            this.BinlogCrossRegionSaveDays = new Long(source.BinlogCrossRegionSaveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "BinlogCrossRegionSaveDays", this.BinlogCrossRegionSaveDays);

    }
}

