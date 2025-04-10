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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Chunk extends AbstractModel {

    /**
    * chunk索引。切片顺序 id。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * chunk内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get chunk索引。切片顺序 id。 
     * @return Index chunk索引。切片顺序 id。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set chunk索引。切片顺序 id。
     * @param Index chunk索引。切片顺序 id。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get chunk内容。 
     * @return Content chunk内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set chunk内容。
     * @param Content chunk内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public Chunk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chunk(Chunk source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

