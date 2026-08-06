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
    * <p>旋转角度</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>预处理后图片高度</p><p>单位：px</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>预处理后图片宽度</p><p>单位：px</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>文档元素</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultList")
    @Expose
    private ResultList [] ResultList;

    /**
    * <p>输入图片高度</p><p>单位：px</p>
    */
    @SerializedName("OrgHeight")
    @Expose
    private Long OrgHeight;

    /**
    * <p>输入图片宽度</p><p>单位：px</p>
    */
    @SerializedName("OrgWidth")
    @Expose
    private Long OrgWidth;

    /**
    * <p>预处理后的图片base64编码</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get <p>旋转角度</p> 
     * @return Angle <p>旋转角度</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>旋转角度</p>
     * @param Angle <p>旋转角度</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>预处理后图片高度</p><p>单位：px</p> 
     * @return Height <p>预处理后图片高度</p><p>单位：px</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>预处理后图片高度</p><p>单位：px</p>
     * @param Height <p>预处理后图片高度</p><p>单位：px</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>预处理后图片宽度</p><p>单位：px</p> 
     * @return Width <p>预处理后图片宽度</p><p>单位：px</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>预处理后图片宽度</p><p>单位：px</p>
     * @param Width <p>预处理后图片宽度</p><p>单位：px</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>文档元素</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultList <p>文档元素</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultList [] getResultList() {
        return this.ResultList;
    }

    /**
     * Set <p>文档元素</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultList <p>文档元素</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultList(ResultList [] ResultList) {
        this.ResultList = ResultList;
    }

    /**
     * Get <p>输入图片高度</p><p>单位：px</p> 
     * @return OrgHeight <p>输入图片高度</p><p>单位：px</p>
     */
    public Long getOrgHeight() {
        return this.OrgHeight;
    }

    /**
     * Set <p>输入图片高度</p><p>单位：px</p>
     * @param OrgHeight <p>输入图片高度</p><p>单位：px</p>
     */
    public void setOrgHeight(Long OrgHeight) {
        this.OrgHeight = OrgHeight;
    }

    /**
     * Get <p>输入图片宽度</p><p>单位：px</p> 
     * @return OrgWidth <p>输入图片宽度</p><p>单位：px</p>
     */
    public Long getOrgWidth() {
        return this.OrgWidth;
    }

    /**
     * Set <p>输入图片宽度</p><p>单位：px</p>
     * @param OrgWidth <p>输入图片宽度</p><p>单位：px</p>
     */
    public void setOrgWidth(Long OrgWidth) {
        this.OrgWidth = OrgWidth;
    }

    /**
     * Get <p>预处理后的图片base64编码</p> 
     * @return ImageBase64 <p>预处理后的图片base64编码</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>预处理后的图片base64编码</p>
     * @param ImageBase64 <p>预处理后的图片base64编码</p>
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

