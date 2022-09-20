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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AscriptionInfo extends AbstractModel{

    /**
    * 主机记录。
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * 记录类型。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录值。
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
     * Get 主机记录。 
     * @return Subdomain 主机记录。
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 主机记录。
     * @param Subdomain 主机记录。
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get 记录类型。 
     * @return RecordType 记录类型。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型。
     * @param RecordType 记录类型。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录值。 
     * @return RecordValue 记录值。
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set 记录值。
     * @param RecordValue 记录值。
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    public AscriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AscriptionInfo(AscriptionInfo source) {
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);

    }
}

