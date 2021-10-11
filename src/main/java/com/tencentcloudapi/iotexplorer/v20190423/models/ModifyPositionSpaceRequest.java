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

public class ModifyPositionSpaceRequest extends AbstractModel{

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
    * 产品列表
    */
    @SerializedName("ProductIdList")
    @Expose
    private String [] ProductIdList;

    /**
    * 位置空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 缩略图
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

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
     * Get 位置空间描述 
     * @return Description 位置空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 位置空间描述
     * @param Description 位置空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public ModifyPositionSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPositionSpaceRequest(ModifyPositionSpaceRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.AuthorizeType != null) {
            this.AuthorizeType = new Long(source.AuthorizeType);
        }
        if (source.ProductIdList != null) {
            this.ProductIdList = new String[source.ProductIdList.length];
            for (int i = 0; i < source.ProductIdList.length; i++) {
                this.ProductIdList[i] = new String(source.ProductIdList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "AuthorizeType", this.AuthorizeType);
        this.setParamArraySimple(map, prefix + "ProductIdList.", this.ProductIdList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Icon", this.Icon);

    }
}

