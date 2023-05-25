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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountDescriptionRequest extends AbstractModel{

    /**
    * 数据库账号名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 数据库账号描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 主机，默认为"%"
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 数据库账号名 
     * @return AccountName 数据库账号名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 数据库账号名
     * @param AccountName 数据库账号名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 数据库账号描述信息 
     * @return Description 数据库账号描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据库账号描述信息
     * @param Description 数据库账号描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 主机，默认为"%" 
     * @return Host 主机，默认为"%"
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机，默认为"%"
     * @param Host 主机，默认为"%"
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public ModifyAccountDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountDescriptionRequest(ModifyAccountDescriptionRequest source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

