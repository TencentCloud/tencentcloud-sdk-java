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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSitesResponse  extends AbstractModel{

    /**
    * 站点数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 站点信息列表。
    */
    @SerializedName("Sites")
    @Expose
    private Site [] Sites;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取站点数量。
     * @return TotalCount 站点数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置站点数量。
     * @param TotalCount 站点数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取站点信息列表。
     * @return Sites 站点信息列表。
     */
    public Site [] getSites() {
        return this.Sites;
    }

    /**
     * 设置站点信息列表。
     * @param Sites 站点信息列表。
     */
    public void setSites(Site [] Sites) {
        this.Sites = Sites;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Sites.", this.Sites);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

