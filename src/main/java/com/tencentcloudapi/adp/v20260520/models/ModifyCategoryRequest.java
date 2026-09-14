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

public class ModifyCategoryRequest extends AbstractModel {

    /**
    * <p>待修改的分类 ID（必须大于 0）</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>分类类型（不可为 0，取值：1=文档分类，2=问答分类）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CATEGORY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>CATEGORY_TYPE_DOC</td><td>1</td><td>文档分类</td></tr><tr><td>CATEGORY_TYPE_QA</td><td>2</td><td>问答分类</td></tr></tbody></table></p>
    */
    @SerializedName("CategoryType")
    @Expose
    private Long CategoryType;

    /**
    * <p>修改字段内容（不可为空，与 update_mask 配合使用）</p>
    */
    @SerializedName("Fields")
    @Expose
    private CategoryModifyFields Fields;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>字段掩码：指定要修改的字段（支持的 Paths：Name）</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>待修改的分类 ID（必须大于 0）</p> 
     * @return CategoryId <p>待修改的分类 ID（必须大于 0）</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>待修改的分类 ID（必须大于 0）</p>
     * @param CategoryId <p>待修改的分类 ID（必须大于 0）</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

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
     * Get <p>修改字段内容（不可为空，与 update_mask 配合使用）</p> 
     * @return Fields <p>修改字段内容（不可为空，与 update_mask 配合使用）</p>
     */
    public CategoryModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>修改字段内容（不可为空，与 update_mask 配合使用）</p>
     * @param Fields <p>修改字段内容（不可为空，与 update_mask 配合使用）</p>
     */
    public void setFields(CategoryModifyFields Fields) {
        this.Fields = Fields;
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
     * Get <p>字段掩码：指定要修改的字段（支持的 Paths：Name）</p> 
     * @return UpdateMask <p>字段掩码：指定要修改的字段（支持的 Paths：Name）</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>字段掩码：指定要修改的字段（支持的 Paths：Name）</p>
     * @param UpdateMask <p>字段掩码：指定要修改的字段（支持的 Paths：Name）</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyCategoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCategoryRequest(ModifyCategoryRequest source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryType != null) {
            this.CategoryType = new Long(source.CategoryType);
        }
        if (source.Fields != null) {
            this.Fields = new CategoryModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryType", this.CategoryType);
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

