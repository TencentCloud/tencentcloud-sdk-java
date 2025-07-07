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

public class QuestionInfo extends AbstractModel {

    /**
    * 旋转角度
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 预处理后图片高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 预处理后图片宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 文档元素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private ResultList [] ResultList;

    /**
    * 输入图片高度
    */
    @SerializedName("OrgHeight")
    @Expose
    private Long OrgHeight;

    /**
    * 输入图片宽度
    */
    @SerializedName("OrgWidth")
    @Expose
    private Long OrgWidth;

    /**
    * 预处理后的图片base64编码
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 旋转角度 
     * @return Angle 旋转角度
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 旋转角度
     * @param Angle 旋转角度
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 预处理后图片高度 
     * @return Height 预处理后图片高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 预处理后图片高度
     * @param Height 预处理后图片高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 预处理后图片宽度 
     * @return Width 预处理后图片宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 预处理后图片宽度
     * @param Width 预处理后图片宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 文档元素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList 文档元素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultList [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set 文档元素
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList 文档元素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(ResultList [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get 输入图片高度 
     * @return OrgHeight 输入图片高度
     */
    public Long getOrgHeight() {
        return this.OrgHeight;
    }

    /**
     * Set 输入图片高度
     * @param OrgHeight 输入图片高度
     */
    public void setOrgHeight(Long OrgHeight) {
        this.OrgHeight = OrgHeight;
    }

    /**
     * Get 输入图片宽度 
     * @return OrgWidth 输入图片宽度
     */
    public Long getOrgWidth() {
        return this.OrgWidth;
    }

    /**
     * Set 输入图片宽度
     * @param OrgWidth 输入图片宽度
     */
    public void setOrgWidth(Long OrgWidth) {
        this.OrgWidth = OrgWidth;
    }

    /**
     * Get 预处理后的图片base64编码 
     * @return ImageBase64 预处理后的图片base64编码
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 预处理后的图片base64编码
     * @param ImageBase64 预处理后的图片base64编码
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public QuestionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionInfo(QuestionInfo source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.ResultList != null) {
            this.ResultList = new ResultList[source.ResultList.length];
            for (int i = 0; i < source.ResultList.length; i++) {
                this.ResultList[i] = new ResultList(source.ResultList[i]);
            }
        }
        if (source.OrgHeight != null) {
            this.OrgHeight = new Long(source.OrgHeight);
        }
        if (source.OrgWidth != null) {
            this.OrgWidth = new Long(source.OrgWidth);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamArrayObj(map, prefix + "ResultList.", this.ResultList);
        this.setParamSimple(map, prefix + "OrgHeight", this.OrgHeight);
        this.setParamSimple(map, prefix + "OrgWidth", this.OrgWidth);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

