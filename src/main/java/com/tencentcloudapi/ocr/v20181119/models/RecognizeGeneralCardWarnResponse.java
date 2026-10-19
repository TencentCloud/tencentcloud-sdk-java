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

public class RecognizeGeneralCardWarnResponse extends AbstractModel {

    /**
    * <p>卡证类型参数，枚举值：<br>（如入参CardType未填或填入General，返回自动分类的卡证类型，未能分类的其他类型返回General；如入参CardType填入General以外的值，则不进行自动分类、返回相同的值）</p><p>General：其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * <p>模糊信息</p>
    */
    @SerializedName("Blur")
    @Expose
    private GeneralCardWarnInfo Blur;

    /**
    * <p>边框不完整信息</p>
    */
    @SerializedName("BorderIncomplete")
    @Expose
    private GeneralCardWarnInfo BorderIncomplete;

    /**
    * <p>复印件信息</p>
    */
    @SerializedName("Copy")
    @Expose
    private GeneralCardWarnInfo Copy;

    /**
    * <p>ps篡改信息</p>
    */
    @SerializedName("Ps")
    @Expose
    private GeneralCardWarnInfo Ps;

    /**
    * <p>反光信息</p>
    */
    @SerializedName("Reflection")
    @Expose
    private GeneralCardWarnInfo Reflection;

    /**
    * <p>翻拍件信息</p>
    */
    @SerializedName("Reprint")
    @Expose
    private GeneralCardWarnInfo Reprint;

    /**
    * <p>是否截图</p>
    */
    @SerializedName("Screenshot")
    @Expose
    private GeneralCardWarnInfo Screenshot;

    /**
    * <p>是否遮挡</p>
    */
    @SerializedName("Cover")
    @Expose
    private GeneralCardWarnInfo Cover;

    /**
    * <p>是否重叠</p>
    */
    @SerializedName("Overlap")
    @Expose
    private GeneralCardWarnInfo Overlap;

    /**
    * <p>是否水印</p>
    */
    @SerializedName("Watermark")
    @Expose
    private GeneralCardWarnInfo Watermark;

    /**
    * <p>是否电子证照（目前仅支持电子身份证、电子营业执照识别</p>
    */
    @SerializedName("Electron")
    @Expose
    private GeneralCardWarnInfo Electron;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>卡证类型参数，枚举值：<br>（如入参CardType未填或填入General，返回自动分类的卡证类型，未能分类的其他类型返回General；如入参CardType填入General以外的值，则不进行自动分类、返回相同的值）</p><p>General：其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p> 
     * @return CardType <p>卡证类型参数，枚举值：<br>（如入参CardType未填或填入General，返回自动分类的卡证类型，未能分类的其他类型返回General；如入参CardType填入General以外的值，则不进行自动分类、返回相同的值）</p><p>General：其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set <p>卡证类型参数，枚举值：<br>（如入参CardType未填或填入General，返回自动分类的卡证类型，未能分类的其他类型返回General；如入参CardType填入General以外的值，则不进行自动分类、返回相同的值）</p><p>General：其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     * @param CardType <p>卡证类型参数，枚举值：<br>（如入参CardType未填或填入General，返回自动分类的卡证类型，未能分类的其他类型返回General；如入参CardType填入General以外的值，则不进行自动分类、返回相同的值）</p><p>General：其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get <p>模糊信息</p> 
     * @return Blur <p>模糊信息</p>
     */
    public GeneralCardWarnInfo getBlur() {
        return this.Blur;
    }

    /**
     * Set <p>模糊信息</p>
     * @param Blur <p>模糊信息</p>
     */
    public void setBlur(GeneralCardWarnInfo Blur) {
        this.Blur = Blur;
    }

    /**
     * Get <p>边框不完整信息</p> 
     * @return BorderIncomplete <p>边框不完整信息</p>
     */
    public GeneralCardWarnInfo getBorderIncomplete() {
        return this.BorderIncomplete;
    }

    /**
     * Set <p>边框不完整信息</p>
     * @param BorderIncomplete <p>边框不完整信息</p>
     */
    public void setBorderIncomplete(GeneralCardWarnInfo BorderIncomplete) {
        this.BorderIncomplete = BorderIncomplete;
    }

