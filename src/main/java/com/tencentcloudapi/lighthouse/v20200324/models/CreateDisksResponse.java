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

public class CreateDisksResponse extends AbstractModel{

    /**
    * 当通过本接口来创建云硬盘时会返回该参数，表示一个或多个云硬盘ID。返回云硬盘ID列表并不代表云硬盘创建成功。

可根据 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询返回的DiskSet中对应云硬盘的ID的状态来判断创建是否完成；如果云硬盘状态由“PENDING”变为“UNATTACHED”或“ATTACHED”，则为创建成功。
    */
    @SerializedName("DiskIdSet")
    @Expose
    private String [] DiskIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当通过本接口来创建云硬盘时会返回该参数，表示一个或多个云硬盘ID。返回云硬盘ID列表并不代表云硬盘创建成功。

可根据 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询返回的DiskSet中对应云硬盘的ID的状态来判断创建是否完成；如果云硬盘状态由“PENDING”变为“UNATTACHED”或“ATTACHED”，则为创建成功。 
     * @return DiskIdSet 当通过本接口来创建云硬盘时会返回该参数，表示一个或多个云硬盘ID。返回云硬盘ID列表并不代表云硬盘创建成功。

可根据 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询返回的DiskSet中对应云硬盘的ID的状态来判断创建是否完成；如果云硬盘状态由“PENDING”变为“UNATTACHED”或“ATTACHED”，则为创建成功。
     */
    public String [] getDiskIdSet() {
        return this.DiskIdSet;
    }

    /**
     * Set 当通过本接口来创建云硬盘时会返回该参数，表示一个或多个云硬盘ID。返回云硬盘ID列表并不代表云硬盘创建成功。

可根据 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询返回的DiskSet中对应云硬盘的ID的状态来判断创建是否完成；如果云硬盘状态由“PENDING”变为“UNATTACHED”或“ATTACHED”，则为创建成功。
     * @param DiskIdSet 当通过本接口来创建云硬盘时会返回该参数，表示一个或多个云硬盘ID。返回云硬盘ID列表并不代表云硬盘创建成功。

可根据 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询返回的DiskSet中对应云硬盘的ID的状态来判断创建是否完成；如果云硬盘状态由“PENDING”变为“UNATTACHED”或“ATTACHED”，则为创建成功。
     */
    public void setDiskIdSet(String [] DiskIdSet) {
        this.DiskIdSet = DiskIdSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDisksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisksResponse(CreateDisksResponse source) {
        if (source.DiskIdSet != null) {
            this.DiskIdSet = new String[source.DiskIdSet.length];
            for (int i = 0; i < source.DiskIdSet.length; i++) {
                this.DiskIdSet[i] = new String(source.DiskIdSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIdSet.", this.DiskIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

