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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenSSLRequest extends AbstractModel {

    /**
    * <p>实例 ID。只读组 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>只读组 ID。实例 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/api/236/40939">DescribeRoGroups</a> 接口获取。</p>
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
     * Get <p>实例 ID。只读组 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。只读组 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。只读组 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。只读组 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>只读组 ID。实例 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/api/236/40939">DescribeRoGroups</a> 接口获取。</p> 
     * @return RoGroupId <p>只读组 ID。实例 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/api/236/40939">DescribeRoGroups</a> 接口获取。</p>
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set <p>只读组 ID。实例 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/api/236/40939">DescribeRoGroups</a> 接口获取。</p>
     * @param RoGroupId <p>只读组 ID。实例 ID 为空时必填。可通过 <a href="https://cloud.tencent.com/document/api/236/40939">DescribeRoGroups</a> 接口获取。</p>
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    public OpenSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenSSLRequest(OpenSSLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);

    }
}

