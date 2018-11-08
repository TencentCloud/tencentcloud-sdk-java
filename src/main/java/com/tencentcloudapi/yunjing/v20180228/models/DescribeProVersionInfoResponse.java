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

public class DescribeProVersionInfoResponse  extends AbstractModel{

    /**
    * 后付费昨日扣费
    */
    @SerializedName("PostPayCost")
    @Expose
    private Integer PostPayCost;

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
    private Integer ProVersionNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取后付费昨日扣费
     * @return PostPayCost 后付费昨日扣费
     */
    public Integer getPostPayCost() {
        return this.PostPayCost;
    }

    /**
     * 设置后付费昨日扣费
     * @param PostPayCost 后付费昨日扣费
     */
    public void setPostPayCost(Integer PostPayCost) {
        this.PostPayCost = PostPayCost;
    }

    /**
     * 获取新增主机是否自动开通专业版
     * @return IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public Boolean getIsAutoOpenProVersion() {
        return this.IsAutoOpenProVersion;
    }

    /**
     * 设置新增主机是否自动开通专业版
     * @param IsAutoOpenProVersion 新增主机是否自动开通专业版
     */
    public void setIsAutoOpenProVersion(Boolean IsAutoOpenProVersion) {
        this.IsAutoOpenProVersion = IsAutoOpenProVersion;
    }

    /**
     * 获取开通专业版主机数
     * @return ProVersionNum 开通专业版主机数
     */
    public Integer getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * 设置开通专业版主机数
     * @param ProVersionNum 开通专业版主机数
     */
    public void setProVersionNum(Integer ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PostPayCost", this.PostPayCost);
        this.setParamSimple(map, prefix + "IsAutoOpenProVersion", this.IsAutoOpenProVersion);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

