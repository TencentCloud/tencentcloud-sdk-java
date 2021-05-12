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

public class HmtResidentPermitOCRResponse extends AbstractModel{

    /**
    * 证件姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生日期
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 身份证号
    */
    @SerializedName("IdCardNo")
    @Expose
    private String IdCardNo;

    /**
    * 0-正面
1-反面
    */
    @SerializedName("CardType")
    @Expose
    private Long CardType;

    /**
    * 证件有效期限
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 签发机关
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * 签发次数
    */
    @SerializedName("VisaNum")
    @Expose
    private String VisaNum;

    /**
    * 通行证号码
    */
    @SerializedName("PassNo")
    @Expose
    private String PassNo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证件姓名 
     * @return Name 证件姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 证件姓名
     * @param Name 证件姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 出生日期 
     * @return Birth 出生日期
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期
     * @param Birth 出生日期
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
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
     * Get 身份证号 
     * @return IdCardNo 身份证号
     */
    public String getIdCardNo() {
        return this.IdCardNo;
    }

    /**
     * Set 身份证号
     * @param IdCardNo 身份证号
     */
    public void setIdCardNo(String IdCardNo) {
        this.IdCardNo = IdCardNo;
    }

    /**
     * Get 0-正面
1-反面 
     * @return CardType 0-正面
1-反面
     */
    public Long getCardType() {
        return this.CardType;
    }

    /**
     * Set 0-正面
1-反面
     * @param CardType 0-正面
1-反面
     */
    public void setCardType(Long CardType) {
        this.CardType = CardType;
    }

    /**
     * Get 证件有效期限 
     * @return ValidDate 证件有效期限
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 证件有效期限
     * @param ValidDate 证件有效期限
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 签发机关 
     * @return Authority 签发机关
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set 签发机关
     * @param Authority 签发机关
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get 签发次数 
     * @return VisaNum 签发次数
     */
    public String getVisaNum() {
        return this.VisaNum;
    }

    /**
     * Set 签发次数
     * @param VisaNum 签发次数
     */
    public void setVisaNum(String VisaNum) {
        this.VisaNum = VisaNum;
    }

    /**
     * Get 通行证号码 
     * @return PassNo 通行证号码
     */
    public String getPassNo() {
        return this.PassNo;
    }

    /**
     * Set 通行证号码
     * @param PassNo 通行证号码
     */
    public void setPassNo(String PassNo) {
        this.PassNo = PassNo;
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

    public HmtResidentPermitOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HmtResidentPermitOCRResponse(HmtResidentPermitOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdCardNo != null) {
            this.IdCardNo = new String(source.IdCardNo);
        }
        if (source.CardType != null) {
            this.CardType = new Long(source.CardType);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.VisaNum != null) {
            this.VisaNum = new String(source.VisaNum);
        }
        if (source.PassNo != null) {
            this.PassNo = new String(source.PassNo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdCardNo", this.IdCardNo);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "VisaNum", this.VisaNum);
        this.setParamSimple(map, prefix + "PassNo", this.PassNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

