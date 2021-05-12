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

public class DeleteAcRuleRequest extends AbstractModel{

    /**
    * 删除规则对应的id值, 对应获取规则列表接口的Id 值
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 方向，0：出站，1：入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * EdgeId值两个vpc间的边id
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * NAT地域， 如ap-shanghai/ap-guangzhou/ap-chongqing等
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 删除规则对应的id值, 对应获取规则列表接口的Id 值 
     * @return Id 删除规则对应的id值, 对应获取规则列表接口的Id 值
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 删除规则对应的id值, 对应获取规则列表接口的Id 值
     * @param Id 删除规则对应的id值, 对应获取规则列表接口的Id 值
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get NAT地域， 如ap-shanghai/ap-guangzhou/ap-chongqing等 
     * @return Area NAT地域， 如ap-shanghai/ap-guangzhou/ap-chongqing等
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT地域， 如ap-shanghai/ap-guangzhou/ap-chongqing等
     * @param Area NAT地域， 如ap-shanghai/ap-guangzhou/ap-chongqing等
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DeleteAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAcRuleRequest(DeleteAcRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

