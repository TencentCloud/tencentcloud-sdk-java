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

public class CreateCRObtainRequest extends AbstractModel{

    /**
    * 已存证的作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 侵权链接
    */
    @SerializedName("TortUrl")
    @Expose
    private String TortUrl;

    /**
    * 取证类型 1-网页取证 2-过程取证
    */
    @SerializedName("ObtainType")
    @Expose
    private Long ObtainType;

    /**
    * 侵权标题
    */
    @SerializedName("WorkTitle")
    @Expose
    private String WorkTitle;

    /**
    * 侵权平台
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * 过程取证的取证时长 6-300分钟
    */
    @SerializedName("ObtainDuration")
    @Expose
    private Long ObtainDuration;

    /**
    * 取证回调地址
    */
    @SerializedName("ObtainUrl")
    @Expose
    private String ObtainUrl;

    /**
    * xxx
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * xxx
    */
    @SerializedName("WorkType")
    @Expose
    private String WorkType;

    /**
     * Get 已存证的作品ID 
     * @return WorkId 已存证的作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 已存证的作品ID
     * @param WorkId 已存证的作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 侵权链接 
     * @return TortUrl 侵权链接
     */
    public String getTortUrl() {
        return this.TortUrl;
    }

    /**
     * Set 侵权链接
     * @param TortUrl 侵权链接
     */
    public void setTortUrl(String TortUrl) {
        this.TortUrl = TortUrl;
    }

    /**
     * Get 取证类型 1-网页取证 2-过程取证 
     * @return ObtainType 取证类型 1-网页取证 2-过程取证
     */
    public Long getObtainType() {
        return this.ObtainType;
    }

    /**
     * Set 取证类型 1-网页取证 2-过程取证
     * @param ObtainType 取证类型 1-网页取证 2-过程取证
     */
    public void setObtainType(Long ObtainType) {
        this.ObtainType = ObtainType;
    }

    /**
     * Get 侵权标题 
     * @return WorkTitle 侵权标题
     */
    public String getWorkTitle() {
        return this.WorkTitle;
    }

    /**
     * Set 侵权标题
     * @param WorkTitle 侵权标题
     */
    public void setWorkTitle(String WorkTitle) {
        this.WorkTitle = WorkTitle;
    }

    /**
     * Get 侵权平台 
     * @return TortPlat 侵权平台
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set 侵权平台
     * @param TortPlat 侵权平台
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get 过程取证的取证时长 6-300分钟 
     * @return ObtainDuration 过程取证的取证时长 6-300分钟
     */
    public Long getObtainDuration() {
        return this.ObtainDuration;
    }

    /**
     * Set 过程取证的取证时长 6-300分钟
     * @param ObtainDuration 过程取证的取证时长 6-300分钟
     */
    public void setObtainDuration(Long ObtainDuration) {
        this.ObtainDuration = ObtainDuration;
    }

    /**
     * Get 取证回调地址 
     * @return ObtainUrl 取证回调地址
     */
    public String getObtainUrl() {
        return this.ObtainUrl;
    }

    /**
     * Set 取证回调地址
     * @param ObtainUrl 取证回调地址
     */
    public void setObtainUrl(String ObtainUrl) {
        this.ObtainUrl = ObtainUrl;
    }

    /**
     * Get xxx 
     * @return WorkCategory xxx
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set xxx
     * @param WorkCategory xxx
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get xxx 
     * @return WorkType xxx
     */
    public String getWorkType() {
        return this.WorkType;
    }

    /**
     * Set xxx
     * @param WorkType xxx
     */
    public void setWorkType(String WorkType) {
        this.WorkType = WorkType;
    }

    public CreateCRObtainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRObtainRequest(CreateCRObtainRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.TortUrl != null) {
            this.TortUrl = new String(source.TortUrl);
        }
        if (source.ObtainType != null) {
            this.ObtainType = new Long(source.ObtainType);
        }
        if (source.WorkTitle != null) {
            this.WorkTitle = new String(source.WorkTitle);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.ObtainDuration != null) {
            this.ObtainDuration = new Long(source.ObtainDuration);
        }
        if (source.ObtainUrl != null) {
            this.ObtainUrl = new String(source.ObtainUrl);
        }
        if (source.WorkCategory != null) {
            this.WorkCategory = new String(source.WorkCategory);
        }
        if (source.WorkType != null) {
            this.WorkType = new String(source.WorkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "TortUrl", this.TortUrl);
        this.setParamSimple(map, prefix + "ObtainType", this.ObtainType);
        this.setParamSimple(map, prefix + "WorkTitle", this.WorkTitle);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "ObtainDuration", this.ObtainDuration);
        this.setParamSimple(map, prefix + "ObtainUrl", this.ObtainUrl);
        this.setParamSimple(map, prefix + "WorkCategory", this.WorkCategory);
        this.setParamSimple(map, prefix + "WorkType", this.WorkType);

    }
}

