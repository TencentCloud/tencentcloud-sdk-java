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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileTamperEventRuleInfoRequest extends AbstractModel {

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 一页多少个 控制返回的uuids条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 控制返回的uuids条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 一页多少个 控制返回的uuids条数 
     * @return Limit 一页多少个 控制返回的uuids条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页多少个 控制返回的uuids条数
     * @param Limit 一页多少个 控制返回的uuids条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 控制返回的uuids条数 
     * @return Offset 控制返回的uuids条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 控制返回的uuids条数
     * @param Offset 控制返回的uuids条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeFileTamperEventRuleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileTamperEventRuleInfoRequest(DescribeFileTamperEventRuleInfoRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

