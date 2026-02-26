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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Positions extends AbstractModel {

    /**
    * 这是OCR在高精度识别下返回的坐标值，采用的是由一个数组表示4个顶点的坐标构成，如[0,1,2,3,4,5,6,7]
- (0,1) 左上角坐标
- (2,3) 右上角坐标
- (4,5) 右下角坐标
- (6,7) 左下角坐标
    */
    @SerializedName("Position")
    @Expose
    private Long [] Position;

    /**
     * Get 这是OCR在高精度识别下返回的坐标值，采用的是由一个数组表示4个顶点的坐标构成，如[0,1,2,3,4,5,6,7]
- (0,1) 左上角坐标
- (2,3) 右上角坐标
- (4,5) 右下角坐标
- (6,7) 左下角坐标 
     * @return Position 这是OCR在高精度识别下返回的坐标值，采用的是由一个数组表示4个顶点的坐标构成，如[0,1,2,3,4,5,6,7]
- (0,1) 左上角坐标
- (2,3) 右上角坐标
- (4,5) 右下角坐标
- (6,7) 左下角坐标
     */
    public Long [] getPosition() {
        return this.Position;
    }

    /**
     * Set 这是OCR在高精度识别下返回的坐标值，采用的是由一个数组表示4个顶点的坐标构成，如[0,1,2,3,4,5,6,7]
- (0,1) 左上角坐标
- (2,3) 右上角坐标
- (4,5) 右下角坐标
- (6,7) 左下角坐标
     * @param Position 这是OCR在高精度识别下返回的坐标值，采用的是由一个数组表示4个顶点的坐标构成，如[0,1,2,3,4,5,6,7]
- (0,1) 左上角坐标
- (2,3) 右上角坐标
- (4,5) 右下角坐标
- (6,7) 左下角坐标
     */
    public void setPosition(Long [] Position) {
        this.Position = Position;
    }

    public Positions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Positions(Positions source) {
        if (source.Position != null) {
            this.Position = new Long[source.Position.length];
            for (int i = 0; i < source.Position.length; i++) {
                this.Position[i] = new Long(source.Position[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Position.", this.Position);

    }
}

