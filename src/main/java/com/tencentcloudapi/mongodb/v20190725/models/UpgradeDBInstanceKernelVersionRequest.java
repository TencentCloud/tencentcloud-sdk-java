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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceKernelVersionRequest extends AbstractModel {

    /**
    * 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否维护时间内升级。0-否，1-是
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否维护时间内升级。0-否，1-是 
     * @return InMaintenance 是否维护时间内升级。0-否，1-是
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set 是否维护时间内升级。0-否，1-是
     * @param InMaintenance 是否维护时间内升级。0-否，1-是
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public UpgradeDBInstanceKernelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceKernelVersionRequest(UpgradeDBInstanceKernelVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

