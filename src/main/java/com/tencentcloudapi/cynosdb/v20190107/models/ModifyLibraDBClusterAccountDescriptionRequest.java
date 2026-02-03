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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBClusterAccountDescriptionRequest extends AbstractModel {

    /**
    * 分析集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 主机名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 分析集群id 
     * @return ClusterId 分析集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群id
     * @param ClusterId 分析集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 账号名 
     * @return AccountName 账号名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名
     * @param AccountName 账号名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 主机名 
     * @return Host 主机名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机名
     * @param Host 主机名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public ModifyLibraDBClusterAccountDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterAccountDescriptionRequest(ModifyLibraDBClusterAccountDescriptionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

