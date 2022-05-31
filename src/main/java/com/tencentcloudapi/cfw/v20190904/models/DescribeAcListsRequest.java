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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAcListsRequest extends AbstractModel{

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 策略
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 搜索值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 出站还是入站，1：入站，0：出站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * EdgeId值
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 规则是否开启，'0': 未开启，'1': 开启, 默认为'0'
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 策略 
     * @return Strategy 策略
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略
     * @param Strategy 策略
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 搜索值 
     * @return SearchValue 搜索值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索值
     * @param SearchValue 搜索值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 出站还是入站，1：入站，0：出站 
     * @return Direction 出站还是入站，1：入站，0：出站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 出站还是入站，1：入站，0：出站
     * @param Direction 出站还是入站，1：入站，0：出站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get EdgeId值 
     * @return EdgeId EdgeId值
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId值
     * @param EdgeId EdgeId值
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 规则是否开启，'0': 未开启，'1': 开启, 默认为'0' 
     * @return Status 规则是否开启，'0': 未开启，'1': 开启, 默认为'0'
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则是否开启，'0': 未开启，'1': 开启, 默认为'0'
     * @param Status 规则是否开启，'0': 未开启，'1': 开启, 默认为'0'
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域 
     * @return Area 地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域
     * @param Area 地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeAcListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAcListsRequest(DescribeAcListsRequest source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

