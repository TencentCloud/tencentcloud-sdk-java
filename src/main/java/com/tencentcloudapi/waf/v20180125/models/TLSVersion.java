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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TLSVersion extends AbstractModel {

    /**
    * TLSVERSION的ID
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * TLSVERSION的NAME
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
     * Get TLSVERSION的ID 
     * @return VersionId TLSVERSION的ID
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set TLSVERSION的ID
     * @param VersionId TLSVERSION的ID
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get TLSVERSION的NAME 
     * @return VersionName TLSVERSION的NAME
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set TLSVERSION的NAME
     * @param VersionName TLSVERSION的NAME
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    public TLSVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLSVersion(TLSVersion source) {
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);

    }
}

