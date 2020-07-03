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

public class Location extends AbstractModel{

    /**
    * 位置矩形框的左上角横坐标
    */
    @SerializedName("XMin")
    @Expose
    private Long XMin;

    /**
    * 位置矩形框的左上角纵坐标
    */
    @SerializedName("YMin")
    @Expose
    private Long YMin;

    /**
    * 位置矩形框的右下角横坐标
    */
    @SerializedName("XMax")
    @Expose
    private Long XMax;

    /**
    * 位置矩形框的右下角纵坐标
    */
    @SerializedName("YMax")
    @Expose
    private Long YMax;

    /**
     * Get 位置矩形框的左上角横坐标 
     * @return XMin 位置矩形框的左上角横坐标
     */
    public Long getXMin() {
        return this.XMin;
    }

    /**
     * Set 位置矩形框的左上角横坐标
     * @param XMin 位置矩形框的左上角横坐标
     */
    public void setXMin(Long XMin) {
        this.XMin = XMin;
    }

    /**
     * Get 位置矩形框的左上角纵坐标 
     * @return YMin 位置矩形框的左上角纵坐标
     */
    public Long getYMin() {
        return this.YMin;
    }

    /**
     * Set 位置矩形框的左上角纵坐标
     * @param YMin 位置矩形框的左上角纵坐标
     */
    public void setYMin(Long YMin) {
        this.YMin = YMin;
    }

    /**
     * Get 位置矩形框的右下角横坐标 
     * @return XMax 位置矩形框的右下角横坐标
     */
    public Long getXMax() {
        return this.XMax;
    }

    /**
     * Set 位置矩形框的右下角横坐标
     * @param XMax 位置矩形框的右下角横坐标
     */
    public void setXMax(Long XMax) {
        this.XMax = XMax;
    }

    /**
     * Get 位置矩形框的右下角纵坐标 
     * @return YMax 位置矩形框的右下角纵坐标
     */
    public Long getYMax() {
        return this.YMax;
    }

    /**
     * Set 位置矩形框的右下角纵坐标
     * @param YMax 位置矩形框的右下角纵坐标
     */
    public void setYMax(Long YMax) {
        this.YMax = YMax;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XMin", this.XMin);
        this.setParamSimple(map, prefix + "YMin", this.YMin);
        this.setParamSimple(map, prefix + "XMax", this.XMax);
        this.setParamSimple(map, prefix + "YMax", this.YMax);

    }
}

