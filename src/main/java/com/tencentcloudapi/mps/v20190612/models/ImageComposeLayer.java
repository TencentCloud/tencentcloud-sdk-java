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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageComposeLayer extends AbstractModel {

    /**
    * <p>图层堆叠顺序，必填。同一请求内不可重复，数值越大越靠上（建议从 0 开始连续编号）。</p>
    */
    @SerializedName("ZIndex")
    @Expose
    private Long ZIndex;

    /**
    * <p>图层图片来源，必填。支持 URL / COS / AWS-S3 / VOD。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>图层在画布中的位置与尺寸，必填。长度为 4 的数组 [X1, Y1, X2, Y2]：左上角 + 右下角坐标，要求 X2 &gt; X1、Y2 &gt;    Y1。</p><p>两种语义（与图片擦除能力的 BoundingBox 对齐）：</p><ul><li>像素：坐标值，取值范围 [-10240,    10240]，允许为负或超出画布（超出部分被裁掉）；</li><li>比例：各值 ∈ [-1, 1]，按画布宽高换算（x 乘画布宽、y    乘画布高）。</li></ul><p>图层会缩放填满该矩形；超出画布的部分一律裁掉，输出尺寸恒等于画布尺寸。</p>
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
    * <p>坐标单位，与图片擦除能力对齐。取值：</p><ul><li>0：自动判定（不传时的默认值）；</li><li>1：比例；</li><li>2：像素。</li></ul><p>自动判定规则：四个值全部大于 1 按像素解释、全部不大于 1 按比例解释；混合取值会返回InvalidParameter，建议始终显式指定。</p>
    */
    @SerializedName("BoundingBoxUnitType")
    @Expose
    private Long BoundingBoxUnitType;

    /**
     * Get <p>图层堆叠顺序，必填。同一请求内不可重复，数值越大越靠上（建议从 0 开始连续编号）。</p> 
     * @return ZIndex <p>图层堆叠顺序，必填。同一请求内不可重复，数值越大越靠上（建议从 0 开始连续编号）。</p>
     */
    public Long getZIndex() {
        return this.ZIndex;
    }

    /**
     * Set <p>图层堆叠顺序，必填。同一请求内不可重复，数值越大越靠上（建议从 0 开始连续编号）。</p>
     * @param ZIndex <p>图层堆叠顺序，必填。同一请求内不可重复，数值越大越靠上（建议从 0 开始连续编号）。</p>
     */
    public void setZIndex(Long ZIndex) {
        this.ZIndex = ZIndex;
    }

    /**
     * Get <p>图层图片来源，必填。支持 URL / COS / AWS-S3 / VOD。</p> 
     * @return InputInfo <p>图层图片来源，必填。支持 URL / COS / AWS-S3 / VOD。</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>图层图片来源，必填。支持 URL / COS / AWS-S3 / VOD。</p>
     * @param InputInfo <p>图层图片来源，必填。支持 URL / COS / AWS-S3 / VOD。</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>图层在画布中的位置与尺寸，必填。长度为 4 的数组 [X1, Y1, X2, Y2]：左上角 + 右下角坐标，要求 X2 &gt; X1、Y2 &gt;    Y1。</p><p>两种语义（与图片擦除能力的 BoundingBox 对齐）：</p><ul><li>像素：坐标值，取值范围 [-10240,    10240]，允许为负或超出画布（超出部分被裁掉）；</li><li>比例：各值 ∈ [-1, 1]，按画布宽高换算（x 乘画布宽、y    乘画布高）。</li></ul><p>图层会缩放填满该矩形；超出画布的部分一律裁掉，输出尺寸恒等于画布尺寸。</p> 
     * @return BoundingBox <p>图层在画布中的位置与尺寸，必填。长度为 4 的数组 [X1, Y1, X2, Y2]：左上角 + 右下角坐标，要求 X2 &gt; X1、Y2 &gt;    Y1。</p><p>两种语义（与图片擦除能力的 BoundingBox 对齐）：</p><ul><li>像素：坐标值，取值范围 [-10240,    10240]，允许为负或超出画布（超出部分被裁掉）；</li><li>比例：各值 ∈ [-1, 1]，按画布宽高换算（x 乘画布宽、y    乘画布高）。</li></ul><p>图层会缩放填满该矩形；超出画布的部分一律裁掉，输出尺寸恒等于画布尺寸。</p>
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set <p>图层在画布中的位置与尺寸，必填。长度为 4 的数组 [X1, Y1, X2, Y2]：左上角 + 右下角坐标，要求 X2 &gt; X1、Y2 &gt;    Y1。</p><p>两种语义（与图片擦除能力的 BoundingBox 对齐）：</p><ul><li>像素：坐标值，取值范围 [-10240,    10240]，允许为负或超出画布（超出部分被裁掉）；</li><li>比例：各值 ∈ [-1, 1]，按画布宽高换算（x 乘画布宽、y    乘画布高）。</li></ul><p>图层会缩放填满该矩形；超出画布的部分一律裁掉，输出尺寸恒等于画布尺寸。</p>
     * @param BoundingBox <p>图层在画布中的位置与尺寸，必填。长度为 4 的数组 [X1, Y1, X2, Y2]：左上角 + 右下角坐标，要求 X2 &gt; X1、Y2 &gt;    Y1。</p><p>两种语义（与图片擦除能力的 BoundingBox 对齐）：</p><ul><li>像素：坐标值，取值范围 [-10240,    10240]，允许为负或超出画布（超出部分被裁掉）；</li><li>比例：各值 ∈ [-1, 1]，按画布宽高换算（x 乘画布宽、y    乘画布高）。</li></ul><p>图层会缩放填满该矩形；超出画布的部分一律裁掉，输出尺寸恒等于画布尺寸。</p>
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get <p>坐标单位，与图片擦除能力对齐。取值：</p><ul><li>0：自动判定（不传时的默认值）；</li><li>1：比例；</li><li>2：像素。</li></ul><p>自动判定规则：四个值全部大于 1 按像素解释、全部不大于 1 按比例解释；混合取值会返回InvalidParameter，建议始终显式指定。</p> 
     * @return BoundingBoxUnitType <p>坐标单位，与图片擦除能力对齐。取值：</p><ul><li>0：自动判定（不传时的默认值）；</li><li>1：比例；</li><li>2：像素。</li></ul><p>自动判定规则：四个值全部大于 1 按像素解释、全部不大于 1 按比例解释；混合取值会返回InvalidParameter，建议始终显式指定。</p>
     */
    public Long getBoundingBoxUnitType() {
        return this.BoundingBoxUnitType;
    }

    /**
     * Set <p>坐标单位，与图片擦除能力对齐。取值：</p><ul><li>0：自动判定（不传时的默认值）；</li><li>1：比例；</li><li>2：像素。</li></ul><p>自动判定规则：四个值全部大于 1 按像素解释、全部不大于 1 按比例解释；混合取值会返回InvalidParameter，建议始终显式指定。</p>
     * @param BoundingBoxUnitType <p>坐标单位，与图片擦除能力对齐。取值：</p><ul><li>0：自动判定（不传时的默认值）；</li><li>1：比例；</li><li>2：像素。</li></ul><p>自动判定规则：四个值全部大于 1 按像素解释、全部不大于 1 按比例解释；混合取值会返回InvalidParameter，建议始终显式指定。</p>
     */
    public void setBoundingBoxUnitType(Long BoundingBoxUnitType) {
        this.BoundingBoxUnitType = BoundingBoxUnitType;
    }

    public ImageComposeLayer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComposeLayer(ImageComposeLayer source) {
        if (source.ZIndex != null) {
            this.ZIndex = new Long(source.ZIndex);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new Float[source.BoundingBox.length];
            for (int i = 0; i < source.BoundingBox.length; i++) {
                this.BoundingBox[i] = new Float(source.BoundingBox[i]);
            }
        }
        if (source.BoundingBoxUnitType != null) {
            this.BoundingBoxUnitType = new Long(source.BoundingBoxUnitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZIndex", this.ZIndex);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "BoundingBoxUnitType", this.BoundingBoxUnitType);

    }
}

