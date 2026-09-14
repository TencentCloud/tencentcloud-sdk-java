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

public class MetaValue extends AbstractModel {

    /**
    * <p>元数据值名称（仅展示使用）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否引用该类型下的全部值（true 时 ref_value_id 应为 0）</p>
    */
    @SerializedName("RefAll")
    @Expose
    private Boolean RefAll;

    /**
    * <p>元数据引用的业务 ID（属性 ID、分类 ID 等）；ref_all=true 时该字段应为 0</p>
    */
    @SerializedName("RefValueId")
    @Expose
    private String RefValueId;

    /**
    * <p>元数据使用场景：1=仅检索使用，2=检索和生成都使用<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>仅检索使用</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>检索和生成都使用</td></tr></tbody></table></p>
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * <p>元数据值类型：1=属性标签，2=文档分类，3=问答分类<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>属性标签</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>文档分类</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>问答分类</td></tr></tbody></table></p>
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
     * Get <p>元数据值名称（仅展示使用）</p> 
     * @return Name <p>元数据值名称（仅展示使用）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>元数据值名称（仅展示使用）</p>
     * @param Name <p>元数据值名称（仅展示使用）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否引用该类型下的全部值（true 时 ref_value_id 应为 0）</p> 
     * @return RefAll <p>是否引用该类型下的全部值（true 时 ref_value_id 应为 0）</p>
     */
    public Boolean getRefAll() {
        return this.RefAll;
    }

    /**
     * Set <p>是否引用该类型下的全部值（true 时 ref_value_id 应为 0）</p>
     * @param RefAll <p>是否引用该类型下的全部值（true 时 ref_value_id 应为 0）</p>
     */
    public void setRefAll(Boolean RefAll) {
        this.RefAll = RefAll;
    }

    /**
     * Get <p>元数据引用的业务 ID（属性 ID、分类 ID 等）；ref_all=true 时该字段应为 0</p> 
     * @return RefValueId <p>元数据引用的业务 ID（属性 ID、分类 ID 等）；ref_all=true 时该字段应为 0</p>
     */
    public String getRefValueId() {
        return this.RefValueId;
    }

    /**
     * Set <p>元数据引用的业务 ID（属性 ID、分类 ID 等）；ref_all=true 时该字段应为 0</p>
     * @param RefValueId <p>元数据引用的业务 ID（属性 ID、分类 ID 等）；ref_all=true 时该字段应为 0</p>
     */
    public void setRefValueId(String RefValueId) {
        this.RefValueId = RefValueId;
    }

    /**
     * Get <p>元数据使用场景：1=仅检索使用，2=检索和生成都使用<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>仅检索使用</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>检索和生成都使用</td></tr></tbody></table></p> 
     * @return Scene <p>元数据使用场景：1=仅检索使用，2=检索和生成都使用<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>仅检索使用</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>检索和生成都使用</td></tr></tbody></table></p>
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set <p>元数据使用场景：1=仅检索使用，2=检索和生成都使用<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>仅检索使用</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>检索和生成都使用</td></tr></tbody></table></p>
     * @param Scene <p>元数据使用场景：1=仅检索使用，2=检索和生成都使用<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_SCENE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_SCENE_SEARCH_ONLY</td><td>1</td><td>仅检索使用</td></tr><tr><td>META_SCENE_ALL</td><td>2</td><td>检索和生成都使用</td></tr></tbody></table></p>
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>元数据值类型：1=属性标签，2=文档分类，3=问答分类<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>属性标签</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>文档分类</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>问答分类</td></tr></tbody></table></p> 
     * @return ValueType <p>元数据值类型：1=属性标签，2=文档分类，3=问答分类<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>属性标签</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>文档分类</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>问答分类</td></tr></tbody></table></p>
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>元数据值类型：1=属性标签，2=文档分类，3=问答分类<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>属性标签</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>文档分类</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>问答分类</td></tr></tbody></table></p>
     * @param ValueType <p>元数据值类型：1=属性标签，2=文档分类，3=问答分类<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>META_VALUE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>META_VALUE_TYPE_TAG</td><td>1</td><td>属性标签</td></tr><tr><td>META_VALUE_TYPE_DOC_CATEGORY</td><td>2</td><td>文档分类</td></tr><tr><td>META_VALUE_TYPE_QA_CATEGORY</td><td>3</td><td>问答分类</td></tr></tbody></table></p>
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    public MetaValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaValue(MetaValue source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RefAll != null) {
            this.RefAll = new Boolean(source.RefAll);
        }
        if (source.RefValueId != null) {
            this.RefValueId = new String(source.RefValueId);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RefAll", this.RefAll);
        this.setParamSimple(map, prefix + "RefValueId", this.RefValueId);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

