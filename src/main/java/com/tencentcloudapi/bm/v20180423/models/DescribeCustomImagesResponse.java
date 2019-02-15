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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomImagesResponse  extends AbstractModel{

    /**
    * 返回镜像数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 镜像信息列表
    */
    @SerializedName("CustomImageSet")
    @Expose
    private CustomImage [] CustomImageSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返回镜像数量
     * @return TotalCount 返回镜像数量
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置返回镜像数量
     * @param TotalCount 返回镜像数量
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取镜像信息列表
     * @return CustomImageSet 镜像信息列表
     */
    public CustomImage [] getCustomImageSet() {
        return this.CustomImageSet;
    }

    /**
     * 设置镜像信息列表
     * @param CustomImageSet 镜像信息列表
     */
    public void setCustomImageSet(CustomImage [] CustomImageSet) {
        this.CustomImageSet = CustomImageSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "CustomImageSet.", this.CustomImageSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

