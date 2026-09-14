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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCategoryRequest extends AbstractModel {

    /**
    * <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>分类名（长度：1~64 个字符）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>父分类 ID</p>
    */
    @SerializedName("ParentCategoryId")
    @Expose
    private String ParentCategoryId;

    /**
     * Get <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p> 
     * @return CategoryType <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p>
     */
    public Long getCategoryType() {
        return this.CategoryType;
    }

    /**
     * Set <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p>
     * @param CategoryType <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p>
     */
    public void setCategoryType(Long CategoryType) {
        this.CategoryType = CategoryType;
    }

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>分类名（长度：1~64 个字符）</p> 
     * @return Name <p>分类名（长度：1~64 个字符）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分类名（长度：1~64 个字符）</p>
     * @param Name <p>分类名（长度：1~64 个字符）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>父分类 ID</p> 
     * @return ParentCategoryId <p>父分类 ID</p>
     */
    public String getParentCategoryId() {
        return this.ParentCategoryId;
    }

    /**
     * Set <p>父分类 ID</p>
     * @param ParentCategoryId <p>父分类 ID</p>
     */
    public void setParentCategoryId(String ParentCategoryId) {
        this.ParentCategoryId = ParentCategoryId;
    }

    public CreateCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCategoryRequest(CreateCategoryRequest source) {
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentCategoryId != null) {
            this.ParentCategoryId = new String(source.ParentCategoryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentCategoryId", this.ParentCategoryId);

    }
}

