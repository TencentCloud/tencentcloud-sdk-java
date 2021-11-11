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
    * 平台标识。
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
    * 平台状态，可取值为：
<li>Normal：正常，可使用。；</li>
<li>Stopped：已停用，暂无法使用；</li>
<li>Expired：已过期，需要重新购买会员包。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 平台标识。 
     * @return Platform 平台标识。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台标识。
     * @param Platform 平台标识。
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
     * Get 平台状态，可取值为：
<li>Normal：正常，可使用。；</li>
<li>Stopped：已停用，暂无法使用；</li>
<li>Expired：已过期，需要重新购买会员包。</li> 
     * @return Status 平台状态，可取值为：
<li>Normal：正常，可使用。；</li>
<li>Stopped：已停用，暂无法使用；</li>
<li>Expired：已过期，需要重新购买会员包。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 平台状态，可取值为：
<li>Normal：正常，可使用。；</li>
<li>Stopped：已停用，暂无法使用；</li>
<li>Expired：已过期，需要重新购买会员包。</li>
     * @param Status 平台状态，可取值为：
<li>Normal：正常，可使用。；</li>
<li>Stopped：已停用，暂无法使用；</li>
<li>Expired：已过期，需要重新购买会员包。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public PlatformInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformInfo(PlatformInfo source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VodSubAppId != null) {
            this.VodSubAppId = new Long(source.VodSubAppId);
        }
        if (source.LicenseId != null) {
            this.LicenseId = new String(source.LicenseId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

