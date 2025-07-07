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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteManagerRequest extends AbstractModel {

    /**
    * 管理人ID
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
     * Get 管理人ID 
     * @return ManagerId 管理人ID
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理人ID
     * @param ManagerId 管理人ID
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    public DeleteManagerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteManagerRequest(DeleteManagerRequest source) {
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);

    }
}

