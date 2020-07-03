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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodePosition extends AbstractModel{

    /**
    * 二维码边界点X轴坐标
    */
    @SerializedName("FloatX")
    @Expose
    private Float FloatX;

    /**
    * 二维码边界点Y轴坐标
    */
    @SerializedName("FloatY")
    @Expose
    private Float FloatY;

    /**
     * Get 二维码边界点X轴坐标 
     * @return FloatX 二维码边界点X轴坐标
     */
    public Float getFloatX() {
        return this.FloatX;
    }

    /**
     * Set 二维码边界点X轴坐标
     * @param FloatX 二维码边界点X轴坐标
     */
    public void setFloatX(Float FloatX) {
        this.FloatX = FloatX;
    }

    /**
     * Get 二维码边界点Y轴坐标 
     * @return FloatY 二维码边界点Y轴坐标
     */
    public Float getFloatY() {
        return this.FloatY;
    }

    /**
     * Set 二维码边界点Y轴坐标
     * @param FloatY 二维码边界点Y轴坐标
     */
    public void setFloatY(Float FloatY) {
        this.FloatY = FloatY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FloatX", this.FloatX);
        this.setParamSimple(map, prefix + "FloatY", this.FloatY);

    }
}

