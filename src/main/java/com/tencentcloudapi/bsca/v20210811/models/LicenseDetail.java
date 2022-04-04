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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseDetail extends AbstractModel{

    /**
    * 许可证内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 许可证允许信息列表
    */
    @SerializedName("ConditionSet")
    @Expose
    private LicenseRestriction [] ConditionSet;

    /**
    * 许可证要求信息列表
    */
    @SerializedName("ForbiddenSet")
    @Expose
    private LicenseRestriction [] ForbiddenSet;

    /**
    * 许可证禁止信息列表
    */
    @SerializedName("PermissionSet")
    @Expose
    private LicenseRestriction [] PermissionSet;

    /**
     * Get 许可证内容 
     * @return Content 许可证内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 许可证内容
     * @param Content 许可证内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 许可证允许信息列表 
     * @return ConditionSet 许可证允许信息列表
     */
    public LicenseRestriction [] getConditionSet() {
        return this.ConditionSet;
    }

    /**
     * Set 许可证允许信息列表
     * @param ConditionSet 许可证允许信息列表
     */
    public void setConditionSet(LicenseRestriction [] ConditionSet) {
        this.ConditionSet = ConditionSet;
    }

    /**
     * Get 许可证要求信息列表 
     * @return ForbiddenSet 许可证要求信息列表
     */
    public LicenseRestriction [] getForbiddenSet() {
        return this.ForbiddenSet;
    }

    /**
     * Set 许可证要求信息列表
     * @param ForbiddenSet 许可证要求信息列表
     */
    public void setForbiddenSet(LicenseRestriction [] ForbiddenSet) {
        this.ForbiddenSet = ForbiddenSet;
    }

    /**
     * Get 许可证禁止信息列表 
     * @return PermissionSet 许可证禁止信息列表
     */
    public LicenseRestriction [] getPermissionSet() {
        return this.PermissionSet;
    }

    /**
     * Set 许可证禁止信息列表
     * @param PermissionSet 许可证禁止信息列表
     */
    public void setPermissionSet(LicenseRestriction [] PermissionSet) {
        this.PermissionSet = PermissionSet;
    }

    public LicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseDetail(LicenseDetail source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ConditionSet != null) {
            this.ConditionSet = new LicenseRestriction[source.ConditionSet.length];
            for (int i = 0; i < source.ConditionSet.length; i++) {
                this.ConditionSet[i] = new LicenseRestriction(source.ConditionSet[i]);
            }
        }
        if (source.ForbiddenSet != null) {
            this.ForbiddenSet = new LicenseRestriction[source.ForbiddenSet.length];
            for (int i = 0; i < source.ForbiddenSet.length; i++) {
                this.ForbiddenSet[i] = new LicenseRestriction(source.ForbiddenSet[i]);
            }
        }
        if (source.PermissionSet != null) {
            this.PermissionSet = new LicenseRestriction[source.PermissionSet.length];
            for (int i = 0; i < source.PermissionSet.length; i++) {
                this.PermissionSet[i] = new LicenseRestriction(source.PermissionSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "ConditionSet.", this.ConditionSet);
        this.setParamArrayObj(map, prefix + "ForbiddenSet.", this.ForbiddenSet);
        this.setParamArrayObj(map, prefix + "PermissionSet.", this.PermissionSet);

    }
}

