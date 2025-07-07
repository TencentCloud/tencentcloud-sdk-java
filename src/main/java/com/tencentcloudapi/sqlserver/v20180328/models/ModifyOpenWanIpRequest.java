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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOpenWanIpRequest extends AbstractModel {

    /**
    * 实例资源ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * RO只读组Id
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
     * Get 实例资源ID 
     * @return InstanceId 实例资源ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例资源ID
     * @param InstanceId 实例资源ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get RO只读组Id 
     * @return RoGroupId RO只读组Id
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set RO只读组Id
     * @param RoGroupId RO只读组Id
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    public ModifyOpenWanIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOpenWanIpRequest(ModifyOpenWanIpRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);

    }
}

