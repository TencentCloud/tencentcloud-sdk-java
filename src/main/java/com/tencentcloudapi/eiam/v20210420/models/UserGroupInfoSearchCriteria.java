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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroupInfoSearchCriteria extends AbstractModel {

    /**
    * 名称匹配搜索，匹配范围包括：用户组名称、用户组ID。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 名称匹配搜索，匹配范围包括：用户组名称、用户组ID。 
     * @return Keyword 名称匹配搜索，匹配范围包括：用户组名称、用户组ID。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 名称匹配搜索，匹配范围包括：用户组名称、用户组ID。
     * @param Keyword 名称匹配搜索，匹配范围包括：用户组名称、用户组ID。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public UserGroupInfoSearchCriteria() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInfoSearchCriteria(UserGroupInfoSearchCriteria source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

