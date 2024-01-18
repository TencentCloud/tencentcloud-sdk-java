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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareUnitResource extends AbstractModel {

    /**
    * 共享资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 共享资源类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 产品资源ID。
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
    * 共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharedMemberNum")
    @Expose
    private Long SharedMemberNum;

    /**
    * 使用中共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharedMemberUseNum")
    @Expose
    private Long SharedMemberUseNum;

    /**
    * 共享管理员OwnerUin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareManagerUin")
    @Expose
    private Long ShareManagerUin;

    /**
     * Get 共享资源ID。 
     * @return ResourceId 共享资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 共享资源ID。
     * @param ResourceId 共享资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 共享资源类型。 
     * @return Type 共享资源类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 共享资源类型。
     * @param Type 共享资源类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 产品资源ID。 
     * @return ProductResourceId 产品资源ID。
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set 产品资源ID。
     * @param ProductResourceId 产品资源ID。
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    /**
     * Get 共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharedMemberNum 共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSharedMemberNum() {
        return this.SharedMemberNum;
    }

    /**
     * Set 共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharedMemberNum 共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharedMemberNum(Long SharedMemberNum) {
        this.SharedMemberNum = SharedMemberNum;
    }

    /**
     * Get 使用中共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharedMemberUseNum 使用中共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSharedMemberUseNum() {
        return this.SharedMemberUseNum;
    }

    /**
     * Set 使用中共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharedMemberUseNum 使用中共享单元成员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharedMemberUseNum(Long SharedMemberUseNum) {
        this.SharedMemberUseNum = SharedMemberUseNum;
    }

    /**
     * Get 共享管理员OwnerUin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareManagerUin 共享管理员OwnerUin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShareManagerUin() {
        return this.ShareManagerUin;
    }

    /**
     * Set 共享管理员OwnerUin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareManagerUin 共享管理员OwnerUin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareManagerUin(Long ShareManagerUin) {
        this.ShareManagerUin = ShareManagerUin;
    }

    public ShareUnitResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareUnitResource(ShareUnitResource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
        }
        if (source.SharedMemberNum != null) {
            this.SharedMemberNum = new Long(source.SharedMemberNum);
        }
        if (source.SharedMemberUseNum != null) {
            this.SharedMemberUseNum = new Long(source.SharedMemberUseNum);
        }
        if (source.ShareManagerUin != null) {
            this.ShareManagerUin = new Long(source.ShareManagerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);
        this.setParamSimple(map, prefix + "SharedMemberNum", this.SharedMemberNum);
        this.setParamSimple(map, prefix + "SharedMemberUseNum", this.SharedMemberUseNum);
        this.setParamSimple(map, prefix + "ShareManagerUin", this.ShareManagerUin);

    }
}

