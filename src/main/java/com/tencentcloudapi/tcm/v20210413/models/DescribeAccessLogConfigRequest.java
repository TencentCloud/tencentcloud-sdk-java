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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessLogConfigRequest extends AbstractModel {

    /**
    * mesh名字
    */
    @SerializedName("MeshId")
    @Expose
    private String MeshId;

    /**
     * Get mesh名字 
     * @return MeshId mesh名字
     */
    public String getMeshId() {
        return this.MeshId;
    }

    /**
     * Set mesh名字
     * @param MeshId mesh名字
     */
    public void setMeshId(String MeshId) {
        this.MeshId = MeshId;
    }

    public DescribeAccessLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessLogConfigRequest(DescribeAccessLogConfigRequest source) {
        if (source.MeshId != null) {
            this.MeshId = new String(source.MeshId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshId", this.MeshId);

    }
}

