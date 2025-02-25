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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Externals extends AbstractModel {

    /**
    * 释放地址
    */
    @SerializedName("ReleaseAddress")
    @Expose
    private Boolean ReleaseAddress;

    /**
    * 不支持的网络类型，取值范围：<br><li>BASIC：基础网络</li><li>VPC1.0：私有网络VPC1.0</li>
    */
    @SerializedName("UnsupportNetworks")
    @Expose
    private String [] UnsupportNetworks;

    /**
    * HDD本地存储属性
    */
    @SerializedName("StorageBlockAttr")
    @Expose
    private StorageBlock StorageBlockAttr;

    /**
     * Get 释放地址 
     * @return ReleaseAddress 释放地址
     */
    public Boolean getReleaseAddress() {
        return this.ReleaseAddress;
    }

    /**
     * Set 释放地址
     * @param ReleaseAddress 释放地址
     */
    public void setReleaseAddress(Boolean ReleaseAddress) {
        this.ReleaseAddress = ReleaseAddress;
    }

    /**
     * Get 不支持的网络类型，取值范围：<br><li>BASIC：基础网络</li><li>VPC1.0：私有网络VPC1.0</li> 
     * @return UnsupportNetworks 不支持的网络类型，取值范围：<br><li>BASIC：基础网络</li><li>VPC1.0：私有网络VPC1.0</li>
     */
    public String [] getUnsupportNetworks() {
        return this.UnsupportNetworks;
    }

    /**
     * Set 不支持的网络类型，取值范围：<br><li>BASIC：基础网络</li><li>VPC1.0：私有网络VPC1.0</li>
     * @param UnsupportNetworks 不支持的网络类型，取值范围：<br><li>BASIC：基础网络</li><li>VPC1.0：私有网络VPC1.0</li>
     */
    public void setUnsupportNetworks(String [] UnsupportNetworks) {
        this.UnsupportNetworks = UnsupportNetworks;
    }

    /**
     * Get HDD本地存储属性 
     * @return StorageBlockAttr HDD本地存储属性
     */
    public StorageBlock getStorageBlockAttr() {
        return this.StorageBlockAttr;
    }

    /**
     * Set HDD本地存储属性
     * @param StorageBlockAttr HDD本地存储属性
     */
    public void setStorageBlockAttr(StorageBlock StorageBlockAttr) {
        this.StorageBlockAttr = StorageBlockAttr;
    }

    public Externals() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Externals(Externals source) {
        if (source.ReleaseAddress != null) {
            this.ReleaseAddress = new Boolean(source.ReleaseAddress);
        }
        if (source.UnsupportNetworks != null) {
            this.UnsupportNetworks = new String[source.UnsupportNetworks.length];
            for (int i = 0; i < source.UnsupportNetworks.length; i++) {
                this.UnsupportNetworks[i] = new String(source.UnsupportNetworks[i]);
            }
        }
        if (source.StorageBlockAttr != null) {
            this.StorageBlockAttr = new StorageBlock(source.StorageBlockAttr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);
        this.setParamArraySimple(map, prefix + "UnsupportNetworks.", this.UnsupportNetworks);
        this.setParamObj(map, prefix + "StorageBlockAttr.", this.StorageBlockAttr);

    }
}

