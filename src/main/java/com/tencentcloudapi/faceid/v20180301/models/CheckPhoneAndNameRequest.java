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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckPhoneAndNameRequest extends AbstractModel {

    /**
    * <p>⼿机号。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>姓名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>⼿机号。</p> 
     * @return Mobile <p>⼿机号。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>⼿机号。</p>
     * @param Mobile <p>⼿机号。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>姓名。</p> 
     * @return Name <p>姓名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p>
     * @param Name <p>姓名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul> 
     * @return Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     * @param Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、手机号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public CheckPhoneAndNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckPhoneAndNameRequest(CheckPhoneAndNameRequest source) {
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

