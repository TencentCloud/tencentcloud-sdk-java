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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceUpgradeCheckJobRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标数据库版本。
说明：可选值5.6、5.7、8.0，不支持跨版本升级，升级后不支持版本降级。
    */
    @SerializedName("DstMysqlVersion")
    @Expose
    private String DstMysqlVersion;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标数据库版本。
说明：可选值5.6、5.7、8.0，不支持跨版本升级，升级后不支持版本降级。 
     * @return DstMysqlVersion 目标数据库版本。
说明：可选值5.6、5.7、8.0，不支持跨版本升级，升级后不支持版本降级。
     */
    public String getDstMysqlVersion() {
        return this.DstMysqlVersion;
    }

    /**
     * Set 目标数据库版本。
说明：可选值5.6、5.7、8.0，不支持跨版本升级，升级后不支持版本降级。
     * @param DstMysqlVersion 目标数据库版本。
说明：可选值5.6、5.7、8.0，不支持跨版本升级，升级后不支持版本降级。
     */
    public void setDstMysqlVersion(String DstMysqlVersion) {
        this.DstMysqlVersion = DstMysqlVersion;
    }

    public DescribeInstanceUpgradeCheckJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUpgradeCheckJobRequest(DescribeInstanceUpgradeCheckJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstMysqlVersion != null) {
            this.DstMysqlVersion = new String(source.DstMysqlVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstMysqlVersion", this.DstMysqlVersion);

    }
}

