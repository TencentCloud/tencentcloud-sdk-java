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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementTranslate extends AbstractModel {

    /**
    * X方向偏移量
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * Y方向偏移量
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
    * Z方向偏移量
    */
    @SerializedName("Z")
    @Expose
    private Float Z;

    /**
     * Get X方向偏移量 
     * @return X X方向偏移量
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set X方向偏移量
     * @param X X方向偏移量
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get Y方向偏移量 
     * @return Y Y方向偏移量
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set Y方向偏移量
     * @param Y Y方向偏移量
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    /**
     * Get Z方向偏移量 
     * @return Z Z方向偏移量
     */
    public Float getZ() {
        return this.Z;
    }

    /**
     * Set Z方向偏移量
     * @param Z Z方向偏移量
     */
    public void setZ(Float Z) {
        this.Z = Z;
    }

    public ElementTranslate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementTranslate(ElementTranslate source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
        if (source.Z != null) {
            this.Z = new Float(source.Z);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Z", this.Z);

    }
}

