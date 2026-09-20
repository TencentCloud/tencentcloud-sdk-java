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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAuditKeywordLibRequest extends AbstractModel {

    /**
    * <p>词库 Id。</p>
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
     * Get <p>词库 Id。</p> 
     * @return LibId <p>词库 Id。</p>
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set <p>词库 Id。</p>
     * @param LibId <p>词库 Id。</p>
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    public DeleteAuditKeywordLibRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAuditKeywordLibRequest(DeleteAuditKeywordLibRequest source) {
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibId", this.LibId);

    }
}

