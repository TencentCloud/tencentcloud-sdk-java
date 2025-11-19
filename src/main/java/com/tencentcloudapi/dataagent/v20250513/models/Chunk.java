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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Chunk extends AbstractModel {

    /**
    * 切片ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 切片内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 切片的字数
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 切片ID 
     * @return Id 切片ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 切片ID
     * @param Id 切片ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 切片内容 
     * @return Content 切片内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 切片内容
     * @param Content 切片内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 切片的字数 
     * @return Size 切片的字数
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 切片的字数
     * @param Size 切片的字数
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public Chunk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chunk(Chunk source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

