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

public class HKIDCardOCRResponse extends AbstractModel {

    /**
    * <p>中文姓名</p>
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * <p>英文姓名</p>
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * <p>中文姓名对应电码</p>
    */
    @SerializedName("TelexCode")
    @Expose
    private String TelexCode;

    /**
    * <p>性别 ：“男M”或“女F”</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>出生日期</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>永久性居民身份证。<br>0：非永久；<br>1：永久；<br>-1：未知。</p>
    */
    @SerializedName("Permanent")
    @Expose
    private Long Permanent;

    /**
    * <p>身份证号码</p>
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * <p>证件符号，出生日期下的符号，例如&quot;***AZ&quot;</p>
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * <p>首次签发日期</p>
    */
    @SerializedName("FirstIssueDate")
    @Expose
    private String FirstIssueDate;

    /**
    * <p>最近领用日期</p>
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
    * <p>真假判断。<br>0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；<br>1：假；<br>2：真。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeDetectResult")
    @Expose
    private Long FakeDetectResult;

    /**
    * <p>Base64编码的证件左侧人像大图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadImage")
    @Expose
    private String HeadImage;

    /**
    * <p>Base64编码的证件右侧人像小图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmallHeadImage")
    @Expose
    private String SmallHeadImage;

    /**
    * <p>该字段已废弃， 将固定返回空数组，不建议使用。</p>
    */
    @SerializedName("WarningCode")
    @Expose
    private Long [] WarningCode;

    /**
    * <p>该字段仅对国际站请求起作用，国内站该字段将固定返回空数组。国际站告警码如下：    告警码-9101 证件边框不完整告警-9102 证件复印件告警-9103 证件翻拍告警-9104 证件PS告警-9107 证件反光告警-9108 证件模糊告警-9109 告警能力未开通</p>
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * <p>证件透明视窗内的文本信息</p>
    */
    @SerializedName("WindowEmbeddedText")
    @Expose
    private String WindowEmbeddedText;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>中文姓名</p> 
     * @return CnName <p>中文姓名</p>
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set <p>中文姓名</p>
     * @param CnName <p>中文姓名</p>
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get <p>英文姓名</p> 
     * @return EnName <p>英文姓名</p>
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set <p>英文姓名</p>
     * @param EnName <p>英文姓名</p>
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get <p>中文姓名对应电码</p> 
     * @return TelexCode <p>中文姓名对应电码</p>
     */
    public String getTelexCode() {
        return this.TelexCode;
    }

    /**
     * Set <p>中文姓名对应电码</p>
     * @param TelexCode <p>中文姓名对应电码</p>
     */
    public void setTelexCode(String TelexCode) {
        this.TelexCode = TelexCode;
    }

    /**
     * Get <p>性别 ：“男M”或“女F”</p> 
     * @return Sex <p>性别 ：“男M”或“女F”</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别 ：“男M”或“女F”</p>
     * @param Sex <p>性别 ：“男M”或“女F”</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>出生日期</p> 
     * @return Birthday <p>出生日期</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>出生日期</p>
     * @param Birthday <p>出生日期</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>永久性居民身份证。<br>0：非永久；<br>1：永久；<br>-1：未知。</p> 
     * @return Permanent <p>永久性居民身份证。<br>0：非永久；<br>1：永久；<br>-1：未知。</p>
     */
    public Long getPermanent() {
        return this.Permanent;
    }

    /**
     * Set <p>永久性居民身份证。<br>0：非永久；<br>1：永久；<br>-1：未知。</p>
     * @param Permanent <p>永久性居民身份证。<br>0：非永久；<br>1：永久；<br>-1：未知。</p>
     */
    public void setPermanent(Long Permanent) {
        this.Permanent = Permanent;
    }

    /**
     * Get <p>身份证号码</p> 
     * @return IdNum <p>身份证号码</p>
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>身份证号码</p>
     * @param IdNum <p>身份证号码</p>
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get <p>证件符号，出生日期下的符号，例如&quot;***AZ&quot;</p> 
     * @return Symbol <p>证件符号，出生日期下的符号，例如&quot;***AZ&quot;</p>
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set <p>证件符号，出生日期下的符号，例如&quot;***AZ&quot;</p>
     * @param Symbol <p>证件符号，出生日期下的符号，例如&quot;***AZ&quot;</p>
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get <p>首次签发日期</p> 
     * @return FirstIssueDate <p>首次签发日期</p>
     */
    public String getFirstIssueDate() {
        return this.FirstIssueDate;
    }

    /**
     * Set <p>首次签发日期</p>
     * @param FirstIssueDate <p>首次签发日期</p>
     */
    public void setFirstIssueDate(String FirstIssueDate) {
        this.FirstIssueDate = FirstIssueDate;
    }

    /**
     * Get <p>最近领用日期</p> 
     * @return CurrentIssueDate <p>最近领用日期</p>
     */
    public String getCurrentIssueDate() {
        return this.CurrentIssueDate;
    }

    /**
     * Set <p>最近领用日期</p>
     * @param CurrentIssueDate <p>最近领用日期</p>
     */
    public void setCurrentIssueDate(String CurrentIssueDate) {
        this.CurrentIssueDate = CurrentIssueDate;
    }

