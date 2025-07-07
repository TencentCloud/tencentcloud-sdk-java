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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLBMultiRegion extends AbstractModel {

    /**
    * 是否启用多可用区
    */
    @SerializedName("CLBMultiZoneFlag")
    @Expose
    private Boolean CLBMultiZoneFlag;

    /**
    * 主可用区信息
    */
    @SerializedName("CLBMasterZone")
    @Expose
    private String CLBMasterZone;

    /**
    * 备可用区信息
    */
    @SerializedName("CLBSlaveZone")
    @Expose
    private String CLBSlaveZone;

    /**
     * Get 是否启用多可用区 
     * @return CLBMultiZoneFlag 是否启用多可用区
     */
    public Boolean getCLBMultiZoneFlag() {
        return this.CLBMultiZoneFlag;
    }

    /**
     * Set 是否启用多可用区
     * @param CLBMultiZoneFlag 是否启用多可用区
     */
    public void setCLBMultiZoneFlag(Boolean CLBMultiZoneFlag) {
        this.CLBMultiZoneFlag = CLBMultiZoneFlag;
    }

    /**
     * Get 主可用区信息 
     * @return CLBMasterZone 主可用区信息
     */
    public String getCLBMasterZone() {
        return this.CLBMasterZone;
    }

    /**
     * Set 主可用区信息
     * @param CLBMasterZone 主可用区信息
     */
    public void setCLBMasterZone(String CLBMasterZone) {
        this.CLBMasterZone = CLBMasterZone;
    }

    /**
     * Get 备可用区信息 
     * @return CLBSlaveZone 备可用区信息
     */
    public String getCLBSlaveZone() {
        return this.CLBSlaveZone;
    }

    /**
     * Set 备可用区信息
     * @param CLBSlaveZone 备可用区信息
     */
    public void setCLBSlaveZone(String CLBSlaveZone) {
        this.CLBSlaveZone = CLBSlaveZone;
    }

    public CLBMultiRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLBMultiRegion(CLBMultiRegion source) {
        if (source.CLBMultiZoneFlag != null) {
            this.CLBMultiZoneFlag = new Boolean(source.CLBMultiZoneFlag);
        }
        if (source.CLBMasterZone != null) {
            this.CLBMasterZone = new String(source.CLBMasterZone);
        }
        if (source.CLBSlaveZone != null) {
            this.CLBSlaveZone = new String(source.CLBSlaveZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLBMultiZoneFlag", this.CLBMultiZoneFlag);
        this.setParamSimple(map, prefix + "CLBMasterZone", this.CLBMasterZone);
        this.setParamSimple(map, prefix + "CLBSlaveZone", this.CLBSlaveZone);

    }
}

