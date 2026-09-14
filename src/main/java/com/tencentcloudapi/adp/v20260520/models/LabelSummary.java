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

public class LabelSummary extends AbstractModel {

    /**
    * <p>标签 ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>元数据配置（该标签被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaValue")
    @Expose
    private MetaValue MetaValue;

    /**
    * <p>标签名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>引用该标签的资源数</p>
    */
    @SerializedName("RefCount")
    @Expose
    private Long RefCount;

    /**
    * <p>标签值（标准词 + 同义词列表）</p>
    */
    @SerializedName("TermList")
    @Expose
    private LabelTerm [] TermList;

    /**
    * <p>标签值总数</p>
    */
    @SerializedName("TermTotalCount")
    @Expose
    private Long TermTotalCount;

    /**
     * Get <p>标签 ID</p> 
     * @return LabelId <p>标签 ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签 ID</p>
     * @param LabelId <p>标签 ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>元数据配置（该标签被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaValue <p>元数据配置（该标签被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaValue getMetaValue() {
        return this.MetaValue;
    }

    /**
     * Set <p>元数据配置（该标签被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaValue <p>元数据配置（该标签被设置为元数据时的配置信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaValue(MetaValue MetaValue) {
        this.MetaValue = MetaValue;
    }

    /**
     * Get <p>标签名称</p> 
     * @return Name <p>标签名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称</p>
     * @param Name <p>标签名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>引用该标签的资源数</p> 
     * @return RefCount <p>引用该标签的资源数</p>
     */
    public Long getRefCount() {
        return this.RefCount;
    }

    /**
     * Set <p>引用该标签的资源数</p>
     * @param RefCount <p>引用该标签的资源数</p>
     */
    public void setRefCount(Long RefCount) {
        this.RefCount = RefCount;
    }

    /**
     * Get <p>标签值（标准词 + 同义词列表）</p> 
     * @return TermList <p>标签值（标准词 + 同义词列表）</p>
     */
    public LabelTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>标签值（标准词 + 同义词列表）</p>
     * @param TermList <p>标签值（标准词 + 同义词列表）</p>
     */
    public void setTermList(LabelTerm [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get <p>标签值总数</p> 
     * @return TermTotalCount <p>标签值总数</p>
     */
    public Long getTermTotalCount() {
        return this.TermTotalCount;
    }

    /**
     * Set <p>标签值总数</p>
     * @param TermTotalCount <p>标签值总数</p>
     */
    public void setTermTotalCount(Long TermTotalCount) {
        this.TermTotalCount = TermTotalCount;
    }

    public LabelSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelSummary(LabelSummary source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.MetaValue != null) {
            this.MetaValue = new MetaValue(source.MetaValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RefCount != null) {
            this.RefCount = new Long(source.RefCount);
        }
        if (source.TermList != null) {
            this.TermList = new LabelTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new LabelTerm(source.TermList[i]);
            }
        }
        if (source.TermTotalCount != null) {
            this.TermTotalCount = new Long(source.TermTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamObj(map, prefix + "MetaValue.", this.MetaValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RefCount", this.RefCount);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "TermTotalCount", this.TermTotalCount);

    }
}

