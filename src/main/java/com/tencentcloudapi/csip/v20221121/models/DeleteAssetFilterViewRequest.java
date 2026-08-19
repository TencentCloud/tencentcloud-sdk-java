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

public class DeleteAssetFilterViewRequest extends AbstractModel {

    /**
    * 资产搜索视图ID
    */
    @SerializedName("ViewID")
    @Expose
    private Long ViewID;

    /**
     * Get 资产搜索视图ID 
     * @return ViewID 资产搜索视图ID
     */
    public Long getViewID() {
        return this.ViewID;
    }

    /**
     * Set 资产搜索视图ID
     * @param ViewID 资产搜索视图ID
     */
    public void setViewID(Long ViewID) {
        this.ViewID = ViewID;
    }

    public DeleteAssetFilterViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAssetFilterViewRequest(DeleteAssetFilterViewRequest source) {
        if (source.ViewID != null) {
            this.ViewID = new Long(source.ViewID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewID", this.ViewID);

    }
}

