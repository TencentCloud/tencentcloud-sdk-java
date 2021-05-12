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

public class ModifySecurityGroupAllRuleStatusRequest extends AbstractModel{

    /**
    * 列表规则状态，0：全部停用，1：全部启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 方向，0：出站，1：入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Edge ID值
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * NAT地域, 腾讯云地域的英文简写
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 列表规则状态，0：全部停用，1：全部启用 
     * @return Status 列表规则状态，0：全部停用，1：全部启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 列表规则状态，0：全部停用，1：全部启用
     * @param Status 列表规则状态，0：全部停用，1：全部启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Edge ID值 
     * @return EdgeId Edge ID值
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Edge ID值
     * @param EdgeId Edge ID值
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get NAT地域, 腾讯云地域的英文简写 
     * @return Area NAT地域, 腾讯云地域的英文简写
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT地域, 腾讯云地域的英文简写
     * @param Area NAT地域, 腾讯云地域的英文简写
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ModifySecurityGroupAllRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupAllRuleStatusRequest(ModifySecurityGroupAllRuleStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

