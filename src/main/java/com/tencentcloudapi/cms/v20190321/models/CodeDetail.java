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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeDetail extends AbstractModel{

    /**
    * 二维码文本的编码格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrCharset")
    @Expose
    private String StrCharset;

    /**
    * 二维码在图片中的位置，由边界点的坐标表示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QrCodePosition")
    @Expose
    private CodePosition [] QrCodePosition;

    /**
    * 二维码的文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrQrCodeText")
    @Expose
    private String StrQrCodeText;

    /**
    * 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uint32QrCodeType")
    @Expose
    private Long Uint32QrCodeType;

    /**
    * 二维码文本的编码格式（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeCharset")
    @Expose
    private String CodeCharset;

    /**
    * 二维码在图片中的位置，由边界点的坐标表示（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodePosition")
    @Expose
    private CodePosition [] CodePosition;

    /**
    * 二维码的文本内容（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeText")
    @Expose
    private String CodeText;

    /**
    * 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeType")
    @Expose
    private Long CodeType;

    /**
     * Get 二维码文本的编码格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrCharset 二维码文本的编码格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrCharset() {
        return this.StrCharset;
    }

    /**
     * Set 二维码文本的编码格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrCharset 二维码文本的编码格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrCharset(String StrCharset) {
        this.StrCharset = StrCharset;
    }

    /**
     * Get 二维码在图片中的位置，由边界点的坐标表示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QrCodePosition 二维码在图片中的位置，由边界点的坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodePosition [] getQrCodePosition() {
        return this.QrCodePosition;
    }

    /**
     * Set 二维码在图片中的位置，由边界点的坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     * @param QrCodePosition 二维码在图片中的位置，由边界点的坐标表示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQrCodePosition(CodePosition [] QrCodePosition) {
        this.QrCodePosition = QrCodePosition;
    }

    /**
     * Get 二维码的文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrQrCodeText 二维码的文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrQrCodeText() {
        return this.StrQrCodeText;
    }

    /**
     * Set 二维码的文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrQrCodeText 二维码的文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrQrCodeText(String StrQrCodeText) {
        this.StrQrCodeText = StrQrCodeText;
    }

    /**
     * Get 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uint32QrCodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUint32QrCodeType() {
        return this.Uint32QrCodeType;
    }

    /**
     * Set 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uint32QrCodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUint32QrCodeType(Long Uint32QrCodeType) {
        this.Uint32QrCodeType = Uint32QrCodeType;
    }

    /**
     * Get 二维码文本的编码格式（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeCharset 二维码文本的编码格式（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeCharset() {
        return this.CodeCharset;
    }

    /**
     * Set 二维码文本的编码格式（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeCharset 二维码文本的编码格式（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeCharset(String CodeCharset) {
        this.CodeCharset = CodeCharset;
    }

    /**
     * Get 二维码在图片中的位置，由边界点的坐标表示（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodePosition 二维码在图片中的位置，由边界点的坐标表示（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodePosition [] getCodePosition() {
        return this.CodePosition;
    }

    /**
     * Set 二维码在图片中的位置，由边界点的坐标表示（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodePosition 二维码在图片中的位置，由边界点的坐标表示（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodePosition(CodePosition [] CodePosition) {
        this.CodePosition = CodePosition;
    }

    /**
     * Get 二维码的文本内容（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeText 二维码的文本内容（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeText() {
        return this.CodeText;
    }

    /**
     * Set 二维码的文本内容（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeText 二维码的文本内容（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeText(String CodeText) {
        this.CodeText = CodeText;
    }

    /**
     * Get 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeType 二维码的类型：1:ONED_BARCODE，2:QRCOD，3:WXCODE，4:PDF417，5:DATAMATRIX（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeType(Long CodeType) {
        this.CodeType = CodeType;
    }

    public CodeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeDetail(CodeDetail source) {
        if (source.StrCharset != null) {
            this.StrCharset = new String(source.StrCharset);
        }
        if (source.QrCodePosition != null) {
            this.QrCodePosition = new CodePosition[source.QrCodePosition.length];
            for (int i = 0; i < source.QrCodePosition.length; i++) {
                this.QrCodePosition[i] = new CodePosition(source.QrCodePosition[i]);
            }
        }
        if (source.StrQrCodeText != null) {
            this.StrQrCodeText = new String(source.StrQrCodeText);
        }
        if (source.Uint32QrCodeType != null) {
            this.Uint32QrCodeType = new Long(source.Uint32QrCodeType);
        }
        if (source.CodeCharset != null) {
            this.CodeCharset = new String(source.CodeCharset);
        }
        if (source.CodePosition != null) {
            this.CodePosition = new CodePosition[source.CodePosition.length];
            for (int i = 0; i < source.CodePosition.length; i++) {
                this.CodePosition[i] = new CodePosition(source.CodePosition[i]);
            }
        }
        if (source.CodeText != null) {
            this.CodeText = new String(source.CodeText);
        }
        if (source.CodeType != null) {
            this.CodeType = new Long(source.CodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrCharset", this.StrCharset);
        this.setParamArrayObj(map, prefix + "QrCodePosition.", this.QrCodePosition);
        this.setParamSimple(map, prefix + "StrQrCodeText", this.StrQrCodeText);
        this.setParamSimple(map, prefix + "Uint32QrCodeType", this.Uint32QrCodeType);
        this.setParamSimple(map, prefix + "CodeCharset", this.CodeCharset);
        this.setParamArrayObj(map, prefix + "CodePosition.", this.CodePosition);
        this.setParamSimple(map, prefix + "CodeText", this.CodeText);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);

    }
}

