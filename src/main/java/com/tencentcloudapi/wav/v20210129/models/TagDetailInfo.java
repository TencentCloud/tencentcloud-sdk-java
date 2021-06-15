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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagDetailInfo extends AbstractModel{

    /**
    * 标签名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 标签业务ID
    */
    @SerializedName("BizTagId")
    @Expose
    private String BizTagId;

    /**
    * 企微标签ID
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * 标签排序的次序值，sort值大的排序靠前。有效的值范围是[0, 2^32)
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 标签创建时间,单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 标签名称 
     * @return TagName 标签名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名称
     * @param TagName 标签名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 标签业务ID 
     * @return BizTagId 标签业务ID
     */
    public String getBizTagId() {
        return this.BizTagId;
    }

    /**
     * Set 标签业务ID
     * @param BizTagId 标签业务ID
     */
    public void setBizTagId(String BizTagId) {
        this.BizTagId = BizTagId;
    }

    /**
     * Get 企微标签ID 
     * @return TagId 企微标签ID
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set 企微标签ID
     * @param TagId 企微标签ID
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 标签排序的次序值，sort值大的排序靠前。有效的值范围是[0, 2^32) 
     * @return Sort 标签排序的次序值，sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 标签排序的次序值，sort值大的排序靠前。有效的值范围是[0, 2^32)
     * @param Sort 标签排序的次序值，sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 标签创建时间,单位为秒 
     * @return CreateTime 标签创建时间,单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 标签创建时间,单位为秒
     * @param CreateTime 标签创建时间,单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public TagDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagDetailInfo(TagDetailInfo source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.BizTagId != null) {
            this.BizTagId = new String(source.BizTagId);
        }
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "BizTagId", this.BizTagId);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

