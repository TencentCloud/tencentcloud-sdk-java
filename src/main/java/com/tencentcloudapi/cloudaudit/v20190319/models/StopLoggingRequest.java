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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopLoggingRequest extends AbstractModel {

    /**
    * 跟踪集名称
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
     * Get 跟踪集名称 
     * @return AuditName 跟踪集名称
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set 跟踪集名称
     * @param AuditName 跟踪集名称
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    public StopLoggingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopLoggingRequest(StopLoggingRequest source) {
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);

    }
}

