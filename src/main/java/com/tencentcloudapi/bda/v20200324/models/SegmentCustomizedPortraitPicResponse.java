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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentCustomizedPortraitPicResponse extends AbstractModel{

    /**
    * 根据指定标签分割输出的透明背景人像图片的 base64 数据。
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * 指定标签处理后的Mask。一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
    */
    @SerializedName("MaskImage")
    @Expose
    private String MaskImage;

    /**
    * 坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageRects")
    @Expose
    private ImageRect [] ImageRects;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 根据指定标签分割输出的透明背景人像图片的 base64 数据。 
     * @return PortraitImage 根据指定标签分割输出的透明背景人像图片的 base64 数据。
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set 根据指定标签分割输出的透明背景人像图片的 base64 数据。
     * @param PortraitImage 根据指定标签分割输出的透明背景人像图片的 base64 数据。
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get 指定标签处理后的Mask。一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255） 
     * @return MaskImage 指定标签处理后的Mask。一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
     */
    public String getMaskImage() {
        return this.MaskImage;
    }

    /**
     * Set 指定标签处理后的Mask。一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
     * @param MaskImage 指定标签处理后的Mask。一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
     */
    public void setMaskImage(String MaskImage) {
        this.MaskImage = MaskImage;
    }

    /**
     * Get 坐标信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageRects 坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageRect [] getImageRects() {
        return this.ImageRects;
    }

    /**
     * Set 坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageRects 坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageRects(ImageRect [] ImageRects) {
        this.ImageRects = ImageRects;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SegmentCustomizedPortraitPicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentCustomizedPortraitPicResponse(SegmentCustomizedPortraitPicResponse source) {
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.MaskImage != null) {
            this.MaskImage = new String(source.MaskImage);
        }
        if (source.ImageRects != null) {
            this.ImageRects = new ImageRect[source.ImageRects.length];
            for (int i = 0; i < source.ImageRects.length; i++) {
                this.ImageRects[i] = new ImageRect(source.ImageRects[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamSimple(map, prefix + "MaskImage", this.MaskImage);
        this.setParamArrayObj(map, prefix + "ImageRects.", this.ImageRects);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

