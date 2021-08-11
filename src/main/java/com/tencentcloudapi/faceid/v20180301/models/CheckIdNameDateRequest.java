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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIdNameDateRequest extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证号
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 身份证有效期开始时间，格式：YYYYMMDD。如：20210701
    */
    @SerializedName("ValidityBegin")
    @Expose
    private String ValidityBegin;

    /**
    * 身份证有效期到期时间，格式：YYYYMMDD，长期用“00000000”代替；如：20210701
    */
    @SerializedName("ValidityEnd")
    @Expose
    private String ValidityEnd;

    /**
    * 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证号 
     * @return IdCard 身份证号
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份证号
     * @param IdCard 身份证号
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 身份证有效期开始时间，格式：YYYYMMDD。如：20210701 
     * @return ValidityBegin 身份证有效期开始时间，格式：YYYYMMDD。如：20210701
     */
    public String getValidityBegin() {
        return this.ValidityBegin;
    }

    /**
     * Set 身份证有效期开始时间，格式：YYYYMMDD。如：20210701
     * @param ValidityBegin 身份证有效期开始时间，格式：YYYYMMDD。如：20210701
     */
    public void setValidityBegin(String ValidityBegin) {
        this.ValidityBegin = ValidityBegin;
    }

    /**
     * Get 身份证有效期到期时间，格式：YYYYMMDD，长期用“00000000”代替；如：20210701 
     * @return ValidityEnd 身份证有效期到期时间，格式：YYYYMMDD，长期用“00000000”代替；如：20210701
     */
    public String getValidityEnd() {
        return this.ValidityEnd;
    }

    /**
     * Set 身份证有效期到期时间，格式：YYYYMMDD，长期用“00000000”代替；如：20210701
     * @param ValidityEnd 身份证有效期到期时间，格式：YYYYMMDD，长期用“00000000”代替；如：20210701
     */
    public void setValidityEnd(String ValidityEnd) {
        this.ValidityEnd = ValidityEnd;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public CheckIdNameDateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIdNameDateRequest(CheckIdNameDateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.ValidityBegin != null) {
            this.ValidityBegin = new String(source.ValidityBegin);
        }
        if (source.ValidityEnd != null) {
            this.ValidityEnd = new String(source.ValidityEnd);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "ValidityBegin", this.ValidityBegin);
        this.setParamSimple(map, prefix + "ValidityEnd", this.ValidityEnd);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

