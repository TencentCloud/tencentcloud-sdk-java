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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressLocation extends AbstractModel {

    /**
    * ip地址
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * 所属地域
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get ip地址 
     * @return Addr ip地址
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set ip地址
     * @param Addr ip地址
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get 所属地域 
     * @return Location 所属地域
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 所属地域
     * @param Location 所属地域
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public AddressLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressLocation(AddressLocation source) {
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

