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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepoIsExistResp extends AbstractModel {

    /**
    * 仓库是否存在
    */
    @SerializedName("IsExist")
    @Expose
    private Boolean IsExist;

    /**
     * Get 仓库是否存在 
     * @return IsExist 仓库是否存在
     */
    public Boolean getIsExist() {
        return this.IsExist;
    }

    /**
     * Set 仓库是否存在
     * @param IsExist 仓库是否存在
     */
    public void setIsExist(Boolean IsExist) {
        this.IsExist = IsExist;
    }

    public RepoIsExistResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepoIsExistResp(RepoIsExistResp source) {
        if (source.IsExist != null) {
            this.IsExist = new Boolean(source.IsExist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsExist", this.IsExist);

    }
}

