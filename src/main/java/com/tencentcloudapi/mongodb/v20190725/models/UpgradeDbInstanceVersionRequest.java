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

public class UpgradeDbInstanceVersionRequest extends AbstractModel {

    /**
    * 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 新升级的数据库版本，当前仅支持MONGO_40_WT（MongoDB 4.0 WiredTiger存储引擎版本）及MONGO_42_WT（MongoDB 4.0 WiredTiger存储引擎版本）。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 是否在维护时间内升级。0-立即升级 1-维护时间内升级
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。 
     * @return InstanceId 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 新升级的数据库版本，当前仅支持MONGO_40_WT（MongoDB 4.0 WiredTiger存储引擎版本）及MONGO_42_WT（MongoDB 4.0 WiredTiger存储引擎版本）。 
     * @return MongoVersion 新升级的数据库版本，当前仅支持MONGO_40_WT（MongoDB 4.0 WiredTiger存储引擎版本）及MONGO_42_WT（MongoDB 4.0 WiredTiger存储引擎版本）。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 新升级的数据库版本，当前仅支持MONGO_40_WT（MongoDB 4.0 WiredTiger存储引擎版本）及MONGO_42_WT（MongoDB 4.0 WiredTiger存储引擎版本）。
     * @param MongoVersion 新升级的数据库版本，当前仅支持MONGO_40_WT（MongoDB 4.0 WiredTiger存储引擎版本）及MONGO_42_WT（MongoDB 4.0 WiredTiger存储引擎版本）。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 是否在维护时间内升级。0-立即升级 1-维护时间内升级 
     * @return InMaintenance 是否在维护时间内升级。0-立即升级 1-维护时间内升级
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set 是否在维护时间内升级。0-立即升级 1-维护时间内升级
     * @param InMaintenance 是否在维护时间内升级。0-立即升级 1-维护时间内升级
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public UpgradeDbInstanceVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDbInstanceVersionRequest(UpgradeDbInstanceVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
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
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

