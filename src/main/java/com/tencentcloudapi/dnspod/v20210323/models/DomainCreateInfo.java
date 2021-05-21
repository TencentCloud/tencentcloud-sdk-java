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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCreateInfo extends AbstractModel{

    /**
    * 域名ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名的punycode
    */
    @SerializedName("Punycode")
    @Expose
    private String Punycode;

    /**
    * 域名的NS列表
    */
    @SerializedName("GradeNsList")
    @Expose
    private String [] GradeNsList;

    /**
     * Get 域名ID 
     * @return Id 域名ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 域名ID
     * @param Id 域名ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get 域名的punycode 
     * @return Punycode 域名的punycode
     */
    public String getPunycode() {
        return this.Punycode;
    }

    /**
     * Set 域名的punycode
     * @param Punycode 域名的punycode
     */
    public void setPunycode(String Punycode) {
        this.Punycode = Punycode;
    }

    /**
     * Get 域名的NS列表 
     * @return GradeNsList 域名的NS列表
     */
    public String [] getGradeNsList() {
        return this.GradeNsList;
    }

    /**
     * Set 域名的NS列表
     * @param GradeNsList 域名的NS列表
     */
    public void setGradeNsList(String [] GradeNsList) {
        this.GradeNsList = GradeNsList;
    }

    public DomainCreateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCreateInfo(DomainCreateInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Punycode != null) {
            this.Punycode = new String(source.Punycode);
        }
        if (source.GradeNsList != null) {
            this.GradeNsList = new String[source.GradeNsList.length];
            for (int i = 0; i < source.GradeNsList.length; i++) {
                this.GradeNsList[i] = new String(source.GradeNsList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Punycode", this.Punycode);
        this.setParamArraySimple(map, prefix + "GradeNsList.", this.GradeNsList);

    }
}

