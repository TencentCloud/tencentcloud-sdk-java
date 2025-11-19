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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAssociationRequest extends AbstractModel {

    /**
    * 关联的产品名，当前只支持Prometheus
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 业务系统名
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 关联的产品名，当前只支持Prometheus 
     * @return ProductName 关联的产品名，当前只支持Prometheus
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 关联的产品名，当前只支持Prometheus
     * @param ProductName 关联的产品名，当前只支持Prometheus
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 业务系统名 
     * @return InstanceId 业务系统名
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统名
     * @param InstanceId 业务系统名
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeApmAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmAssociationRequest(DescribeApmAssociationRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

