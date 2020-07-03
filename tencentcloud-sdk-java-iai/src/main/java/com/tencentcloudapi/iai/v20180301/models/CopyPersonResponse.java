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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyPersonResponse extends AbstractModel{

    /**
    * 成功加入的人员库数量
    */
    @SerializedName("SucGroupNum")
    @Expose
    private Long SucGroupNum;

    /**
    * 成功加入的人员库列表
    */
    @SerializedName("SucGroupIds")
    @Expose
    private String [] SucGroupIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功加入的人员库数量 
     * @return SucGroupNum 成功加入的人员库数量
     */
    public Long getSucGroupNum() {
        return this.SucGroupNum;
    }

    /**
     * Set 成功加入的人员库数量
     * @param SucGroupNum 成功加入的人员库数量
     */
    public void setSucGroupNum(Long SucGroupNum) {
        this.SucGroupNum = SucGroupNum;
    }

    /**
     * Get 成功加入的人员库列表 
     * @return SucGroupIds 成功加入的人员库列表
     */
    public String [] getSucGroupIds() {
        return this.SucGroupIds;
    }

    /**
     * Set 成功加入的人员库列表
     * @param SucGroupIds 成功加入的人员库列表
     */
    public void setSucGroupIds(String [] SucGroupIds) {
        this.SucGroupIds = SucGroupIds;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SucGroupNum", this.SucGroupNum);
        this.setParamArraySimple(map, prefix + "SucGroupIds.", this.SucGroupIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

