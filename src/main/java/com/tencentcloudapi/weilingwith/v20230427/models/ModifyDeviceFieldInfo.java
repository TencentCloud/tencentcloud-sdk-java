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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceFieldInfo extends AbstractModel {

    /**
    * 设备id
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 自定义字段key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 自定义字段值
    */
    @SerializedName("Val")
    @Expose
    private String Val;

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
     * Get 自定义字段key 
     * @return Key 自定义字段key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 自定义字段key
     * @param Key 自定义字段key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 自定义字段值 
     * @return Val 自定义字段值
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set 自定义字段值
     * @param Val 自定义字段值
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    public ModifyDeviceFieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceFieldInfo(ModifyDeviceFieldInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Val", this.Val);

    }
}

