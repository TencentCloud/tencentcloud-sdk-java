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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSwitchRecordsRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认值为 50，最小值为 1，最大值为 2000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页偏移量。 
     * @return Offset 分页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认值为 50，最小值为 1，最大值为 2000。 
     * @return Limit 分页大小，默认值为 50，最小值为 1，最大值为 2000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认值为 50，最小值为 1，最大值为 2000。
     * @param Limit 分页大小，默认值为 50，最小值为 1，最大值为 2000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

