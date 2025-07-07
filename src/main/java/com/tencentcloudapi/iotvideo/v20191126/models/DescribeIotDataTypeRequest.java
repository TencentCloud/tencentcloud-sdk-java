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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIotDataTypeRequest extends AbstractModel {

    /**
    * 自定义数据类型的标识符，为空则返回全量自定义类型的列表
    */
    @SerializedName("TypeId")
    @Expose
    private String TypeId;

    /**
     * Get 自定义数据类型的标识符，为空则返回全量自定义类型的列表 
     * @return TypeId 自定义数据类型的标识符，为空则返回全量自定义类型的列表
     */
    public String getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 自定义数据类型的标识符，为空则返回全量自定义类型的列表
     * @param TypeId 自定义数据类型的标识符，为空则返回全量自定义类型的列表
     */
    public void setTypeId(String TypeId) {
        this.TypeId = TypeId;
    }

    public DescribeIotDataTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIotDataTypeRequest(DescribeIotDataTypeRequest source) {
        if (source.TypeId != null) {
            this.TypeId = new String(source.TypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);

    }
}

