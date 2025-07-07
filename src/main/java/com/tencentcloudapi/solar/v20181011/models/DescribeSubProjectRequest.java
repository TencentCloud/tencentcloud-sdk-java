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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubProjectRequest extends AbstractModel {

    /**
    * 子项目id
    */
    @SerializedName("SubProjectId")
    @Expose
    private String SubProjectId;

    /**
     * Get 子项目id 
     * @return SubProjectId 子项目id
     */
    public String getSubProjectId() {
        return this.SubProjectId;
    }

    /**
     * Set 子项目id
     * @param SubProjectId 子项目id
     */
    public void setSubProjectId(String SubProjectId) {
        this.SubProjectId = SubProjectId;
    }

    public DescribeSubProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubProjectRequest(DescribeSubProjectRequest source) {
        if (source.SubProjectId != null) {
            this.SubProjectId = new String(source.SubProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubProjectId", this.SubProjectId);

    }
}

