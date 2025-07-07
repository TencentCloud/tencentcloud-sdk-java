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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FusionUltraParam extends AbstractModel {

    /**
    * 拉脸强度。主要用于调整生成结果人脸脸型更像素材模板还是用户人脸。取值越大越像用户人脸。
取值范围：0-1之间。默认取值0.7。

该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("WarpRadio")
    @Expose
    private Float WarpRadio;

    /**
    * 人脸增强强度。对整个人脸进行增强，增加清晰度，改善质量。当生成的人脸不够清晰，质感不够好的时候可以设置。取值越大增强强度越大。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("EnhanceRadio")
    @Expose
    private Float EnhanceRadio;

    /**
    * 磨皮强度。当生成脸的图像面部显脏时，可进行设置。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("MpRadio")
    @Expose
    private Float MpRadio;

    /**
    * 人脸模糊开关（暂不支持）
当生成人脸比较清晰时，将人脸模糊到接近模板的清晰度的程度

该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("BlurRadio")
    @Expose
    private Float BlurRadio;

    /**
    * 牙齿增强开关，默认取值为1
牙齿增强，修复牙齿。当生成牙齿不好（如牙齿裂开）可以打开此开关
0：牙齿增强关闭
1：牙齿增强打开
该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("TeethEnhanceRadio")
    @Expose
    private Float TeethEnhanceRadio;

    /**
    * 妆容迁移开关，默认取值为0。
将素材模板的妆容迁移到融合结果上。即：如果希望妆容效果与模板图保持一致，可以打开此开关。
0：妆容迁移关闭
1：妆容迁移打开
该参数仅对SwapModelType（模型类型）取值1-5生效
    */
    @SerializedName("MakeupTransferRadio")
    @Expose
    private Float MakeupTransferRadio;

    /**
     * Get 拉脸强度。主要用于调整生成结果人脸脸型更像素材模板还是用户人脸。取值越大越像用户人脸。
取值范围：0-1之间。默认取值0.7。

该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return WarpRadio 拉脸强度。主要用于调整生成结果人脸脸型更像素材模板还是用户人脸。取值越大越像用户人脸。
取值范围：0-1之间。默认取值0.7。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getWarpRadio() {
        return this.WarpRadio;
    }

    /**
     * Set 拉脸强度。主要用于调整生成结果人脸脸型更像素材模板还是用户人脸。取值越大越像用户人脸。
取值范围：0-1之间。默认取值0.7。

该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param WarpRadio 拉脸强度。主要用于调整生成结果人脸脸型更像素材模板还是用户人脸。取值越大越像用户人脸。
取值范围：0-1之间。默认取值0.7。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setWarpRadio(Float WarpRadio) {
        this.WarpRadio = WarpRadio;
    }

    /**
     * Get 人脸增强强度。对整个人脸进行增强，增加清晰度，改善质量。当生成的人脸不够清晰，质感不够好的时候可以设置。取值越大增强强度越大。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return EnhanceRadio 人脸增强强度。对整个人脸进行增强，增加清晰度，改善质量。当生成的人脸不够清晰，质感不够好的时候可以设置。取值越大增强强度越大。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getEnhanceRadio() {
        return this.EnhanceRadio;
    }

    /**
     * Set 人脸增强强度。对整个人脸进行增强，增加清晰度，改善质量。当生成的人脸不够清晰，质感不够好的时候可以设置。取值越大增强强度越大。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param EnhanceRadio 人脸增强强度。对整个人脸进行增强，增加清晰度，改善质量。当生成的人脸不够清晰，质感不够好的时候可以设置。取值越大增强强度越大。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setEnhanceRadio(Float EnhanceRadio) {
        this.EnhanceRadio = EnhanceRadio;
    }

    /**
     * Get 磨皮强度。当生成脸的图像面部显脏时，可进行设置。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return MpRadio 磨皮强度。当生成脸的图像面部显脏时，可进行设置。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getMpRadio() {
        return this.MpRadio;
    }

    /**
     * Set 磨皮强度。当生成脸的图像面部显脏时，可进行设置。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param MpRadio 磨皮强度。当生成脸的图像面部显脏时，可进行设置。
取值范围：0-1之间。默认取值0.5。

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setMpRadio(Float MpRadio) {
        this.MpRadio = MpRadio;
    }

    /**
     * Get 人脸模糊开关（暂不支持）
当生成人脸比较清晰时，将人脸模糊到接近模板的清晰度的程度

该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return BlurRadio 人脸模糊开关（暂不支持）
当生成人脸比较清晰时，将人脸模糊到接近模板的清晰度的程度

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getBlurRadio() {
        return this.BlurRadio;
    }

    /**
     * Set 人脸模糊开关（暂不支持）
当生成人脸比较清晰时，将人脸模糊到接近模板的清晰度的程度

该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param BlurRadio 人脸模糊开关（暂不支持）
当生成人脸比较清晰时，将人脸模糊到接近模板的清晰度的程度

该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setBlurRadio(Float BlurRadio) {
        this.BlurRadio = BlurRadio;
    }

    /**
     * Get 牙齿增强开关，默认取值为1
牙齿增强，修复牙齿。当生成牙齿不好（如牙齿裂开）可以打开此开关
0：牙齿增强关闭
1：牙齿增强打开
该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return TeethEnhanceRadio 牙齿增强开关，默认取值为1
牙齿增强，修复牙齿。当生成牙齿不好（如牙齿裂开）可以打开此开关
0：牙齿增强关闭
1：牙齿增强打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getTeethEnhanceRadio() {
        return this.TeethEnhanceRadio;
    }

    /**
     * Set 牙齿增强开关，默认取值为1
牙齿增强，修复牙齿。当生成牙齿不好（如牙齿裂开）可以打开此开关
0：牙齿增强关闭
1：牙齿增强打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param TeethEnhanceRadio 牙齿增强开关，默认取值为1
牙齿增强，修复牙齿。当生成牙齿不好（如牙齿裂开）可以打开此开关
0：牙齿增强关闭
1：牙齿增强打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setTeethEnhanceRadio(Float TeethEnhanceRadio) {
        this.TeethEnhanceRadio = TeethEnhanceRadio;
    }

    /**
     * Get 妆容迁移开关，默认取值为0。
将素材模板的妆容迁移到融合结果上。即：如果希望妆容效果与模板图保持一致，可以打开此开关。
0：妆容迁移关闭
1：妆容迁移打开
该参数仅对SwapModelType（模型类型）取值1-5生效 
     * @return MakeupTransferRadio 妆容迁移开关，默认取值为0。
将素材模板的妆容迁移到融合结果上。即：如果希望妆容效果与模板图保持一致，可以打开此开关。
0：妆容迁移关闭
1：妆容迁移打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public Float getMakeupTransferRadio() {
        return this.MakeupTransferRadio;
    }

    /**
     * Set 妆容迁移开关，默认取值为0。
将素材模板的妆容迁移到融合结果上。即：如果希望妆容效果与模板图保持一致，可以打开此开关。
0：妆容迁移关闭
1：妆容迁移打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     * @param MakeupTransferRadio 妆容迁移开关，默认取值为0。
将素材模板的妆容迁移到融合结果上。即：如果希望妆容效果与模板图保持一致，可以打开此开关。
0：妆容迁移关闭
1：妆容迁移打开
该参数仅对SwapModelType（模型类型）取值1-5生效
     */
    public void setMakeupTransferRadio(Float MakeupTransferRadio) {
        this.MakeupTransferRadio = MakeupTransferRadio;
    }

    public FusionUltraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FusionUltraParam(FusionUltraParam source) {
        if (source.WarpRadio != null) {
            this.WarpRadio = new Float(source.WarpRadio);
        }
        if (source.EnhanceRadio != null) {
            this.EnhanceRadio = new Float(source.EnhanceRadio);
        }
        if (source.MpRadio != null) {
            this.MpRadio = new Float(source.MpRadio);
        }
        if (source.BlurRadio != null) {
            this.BlurRadio = new Float(source.BlurRadio);
        }
        if (source.TeethEnhanceRadio != null) {
            this.TeethEnhanceRadio = new Float(source.TeethEnhanceRadio);
        }
        if (source.MakeupTransferRadio != null) {
            this.MakeupTransferRadio = new Float(source.MakeupTransferRadio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarpRadio", this.WarpRadio);
        this.setParamSimple(map, prefix + "EnhanceRadio", this.EnhanceRadio);
        this.setParamSimple(map, prefix + "MpRadio", this.MpRadio);
        this.setParamSimple(map, prefix + "BlurRadio", this.BlurRadio);
        this.setParamSimple(map, prefix + "TeethEnhanceRadio", this.TeethEnhanceRadio);
        this.setParamSimple(map, prefix + "MakeupTransferRadio", this.MakeupTransferRadio);

    }
}

