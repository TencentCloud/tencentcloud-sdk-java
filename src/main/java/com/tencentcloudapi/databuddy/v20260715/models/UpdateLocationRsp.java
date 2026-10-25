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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLocationRsp extends AbstractModel {

    /**
    * 修改后的存储位置详情
    */
    @SerializedName("Location")
    @Expose
    private LocationInfo Location;

    /**
     * Get 修改后的存储位置详情 
     * @return Location 修改后的存储位置详情
     */
    public LocationInfo getLocation() {
        return this.Location;
    }

    /**
     * Set 修改后的存储位置详情
     * @param Location 修改后的存储位置详情
     */
    public void setLocation(LocationInfo Location) {
        this.Location = Location;
    }

    public UpdateLocationRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLocationRsp(UpdateLocationRsp source) {
        if (source.Location != null) {
            this.Location = new LocationInfo(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

