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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkAddress extends AbstractModel{

    /**
    * 新IP地址。
    */
    @SerializedName("NewIPAddress")
    @Expose
    private String NewIPAddress;

    /**
    * 原IP地址。
    */
    @SerializedName("OldIpAddress")
    @Expose
    private String OldIpAddress;

    /**
     * Get 新IP地址。 
     * @return NewIPAddress 新IP地址。
     */
    public String getNewIPAddress() {
        return this.NewIPAddress;
    }

    /**
     * Set 新IP地址。
     * @param NewIPAddress 新IP地址。
     */
    public void setNewIPAddress(String NewIPAddress) {
        this.NewIPAddress = NewIPAddress;
    }

    /**
     * Get 原IP地址。 
     * @return OldIpAddress 原IP地址。
     */
    public String getOldIpAddress() {
        return this.OldIpAddress;
    }

    /**
     * Set 原IP地址。
     * @param OldIpAddress 原IP地址。
     */
    public void setOldIpAddress(String OldIpAddress) {
        this.OldIpAddress = OldIpAddress;
    }

    public ModifyNetworkAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkAddress(ModifyNetworkAddress source) {
        if (source.NewIPAddress != null) {
            this.NewIPAddress = new String(source.NewIPAddress);
        }
        if (source.OldIpAddress != null) {
            this.OldIpAddress = new String(source.OldIpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewIPAddress", this.NewIPAddress);
        this.setParamSimple(map, prefix + "OldIpAddress", this.OldIpAddress);

    }
}

