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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStoreLocationRequest extends AbstractModel{

    /**
    * 计算结果存储cos路径，如：cosn://bucketname/
    */
    @SerializedName("StoreLocation")
    @Expose
    private String StoreLocation;

    /**
     * Get 计算结果存储cos路径，如：cosn://bucketname/ 
     * @return StoreLocation 计算结果存储cos路径，如：cosn://bucketname/
     */
    public String getStoreLocation() {
        return this.StoreLocation;
    }

    /**
     * Set 计算结果存储cos路径，如：cosn://bucketname/
     * @param StoreLocation 计算结果存储cos路径，如：cosn://bucketname/
     */
    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    public CreateStoreLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStoreLocationRequest(CreateStoreLocationRequest source) {
        if (source.StoreLocation != null) {
            this.StoreLocation = new String(source.StoreLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreLocation", this.StoreLocation);

    }
}

