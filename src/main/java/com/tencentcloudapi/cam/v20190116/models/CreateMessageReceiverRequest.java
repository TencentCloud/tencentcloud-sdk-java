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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMessageReceiverRequest extends AbstractModel {

    /**
    * <p>消息接收人的用户名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>手机号国际区号，国内为86</p>
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * <p>邮箱，例如：57<strong>*</strong>@qq.com</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>手机号码, 例如：132****2492</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>消息接收人的备注，选填</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>消息接收人的用户名</p> 
     * @return Name <p>消息接收人的用户名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消息接收人的用户名</p>
     * @param Name <p>消息接收人的用户名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>手机号国际区号，国内为86</p> 
     * @return CountryCode <p>手机号国际区号，国内为86</p>
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set <p>手机号国际区号，国内为86</p>
     * @param CountryCode <p>手机号国际区号，国内为86</p>
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get <p>邮箱，例如：57<strong>*</strong>@qq.com</p> 
     * @return Email <p>邮箱，例如：57<strong>*</strong>@qq.com</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱，例如：57<strong>*</strong>@qq.com</p>
     * @param Email <p>邮箱，例如：57<strong>*</strong>@qq.com</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>手机号码, 例如：132****2492</p> 
     * @return PhoneNumber <p>手机号码, 例如：132****2492</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>手机号码, 例如：132****2492</p>
     * @param PhoneNumber <p>手机号码, 例如：132****2492</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>消息接收人的备注，选填</p> 
     * @return Remark <p>消息接收人的备注，选填</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>消息接收人的备注，选填</p>
     * @param Remark <p>消息接收人的备注，选填</p>
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
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
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
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

