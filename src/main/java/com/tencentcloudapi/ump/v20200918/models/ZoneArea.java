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

public class ZoneArea extends AbstractModel{

    /**
    * 点位ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 店门标注
    */
    @SerializedName("ShopArea")
    @Expose
    private Point [] ShopArea;

    /**
     * Get 点位ID 
     * @return ZoneId 点位ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 点位ID
     * @param ZoneId 点位ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 店门标注 
     * @return ShopArea 店门标注
     */
    public Point [] getShopArea() {
        return this.ShopArea;
    }

    /**
     * Set 店门标注
     * @param ShopArea 店门标注
     */
    public void setShopArea(Point [] ShopArea) {
        this.ShopArea = ShopArea;
    }

    public ZoneArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneArea(ZoneArea source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ShopArea != null) {
            this.ShopArea = new Point[source.ShopArea.length];
            for (int i = 0; i < source.ShopArea.length; i++) {
                this.ShopArea[i] = new Point(source.ShopArea[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "ShopArea.", this.ShopArea);

    }
}

