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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockIPListResponse extends AbstractModel{

    /**
    * 返回的IP的数量
    */
    @SerializedName("BlockedIPCount")
    @Expose
    private Long BlockedIPCount;

    /**
    * 获取用户真实IP的字段
    */
    @SerializedName("ClientIPField")
    @Expose
    private String ClientIPField;

    /**
    * 加入了12360黑名单的IP列表
    */
    @SerializedName("BlockedIPList")
    @Expose
    private BlockedIP [] BlockedIPList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的IP的数量 
     * @return BlockedIPCount 返回的IP的数量
     */
    public Long getBlockedIPCount() {
        return this.BlockedIPCount;
    }

    /**
     * Set 返回的IP的数量
     * @param BlockedIPCount 返回的IP的数量
     */
    public void setBlockedIPCount(Long BlockedIPCount) {
        this.BlockedIPCount = BlockedIPCount;
    }

    /**
     * Get 获取用户真实IP的字段 
     * @return ClientIPField 获取用户真实IP的字段
     */
    public String getClientIPField() {
        return this.ClientIPField;
    }

    /**
     * Set 获取用户真实IP的字段
     * @param ClientIPField 获取用户真实IP的字段
     */
    public void setClientIPField(String ClientIPField) {
        this.ClientIPField = ClientIPField;
    }

    /**
     * Get 加入了12360黑名单的IP列表 
     * @return BlockedIPList 加入了12360黑名单的IP列表
     */
    public BlockedIP [] getBlockedIPList() {
        return this.BlockedIPList;
    }

    /**
     * Set 加入了12360黑名单的IP列表
     * @param BlockedIPList 加入了12360黑名单的IP列表
     */
    public void setBlockedIPList(BlockedIP [] BlockedIPList) {
        this.BlockedIPList = BlockedIPList;
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
        this.setParamSimple(map, prefix + "BlockedIPCount", this.BlockedIPCount);
        this.setParamSimple(map, prefix + "ClientIPField", this.ClientIPField);
        this.setParamArrayObj(map, prefix + "BlockedIPList.", this.BlockedIPList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

