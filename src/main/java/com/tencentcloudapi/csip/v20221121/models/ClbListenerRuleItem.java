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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListenerRuleItem extends AbstractModel {

    /**
    * <p>监听器ID</p>
    */
    @SerializedName("ListenerID")
    @Expose
    private String ListenerID;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("LocationID")
    @Expose
    private String LocationID;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>URL</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>监听器ID</p> 
     * @return ListenerID <p>监听器ID</p>
     */
    public String getListenerID() {
        return this.ListenerID;
    }

    /**
     * Set <p>监听器ID</p>
     * @param ListenerID <p>监听器ID</p>
     */
    public void setListenerID(String ListenerID) {
        this.ListenerID = ListenerID;
    }

    /**
     * Get <p>规则ID</p> 
     * @return LocationID <p>规则ID</p>
     */
    public String getLocationID() {
        return this.LocationID;
    }

    /**
     * Set <p>规则ID</p>
     * @param LocationID <p>规则ID</p>
     */
    public void setLocationID(String LocationID) {
        this.LocationID = LocationID;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>URL</p> 
     * @return Url <p>URL</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>URL</p>
     * @param Url <p>URL</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ClbListenerRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerRuleItem(ClbListenerRuleItem source) {
        if (source.ListenerID != null) {
            this.ListenerID = new String(source.ListenerID);
        }
        if (source.LocationID != null) {
            this.LocationID = new String(source.LocationID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerID", this.ListenerID);
        this.setParamSimple(map, prefix + "LocationID", this.LocationID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

