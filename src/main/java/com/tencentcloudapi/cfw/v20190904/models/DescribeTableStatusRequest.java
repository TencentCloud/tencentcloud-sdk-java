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
    * EdgeId值
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 状态值，0：检查表的状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Nat所在地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 方向，0：出站，1：入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

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
     * Get 状态值，0：检查表的状态 
     * @return Status 状态值，0：检查表的状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，0：检查表的状态
     * @param Status 状态值，0：检查表的状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Nat所在地域 
     * @return Area Nat所在地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Nat所在地域
     * @param Area Nat所在地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 方向，0：出站，1：入站 
     * @return Direction 方向，0：出站，1：入站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站
     * @param Direction 方向，0：出站，1：入站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
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

