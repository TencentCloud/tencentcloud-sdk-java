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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchParameterCreateRemoteDisksRequest extends AbstractModel {

    /**
    * <p>实例所在的位置。通过该参数可以指定实例所属可用区、所属项目等属性。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
     * Get <p>实例所在的位置。通过该参数可以指定实例所属可用区、所属项目等属性。</p> 
     * @return Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区、所属项目等属性。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>实例所在的位置。通过该参数可以指定实例所属可用区、所属项目等属性。</p>
     * @param Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区、所属项目等属性。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    public SwitchParameterCreateRemoteDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchParameterCreateRemoteDisksRequest(SwitchParameterCreateRemoteDisksRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);

    }
}

