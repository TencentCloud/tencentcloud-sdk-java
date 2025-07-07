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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomDriver extends AbstractModel {

    /**
    * 自定义GPU驱动地址链接
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 自定义GPU驱动地址链接 
     * @return Address 自定义GPU驱动地址链接
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 自定义GPU驱动地址链接
     * @param Address 自定义GPU驱动地址链接
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public CustomDriver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomDriver(CustomDriver source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

