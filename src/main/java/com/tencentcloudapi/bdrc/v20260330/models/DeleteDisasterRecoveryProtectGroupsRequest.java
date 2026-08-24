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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDisasterRecoveryProtectGroupsRequest extends AbstractModel {

    /**
    * 删除容灾保护组ID列表，最多10个
    */
    @SerializedName("ProtectGroups")
    @Expose
    private String [] ProtectGroups;

    /**
     * Get 删除容灾保护组ID列表，最多10个 
     * @return ProtectGroups 删除容灾保护组ID列表，最多10个
     */
    public String [] getProtectGroups() {
        return this.ProtectGroups;
    }

    /**
     * Set 删除容灾保护组ID列表，最多10个
     * @param ProtectGroups 删除容灾保护组ID列表，最多10个
     */
    public void setProtectGroups(String [] ProtectGroups) {
        this.ProtectGroups = ProtectGroups;
    }

    public DeleteDisasterRecoveryProtectGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDisasterRecoveryProtectGroupsRequest(DeleteDisasterRecoveryProtectGroupsRequest source) {
        if (source.ProtectGroups != null) {
            this.ProtectGroups = new String[source.ProtectGroups.length];
            for (int i = 0; i < source.ProtectGroups.length; i++) {
                this.ProtectGroups[i] = new String(source.ProtectGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProtectGroups.", this.ProtectGroups);

    }
}

