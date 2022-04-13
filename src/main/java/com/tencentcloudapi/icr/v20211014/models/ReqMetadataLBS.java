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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReqMetadataLBS extends AbstractModel{

    /**
    * 纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
     * Get 纬度 
     * @return Latitude 纬度
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度
     * @param Latitude 纬度
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 经度 
     * @return Longitude 经度
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 经度
     * @param Longitude 经度
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    public ReqMetadataLBS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqMetadataLBS(ReqMetadataLBS source) {
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);

    }
}

