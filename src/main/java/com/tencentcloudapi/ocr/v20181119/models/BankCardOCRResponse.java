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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCardOCRResponse extends AbstractModel{

    /**
    * 卡号
    */
    @SerializedName("CardNo")
    @Expose
    private String CardNo;

    /**
    * 银行信息
    */
    @SerializedName("BankInfo")
    @Expose
    private String BankInfo;

    /**
    * 有效期，格式如：07/2023
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 卡类型
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * 卡名字
    */
    @SerializedName("CardName")
    @Expose
    private String CardName;

    /**
    * 切片图片数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BorderCutImage")
    @Expose
    private String BorderCutImage;

    /**
    * 卡号图片数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CardNoImage")
    @Expose
    private String CardNoImage;

    /**
    * WarningCode 告警码列表和释义：
-9110:银行卡日期无效; 
-9111:银行卡边框不完整; 
-9112:银行卡图片反光;
-9113:银行卡复印件;
-9114:银行卡翻拍件
（告警码可以同时存在多个）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarningCode")
    @Expose
    private Long [] WarningCode;

    /**
    * 图片质量分数，请求EnableQualityValue时返回（取值范围：0-100，分数越低越模糊，建议阈值≥50）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityValue")
    @Expose
    private Long QualityValue;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卡号 
     * @return CardNo 卡号
     */
    public String getCardNo() {
        return this.CardNo;
    }

    /**
     * Set 卡号
     * @param CardNo 卡号
     */
    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    /**
     * Get 银行信息 
     * @return BankInfo 银行信息
     */
    public String getBankInfo() {
        return this.BankInfo;
    }

    /**
     * Set 银行信息
     * @param BankInfo 银行信息
     */
    public void setBankInfo(String BankInfo) {
        this.BankInfo = BankInfo;
    }

    /**
     * Get 有效期，格式如：07/2023 
     * @return ValidDate 有效期，格式如：07/2023
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期，格式如：07/2023
     * @param ValidDate 有效期，格式如：07/2023
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 卡类型 
     * @return CardType 卡类型
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set 卡类型
     * @param CardType 卡类型
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get 卡名字 
     * @return CardName 卡名字
     */
    public String getCardName() {
        return this.CardName;
    }

    /**
     * Set 卡名字
     * @param CardName 卡名字
     */
    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

    /**
     * Get 切片图片数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BorderCutImage 切片图片数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBorderCutImage() {
        return this.BorderCutImage;
    }

    /**
     * Set 切片图片数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param BorderCutImage 切片图片数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBorderCutImage(String BorderCutImage) {
        this.BorderCutImage = BorderCutImage;
    }

    /**
     * Get 卡号图片数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CardNoImage 卡号图片数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCardNoImage() {
        return this.CardNoImage;
    }

    /**
     * Set 卡号图片数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param CardNoImage 卡号图片数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCardNoImage(String CardNoImage) {
        this.CardNoImage = CardNoImage;
    }

    /**
     * Get WarningCode 告警码列表和释义：
-9110:银行卡日期无效; 
-9111:银行卡边框不完整; 
-9112:银行卡图片反光;
-9113:银行卡复印件;
-9114:银行卡翻拍件
（告警码可以同时存在多个）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarningCode WarningCode 告警码列表和释义：
-9110:银行卡日期无效; 
-9111:银行卡边框不完整; 
-9112:银行卡图片反光;
-9113:银行卡复印件;
-9114:银行卡翻拍件
（告警码可以同时存在多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWarningCode() {
        return this.WarningCode;
    }

    /**
     * Set WarningCode 告警码列表和释义：
-9110:银行卡日期无效; 
-9111:银行卡边框不完整; 
-9112:银行卡图片反光;
-9113:银行卡复印件;
-9114:银行卡翻拍件
（告警码可以同时存在多个）
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarningCode WarningCode 告警码列表和释义：
-9110:银行卡日期无效; 
-9111:银行卡边框不完整; 
-9112:银行卡图片反光;
-9113:银行卡复印件;
-9114:银行卡翻拍件
（告警码可以同时存在多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarningCode(Long [] WarningCode) {
        this.WarningCode = WarningCode;
    }

    /**
     * Get 图片质量分数，请求EnableQualityValue时返回（取值范围：0-100，分数越低越模糊，建议阈值≥50）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityValue 图片质量分数，请求EnableQualityValue时返回（取值范围：0-100，分数越低越模糊，建议阈值≥50）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityValue() {
        return this.QualityValue;
    }

    /**
     * Set 图片质量分数，请求EnableQualityValue时返回（取值范围：0-100，分数越低越模糊，建议阈值≥50）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityValue 图片质量分数，请求EnableQualityValue时返回（取值范围：0-100，分数越低越模糊，建议阈值≥50）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityValue(Long QualityValue) {
        this.QualityValue = QualityValue;
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

    public BankCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankCardOCRResponse(BankCardOCRResponse source) {
        if (source.CardNo != null) {
            this.CardNo = new String(source.CardNo);
        }
        if (source.BankInfo != null) {
            this.BankInfo = new String(source.BankInfo);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.CardName != null) {
            this.CardName = new String(source.CardName);
        }
        if (source.BorderCutImage != null) {
            this.BorderCutImage = new String(source.BorderCutImage);
        }
        if (source.CardNoImage != null) {
            this.CardNoImage = new String(source.CardNoImage);
        }
        if (source.WarningCode != null) {
            this.WarningCode = new Long[source.WarningCode.length];
            for (int i = 0; i < source.WarningCode.length; i++) {
                this.WarningCode[i] = new Long(source.WarningCode[i]);
            }
        }
        if (source.QualityValue != null) {
            this.QualityValue = new Long(source.QualityValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardNo", this.CardNo);
        this.setParamSimple(map, prefix + "BankInfo", this.BankInfo);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "CardName", this.CardName);
        this.setParamSimple(map, prefix + "BorderCutImage", this.BorderCutImage);
        this.setParamSimple(map, prefix + "CardNoImage", this.CardNoImage);
        this.setParamArraySimple(map, prefix + "WarningCode.", this.WarningCode);
        this.setParamSimple(map, prefix + "QualityValue", this.QualityValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

