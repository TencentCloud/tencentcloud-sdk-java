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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillReferenceSummary extends AbstractModel {

    /**
    * <p>关联ID</p>
    */
    @SerializedName("ReferenceId")
    @Expose
    private String ReferenceId;

    /**
    * <p>关联名称</p>
    */
    @SerializedName("ReferenceName")
    @Expose
    private String ReferenceName;

    /**
    * <p>关联类型</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 占位 |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private Long ReferenceType;

    /**
    * <p>空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>空间名称</p>
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * <p>Reference实例拥有者</p>
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get <p>关联ID</p> 
     * @return ReferenceId <p>关联ID</p>
     */
    public String getReferenceId() {
        return this.ReferenceId;
    }

    /**
     * Set <p>关联ID</p>
     * @param ReferenceId <p>关联ID</p>
     */
    public void setReferenceId(String ReferenceId) {
        this.ReferenceId = ReferenceId;
    }

    /**
     * Get <p>关联名称</p> 
     * @return ReferenceName <p>关联名称</p>
     */
    public String getReferenceName() {
        return this.ReferenceName;
    }

    /**
     * Set <p>关联名称</p>
     * @param ReferenceName <p>关联名称</p>
     */
    public void setReferenceName(String ReferenceName) {
        this.ReferenceName = ReferenceName;
    }

    /**
     * Get <p>关联类型</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 占位 |<br>| 1 | ClawPro |<br>| 2 | agent |</p> 
     * @return ReferenceType <p>关联类型</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 占位 |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     */
    public Long getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>关联类型</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 占位 |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     * @param ReferenceType <p>关联类型</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 占位 |<br>| 1 | ClawPro |<br>| 2 | agent |</p>
     */
    public void setReferenceType(Long ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>空间ID</p> 
     * @return SpaceId <p>空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间ID</p>
     * @param SpaceId <p>空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>空间名称</p> 
     * @return SpaceName <p>空间名称</p>
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set <p>空间名称</p>
     * @param SpaceName <p>空间名称</p>
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get <p>Reference实例拥有者</p> 
     * @return Owner <p>Reference实例拥有者</p>
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>Reference实例拥有者</p>
     * @param Owner <p>Reference实例拥有者</p>
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public SkillReferenceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillReferenceSummary(SkillReferenceSummary source) {
        if (source.ReferenceId != null) {
            this.ReferenceId = new String(source.ReferenceId);
        }
        if (source.ReferenceName != null) {
            this.ReferenceName = new String(source.ReferenceName);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new Long(source.ReferenceType);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReferenceId", this.ReferenceId);
        this.setParamSimple(map, prefix + "ReferenceName", this.ReferenceName);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

