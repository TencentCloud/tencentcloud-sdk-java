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

public class ModifySequenceRulesRequest extends AbstractModel{

    /**
    * 边Id值
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 修改数据
    */
    @SerializedName("Data")
    @Expose
    private SequenceData [] Data;

    /**
    * NAT地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 方向，0：出向，1：入向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get 边Id值 
     * @return EdgeId 边Id值
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 边Id值
     * @param EdgeId 边Id值
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 修改数据 
     * @return Data 修改数据
     */
    public SequenceData [] getData() {
        return this.Data;
    }

    /**
     * Set 修改数据
     * @param Data 修改数据
     */
    public void setData(SequenceData [] Data) {
        this.Data = Data;
    }

    /**
     * Get NAT地域 
     * @return Area NAT地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT地域
     * @param Area NAT地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 方向，0：出向，1：入向 
     * @return Direction 方向，0：出向，1：入向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出向，1：入向
     * @param Direction 方向，0：出向，1：入向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifySequenceRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySequenceRulesRequest(ModifySequenceRulesRequest source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Data != null) {
            this.Data = new SequenceData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SequenceData(source.Data[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

