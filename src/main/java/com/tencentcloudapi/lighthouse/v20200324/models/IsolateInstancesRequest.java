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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateInstancesRequest extends AbstractModel{

    /**
    * 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求退还实例和数据盘数量总计上限为20。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否退还挂载的数据盘。取值范围：
TRUE：表示退还实例同时退还其挂载的数据盘。
FALSE：表示退还实例同时不再退还其挂载的数据盘。
默认取值：TRUE。
    */
    @SerializedName("IsolateDataDisk")
    @Expose
    private Boolean IsolateDataDisk;

    /**
     * Get 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求退还实例和数据盘数量总计上限为20。 
     * @return InstanceIds 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求退还实例和数据盘数量总计上限为20。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求退还实例和数据盘数量总计上限为20。
     * @param InstanceIds 实例ID列表。一个或多个待操作的实例ID。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。每次请求退还实例和数据盘数量总计上限为20。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否退还挂载的数据盘。取值范围：
TRUE：表示退还实例同时退还其挂载的数据盘。
FALSE：表示退还实例同时不再退还其挂载的数据盘。
默认取值：TRUE。 
     * @return IsolateDataDisk 是否退还挂载的数据盘。取值范围：
TRUE：表示退还实例同时退还其挂载的数据盘。
FALSE：表示退还实例同时不再退还其挂载的数据盘。
默认取值：TRUE。
     */
    public Boolean getIsolateDataDisk() {
        return this.IsolateDataDisk;
    }

    /**
     * Set 是否退还挂载的数据盘。取值范围：
TRUE：表示退还实例同时退还其挂载的数据盘。
FALSE：表示退还实例同时不再退还其挂载的数据盘。
默认取值：TRUE。
     * @param IsolateDataDisk 是否退还挂载的数据盘。取值范围：
TRUE：表示退还实例同时退还其挂载的数据盘。
FALSE：表示退还实例同时不再退还其挂载的数据盘。
默认取值：TRUE。
     */
    public void setIsolateDataDisk(Boolean IsolateDataDisk) {
        this.IsolateDataDisk = IsolateDataDisk;
    }

    public IsolateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateInstancesRequest(IsolateInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.IsolateDataDisk != null) {
            this.IsolateDataDisk = new Boolean(source.IsolateDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "IsolateDataDisk", this.IsolateDataDisk);

    }
}

