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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiBizWarningInfo extends AbstractModel{

    /**
    * 告警类型：
0: 无变化
1: 侵占
2: 消失
    */
    @SerializedName("WarningType")
    @Expose
    private Long WarningType;

    /**
    * 告警侵占或消失面积
    */
    @SerializedName("WarningAreaSize")
    @Expose
    private Float WarningAreaSize;

    /**
    * 告警侵占或消失坐标
    */
    @SerializedName("WarningLocation")
    @Expose
    private Point WarningLocation;

    /**
    * 告警侵占或消失轮廓
    */
    @SerializedName("WarningAreaContour")
    @Expose
    private Point [] WarningAreaContour;

    /**
     * Get 告警类型：
0: 无变化
1: 侵占
2: 消失 
     * @return WarningType 告警类型：
0: 无变化
1: 侵占
2: 消失
     */
    public Long getWarningType() {
        return this.WarningType;
    }

    /**
     * Set 告警类型：
0: 无变化
1: 侵占
2: 消失
     * @param WarningType 告警类型：
0: 无变化
1: 侵占
2: 消失
     */
    public void setWarningType(Long WarningType) {
        this.WarningType = WarningType;
    }

    /**
     * Get 告警侵占或消失面积 
     * @return WarningAreaSize 告警侵占或消失面积
     */
    public Float getWarningAreaSize() {
        return this.WarningAreaSize;
    }

    /**
     * Set 告警侵占或消失面积
     * @param WarningAreaSize 告警侵占或消失面积
     */
    public void setWarningAreaSize(Float WarningAreaSize) {
        this.WarningAreaSize = WarningAreaSize;
    }

    /**
     * Get 告警侵占或消失坐标 
     * @return WarningLocation 告警侵占或消失坐标
     */
    public Point getWarningLocation() {
        return this.WarningLocation;
    }

    /**
     * Set 告警侵占或消失坐标
     * @param WarningLocation 告警侵占或消失坐标
     */
    public void setWarningLocation(Point WarningLocation) {
        this.WarningLocation = WarningLocation;
    }

    /**
     * Get 告警侵占或消失轮廓 
     * @return WarningAreaContour 告警侵占或消失轮廓
     */
    public Point [] getWarningAreaContour() {
        return this.WarningAreaContour;
    }

    /**
     * Set 告警侵占或消失轮廓
     * @param WarningAreaContour 告警侵占或消失轮廓
     */
    public void setWarningAreaContour(Point [] WarningAreaContour) {
        this.WarningAreaContour = WarningAreaContour;
    }

    public MultiBizWarningInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiBizWarningInfo(MultiBizWarningInfo source) {
        if (source.WarningType != null) {
            this.WarningType = new Long(source.WarningType);
        }
        if (source.WarningAreaSize != null) {
            this.WarningAreaSize = new Float(source.WarningAreaSize);
        }
        if (source.WarningLocation != null) {
            this.WarningLocation = new Point(source.WarningLocation);
        }
        if (source.WarningAreaContour != null) {
            this.WarningAreaContour = new Point[source.WarningAreaContour.length];
            for (int i = 0; i < source.WarningAreaContour.length; i++) {
                this.WarningAreaContour[i] = new Point(source.WarningAreaContour[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarningType", this.WarningType);
        this.setParamSimple(map, prefix + "WarningAreaSize", this.WarningAreaSize);
        this.setParamObj(map, prefix + "WarningLocation.", this.WarningLocation);
        this.setParamArrayObj(map, prefix + "WarningAreaContour.", this.WarningAreaContour);

    }
}

