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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSAttributes extends AbstractModel{

    /**
    * 记录类型 CNAME | A | TXT | MX
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 域名
    */
    @SerializedName("SendDomain")
    @Expose
    private String SendDomain;

    /**
    * 需要配置的值
    */
    @SerializedName("ExpectedValue")
    @Expose
    private String ExpectedValue;

    /**
    * 腾讯云目前检测到的值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 检测是否通过，创建时默认为false
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get 记录类型 CNAME | A | TXT | MX 
     * @return Type 记录类型 CNAME | A | TXT | MX
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 记录类型 CNAME | A | TXT | MX
     * @param Type 记录类型 CNAME | A | TXT | MX
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 域名 
     * @return SendDomain 域名
     */
    public String getSendDomain() {
        return this.SendDomain;
    }

    /**
     * Set 域名
     * @param SendDomain 域名
     */
    public void setSendDomain(String SendDomain) {
        this.SendDomain = SendDomain;
    }

    /**
     * Get 需要配置的值 
     * @return ExpectedValue 需要配置的值
     */
    public String getExpectedValue() {
        return this.ExpectedValue;
    }

    /**
     * Set 需要配置的值
     * @param ExpectedValue 需要配置的值
     */
    public void setExpectedValue(String ExpectedValue) {
        this.ExpectedValue = ExpectedValue;
    }

    /**
     * Get 腾讯云目前检测到的值 
     * @return CurrentValue 腾讯云目前检测到的值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 腾讯云目前检测到的值
     * @param CurrentValue 腾讯云目前检测到的值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 检测是否通过，创建时默认为false 
     * @return Status 检测是否通过，创建时默认为false
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 检测是否通过，创建时默认为false
     * @param Status 检测是否通过，创建时默认为false
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public DNSAttributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSAttributes(DNSAttributes source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SendDomain != null) {
            this.SendDomain = new String(source.SendDomain);
        }
        if (source.ExpectedValue != null) {
            this.ExpectedValue = new String(source.ExpectedValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SendDomain", this.SendDomain);
        this.setParamSimple(map, prefix + "ExpectedValue", this.ExpectedValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

