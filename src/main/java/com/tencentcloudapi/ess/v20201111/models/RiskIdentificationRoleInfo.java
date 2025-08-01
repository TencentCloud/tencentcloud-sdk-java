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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskIdentificationRoleInfo extends AbstractModel {

    /**
    * 风险识别角色的名称。用于唯一标识和区分不同的风险识别角色。

注意：`最大长度应不超过200个字符`
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 风险识别角色的详细说明。

注意： `最大长度应不超过500个字符`
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 风险识别角色的名称。用于唯一标识和区分不同的风险识别角色。

注意：`最大长度应不超过200个字符` 
     * @return Name 风险识别角色的名称。用于唯一标识和区分不同的风险识别角色。

注意：`最大长度应不超过200个字符`
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 风险识别角色的名称。用于唯一标识和区分不同的风险识别角色。

注意：`最大长度应不超过200个字符`
     * @param Name 风险识别角色的名称。用于唯一标识和区分不同的风险识别角色。

注意：`最大长度应不超过200个字符`
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 风险识别角色的详细说明。

注意： `最大长度应不超过500个字符` 
     * @return Description 风险识别角色的详细说明。

注意： `最大长度应不超过500个字符`
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 风险识别角色的详细说明。

注意： `最大长度应不超过500个字符`
     * @param Description 风险识别角色的详细说明。

注意： `最大长度应不超过500个字符`
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RiskIdentificationRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskIdentificationRoleInfo(RiskIdentificationRoleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

