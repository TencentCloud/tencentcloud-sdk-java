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

public class IDCardInfoResult extends AbstractModel {

    /**
    * 警告代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnCodes")
    @Expose
    private Long [] WarnCodes;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 签发机关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * 出生日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * 身份证号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 请求的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 原图地址
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 警告代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnCodes 警告代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWarnCodes() {
        return this.WarnCodes;
    }

    /**
     * Set 警告代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnCodes 警告代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnCodes(Long [] WarnCodes) {
        this.WarnCodes = WarnCodes;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 签发机关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authority 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authority 签发机关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get 出生日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birth 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birth 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get 身份证号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdNum 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdNum 身份证号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidDate 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidDate 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 请求的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId 请求的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId 请求的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 原图地址 
     * @return ImageUrl 原图地址
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 原图地址
     * @param ImageUrl 原图地址
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public IDCardInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardInfoResult(IDCardInfoResult source) {
        if (source.WarnCodes != null) {
            this.WarnCodes = new Long[source.WarnCodes.length];
            for (int i = 0; i < source.WarnCodes.length; i++) {
                this.WarnCodes[i] = new Long(source.WarnCodes[i]);
            }
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WarnCodes.", this.WarnCodes);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

