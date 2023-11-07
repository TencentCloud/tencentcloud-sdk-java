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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostModeRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 防护状态：
10：规则观察&&AI关闭模式，11：规则观察&&AI观察模式，12：规则观察&&AI拦截模式
20：规则拦截&&AI关闭模式，21：规则拦截&&AI观察模式，22：规则拦截&&AI拦截模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 0:修改防护模式，1:修改AI
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 实例类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

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
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 防护状态：
10：规则观察&&AI关闭模式，11：规则观察&&AI观察模式，12：规则观察&&AI拦截模式
20：规则拦截&&AI关闭模式，21：规则拦截&&AI观察模式，22：规则拦截&&AI拦截模式 
     * @return Mode 防护状态：
10：规则观察&&AI关闭模式，11：规则观察&&AI观察模式，12：规则观察&&AI拦截模式
20：规则拦截&&AI关闭模式，21：规则拦截&&AI观察模式，22：规则拦截&&AI拦截模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 防护状态：
10：规则观察&&AI关闭模式，11：规则观察&&AI观察模式，12：规则观察&&AI拦截模式
20：规则拦截&&AI关闭模式，21：规则拦截&&AI观察模式，22：规则拦截&&AI拦截模式
     * @param Mode 防护状态：
10：规则观察&&AI关闭模式，11：规则观察&&AI观察模式，12：规则观察&&AI拦截模式
20：规则拦截&&AI关闭模式，21：规则拦截&&AI观察模式，22：规则拦截&&AI拦截模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 0:修改防护模式，1:修改AI 
     * @return Type 0:修改防护模式，1:修改AI
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0:修改防护模式，1:修改AI
     * @param Type 0:修改防护模式，1:修改AI
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 实例类型 
     * @return Edition 实例类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 实例类型
     * @param Edition 实例类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public ModifyHostModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostModeRequest(ModifyHostModeRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Edition", this.Edition);

    }
}

