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

public class OpenWanRequest extends AbstractModel {

    /**
    * 实例组id
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例组id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
     * Get 实例组id 
     * @return InstanceGrpId 实例组id
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 实例组id
     * @param InstanceGrpId 实例组id
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例组id 
     * @return InstanceGroupId 实例组id
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组id
     * @param InstanceGroupId 实例组id
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    public OpenWanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenWanRequest(OpenWanRequest source) {
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);

    }
}

