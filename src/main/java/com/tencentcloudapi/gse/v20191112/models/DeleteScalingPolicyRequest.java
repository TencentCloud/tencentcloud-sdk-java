/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScalingPolicyRequest extends AbstractModel{

    /**
    * 服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 扩缩容策略名称，最小长度为0，最大长度为1024
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 服务器舰队ID 
     * @return FleetId 服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队ID
     * @param FleetId 服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 扩缩容策略名称，最小长度为0，最大长度为1024 
     * @return Name 扩缩容策略名称，最小长度为0，最大长度为1024
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩缩容策略名称，最小长度为0，最大长度为1024
     * @param Name 扩缩容策略名称，最小长度为0，最大长度为1024
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeleteScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScalingPolicyRequest(DeleteScalingPolicyRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

