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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAdvancedStoreLocationRequest extends AbstractModel {

    /**
    * 查询结果保存cos路径
    */
    @SerializedName("StoreLocation")
    @Expose
    private String StoreLocation;

    /**
    * 是否启用高级设置：0-否，1-是
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 查询结果保存cos路径 
     * @return StoreLocation 查询结果保存cos路径
     */
    public String getStoreLocation() {
        return this.StoreLocation;
    }

    /**
     * Set 查询结果保存cos路径
     * @param StoreLocation 查询结果保存cos路径
     */
    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    /**
     * Get 是否启用高级设置：0-否，1-是 
     * @return Enable 是否启用高级设置：0-否，1-是
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用高级设置：0-否，1-是
     * @param Enable 是否启用高级设置：0-否，1-是
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyAdvancedStoreLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAdvancedStoreLocationRequest(ModifyAdvancedStoreLocationRequest source) {
        if (source.StoreLocation != null) {
            this.StoreLocation = new String(source.StoreLocation);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreLocation", this.StoreLocation);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

