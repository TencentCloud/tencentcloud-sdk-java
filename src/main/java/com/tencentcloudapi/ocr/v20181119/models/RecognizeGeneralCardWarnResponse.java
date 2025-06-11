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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeGeneralCardWarnResponse extends AbstractModel {

    /**
    * 卡证类型参数，包含以下范围： 
General：通用卡证
IDCard：身份证 
Passport：护照 
BankCard：银行卡
VehicleLicense：行驶证
DriverLicense：驾驶证
BizLicense：营业执照 
HmtResidentPermit：港澳台居住证
ForeignPermanentResident：外国人永居证
MainlandPermit：港澳台来往内地通行证
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * 模糊信息
    */
    @SerializedName("Blur")
    @Expose
    private GeneralCardWarnInfo Blur;

    /**
    * 边框不完整信息
    */
    @SerializedName("BorderIncomplete")
    @Expose
    private GeneralCardWarnInfo BorderIncomplete;

    /**
    * 复印件信息
    */
    @SerializedName("Copy")
    @Expose
    private GeneralCardWarnInfo Copy;

    /**
    * ps篡改信息
    */
    @SerializedName("Ps")
    @Expose
    private GeneralCardWarnInfo Ps;

    /**
    * 反光信息
    */
    @SerializedName("Reflection")
    @Expose
    private GeneralCardWarnInfo Reflection;

    /**
    * 翻拍件信息
    */
    @SerializedName("Reprint")
    @Expose
    private GeneralCardWarnInfo Reprint;

    /**
    * 是否截图
    */
    @SerializedName("Screenshot")
    @Expose
    private GeneralCardWarnInfo Screenshot;

    /**
    * 是否遮挡
    */
    @SerializedName("Cover")
    @Expose
    private GeneralCardWarnInfo Cover;

    /**
    * 是否重叠
    */
    @SerializedName("Overlap")
    @Expose
    private GeneralCardWarnInfo Overlap;

    /**
    * 是否水印
    */
    @SerializedName("Watermark")
    @Expose
    private GeneralCardWarnInfo Watermark;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卡证类型参数，包含以下范围： 
General：通用卡证
IDCard：身份证 
Passport：护照 
BankCard：银行卡
VehicleLicense：行驶证
DriverLicense：驾驶证
BizLicense：营业执照 
HmtResidentPermit：港澳台居住证
ForeignPermanentResident：外国人永居证
MainlandPermit：港澳台来往内地通行证 
     * @return CardType 卡证类型参数，包含以下范围： 
General：通用卡证
IDCard：身份证 
Passport：护照 
BankCard：银行卡
VehicleLicense：行驶证
DriverLicense：驾驶证
BizLicense：营业执照 
HmtResidentPermit：港澳台居住证
ForeignPermanentResident：外国人永居证
MainlandPermit：港澳台来往内地通行证
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set 卡证类型参数，包含以下范围： 
General：通用卡证
IDCard：身份证 
Passport：护照 
BankCard：银行卡
VehicleLicense：行驶证
DriverLicense：驾驶证
BizLicense：营业执照 
HmtResidentPermit：港澳台居住证
ForeignPermanentResident：外国人永居证
MainlandPermit：港澳台来往内地通行证
     * @param CardType 卡证类型参数，包含以下范围： 
General：通用卡证
IDCard：身份证 
Passport：护照 
BankCard：银行卡
VehicleLicense：行驶证
DriverLicense：驾驶证
BizLicense：营业执照 
HmtResidentPermit：港澳台居住证
ForeignPermanentResident：外国人永居证
MainlandPermit：港澳台来往内地通行证
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get 模糊信息 
     * @return Blur 模糊信息
     */
    public GeneralCardWarnInfo getBlur() {
        return this.Blur;
    }

    /**
     * Set 模糊信息
     * @param Blur 模糊信息
     */
    public void setBlur(GeneralCardWarnInfo Blur) {
        this.Blur = Blur;
    }

    /**
     * Get 边框不完整信息 
     * @return BorderIncomplete 边框不完整信息
     */
    public GeneralCardWarnInfo getBorderIncomplete() {
        return this.BorderIncomplete;
    }

    /**
     * Set 边框不完整信息
     * @param BorderIncomplete 边框不完整信息
     */
    public void setBorderIncomplete(GeneralCardWarnInfo BorderIncomplete) {
        this.BorderIncomplete = BorderIncomplete;
    }

    /**
     * Get 复印件信息 
     * @return Copy 复印件信息
     */
    public GeneralCardWarnInfo getCopy() {
        return this.Copy;
    }

    /**
     * Set 复印件信息
     * @param Copy 复印件信息
     */
    public void setCopy(GeneralCardWarnInfo Copy) {
        this.Copy = Copy;
    }

    /**
     * Get ps篡改信息 
     * @return Ps ps篡改信息
     */
    public GeneralCardWarnInfo getPs() {
        return this.Ps;
    }

    /**
     * Set ps篡改信息
     * @param Ps ps篡改信息
     */
    public void setPs(GeneralCardWarnInfo Ps) {
        this.Ps = Ps;
    }

    /**
     * Get 反光信息 
     * @return Reflection 反光信息
     */
    public GeneralCardWarnInfo getReflection() {
        return this.Reflection;
    }

    /**
     * Set 反光信息
     * @param Reflection 反光信息
     */
    public void setReflection(GeneralCardWarnInfo Reflection) {
        this.Reflection = Reflection;
    }

    /**
     * Get 翻拍件信息 
     * @return Reprint 翻拍件信息
     */
    public GeneralCardWarnInfo getReprint() {
        return this.Reprint;
    }

    /**
     * Set 翻拍件信息
     * @param Reprint 翻拍件信息
     */
    public void setReprint(GeneralCardWarnInfo Reprint) {
        this.Reprint = Reprint;
    }

    /**
     * Get 是否截图 
     * @return Screenshot 是否截图
     */
    public GeneralCardWarnInfo getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set 是否截图
     * @param Screenshot 是否截图
     */
    public void setScreenshot(GeneralCardWarnInfo Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get 是否遮挡 
     * @return Cover 是否遮挡
     */
    public GeneralCardWarnInfo getCover() {
        return this.Cover;
    }

    /**
     * Set 是否遮挡
     * @param Cover 是否遮挡
     */
    public void setCover(GeneralCardWarnInfo Cover) {
        this.Cover = Cover;
    }

    /**
     * Get 是否重叠 
     * @return Overlap 是否重叠
     */
    public GeneralCardWarnInfo getOverlap() {
        return this.Overlap;
    }

    /**
     * Set 是否重叠
     * @param Overlap 是否重叠
     */
    public void setOverlap(GeneralCardWarnInfo Overlap) {
        this.Overlap = Overlap;
    }

    /**
     * Get 是否水印 
     * @return Watermark 是否水印
     */
    public GeneralCardWarnInfo getWatermark() {
        return this.Watermark;
    }

    /**
     * Set 是否水印
     * @param Watermark 是否水印
     */
    public void setWatermark(GeneralCardWarnInfo Watermark) {
        this.Watermark = Watermark;
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

    public RecognizeGeneralCardWarnResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralCardWarnResponse(RecognizeGeneralCardWarnResponse source) {
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.Blur != null) {
            this.Blur = new GeneralCardWarnInfo(source.Blur);
        }
        if (source.BorderIncomplete != null) {
            this.BorderIncomplete = new GeneralCardWarnInfo(source.BorderIncomplete);
        }
        if (source.Copy != null) {
            this.Copy = new GeneralCardWarnInfo(source.Copy);
        }
        if (source.Ps != null) {
            this.Ps = new GeneralCardWarnInfo(source.Ps);
        }
        if (source.Reflection != null) {
            this.Reflection = new GeneralCardWarnInfo(source.Reflection);
        }
        if (source.Reprint != null) {
            this.Reprint = new GeneralCardWarnInfo(source.Reprint);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new GeneralCardWarnInfo(source.Screenshot);
        }
        if (source.Cover != null) {
            this.Cover = new GeneralCardWarnInfo(source.Cover);
        }
        if (source.Overlap != null) {
            this.Overlap = new GeneralCardWarnInfo(source.Overlap);
        }
        if (source.Watermark != null) {
            this.Watermark = new GeneralCardWarnInfo(source.Watermark);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamObj(map, prefix + "Blur.", this.Blur);
        this.setParamObj(map, prefix + "BorderIncomplete.", this.BorderIncomplete);
        this.setParamObj(map, prefix + "Copy.", this.Copy);
        this.setParamObj(map, prefix + "Ps.", this.Ps);
        this.setParamObj(map, prefix + "Reflection.", this.Reflection);
        this.setParamObj(map, prefix + "Reprint.", this.Reprint);
        this.setParamObj(map, prefix + "Screenshot.", this.Screenshot);
        this.setParamObj(map, prefix + "Cover.", this.Cover);
        this.setParamObj(map, prefix + "Overlap.", this.Overlap);
        this.setParamObj(map, prefix + "Watermark.", this.Watermark);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

