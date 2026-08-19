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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreditPoint extends AbstractModel {

    /**
    * <p>积分分值</p>
    */
    @SerializedName("Point")
    @Expose
    private Float Point;

    /**
    * <p>积分类型</p>
    */
    @SerializedName("PointType")
    @Expose
    private String PointType;

    /**
     * Get <p>积分分值</p> 
     * @return Point <p>积分分值</p>
     */
    public Float getPoint() {
        return this.Point;
    }

    /**
     * Set <p>积分分值</p>
     * @param Point <p>积分分值</p>
     */
    public void setPoint(Float Point) {
        this.Point = Point;
    }

    /**
     * Get <p>积分类型</p> 
     * @return PointType <p>积分类型</p>
     */
    public String getPointType() {
        return this.PointType;
    }

    /**
     * Set <p>积分类型</p>
     * @param PointType <p>积分类型</p>
     */
    public void setPointType(String PointType) {
        this.PointType = PointType;
    }

    public CreditPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreditPoint(CreditPoint source) {
        if (source.Point != null) {
            this.Point = new Float(source.Point);
        }
        if (source.PointType != null) {
            this.PointType = new String(source.PointType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Point", this.Point);
        this.setParamSimple(map, prefix + "PointType", this.PointType);

    }
}

