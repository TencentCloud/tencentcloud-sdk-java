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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMessageReceiverRequest extends AbstractModel{

    /**
    * 消息接收人的用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号国际区号，国内为86
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 手机号码, 例如：132****2492
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 邮箱，例如：57*****@qq.com
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 消息接收人的备注，选填
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 消息接收人的用户名 
     * @return Name 消息接收人的用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 消息接收人的用户名
     * @param Name 消息接收人的用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号国际区号，国内为86 
     * @return CountryCode 手机号国际区号，国内为86
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 手机号国际区号，国内为86
     * @param CountryCode 手机号国际区号，国内为86
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 手机号码, 例如：132****2492 
     * @return PhoneNumber 手机号码, 例如：132****2492
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码, 例如：132****2492
     * @param PhoneNumber 手机号码, 例如：132****2492
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 邮箱，例如：57*****@qq.com 
     * @return Email 邮箱，例如：57*****@qq.com
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱，例如：57*****@qq.com
     * @param Email 邮箱，例如：57*****@qq.com
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 消息接收人的备注，选填 
     * @return Remark 消息接收人的备注，选填
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 消息接收人的备注，选填
     * @param Remark 消息接收人的备注，选填
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateMessageReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMessageReceiverRequest(CreateMessageReceiverRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

