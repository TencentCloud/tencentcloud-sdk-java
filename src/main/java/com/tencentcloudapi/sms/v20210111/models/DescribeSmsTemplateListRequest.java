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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsTemplateListRequest extends AbstractModel{

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 模板 ID 数组。数组为空时默认查询模板列表信息（仅允许主账号使用），请使用 Limit 和 Offset 字段设置查询范围。
<dx-alert infotype="notice" title="注意">默认数组长度最大100</dx-alert>
    */
    @SerializedName("TemplateIdSet")
    @Expose
    private Long [] TemplateIdSet;

    /**
    * 最大上限，最多100。
注：默认为0，TemplateIdSet 为空时启用。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量。
注：默认为0，TemplateIdSet 为空时启用。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 模板 ID 数组。数组为空时默认查询模板列表信息（仅允许主账号使用），请使用 Limit 和 Offset 字段设置查询范围。
<dx-alert infotype="notice" title="注意">默认数组长度最大100</dx-alert> 
     * @return TemplateIdSet 模板 ID 数组。数组为空时默认查询模板列表信息（仅允许主账号使用），请使用 Limit 和 Offset 字段设置查询范围。
<dx-alert infotype="notice" title="注意">默认数组长度最大100</dx-alert>
     */
    public Long [] getTemplateIdSet() {
        return this.TemplateIdSet;
    }

    /**
     * Set 模板 ID 数组。数组为空时默认查询模板列表信息（仅允许主账号使用），请使用 Limit 和 Offset 字段设置查询范围。
<dx-alert infotype="notice" title="注意">默认数组长度最大100</dx-alert>
     * @param TemplateIdSet 模板 ID 数组。数组为空时默认查询模板列表信息（仅允许主账号使用），请使用 Limit 和 Offset 字段设置查询范围。
<dx-alert infotype="notice" title="注意">默认数组长度最大100</dx-alert>
     */
    public void setTemplateIdSet(Long [] TemplateIdSet) {
        this.TemplateIdSet = TemplateIdSet;
    }

    /**
     * Get 最大上限，最多100。
注：默认为0，TemplateIdSet 为空时启用。 
     * @return Limit 最大上限，最多100。
注：默认为0，TemplateIdSet 为空时启用。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大上限，最多100。
注：默认为0，TemplateIdSet 为空时启用。
     * @param Limit 最大上限，最多100。
注：默认为0，TemplateIdSet 为空时启用。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。
注：默认为0，TemplateIdSet 为空时启用。 
     * @return Offset 偏移量。
注：默认为0，TemplateIdSet 为空时启用。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
注：默认为0，TemplateIdSet 为空时启用。
     * @param Offset 偏移量。
注：默认为0，TemplateIdSet 为空时启用。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSmsTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsTemplateListRequest(DescribeSmsTemplateListRequest source) {
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.TemplateIdSet != null) {
            this.TemplateIdSet = new Long[source.TemplateIdSet.length];
            for (int i = 0; i < source.TemplateIdSet.length; i++) {
                this.TemplateIdSet[i] = new Long(source.TemplateIdSet[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamArraySimple(map, prefix + "TemplateIdSet.", this.TemplateIdSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

