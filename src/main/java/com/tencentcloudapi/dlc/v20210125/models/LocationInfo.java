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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocationInfo extends AbstractModel {

    /**
    * 桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * location路径
    */
    @SerializedName("DataLocation")
    @Expose
    private String DataLocation;

    /**
     * Get 桶名称 
     * @return Bucket 桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶名称
     * @param Bucket 桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get location路径 
     * @return DataLocation location路径
     */
    public String getDataLocation() {
        return this.DataLocation;
    }

    /**
     * Set location路径
     * @param DataLocation location路径
     */
    public void setDataLocation(String DataLocation) {
        this.DataLocation = DataLocation;
    }

    public LocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocationInfo(LocationInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.DataLocation != null) {
            this.DataLocation = new String(source.DataLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "DataLocation", this.DataLocation);

    }
}

