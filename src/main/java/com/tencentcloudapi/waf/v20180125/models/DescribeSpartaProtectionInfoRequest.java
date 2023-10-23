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

public class DescribeSpartaProtectionInfoRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 版本
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 实例
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

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
     * Get 版本 
     * @return Edition 版本
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本
     * @param Edition 版本
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 实例 
     * @return InstanceID 实例
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例
     * @param InstanceID 实例
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DescribeSpartaProtectionInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpartaProtectionInfoRequest(DescribeSpartaProtectionInfoRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

