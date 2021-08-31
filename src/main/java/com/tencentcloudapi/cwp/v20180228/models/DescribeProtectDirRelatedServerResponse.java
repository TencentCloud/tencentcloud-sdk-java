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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectDirRelatedServerResponse extends AbstractModel{

    /**
    * 网站关联服务器列表信息
    */
    @SerializedName("List")
    @Expose
    private ProtectDirRelatedServer [] List;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 已开启防护总数
    */
    @SerializedName("ProtectServerCount")
    @Expose
    private Long ProtectServerCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网站关联服务器列表信息 
     * @return List 网站关联服务器列表信息
     */
    public ProtectDirRelatedServer [] getList() {
        return this.List;
    }

    /**
     * Set 网站关联服务器列表信息
     * @param List 网站关联服务器列表信息
     */
    public void setList(ProtectDirRelatedServer [] List) {
        this.List = List;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 已开启防护总数 
     * @return ProtectServerCount 已开启防护总数
     */
    public Long getProtectServerCount() {
        return this.ProtectServerCount;
    }

    /**
     * Set 已开启防护总数
     * @param ProtectServerCount 已开启防护总数
     */
    public void setProtectServerCount(Long ProtectServerCount) {
        this.ProtectServerCount = ProtectServerCount;
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

    public DescribeProtectDirRelatedServerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectDirRelatedServerResponse(DescribeProtectDirRelatedServerResponse source) {
        if (source.List != null) {
            this.List = new ProtectDirRelatedServer[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new ProtectDirRelatedServer(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ProtectServerCount != null) {
            this.ProtectServerCount = new Long(source.ProtectServerCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ProtectServerCount", this.ProtectServerCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

