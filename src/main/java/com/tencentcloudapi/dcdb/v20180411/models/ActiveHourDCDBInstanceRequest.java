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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActiveHourDCDBInstanceRequest extends AbstractModel {

    /**
    * 待升级的实例ID列表。形如：["dcdbt-ow728lmc"]，可以通过 DescribeDCDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 待升级的实例ID列表。形如：["dcdbt-ow728lmc"]，可以通过 DescribeDCDBInstances 查询实例详情获得。 
     * @return InstanceIds 待升级的实例ID列表。形如：["dcdbt-ow728lmc"]，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 待升级的实例ID列表。形如：["dcdbt-ow728lmc"]，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @param InstanceIds 待升级的实例ID列表。形如：["dcdbt-ow728lmc"]，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public ActiveHourDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActiveHourDCDBInstanceRequest(ActiveHourDCDBInstanceRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

