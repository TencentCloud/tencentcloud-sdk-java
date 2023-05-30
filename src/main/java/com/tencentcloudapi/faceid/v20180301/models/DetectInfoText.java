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

public class DetectInfoText extends AbstractModel{

    /**
    * 本次流程最终验证结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 本次流程最终验证结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 本次验证使用的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 用户认证时使用的证件号码类型：
0：二代身份证的证件号码
1：港澳台居住证的证件号码
2：其他（核验使用的证件号码非合法身份号码）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseIDType")
    @Expose
    private Long UseIDType;

    /**
    * 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份校验环节识别结果：民族。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrNation")
    @Expose
    private String OcrNation;

    /**
    * 身份校验环节识别结果：家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAddress")
    @Expose
    private String OcrAddress;

    /**
    * 身份校验环节识别结果：生日。格式为：YYYY/M/D
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrBirth")
    @Expose
    private String OcrBirth;

    /**
    * 身份校验环节识别结果：签发机关。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAuthority")
    @Expose
    private String OcrAuthority;

    /**
    * 身份校验环节识别结果：有效日期。格式为：YYYY.MM.DD-YYYY.MM.DD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrValidDate")
    @Expose
    private String OcrValidDate;

    /**
    * 身份校验环节识别结果：姓名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrName")
    @Expose
    private String OcrName;

    /**
    * 身份校验环节识别结果：身份证号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrIdCard")
    @Expose
    private String OcrIdCard;

    /**
    * 身份校验环节识别结果：性别。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrGender")
    @Expose
    private String OcrGender;

    /**
    * 身份校验环节采用的信息上传方式。
取值有"NFC"、"OCR"、"手动输入"、"其他"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdInfoFrom")
    @Expose
    private String IdInfoFrom;

    /**
    * 本次流程最终活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveStatus")
    @Expose
    private Long LiveStatus;

    /**
    * 本次流程最终活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveMsg")
    @Expose
    private String LiveMsg;

    /**
    * 本次流程最终一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparestatus")
    @Expose
    private Long Comparestatus;

    /**
    * 本次流程最终一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparemsg")
    @Expose
    private String Comparemsg;

    /**
    * 本次流程活体一比一的分数，取值范围 [0.00, 100.00]。相似度大于等于70时才判断为同一人，也可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sim")
    @Expose
    private String Sim;

    /**
    * 地理位置经纬度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Auth接口带入额外信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 本次流程进行的活体一比一流水。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessDetail")
    @Expose
    private DetectDetail [] LivenessDetail;

    /**
    * 手机号码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 本次流程最终比对库源类型。包括：
权威库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareLibType")
    @Expose
    private String CompareLibType;

    /**
    * 本次流程最终活体类型。包括：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessMode")
    @Expose
    private Long LivenessMode;

    /**
    * nfc重复计费requestId列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFCRequestIds")
    @Expose
    private String [] NFCRequestIds;

    /**
    * nfc重复计费计数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFCBillingCounts")
    @Expose
    private Long NFCBillingCounts;

    /**
    * 港澳台居住证通行证号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassNo")
    @Expose
    private String PassNo;

    /**
    * 港澳台居住证签发次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisaNum")
    @Expose
    private String VisaNum;

    /**
     * Get 本次流程最终验证结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 本次流程最终验证结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 本次流程最终验证结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 本次流程最终验证结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 本次流程最终验证结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 本次流程最终验证结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 本次流程最终验证结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 本次流程最终验证结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 本次验证使用的身份证号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCard 本次验证使用的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 本次验证使用的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCard 本次验证使用的身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 用户认证时使用的证件号码类型：
0：二代身份证的证件号码
1：港澳台居住证的证件号码
2：其他（核验使用的证件号码非合法身份号码）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseIDType 用户认证时使用的证件号码类型：
0：二代身份证的证件号码
1：港澳台居住证的证件号码
2：其他（核验使用的证件号码非合法身份号码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseIDType() {
        return this.UseIDType;
    }

    /**
     * Set 用户认证时使用的证件号码类型：
0：二代身份证的证件号码
1：港澳台居住证的证件号码
2：其他（核验使用的证件号码非合法身份号码）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseIDType 用户认证时使用的证件号码类型：
0：二代身份证的证件号码
1：港澳台居住证的证件号码
2：其他（核验使用的证件号码非合法身份号码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseIDType(Long UseIDType) {
        this.UseIDType = UseIDType;
    }

    /**
     * Get 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份校验环节识别结果：民族。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrNation 身份校验环节识别结果：民族。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrNation() {
        return this.OcrNation;
    }

    /**
     * Set 身份校验环节识别结果：民族。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrNation 身份校验环节识别结果：民族。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrNation(String OcrNation) {
        this.OcrNation = OcrNation;
    }

    /**
     * Get 身份校验环节识别结果：家庭住址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAddress 身份校验环节识别结果：家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAddress() {
        return this.OcrAddress;
    }

    /**
     * Set 身份校验环节识别结果：家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAddress 身份校验环节识别结果：家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAddress(String OcrAddress) {
        this.OcrAddress = OcrAddress;
    }

    /**
     * Get 身份校验环节识别结果：生日。格式为：YYYY/M/D
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrBirth 身份校验环节识别结果：生日。格式为：YYYY/M/D
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrBirth() {
        return this.OcrBirth;
    }

    /**
     * Set 身份校验环节识别结果：生日。格式为：YYYY/M/D
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrBirth 身份校验环节识别结果：生日。格式为：YYYY/M/D
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrBirth(String OcrBirth) {
        this.OcrBirth = OcrBirth;
    }

    /**
     * Get 身份校验环节识别结果：签发机关。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAuthority 身份校验环节识别结果：签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAuthority() {
        return this.OcrAuthority;
    }

    /**
     * Set 身份校验环节识别结果：签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAuthority 身份校验环节识别结果：签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAuthority(String OcrAuthority) {
        this.OcrAuthority = OcrAuthority;
    }

    /**
     * Get 身份校验环节识别结果：有效日期。格式为：YYYY.MM.DD-YYYY.MM.DD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrValidDate 身份校验环节识别结果：有效日期。格式为：YYYY.MM.DD-YYYY.MM.DD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrValidDate() {
        return this.OcrValidDate;
    }

    /**
     * Set 身份校验环节识别结果：有效日期。格式为：YYYY.MM.DD-YYYY.MM.DD
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrValidDate 身份校验环节识别结果：有效日期。格式为：YYYY.MM.DD-YYYY.MM.DD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrValidDate(String OcrValidDate) {
        this.OcrValidDate = OcrValidDate;
    }

    /**
     * Get 身份校验环节识别结果：姓名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrName 身份校验环节识别结果：姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrName() {
        return this.OcrName;
    }

    /**
     * Set 身份校验环节识别结果：姓名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrName 身份校验环节识别结果：姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrName(String OcrName) {
        this.OcrName = OcrName;
    }

    /**
     * Get 身份校验环节识别结果：身份证号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrIdCard 身份校验环节识别结果：身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrIdCard() {
        return this.OcrIdCard;
    }

    /**
     * Set 身份校验环节识别结果：身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrIdCard 身份校验环节识别结果：身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrIdCard(String OcrIdCard) {
        this.OcrIdCard = OcrIdCard;
    }

    /**
     * Get 身份校验环节识别结果：性别。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrGender 身份校验环节识别结果：性别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrGender() {
        return this.OcrGender;
    }

    /**
     * Set 身份校验环节识别结果：性别。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrGender 身份校验环节识别结果：性别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrGender(String OcrGender) {
        this.OcrGender = OcrGender;
    }

    /**
     * Get 身份校验环节采用的信息上传方式。
取值有"NFC"、"OCR"、"手动输入"、"其他"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdInfoFrom 身份校验环节采用的信息上传方式。
取值有"NFC"、"OCR"、"手动输入"、"其他"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdInfoFrom() {
        return this.IdInfoFrom;
    }

    /**
     * Set 身份校验环节采用的信息上传方式。
取值有"NFC"、"OCR"、"手动输入"、"其他"
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdInfoFrom 身份校验环节采用的信息上传方式。
取值有"NFC"、"OCR"、"手动输入"、"其他"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdInfoFrom(String IdInfoFrom) {
        this.IdInfoFrom = IdInfoFrom;
    }

    /**
     * Get 本次流程最终活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveStatus 本次流程最终活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveStatus() {
        return this.LiveStatus;
    }

    /**
     * Set 本次流程最终活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveStatus 本次流程最终活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveStatus(Long LiveStatus) {
        this.LiveStatus = LiveStatus;
    }

    /**
     * Get 本次流程最终活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveMsg 本次流程最终活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveMsg() {
        return this.LiveMsg;
    }

    /**
     * Set 本次流程最终活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveMsg 本次流程最终活体结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveMsg(String LiveMsg) {
        this.LiveMsg = LiveMsg;
    }

    /**
     * Get 本次流程最终一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparestatus 本次流程最终一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComparestatus() {
        return this.Comparestatus;
    }

    /**
     * Set 本次流程最终一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparestatus 本次流程最终一比一结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparestatus(Long Comparestatus) {
        this.Comparestatus = Comparestatus;
    }

    /**
     * Get 本次流程最终一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparemsg 本次流程最终一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparemsg() {
        return this.Comparemsg;
    }

    /**
     * Set 本次流程最终一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparemsg 本次流程最终一比一结果描述。（仅描述用，文案更新时不会通知。）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparemsg(String Comparemsg) {
        this.Comparemsg = Comparemsg;
    }

    /**
     * Get 本次流程活体一比一的分数，取值范围 [0.00, 100.00]。相似度大于等于70时才判断为同一人，也可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim 本次流程活体一比一的分数，取值范围 [0.00, 100.00]。相似度大于等于70时才判断为同一人，也可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set 本次流程活体一比一的分数，取值范围 [0.00, 100.00]。相似度大于等于70时才判断为同一人，也可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim 本次流程活体一比一的分数，取值范围 [0.00, 100.00]。相似度大于等于70时才判断为同一人，也可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSim(String Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 地理位置经纬度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 地理位置经纬度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 地理位置经纬度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 地理位置经纬度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Auth接口带入额外信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra Auth接口带入额外信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set Auth接口带入额外信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra Auth接口带入额外信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 本次流程进行的活体一比一流水。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessDetail 本次流程进行的活体一比一流水。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectDetail [] getLivenessDetail() {
        return this.LivenessDetail;
    }

    /**
     * Set 本次流程进行的活体一比一流水。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessDetail 本次流程进行的活体一比一流水。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessDetail(DetectDetail [] LivenessDetail) {
        this.LivenessDetail = LivenessDetail;
    }

    /**
     * Get 手机号码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mobile 手机号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mobile 手机号码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 本次流程最终比对库源类型。包括：
权威库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareLibType 本次流程最终比对库源类型。包括：
权威库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareLibType() {
        return this.CompareLibType;
    }

    /**
     * Set 本次流程最终比对库源类型。包括：
权威库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareLibType 本次流程最终比对库源类型。包括：
权威库；
业务方自有库（用户上传照片、客户的混合库、混合部署库）；
二次验证库；
人工审核库；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareLibType(String CompareLibType) {
        this.CompareLibType = CompareLibType;
    }

    /**
     * Get 本次流程最终活体类型。包括：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessMode 本次流程最终活体类型。包括：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivenessMode() {
        return this.LivenessMode;
    }

    /**
     * Set 本次流程最终活体类型。包括：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessMode 本次流程最终活体类型。包括：
0：未知
1：数字活体
2：动作活体
3：静默活体
4：一闪活体（动作+光线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessMode(Long LivenessMode) {
        this.LivenessMode = LivenessMode;
    }

    /**
     * Get nfc重复计费requestId列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFCRequestIds nfc重复计费requestId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNFCRequestIds() {
        return this.NFCRequestIds;
    }

    /**
     * Set nfc重复计费requestId列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFCRequestIds nfc重复计费requestId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFCRequestIds(String [] NFCRequestIds) {
        this.NFCRequestIds = NFCRequestIds;
    }

    /**
     * Get nfc重复计费计数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFCBillingCounts nfc重复计费计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNFCBillingCounts() {
        return this.NFCBillingCounts;
    }

    /**
     * Set nfc重复计费计数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFCBillingCounts nfc重复计费计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFCBillingCounts(Long NFCBillingCounts) {
        this.NFCBillingCounts = NFCBillingCounts;
    }

    /**
     * Get 港澳台居住证通行证号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassNo 港澳台居住证通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassNo() {
        return this.PassNo;
    }

    /**
     * Set 港澳台居住证通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassNo 港澳台居住证通行证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassNo(String PassNo) {
        this.PassNo = PassNo;
    }

    /**
     * Get 港澳台居住证签发次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisaNum 港澳台居住证签发次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVisaNum() {
        return this.VisaNum;
    }

    /**
     * Set 港澳台居住证签发次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisaNum 港澳台居住证签发次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisaNum(String VisaNum) {
        this.VisaNum = VisaNum;
    }

    public DetectInfoText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectInfoText(DetectInfoText source) {
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.UseIDType != null) {
            this.UseIDType = new Long(source.UseIDType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OcrNation != null) {
            this.OcrNation = new String(source.OcrNation);
        }
        if (source.OcrAddress != null) {
            this.OcrAddress = new String(source.OcrAddress);
        }
        if (source.OcrBirth != null) {
            this.OcrBirth = new String(source.OcrBirth);
        }
        if (source.OcrAuthority != null) {
            this.OcrAuthority = new String(source.OcrAuthority);
        }
        if (source.OcrValidDate != null) {
            this.OcrValidDate = new String(source.OcrValidDate);
        }
        if (source.OcrName != null) {
            this.OcrName = new String(source.OcrName);
        }
        if (source.OcrIdCard != null) {
            this.OcrIdCard = new String(source.OcrIdCard);
        }
        if (source.OcrGender != null) {
            this.OcrGender = new String(source.OcrGender);
        }
        if (source.IdInfoFrom != null) {
            this.IdInfoFrom = new String(source.IdInfoFrom);
        }
        if (source.LiveStatus != null) {
            this.LiveStatus = new Long(source.LiveStatus);
        }
        if (source.LiveMsg != null) {
            this.LiveMsg = new String(source.LiveMsg);
        }
        if (source.Comparestatus != null) {
            this.Comparestatus = new Long(source.Comparestatus);
        }
        if (source.Comparemsg != null) {
            this.Comparemsg = new String(source.Comparemsg);
        }
        if (source.Sim != null) {
            this.Sim = new String(source.Sim);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.LivenessDetail != null) {
            this.LivenessDetail = new DetectDetail[source.LivenessDetail.length];
            for (int i = 0; i < source.LivenessDetail.length; i++) {
                this.LivenessDetail[i] = new DetectDetail(source.LivenessDetail[i]);
            }
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.CompareLibType != null) {
            this.CompareLibType = new String(source.CompareLibType);
        }
        if (source.LivenessMode != null) {
            this.LivenessMode = new Long(source.LivenessMode);
        }
        if (source.NFCRequestIds != null) {
            this.NFCRequestIds = new String[source.NFCRequestIds.length];
            for (int i = 0; i < source.NFCRequestIds.length; i++) {
                this.NFCRequestIds[i] = new String(source.NFCRequestIds[i]);
            }
        }
        if (source.NFCBillingCounts != null) {
            this.NFCBillingCounts = new Long(source.NFCBillingCounts);
        }
        if (source.PassNo != null) {
            this.PassNo = new String(source.PassNo);
        }
        if (source.VisaNum != null) {
            this.VisaNum = new String(source.VisaNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "UseIDType", this.UseIDType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OcrNation", this.OcrNation);
        this.setParamSimple(map, prefix + "OcrAddress", this.OcrAddress);
        this.setParamSimple(map, prefix + "OcrBirth", this.OcrBirth);
        this.setParamSimple(map, prefix + "OcrAuthority", this.OcrAuthority);
        this.setParamSimple(map, prefix + "OcrValidDate", this.OcrValidDate);
        this.setParamSimple(map, prefix + "OcrName", this.OcrName);
        this.setParamSimple(map, prefix + "OcrIdCard", this.OcrIdCard);
        this.setParamSimple(map, prefix + "OcrGender", this.OcrGender);
        this.setParamSimple(map, prefix + "IdInfoFrom", this.IdInfoFrom);
        this.setParamSimple(map, prefix + "LiveStatus", this.LiveStatus);
        this.setParamSimple(map, prefix + "LiveMsg", this.LiveMsg);
        this.setParamSimple(map, prefix + "Comparestatus", this.Comparestatus);
        this.setParamSimple(map, prefix + "Comparemsg", this.Comparemsg);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArrayObj(map, prefix + "LivenessDetail.", this.LivenessDetail);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "CompareLibType", this.CompareLibType);
        this.setParamSimple(map, prefix + "LivenessMode", this.LivenessMode);
        this.setParamArraySimple(map, prefix + "NFCRequestIds.", this.NFCRequestIds);
        this.setParamSimple(map, prefix + "NFCBillingCounts", this.NFCBillingCounts);
        this.setParamSimple(map, prefix + "PassNo", this.PassNo);
        this.setParamSimple(map, prefix + "VisaNum", this.VisaNum);

    }
}

