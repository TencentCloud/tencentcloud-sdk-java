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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceAvailability extends AbstractModel{

    /**
    * 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP"。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源可用性，"Available"：可用，"Unavailable"：不可用
    */
    @SerializedName("Availability")
    @Expose
    private String Availability;

    /**
     * Get 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP"。 
     * @return Type 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP"。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP"。
     * @param Type 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP"。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源可用性，"Available"：可用，"Unavailable"：不可用 
     * @return Availability 资源可用性，"Available"：可用，"Unavailable"：不可用
     */
    public String getAvailability() {
        return this.Availability;
    }

    /**
     * Set 资源可用性，"Available"：可用，"Unavailable"：不可用
     * @param Availability 资源可用性，"Available"：可用，"Unavailable"：不可用
     */
    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    public ResourceAvailability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceAvailability(ResourceAvailability source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Availability != null) {
            this.Availability = new String(source.Availability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Availability", this.Availability);

    }
}

