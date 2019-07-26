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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeCarResponse  extends AbstractModel{

    /**
    * 汽车的四个矩形顶点坐标
    */
    @SerializedName("CarCoords")
    @Expose
    private Coord [] CarCoords;

    /**
    * 车辆属性识别的结果数组
    */
    @SerializedName("CarTags")
    @Expose
    private CarTagItem [] CarTags;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取汽车的四个矩形顶点坐标
     * @return CarCoords 汽车的四个矩形顶点坐标
     */
    public Coord [] getCarCoords() {
        return this.CarCoords;
    }

    /**
     * 设置汽车的四个矩形顶点坐标
     * @param CarCoords 汽车的四个矩形顶点坐标
     */
    public void setCarCoords(Coord [] CarCoords) {
        this.CarCoords = CarCoords;
    }

    /**
     * 获取车辆属性识别的结果数组
     * @return CarTags 车辆属性识别的结果数组
     */
    public CarTagItem [] getCarTags() {
        return this.CarTags;
    }

    /**
     * 设置车辆属性识别的结果数组
     * @param CarTags 车辆属性识别的结果数组
     */
    public void setCarTags(CarTagItem [] CarTags) {
        this.CarTags = CarTags;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CarCoords.", this.CarCoords);
        this.setParamArrayObj(map, prefix + "CarTags.", this.CarTags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

