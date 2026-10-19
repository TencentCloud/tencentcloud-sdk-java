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
    * <p>统一社会信用代码（三合一之前为注册号）</p>
    */
    @SerializedName("RegNum")
    @Expose
    private String RegNum;

    /**
    * <p>公司名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>注册资本</p>
    */
    @SerializedName("Capital")
    @Expose
    private String Capital;

    /**
    * <p>法定代表人</p>
    */
    @SerializedName("Person")
    @Expose
    private String Person;

    /**
    * <p>地址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>经营范围</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>主体类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>营业期限</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>组成形式</p>
    */
    @SerializedName("ComposingForm")
    @Expose
    private String ComposingForm;

    /**
    * <p>成立日期</p>
    */
    @SerializedName("SetDate")
    @Expose
    private String SetDate;

    /**
    * <p>Code 告警码列表和释义：<br>-9102 黑白复印件告警<br>-9104 翻拍件告警<br>-9108 经营范围识别异常告警（由于文字过小、模糊、反光、遮挡或明显倾斜等情况导致未能正常识别）</p>
    */
    @SerializedName("RecognizeWarnCode")
    @Expose
    private Long [] RecognizeWarnCode;

    /**
    * <p>告警码说明：<br>WARN_COPY_CARD 黑白复印件告警<br>WARN_RESHOOT_CARD翻拍件告警<br>WARN_EARLY_STOP 经营范围识别异常告警</p>
    */
    @SerializedName("RecognizeWarnMsg")
    @Expose
    private String [] RecognizeWarnMsg;

    /**
    * <p>是否为副本。1为是，-1为不是。</p>
    */
    @SerializedName("IsDuplication")
    @Expose
    private Long IsDuplication;

    /**
    * <p>登记日期</p>
    */
    @SerializedName("RegistrationDate")
    @Expose
    private String RegistrationDate;

    /**
    * <p>图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>是否有国徽。false为没有，true为有。</p>
    */
    @SerializedName("NationalEmblem")
    @Expose
    private Boolean NationalEmblem;

    /**
    * <p>是否有二维码。false为没有，true为有。</p>
    */
    @SerializedName("QRCode")
    @Expose
    private Boolean QRCode;

    /**
    * <p>是否有印章。false为没有，true为有。</p>
    */
    @SerializedName("Seal")
    @Expose
    private Boolean Seal;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>编号</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>登记机关</p>
    */
    @SerializedName("RegistrationAuthority")
    @Expose
    private String RegistrationAuthority;

    /**
    * <p>是否是电子营业执照。false为没有，true为有。</p>
    */
    @SerializedName("Electronic")
    @Expose
    private Boolean Electronic;

    /**
    * <p>非营业执照的营业类证件识别结果，将以结构化形式呈现。</p>
    */
    @SerializedName("BusinessCertificate")
    @Expose
    private BusinessCertificateInfo [] BusinessCertificate;

    /**
    * <p>重要提示字段</p>
    */
    @SerializedName("Important")
    @Expose
    private String Important;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>统一社会信用代码（三合一之前为注册号）</p> 
     * @return RegNum <p>统一社会信用代码（三合一之前为注册号）</p>
     */
    public String getRegNum() {
        return this.RegNum;
    }

    /**
     * Set <p>统一社会信用代码（三合一之前为注册号）</p>
     * @param RegNum <p>统一社会信用代码（三合一之前为注册号）</p>
     */
    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }

    /**
     * Get <p>公司名称</p> 
     * @return Name <p>公司名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>公司名称</p>
     * @param Name <p>公司名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>注册资本</p> 
     * @return Capital <p>注册资本</p>
     */
    public String getCapital() {
        return this.Capital;
    }

    /**
     * Set <p>注册资本</p>
     * @param Capital <p>注册资本</p>
     */
    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    /**
     * Get <p>法定代表人</p> 
     * @return Person <p>法定代表人</p>
     */
    public String getPerson() {
        return this.Person;
    }

    /**
     * Set <p>法定代表人</p>
     * @param Person <p>法定代表人</p>
     */
    public void setPerson(String Person) {
        this.Person = Person;
    }

    /**
     * Get <p>地址</p> 
     * @return Address <p>地址</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址</p>
     * @param Address <p>地址</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>经营范围</p> 
     * @return Business <p>经营范围</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>经营范围</p>
     * @param Business <p>经营范围</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>主体类型</p> 
     * @return Type <p>主体类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>主体类型</p>
     * @param Type <p>主体类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>营业期限</p> 
     * @return Period <p>营业期限</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>营业期限</p>
     * @param Period <p>营业期限</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>组成形式</p> 
     * @return ComposingForm <p>组成形式</p>
     */
    public String getComposingForm() {
        return this.ComposingForm;
    }

    /**
     * Set <p>组成形式</p>
     * @param ComposingForm <p>组成形式</p>
     */
    public void setComposingForm(String ComposingForm) {
        this.ComposingForm = ComposingForm;
    }

    /**
     * Get <p>成立日期</p> 
     * @return SetDate <p>成立日期</p>
     */
    public String getSetDate() {
        return this.SetDate;
    }

    /**
     * Set <p>成立日期</p>
     * @param SetDate <p>成立日期</p>
     */
    public void setSetDate(String SetDate) {
        this.SetDate = SetDate;
    }

    /**
     * Get <p>Code 告警码列表和释义：<br>-9102 黑白复印件告警<br>-9104 翻拍件告警<br>-9108 经营范围识别异常告警（由于文字过小、模糊、反光、遮挡或明显倾斜等情况导致未能正常识别）</p> 
     * @return RecognizeWarnCode <p>Code 告警码列表和释义：<br>-9102 黑白复印件告警<br>-9104 翻拍件告警<br>-9108 经营范围识别异常告警（由于文字过小、模糊、反光、遮挡或明显倾斜等情况导致未能正常识别）</p>
     */
    public Long [] getRecognizeWarnCode() {
        return this.RecognizeWarnCode;
    }

    /**
     * Set <p>Code 告警码列表和释义：<br>-9102 黑白复印件告警<br>-9104 翻拍件告警<br>-9108 经营范围识别异常告警（由于文字过小、模糊、反光、遮挡或明显倾斜等情况导致未能正常识别）</p>
     * @param RecognizeWarnCode <p>Code 告警码列表和释义：<br>-9102 黑白复印件告警<br>-9104 翻拍件告警<br>-9108 经营范围识别异常告警（由于文字过小、模糊、反光、遮挡或明显倾斜等情况导致未能正常识别）</p>
     */
    public void setRecognizeWarnCode(Long [] RecognizeWarnCode) {
        this.RecognizeWarnCode = RecognizeWarnCode;
    }

    /**
     * Get <p>告警码说明：<br>WARN_COPY_CARD 黑白复印件告警<br>WARN_RESHOOT_CARD翻拍件告警<br>WARN_EARLY_STOP 经营范围识别异常告警</p> 
     * @return RecognizeWarnMsg <p>告警码说明：<br>WARN_COPY_CARD 黑白复印件告警<br>WARN_RESHOOT_CARD翻拍件告警<br>WARN_EARLY_STOP 经营范围识别异常告警</p>
     */
    public String [] getRecognizeWarnMsg() {
        return this.RecognizeWarnMsg;
    }

    /**
     * Set <p>告警码说明：<br>WARN_COPY_CARD 黑白复印件告警<br>WARN_RESHOOT_CARD翻拍件告警<br>WARN_EARLY_STOP 经营范围识别异常告警</p>
     * @param RecognizeWarnMsg <p>告警码说明：<br>WARN_COPY_CARD 黑白复印件告警<br>WARN_RESHOOT_CARD翻拍件告警<br>WARN_EARLY_STOP 经营范围识别异常告警</p>
     */
    public void setRecognizeWarnMsg(String [] RecognizeWarnMsg) {
        this.RecognizeWarnMsg = RecognizeWarnMsg;
    }

    /**
     * Get <p>是否为副本。1为是，-1为不是。</p> 
     * @return IsDuplication <p>是否为副本。1为是，-1为不是。</p>
     */
    public Long getIsDuplication() {
        return this.IsDuplication;
    }

    /**
     * Set <p>是否为副本。1为是，-1为不是。</p>
     * @param IsDuplication <p>是否为副本。1为是，-1为不是。</p>
     */
    public void setIsDuplication(Long IsDuplication) {
        this.IsDuplication = IsDuplication;
    }

    /**
     * Get <p>登记日期</p> 
     * @return RegistrationDate <p>登记日期</p>
     */
    public String getRegistrationDate() {
        return this.RegistrationDate;
    }

    /**
     * Set <p>登记日期</p>
     * @param RegistrationDate <p>登记日期</p>
     */
    public void setRegistrationDate(String RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }

    /**
     * Get <p>图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度</p> 
     * @return Angle <p>图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度</p>
     * @param Angle <p>图片旋转角度(角度制)，文本的水平方向为0度；顺时针为正，角度范围是0-360度</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>是否有国徽。false为没有，true为有。</p> 
     * @return NationalEmblem <p>是否有国徽。false为没有，true为有。</p>
     */
    public Boolean getNationalEmblem() {
        return this.NationalEmblem;
    }

    /**
     * Set <p>是否有国徽。false为没有，true为有。</p>
     * @param NationalEmblem <p>是否有国徽。false为没有，true为有。</p>
     */
    public void setNationalEmblem(Boolean NationalEmblem) {
        this.NationalEmblem = NationalEmblem;
    }

    /**
     * Get <p>是否有二维码。false为没有，true为有。</p> 
     * @return QRCode <p>是否有二维码。false为没有，true为有。</p>
     */
    public Boolean getQRCode() {
        return this.QRCode;
    }

    /**
     * Set <p>是否有二维码。false为没有，true为有。</p>
     * @param QRCode <p>是否有二维码。false为没有，true为有。</p>
     */
    public void setQRCode(Boolean QRCode) {
        this.QRCode = QRCode;
    }

    /**
     * Get <p>是否有印章。false为没有，true为有。</p> 
     * @return Seal <p>是否有印章。false为没有，true为有。</p>
     */
    public Boolean getSeal() {
        return this.Seal;
    }

    /**
     * Set <p>是否有印章。false为没有，true为有。</p>
     * @param Seal <p>是否有印章。false为没有，true为有。</p>
     */
    public void setSeal(Boolean Seal) {
        this.Seal = Seal;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>编号</p> 
     * @return SerialNumber <p>编号</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>编号</p>
     * @param SerialNumber <p>编号</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>登记机关</p> 
     * @return RegistrationAuthority <p>登记机关</p>
     */
    public String getRegistrationAuthority() {
        return this.RegistrationAuthority;
    }

    /**
     * Set <p>登记机关</p>
     * @param RegistrationAuthority <p>登记机关</p>
     */
    public void setRegistrationAuthority(String RegistrationAuthority) {
        this.RegistrationAuthority = RegistrationAuthority;
    }

    /**
     * Get <p>是否是电子营业执照。false为没有，true为有。</p> 
     * @return Electronic <p>是否是电子营业执照。false为没有，true为有。</p>
     */
    public Boolean getElectronic() {
        return this.Electronic;
    }

    /**
     * Set <p>是否是电子营业执照。false为没有，true为有。</p>
     * @param Electronic <p>是否是电子营业执照。false为没有，true为有。</p>
     */
    public void setElectronic(Boolean Electronic) {
        this.Electronic = Electronic;
    }

    /**
     * Get <p>非营业执照的营业类证件识别结果，将以结构化形式呈现。</p> 
     * @return BusinessCertificate <p>非营业执照的营业类证件识别结果，将以结构化形式呈现。</p>
     */
    public BusinessCertificateInfo [] getBusinessCertificate() {
        return this.BusinessCertificate;
    }

    /**
     * Set <p>非营业执照的营业类证件识别结果，将以结构化形式呈现。</p>
     * @param BusinessCertificate <p>非营业执照的营业类证件识别结果，将以结构化形式呈现。</p>
     */
    public void setBusinessCertificate(BusinessCertificateInfo [] BusinessCertificate) {
        this.BusinessCertificate = BusinessCertificate;
    }

    /**
     * Get <p>重要提示字段</p> 
     * @return Important <p>重要提示字段</p>
     */
    public String getImportant() {
        return this.Important;
    }

    /**
     * Set <p>重要提示字段</p>
     * @param Important <p>重要提示字段</p>
     */
    public void setImportant(String Important) {
        this.Important = Important;
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
        if (source.BusinessCertificate != null) {
            this.BusinessCertificate = new BusinessCertificateInfo[source.BusinessCertificate.length];
            for (int i = 0; i < source.BusinessCertificate.length; i++) {
                this.BusinessCertificate[i] = new BusinessCertificateInfo(source.BusinessCertificate[i]);
            }
        }
        if (source.Important != null) {
            this.Important = new String(source.Important);
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
        this.setParamArrayObj(map, prefix + "BusinessCertificate.", this.BusinessCertificate);
        this.setParamSimple(map, prefix + "Important", this.Important);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