    /**
     * Get <p>复印件信息</p> 
     * @return Copy <p>复印件信息</p>
     */
    public GeneralCardWarnInfo getCopy() {
        return this.Copy;
    }

    /**
     * Set <p>复印件信息</p>
     * @param Copy <p>复印件信息</p>
     */
    public void setCopy(GeneralCardWarnInfo Copy) {
        this.Copy = Copy;
    }

    /**
     * Get <p>ps篡改信息</p> 
     * @return Ps <p>ps篡改信息</p>
     */
    public GeneralCardWarnInfo getPs() {
        return this.Ps;
    }

    /**
     * Set <p>ps篡改信息</p>
     * @param Ps <p>ps篡改信息</p>
     */
    public void setPs(GeneralCardWarnInfo Ps) {
        this.Ps = Ps;
    }

    /**
     * Get <p>反光信息</p> 
     * @return Reflection <p>反光信息</p>
     */
    public GeneralCardWarnInfo getReflection() {
        return this.Reflection;
    }

    /**
     * Set <p>反光信息</p>
     * @param Reflection <p>反光信息</p>
     */
    public void setReflection(GeneralCardWarnInfo Reflection) {
        this.Reflection = Reflection;
    }

    /**
     * Get <p>翻拍件信息</p> 
     * @return Reprint <p>翻拍件信息</p>
     */
    public GeneralCardWarnInfo getReprint() {
        return this.Reprint;
    }

    /**
     * Set <p>翻拍件信息</p>
     * @param Reprint <p>翻拍件信息</p>
     */
    public void setReprint(GeneralCardWarnInfo Reprint) {
        this.Reprint = Reprint;
    }

    /**
     * Get <p>是否截图</p> 
     * @return Screenshot <p>是否截图</p>
     */
    public GeneralCardWarnInfo getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set <p>是否截图</p>
     * @param Screenshot <p>是否截图</p>
     */
    public void setScreenshot(GeneralCardWarnInfo Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get <p>是否遮挡</p> 
     * @return Cover <p>是否遮挡</p>
     */
    public GeneralCardWarnInfo getCover() {
        return this.Cover;
    }

    /**
     * Set <p>是否遮挡</p>
     * @param Cover <p>是否遮挡</p>
     */
    public void setCover(GeneralCardWarnInfo Cover) {
        this.Cover = Cover;
    }

    /**
     * Get <p>是否重叠</p> 
     * @return Overlap <p>是否重叠</p>
     */
    public GeneralCardWarnInfo getOverlap() {
        return this.Overlap;
    }

    /**
     * Set <p>是否重叠</p>
     * @param Overlap <p>是否重叠</p>
     */
    public void setOverlap(GeneralCardWarnInfo Overlap) {
        this.Overlap = Overlap;
    }

    /**
     * Get <p>是否水印</p> 
     * @return Watermark <p>是否水印</p>
     */
    public GeneralCardWarnInfo getWatermark() {
        return this.Watermark;
    }

    /**
     * Set <p>是否水印</p>
     * @param Watermark <p>是否水印</p>
     */
    public void setWatermark(GeneralCardWarnInfo Watermark) {
        this.Watermark = Watermark;
    }

    /**
     * Get <p>是否电子证照（目前仅支持电子身份证、电子营业执照识别</p> 
     * @return Electron <p>是否电子证照（目前仅支持电子身份证、电子营业执照识别</p>
     */
    public GeneralCardWarnInfo getElectron() {
        return this.Electron;
    }

    /**
     * Set <p>是否电子证照（目前仅支持电子身份证、电子营业执照识别</p>
     * @param Electron <p>是否电子证照（目前仅支持电子身份证、电子营业执照识别</p>
     */
    public void setElectron(GeneralCardWarnInfo Electron) {
        this.Electron = Electron;
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
        if (source.Electron != null) {
            this.Electron = new GeneralCardWarnInfo(source.Electron);
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
        this.setParamObj(map, prefix + "Electron.", this.Electron);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

