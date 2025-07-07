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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorCoordinate extends AbstractModel {

    /**
    * 维度单词坐标
    */
    @SerializedName("Coordinate")
    @Expose
    private Long [] Coordinate;

    /**
     * Get 维度单词坐标 
     * @return Coordinate 维度单词坐标
     */
    public Long [] getCoordinate() {
        return this.Coordinate;
    }

    /**
     * Set 维度单词坐标
     * @param Coordinate 维度单词坐标
     */
    public void setCoordinate(Long [] Coordinate) {
        this.Coordinate = Coordinate;
    }

    public ErrorCoordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorCoordinate(ErrorCoordinate source) {
        if (source.Coordinate != null) {
            this.Coordinate = new Long[source.Coordinate.length];
            for (int i = 0; i < source.Coordinate.length; i++) {
                this.Coordinate[i] = new Long(source.Coordinate[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Coordinate.", this.Coordinate);

    }
}

