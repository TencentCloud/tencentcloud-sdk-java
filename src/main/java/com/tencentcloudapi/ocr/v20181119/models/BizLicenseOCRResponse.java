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

public class BizLicenseOCRResponse extends AbstractModel {

    /**
    * 统一社会信用代码（三合一之前为注册号）
    */
    @SerializedName("RegNum")
    @Expose
    private String RegNum;

    /**
    * 公司名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 注册资本
    */
    @SerializedName("Capital")
    @Expose
    private String Capital;

    /**
    * 法定代表人
    */
    @SerializedName("Person")
    @Expose
    private String Person;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 经营范围
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 主体类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 营业期限
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 组成形式
    */
    @SerializedName("ComposingForm")
    @Expose
    private String ComposingForm;

    /**
    * 成立日期
    */
    @SerializedName("SetDate")
    @Expose
    private String SetDate;

    /**
    * Code 告警码列表和释义：
-9102 黑白复印件告警
-9104 翻拍件告警
    */
    @SerializedName("RecognizeWarnCode")
    @Expose
    private Long [] RecognizeWarnCode;

    /**
    * 告警码说明：
WARN_COPY_CARD 黑白复印件告警
WARN_RESHOOT_CARD翻拍件告警
    */
    @SerializedName("RecognizeWarnMsg")
    @Expose
    private String [] RecognizeWarnMsg;

    /**
    * 是否为副本。1为是，-1为不是。
    */
    @SerializedName("IsDuplication")
    @Expose
    private Long IsDuplication;

    /**
    * 登记日期
    */
    @SerializedName("RegistrationDate")
    @Expose
    private String RegistrationDate;

    /**
    *  图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度


    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 是否有国徽。false为没有，true为有。
    */
    @SerializedName("NationalEmblem")
    @Expose
    private Boolean NationalEmblem;

    /**
    * 是否有二维码。false为没有，true为有。
    */
    @SerializedName("QRCode")
    @Expose
    private Boolean QRCode;

    /**
    * 是否有印章。false为没有，true为有。
    */
    @SerializedName("Seal")
    @Expose
    private Boolean Seal;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 编号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 登记机关
    */
    @SerializedName("RegistrationAuthority")
    @Expose
    private String RegistrationAuthority;

    /**
    * 是否是电子营业执照。false为没有，true为有。
    */
    @SerializedName("Electronic")
    @Expose
    private Boolean Electronic;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统一社会信用代码（三合一之前为注册号） 
     * @return RegNum 统一社会信用代码（三合一之前为注册号）
     */
    public String getRegNum() {
        return this.RegNum;
    }

