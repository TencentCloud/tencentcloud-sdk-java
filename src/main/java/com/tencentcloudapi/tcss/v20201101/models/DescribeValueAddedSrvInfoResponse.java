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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeValueAddedSrvInfoResponse extends AbstractModel{

    /**
    * 仓库镜像未授权数量
    */
    @SerializedName("RegistryImageCnt")
    @Expose
    private Long RegistryImageCnt;

    /**
    * 本地镜像未授权数量
    */
    @SerializedName("LocalImageCnt")
    @Expose
    private Long LocalImageCnt;

    /**
    * 未使用的镜像安全扫描授权数
    */
    @SerializedName("UnusedAuthorizedCnt")
    @Expose
    private Long UnusedAuthorizedCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 仓库镜像未授权数量 
     * @return RegistryImageCnt 仓库镜像未授权数量
     */
    public Long getRegistryImageCnt() {
        return this.RegistryImageCnt;
    }

    /**
     * Set 仓库镜像未授权数量
     * @param RegistryImageCnt 仓库镜像未授权数量
     */
    public void setRegistryImageCnt(Long RegistryImageCnt) {
        this.RegistryImageCnt = RegistryImageCnt;
    }

    /**
     * Get 本地镜像未授权数量 
     * @return LocalImageCnt 本地镜像未授权数量
     */
    public Long getLocalImageCnt() {
        return this.LocalImageCnt;
    }

    /**
     * Set 本地镜像未授权数量
     * @param LocalImageCnt 本地镜像未授权数量
     */
    public void setLocalImageCnt(Long LocalImageCnt) {
        this.LocalImageCnt = LocalImageCnt;
    }

    /**
     * Get 未使用的镜像安全扫描授权数 
     * @return UnusedAuthorizedCnt 未使用的镜像安全扫描授权数
     */
    public Long getUnusedAuthorizedCnt() {
        return this.UnusedAuthorizedCnt;
    }

    /**
     * Set 未使用的镜像安全扫描授权数
     * @param UnusedAuthorizedCnt 未使用的镜像安全扫描授权数
     */
    public void setUnusedAuthorizedCnt(Long UnusedAuthorizedCnt) {
        this.UnusedAuthorizedCnt = UnusedAuthorizedCnt;
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

    public DescribeValueAddedSrvInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeValueAddedSrvInfoResponse(DescribeValueAddedSrvInfoResponse source) {
        if (source.RegistryImageCnt != null) {
            this.RegistryImageCnt = new Long(source.RegistryImageCnt);
        }
        if (source.LocalImageCnt != null) {
            this.LocalImageCnt = new Long(source.LocalImageCnt);
        }
        if (source.UnusedAuthorizedCnt != null) {
            this.UnusedAuthorizedCnt = new Long(source.UnusedAuthorizedCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryImageCnt", this.RegistryImageCnt);
        this.setParamSimple(map, prefix + "LocalImageCnt", this.LocalImageCnt);
        this.setParamSimple(map, prefix + "UnusedAuthorizedCnt", this.UnusedAuthorizedCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

