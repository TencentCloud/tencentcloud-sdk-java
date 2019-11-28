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

public class MinorsVerificationRequest  extends AbstractModel{

    /**
    * 参与校验的参数类型。
0：使用手机号进行校验；
1：使用姓名与身份证号进行校验。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 手机号。11位数字。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 身份证号码。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * 获取参与校验的参数类型。
0：使用手机号进行校验；
1：使用姓名与身份证号进行校验。
     * @return Type 参与校验的参数类型。
0：使用手机号进行校验；
1：使用姓名与身份证号进行校验。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置参与校验的参数类型。
0：使用手机号进行校验；
1：使用姓名与身份证号进行校验。
     * @param Type 参与校验的参数类型。
0：使用手机号进行校验；
1：使用姓名与身份证号进行校验。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取手机号。11位数字。
     * @return Mobile 手机号。11位数字。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * 设置手机号。11位数字。
     * @param Mobile 手机号。11位数字。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * 获取身份证号码。
     * @return IdCard 身份证号码。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * 设置身份证号码。
     * @param IdCard 身份证号码。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * 获取姓名。
     * @return Name 姓名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名。
     * @param Name 姓名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

