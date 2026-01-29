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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDocAttrRangeRequest extends AbstractModel {

    /**
    * 应用ID，获取方法参看[如何获取   BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 文档ID
    */
    @SerializedName("DocBizIds")
    @Expose
    private String [] DocBizIds;

    /**
    * 属性标签适用范围 1：全部，2：按条件
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 属性标签引用，LabelBizIds可通过 DescribeAttributeLabel 接口获取
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
     * Get 应用ID，获取方法参看[如何获取   BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa) 
     * @return BotBizId 应用ID，获取方法参看[如何获取   BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID，获取方法参看[如何获取   BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     * @param BotBizId 应用ID，获取方法参看[如何获取   BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 文档ID 
     * @return DocBizIds 文档ID
     */
    public String [] getDocBizIds() {
        return this.DocBizIds;
    }

    /**
     * Set 文档ID
     * @param DocBizIds 文档ID
     */
    public void setDocBizIds(String [] DocBizIds) {
        this.DocBizIds = DocBizIds;
    }

    /**
     * Get 属性标签适用范围 1：全部，2：按条件 
     * @return AttrRange 属性标签适用范围 1：全部，2：按条件
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 属性标签适用范围 1：全部，2：按条件
     * @param AttrRange 属性标签适用范围 1：全部，2：按条件
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 属性标签引用，LabelBizIds可通过 DescribeAttributeLabel 接口获取 
     * @return AttrLabels 属性标签引用，LabelBizIds可通过 DescribeAttributeLabel 接口获取
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 属性标签引用，LabelBizIds可通过 DescribeAttributeLabel 接口获取
     * @param AttrLabels 属性标签引用，LabelBizIds可通过 DescribeAttributeLabel 接口获取
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    public ModifyDocAttrRangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocAttrRangeRequest(ModifyDocAttrRangeRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.DocBizIds != null) {
            this.DocBizIds = new String[source.DocBizIds.length];
            for (int i = 0; i < source.DocBizIds.length; i++) {
                this.DocBizIds[i] = new String(source.DocBizIds[i]);
            }
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "DocBizIds.", this.DocBizIds);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);

    }
}

