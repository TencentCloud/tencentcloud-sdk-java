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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePositionFenceListRequest extends AbstractModel{

    /**
    * 位置空间Id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 翻页偏移量，0起始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大返回结果数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 位置空间Id 
     * @return SpaceId 位置空间Id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 位置空间Id
     * @param SpaceId 位置空间Id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 翻页偏移量，0起始 
     * @return Offset 翻页偏移量，0起始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量，0起始
     * @param Offset 翻页偏移量，0起始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大返回结果数 
     * @return Limit 最大返回结果数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大返回结果数
     * @param Limit 最大返回结果数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePositionFenceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePositionFenceListRequest(DescribePositionFenceListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

