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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>CLS服务所在地域</p>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
     * Get <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 MongoDB 控制台在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>CLS服务所在地域</p> 
     * @return CLSRegion <p>CLS服务所在地域</p>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set <p>CLS服务所在地域</p>
     * @param CLSRegion <p>CLS服务所在地域</p>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    public DescribeDBInstanceLogToCLSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceLogToCLSRequest(DescribeDBInstanceLogToCLSRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);

    }
}

