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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInvokerRequest extends AbstractModel {

    /**
    * 待删除的执行器ID。

可通过 [DescribeInvokers(查询执行器)](https://cloud.tencent.com/document/api/1340/61759) 接口获取。
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
     * Get 待删除的执行器ID。

可通过 [DescribeInvokers(查询执行器)](https://cloud.tencent.com/document/api/1340/61759) 接口获取。 
     * @return InvokerId 待删除的执行器ID。

可通过 [DescribeInvokers(查询执行器)](https://cloud.tencent.com/document/api/1340/61759) 接口获取。
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set 待删除的执行器ID。

可通过 [DescribeInvokers(查询执行器)](https://cloud.tencent.com/document/api/1340/61759) 接口获取。
     * @param InvokerId 待删除的执行器ID。

可通过 [DescribeInvokers(查询执行器)](https://cloud.tencent.com/document/api/1340/61759) 接口获取。
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    public DeleteInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInvokerRequest(DeleteInvokerRequest source) {
        if (source.InvokerId != null) {
            this.InvokerId = new String(source.InvokerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerId", this.InvokerId);

    }
}

