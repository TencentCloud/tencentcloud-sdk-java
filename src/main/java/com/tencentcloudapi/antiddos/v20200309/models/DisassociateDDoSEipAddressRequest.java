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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateDDoSEipAddressRequest extends AbstractModel{

    /**
    * 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源实例ID对应的高防弹性公网IP。
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
     * Get 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。 
     * @return InstanceId 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     * @param InstanceId 资源实例ID，实例ID形如：bgpip-0000011x。只能填写高防IP实例。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源实例ID对应的高防弹性公网IP。 
     * @return Eip 资源实例ID对应的高防弹性公网IP。
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 资源实例ID对应的高防弹性公网IP。
     * @param Eip 资源实例ID对应的高防弹性公网IP。
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    public DisassociateDDoSEipAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateDDoSEipAddressRequest(DisassociateDDoSEipAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Eip", this.Eip);

    }
}

