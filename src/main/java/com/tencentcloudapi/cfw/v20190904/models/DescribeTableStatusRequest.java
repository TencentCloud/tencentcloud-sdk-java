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

public class DescribeTableStatusRequest extends AbstractModel{

    /**
    * EdgeId值两个vpc间的边id vpc填Edgeid，不要填Area；
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 状态值，0：检查表的状态 确实只有一个默认值
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Nat所在地域 NAT填Area，不要填Edgeid；
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 方向，0：出站，1：入站 默认值为 0
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get EdgeId值两个vpc间的边id vpc填Edgeid，不要填Area； 
     * @return EdgeId EdgeId值两个vpc间的边id vpc填Edgeid，不要填Area；
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId值两个vpc间的边id vpc填Edgeid，不要填Area；
     * @param EdgeId EdgeId值两个vpc间的边id vpc填Edgeid，不要填Area；
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 状态值，0：检查表的状态 确实只有一个默认值 
     * @return Status 状态值，0：检查表的状态 确实只有一个默认值
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，0：检查表的状态 确实只有一个默认值
     * @param Status 状态值，0：检查表的状态 确实只有一个默认值
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Nat所在地域 NAT填Area，不要填Edgeid； 
     * @return Area Nat所在地域 NAT填Area，不要填Edgeid；
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Nat所在地域 NAT填Area，不要填Edgeid；
     * @param Area Nat所在地域 NAT填Area，不要填Edgeid；
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 方向，0：出站，1：入站 默认值为 0 
     * @return Direction 方向，0：出站，1：入站 默认值为 0
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站 默认值为 0
     * @param Direction 方向，0：出站，1：入站 默认值为 0
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public DescribeTableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableStatusRequest(DescribeTableStatusRequest source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

