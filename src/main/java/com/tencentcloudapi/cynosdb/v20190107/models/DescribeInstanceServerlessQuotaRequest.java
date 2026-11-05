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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceServerlessQuotaRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul> 
     * @return InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     * @param InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeInstanceServerlessQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceServerlessQuotaRequest(DescribeInstanceServerlessQuotaRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

