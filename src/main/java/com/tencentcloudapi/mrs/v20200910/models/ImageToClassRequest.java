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

public class ImageToClassRequest extends AbstractModel{

    /**
    * 图片列表，允许传入多张图片，支持传入图片的url或base64编码
    */
    @SerializedName("ImageInfoList")
    @Expose
    private ImageInfo [] ImageInfoList;

    /**
    * 图片处理参数
    */
    @SerializedName("HandleParam")
    @Expose
    private HandleParam HandleParam;

    /**
    * 图片类型，目前支持11（检验报告），12（检查报告），15（病理报告），218（诊断证明）。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 图片列表，允许传入多张图片，支持传入图片的url或base64编码 
     * @return ImageInfoList 图片列表，允许传入多张图片，支持传入图片的url或base64编码
     */
    public ImageInfo [] getImageInfoList() {
        return this.ImageInfoList;
    }

    /**
     * Set 图片列表，允许传入多张图片，支持传入图片的url或base64编码
     * @param ImageInfoList 图片列表，允许传入多张图片，支持传入图片的url或base64编码
     */
    public void setImageInfoList(ImageInfo [] ImageInfoList) {
        this.ImageInfoList = ImageInfoList;
    }

    /**
     * Get 图片处理参数 
     * @return HandleParam 图片处理参数
     */
    public HandleParam getHandleParam() {
        return this.HandleParam;
    }

    /**
     * Set 图片处理参数
     * @param HandleParam 图片处理参数
     */
    public void setHandleParam(HandleParam HandleParam) {
        this.HandleParam = HandleParam;
    }

    /**
     * Get 图片类型，目前支持11（检验报告），12（检查报告），15（病理报告），218（诊断证明）。 
     * @return Type 图片类型，目前支持11（检验报告），12（检查报告），15（病理报告），218（诊断证明）。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 图片类型，目前支持11（检验报告），12（检查报告），15（病理报告），218（诊断证明）。
     * @param Type 图片类型，目前支持11（检验报告），12（检查报告），15（病理报告），218（诊断证明）。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ImageToClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageToClassRequest(ImageToClassRequest source) {
        if (source.ImageInfoList != null) {
            this.ImageInfoList = new ImageInfo[source.ImageInfoList.length];
            for (int i = 0; i < source.ImageInfoList.length; i++) {
                this.ImageInfoList[i] = new ImageInfo(source.ImageInfoList[i]);
            }
        }
        if (source.HandleParam != null) {
            this.HandleParam = new HandleParam(source.HandleParam);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfoList.", this.ImageInfoList);
        this.setParamObj(map, prefix + "HandleParam.", this.HandleParam);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

