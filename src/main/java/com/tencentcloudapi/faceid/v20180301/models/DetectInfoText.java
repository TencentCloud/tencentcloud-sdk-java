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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectInfoText extends AbstractModel {

    /**
    * <p>本次流程最终验证结果。</p><ul><li>取值范围：0为成功。</li><li>仅包含活体人脸核身结果，不包含意愿核身结果。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>本次流程最终验证结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>本次验证使用的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>用户认证时使用的证件号码类型。</p><ul><li>取值范围：<br>  0：二代身份证的证件号码。<br>  1：港澳台居住证的证件号码。<br>  2：其他（核验使用的证件号码非合法身份号码）。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseIDType")
    @Expose
    private Long UseIDType;

    /**
    * <p>本次验证使用的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>身份校验环节识别结果：民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrNation")
    @Expose
    private String OcrNation;

    /**
    * <p>身份校验环节识别结果：家庭住址。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAddress")
    @Expose
    private String OcrAddress;

    /**
    * <p>身份校验环节识别结果：生日。</p><ul><li>格式为：YYYY/M/D</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrBirth")
    @Expose
    private String OcrBirth;

    /**
    * <p>身份校验环节识别结果：签发机关。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAuthority")
    @Expose
    private String OcrAuthority;

    /**
    * <p>身份校验环节识别结果：有效日期。</p><ul><li>格式为：YYYY.MM.DD-YYYY.MM.DD。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrValidDate")
    @Expose
    private String OcrValidDate;

    /**
    * <p>身份校验环节识别结果：姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrName")
    @Expose
    private String OcrName;

    /**
    * <p>身份校验环节识别结果：身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrIdCard")
    @Expose
    private String OcrIdCard;

    /**
    * <p>身份校验环节识别结果：性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrGender")
    @Expose
    private String OcrGender;

    /**
    * <p>身份校验环节采用的信息上传方式。</p><ul><li>取值有&quot;NFC&quot;、&quot;OCR&quot;、&quot;手动输入&quot;、&quot;其他&quot;</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdInfoFrom")
    @Expose
    private String IdInfoFrom;

    /**
    * <p>本次流程最终活体结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveStatus")
    @Expose
    private Long LiveStatus;

    /**
    * <p>本次流程最终活体结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveMsg")
    @Expose
    private String LiveMsg;

    /**
    * <p>本次流程最终一比一结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparestatus")
    @Expose
    private Long Comparestatus;

    /**
    * <p>本次流程最终一比一结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comparemsg")
    @Expose
    private String Comparemsg;

    /**
    * <p>本次流程活体一比一的分数。- 取值范围 [0.00, 100.00]。- 相似度大于等于70时才判断为同一人，阈值不支持自定义。- 阈值70的误通过率为万分之一。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sim")
    @Expose
    private String Sim;

    /**
    * <p>地理位置经纬度。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>Auth接口带入额外信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>本次流程进行的活体一比一流水。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessDetail")
    @Expose
    private DetectDetail [] LivenessDetail;

    /**
    * <p>描述当前请求活体阶段被拒绝的详细原因，该参数仅限PLUS版本核身服务返回。</p><ul><li>详情如下：<br>  01-用户全程闭眼<br>  02-用户未完成指定动作<br>  03-疑似翻拍攻击<br>  04-疑似合成攻击<br>  05-疑似黑产模版<br>  06-疑似存在水印<br>  07-反光校验未通过<br>  08-疑似中途换人<br>  09-人脸质量过差<br>  10-距离校验不通过<br>  11-疑似对抗样本攻击<br>  12-嘴巴区域疑似存在攻击痕迹<br>  13-眼睛区域疑似存在攻击痕迹<br>  14-眼睛或嘴巴被遮挡</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessInfoTag")
    @Expose
    private String [] LivenessInfoTag;

    /**
    * <p>手机号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>本次流程最终比对库源类型。</p><ul><li>取值范围：<br>  权威库。<br>  业务方自有库（用户上传照片、客户的混合库、混合部署库）。<br>  二次验证库。<br>  人工审核库。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareLibType")
    @Expose
    private String CompareLibType;

    /**
    * <p>本次流程最终活体类型。</p><ul><li>取值范围：<br>  0：未知<br>  1：数字活体<br>  2：动作活体<br>  3：静默活体<br>  4：一闪活体（动作+光线）<br>  5：远近活体</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessMode")
    @Expose
    private Long LivenessMode;

    /**
    * <p>nfc重复计费requestId列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFCRequestIds")
    @Expose
    private String [] NFCRequestIds;

    /**
    * <p>nfc重复计费计数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFCBillingCounts")
    @Expose
    private Long NFCBillingCounts;

    /**
    * <p>港澳台居住证通行证号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassNo")
    @Expose
    private String PassNo;

    /**
    * <p>港澳台居住证签发次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisaNum")
    @Expose
    private String VisaNum;

    /**
    * <p>活体检测的动作顺序，多动作以“,”分隔。<br>输出格式如：“1,2”表示“张嘴+眨眼”。</p><ul><li>详细序列值含义如下：<br> 1：张嘴<br>2：眨眼<br>3：点头<br>4：摇头<br>5：静默<br>注：仅浮层H5产品返回</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessActionSequence")
    @Expose
    private String LivenessActionSequence;

    /**
     * Get <p>本次流程最终验证结果。</p><ul><li>取值范围：0为成功。</li><li>仅包含活体人脸核身结果，不包含意愿核身结果。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode <p>本次流程最终验证结果。</p><ul><li>取值范围：0为成功。</li><li>仅包含活体人脸核身结果，不包含意愿核身结果。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>本次流程最终验证结果。</p><ul><li>取值范围：0为成功。</li><li>仅包含活体人脸核身结果，不包含意愿核身结果。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode <p>本次流程最终验证结果。</p><ul><li>取值范围：0为成功。</li><li>仅包含活体人脸核身结果，不包含意愿核身结果。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>本次流程最终验证结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg <p>本次流程最终验证结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>本次流程最终验证结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg <p>本次流程最终验证结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>本次验证使用的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCard <p>本次验证使用的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>本次验证使用的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCard <p>本次验证使用的身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>用户认证时使用的证件号码类型。</p><ul><li>取值范围：<br>  0：二代身份证的证件号码。<br>  1：港澳台居住证的证件号码。<br>  2：其他（核验使用的证件号码非合法身份号码）。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseIDType <p>用户认证时使用的证件号码类型。</p><ul><li>取值范围：<br>  0：二代身份证的证件号码。<br>  1：港澳台居住证的证件号码。<br>  2：其他（核验使用的证件号码非合法身份号码）。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseIDType() {
        return this.UseIDType;
    }

    /**
     * Set <p>用户认证时使用的证件号码类型。</p><ul><li>取值范围：<br>  0：二代身份证的证件号码。<br>  1：港澳台居住证的证件号码。<br>  2：其他（核验使用的证件号码非合法身份号码）。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseIDType <p>用户认证时使用的证件号码类型。</p><ul><li>取值范围：<br>  0：二代身份证的证件号码。<br>  1：港澳台居住证的证件号码。<br>  2：其他（核验使用的证件号码非合法身份号码）。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseIDType(Long UseIDType) {
        this.UseIDType = UseIDType;
    }

    /**
     * Get <p>本次验证使用的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>本次验证使用的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>本次验证使用的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>本次验证使用的姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>身份校验环节识别结果：民族。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrNation <p>身份校验环节识别结果：民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrNation() {
        return this.OcrNation;
    }

    /**
     * Set <p>身份校验环节识别结果：民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrNation <p>身份校验环节识别结果：民族。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrNation(String OcrNation) {
        this.OcrNation = OcrNation;
    }

    /**
     * Get <p>身份校验环节识别结果：家庭住址。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAddress <p>身份校验环节识别结果：家庭住址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAddress() {
        return this.OcrAddress;
    }

    /**
     * Set <p>身份校验环节识别结果：家庭住址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAddress <p>身份校验环节识别结果：家庭住址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAddress(String OcrAddress) {
        this.OcrAddress = OcrAddress;
    }

    /**
     * Get <p>身份校验环节识别结果：生日。</p><ul><li>格式为：YYYY/M/D</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrBirth <p>身份校验环节识别结果：生日。</p><ul><li>格式为：YYYY/M/D</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrBirth() {
        return this.OcrBirth;
    }

    /**
     * Set <p>身份校验环节识别结果：生日。</p><ul><li>格式为：YYYY/M/D</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrBirth <p>身份校验环节识别结果：生日。</p><ul><li>格式为：YYYY/M/D</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrBirth(String OcrBirth) {
        this.OcrBirth = OcrBirth;
    }

    /**
     * Get <p>身份校验环节识别结果：签发机关。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAuthority <p>身份校验环节识别结果：签发机关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAuthority() {
        return this.OcrAuthority;
    }

    /**
     * Set <p>身份校验环节识别结果：签发机关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAuthority <p>身份校验环节识别结果：签发机关。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAuthority(String OcrAuthority) {
        this.OcrAuthority = OcrAuthority;
    }

    /**
     * Get <p>身份校验环节识别结果：有效日期。</p><ul><li>格式为：YYYY.MM.DD-YYYY.MM.DD。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrValidDate <p>身份校验环节识别结果：有效日期。</p><ul><li>格式为：YYYY.MM.DD-YYYY.MM.DD。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrValidDate() {
        return this.OcrValidDate;
    }

    /**
     * Set <p>身份校验环节识别结果：有效日期。</p><ul><li>格式为：YYYY.MM.DD-YYYY.MM.DD。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrValidDate <p>身份校验环节识别结果：有效日期。</p><ul><li>格式为：YYYY.MM.DD-YYYY.MM.DD。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrValidDate(String OcrValidDate) {
        this.OcrValidDate = OcrValidDate;
    }

    /**
     * Get <p>身份校验环节识别结果：姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrName <p>身份校验环节识别结果：姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrName() {
        return this.OcrName;
    }

    /**
     * Set <p>身份校验环节识别结果：姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrName <p>身份校验环节识别结果：姓名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrName(String OcrName) {
        this.OcrName = OcrName;
    }

    /**
     * Get <p>身份校验环节识别结果：身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrIdCard <p>身份校验环节识别结果：身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrIdCard() {
        return this.OcrIdCard;
    }

    /**
     * Set <p>身份校验环节识别结果：身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrIdCard <p>身份校验环节识别结果：身份证号。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrIdCard(String OcrIdCard) {
        this.OcrIdCard = OcrIdCard;
    }

    /**
     * Get <p>身份校验环节识别结果：性别。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrGender <p>身份校验环节识别结果：性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrGender() {
        return this.OcrGender;
    }

    /**
     * Set <p>身份校验环节识别结果：性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrGender <p>身份校验环节识别结果：性别。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrGender(String OcrGender) {
        this.OcrGender = OcrGender;
    }

    /**
     * Get <p>身份校验环节采用的信息上传方式。</p><ul><li>取值有&quot;NFC&quot;、&quot;OCR&quot;、&quot;手动输入&quot;、&quot;其他&quot;</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdInfoFrom <p>身份校验环节采用的信息上传方式。</p><ul><li>取值有&quot;NFC&quot;、&quot;OCR&quot;、&quot;手动输入&quot;、&quot;其他&quot;</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdInfoFrom() {
        return this.IdInfoFrom;
    }

    /**
     * Set <p>身份校验环节采用的信息上传方式。</p><ul><li>取值有&quot;NFC&quot;、&quot;OCR&quot;、&quot;手动输入&quot;、&quot;其他&quot;</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdInfoFrom <p>身份校验环节采用的信息上传方式。</p><ul><li>取值有&quot;NFC&quot;、&quot;OCR&quot;、&quot;手动输入&quot;、&quot;其他&quot;</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdInfoFrom(String IdInfoFrom) {
        this.IdInfoFrom = IdInfoFrom;
    }

    /**
     * Get <p>本次流程最终活体结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveStatus <p>本次流程最终活体结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveStatus() {
        return this.LiveStatus;
    }

    /**
     * Set <p>本次流程最终活体结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveStatus <p>本次流程最终活体结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveStatus(Long LiveStatus) {
        this.LiveStatus = LiveStatus;
    }

    /**
     * Get <p>本次流程最终活体结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveMsg <p>本次流程最终活体结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveMsg() {
        return this.LiveMsg;
    }

    /**
     * Set <p>本次流程最终活体结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveMsg <p>本次流程最终活体结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveMsg(String LiveMsg) {
        this.LiveMsg = LiveMsg;
    }

    /**
     * Get <p>本次流程最终一比一结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparestatus <p>本次流程最终一比一结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComparestatus() {
        return this.Comparestatus;
    }

    /**
     * Set <p>本次流程最终一比一结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparestatus <p>本次流程最终一比一结果。</p><ul><li>0为成功</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparestatus(Long Comparestatus) {
        this.Comparestatus = Comparestatus;
    }

    /**
     * Get <p>本次流程最终一比一结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comparemsg <p>本次流程最终一比一结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparemsg() {
        return this.Comparemsg;
    }

    /**
     * Set <p>本次流程最终一比一结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comparemsg <p>本次流程最终一比一结果描述。</p><ul><li>仅描述用，文案更新时不会通知。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparemsg(String Comparemsg) {
        this.Comparemsg = Comparemsg;
    }

    /**
     * Get <p>本次流程活体一比一的分数。- 取值范围 [0.00, 100.00]。- 相似度大于等于70时才判断为同一人，阈值不支持自定义。- 阈值70的误通过率为万分之一。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim <p>本次流程活体一比一的分数。- 取值范围 [0.00, 100.00]。- 相似度大于等于70时才判断为同一人，阈值不支持自定义。- 阈值70的误通过率为万分之一。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set <p>本次流程活体一比一的分数。- 取值范围 [0.00, 100.00]。- 相似度大于等于70时才判断为同一人，阈值不支持自定义。- 阈值70的误通过率为万分之一。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim <p>本次流程活体一比一的分数。- 取值范围 [0.00, 100.00]。- 相似度大于等于70时才判断为同一人，阈值不支持自定义。- 阈值70的误通过率为万分之一。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSim(String Sim) {
        this.Sim = Sim;
    }

    /**
     * Get <p>地理位置经纬度。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location <p>地理位置经纬度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>地理位置经纬度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location <p>地理位置经纬度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>Auth接口带入额外信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra <p>Auth接口带入额外信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>Auth接口带入额外信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra <p>Auth接口带入额外信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>本次流程进行的活体一比一流水。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessDetail <p>本次流程进行的活体一比一流水。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectDetail [] getLivenessDetail() {
        return this.LivenessDetail;
    }

    /**
     * Set <p>本次流程进行的活体一比一流水。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessDetail <p>本次流程进行的活体一比一流水。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessDetail(DetectDetail [] LivenessDetail) {
        this.LivenessDetail = LivenessDetail;
    }

    /**
     * Get <p>描述当前请求活体阶段被拒绝的详细原因，该参数仅限PLUS版本核身服务返回。</p><ul><li>详情如下：<br>  01-用户全程闭眼<br>  02-用户未完成指定动作<br>  03-疑似翻拍攻击<br>  04-疑似合成攻击<br>  05-疑似黑产模版<br>  06-疑似存在水印<br>  07-反光校验未通过<br>  08-疑似中途换人<br>  09-人脸质量过差<br>  10-距离校验不通过<br>  11-疑似对抗样本攻击<br>  12-嘴巴区域疑似存在攻击痕迹<br>  13-眼睛区域疑似存在攻击痕迹<br>  14-眼睛或嘴巴被遮挡</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessInfoTag <p>描述当前请求活体阶段被拒绝的详细原因，该参数仅限PLUS版本核身服务返回。</p><ul><li>详情如下：<br>  01-用户全程闭眼<br>  02-用户未完成指定动作<br>  03-疑似翻拍攻击<br>  04-疑似合成攻击<br>  05-疑似黑产模版<br>  06-疑似存在水印<br>  07-反光校验未通过<br>  08-疑似中途换人<br>  09-人脸质量过差<br>  10-距离校验不通过<br>  11-疑似对抗样本攻击<br>  12-嘴巴区域疑似存在攻击痕迹<br>  13-眼睛区域疑似存在攻击痕迹<br>  14-眼睛或嘴巴被遮挡</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLivenessInfoTag() {
        return this.LivenessInfoTag;
    }

    /**
     * Set <p>描述当前请求活体阶段被拒绝的详细原因，该参数仅限PLUS版本核身服务返回。</p><ul><li>详情如下：<br>  01-用户全程闭眼<br>  02-用户未完成指定动作<br>  03-疑似翻拍攻击<br>  04-疑似合成攻击<br>  05-疑似黑产模版<br>  06-疑似存在水印<br>  07-反光校验未通过<br>  08-疑似中途换人<br>  09-人脸质量过差<br>  10-距离校验不通过<br>  11-疑似对抗样本攻击<br>  12-嘴巴区域疑似存在攻击痕迹<br>  13-眼睛区域疑似存在攻击痕迹<br>  14-眼睛或嘴巴被遮挡</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessInfoTag <p>描述当前请求活体阶段被拒绝的详细原因，该参数仅限PLUS版本核身服务返回。</p><ul><li>详情如下：<br>  01-用户全程闭眼<br>  02-用户未完成指定动作<br>  03-疑似翻拍攻击<br>  04-疑似合成攻击<br>  05-疑似黑产模版<br>  06-疑似存在水印<br>  07-反光校验未通过<br>  08-疑似中途换人<br>  09-人脸质量过差<br>  10-距离校验不通过<br>  11-疑似对抗样本攻击<br>  12-嘴巴区域疑似存在攻击痕迹<br>  13-眼睛区域疑似存在攻击痕迹<br>  14-眼睛或嘴巴被遮挡</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessInfoTag(String [] LivenessInfoTag) {
        this.LivenessInfoTag = LivenessInfoTag;
    }

    /**
     * Get <p>手机号码。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mobile <p>手机号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>手机号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mobile <p>手机号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>本次流程最终比对库源类型。</p><ul><li>取值范围：<br>  权威库。<br>  业务方自有库（用户上传照片、客户的混合库、混合部署库）。<br>  二次验证库。<br>  人工审核库。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareLibType <p>本次流程最终比对库源类型。</p><ul><li>取值范围：<br>  权威库。<br>  业务方自有库（用户上传照片、客户的混合库、混合部署库）。<br>  二次验证库。<br>  人工审核库。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareLibType() {
        return this.CompareLibType;
    }

    /**
     * Set <p>本次流程最终比对库源类型。</p><ul><li>取值范围：<br>  权威库。<br>  业务方自有库（用户上传照片、客户的混合库、混合部署库）。<br>  二次验证库。<br>  人工审核库。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareLibType <p>本次流程最终比对库源类型。</p><ul><li>取值范围：<br>  权威库。<br>  业务方自有库（用户上传照片、客户的混合库、混合部署库）。<br>  二次验证库。<br>  人工审核库。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareLibType(String CompareLibType) {
        this.CompareLibType = CompareLibType;
    }

    /**
     * Get <p>本次流程最终活体类型。</p><ul><li>取值范围：<br>  0：未知<br>  1：数字活体<br>  2：动作活体<br>  3：静默活体<br>  4：一闪活体（动作+光线）<br>  5：远近活体</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessMode <p>本次流程最终活体类型。</p><ul><li>取值范围：<br>  0：未知<br>  1：数字活体<br>  2：动作活体<br>  3：静默活体<br>  4：一闪活体（动作+光线）<br>  5：远近活体</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivenessMode() {
        return this.LivenessMode;
    }

    /**
     * Set <p>本次流程最终活体类型。</p><ul><li>取值范围：<br>  0：未知<br>  1：数字活体<br>  2：动作活体<br>  3：静默活体<br>  4：一闪活体（动作+光线）<br>  5：远近活体</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessMode <p>本次流程最终活体类型。</p><ul><li>取值范围：<br>  0：未知<br>  1：数字活体<br>  2：动作活体<br>  3：静默活体<br>  4：一闪活体（动作+光线）<br>  5：远近活体</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessMode(Long LivenessMode) {
        this.LivenessMode = LivenessMode;
    }

    /**
     * Get <p>nfc重复计费requestId列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFCRequestIds <p>nfc重复计费requestId列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNFCRequestIds() {
        return this.NFCRequestIds;
    }

    /**
     * Set <p>nfc重复计费requestId列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFCRequestIds <p>nfc重复计费requestId列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFCRequestIds(String [] NFCRequestIds) {
        this.NFCRequestIds = NFCRequestIds;
    }

    /**
     * Get <p>nfc重复计费计数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFCBillingCounts <p>nfc重复计费计数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNFCBillingCounts() {
        return this.NFCBillingCounts;
    }

    /**
     * Set <p>nfc重复计费计数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFCBillingCounts <p>nfc重复计费计数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFCBillingCounts(Long NFCBillingCounts) {
        this.NFCBillingCounts = NFCBillingCounts;
    }

    /**
     * Get <p>港澳台居住证通行证号码。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassNo <p>港澳台居住证通行证号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassNo() {
        return this.PassNo;
    }

    /**
     * Set <p>港澳台居住证通行证号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassNo <p>港澳台居住证通行证号码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassNo(String PassNo) {
        this.PassNo = PassNo;
    }

    /**
     * Get <p>港澳台居住证签发次数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisaNum <p>港澳台居住证签发次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVisaNum() {
        return this.VisaNum;
    }

    /**
     * Set <p>港澳台居住证签发次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisaNum <p>港澳台居住证签发次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisaNum(String VisaNum) {
        this.VisaNum = VisaNum;
    }

    /**
     * Get <p>活体检测的动作顺序，多动作以“,”分隔。<br>输出格式如：“1,2”表示“张嘴+眨眼”。</p><ul><li>详细序列值含义如下：<br> 1：张嘴<br>2：眨眼<br>3：点头<br>4：摇头<br>5：静默<br>注：仅浮层H5产品返回</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessActionSequence <p>活体检测的动作顺序，多动作以“,”分隔。<br>输出格式如：“1,2”表示“张嘴+眨眼”。</p><ul><li>详细序列值含义如下：<br> 1：张嘴<br>2：眨眼<br>3：点头<br>4：摇头<br>5：静默<br>注：仅浮层H5产品返回</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivenessActionSequence() {
        return this.LivenessActionSequence;
    }

    /**
     * Set <p>活体检测的动作顺序，多动作以“,”分隔。<br>输出格式如：“1,2”表示“张嘴+眨眼”。</p><ul><li>详细序列值含义如下：<br> 1：张嘴<br>2：眨眼<br>3：点头<br>4：摇头<br>5：静默<br>注：仅浮层H5产品返回</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessActionSequence <p>活体检测的动作顺序，多动作以“,”分隔。<br>输出格式如：“1,2”表示“张嘴+眨眼”。</p><ul><li>详细序列值含义如下：<br> 1：张嘴<br>2：眨眼<br>3：点头<br>4：摇头<br>5：静默<br>注：仅浮层H5产品返回</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessActionSequence(String LivenessActionSequence) {
        this.LivenessActionSequence = LivenessActionSequence;
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
        if (source.LivenessInfoTag != null) {
            this.LivenessInfoTag = new String[source.LivenessInfoTag.length];
            for (int i = 0; i < source.LivenessInfoTag.length; i++) {
                this.LivenessInfoTag[i] = new String(source.LivenessInfoTag[i]);
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
        if (source.LivenessActionSequence != null) {
            this.LivenessActionSequence = new String(source.LivenessActionSequence);
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
        this.setParamArraySimple(map, prefix + "LivenessInfoTag.", this.LivenessInfoTag);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "CompareLibType", this.CompareLibType);
        this.setParamSimple(map, prefix + "LivenessMode", this.LivenessMode);
        this.setParamArraySimple(map, prefix + "NFCRequestIds.", this.NFCRequestIds);
        this.setParamSimple(map, prefix + "NFCBillingCounts", this.NFCBillingCounts);
        this.setParamSimple(map, prefix + "PassNo", this.PassNo);
        this.setParamSimple(map, prefix + "VisaNum", this.VisaNum);
        this.setParamSimple(map, prefix + "LivenessActionSequence", this.LivenessActionSequence);

    }
}

