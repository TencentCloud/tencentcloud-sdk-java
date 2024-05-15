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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewAlertKey extends AbstractModel {

    /**
    * 需要更改的用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 告警类别
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警子类别
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 告警来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 告警名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 需要更改的用户appid 
     * @return AppId 需要更改的用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 需要更改的用户appid
     * @param AppId 需要更改的用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 告警类别 
     * @return Type 告警类别
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警类别
     * @param Type 告警类别
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警子类别 
     * @return SubType 告警子类别
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 告警子类别
     * @param SubType 告警子类别
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 告警来源 
     * @return Source 告警来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 告警来源
     * @param Source 告警来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 告警名称 
     * @return Name 告警名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警名称
     * @param Name 告警名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 告警key 
     * @return Key 告警key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 告警key
     * @param Key 告警key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 时间 
     * @return Date 时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 时间
     * @param Date 时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public NewAlertKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewAlertKey(NewAlertKey source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

