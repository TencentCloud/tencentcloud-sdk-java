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

public class UpgradeClusterVersionRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>升级时间类型，可选：upgradeImmediate,upgradeInMaintain</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>内核版本</p> 
     * @return CynosVersion <p>内核版本</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param CynosVersion <p>内核版本</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>升级时间类型，可选：upgradeImmediate,upgradeInMaintain</p> 
     * @return UpgradeType <p>升级时间类型，可选：upgradeImmediate,upgradeInMaintain</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级时间类型，可选：upgradeImmediate,upgradeInMaintain</p>
     * @param UpgradeType <p>升级时间类型，可选：upgradeImmediate,upgradeInMaintain</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    public UpgradeClusterVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeClusterVersionRequest(UpgradeClusterVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);

    }
}

