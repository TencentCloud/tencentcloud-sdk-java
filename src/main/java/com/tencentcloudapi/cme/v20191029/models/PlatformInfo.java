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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlatformInfo extends AbstractModel{

    /**
    * 平台名称。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 平台描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 云点播子应用 Id。
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
    * 平台绑定的 license Id。
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
    * 创建时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 平台名称。 
     * @return Platform 平台名称。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称。
     * @param Platform 平台名称。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 平台描述。 
     * @return Description 平台描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 平台描述。
     * @param Description 平台描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 云点播子应用 Id。 
     * @return VodSubAppId 云点播子应用 Id。
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set 云点播子应用 Id。
     * @param VodSubAppId 云点播子应用 Id。
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Get 平台绑定的 license Id。 
     * @return LicenseId 平台绑定的 license Id。
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set 平台绑定的 license Id。
     * @param LicenseId 平台绑定的 license Id。
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 创建时间，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式按照 ISO 8601 标准表示。
     * @param CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，格式按照 ISO 8601 标准表示。 
     * @return UpdateTime 更新时间，格式按照 ISO 8601 标准表示。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，格式按照 ISO 8601 标准表示。
     * @param UpdateTime 更新时间，格式按照 ISO 8601 标准表示。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

