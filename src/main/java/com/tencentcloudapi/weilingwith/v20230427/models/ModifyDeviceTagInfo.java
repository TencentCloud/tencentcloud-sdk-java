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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceTagInfo extends AbstractModel {

    /**
    * 设备id
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备标签名称集合
    */
    @SerializedName("NameSet")
    @Expose
    private String [] NameSet;

    /**
     * Get 设备id 
     * @return WID 设备id
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备id
     * @param WID 设备id
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备标签名称集合 
     * @return NameSet 设备标签名称集合
     */
    public String [] getNameSet() {
        return this.NameSet;
    }

    /**
     * Set 设备标签名称集合
     * @param NameSet 设备标签名称集合
     */
    public void setNameSet(String [] NameSet) {
        this.NameSet = NameSet;
    }

    public ModifyDeviceTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceTagInfo(ModifyDeviceTagInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.NameSet != null) {
            this.NameSet = new String[source.NameSet.length];
            for (int i = 0; i < source.NameSet.length; i++) {
                this.NameSet[i] = new String(source.NameSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamArraySimple(map, prefix + "NameSet.", this.NameSet);

    }
}

