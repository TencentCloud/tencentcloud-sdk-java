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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBootScriptRequest extends AbstractModel {

    /**
    * EMR实例序列号
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 引导脚本类型，resourceAfter,clusterAfter,clusterBefore不填时表示全部时机
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
     * Get EMR实例序列号 
     * @return InstanceId EMR实例序列号
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR实例序列号
     * @param InstanceId EMR实例序列号
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 引导脚本类型，resourceAfter,clusterAfter,clusterBefore不填时表示全部时机 
     * @return BootType 引导脚本类型，resourceAfter,clusterAfter,clusterBefore不填时表示全部时机
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set 引导脚本类型，resourceAfter,clusterAfter,clusterBefore不填时表示全部时机
     * @param BootType 引导脚本类型，resourceAfter,clusterAfter,clusterBefore不填时表示全部时机
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    public DescribeBootScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBootScriptRequest(DescribeBootScriptRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BootType", this.BootType);

    }
}

