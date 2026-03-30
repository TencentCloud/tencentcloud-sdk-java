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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIWorkbenchSREDigitalTwinTaskListRequest extends AbstractModel {

    /**
    * 数字分身ID
    */
    @SerializedName("TwinID")
    @Expose
    private Long TwinID;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 数字分身ID 
     * @return TwinID 数字分身ID
     */
    public Long getTwinID() {
        return this.TwinID;
    }

    /**
     * Set 数字分身ID
     * @param TwinID 数字分身ID
     */
    public void setTwinID(Long TwinID) {
        this.TwinID = TwinID;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量限制 
     * @return Limit 数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制
     * @param Limit 数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAIWorkbenchSREDigitalTwinTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIWorkbenchSREDigitalTwinTaskListRequest(DescribeAIWorkbenchSREDigitalTwinTaskListRequest source) {
        if (source.TwinID != null) {
            this.TwinID = new Long(source.TwinID);
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
        this.setParamSimple(map, prefix + "TwinID", this.TwinID);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

