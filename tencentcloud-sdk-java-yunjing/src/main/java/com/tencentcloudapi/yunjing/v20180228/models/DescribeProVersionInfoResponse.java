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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProVersionInfoResponse extends AbstractModel{

    /**
    * 后付费昨日扣费
    */
    @SerializedName("PostPayCost")
    @Expose
    private Long PostPayCost;

    /**
    * 新增主机是否自动开通专业版
    */
    @SerializedName("IsAutoOpenProVersion")
    @Expose
    private Boolean IsAutoOpenProVersion;

    /**
    * 开通专业版主机数
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 后付费昨日扣费 
     * @return PostPayCost 后付费昨日扣费
     */
    public Long getPostPayCost() {
        return this.PostPayCost;
    }

    /**
     * Set 后付费昨日扣费
     * @param PostPayCost 后付费昨日扣费
     */
    public void setPostPayCost(Long PostPayCost) {
        this.PostPayCost = PostPayCost;
    }

    /**
     * Get 新增主机是否自动开通专业版 
     * @return IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public Boolean getIsAutoOpenProVersion() {
        return this.IsAutoOpenProVersion;
    }

    /**
     * Set 新增主机是否自动开通专业版
     * @param IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public void setIsAutoOpenProVersion(Boolean IsAutoOpenProVersion) {
        this.IsAutoOpenProVersion = IsAutoOpenProVersion;
    }

    /**
     * Get 开通专业版主机数 
     * @return ProVersionNum 开通专业版主机数
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set 开通专业版主机数
     * @param ProVersionNum 开通专业版主机数
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
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
        this.setParamSimple(map, prefix + "PostPayCost", this.PostPayCost);
        this.setParamSimple(map, prefix + "IsAutoOpenProVersion", this.IsAutoOpenProVersion);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

