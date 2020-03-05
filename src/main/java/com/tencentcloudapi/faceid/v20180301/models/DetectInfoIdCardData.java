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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectInfoIdCardData extends AbstractModel{

    /**
    * OCR正面照片的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrFront")
    @Expose
    private String OcrFront;

    /**
    * OCR反面照片的base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrBack")
    @Expose
    private String OcrBack;

    /**
    * 旋转裁边后的正面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessedFrontImage")
    @Expose
    private String ProcessedFrontImage;

    /**
    * 旋转裁边后的背面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessedBackImage")
    @Expose
    private String ProcessedBackImage;

    /**
    * 身份证正面人像图base64编码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get OCR正面照片的base64编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrFront OCR正面照片的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrFront() {
        return this.OcrFront;
    }

    /**
     * Set OCR正面照片的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrFront OCR正面照片的base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrFront(String OcrFront) {
        this.OcrFront = OcrFront;
    }

    /**
     * Get OCR反面照片的base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrBack OCR反面照片的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrBack() {
        return this.OcrBack;
    }

    /**
     * Set OCR反面照片的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrBack OCR反面照片的base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrBack(String OcrBack) {
        this.OcrBack = OcrBack;
    }

    /**
     * Get 旋转裁边后的正面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessedFrontImage 旋转裁边后的正面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessedFrontImage() {
        return this.ProcessedFrontImage;
    }

    /**
     * Set 旋转裁边后的正面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessedFrontImage 旋转裁边后的正面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessedFrontImage(String ProcessedFrontImage) {
        this.ProcessedFrontImage = ProcessedFrontImage;
    }

    /**
     * Get 旋转裁边后的背面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessedBackImage 旋转裁边后的背面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessedBackImage() {
        return this.ProcessedBackImage;
    }

    /**
     * Set 旋转裁边后的背面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessedBackImage 旋转裁边后的背面照片base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessedBackImage(String ProcessedBackImage) {
        this.ProcessedBackImage = ProcessedBackImage;
    }

    /**
     * Get 身份证正面人像图base64编码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Avatar 身份证正面人像图base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 身份证正面人像图base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Avatar 身份证正面人像图base64编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OcrFront", this.OcrFront);
        this.setParamSimple(map, prefix + "OcrBack", this.OcrBack);
        this.setParamSimple(map, prefix + "ProcessedFrontImage", this.ProcessedFrontImage);
        this.setParamSimple(map, prefix + "ProcessedBackImage", this.ProcessedBackImage);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

