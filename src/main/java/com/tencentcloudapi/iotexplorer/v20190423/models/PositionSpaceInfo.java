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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionSpaceInfo extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 位置空间Id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 位置空间名称
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * 授权类型
    */
    @SerializedName("AuthorizeType")
    @Expose
    private Long AuthorizeType;

    /**
    * 描述备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 产品列表
    */
    @SerializedName("ProductIdList")
    @Expose
    private String [] ProductIdList;

    /**
    * 缩略图
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 用户自定义地图缩放
    */
    @SerializedName("Zoom")
    @Expose
    private Long Zoom;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 位置空间Id 
     * @return SpaceId 位置空间Id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 位置空间Id
     * @param SpaceId 位置空间Id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 位置空间名称 
     * @return SpaceName 位置空间名称
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 位置空间名称
     * @param SpaceName 位置空间名称
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get 授权类型 
     * @return AuthorizeType 授权类型
     */
    public Long getAuthorizeType() {
        return this.AuthorizeType;
    }

    /**
     * Set 授权类型
     * @param AuthorizeType 授权类型
     */
    public void setAuthorizeType(Long AuthorizeType) {
        this.AuthorizeType = AuthorizeType;
    }

    /**
     * Get 描述备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 产品列表 
     * @return ProductIdList 产品列表
     */
    public String [] getProductIdList() {
        return this.ProductIdList;
    }

    /**
     * Set 产品列表
     * @param ProductIdList 产品列表
     */
    public void setProductIdList(String [] ProductIdList) {
        this.ProductIdList = ProductIdList;
    }

    /**
     * Get 缩略图 
     * @return Icon 缩略图
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 缩略图
     * @param Icon 缩略图
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户自定义地图缩放 
     * @return Zoom 用户自定义地图缩放
     */
    public Long getZoom() {
        return this.Zoom;
    }

    /**
     * Set 用户自定义地图缩放
     * @param Zoom 用户自定义地图缩放
     */
    public void setZoom(Long Zoom) {
        this.Zoom = Zoom;
    }

    public PositionSpaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionSpaceInfo(PositionSpaceInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.AuthorizeType != null) {
            this.AuthorizeType = new Long(source.AuthorizeType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProductIdList != null) {
            this.ProductIdList = new String[source.ProductIdList.length];
            for (int i = 0; i < source.ProductIdList.length; i++) {
                this.ProductIdList[i] = new String(source.ProductIdList[i]);
            }
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Zoom != null) {
            this.Zoom = new Long(source.Zoom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "AuthorizeType", this.AuthorizeType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ProductIdList.", this.ProductIdList);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Zoom", this.Zoom);

    }
}

