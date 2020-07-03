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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDictRequest extends AbstractModel{

    /**
    * 自定义词库ID。
    */
    @SerializedName("DictId")
    @Expose
    private String DictId;

    /**
    * 词库描述，不超过100字。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 词库名称，不超过20字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 自定义词库ID。 
     * @return DictId 自定义词库ID。
     */
    public String getDictId() {
        return this.DictId;
    }

    /**
     * Set 自定义词库ID。
     * @param DictId 自定义词库ID。
     */
    public void setDictId(String DictId) {
        this.DictId = DictId;
    }

    /**
     * Get 词库描述，不超过100字。 
     * @return Description 词库描述，不超过100字。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 词库描述，不超过100字。
     * @param Description 词库描述，不超过100字。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 词库名称，不超过20字。 
     * @return Name 词库名称，不超过20字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 词库名称，不超过20字。
     * @param Name 词库名称，不超过20字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

