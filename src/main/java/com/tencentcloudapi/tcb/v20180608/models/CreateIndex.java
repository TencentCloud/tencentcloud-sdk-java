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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIndex extends AbstractModel {

    /**
    * 索引名称
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 索引结构
    */
    @SerializedName("MgoKeySchema")
    @Expose
    private MgoKeySchema MgoKeySchema;

    /**
     * Get 索引名称 
     * @return IndexName 索引名称
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名称
     * @param IndexName 索引名称
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 索引结构 
     * @return MgoKeySchema 索引结构
     */
    public MgoKeySchema getMgoKeySchema() {
        return this.MgoKeySchema;
    }

    /**
     * Set 索引结构
     * @param MgoKeySchema 索引结构
     */
    public void setMgoKeySchema(MgoKeySchema MgoKeySchema) {
        this.MgoKeySchema = MgoKeySchema;
    }

    public CreateIndex() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIndex(CreateIndex source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.MgoKeySchema != null) {
            this.MgoKeySchema = new MgoKeySchema(source.MgoKeySchema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamObj(map, prefix + "MgoKeySchema.", this.MgoKeySchema);

    }
}

