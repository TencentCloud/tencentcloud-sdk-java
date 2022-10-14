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
    * 保护网站ID
    */
    @SerializedName("ProtectURLId")
    @Expose
    private Long ProtectURLId;

    /**
    * 保护网站
    */
    @SerializedName("ProtectURL")
    @Expose
    private String ProtectURL;

    /**
    * 保护网站名称
    */
    @SerializedName("ProtectWeb")
    @Expose
    private String ProtectWeb;

    /**
    * 保护网站审核状态 1-审核中 2-审核不通过 3-审核通过
    */
    @SerializedName("ProtectURLStatus")
    @Expose
    private Long ProtectURLStatus;

    /**
    * 网站审核不通过原因
    */
    @SerializedName("ProtectURLNote")
    @Expose
    private String ProtectURLNote;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 保护网站ID 
     * @return ProtectURLId 保护网站ID
     */
    public Long getProtectURLId() {
        return this.ProtectURLId;
    }

    /**
     * Set 保护网站ID
     * @param ProtectURLId 保护网站ID
     */
    public void setProtectURLId(Long ProtectURLId) {
        this.ProtectURLId = ProtectURLId;
    }

    /**
     * Get 保护网站 
     * @return ProtectURL 保护网站
     */
    public String getProtectURL() {
        return this.ProtectURL;
    }

    /**
     * Set 保护网站
     * @param ProtectURL 保护网站
     */
    public void setProtectURL(String ProtectURL) {
        this.ProtectURL = ProtectURL;
    }

    /**
     * Get 保护网站名称 
     * @return ProtectWeb 保护网站名称
     */
    public String getProtectWeb() {
        return this.ProtectWeb;
    }

    /**
     * Set 保护网站名称
     * @param ProtectWeb 保护网站名称
     */
    public void setProtectWeb(String ProtectWeb) {
        this.ProtectWeb = ProtectWeb;
    }

    /**
     * Get 保护网站审核状态 1-审核中 2-审核不通过 3-审核通过 
     * @return ProtectURLStatus 保护网站审核状态 1-审核中 2-审核不通过 3-审核通过
     */
    public Long getProtectURLStatus() {
        return this.ProtectURLStatus;
    }

    /**
     * Set 保护网站审核状态 1-审核中 2-审核不通过 3-审核通过
     * @param ProtectURLStatus 保护网站审核状态 1-审核中 2-审核不通过 3-审核通过
     */
    public void setProtectURLStatus(Long ProtectURLStatus) {
        this.ProtectURLStatus = ProtectURLStatus;
    }

    /**
     * Get 网站审核不通过原因 
     * @return ProtectURLNote 网站审核不通过原因
     */
    public String getProtectURLNote() {
        return this.ProtectURLNote;
    }

    /**
     * Set 网站审核不通过原因
     * @param ProtectURLNote 网站审核不通过原因
     */
    public void setProtectURLNote(String ProtectURLNote) {
        this.ProtectURLNote = ProtectURLNote;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
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

