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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceLocationSolveResponse extends AbstractModel{

    /**
    * 经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 类型
    */
    @SerializedName("LocationType")
    @Expose
    private String LocationType;

    /**
    * 误差精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Accuracy")
    @Expose
    private Float Accuracy;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 类型 
     * @return LocationType 类型
     */
    public String getLocationType() {
        return this.LocationType;
    }

    /**
     * Set 类型
     * @param LocationType 类型
     */
    public void setLocationType(String LocationType) {
        this.LocationType = LocationType;
    }

    /**
     * Get 误差精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Accuracy 误差精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAccuracy() {
        return this.Accuracy;
    }

    /**
     * Set 误差精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     * @param Accuracy 误差精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccuracy(Float Accuracy) {
        this.Accuracy = Accuracy;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceLocationSolveResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceLocationSolveResponse(DescribeDeviceLocationSolveResponse source) {
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
        if (source.LocationType != null) {
            this.LocationType = new String(source.LocationType);
        }
        if (source.Accuracy != null) {
            this.Accuracy = new Float(source.Accuracy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "LocationType", this.LocationType);
        this.setParamSimple(map, prefix + "Accuracy", this.Accuracy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

