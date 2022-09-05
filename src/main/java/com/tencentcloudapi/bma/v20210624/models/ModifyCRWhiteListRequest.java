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

public class ModifyCRWhiteListRequest extends AbstractModel{

    /**
    * 白名单ID
    */
    @SerializedName("WhiteListId")
    @Expose
    private Long WhiteListId;

    /**
    * 平台名称
    */
    @SerializedName("PlatForm")
    @Expose
    private String PlatForm;

    /**
    * 平台站点链接
    */
    @SerializedName("PlatUrl")
    @Expose
    private String PlatUrl;

    /**
    * 作者ID
    */
    @SerializedName("AuthorId")
    @Expose
    private String AuthorId;

    /**
    * 作品ID
    */
    @SerializedName("WorksId")
    @Expose
    private Long WorksId;

    /**
    * xxx
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xxx
    */
    @SerializedName("WhiteSites")
    @Expose
    private String WhiteSites;

    /**
     * Get 白名单ID 
     * @return WhiteListId 白名单ID
     */
    public Long getWhiteListId() {
        return this.WhiteListId;
    }

    /**
     * Set 白名单ID
     * @param WhiteListId 白名单ID
     */
    public void setWhiteListId(Long WhiteListId) {
        this.WhiteListId = WhiteListId;
    }

    /**
     * Get 平台名称 
     * @return PlatForm 平台名称
     */
    public String getPlatForm() {
        return this.PlatForm;
    }

    /**
     * Set 平台名称
     * @param PlatForm 平台名称
     */
    public void setPlatForm(String PlatForm) {
        this.PlatForm = PlatForm;
    }

    /**
     * Get 平台站点链接 
     * @return PlatUrl 平台站点链接
     */
    public String getPlatUrl() {
        return this.PlatUrl;
    }

    /**
     * Set 平台站点链接
     * @param PlatUrl 平台站点链接
     */
    public void setPlatUrl(String PlatUrl) {
        this.PlatUrl = PlatUrl;
    }

    /**
     * Get 作者ID 
     * @return AuthorId 作者ID
     */
    public String getAuthorId() {
        return this.AuthorId;
    }

    /**
     * Set 作者ID
     * @param AuthorId 作者ID
     */
    public void setAuthorId(String AuthorId) {
        this.AuthorId = AuthorId;
    }

    /**
     * Get 作品ID 
     * @return WorksId 作品ID
     */
    public Long getWorksId() {
        return this.WorksId;
    }

    /**
     * Set 作品ID
     * @param WorksId 作品ID
     */
    public void setWorksId(Long WorksId) {
        this.WorksId = WorksId;
    }

    /**
     * Get xxx 
     * @return WorkId xxx
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set xxx
     * @param WorkId xxx
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xxx 
     * @return WhiteSites xxx
     */
    public String getWhiteSites() {
        return this.WhiteSites;
    }

    /**
     * Set xxx
     * @param WhiteSites xxx
     */
    public void setWhiteSites(String WhiteSites) {
        this.WhiteSites = WhiteSites;
    }

    public ModifyCRWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCRWhiteListRequest(ModifyCRWhiteListRequest source) {
        if (source.WhiteListId != null) {
            this.WhiteListId = new Long(source.WhiteListId);
        }
        if (source.PlatForm != null) {
            this.PlatForm = new String(source.PlatForm);
        }
        if (source.PlatUrl != null) {
            this.PlatUrl = new String(source.PlatUrl);
        }
        if (source.AuthorId != null) {
            this.AuthorId = new String(source.AuthorId);
        }
        if (source.WorksId != null) {
            this.WorksId = new Long(source.WorksId);
        }
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.WhiteSites != null) {
            this.WhiteSites = new String(source.WhiteSites);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteListId", this.WhiteListId);
        this.setParamSimple(map, prefix + "PlatForm", this.PlatForm);
        this.setParamSimple(map, prefix + "PlatUrl", this.PlatUrl);
        this.setParamSimple(map, prefix + "AuthorId", this.AuthorId);
        this.setParamSimple(map, prefix + "WorksId", this.WorksId);
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "WhiteSites", this.WhiteSites);

    }
}

