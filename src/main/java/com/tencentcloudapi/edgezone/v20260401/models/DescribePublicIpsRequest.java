/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicIpsRequest extends AbstractModel {

    /**
    * 按公网实例 ID 过滤（子串匹配，多个值取并集）
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String [] NetworkInstanceId;

    /**
    * 按可用区/机房过滤
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 按 IP 过滤（子串匹配，多个值取并集）
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * 按状态过滤，可选值：`InUse`、`Unbound`（多个值取并集）
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * 按 IP 版本过滤，可选值：`Ipv4`、`Ipv6`（多个值取并集）
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 按创建时间排序，可选值：`asc`、`desc`（默认 `desc`）
    */
    @SerializedName("OrderByCreateTime")
    @Expose
    private String OrderByCreateTime;

    /**
    * 按更新时间排序，可选值：`asc`、`desc`（优先级高于创建时间排序）
    */
    @SerializedName("OrderByUpdateTime")
    @Expose
    private String OrderByUpdateTime;

    /**
    * 分页偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认 20，最大 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 按公网实例 ID 过滤（子串匹配，多个值取并集） 
     * @return NetworkInstanceId 按公网实例 ID 过滤（子串匹配，多个值取并集）
     */
    public String [] getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 按公网实例 ID 过滤（子串匹配，多个值取并集）
     * @param NetworkInstanceId 按公网实例 ID 过滤（子串匹配，多个值取并集）
     */
    public void setNetworkInstanceId(String [] NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 按可用区/机房过滤 
     * @return ZoneId 按可用区/机房过滤
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 按可用区/机房过滤
     * @param ZoneId 按可用区/机房过滤
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 按 IP 过滤（子串匹配，多个值取并集） 
     * @return Ip 按 IP 过滤（子串匹配，多个值取并集）
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set 按 IP 过滤（子串匹配，多个值取并集）
     * @param Ip 按 IP 过滤（子串匹配，多个值取并集）
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 按状态过滤，可选值：`InUse`、`Unbound`（多个值取并集） 
     * @return State 按状态过滤，可选值：`InUse`、`Unbound`（多个值取并集）
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set 按状态过滤，可选值：`InUse`、`Unbound`（多个值取并集）
     * @param State 按状态过滤，可选值：`InUse`、`Unbound`（多个值取并集）
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get 按 IP 版本过滤，可选值：`Ipv4`、`Ipv6`（多个值取并集） 
     * @return Type 按 IP 版本过滤，可选值：`Ipv4`、`Ipv6`（多个值取并集）
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 按 IP 版本过滤，可选值：`Ipv4`、`Ipv6`（多个值取并集）
     * @param Type 按 IP 版本过滤，可选值：`Ipv4`、`Ipv6`（多个值取并集）
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 按创建时间排序，可选值：`asc`、`desc`（默认 `desc`） 
     * @return OrderByCreateTime 按创建时间排序，可选值：`asc`、`desc`（默认 `desc`）
     */
    public String getOrderByCreateTime() {
        return this.OrderByCreateTime;
    }

    /**
     * Set 按创建时间排序，可选值：`asc`、`desc`（默认 `desc`）
     * @param OrderByCreateTime 按创建时间排序，可选值：`asc`、`desc`（默认 `desc`）
     */
    public void setOrderByCreateTime(String OrderByCreateTime) {
        this.OrderByCreateTime = OrderByCreateTime;
    }

    /**
     * Get 按更新时间排序，可选值：`asc`、`desc`（优先级高于创建时间排序） 
     * @return OrderByUpdateTime 按更新时间排序，可选值：`asc`、`desc`（优先级高于创建时间排序）
     */
    public String getOrderByUpdateTime() {
        return this.OrderByUpdateTime;
    }

    /**
     * Set 按更新时间排序，可选值：`asc`、`desc`（优先级高于创建时间排序）
     * @param OrderByUpdateTime 按更新时间排序，可选值：`asc`、`desc`（优先级高于创建时间排序）
     */
    public void setOrderByUpdateTime(String OrderByUpdateTime) {
        this.OrderByUpdateTime = OrderByUpdateTime;
    }

    /**
     * Get 分页偏移量，默认 0 
     * @return Offset 分页偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认 0
     * @param Offset 分页偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认 20，最大 100 
     * @return Limit 每页数量，默认 20，最大 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认 20，最大 100
     * @param Limit 每页数量，默认 20，最大 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePublicIpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicIpsRequest(DescribePublicIpsRequest source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String[source.NetworkInstanceId.length];
            for (int i = 0; i < source.NetworkInstanceId.length; i++) {
                this.NetworkInstanceId[i] = new String(source.NetworkInstanceId[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.OrderByCreateTime != null) {
            this.OrderByCreateTime = new String(source.OrderByCreateTime);
        }
        if (source.OrderByUpdateTime != null) {
            this.OrderByUpdateTime = new String(source.OrderByUpdateTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkInstanceId.", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "OrderByCreateTime", this.OrderByCreateTime);
        this.setParamSimple(map, prefix + "OrderByUpdateTime", this.OrderByUpdateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

