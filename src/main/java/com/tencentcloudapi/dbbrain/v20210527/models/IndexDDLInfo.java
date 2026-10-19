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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexDDLInfo extends AbstractModel {

    /**
    * <p>索引名称。</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>创建索引语句。</p>
    */
    @SerializedName("DDL")
    @Expose
    private String DDL;

    /**
     * Get <p>索引名称。</p> 
     * @return IndexName <p>索引名称。</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>索引名称。</p>
     * @param IndexName <p>索引名称。</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>创建索引语句。</p> 
     * @return DDL <p>创建索引语句。</p>
     */
    public String getDDL() {
        return this.DDL;
    }

    /**
     * Set <p>创建索引语句。</p>
     * @param DDL <p>创建索引语句。</p>
     */
    public void setDDL(String DDL) {
        this.DDL = DDL;
    }

    public IndexDDLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexDDLInfo(IndexDDLInfo source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.DDL != null) {
            this.DDL = new String(source.DDL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "DDL", this.DDL);

    }
}

