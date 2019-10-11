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

public class QrcodePositionObj  extends AbstractModel{

    /**
    * 左上顶点坐标（如果是条形码，X和Y都为-1）
    */
    @SerializedName("LeftTop")
    @Expose
    private Coord LeftTop;

    /**
    * 右上顶点坐标（如果是条形码，X和Y都为-1）
    */
    @SerializedName("RightTop")
    @Expose
    private Coord RightTop;

    /**
    * 右下顶点坐标（如果是条形码，X和Y都为-1）
    */
    @SerializedName("RightBottom")
    @Expose
    private Coord RightBottom;

    /**
    * 左下顶点坐标（如果是条形码，X和Y都为-1）
    */
    @SerializedName("LeftBottom")
    @Expose
    private Coord LeftBottom;

    /**
     * 获取左上顶点坐标（如果是条形码，X和Y都为-1）
     * @return LeftTop 左上顶点坐标（如果是条形码，X和Y都为-1）
     */
    public Coord getLeftTop() {
        return this.LeftTop;
    }

    /**
     * 设置左上顶点坐标（如果是条形码，X和Y都为-1）
     * @param LeftTop 左上顶点坐标（如果是条形码，X和Y都为-1）
     */
    public void setLeftTop(Coord LeftTop) {
        this.LeftTop = LeftTop;
    }

    /**
     * 获取右上顶点坐标（如果是条形码，X和Y都为-1）
     * @return RightTop 右上顶点坐标（如果是条形码，X和Y都为-1）
     */
    public Coord getRightTop() {
        return this.RightTop;
    }

    /**
     * 设置右上顶点坐标（如果是条形码，X和Y都为-1）
     * @param RightTop 右上顶点坐标（如果是条形码，X和Y都为-1）
     */
    public void setRightTop(Coord RightTop) {
        this.RightTop = RightTop;
    }

    /**
     * 获取右下顶点坐标（如果是条形码，X和Y都为-1）
     * @return RightBottom 右下顶点坐标（如果是条形码，X和Y都为-1）
     */
    public Coord getRightBottom() {
        return this.RightBottom;
    }

    /**
     * 设置右下顶点坐标（如果是条形码，X和Y都为-1）
     * @param RightBottom 右下顶点坐标（如果是条形码，X和Y都为-1）
     */
    public void setRightBottom(Coord RightBottom) {
        this.RightBottom = RightBottom;
    }

    /**
     * 获取左下顶点坐标（如果是条形码，X和Y都为-1）
     * @return LeftBottom 左下顶点坐标（如果是条形码，X和Y都为-1）
     */
    public Coord getLeftBottom() {
        return this.LeftBottom;
    }

    /**
     * 设置左下顶点坐标（如果是条形码，X和Y都为-1）
     * @param LeftBottom 左下顶点坐标（如果是条形码，X和Y都为-1）
     */
    public void setLeftBottom(Coord LeftBottom) {
        this.LeftBottom = LeftBottom;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LeftTop.", this.LeftTop);
        this.setParamObj(map, prefix + "RightTop.", this.RightTop);
        this.setParamObj(map, prefix + "RightBottom.", this.RightBottom);
        this.setParamObj(map, prefix + "LeftBottom.", this.LeftBottom);

    }
}

