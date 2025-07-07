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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryInfo extends AbstractModel {

    /**
    * 仓库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仓库类型
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 仓库地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 仓库名称 
     * @return Name 仓库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仓库名称
     * @param Name 仓库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仓库类型
aws
ccr
harbor
jfrog
other-tcr
quay
tcr 
     * @return Type 仓库类型
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 仓库类型
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     * @param Type 仓库类型
aws
ccr
harbor
jfrog
other-tcr
quay
tcr
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 仓库地址 
     * @return Address 仓库地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 仓库地址
     * @param Address 仓库地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ImageRegistryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryInfo(ImageRegistryInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

