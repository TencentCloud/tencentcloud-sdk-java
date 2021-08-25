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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnTopDomainData extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 请求量
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 请求量 
     * @return Value 请求量
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 请求量
     * @param Value 请求量
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 百分比 
     * @return Percent 百分比
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比
     * @param Percent 百分比
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    public ScdnTopDomainData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnTopDomainData(ScdnTopDomainData source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

