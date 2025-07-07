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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressInfo extends AbstractModel {

    /**
    * ip地址。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get ip地址。 
     * @return Address ip地址。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set ip地址。
     * @param Address ip地址。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 备注。 
     * @return Description 备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注。
     * @param Description 备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 更新时间。 
     * @return UpdatedTime 更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间。
     * @param UpdatedTime 更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public AddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressInfo(AddressInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

