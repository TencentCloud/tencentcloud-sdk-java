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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VDBDocument extends AbstractModel {

    /**
    * <p>vdb document数据id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>vdb document数据标量字段</p>
    */
    @SerializedName("Fields")
    @Expose
    private VDBFieldMap [] Fields;

    /**
     * Get <p>vdb document数据id</p> 
     * @return Id <p>vdb document数据id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>vdb document数据id</p>
     * @param Id <p>vdb document数据id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>vdb document数据标量字段</p> 
     * @return Fields <p>vdb document数据标量字段</p>
     */
    public VDBFieldMap [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>vdb document数据标量字段</p>
     * @param Fields <p>vdb document数据标量字段</p>
     */
    public void setFields(VDBFieldMap [] Fields) {
        this.Fields = Fields;
    }

    public VDBDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VDBDocument(VDBDocument source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Fields != null) {
            this.Fields = new VDBFieldMap[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new VDBFieldMap(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

