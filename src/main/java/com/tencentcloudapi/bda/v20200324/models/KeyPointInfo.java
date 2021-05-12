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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPointInfo extends AbstractModel{

    /**
    * 代表不同位置的人体关键点信息，返回值为以下集合中的一个 [头部,颈部,右肩,右肘,右腕,左肩,左肘,左腕,右髋,右膝,右踝,左髋,左膝,左踝]
    */
    @SerializedName("KeyPointType")
    @Expose
    private String KeyPointType;

    /**
    * 人体关键点横坐标
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * 人体关键点纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get 代表不同位置的人体关键点信息，返回值为以下集合中的一个 [头部,颈部,右肩,右肘,右腕,左肩,左肘,左腕,右髋,右膝,右踝,左髋,左膝,左踝] 
     * @return KeyPointType 代表不同位置的人体关键点信息，返回值为以下集合中的一个 [头部,颈部,右肩,右肘,右腕,左肩,左肘,左腕,右髋,右膝,右踝,左髋,左膝,左踝]
     */
    public String getKeyPointType() {
        return this.KeyPointType;
    }

    /**
     * Set 代表不同位置的人体关键点信息，返回值为以下集合中的一个 [头部,颈部,右肩,右肘,右腕,左肩,左肘,左腕,右髋,右膝,右踝,左髋,左膝,左踝]
     * @param KeyPointType 代表不同位置的人体关键点信息，返回值为以下集合中的一个 [头部,颈部,右肩,右肘,右腕,左肩,左肘,左腕,右髋,右膝,右踝,左髋,左膝,左踝]
     */
    public void setKeyPointType(String KeyPointType) {
        this.KeyPointType = KeyPointType;
    }

    /**
     * Get 人体关键点横坐标 
     * @return X 人体关键点横坐标
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set 人体关键点横坐标
     * @param X 人体关键点横坐标
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get 人体关键点纵坐标 
     * @return Y 人体关键点纵坐标
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set 人体关键点纵坐标
     * @param Y 人体关键点纵坐标
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public KeyPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyPointInfo(KeyPointInfo source) {
        if (source.KeyPointType != null) {
            this.KeyPointType = new String(source.KeyPointType);
        }
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyPointType", this.KeyPointType);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

