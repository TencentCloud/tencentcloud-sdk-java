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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTmpInstancesRequest extends AbstractModel {

    /**
    * 回档实例的ID列表，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 回档时间点
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
     * Get 回档实例的ID列表，形如：tdsql-ow728lmc。 
     * @return InstanceIds 回档实例的ID列表，形如：tdsql-ow728lmc。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 回档实例的ID列表，形如：tdsql-ow728lmc。
     * @param InstanceIds 回档实例的ID列表，形如：tdsql-ow728lmc。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 回档时间点 
     * @return RollbackTime 回档时间点
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set 回档时间点
     * @param RollbackTime 回档时间点
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    public CreateTmpInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTmpInstancesRequest(CreateTmpInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);

    }
}

