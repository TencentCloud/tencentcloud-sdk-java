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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coord extends AbstractModel{

    /**
    * 横坐标
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get 横坐标 
     * @return X 横坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 横坐标
     * @param X 横坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 纵坐标 
     * @return Y 纵坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 纵坐标
     * @param Y 纵坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

