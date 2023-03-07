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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBaselineWeakPasswordRequest extends AbstractModel{

    /**
    * 弱口令Id
    */
    @SerializedName("PasswordIds")
    @Expose
    private Long [] PasswordIds;

    /**
     * Get 弱口令Id 
     * @return PasswordIds 弱口令Id
     */
    public Long [] getPasswordIds() {
        return this.PasswordIds;
    }

    /**
     * Set 弱口令Id
     * @param PasswordIds 弱口令Id
     */
    public void setPasswordIds(Long [] PasswordIds) {
        this.PasswordIds = PasswordIds;
    }

    public DeleteBaselineWeakPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBaselineWeakPasswordRequest(DeleteBaselineWeakPasswordRequest source) {
        if (source.PasswordIds != null) {
            this.PasswordIds = new Long[source.PasswordIds.length];
            for (int i = 0; i < source.PasswordIds.length; i++) {
                this.PasswordIds[i] = new Long(source.PasswordIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PasswordIds.", this.PasswordIds);

    }
}

