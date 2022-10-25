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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankProfitSharePayeeInfo extends AbstractModel{

    /**
    * 收款人账户名称
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 银行名称
可大体识别银行就行
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 账户货币
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
    */
    @SerializedName("Nature")
    @Expose
    private String Nature;

    /**
    * 账户地区/受益人所在国家。参考附录“国家代码”表——“代码”字段
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 账户开户所在国家
参考附录“国家代码”表——“代码”字段
    */
    @SerializedName("DepositCountry")
    @Expose
    private String DepositCountry;

    /**
    * 合作有效期
yyyy-MM-dd
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 0:个人(对私) 1:公司(对公)
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 开户行地址
账户地区非中国必填，【账户名+开户行地址不可超过114个字符（只允许【英文字母数字空格.,/-()'】），否则可能导致境外银行付款失败】
    */
    @SerializedName("BankAddress")
    @Expose
    private String BankAddress;

    /**
    * 客户地址
非中国内地账户的客户地址不能为空
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 账户属性
账户开户所在国家为中国则必填。
1-离岸账户 0-在岸账户
    */
    @SerializedName("IsOSA")
    @Expose
    private String IsOSA;

    /**
    * 账户省份
参考附录“地区代码”
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 账户城市
参考附录“地区代码
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 证件号/统一信用证代码
如果country与depositcountry字段都是CHN时，必填
对公账户填统一信用证代码，对私账户填身份证号码
离岸账户非必填
    */
    @SerializedName("LegalIdNo")
    @Expose
    private String LegalIdNo;

    /**
    * 手机号。
账户地区是日本则必填
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 参考接口说明。
    */
    @SerializedName("BicCode")
    @Expose
    private String BicCode;

    /**
    * 参考接口说明。
    */
    @SerializedName("SwiftCode")
    @Expose
    private String SwiftCode;

    /**
    * 大额支付行号/支付行号
参考接口说明。境外（大额支付行号）参考附录【大额行号】，境内（支付行号）参考附录【支付行号】
    */
    @SerializedName("Cnaps")
    @Expose
    private String Cnaps;

    /**
    * 中转行号，参考接口说明。
    */
    @SerializedName("TransferBankNo")
    @Expose
    private String TransferBankNo;

    /**
    * 关联附件。上传的文件ID
    */
    @SerializedName("Fid")
    @Expose
    private String Fid;

    /**
     * Get 收款人账户名称 
     * @return AccountName 收款人账户名称
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 收款人账户名称
     * @param AccountName 收款人账户名称
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 银行名称
可大体识别银行就行 
     * @return BankName 银行名称
可大体识别银行就行
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 银行名称
可大体识别银行就行
     * @param BankName 银行名称
可大体识别银行就行
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 账户货币 
     * @return Currency 账户货币
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 账户货币
     * @param Currency 账户货币
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡 
     * @return Nature 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
     */
    public String getNature() {
        return this.Nature;
    }

    /**
     * Set 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
     * @param Nature 账户类型。
00:借记卡
01:存折 
02:信用卡 
03:准贷记卡 
04:预付卡费 
05:境外卡
     */
    public void setNature(String Nature) {
        this.Nature = Nature;
    }

    /**
     * Get 账户地区/受益人所在国家。参考附录“国家代码”表——“代码”字段 
     * @return Country 账户地区/受益人所在国家。参考附录“国家代码”表——“代码”字段
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 账户地区/受益人所在国家。参考附录“国家代码”表——“代码”字段
     * @param Country 账户地区/受益人所在国家。参考附录“国家代码”表——“代码”字段
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 账户开户所在国家
参考附录“国家代码”表——“代码”字段 
     * @return DepositCountry 账户开户所在国家
参考附录“国家代码”表——“代码”字段
     */
    public String getDepositCountry() {
        return this.DepositCountry;
    }

    /**
     * Set 账户开户所在国家
参考附录“国家代码”表——“代码”字段
     * @param DepositCountry 账户开户所在国家
参考附录“国家代码”表——“代码”字段
     */
    public void setDepositCountry(String DepositCountry) {
        this.DepositCountry = DepositCountry;
    }

    /**
     * Get 合作有效期
yyyy-MM-dd 
     * @return ExpireDate 合作有效期
yyyy-MM-dd
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 合作有效期
yyyy-MM-dd
     * @param ExpireDate 合作有效期
yyyy-MM-dd
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 0:个人(对私) 1:公司(对公) 
     * @return Flag 0:个人(对私) 1:公司(对公)
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 0:个人(对私) 1:公司(对公)
     * @param Flag 0:个人(对私) 1:公司(对公)
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 开户行地址
账户地区非中国必填，【账户名+开户行地址不可超过114个字符（只允许【英文字母数字空格.,/-()'】），否则可能导致境外银行付款失败】 
     * @return BankAddress 开户行地址
账户地区非中国必填，【账户名+开户行地址不可超过114个字符（只允许【英文字母数字空格.,/-()'】），否则可能导致境外银行付款失败】
     */
    public String getBankAddress() {
        return this.BankAddress;
    }

    /**
     * Set 开户行地址
账户地区非中国必填，【账户名+开户行地址不可超过114个字符（只允许【英文字母数字空格.,/-()'】），否则可能导致境外银行付款失败】
     * @param BankAddress 开户行地址
账户地区非中国必填，【账户名+开户行地址不可超过114个字符（只允许【英文字母数字空格.,/-()'】），否则可能导致境外银行付款失败】
     */
    public void setBankAddress(String BankAddress) {
        this.BankAddress = BankAddress;
    }

    /**
     * Get 客户地址
非中国内地账户的客户地址不能为空 
     * @return Address 客户地址
非中国内地账户的客户地址不能为空
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 客户地址
非中国内地账户的客户地址不能为空
     * @param Address 客户地址
非中国内地账户的客户地址不能为空
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 账户属性
账户开户所在国家为中国则必填。
1-离岸账户 0-在岸账户 
     * @return IsOSA 账户属性
账户开户所在国家为中国则必填。
1-离岸账户 0-在岸账户
     */
    public String getIsOSA() {
        return this.IsOSA;
    }

    /**
     * Set 账户属性
账户开户所在国家为中国则必填。
1-离岸账户 0-在岸账户
     * @param IsOSA 账户属性
账户开户所在国家为中国则必填。
1-离岸账户 0-在岸账户
     */
    public void setIsOSA(String IsOSA) {
        this.IsOSA = IsOSA;
    }

    /**
     * Get 账户省份
参考附录“地区代码” 
     * @return Province 账户省份
参考附录“地区代码”
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 账户省份
参考附录“地区代码”
     * @param Province 账户省份
参考附录“地区代码”
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 账户城市
参考附录“地区代码 
     * @return City 账户城市
参考附录“地区代码
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 账户城市
参考附录“地区代码
     * @param City 账户城市
参考附录“地区代码
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 证件号/统一信用证代码
如果country与depositcountry字段都是CHN时，必填
对公账户填统一信用证代码，对私账户填身份证号码
离岸账户非必填 
     * @return LegalIdNo 证件号/统一信用证代码
如果country与depositcountry字段都是CHN时，必填
对公账户填统一信用证代码，对私账户填身份证号码
离岸账户非必填
     */
    public String getLegalIdNo() {
        return this.LegalIdNo;
    }

    /**
     * Set 证件号/统一信用证代码
如果country与depositcountry字段都是CHN时，必填
对公账户填统一信用证代码，对私账户填身份证号码
离岸账户非必填
     * @param LegalIdNo 证件号/统一信用证代码
如果country与depositcountry字段都是CHN时，必填
对公账户填统一信用证代码，对私账户填身份证号码
离岸账户非必填
     */
    public void setLegalIdNo(String LegalIdNo) {
        this.LegalIdNo = LegalIdNo;
    }

    /**
     * Get 手机号。
账户地区是日本则必填 
     * @return Telephone 手机号。
账户地区是日本则必填
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 手机号。
账户地区是日本则必填
     * @param Telephone 手机号。
账户地区是日本则必填
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 参考接口说明。 
     * @return BicCode 参考接口说明。
     */
    public String getBicCode() {
        return this.BicCode;
    }

    /**
     * Set 参考接口说明。
     * @param BicCode 参考接口说明。
     */
    public void setBicCode(String BicCode) {
        this.BicCode = BicCode;
    }

    /**
     * Get 参考接口说明。 
     * @return SwiftCode 参考接口说明。
     */
    public String getSwiftCode() {
        return this.SwiftCode;
    }

    /**
     * Set 参考接口说明。
     * @param SwiftCode 参考接口说明。
     */
    public void setSwiftCode(String SwiftCode) {
        this.SwiftCode = SwiftCode;
    }

    /**
     * Get 大额支付行号/支付行号
参考接口说明。境外（大额支付行号）参考附录【大额行号】，境内（支付行号）参考附录【支付行号】 
     * @return Cnaps 大额支付行号/支付行号
参考接口说明。境外（大额支付行号）参考附录【大额行号】，境内（支付行号）参考附录【支付行号】
     */
    public String getCnaps() {
        return this.Cnaps;
    }

    /**
     * Set 大额支付行号/支付行号
参考接口说明。境外（大额支付行号）参考附录【大额行号】，境内（支付行号）参考附录【支付行号】
     * @param Cnaps 大额支付行号/支付行号
参考接口说明。境外（大额支付行号）参考附录【大额行号】，境内（支付行号）参考附录【支付行号】
     */
    public void setCnaps(String Cnaps) {
        this.Cnaps = Cnaps;
    }

    /**
     * Get 中转行号，参考接口说明。 
     * @return TransferBankNo 中转行号，参考接口说明。
     */
    public String getTransferBankNo() {
        return this.TransferBankNo;
    }

    /**
     * Set 中转行号，参考接口说明。
     * @param TransferBankNo 中转行号，参考接口说明。
     */
    public void setTransferBankNo(String TransferBankNo) {
        this.TransferBankNo = TransferBankNo;
    }

    /**
     * Get 关联附件。上传的文件ID 
     * @return Fid 关联附件。上传的文件ID
     */
    public String getFid() {
        return this.Fid;
    }

    /**
     * Set 关联附件。上传的文件ID
     * @param Fid 关联附件。上传的文件ID
     */
    public void setFid(String Fid) {
        this.Fid = Fid;
    }

    public OpenBankProfitSharePayeeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankProfitSharePayeeInfo(OpenBankProfitSharePayeeInfo source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Nature != null) {
            this.Nature = new String(source.Nature);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.DepositCountry != null) {
            this.DepositCountry = new String(source.DepositCountry);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.BankAddress != null) {
            this.BankAddress = new String(source.BankAddress);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IsOSA != null) {
            this.IsOSA = new String(source.IsOSA);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.LegalIdNo != null) {
            this.LegalIdNo = new String(source.LegalIdNo);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.BicCode != null) {
            this.BicCode = new String(source.BicCode);
        }
        if (source.SwiftCode != null) {
            this.SwiftCode = new String(source.SwiftCode);
        }
        if (source.Cnaps != null) {
            this.Cnaps = new String(source.Cnaps);
        }
        if (source.TransferBankNo != null) {
            this.TransferBankNo = new String(source.TransferBankNo);
        }
        if (source.Fid != null) {
            this.Fid = new String(source.Fid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Nature", this.Nature);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "DepositCountry", this.DepositCountry);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "BankAddress", this.BankAddress);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IsOSA", this.IsOSA);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "LegalIdNo", this.LegalIdNo);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "BicCode", this.BicCode);
        this.setParamSimple(map, prefix + "SwiftCode", this.SwiftCode);
        this.setParamSimple(map, prefix + "Cnaps", this.Cnaps);
        this.setParamSimple(map, prefix + "TransferBankNo", this.TransferBankNo);
        this.setParamSimple(map, prefix + "Fid", this.Fid);

    }
}

