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

public class UltimateAppItem extends AbstractModel {

    /**
    * <p>用户AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>是否旗舰版</p>
    */
    @SerializedName("IsUltimateVersion")
    @Expose
    private Boolean IsUltimateVersion;

    /**
     * Get <p>用户AppID</p> 
     * @return AppID <p>用户AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户AppID</p>
     * @param AppID <p>用户AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>是否旗舰版</p> 
     * @return IsUltimateVersion <p>是否旗舰版</p>
     */
    public Boolean getIsUltimateVersion() {
        return this.IsUltimateVersion;
    }

    /**
     * Set <p>是否旗舰版</p>
     * @param IsUltimateVersion <p>是否旗舰版</p>
     */
    public void setIsUltimateVersion(Boolean IsUltimateVersion) {
        this.IsUltimateVersion = IsUltimateVersion;
    }

    public UltimateAppItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UltimateAppItem(UltimateAppItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.IsUltimateVersion != null) {
            this.IsUltimateVersion = new Boolean(source.IsUltimateVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "IsUltimateVersion", this.IsUltimateVersion);

    }
}

