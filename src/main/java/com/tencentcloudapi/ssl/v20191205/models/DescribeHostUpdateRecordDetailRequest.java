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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostUpdateRecordDetailRequest extends AbstractModel{

    /**
    * 一键更新记录ID
    */
    @SerializedName("DeployRecordId")
    @Expose
    private String DeployRecordId;

    /**
    * 每页数量，默认10。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 分页偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
     * Get 一键更新记录ID 
     * @return DeployRecordId 一键更新记录ID
     */
    public String getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 一键更新记录ID
     * @param DeployRecordId 一键更新记录ID
     */
    public void setDeployRecordId(String DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 每页数量，默认10。 
     * @return Limit 每页数量，默认10。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认10。
     * @param Limit 每页数量，默认10。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，从0开始。 
     * @return Offset 分页偏移量，从0开始。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始。
     * @param Offset 分页偏移量，从0开始。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    public DescribeHostUpdateRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordDetailRequest(DescribeHostUpdateRecordDetailRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new String(source.DeployRecordId);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
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

