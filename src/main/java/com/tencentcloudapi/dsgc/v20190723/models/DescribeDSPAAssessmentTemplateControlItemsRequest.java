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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentTemplateControlItemsRequest extends AbstractModel {

    /**
    * DSPA实例Id。格式“dspa-xxxxxxxx”
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 评估模版Id。格式“template-xxxxxxxx”
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 偏移量。默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 结果集个数限制。默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤项。
支持模糊搜索：ItemId，ItemName
支持过滤：
Source：评估项来源，system / user
ItemType：评估项类型，questionnaire / auto
ItemSubType：评估项子类型
Status：评估项启用状态，draft / launched
    */
    @SerializedName("Filters")
    @Expose
    private DspaAssessmentFilter [] Filters;

    /**
     * Get DSPA实例Id。格式“dspa-xxxxxxxx” 
     * @return DspaId DSPA实例Id。格式“dspa-xxxxxxxx”
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id。格式“dspa-xxxxxxxx”
     * @param DspaId DSPA实例Id。格式“dspa-xxxxxxxx”
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 评估模版Id。格式“template-xxxxxxxx” 
     * @return TemplateId 评估模版Id。格式“template-xxxxxxxx”
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模版Id。格式“template-xxxxxxxx”
     * @param TemplateId 评估模版Id。格式“template-xxxxxxxx”
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 偏移量。默认为0 
     * @return Offset 偏移量。默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。默认为0
     * @param Offset 偏移量。默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 结果集个数限制。默认为20，最大值为100 
     * @return Limit 结果集个数限制。默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果集个数限制。默认为20，最大值为100
     * @param Limit 结果集个数限制。默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤项。
支持模糊搜索：ItemId，ItemName
支持过滤：
Source：评估项来源，system / user
ItemType：评估项类型，questionnaire / auto
ItemSubType：评估项子类型
Status：评估项启用状态，draft / launched 
     * @return Filters 过滤项。
支持模糊搜索：ItemId，ItemName
支持过滤：
Source：评估项来源，system / user
ItemType：评估项类型，questionnaire / auto
ItemSubType：评估项子类型
Status：评估项启用状态，draft / launched
     */
    public DspaAssessmentFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤项。
支持模糊搜索：ItemId，ItemName
支持过滤：
Source：评估项来源，system / user
ItemType：评估项类型，questionnaire / auto
ItemSubType：评估项子类型
Status：评估项启用状态，draft / launched
     * @param Filters 过滤项。
支持模糊搜索：ItemId，ItemName
支持过滤：
Source：评估项来源，system / user
ItemType：评估项类型，questionnaire / auto
ItemSubType：评估项子类型
Status：评估项启用状态，draft / launched
     */
    public void setFilters(DspaAssessmentFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDSPAAssessmentTemplateControlItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentTemplateControlItemsRequest(DescribeDSPAAssessmentTemplateControlItemsRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new DspaAssessmentFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DspaAssessmentFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

