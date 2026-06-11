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

public class PromoteDBInstanceToActiveRequest extends AbstractModel {

    /**
    * 灾备实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主实例id
    */
    @SerializedName("MasterId")
    @Expose
    private String MasterId;

    /**
     * Get 灾备实例id 
     * @return InstanceId 灾备实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 灾备实例id
     * @param InstanceId 灾备实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主实例id 
     * @return MasterId 主实例id
     */
    public String getMasterId() {
        return this.MasterId;
    }

    /**
     * Set 主实例id
     * @param MasterId 主实例id
     */
    public void setMasterId(String MasterId) {
        this.MasterId = MasterId;
    }

    public PromoteDBInstanceToActiveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromoteDBInstanceToActiveRequest(PromoteDBInstanceToActiveRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MasterId != null) {
            this.MasterId = new String(source.MasterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MasterId", this.MasterId);

    }
}

