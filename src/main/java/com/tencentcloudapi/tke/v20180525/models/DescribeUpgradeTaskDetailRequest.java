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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeTaskDetailRequest extends AbstractModel {

    /**
    * 升级任务ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条目数，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 升级任务ID 
     * @return ID 升级任务ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 升级任务ID
     * @param ID 升级任务ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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
     * Get 最大输出条目数，默认为20 
     * @return Limit 最大输出条目数，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条目数，默认为20
     * @param Limit 最大输出条目数，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUpgradeTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeTaskDetailRequest(DescribeUpgradeTaskDetailRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

