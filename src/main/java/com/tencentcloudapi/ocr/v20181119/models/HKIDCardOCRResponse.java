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

public class HKIDCardOCRResponse extends AbstractModel{

    /**
    * 中文姓名
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * 英文姓名
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 中文姓名对应电码
    */
    @SerializedName("TelexCode")
    @Expose
    private String TelexCode;

    /**
    * 性别 ：“男M”或“女F”
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 永久性居民身份证。
0：非永久；
1：永久；
-1：未知。
    */
    @SerializedName("Permanent")
    @Expose
    private Long Permanent;

    /**
    * 身份证号码
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 证件符号，出生日期下的符号，例如"***AZ"
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * 首次签发日期
    */
    @SerializedName("FirstIssueDate")
    @Expose
    private String FirstIssueDate;

    /**
    * 最近领用日期
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
    * 真假判断。
0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；
1：假；
2：真。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeDetectResult")
    @Expose
    private Long FakeDetectResult;

    /**
    * 人像照片Base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadImage")
    @Expose
    private String HeadImage;

    /**
    * 多重告警码，当身份证是翻拍、复印、PS件时返回对应告警码。
-9102：证照复印件告警
-9103：证照翻拍告警
-9104：证照PS告警
-9105：证照防伪告警
    */
    @SerializedName("WarningCode")
    @Expose
    private Long [] WarningCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 中文姓名 
     * @return CnName 中文姓名
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set 中文姓名
     * @param CnName 中文姓名
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get 英文姓名 
     * @return EnName 英文姓名
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 英文姓名
     * @param EnName 英文姓名
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 中文姓名对应电码 
     * @return TelexCode 中文姓名对应电码
     */
    public String getTelexCode() {
        return this.TelexCode;
    }

    /**
     * Set 中文姓名对应电码
     * @param TelexCode 中文姓名对应电码
     */
    public void setTelexCode(String TelexCode) {
        this.TelexCode = TelexCode;
    }

    /**
     * Get 性别 ：“男M”或“女F” 
     * @return Sex 性别 ：“男M”或“女F”
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别 ：“男M”或“女F”
     * @param Sex 性别 ：“男M”或“女F”
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 出生日期 
     * @return Birthday 出生日期
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
     * @param Birthday 出生日期
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 永久性居民身份证。
0：非永久；
1：永久；
-1：未知。 
     * @return Permanent 永久性居民身份证。
0：非永久；
1：永久；
-1：未知。
     */
    public Long getPermanent() {
        return this.Permanent;
    }

    /**
     * Set 永久性居民身份证。
0：非永久；
1：永久；
-1：未知。
     * @param Permanent 永久性居民身份证。
0：非永久；
1：永久；
-1：未知。
     */
    public void setPermanent(Long Permanent) {
        this.Permanent = Permanent;
    }

    /**
     * Get 身份证号码 
     * @return IdNum 身份证号码
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号码
     * @param IdNum 身份证号码
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 证件符号，出生日期下的符号，例如"***AZ" 
     * @return Symbol 证件符号，出生日期下的符号，例如"***AZ"
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set 证件符号，出生日期下的符号，例如"***AZ"
     * @param Symbol 证件符号，出生日期下的符号，例如"***AZ"
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get 首次签发日期 
     * @return FirstIssueDate 首次签发日期
     */
    public String getFirstIssueDate() {
        return this.FirstIssueDate;
    }

    /**
     * Set 首次签发日期
     * @param FirstIssueDate 首次签发日期
     */
    public void setFirstIssueDate(String FirstIssueDate) {
        this.FirstIssueDate = FirstIssueDate;
    }

    /**
     * Get 最近领用日期 
     * @return CurrentIssueDate 最近领用日期
     */
    public String getCurrentIssueDate() {
        return this.CurrentIssueDate;
    }

    /**
     * Set 最近领用日期
     * @param CurrentIssueDate 最近领用日期
     */
    public void setCurrentIssueDate(String CurrentIssueDate) {
        this.CurrentIssueDate = CurrentIssueDate;
    }

    /**
     * Get 真假判断。
0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；
1：假；
2：真。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeDetectResult 真假判断。
0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；
1：假；
2：真。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFakeDetectResult() {
        return this.FakeDetectResult;
    }

    /**
     * Set 真假判断。
0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；
1：假；
2：真。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeDetectResult 真假判断。
0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；
1：假；
2：真。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeDetectResult(Long FakeDetectResult) {
        this.FakeDetectResult = FakeDetectResult;
    }

    /**
     * Get 人像照片Base64后的结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadImage 人像照片Base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeadImage() {
        return this.HeadImage;
    }

    /**
     * Set 人像照片Base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadImage 人像照片Base64后的结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadImage(String HeadImage) {
        this.HeadImage = HeadImage;
    }

    /**
     * Get 多重告警码，当身份证是翻拍、复印、PS件时返回对应告警码。
-9102：证照复印件告警
-9103：证照翻拍告警
-9104：证照PS告警
-9105：证照防伪告警 
     * @return WarningCode 多重告警码，当身份证是翻拍、复印、PS件时返回对应告警码。
-9102：证照复印件告警
-9103：证照翻拍告警
-9104：证照PS告警
-9105：证照防伪告警
     */
    public Long [] getWarningCode() {
        return this.WarningCode;
    }

    /**
     * Set 多重告警码，当身份证是翻拍、复印、PS件时返回对应告警码。
-9102：证照复印件告警
-9103：证照翻拍告警
-9104：证照PS告警
-9105：证照防伪告警
     * @param WarningCode 多重告警码，当身份证是翻拍、复印、PS件时返回对应告警码。
-9102：证照复印件告警
-9103：证照翻拍告警
-9104：证照PS告警
-9105：证照防伪告警
     */
    public void setWarningCode(Long [] WarningCode) {
        this.WarningCode = WarningCode;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CnName", this.CnName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "TelexCode", this.TelexCode);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Permanent", this.Permanent);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "FirstIssueDate", this.FirstIssueDate);
        this.setParamSimple(map, prefix + "CurrentIssueDate", this.CurrentIssueDate);
        this.setParamSimple(map, prefix + "FakeDetectResult", this.FakeDetectResult);
        this.setParamSimple(map, prefix + "HeadImage", this.HeadImage);
        this.setParamArraySimple(map, prefix + "WarningCode.", this.WarningCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

