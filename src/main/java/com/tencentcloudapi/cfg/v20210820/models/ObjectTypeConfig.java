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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTypeConfig extends AbstractModel {

    /**
    * 主键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对象类型配置字段列表
    */
    @SerializedName("Fields")
    @Expose
    private ObjectTypeConfigFields [] Fields;

    /**
     * Get 主键 
     * @return Key 主键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 主键
     * @param Key 主键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对象类型配置字段列表 
     * @return Fields 对象类型配置字段列表
     */
    public ObjectTypeConfigFields [] getFields() {
        return this.Fields;
    }

    /**
     * Set 对象类型配置字段列表
     * @param Fields 对象类型配置字段列表
     */
    public void setFields(ObjectTypeConfigFields [] Fields) {
        this.Fields = Fields;
    }

    public ObjectTypeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTypeConfig(ObjectTypeConfig source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Fields != null) {
            this.Fields = new ObjectTypeConfigFields[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new ObjectTypeConfigFields(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

