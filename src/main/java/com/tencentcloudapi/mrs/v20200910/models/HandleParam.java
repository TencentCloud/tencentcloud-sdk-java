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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleParam extends AbstractModel{

    /**
    * ocr引擎
    */
    @SerializedName("OcrEngineType")
    @Expose
    private Long OcrEngineType;

    /**
    * 是否返回分行文本内容
    */
    @SerializedName("IsReturnText")
    @Expose
    private Boolean IsReturnText;

    /**
    * 顺时针旋转角度
    */
    @SerializedName("RotateTheAngle")
    @Expose
    private Float RotateTheAngle;

    /**
    * 自动适配方向,仅支持优图引擎
    */
    @SerializedName("AutoFitDirection")
    @Expose
    private Boolean AutoFitDirection;

    /**
    * 坐标优化
    */
    @SerializedName("AutoOptimizeCoordinate")
    @Expose
    private Boolean AutoOptimizeCoordinate;

    /**
    * 是否开启图片压缩，开启时imageOriginalSize必须正确填写
    */
    @SerializedName("IsScale")
    @Expose
    private Boolean IsScale;

    /**
    * 原始图片大小(单位byes),用来判断该图片是否需要压缩
    */
    @SerializedName("ImageOriginalSize")
    @Expose
    private Long ImageOriginalSize;

    /**
    * 采用后台默认值(2048Kb)
    */
    @SerializedName("ScaleTargetSize")
    @Expose
    private Long ScaleTargetSize;

    /**
     * Get ocr引擎 
     * @return OcrEngineType ocr引擎
     */
    public Long getOcrEngineType() {
        return this.OcrEngineType;
    }

    /**
     * Set ocr引擎
     * @param OcrEngineType ocr引擎
     */
    public void setOcrEngineType(Long OcrEngineType) {
        this.OcrEngineType = OcrEngineType;
    }

    /**
     * Get 是否返回分行文本内容 
     * @return IsReturnText 是否返回分行文本内容
     */
    public Boolean getIsReturnText() {
        return this.IsReturnText;
    }

    /**
     * Set 是否返回分行文本内容
     * @param IsReturnText 是否返回分行文本内容
     */
    public void setIsReturnText(Boolean IsReturnText) {
        this.IsReturnText = IsReturnText;
    }

    /**
     * Get 顺时针旋转角度 
     * @return RotateTheAngle 顺时针旋转角度
     */
    public Float getRotateTheAngle() {
        return this.RotateTheAngle;
    }

    /**
     * Set 顺时针旋转角度
     * @param RotateTheAngle 顺时针旋转角度
     */
    public void setRotateTheAngle(Float RotateTheAngle) {
        this.RotateTheAngle = RotateTheAngle;
    }

    /**
     * Get 自动适配方向,仅支持优图引擎 
     * @return AutoFitDirection 自动适配方向,仅支持优图引擎
     */
    public Boolean getAutoFitDirection() {
        return this.AutoFitDirection;
    }

    /**
     * Set 自动适配方向,仅支持优图引擎
     * @param AutoFitDirection 自动适配方向,仅支持优图引擎
     */
    public void setAutoFitDirection(Boolean AutoFitDirection) {
        this.AutoFitDirection = AutoFitDirection;
    }

    /**
     * Get 坐标优化 
     * @return AutoOptimizeCoordinate 坐标优化
     */
    public Boolean getAutoOptimizeCoordinate() {
        return this.AutoOptimizeCoordinate;
    }

    /**
     * Set 坐标优化
     * @param AutoOptimizeCoordinate 坐标优化
     */
    public void setAutoOptimizeCoordinate(Boolean AutoOptimizeCoordinate) {
        this.AutoOptimizeCoordinate = AutoOptimizeCoordinate;
    }

    /**
     * Get 是否开启图片压缩，开启时imageOriginalSize必须正确填写 
     * @return IsScale 是否开启图片压缩，开启时imageOriginalSize必须正确填写
     */
    public Boolean getIsScale() {
        return this.IsScale;
    }

    /**
     * Set 是否开启图片压缩，开启时imageOriginalSize必须正确填写
     * @param IsScale 是否开启图片压缩，开启时imageOriginalSize必须正确填写
     */
    public void setIsScale(Boolean IsScale) {
        this.IsScale = IsScale;
    }

    /**
     * Get 原始图片大小(单位byes),用来判断该图片是否需要压缩 
     * @return ImageOriginalSize 原始图片大小(单位byes),用来判断该图片是否需要压缩
     */
    public Long getImageOriginalSize() {
        return this.ImageOriginalSize;
    }

    /**
     * Set 原始图片大小(单位byes),用来判断该图片是否需要压缩
     * @param ImageOriginalSize 原始图片大小(单位byes),用来判断该图片是否需要压缩
     */
    public void setImageOriginalSize(Long ImageOriginalSize) {
        this.ImageOriginalSize = ImageOriginalSize;
    }

    /**
     * Get 采用后台默认值(2048Kb) 
     * @return ScaleTargetSize 采用后台默认值(2048Kb)
     */
    public Long getScaleTargetSize() {
        return this.ScaleTargetSize;
    }

    /**
     * Set 采用后台默认值(2048Kb)
     * @param ScaleTargetSize 采用后台默认值(2048Kb)
     */
    public void setScaleTargetSize(Long ScaleTargetSize) {
        this.ScaleTargetSize = ScaleTargetSize;
    }

    public HandleParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleParam(HandleParam source) {
        if (source.OcrEngineType != null) {
            this.OcrEngineType = new Long(source.OcrEngineType);
        }
        if (source.IsReturnText != null) {
            this.IsReturnText = new Boolean(source.IsReturnText);
        }
        if (source.RotateTheAngle != null) {
            this.RotateTheAngle = new Float(source.RotateTheAngle);
        }
        if (source.AutoFitDirection != null) {
            this.AutoFitDirection = new Boolean(source.AutoFitDirection);
        }
        if (source.AutoOptimizeCoordinate != null) {
            this.AutoOptimizeCoordinate = new Boolean(source.AutoOptimizeCoordinate);
        }
        if (source.IsScale != null) {
            this.IsScale = new Boolean(source.IsScale);
        }
        if (source.ImageOriginalSize != null) {
            this.ImageOriginalSize = new Long(source.ImageOriginalSize);
        }
        if (source.ScaleTargetSize != null) {
            this.ScaleTargetSize = new Long(source.ScaleTargetSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OcrEngineType", this.OcrEngineType);
        this.setParamSimple(map, prefix + "IsReturnText", this.IsReturnText);
        this.setParamSimple(map, prefix + "RotateTheAngle", this.RotateTheAngle);
        this.setParamSimple(map, prefix + "AutoFitDirection", this.AutoFitDirection);
        this.setParamSimple(map, prefix + "AutoOptimizeCoordinate", this.AutoOptimizeCoordinate);
        this.setParamSimple(map, prefix + "IsScale", this.IsScale);
        this.setParamSimple(map, prefix + "ImageOriginalSize", this.ImageOriginalSize);
        this.setParamSimple(map, prefix + "ScaleTargetSize", this.ScaleTargetSize);

    }
}

