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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCustomizationListRequest extends AbstractModel{

    /**
    * 标签信息，格式为“$TagKey : $TagValue ”，中间分隔符为“空格”+“:”+“空格”
    */
    @SerializedName("TagInfos")
    @Expose
    private String [] TagInfos;

    /**
    * 分页大小，默认1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页offset，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 标签信息，格式为“$TagKey : $TagValue ”，中间分隔符为“空格”+“:”+“空格” 
     * @return TagInfos 标签信息，格式为“$TagKey : $TagValue ”，中间分隔符为“空格”+“:”+“空格”
     */
    public String [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set 标签信息，格式为“$TagKey : $TagValue ”，中间分隔符为“空格”+“:”+“空格”
     * @param TagInfos 标签信息，格式为“$TagKey : $TagValue ”，中间分隔符为“空格”+“:”+“空格”
     */
    public void setTagInfos(String [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    /**
     * Get 分页大小，默认1000 
     * @return Limit 分页大小，默认1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认1000
     * @param Limit 分页大小，默认1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页offset，默认0 
     * @return Offset 分页offset，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页offset，默认0
     * @param Offset 分页offset，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public GetCustomizationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCustomizationListRequest(GetCustomizationListRequest source) {
        if (source.TagInfos != null) {
            this.TagInfos = new String[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new String(source.TagInfos[i]);
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
        this.setParamArraySimple(map, prefix + "TagInfos.", this.TagInfos);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

