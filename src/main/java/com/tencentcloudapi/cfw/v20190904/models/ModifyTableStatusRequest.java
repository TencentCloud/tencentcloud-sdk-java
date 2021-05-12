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

public class ModifyTableStatusRequest extends AbstractModel{

    /**
    * EdgeId值两个vpc间的边id
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 状态值，1：锁表，2：解锁表
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
    * 0： 出向，1：入向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get EdgeId值两个vpc间的边id 
     * @return EdgeId EdgeId值两个vpc间的边id
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId值两个vpc间的边id
     * @param EdgeId EdgeId值两个vpc间的边id
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 状态值，1：锁表，2：解锁表 
     * @return Status 状态值，1：锁表，2：解锁表
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，1：锁表，2：解锁表
     * @param Status 状态值，1：锁表，2：解锁表
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
     * Get 0： 出向，1：入向 
     * @return Direction 0： 出向，1：入向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 0： 出向，1：入向
     * @param Direction 0： 出向，1：入向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyTableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableStatusRequest(ModifyTableStatusRequest source) {
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

