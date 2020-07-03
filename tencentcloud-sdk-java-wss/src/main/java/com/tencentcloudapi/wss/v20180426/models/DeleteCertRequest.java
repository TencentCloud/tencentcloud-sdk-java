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
package com.tencentcloudapi.wss.v20180426.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCertRequest extends AbstractModel{

    /**
    * 证书 ID，即通过 GetList 拿到的证书列表的 ID 字段。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 模块名称，应填 ssl。
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
     * Get 证书 ID，即通过 GetList 拿到的证书列表的 ID 字段。 
     * @return Id 证书 ID，即通过 GetList 拿到的证书列表的 ID 字段。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 证书 ID，即通过 GetList 拿到的证书列表的 ID 字段。
     * @param Id 证书 ID，即通过 GetList 拿到的证书列表的 ID 字段。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 模块名称，应填 ssl。 
     * @return ModuleType 模块名称，应填 ssl。
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块名称，应填 ssl。
     * @param ModuleType 模块名称，应填 ssl。
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);

    }
}

