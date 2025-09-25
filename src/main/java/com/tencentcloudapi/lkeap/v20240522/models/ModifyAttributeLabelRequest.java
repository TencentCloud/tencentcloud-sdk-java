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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAttributeLabelRequest extends AbstractModel {

    /**
    * 说明：知识库ID
备注：通过创建知识库接口（DeleteKnowledgeBase）得到知识库ID（KnowledgeBaseId）
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 说明：属性ID
备注：通过CreateAttributeLabel接口创建属性时会生成AttributeId，通过ListAttributeLabels接口可查询得到AttributeId、AttributeKey、AttributeName以及LabelId、LabelName的对应关系
    */
    @SerializedName("AttributeId")
    @Expose
    private String AttributeId;

    /**
    * 说明：属性标识，
备注：仅支持英文字符，不支持数字，支持下划线。最大支持40个英文字符，如style
    */
    @SerializedName("AttributeKey")
    @Expose
    private String AttributeKey;

    /**
    * 说明：属性名称
备注：支持中英文字符。最大支持80个中英文字符，如风格
    */
    @SerializedName("AttributeName")
    @Expose
    private String AttributeName;

    /**
    * 说明：标签ID（LabelId）以及标签名（LabelName）
备注：
- 不填写LabelId，默认在当前AttributeId下新增标签值（LabelName）；
- 若填写该AttributeId下的LabelId以及LabelName，则为修改该LabelId对应的标签值
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabelItem [] Labels;

    /**
    * 说明：删除的标签id
    */
    @SerializedName("DeleteLabelIds")
    @Expose
    private String [] DeleteLabelIds;

    /**
     * Get 说明：知识库ID
备注：通过创建知识库接口（DeleteKnowledgeBase）得到知识库ID（KnowledgeBaseId） 
     * @return KnowledgeBaseId 说明：知识库ID
备注：通过创建知识库接口（DeleteKnowledgeBase）得到知识库ID（KnowledgeBaseId）
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 说明：知识库ID
备注：通过创建知识库接口（DeleteKnowledgeBase）得到知识库ID（KnowledgeBaseId）
     * @param KnowledgeBaseId 说明：知识库ID
备注：通过创建知识库接口（DeleteKnowledgeBase）得到知识库ID（KnowledgeBaseId）
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 说明：属性ID
备注：通过CreateAttributeLabel接口创建属性时会生成AttributeId，通过ListAttributeLabels接口可查询得到AttributeId、AttributeKey、AttributeName以及LabelId、LabelName的对应关系 
     * @return AttributeId 说明：属性ID
备注：通过CreateAttributeLabel接口创建属性时会生成AttributeId，通过ListAttributeLabels接口可查询得到AttributeId、AttributeKey、AttributeName以及LabelId、LabelName的对应关系
     */
    public String getAttributeId() {
        return this.AttributeId;
    }

    /**
     * Set 说明：属性ID
备注：通过CreateAttributeLabel接口创建属性时会生成AttributeId，通过ListAttributeLabels接口可查询得到AttributeId、AttributeKey、AttributeName以及LabelId、LabelName的对应关系
     * @param AttributeId 说明：属性ID
备注：通过CreateAttributeLabel接口创建属性时会生成AttributeId，通过ListAttributeLabels接口可查询得到AttributeId、AttributeKey、AttributeName以及LabelId、LabelName的对应关系
     */
    public void setAttributeId(String AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * Get 说明：属性标识，
备注：仅支持英文字符，不支持数字，支持下划线。最大支持40个英文字符，如style 
     * @return AttributeKey 说明：属性标识，
备注：仅支持英文字符，不支持数字，支持下划线。最大支持40个英文字符，如style
     */
    public String getAttributeKey() {
        return this.AttributeKey;
    }

    /**
     * Set 说明：属性标识，
备注：仅支持英文字符，不支持数字，支持下划线。最大支持40个英文字符，如style
     * @param AttributeKey 说明：属性标识，
备注：仅支持英文字符，不支持数字，支持下划线。最大支持40个英文字符，如style
     */
    public void setAttributeKey(String AttributeKey) {
        this.AttributeKey = AttributeKey;
    }

    /**
     * Get 说明：属性名称
备注：支持中英文字符。最大支持80个中英文字符，如风格 
     * @return AttributeName 说明：属性名称
备注：支持中英文字符。最大支持80个中英文字符，如风格
     */
    public String getAttributeName() {
        return this.AttributeName;
    }

    /**
     * Set 说明：属性名称
备注：支持中英文字符。最大支持80个中英文字符，如风格
     * @param AttributeName 说明：属性名称
备注：支持中英文字符。最大支持80个中英文字符，如风格
     */
    public void setAttributeName(String AttributeName) {
        this.AttributeName = AttributeName;
    }

    /**
     * Get 说明：标签ID（LabelId）以及标签名（LabelName）
备注：
- 不填写LabelId，默认在当前AttributeId下新增标签值（LabelName）；
- 若填写该AttributeId下的LabelId以及LabelName，则为修改该LabelId对应的标签值 
     * @return Labels 说明：标签ID（LabelId）以及标签名（LabelName）
备注：
- 不填写LabelId，默认在当前AttributeId下新增标签值（LabelName）；
- 若填写该AttributeId下的LabelId以及LabelName，则为修改该LabelId对应的标签值
     */
    public AttributeLabelItem [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 说明：标签ID（LabelId）以及标签名（LabelName）
备注：
- 不填写LabelId，默认在当前AttributeId下新增标签值（LabelName）；
- 若填写该AttributeId下的LabelId以及LabelName，则为修改该LabelId对应的标签值
     * @param Labels 说明：标签ID（LabelId）以及标签名（LabelName）
备注：
- 不填写LabelId，默认在当前AttributeId下新增标签值（LabelName）；
- 若填写该AttributeId下的LabelId以及LabelName，则为修改该LabelId对应的标签值
     */
    public void setLabels(AttributeLabelItem [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 说明：删除的标签id 
     * @return DeleteLabelIds 说明：删除的标签id
     */
    public String [] getDeleteLabelIds() {
        return this.DeleteLabelIds;
    }

    /**
     * Set 说明：删除的标签id
     * @param DeleteLabelIds 说明：删除的标签id
     */
    public void setDeleteLabelIds(String [] DeleteLabelIds) {
        this.DeleteLabelIds = DeleteLabelIds;
    }

    public ModifyAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAttributeLabelRequest(ModifyAttributeLabelRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.AttributeId != null) {
            this.AttributeId = new String(source.AttributeId);
        }
        if (source.AttributeKey != null) {
            this.AttributeKey = new String(source.AttributeKey);
        }
        if (source.AttributeName != null) {
            this.AttributeName = new String(source.AttributeName);
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabelItem[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabelItem(source.Labels[i]);
            }
        }
        if (source.DeleteLabelIds != null) {
            this.DeleteLabelIds = new String[source.DeleteLabelIds.length];
            for (int i = 0; i < source.DeleteLabelIds.length; i++) {
                this.DeleteLabelIds[i] = new String(source.DeleteLabelIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamSimple(map, prefix + "AttributeKey", this.AttributeKey);
        this.setParamSimple(map, prefix + "AttributeName", this.AttributeName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "DeleteLabelIds.", this.DeleteLabelIds);

    }
}

