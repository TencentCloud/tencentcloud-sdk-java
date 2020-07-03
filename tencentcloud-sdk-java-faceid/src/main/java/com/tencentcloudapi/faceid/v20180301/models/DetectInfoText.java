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
    * 本次验证使用的姓名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Ocr识别结果。民族。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrNation")
    @Expose
    private String OcrNation;

    /**
    * Ocr识别结果。家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAddress")
    @Expose
    private String OcrAddress;

    /**
    * Ocr识别结果。生日。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrBirth")
    @Expose
    private String OcrBirth;

    /**
    * Ocr识别结果。签发机关。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAuthority")
    @Expose
    private String OcrAuthority;

    /**
    * Ocr识别结果。有效日期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrValidDate")
    @Expose
    private String OcrValidDate;

    /**
    * Ocr识别结果。姓名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrName")
    @Expose
    private String OcrName;

    /**
    * Ocr识别结果。身份证号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrIdCard")
    @Expose
    private String OcrIdCard;

    /**
    * Ocr识别结果。性别。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrGender")
    @Expose
    private String OcrGender;

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
    * 本次流程活体一比一的分数。
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
     * Get Ocr识别结果。民族。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrNation Ocr识别结果。民族。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrNation() {
        return this.OcrNation;
    }

    /**
     * Set Ocr识别结果。民族。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrNation Ocr识别结果。民族。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrNation(String OcrNation) {
        this.OcrNation = OcrNation;
    }

    /**
     * Get Ocr识别结果。家庭住址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAddress Ocr识别结果。家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAddress() {
        return this.OcrAddress;
    }

    /**
     * Set Ocr识别结果。家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAddress Ocr识别结果。家庭住址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAddress(String OcrAddress) {
        this.OcrAddress = OcrAddress;
    }

    /**
     * Get Ocr识别结果。生日。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrBirth Ocr识别结果。生日。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrBirth() {
        return this.OcrBirth;
    }

    /**
     * Set Ocr识别结果。生日。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrBirth Ocr识别结果。生日。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrBirth(String OcrBirth) {
        this.OcrBirth = OcrBirth;
    }

    /**
     * Get Ocr识别结果。签发机关。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAuthority Ocr识别结果。签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrAuthority() {
        return this.OcrAuthority;
    }

    /**
     * Set Ocr识别结果。签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAuthority Ocr识别结果。签发机关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAuthority(String OcrAuthority) {
        this.OcrAuthority = OcrAuthority;
    }

    /**
     * Get Ocr识别结果。有效日期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrValidDate Ocr识别结果。有效日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrValidDate() {
        return this.OcrValidDate;
    }

    /**
     * Set Ocr识别结果。有效日期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrValidDate Ocr识别结果。有效日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrValidDate(String OcrValidDate) {
        this.OcrValidDate = OcrValidDate;
    }

    /**
     * Get Ocr识别结果。姓名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrName Ocr识别结果。姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrName() {
        return this.OcrName;
    }

    /**
     * Set Ocr识别结果。姓名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrName Ocr识别结果。姓名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrName(String OcrName) {
        this.OcrName = OcrName;
    }

    /**
     * Get Ocr识别结果。身份证号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrIdCard Ocr识别结果。身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrIdCard() {
        return this.OcrIdCard;
    }

    /**
     * Set Ocr识别结果。身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrIdCard Ocr识别结果。身份证号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrIdCard(String OcrIdCard) {
        this.OcrIdCard = OcrIdCard;
    }

    /**
     * Get Ocr识别结果。性别。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrGender Ocr识别结果。性别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrGender() {
        return this.OcrGender;
    }

    /**
     * Set Ocr识别结果。性别。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrGender Ocr识别结果。性别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrGender(String OcrGender) {
        this.OcrGender = OcrGender;
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
     * Get 本次流程活体一比一的分数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sim 本次流程活体一比一的分数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSim() {
        return this.Sim;
    }

    /**
     * Set 本次流程活体一比一的分数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sim 本次流程活体一比一的分数。
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OcrNation", this.OcrNation);
        this.setParamSimple(map, prefix + "OcrAddress", this.OcrAddress);
        this.setParamSimple(map, prefix + "OcrBirth", this.OcrBirth);
        this.setParamSimple(map, prefix + "OcrAuthority", this.OcrAuthority);
        this.setParamSimple(map, prefix + "OcrValidDate", this.OcrValidDate);
        this.setParamSimple(map, prefix + "OcrName", this.OcrName);
        this.setParamSimple(map, prefix + "OcrIdCard", this.OcrIdCard);
        this.setParamSimple(map, prefix + "OcrGender", this.OcrGender);
        this.setParamSimple(map, prefix + "LiveStatus", this.LiveStatus);
        this.setParamSimple(map, prefix + "LiveMsg", this.LiveMsg);
        this.setParamSimple(map, prefix + "Comparestatus", this.Comparestatus);
        this.setParamSimple(map, prefix + "Comparemsg", this.Comparemsg);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArrayObj(map, prefix + "LivenessDetail.", this.LivenessDetail);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);

    }
}

