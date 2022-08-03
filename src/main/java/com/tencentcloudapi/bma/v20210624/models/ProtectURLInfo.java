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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectURLInfo extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("ProtectURLId")
    @Expose
    private Long ProtectURLId;

    /**
    * xxx
    */
    @SerializedName("ProtectURL")
    @Expose
    private String ProtectURL;

    /**
    * xxx
    */
    @SerializedName("ProtectWeb")
    @Expose
    private String ProtectWeb;

    /**
    * xxx
    */
    @SerializedName("ProtectURLStatus")
    @Expose
    private Long ProtectURLStatus;

    /**
    * xxx
    */
    @SerializedName("ProtectURLNote")
    @Expose
    private String ProtectURLNote;

    /**
    * xxx
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get xxx 
     * @return ProtectURLId xxx
     */
    public Long getProtectURLId() {
        return this.ProtectURLId;
    }

    /**
     * Set xxx
     * @param ProtectURLId xxx
     */
    public void setProtectURLId(Long ProtectURLId) {
        this.ProtectURLId = ProtectURLId;
    }

    /**
     * Get xxx 
     * @return ProtectURL xxx
     */
    public String getProtectURL() {
        return this.ProtectURL;
    }

    /**
     * Set xxx
     * @param ProtectURL xxx
     */
    public void setProtectURL(String ProtectURL) {
        this.ProtectURL = ProtectURL;
    }

    /**
     * Get xxx 
     * @return ProtectWeb xxx
     */
    public String getProtectWeb() {
        return this.ProtectWeb;
    }

    /**
     * Set xxx
     * @param ProtectWeb xxx
     */
    public void setProtectWeb(String ProtectWeb) {
        this.ProtectWeb = ProtectWeb;
    }

    /**
     * Get xxx 
     * @return ProtectURLStatus xxx
     */
    public Long getProtectURLStatus() {
        return this.ProtectURLStatus;
    }

    /**
     * Set xxx
     * @param ProtectURLStatus xxx
     */
    public void setProtectURLStatus(Long ProtectURLStatus) {
        this.ProtectURLStatus = ProtectURLStatus;
    }

    /**
     * Get xxx 
     * @return ProtectURLNote xxx
     */
    public String getProtectURLNote() {
        return this.ProtectURLNote;
    }

    /**
     * Set xxx
     * @param ProtectURLNote xxx
     */
    public void setProtectURLNote(String ProtectURLNote) {
        this.ProtectURLNote = ProtectURLNote;
    }

    /**
     * Get xxx 
     * @return CreateTime xxx
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set xxx
     * @param CreateTime xxx
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ProtectURLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectURLInfo(ProtectURLInfo source) {
        if (source.ProtectURLId != null) {
            this.ProtectURLId = new Long(source.ProtectURLId);
        }
        if (source.ProtectURL != null) {
            this.ProtectURL = new String(source.ProtectURL);
        }
        if (source.ProtectWeb != null) {
            this.ProtectWeb = new String(source.ProtectWeb);
        }
        if (source.ProtectURLStatus != null) {
            this.ProtectURLStatus = new Long(source.ProtectURLStatus);
        }
        if (source.ProtectURLNote != null) {
            this.ProtectURLNote = new String(source.ProtectURLNote);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectURLId", this.ProtectURLId);
        this.setParamSimple(map, prefix + "ProtectURL", this.ProtectURL);
        this.setParamSimple(map, prefix + "ProtectWeb", this.ProtectWeb);
        this.setParamSimple(map, prefix + "ProtectURLStatus", this.ProtectURLStatus);
        this.setParamSimple(map, prefix + "ProtectURLNote", this.ProtectURLNote);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

