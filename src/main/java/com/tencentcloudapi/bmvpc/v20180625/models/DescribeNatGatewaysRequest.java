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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewaysRequest  extends AbstractModel{

    /**
    * NAT网关ID，例如：nat-kdm476mp
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * NAT名称
    */
    @SerializedName("NatName")
    @Expose
    private String NatName;

    /**
    * 搜索字段
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 起始值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 偏移值，默认值为 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取NAT网关ID，例如：nat-kdm476mp
     * @return NatId NAT网关ID，例如：nat-kdm476mp
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * 设置NAT网关ID，例如：nat-kdm476mp
     * @param NatId NAT网关ID，例如：nat-kdm476mp
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * 获取NAT名称
     * @return NatName NAT名称
     */
    public String getNatName() {
        return this.NatName;
    }

    /**
     * 设置NAT名称
     * @param NatName NAT名称
     */
    public void setNatName(String NatName) {
        this.NatName = NatName;
    }

    /**
     * 获取搜索字段
     * @return SearchKey 搜索字段
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置搜索字段
     * @param SearchKey 搜索字段
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取私有网络ID，例如：vpc-kd7d06of
     * @return VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取起始值
     * @return Offset 起始值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置起始值
     * @param Offset 起始值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取偏移值，默认值为 20
     * @return Limit 偏移值，默认值为 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置偏移值，默认值为 20
     * @param Limit 偏移值，默认值为 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatName", this.NatName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

