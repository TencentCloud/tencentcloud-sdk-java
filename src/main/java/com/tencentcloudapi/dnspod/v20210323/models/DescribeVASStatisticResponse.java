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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVASStatisticResponse extends AbstractModel{

    /**
    * 增值服务用量列表
    */
    @SerializedName("VASList")
    @Expose
    private VASStatisticItem [] VASList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 增值服务用量列表 
     * @return VASList 增值服务用量列表
     */
    public VASStatisticItem [] getVASList() {
        return this.VASList;
    }

    /**
     * Set 增值服务用量列表
     * @param VASList 增值服务用量列表
     */
    public void setVASList(VASStatisticItem [] VASList) {
        this.VASList = VASList;
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

    public DescribeVASStatisticResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVASStatisticResponse(DescribeVASStatisticResponse source) {
        if (source.VASList != null) {
            this.VASList = new VASStatisticItem[source.VASList.length];
            for (int i = 0; i < source.VASList.length; i++) {
                this.VASList[i] = new VASStatisticItem(source.VASList[i]);
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
        this.setParamArrayObj(map, prefix + "VASList.", this.VASList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

