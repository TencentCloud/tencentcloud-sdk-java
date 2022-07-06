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

public class DescribeDMSDatabaseRequest extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 匹配规则
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
     * Get 数据库名称 
     * @return Name 数据库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
     * @param Name 数据库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 匹配规则 
     * @return Pattern 匹配规则
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 匹配规则
     * @param Pattern 匹配规则
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    public DescribeDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSDatabaseRequest(DescribeDMSDatabaseRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);

    }
}

