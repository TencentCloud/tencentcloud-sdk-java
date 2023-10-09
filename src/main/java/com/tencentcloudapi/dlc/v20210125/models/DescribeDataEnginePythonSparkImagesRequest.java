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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEnginePythonSparkImagesRequest extends AbstractModel{

    /**
    * 集群镜像小版本ID
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
     * Get 集群镜像小版本ID 
     * @return ChildImageVersionId 集群镜像小版本ID
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set 集群镜像小版本ID
     * @param ChildImageVersionId 集群镜像小版本ID
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    public DescribeDataEnginePythonSparkImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEnginePythonSparkImagesRequest(DescribeDataEnginePythonSparkImagesRequest source) {
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);

    }
}

