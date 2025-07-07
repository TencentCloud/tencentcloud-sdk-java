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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeCarResponse extends AbstractModel {

    /**
    * 汽车的四个矩形顶点坐标，如果图片中存在多辆车，则输出最大车辆的坐标。
    */
    @SerializedName("CarCoords")
    @Expose
    private Coord [] CarCoords;

    /**
    * 车辆属性识别的结果数组，如果识别到多辆车，则会输出每辆车的top1结果。
    */
    @SerializedName("CarTags")
    @Expose
    private CarTagItem [] CarTags;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 汽车的四个矩形顶点坐标，如果图片中存在多辆车，则输出最大车辆的坐标。 
     * @return CarCoords 汽车的四个矩形顶点坐标，如果图片中存在多辆车，则输出最大车辆的坐标。
     */
    public Coord [] getCarCoords() {
        return this.CarCoords;
    }

    /**
     * Set 汽车的四个矩形顶点坐标，如果图片中存在多辆车，则输出最大车辆的坐标。
     * @param CarCoords 汽车的四个矩形顶点坐标，如果图片中存在多辆车，则输出最大车辆的坐标。
     */
    public void setCarCoords(Coord [] CarCoords) {
        this.CarCoords = CarCoords;
    }

    /**
     * Get 车辆属性识别的结果数组，如果识别到多辆车，则会输出每辆车的top1结果。 
     * @return CarTags 车辆属性识别的结果数组，如果识别到多辆车，则会输出每辆车的top1结果。
     */
    public CarTagItem [] getCarTags() {
        return this.CarTags;
    }

    /**
     * Set 车辆属性识别的结果数组，如果识别到多辆车，则会输出每辆车的top1结果。
     * @param CarTags 车辆属性识别的结果数组，如果识别到多辆车，则会输出每辆车的top1结果。
     */
    public void setCarTags(CarTagItem [] CarTags) {
        this.CarTags = CarTags;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeCarResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeCarResponse(RecognizeCarResponse source) {
        if (source.CarCoords != null) {
            this.CarCoords = new Coord[source.CarCoords.length];
            for (int i = 0; i < source.CarCoords.length; i++) {
                this.CarCoords[i] = new Coord(source.CarCoords[i]);
            }
        }
        if (source.CarTags != null) {
            this.CarTags = new CarTagItem[source.CarTags.length];
            for (int i = 0; i < source.CarTags.length; i++) {
                this.CarTags[i] = new CarTagItem(source.CarTags[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CarCoords.", this.CarCoords);
        this.setParamArrayObj(map, prefix + "CarTags.", this.CarTags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

