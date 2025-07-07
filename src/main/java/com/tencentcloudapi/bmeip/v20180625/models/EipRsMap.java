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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipRsMap extends AbstractModel {

    /**
    * EIP实例 ID
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * 黑石物理机实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get EIP实例 ID 
     * @return EipId EIP实例 ID
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * Set EIP实例 ID
     * @param EipId EIP实例 ID
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * Get 黑石物理机实例ID 
     * @return InstanceId 黑石物理机实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 黑石物理机实例ID
     * @param InstanceId 黑石物理机实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EipRsMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipRsMap(EipRsMap source) {
        if (source.EipId != null) {
            this.EipId = new String(source.EipId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

