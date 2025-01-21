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
default：通用卡证
idcard：身份证 
passport：护照 
bizlicense：营业执照 
regcertificate：登记证书 
residpermit：居住证 
transpermit：通行证 
signboard：门头照 
bankcard：银行卡 
drivinglicense：驾驶证、行驶证
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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卡证类型参数，包含以下范围： 
default：通用卡证
idcard：身份证 
passport：护照 
bizlicense：营业执照 
regcertificate：登记证书 
residpermit：居住证 
transpermit：通行证 
signboard：门头照 
bankcard：银行卡 
drivinglicense：驾驶证、行驶证 
     * @return CardType 卡证类型参数，包含以下范围： 
default：通用卡证
idcard：身份证 
passport：护照 
bizlicense：营业执照 
regcertificate：登记证书 
residpermit：居住证 
transpermit：通行证 
signboard：门头照 
bankcard：银行卡 
drivinglicense：驾驶证、行驶证
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set 卡证类型参数，包含以下范围： 
default：通用卡证
idcard：身份证 
passport：护照 
bizlicense：营业执照 
regcertificate：登记证书 
residpermit：居住证 
transpermit：通行证 
signboard：门头照 
bankcard：银行卡 
drivinglicense：驾驶证、行驶证
     * @param CardType 卡证类型参数，包含以下范围： 
default：通用卡证
idcard：身份证 
passport：护照 
bizlicense：营业执照 
regcertificate：登记证书 
residpermit：居住证 
transpermit：通行证 
signboard：门头照 
bankcard：银行卡 
drivinglicense：驾驶证、行驶证
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

