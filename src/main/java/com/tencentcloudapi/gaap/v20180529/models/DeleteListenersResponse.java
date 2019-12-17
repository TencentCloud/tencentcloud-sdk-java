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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteListenersResponse extends AbstractModel{

    /**
    * 删除操作失败的监听器ID列表
    */
    @SerializedName("OperationFailedListenerSet")
    @Expose
    private String [] OperationFailedListenerSet;

    /**
    * 删除操作成功的监听器ID列表
    */
    @SerializedName("OperationSucceedListenerSet")
    @Expose
    private String [] OperationSucceedListenerSet;

    /**
    * 无效的监听器ID列表，如：监听器不存在，监听器对应实例不匹配
    */
    @SerializedName("InvalidStatusListenerSet")
    @Expose
    private String [] InvalidStatusListenerSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除操作失败的监听器ID列表 
     * @return OperationFailedListenerSet 删除操作失败的监听器ID列表
     */
    public String [] getOperationFailedListenerSet() {
        return this.OperationFailedListenerSet;
    }

    /**
     * Set 删除操作失败的监听器ID列表
     * @param OperationFailedListenerSet 删除操作失败的监听器ID列表
     */
    public void setOperationFailedListenerSet(String [] OperationFailedListenerSet) {
        this.OperationFailedListenerSet = OperationFailedListenerSet;
    }

    /**
     * Get 删除操作成功的监听器ID列表 
     * @return OperationSucceedListenerSet 删除操作成功的监听器ID列表
     */
    public String [] getOperationSucceedListenerSet() {
        return this.OperationSucceedListenerSet;
    }

    /**
     * Set 删除操作成功的监听器ID列表
     * @param OperationSucceedListenerSet 删除操作成功的监听器ID列表
     */
    public void setOperationSucceedListenerSet(String [] OperationSucceedListenerSet) {
        this.OperationSucceedListenerSet = OperationSucceedListenerSet;
    }

    /**
     * Get 无效的监听器ID列表，如：监听器不存在，监听器对应实例不匹配 
     * @return InvalidStatusListenerSet 无效的监听器ID列表，如：监听器不存在，监听器对应实例不匹配
     */
    public String [] getInvalidStatusListenerSet() {
        return this.InvalidStatusListenerSet;
    }

    /**
     * Set 无效的监听器ID列表，如：监听器不存在，监听器对应实例不匹配
     * @param InvalidStatusListenerSet 无效的监听器ID列表，如：监听器不存在，监听器对应实例不匹配
     */
    public void setInvalidStatusListenerSet(String [] InvalidStatusListenerSet) {
        this.InvalidStatusListenerSet = InvalidStatusListenerSet;
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
        this.setParamArraySimple(map, prefix + "OperationFailedListenerSet.", this.OperationFailedListenerSet);
        this.setParamArraySimple(map, prefix + "OperationSucceedListenerSet.", this.OperationSucceedListenerSet);
        this.setParamArraySimple(map, prefix + "InvalidStatusListenerSet.", this.InvalidStatusListenerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

