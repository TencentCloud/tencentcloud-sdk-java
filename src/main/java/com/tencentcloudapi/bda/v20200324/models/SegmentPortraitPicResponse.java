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

public class SegmentPortraitPicResponse extends AbstractModel{

    /**
    * 处理后的图片 base64 数据，透明背景图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultImage")
    @Expose
    private String ResultImage;

    /**
    * 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultMask")
    @Expose
    private String ResultMask;

    /**
    * 图片是否存在前景。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasForeground")
    @Expose
    private Boolean HasForeground;

    /**
    * 支持将处理过的图片 base64 数据，透明背景图以URL的形式返回值，URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultImageUrl")
    @Expose
    private String ResultImageUrl;

    /**
    * 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。支持以URL形式的返回值；URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultMaskUrl")
    @Expose
    private String ResultMaskUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 处理后的图片 base64 数据，透明背景图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultImage 处理后的图片 base64 数据，透明背景图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultImage() {
        return this.ResultImage;
    }

    /**
     * Set 处理后的图片 base64 数据，透明背景图
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultImage 处理后的图片 base64 数据，透明背景图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultImage(String ResultImage) {
        this.ResultImage = ResultImage;
    }

    /**
     * Get 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultMask 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultMask() {
        return this.ResultMask;
    }

    /**
     * Set 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultMask 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。这些浮点数代表原图从左上角开始的每一行的每一个像素点，每一个浮点数的值是原图相应像素点位于人体轮廓内的置信度（0-1）转化的灰度值（0-255）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultMask(String ResultMask) {
        this.ResultMask = ResultMask;
    }

    /**
     * Get 图片是否存在前景。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasForeground 图片是否存在前景。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasForeground() {
        return this.HasForeground;
    }

    /**
     * Set 图片是否存在前景。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasForeground 图片是否存在前景。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasForeground(Boolean HasForeground) {
        this.HasForeground = HasForeground;
    }

    /**
     * Get 支持将处理过的图片 base64 数据，透明背景图以URL的形式返回值，URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultImageUrl 支持将处理过的图片 base64 数据，透明背景图以URL的形式返回值，URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultImageUrl() {
        return this.ResultImageUrl;
    }

    /**
     * Set 支持将处理过的图片 base64 数据，透明背景图以URL的形式返回值，URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultImageUrl 支持将处理过的图片 base64 数据，透明背景图以URL的形式返回值，URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultImageUrl(String ResultImageUrl) {
        this.ResultImageUrl = ResultImageUrl;
    }

    /**
     * Get 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。支持以URL形式的返回值；URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultMaskUrl 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。支持以URL形式的返回值；URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultMaskUrl() {
        return this.ResultMaskUrl;
    }

    /**
     * Set 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。支持以URL形式的返回值；URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultMaskUrl 一个通过 Base64 编码的文件，解码后文件由 Float 型浮点数组成。支持以URL形式的返回值；URL有效期为30分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultMaskUrl(String ResultMaskUrl) {
        this.ResultMaskUrl = ResultMaskUrl;
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

    public SegmentPortraitPicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentPortraitPicResponse(SegmentPortraitPicResponse source) {
        if (source.ResultImage != null) {
            this.ResultImage = new String(source.ResultImage);
        }
        if (source.ResultMask != null) {
            this.ResultMask = new String(source.ResultMask);
        }
        if (source.HasForeground != null) {
            this.HasForeground = new Boolean(source.HasForeground);
        }
        if (source.ResultImageUrl != null) {
            this.ResultImageUrl = new String(source.ResultImageUrl);
        }
        if (source.ResultMaskUrl != null) {
            this.ResultMaskUrl = new String(source.ResultMaskUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultImage", this.ResultImage);
        this.setParamSimple(map, prefix + "ResultMask", this.ResultMask);
        this.setParamSimple(map, prefix + "HasForeground", this.HasForeground);
        this.setParamSimple(map, prefix + "ResultImageUrl", this.ResultImageUrl);
        this.setParamSimple(map, prefix + "ResultMaskUrl", this.ResultMaskUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

