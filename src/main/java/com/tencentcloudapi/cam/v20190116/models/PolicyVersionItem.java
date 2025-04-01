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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyVersionItem extends AbstractModel {

    /**
    * 策略版本号
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * 策略版本创建时间
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 是否是正在生效的版本。0表示不是，1表示是
    */
    @SerializedName("IsDefaultVersion")
    @Expose
    private Long IsDefaultVersion;

    /**
     * Get 策略版本号 
     * @return VersionId 策略版本号
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 策略版本号
     * @param VersionId 策略版本号
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 策略版本创建时间 
     * @return CreateDate 策略版本创建时间
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 策略版本创建时间
     * @param CreateDate 策略版本创建时间
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 是否是正在生效的版本。0表示不是，1表示是 
     * @return IsDefaultVersion 是否是正在生效的版本。0表示不是，1表示是
     */
    public Long getIsDefaultVersion() {
        return this.IsDefaultVersion;
    }

    /**
     * Set 是否是正在生效的版本。0表示不是，1表示是
     * @param IsDefaultVersion 是否是正在生效的版本。0表示不是，1表示是
     */
    public void setIsDefaultVersion(Long IsDefaultVersion) {
        this.IsDefaultVersion = IsDefaultVersion;
    }

    public PolicyVersionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyVersionItem(PolicyVersionItem source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.IsDefaultVersion != null) {
            this.IsDefaultVersion = new Long(source.IsDefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "IsDefaultVersion", this.IsDefaultVersion);

    }
}

