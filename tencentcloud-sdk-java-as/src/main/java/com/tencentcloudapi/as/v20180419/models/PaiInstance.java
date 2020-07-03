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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaiInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * PAI管理页面URL
    */
    @SerializedName("PaiMateUrl")
    @Expose
    private String PaiMateUrl;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例域名 
     * @return DomainName 实例域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 实例域名
     * @param DomainName 实例域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get PAI管理页面URL 
     * @return PaiMateUrl PAI管理页面URL
     */
    public String getPaiMateUrl() {
        return this.PaiMateUrl;
    }

    /**
     * Set PAI管理页面URL
     * @param PaiMateUrl PAI管理页面URL
     */
    public void setPaiMateUrl(String PaiMateUrl) {
        this.PaiMateUrl = PaiMateUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "PaiMateUrl", this.PaiMateUrl);

    }
}

