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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferResourceInfo extends AbstractModel {

    /**
    * 资料标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 资料来源类型，1:问答库，2:文档，3:医典百科，4:临床指南，5:药品说明书
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资料详情链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 资料标题 
     * @return Title 资料标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 资料标题
     * @param Title 资料标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 资料来源类型，1:问答库，2:文档，3:医典百科，4:临床指南，5:药品说明书 
     * @return Type 资料来源类型，1:问答库，2:文档，3:医典百科，4:临床指南，5:药品说明书
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资料来源类型，1:问答库，2:文档，3:医典百科，4:临床指南，5:药品说明书
     * @param Type 资料来源类型，1:问答库，2:文档，3:医典百科，4:临床指南，5:药品说明书
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资料详情链接 
     * @return Url 资料详情链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 资料详情链接
     * @param Url 资料详情链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ReferResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferResourceInfo(ReferResourceInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

