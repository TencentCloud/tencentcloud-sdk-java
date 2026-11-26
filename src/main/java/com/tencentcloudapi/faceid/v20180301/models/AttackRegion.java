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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackRegion extends AbstractModel {

    /**
    * <p>攻击区域的四点坐标，固定为轴对齐矩形，按 左上 → 右上 → 右下 → 左下 顺时针顺序排列。单位为像素，坐标原点为图像左上角。数组长度固定为 4。</p>
    */
    @SerializedName("Polygon")
    @Expose
    private Point [] Polygon;

    /**
    * <p>攻击描述，对该区域命中的可疑特征进行详细说明。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>攻击区域的四点坐标，固定为轴对齐矩形，按 左上 → 右上 → 右下 → 左下 顺时针顺序排列。单位为像素，坐标原点为图像左上角。数组长度固定为 4。</p> 
     * @return Polygon <p>攻击区域的四点坐标，固定为轴对齐矩形，按 左上 → 右上 → 右下 → 左下 顺时针顺序排列。单位为像素，坐标原点为图像左上角。数组长度固定为 4。</p>
     */
    public Point [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set <p>攻击区域的四点坐标，固定为轴对齐矩形，按 左上 → 右上 → 右下 → 左下 顺时针顺序排列。单位为像素，坐标原点为图像左上角。数组长度固定为 4。</p>
     * @param Polygon <p>攻击区域的四点坐标，固定为轴对齐矩形，按 左上 → 右上 → 右下 → 左下 顺时针顺序排列。单位为像素，坐标原点为图像左上角。数组长度固定为 4。</p>
     */
    public void setPolygon(Point [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get <p>攻击描述，对该区域命中的可疑特征进行详细说明。</p> 
     * @return Description <p>攻击描述，对该区域命中的可疑特征进行详细说明。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>攻击描述，对该区域命中的可疑特征进行详细说明。</p>
     * @param Description <p>攻击描述，对该区域命中的可疑特征进行详细说明。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AttackRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackRegion(AttackRegion source) {
        if (source.Polygon != null) {
            this.Polygon = new Point[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Point(source.Polygon[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

