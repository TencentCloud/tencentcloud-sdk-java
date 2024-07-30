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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserPrivileges extends AbstractModel {

    /**
    * 是否设置catalog权限
    */
    @SerializedName("IsSetGlobalCatalog")
    @Expose
    private Boolean IsSetGlobalCatalog;

    /**
     * Get 是否设置catalog权限 
     * @return IsSetGlobalCatalog 是否设置catalog权限
     */
    public Boolean getIsSetGlobalCatalog() {
        return this.IsSetGlobalCatalog;
    }

    /**
     * Set 是否设置catalog权限
     * @param IsSetGlobalCatalog 是否设置catalog权限
     */
    public void setIsSetGlobalCatalog(Boolean IsSetGlobalCatalog) {
        this.IsSetGlobalCatalog = IsSetGlobalCatalog;
    }

    public UpdateUserPrivileges() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserPrivileges(UpdateUserPrivileges source) {
        if (source.IsSetGlobalCatalog != null) {
            this.IsSetGlobalCatalog = new Boolean(source.IsSetGlobalCatalog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSetGlobalCatalog", this.IsSetGlobalCatalog);

    }
}

