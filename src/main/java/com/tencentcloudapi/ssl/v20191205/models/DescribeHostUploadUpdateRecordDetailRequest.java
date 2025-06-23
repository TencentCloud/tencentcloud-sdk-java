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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostUploadUpdateRecordDetailRequest extends AbstractModel {

    /**
    * 托管记录ID
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * 每页数量，默认为10，最大为200， 超过200则为200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 托管记录ID 
     * @return DeployRecordId 托管记录ID
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 托管记录ID
     * @param DeployRecordId 托管记录ID
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 每页数量，默认为10，最大为200， 超过200则为200 
     * @return Limit 每页数量，默认为10，最大为200， 超过200则为200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认为10，最大为200， 超过200则为200
     * @param Limit 每页数量，默认为10，最大为200， 超过200则为200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public DescribeHostUploadUpdateRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUploadUpdateRecordDetailRequest(DescribeHostUploadUpdateRecordDetailRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
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
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