    /**
     * Set 统一社会信用代码（三合一之前为注册号）
     * @param RegNum 统一社会信用代码（三合一之前为注册号）
     */
    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }

    /**
     * Get 公司名称 
     * @return Name 公司名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 公司名称
     * @param Name 公司名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 注册资本 
     * @return Capital 注册资本
     */
    public String getCapital() {
        return this.Capital;
    }

    /**
     * Set 注册资本
     * @param Capital 注册资本
     */
    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    /**
     * Get 法定代表人 
     * @return Person 法定代表人
     */
    public String getPerson() {
        return this.Person;
    }

    /**
     * Set 法定代表人
     * @param Person 法定代表人
     */
    public void setPerson(String Person) {
        this.Person = Person;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 经营范围 
     * @return Business 经营范围
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 经营范围
     * @param Business 经营范围
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 主体类型 
     * @return Type 主体类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 主体类型
     * @param Type 主体类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 营业期限 
     * @return Period 营业期限
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 营业期限
     * @param Period 营业期限
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 组成形式 
     * @return ComposingForm 组成形式
     */
    public String getComposingForm() {
        return this.ComposingForm;
    }

    /**
     * Set 组成形式
     * @param ComposingForm 组成形式
     */
    public void setComposingForm(String ComposingForm) {
        this.ComposingForm = ComposingForm;
    }

    /**
     * Get 成立日期 
     * @return SetDate 成立日期
     */
    public String getSetDate() {
        return this.SetDate;
    }

    /**
     * Set 成立日期
     * @param SetDate 成立日期
     */
    public void setSetDate(String SetDate) {
        this.SetDate = SetDate;
    }

    /**
     * Get Code 告警码列表和释义：
-9102 黑白复印件告警
-9104 翻拍件告警 
     * @return RecognizeWarnCode Code 告警码列表和释义：
-9102 黑白复印件告警
-9104 翻拍件告警
     */
    public Long [] getRecognizeWarnCode() {
        return this.RecognizeWarnCode;
    }

    /**
     * Set Code 告警码列表和释义：
-9102 黑白复印件告警
-9104 翻拍件告警
     * @param RecognizeWarnCode Code 告警码列表和释义：
-9102 黑白复印件告警
-9104 翻拍件告警
     */
    public void setRecognizeWarnCode(Long [] RecognizeWarnCode) {
        this.RecognizeWarnCode = RecognizeWarnCode;
    }

    /**
     * Get 告警码说明：
WARN_COPY_CARD 黑白复印件告警
WARN_RESHOOT_CARD翻拍件告警 
     * @return RecognizeWarnMsg 告警码说明：
WARN_COPY_CARD 黑白复印件告警
WARN_RESHOOT_CARD翻拍件告警
     */
    public String [] getRecognizeWarnMsg() {
        return this.RecognizeWarnMsg;
    }

    /**
     * Set 告警码说明：
WARN_COPY_CARD 黑白复印件告警
WARN_RESHOOT_CARD翻拍件告警
     * @param RecognizeWarnMsg 告警码说明：
WARN_COPY_CARD 黑白复印件告警
WARN_RESHOOT_CARD翻拍件告警
     */
    public void setRecognizeWarnMsg(String [] RecognizeWarnMsg) {
        this.RecognizeWarnMsg = RecognizeWarnMsg;
    }

    /**
     * Get 是否为副本。1为是，-1为不是。 
     * @return IsDuplication 是否为副本。1为是，-1为不是。
     */
    public Long getIsDuplication() {
        return this.IsDuplication;
    }

    /**
     * Set 是否为副本。1为是，-1为不是。
     * @param IsDuplication 是否为副本。1为是，-1为不是。
     */
    public void setIsDuplication(Long IsDuplication) {
        this.IsDuplication = IsDuplication;
    }

    /**
     * Get 登记日期 
     * @return RegistrationDate 登记日期
     */
    public String getRegistrationDate() {
        return this.RegistrationDate;
    }

    /**
     * Set 登记日期
     * @param RegistrationDate 登记日期
     */
    public void setRegistrationDate(String RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }

    /**
     * Get  图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度

 
     * @return Angle  图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度


     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set  图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度


     * @param Angle  图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度


     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 是否有国徽。false为没有，true为有。 
     * @return NationalEmblem 是否有国徽。false为没有，true为有。
     */
    public Boolean getNationalEmblem() {
        return this.NationalEmblem;
    }

    /**
     * Set 是否有国徽。false为没有，true为有。
     * @param NationalEmblem 是否有国徽。false为没有，true为有。
     */
    public void setNationalEmblem(Boolean NationalEmblem) {
        this.NationalEmblem = NationalEmblem;
    }

    /**
     * Get 是否有二维码。false为没有，true为有。 
     * @return QRCode 是否有二维码。false为没有，true为有。
     */
    public Boolean getQRCode() {
        return this.QRCode;
    }

    /**
     * Set 是否有二维码。false为没有，true为有。
     * @param QRCode 是否有二维码。false为没有，true为有。
     */
    public void setQRCode(Boolean QRCode) {
        this.QRCode = QRCode;
    }

    /**
     * Get 是否有印章。false为没有，true为有。 
     * @return Seal 是否有印章。false为没有，true为有。
     */
    public Boolean getSeal() {
        return this.Seal;
    }

    /**
     * Set 是否有印章。false为没有，true为有。
     * @param Seal 是否有印章。false为没有，true为有。
     */
    public void setSeal(Boolean Seal) {
        this.Seal = Seal;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 编号 
     * @return SerialNumber 编号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 编号
     * @param SerialNumber 编号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 登记机关 
     * @return RegistrationAuthority 登记机关
     */
    public String getRegistrationAuthority() {
        return this.RegistrationAuthority;
    }

    /**
     * Set 登记机关
     * @param RegistrationAuthority 登记机关
     */
    public void setRegistrationAuthority(String RegistrationAuthority) {
        this.RegistrationAuthority = RegistrationAuthority;
    }

    /**
     * Get 是否是电子营业执照。false为没有，true为有。 
     * @return Electronic 是否是电子营业执照。false为没有，true为有。
     */
    public Boolean getElectronic() {
        return this.Electronic;
    }

    /**
     * Set 是否是电子营业执照。false为没有，true为有。
     * @param Electronic 是否是电子营业执照。false为没有，true为有。
     */
    public void setElectronic(Boolean Electronic) {
        this.Electronic = Electronic;
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

    public BizLicenseOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizLicenseOCRResponse(BizLicenseOCRResponse source) {
        if (source.RegNum != null) {
            this.RegNum = new String(source.RegNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Capital != null) {
            this.Capital = new String(source.Capital);
        }
        if (source.Person != null) {
            this.Person = new String(source.Person);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.ComposingForm != null) {
            this.ComposingForm = new String(source.ComposingForm);
        }
        if (source.SetDate != null) {
            this.SetDate = new String(source.SetDate);
        }
        if (source.RecognizeWarnCode != null) {
            this.RecognizeWarnCode = new Long[source.RecognizeWarnCode.length];
            for (int i = 0; i < source.RecognizeWarnCode.length; i++) {
                this.RecognizeWarnCode[i] = new Long(source.RecognizeWarnCode[i]);
            }
        }
        if (source.RecognizeWarnMsg != null) {
            this.RecognizeWarnMsg = new String[source.RecognizeWarnMsg.length];
            for (int i = 0; i < source.RecognizeWarnMsg.length; i++) {
                this.RecognizeWarnMsg[i] = new String(source.RecognizeWarnMsg[i]);
            }
        }
        if (source.IsDuplication != null) {
            this.IsDuplication = new Long(source.IsDuplication);
        }
        if (source.RegistrationDate != null) {
            this.RegistrationDate = new String(source.RegistrationDate);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.NationalEmblem != null) {
            this.NationalEmblem = new Boolean(source.NationalEmblem);
        }
        if (source.QRCode != null) {
            this.QRCode = new Boolean(source.QRCode);
        }
        if (source.Seal != null) {
            this.Seal = new Boolean(source.Seal);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.RegistrationAuthority != null) {
            this.RegistrationAuthority = new String(source.RegistrationAuthority);
        }
        if (source.Electronic != null) {
            this.Electronic = new Boolean(source.Electronic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegNum", this.RegNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Capital", this.Capital);
        this.setParamSimple(map, prefix + "Person", this.Person);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ComposingForm", this.ComposingForm);
        this.setParamSimple(map, prefix + "SetDate", this.SetDate);
        this.setParamArraySimple(map, prefix + "RecognizeWarnCode.", this.RecognizeWarnCode);
        this.setParamArraySimple(map, prefix + "RecognizeWarnMsg.", this.RecognizeWarnMsg);
        this.setParamSimple(map, prefix + "IsDuplication", this.IsDuplication);
        this.setParamSimple(map, prefix + "RegistrationDate", this.RegistrationDate);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "NationalEmblem", this.NationalEmblem);
        this.setParamSimple(map, prefix + "QRCode", this.QRCode);
        this.setParamSimple(map, prefix + "Seal", this.Seal);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "RegistrationAuthority", this.RegistrationAuthority);
        this.setParamSimple(map, prefix + "Electronic", this.Electronic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

