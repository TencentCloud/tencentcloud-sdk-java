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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonRequest extends AbstractModel{

    /**
    * 卖场编码
    */
    @SerializedName("MallId")
    @Expose
    private String MallId;

    /**
    * 查询偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数量，默认20，最大查询数量100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 卖场编码 
     * @return MallId 卖场编码
     */
    public String getMallId() {
        return this.MallId;
    }

    /**
     * Set 卖场编码
     * @param MallId 卖场编码
     */
    public void setMallId(String MallId) {
        this.MallId = MallId;
    }

    /**
     * Get 查询偏移 
     * @return Offset 查询偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移
     * @param Offset 查询偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数量，默认20，最大查询数量100 
     * @return Limit 查询数量，默认20，最大查询数量100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量，默认20，最大查询数量100
     * @param Limit 查询数量，默认20，最大查询数量100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

