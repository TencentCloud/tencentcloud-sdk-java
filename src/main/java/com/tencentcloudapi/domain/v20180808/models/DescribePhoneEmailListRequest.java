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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePhoneEmailListRequest extends AbstractModel{

    /**
    * 0：所有类型  1：手机  2：邮箱，默认0
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，取值范围[1,200]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 手机或者邮箱精确搜索
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 0：所有类型  1：手机  2：邮箱，默认0 
     * @return Type 0：所有类型  1：手机  2：邮箱，默认0
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0：所有类型  1：手机  2：邮箱，默认0
     * @param Type 0：所有类型  1：手机  2：邮箱，默认0
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，取值范围[1,200] 
     * @return Limit 返回数量，默认为20，取值范围[1,200]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，取值范围[1,200]
     * @param Limit 返回数量，默认为20，取值范围[1,200]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 手机或者邮箱精确搜索 
     * @return Code 手机或者邮箱精确搜索
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 手机或者邮箱精确搜索
     * @param Code 手机或者邮箱精确搜索
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public DescribePhoneEmailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePhoneEmailListRequest(DescribePhoneEmailListRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

