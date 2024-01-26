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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodeDetailV2Request extends AbstractModel {

    /**
    * 文件或任务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 文件或任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件或任务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 文件或任务ID 
     * @return Id 文件或任务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 文件或任务ID
     * @param Id 文件或任务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 文件或任务名称 
     * @return Name 文件或任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件或任务名称
     * @param Name 文件或任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件或任务类型 
     * @return Type 文件或任务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件或任务类型
     * @param Type 文件或任务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeCodeDetailV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodeDetailV2Request(DescribeCodeDetailV2Request source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

