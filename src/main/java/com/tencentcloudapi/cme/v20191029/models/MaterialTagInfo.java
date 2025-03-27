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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialTagInfo extends AbstractModel {

    /**
    * 标签类型，取值为：
<li>PRESET：预置标签。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 标签 Id 。当标签类型为 PRESET 时，标签 Id 为预置标签 Id 。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 标签名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 标签类型，取值为：
<li>PRESET：预置标签。</li> 
     * @return Type 标签类型，取值为：
<li>PRESET：预置标签。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 标签类型，取值为：
<li>PRESET：预置标签。</li>
     * @param Type 标签类型，取值为：
<li>PRESET：预置标签。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 标签 Id 。当标签类型为 PRESET 时，标签 Id 为预置标签 Id 。 
     * @return Id 标签 Id 。当标签类型为 PRESET 时，标签 Id 为预置标签 Id 。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 标签 Id 。当标签类型为 PRESET 时，标签 Id 为预置标签 Id 。
     * @param Id 标签 Id 。当标签类型为 PRESET 时，标签 Id 为预置标签 Id 。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名称。 
     * @return Name 标签名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名称。
     * @param Name 标签名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public MaterialTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaterialTagInfo(MaterialTagInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

