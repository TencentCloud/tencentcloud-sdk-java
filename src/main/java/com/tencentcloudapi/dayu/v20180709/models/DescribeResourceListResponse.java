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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceListResponse  extends AbstractModel{

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资源记录列表
    */
    @SerializedName("ServicePacks")
    @Expose
    private KeyValueRecord [] ServicePacks;

    /**
    * 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取总记录数
     * @return Total 总记录数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * 设置总记录数
     * @param Total 总记录数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * 获取资源记录列表
     * @return ServicePacks 资源记录列表
     */
    public KeyValueRecord [] getServicePacks() {
        return this.ServicePacks;
    }

    /**
     * 设置资源记录列表
     * @param ServicePacks 资源记录列表
     */
    public void setServicePacks(KeyValueRecord [] ServicePacks) {
        this.ServicePacks = ServicePacks;
    }

    /**
     * 获取大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌）
     * @return Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌）
     * @param Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ServicePacks.", this.ServicePacks);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