    /**
     * Get <p>真假判断。<br>0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；<br>1：假；<br>2：真。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeDetectResult <p>真假判断。<br>0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；<br>1：假；<br>2：真。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getFakeDetectResult() {
        return this.FakeDetectResult;
    }

    /**
     * Set <p>真假判断。<br>0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；<br>1：假；<br>2：真。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeDetectResult <p>真假判断。<br>0：无法判断（图像模糊、不完整、反光、过暗等导致无法判断）；<br>1：假；<br>2：真。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setFakeDetectResult(Long FakeDetectResult) {
        this.FakeDetectResult = FakeDetectResult;
    }

    /**
     * Get <p>Base64编码的证件左侧人像大图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadImage <p>Base64编码的证件左侧人像大图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHeadImage() {
        return this.HeadImage;
    }

    /**
     * Set <p>Base64编码的证件左侧人像大图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadImage <p>Base64编码的证件左侧人像大图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadImage(String HeadImage) {
        this.HeadImage = HeadImage;
    }

    /**
     * Get <p>Base64编码的证件右侧人像小图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmallHeadImage <p>Base64编码的证件右侧人像小图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSmallHeadImage() {
        return this.SmallHeadImage;
    }

    /**
     * Set <p>Base64编码的证件右侧人像小图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmallHeadImage <p>Base64编码的证件右侧人像小图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmallHeadImage(String SmallHeadImage) {
        this.SmallHeadImage = SmallHeadImage;
    }

    /**
     * Get <p>该字段已废弃， 将固定返回空数组，不建议使用。</p> 
     * @return WarningCode <p>该字段已废弃， 将固定返回空数组，不建议使用。</p>
     * @deprecated
     */
    @Deprecated
    public Long [] getWarningCode() {
        return this.WarningCode;
    }

    /**
     * Set <p>该字段已废弃， 将固定返回空数组，不建议使用。</p>
     * @param WarningCode <p>该字段已废弃， 将固定返回空数组，不建议使用。</p>
     * @deprecated
     */
    @Deprecated
    public void setWarningCode(Long [] WarningCode) {
        this.WarningCode = WarningCode;
    }

    /**
     * Get <p>该字段仅对国际站请求起作用，国内站该字段将固定返回空数组。国际站告警码如下：    告警码-9101 证件边框不完整告警-9102 证件复印件告警-9103 证件翻拍告警-9104 证件PS告警-9107 证件反光告警-9108 证件模糊告警-9109 告警能力未开通</p> 
     * @return WarnCardInfos <p>该字段仅对国际站请求起作用，国内站该字段将固定返回空数组。国际站告警码如下：    告警码-9101 证件边框不完整告警-9102 证件复印件告警-9103 证件翻拍告警-9104 证件PS告警-9107 证件反光告警-9108 证件模糊告警-9109 告警能力未开通</p>
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set <p>该字段仅对国际站请求起作用，国内站该字段将固定返回空数组。国际站告警码如下：    告警码-9101 证件边框不完整告警-9102 证件复印件告警-9103 证件翻拍告警-9104 证件PS告警-9107 证件反光告警-9108 证件模糊告警-9109 告警能力未开通</p>
     * @param WarnCardInfos <p>该字段仅对国际站请求起作用，国内站该字段将固定返回空数组。国际站告警码如下：    告警码-9101 证件边框不完整告警-9102 证件复印件告警-9103 证件翻拍告警-9104 证件PS告警-9107 证件反光告警-9108 证件模糊告警-9109 告警能力未开通</p>
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get <p>证件透明视窗内的文本信息</p> 
     * @return WindowEmbeddedText <p>证件透明视窗内的文本信息</p>
     */
    public String getWindowEmbeddedText() {
        return this.WindowEmbeddedText;
    }

    /**
     * Set <p>证件透明视窗内的文本信息</p>
     * @param WindowEmbeddedText <p>证件透明视窗内的文本信息</p>
     */
    public void setWindowEmbeddedText(String WindowEmbeddedText) {
        this.WindowEmbeddedText = WindowEmbeddedText;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public HKIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HKIDCardOCRResponse(HKIDCardOCRResponse source) {
        if (source.CnName != null) {
            this.CnName = new String(source.CnName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.TelexCode != null) {
            this.TelexCode = new String(source.TelexCode);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Permanent != null) {
            this.Permanent = new Long(source.Permanent);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.FirstIssueDate != null) {
            this.FirstIssueDate = new String(source.FirstIssueDate);
        }
        if (source.CurrentIssueDate != null) {
            this.CurrentIssueDate = new String(source.CurrentIssueDate);
        }
        if (source.FakeDetectResult != null) {
            this.FakeDetectResult = new Long(source.FakeDetectResult);
        }
        if (source.HeadImage != null) {
            this.HeadImage = new String(source.HeadImage);
        }
        if (source.SmallHeadImage != null) {
            this.SmallHeadImage = new String(source.SmallHeadImage);
        }
        if (source.WarningCode != null) {
            this.WarningCode = new Long[source.WarningCode.length];
            for (int i = 0; i < source.WarningCode.length; i++) {
                this.WarningCode[i] = new Long(source.WarningCode[i]);
            }
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.WindowEmbeddedText != null) {
            this.WindowEmbeddedText = new String(source.WindowEmbeddedText);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "SmallHeadImage", this.SmallHeadImage);
        this.setParamArraySimple(map, prefix + "WarningCode.", this.WarningCode);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "WindowEmbeddedText", this.WindowEmbeddedText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

