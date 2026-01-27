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
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否开启跨地域快照备份ON/OFF
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * 快照备份所跨地域
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

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
     * Get 是否开启跨地域快照备份ON/OFF 
     * @return CrossRegionsEnable 是否开启跨地域快照备份ON/OFF
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set 是否开启跨地域快照备份ON/OFF
     * @param CrossRegionsEnable 是否开启跨地域快照备份ON/OFF
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get 快照备份所跨地域 
     * @return CrossRegions 快照备份所跨地域
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set 快照备份所跨地域
     * @param CrossRegions 快照备份所跨地域
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CrossRegionsEnable", this.CrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);

    }
}

