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

public class GetRealNameAuthTokenRequest extends AbstractModel{

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证号
    */
    @SerializedName("IDCard")
    @Expose
    private String IDCard;

    /**
    * 回调地址。实名认证完成后，将会重定向到这个地址通知认证发起方。仅支持http或https协议。
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

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
     * @return IDCard 身份证号
     */
    public String getIDCard() {
        return this.IDCard;
    }

    /**
     * Set 身份证号
     * @param IDCard 身份证号
     */
    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    /**
     * Get 回调地址。实名认证完成后，将会重定向到这个地址通知认证发起方。仅支持http或https协议。 
     * @return CallbackURL 回调地址。实名认证完成后，将会重定向到这个地址通知认证发起方。仅支持http或https协议。
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 回调地址。实名认证完成后，将会重定向到这个地址通知认证发起方。仅支持http或https协议。
     * @param CallbackURL 回调地址。实名认证完成后，将会重定向到这个地址通知认证发起方。仅支持http或https协议。
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public GetRealNameAuthTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRealNameAuthTokenRequest(GetRealNameAuthTokenRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IDCard != null) {
            this.IDCard = new String(source.IDCard);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IDCard", this.IDCard);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);

    }
}

