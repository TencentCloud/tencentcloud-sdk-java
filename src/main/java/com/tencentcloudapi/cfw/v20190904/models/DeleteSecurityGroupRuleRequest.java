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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityGroupRuleRequest extends AbstractModel {

    /**
    * 所需要删除规则的ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 腾讯云地域的英文简写
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
    * 是否删除反向规则，0：否，1：是
    */
    @SerializedName("IsDelReverse")
    @Expose
    private Long IsDelReverse;

    /**
     * Get 所需要删除规则的ID 
     * @return Id 所需要删除规则的ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 所需要删除规则的ID
     * @param Id 所需要删除规则的ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 腾讯云地域的英文简写 
     * @return Area 腾讯云地域的英文简写
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 腾讯云地域的英文简写
     * @param Area 腾讯云地域的英文简写
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
     * Get 是否删除反向规则，0：否，1：是 
     * @return IsDelReverse 是否删除反向规则，0：否，1：是
     */
    public Long getIsDelReverse() {
        return this.IsDelReverse;
    }

    /**
     * Set 是否删除反向规则，0：否，1：是
     * @param IsDelReverse 是否删除反向规则，0：否，1：是
     */
    public void setIsDelReverse(Long IsDelReverse) {
        this.IsDelReverse = IsDelReverse;
    }

    public DeleteSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityGroupRuleRequest(DeleteSecurityGroupRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.IsDelReverse != null) {
            this.IsDelReverse = new Long(source.IsDelReverse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "IsDelReverse", this.IsDelReverse);

    }
}

