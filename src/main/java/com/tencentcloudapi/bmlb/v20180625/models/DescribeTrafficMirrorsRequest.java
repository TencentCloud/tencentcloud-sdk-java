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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorsRequest  extends AbstractModel{

    /**
    * 流量镜像实例ID的数组，支持批量查询
    */
    @SerializedName("TrafficMirrorIds")
    @Expose
    private String [] TrafficMirrorIds;

    /**
    * 流量镜像实例别名数组。
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 分页的偏移量，也即从第几条记录开始查询
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 单次查询返回的条目数，默认值：500。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取流量镜像实例ID的数组，支持批量查询
     * @return TrafficMirrorIds 流量镜像实例ID的数组，支持批量查询
     */
    public String [] getTrafficMirrorIds() {
        return this.TrafficMirrorIds;
    }

    /**
     * 设置流量镜像实例ID的数组，支持批量查询
     * @param TrafficMirrorIds 流量镜像实例ID的数组，支持批量查询
     */
    public void setTrafficMirrorIds(String [] TrafficMirrorIds) {
        this.TrafficMirrorIds = TrafficMirrorIds;
    }

    /**
     * 获取流量镜像实例别名数组。
     * @return Aliases 流量镜像实例别名数组。
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * 设置流量镜像实例别名数组。
     * @param Aliases 流量镜像实例别名数组。
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * 获取流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     * @return VpcIds 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * 设置流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     * @param VpcIds 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * 获取分页的偏移量，也即从第几条记录开始查询
     * @return Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页的偏移量，也即从第几条记录开始查询
     * @param Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次查询返回的条目数，默认值：500。
     * @return Limit 单次查询返回的条目数，默认值：500。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次查询返回的条目数，默认值：500。
     * @param Limit 单次查询返回的条目数，默认值：500。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficMirrorIds.", this.TrafficMirrorIds);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

