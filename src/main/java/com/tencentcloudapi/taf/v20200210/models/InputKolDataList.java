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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputKolDataList extends AbstractModel{

    /**
    * 账号类型[1：微信；2：qq；3：微博]
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * KOL账号ID[比如微信公众号ID]
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * KOL名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 代理商名称
    */
    @SerializedName("AgentInfo")
    @Expose
    private String AgentInfo;

    /**
     * Get 账号类型[1：微信；2：qq；3：微博] 
     * @return Type 账号类型[1：微信；2：qq；3：微博]
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 账号类型[1：微信；2：qq；3：微博]
     * @param Type 账号类型[1：微信；2：qq；3：微博]
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get KOL账号ID[比如微信公众号ID] 
     * @return Id KOL账号ID[比如微信公众号ID]
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set KOL账号ID[比如微信公众号ID]
     * @param Id KOL账号ID[比如微信公众号ID]
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get KOL名称 
     * @return Name KOL名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set KOL名称
     * @param Name KOL名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 手机号 
     * @return Phone 手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
     * @param Phone 手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 代理商名称 
     * @return AgentInfo 代理商名称
     */
    public String getAgentInfo() {
        return this.AgentInfo;
    }

    /**
     * Set 代理商名称
     * @param AgentInfo 代理商名称
     */
    public void setAgentInfo(String AgentInfo) {
        this.AgentInfo = AgentInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "AgentInfo", this.AgentInfo);

    }
}

