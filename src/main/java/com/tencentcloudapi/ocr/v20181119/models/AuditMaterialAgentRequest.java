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

public class AuditMaterialAgentRequest extends AbstractModel {

    /**
    * <p>资料审核Agent类型，不同类型包含不同的输入、输出参数，提供不同的审核能力。</p><p>枚举值：</p><ul><li>StorePicAudit： 商户照片审核</li></ul>
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>商户照片分类是否输出具体场景标签。注：开启后耗时会增加。 支持该入参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("NeedSceneType")
    @Expose
    private Boolean NeedSceneType;

    /**
    * <p>商户名称信息，辅助判断具体场景标签。注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
    */
    @SerializedName("StoreInfoHint")
    @Expose
    private String StoreInfoHint;

    /**
    * <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
    */
    @SerializedName("IgnoreWatermarkCategories")
    @Expose
    private String [] IgnoreWatermarkCategories;

    /**
     * Get <p>资料审核Agent类型，不同类型包含不同的输入、输出参数，提供不同的审核能力。</p><p>枚举值：</p><ul><li>StorePicAudit： 商户照片审核</li></ul> 
     * @return AgentType <p>资料审核Agent类型，不同类型包含不同的输入、输出参数，提供不同的审核能力。</p><p>枚举值：</p><ul><li>StorePicAudit： 商户照片审核</li></ul>
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>资料审核Agent类型，不同类型包含不同的输入、输出参数，提供不同的审核能力。</p><p>枚举值：</p><ul><li>StorePicAudit： 商户照片审核</li></ul>
     * @param AgentType <p>资料审核Agent类型，不同类型包含不同的输入、输出参数，提供不同的审核能力。</p><p>枚举值：</p><ul><li>StorePicAudit： 商户照片审核</li></ul>
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>商户照片分类是否输出具体场景标签。注：开启后耗时会增加。 支持该入参的资料审核Agent类型：StorePicAudit</p> 
     * @return NeedSceneType <p>商户照片分类是否输出具体场景标签。注：开启后耗时会增加。 支持该入参的资料审核Agent类型：StorePicAudit</p>
     */
    public Boolean getNeedSceneType() {
        return this.NeedSceneType;
    }

    /**
     * Set <p>商户照片分类是否输出具体场景标签。注：开启后耗时会增加。 支持该入参的资料审核Agent类型：StorePicAudit</p>
     * @param NeedSceneType <p>商户照片分类是否输出具体场景标签。注：开启后耗时会增加。 支持该入参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setNeedSceneType(Boolean NeedSceneType) {
        this.NeedSceneType = NeedSceneType;
    }

    /**
     * Get <p>商户名称信息，辅助判断具体场景标签。注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p> 
     * @return StoreInfoHint <p>商户名称信息，辅助判断具体场景标签。注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public String getStoreInfoHint() {
        return this.StoreInfoHint;
    }

    /**
     * Set <p>商户名称信息，辅助判断具体场景标签。注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     * @param StoreInfoHint <p>商户名称信息，辅助判断具体场景标签。注：仅SceneType配置为true时支持。  支持该出参的资料审核Agent类型：StorePicAudit</p>
     */
    public void setStoreInfoHint(String StoreInfoHint) {
        this.StoreInfoHint = StoreInfoHint;
    }

    /**
     * Get <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p> 
     * @return IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     */
    public String [] getIgnoreWatermarkCategories() {
        return this.IgnoreWatermarkCategories;
    }

    /**
     * Set <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     * @param IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     */
    public void setIgnoreWatermarkCategories(String [] IgnoreWatermarkCategories) {
        this.IgnoreWatermarkCategories = IgnoreWatermarkCategories;
    }

    public AuditMaterialAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditMaterialAgentRequest(AuditMaterialAgentRequest source) {
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.NeedSceneType != null) {
            this.NeedSceneType = new Boolean(source.NeedSceneType);
        }
        if (source.StoreInfoHint != null) {
            this.StoreInfoHint = new String(source.StoreInfoHint);
        }
        if (source.IgnoreWatermarkCategories != null) {
            this.IgnoreWatermarkCategories = new String[source.IgnoreWatermarkCategories.length];
            for (int i = 0; i < source.IgnoreWatermarkCategories.length; i++) {
                this.IgnoreWatermarkCategories[i] = new String(source.IgnoreWatermarkCategories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "NeedSceneType", this.NeedSceneType);
        this.setParamSimple(map, prefix + "StoreInfoHint", this.StoreInfoHint);
        this.setParamArraySimple(map, prefix + "IgnoreWatermarkCategories.", this.IgnoreWatermarkCategories);

    }
}

