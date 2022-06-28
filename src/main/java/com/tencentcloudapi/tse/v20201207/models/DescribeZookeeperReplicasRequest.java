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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZookeeperReplicasRequest extends AbstractModel{

    /**
    * 注册引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 副本列表Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 副本列表Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 注册引擎实例ID 
     * @return InstanceId 注册引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 注册引擎实例ID
     * @param InstanceId 注册引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 副本列表Limit 
     * @return Limit 副本列表Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 副本列表Limit
     * @param Limit 副本列表Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 副本列表Offset 
     * @return Offset 副本列表Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 副本列表Offset
     * @param Offset 副本列表Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeZookeeperReplicasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZookeeperReplicasRequest(DescribeZookeeperReplicasRequest source) {
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

