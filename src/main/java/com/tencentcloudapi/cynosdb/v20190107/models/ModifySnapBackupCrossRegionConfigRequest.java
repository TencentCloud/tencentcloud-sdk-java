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

public class ModifySnapBackupCrossRegionConfigRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>是否开启跨地域快照备份ON/OFF</p>
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * <p>快照备份所跨地域</p>
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>跨地域备份保留时间</p><p>单位：天</p>
    */
    @SerializedName("CrossRegionSaveDays")
    @Expose
    private Long CrossRegionSaveDays;

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
     * Get <p>是否开启跨地域快照备份ON/OFF</p> 
     * @return CrossRegionsEnable <p>是否开启跨地域快照备份ON/OFF</p>
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set <p>是否开启跨地域快照备份ON/OFF</p>
     * @param CrossRegionsEnable <p>是否开启跨地域快照备份ON/OFF</p>
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get <p>快照备份所跨地域</p> 
     * @return CrossRegions <p>快照备份所跨地域</p>
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>快照备份所跨地域</p>
     * @param CrossRegions <p>快照备份所跨地域</p>
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>跨地域备份保留时间</p><p>单位：天</p> 
     * @return CrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public Long getCrossRegionSaveDays() {
        return this.CrossRegionSaveDays;
    }

    /**
     * Set <p>跨地域备份保留时间</p><p>单位：天</p>
     * @param CrossRegionSaveDays <p>跨地域备份保留时间</p><p>单位：天</p>
     */
    public void setCrossRegionSaveDays(Long CrossRegionSaveDays) {
        this.CrossRegionSaveDays = CrossRegionSaveDays;
    }

    public ModifySnapBackupCrossRegionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapBackupCrossRegionConfigRequest(ModifySnapBackupCrossRegionConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CrossRegionsEnable != null) {
            this.CrossRegionsEnable = new String(source.CrossRegionsEnable);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CrossRegionSaveDays != null) {
            this.CrossRegionSaveDays = new Long(source.CrossRegionSaveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CrossRegionsEnable", this.CrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CrossRegionSaveDays", this.CrossRegionSaveDays);

    }
}

