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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverUrlInfo extends AbstractModel{

    /**
    * 签署短链接，不支持小程序嵌入，只支持移动端浏览器打开。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 签署人类型 PERSON-个人
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署长链接，支持小程序嵌入。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongUrl")
    @Expose
    private String LongUrl;

    /**
     * Get 签署短链接，不支持小程序嵌入，只支持移动端浏览器打开。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。 
     * @return SignUrl 签署短链接，不支持小程序嵌入，只支持移动端浏览器打开。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 签署短链接，不支持小程序嵌入，只支持移动端浏览器打开。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
     * @param SignUrl 签署短链接，不支持小程序嵌入，只支持移动端浏览器打开。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
    }

    /**
     * Get 签署人类型 PERSON-个人 
     * @return ApproverType 签署人类型 PERSON-个人
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型 PERSON-个人
     * @param ApproverType 签署人类型 PERSON-个人
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署人姓名 
     * @return Name 签署人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名
     * @param Name 签署人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人手机号 
     * @return Mobile 签署人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号
     * @param Mobile 签署人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 签署长链接，支持小程序嵌入。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongUrl 签署长链接，支持小程序嵌入。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongUrl() {
        return this.LongUrl;
    }

    /**
     * Set 签署长链接，支持小程序嵌入。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongUrl 签署长链接，支持小程序嵌入。注意该链接有效期为30分钟，同时需要注意保密，不要外泄给无关用户。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongUrl(String LongUrl) {
        this.LongUrl = LongUrl;
    }

    public FlowApproverUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverUrlInfo(FlowApproverUrlInfo source) {
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.LongUrl != null) {
            this.LongUrl = new String(source.LongUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "LongUrl", this.LongUrl);

    }
}

