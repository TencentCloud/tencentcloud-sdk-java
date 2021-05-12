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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodeInfoRequest extends AbstractModel{

    /**
    * 实例ID，形如tdsql-6ltok4u9
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 一次最多返回多少条数据。默认为无穷大，返回符合要求的所有数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回数据的偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID，形如tdsql-6ltok4u9 
     * @return InstanceId 实例ID，形如tdsql-6ltok4u9
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如tdsql-6ltok4u9
     * @param InstanceId 实例ID，形如tdsql-6ltok4u9
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 一次最多返回多少条数据。默认为无穷大，返回符合要求的所有数据 
     * @return Limit 一次最多返回多少条数据。默认为无穷大，返回符合要求的所有数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一次最多返回多少条数据。默认为无穷大，返回符合要求的所有数据
     * @param Limit 一次最多返回多少条数据。默认为无穷大，返回符合要求的所有数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回数据的偏移量，默认为0 
     * @return Offset 返回数据的偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回数据的偏移量，默认为0
     * @param Offset 返回数据的偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInstanceNodeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodeInfoRequest(DescribeInstanceNodeInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

