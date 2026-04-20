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

public class HmtResidentPermitOCRResponse extends AbstractModel {

    /**
    * <p>证件姓名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>性别</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>出生日期</p>
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * <p>地址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>身份证号</p>
    */
    @SerializedName("IdCardNo")
    @Expose
    private String IdCardNo;

    /**
    * <p>0-正面<br>1-反面</p>
    */
    @SerializedName("CardType")
    @Expose
    private Long CardType;

    /**
    * <p>证件有效期限</p>
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * <p>签发机关</p>
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * <p>签发次数</p>
    */
    @SerializedName("VisaNum")
    @Expose
    private String VisaNum;

    /**
    * <p>通行证号码</p>
    */
    @SerializedName("PassNo")
    @Expose
    private String PassNo;

    /**
    * <p>头像和坐标信息</p>
    */
    @SerializedName("PortraitImageInfo")
    @Expose
    private PortraitImageInfo PortraitImageInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>证件姓名</p> 
     * @return Name <p>证件姓名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>证件姓名</p>
     * @param Name <p>证件姓名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>性别</p> 
     * @return Sex <p>性别</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别</p>
     * @param Sex <p>性别</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>出生日期</p> 
     * @return Birth <p>出生日期</p>
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set <p>出生日期</p>
     * @param Birth <p>出生日期</p>
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
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
     * Get <p>身份证号</p> 
     * @return IdCardNo <p>身份证号</p>
     */
    public String getIdCardNo() {
        return this.IdCardNo;
    }

    /**
     * Set <p>身份证号</p>
     * @param IdCardNo <p>身份证号</p>
     */
    public void setIdCardNo(String IdCardNo) {
        this.IdCardNo = IdCardNo;
    }

    /**
     * Get <p>0-正面<br>1-反面</p> 
     * @return CardType <p>0-正面<br>1-反面</p>
     */
    public Long getCardType() {
        return this.CardType;
    }

    /**
     * Set <p>0-正面<br>1-反面</p>
     * @param CardType <p>0-正面<br>1-反面</p>
     */
    public void setCardType(Long CardType) {
        this.CardType = CardType;
    }

    /**
     * Get <p>证件有效期限</p> 
     * @return ValidDate <p>证件有效期限</p>
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set <p>证件有效期限</p>
     * @param ValidDate <p>证件有效期限</p>
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get <p>签发机关</p> 
     * @return Authority <p>签发机关</p>
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set <p>签发机关</p>
     * @param Authority <p>签发机关</p>
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get <p>签发次数</p> 
     * @return VisaNum <p>签发次数</p>
     */
    public String getVisaNum() {
        return this.VisaNum;
    }

    /**
     * Set <p>签发次数</p>
     * @param VisaNum <p>签发次数</p>
     */
    public void setVisaNum(String VisaNum) {
        this.VisaNum = VisaNum;
    }

    /**
     * Get <p>通行证号码</p> 
     * @return PassNo <p>通行证号码</p>
     */
    public String getPassNo() {
        return this.PassNo;
    }

    /**
     * Set <p>通行证号码</p>
     * @param PassNo <p>通行证号码</p>
     */
    public void setPassNo(String PassNo) {
        this.PassNo = PassNo;
    }

    /**
     * Get <p>头像和坐标信息</p> 
     * @return PortraitImageInfo <p>头像和坐标信息</p>
     */
    public PortraitImageInfo getPortraitImageInfo() {
        return this.PortraitImageInfo;
    }

    /**
     * Set <p>头像和坐标信息</p>
     * @param PortraitImageInfo <p>头像和坐标信息</p>
     */
    public void setPortraitImageInfo(PortraitImageInfo PortraitImageInfo) {
        this.PortraitImageInfo = PortraitImageInfo;
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
        if (source.PortraitImageInfo != null) {
            this.PortraitImageInfo = new PortraitImageInfo(source.PortraitImageInfo);
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
        this.setParamObj(map, prefix + "PortraitImageInfo.", this.PortraitImageInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

