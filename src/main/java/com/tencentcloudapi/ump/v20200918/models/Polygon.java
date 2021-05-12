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

public class Polygon extends AbstractModel{

    /**
    * 标注列表
    */
    @SerializedName("Points")
    @Expose
    private Point [] Points;

    /**
     * Get 标注列表 
     * @return Points 标注列表
     */
    public Point [] getPoints() {
        return this.Points;
    }

    /**
     * Set 标注列表
     * @param Points 标注列表
     */
    public void setPoints(Point [] Points) {
        this.Points = Points;
    }

    public Polygon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Polygon(Polygon source) {
        if (source.Points != null) {
            this.Points = new Point[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new Point(source.Points[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Points.", this.Points);

    }
}

