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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Permission extends AbstractModel {

    /**
    * 权限名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权限key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 权限类型 1前端，2后端
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否隐藏
    */
    @SerializedName("Hide")
    @Expose
    private Long Hide;

    /**
    * 数据权限标签 1:表示根节点，2:表示叶子结点
    */
    @SerializedName("DataLabel")
    @Expose
    private Long DataLabel;

    /**
    * 数据权限独有，1:关联其他模块鉴权，2:表示关联自己模块鉴权
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * 数据权限独有，表示数据范围，1：全公司，2:部门及下级部门，3:自己
    */
    @SerializedName("DataRange")
    @Expose
    private Long DataRange;

    /**
    * 关联权限, 表示这个功能权限要受哪个数据权限管控
    */
    @SerializedName("DataTo")
    @Expose
    private String DataTo;

    /**
    * 父级权限key
    */
    @SerializedName("ParentKey")
    @Expose
    private String ParentKey;

    /**
    * 是否选中
    */
    @SerializedName("IsChecked")
    @Expose
    private Boolean IsChecked;

    /**
    * 子权限集合
    */
    @SerializedName("Children")
    @Expose
    private Permission [] Children;

    /**
     * Get 权限名称 
     * @return Name 权限名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限名称
     * @param Name 权限名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权限key 
     * @return Key 权限key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 权限key
     * @param Key 权限key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 权限类型 1前端，2后端 
     * @return Type 权限类型 1前端，2后端
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 权限类型 1前端，2后端
     * @param Type 权限类型 1前端，2后端
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否隐藏 
     * @return Hide 是否隐藏
     */
    public Long getHide() {
        return this.Hide;
    }

    /**
     * Set 是否隐藏
     * @param Hide 是否隐藏
     */
    public void setHide(Long Hide) {
        this.Hide = Hide;
    }

    /**
     * Get 数据权限标签 1:表示根节点，2:表示叶子结点 
     * @return DataLabel 数据权限标签 1:表示根节点，2:表示叶子结点
     */
    public Long getDataLabel() {
        return this.DataLabel;
    }

    /**
     * Set 数据权限标签 1:表示根节点，2:表示叶子结点
     * @param DataLabel 数据权限标签 1:表示根节点，2:表示叶子结点
     */
    public void setDataLabel(Long DataLabel) {
        this.DataLabel = DataLabel;
    }

    /**
     * Get 数据权限独有，1:关联其他模块鉴权，2:表示关联自己模块鉴权 
     * @return DataType 数据权限独有，1:关联其他模块鉴权，2:表示关联自己模块鉴权
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据权限独有，1:关联其他模块鉴权，2:表示关联自己模块鉴权
     * @param DataType 数据权限独有，1:关联其他模块鉴权，2:表示关联自己模块鉴权
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 数据权限独有，表示数据范围，1：全公司，2:部门及下级部门，3:自己 
     * @return DataRange 数据权限独有，表示数据范围，1：全公司，2:部门及下级部门，3:自己
     */
    public Long getDataRange() {
        return this.DataRange;
    }

    /**
     * Set 数据权限独有，表示数据范围，1：全公司，2:部门及下级部门，3:自己
     * @param DataRange 数据权限独有，表示数据范围，1：全公司，2:部门及下级部门，3:自己
     */
    public void setDataRange(Long DataRange) {
        this.DataRange = DataRange;
    }

    /**
     * Get 关联权限, 表示这个功能权限要受哪个数据权限管控 
     * @return DataTo 关联权限, 表示这个功能权限要受哪个数据权限管控
     */
    public String getDataTo() {
        return this.DataTo;
    }

    /**
     * Set 关联权限, 表示这个功能权限要受哪个数据权限管控
     * @param DataTo 关联权限, 表示这个功能权限要受哪个数据权限管控
     */
    public void setDataTo(String DataTo) {
        this.DataTo = DataTo;
    }

    /**
     * Get 父级权限key 
     * @return ParentKey 父级权限key
     */
    public String getParentKey() {
        return this.ParentKey;
    }

    /**
     * Set 父级权限key
     * @param ParentKey 父级权限key
     */
    public void setParentKey(String ParentKey) {
        this.ParentKey = ParentKey;
    }

    /**
     * Get 是否选中 
     * @return IsChecked 是否选中
     */
    public Boolean getIsChecked() {
        return this.IsChecked;
    }

    /**
     * Set 是否选中
     * @param IsChecked 是否选中
     */
    public void setIsChecked(Boolean IsChecked) {
        this.IsChecked = IsChecked;
    }

    /**
     * Get 子权限集合 
     * @return Children 子权限集合
     */
    public Permission [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子权限集合
     * @param Children 子权限集合
     */
    public void setChildren(Permission [] Children) {
        this.Children = Children;
    }

    public Permission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Permission(Permission source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Hide != null) {
            this.Hide = new Long(source.Hide);
        }
        if (source.DataLabel != null) {
            this.DataLabel = new Long(source.DataLabel);
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
        if (source.DataRange != null) {
            this.DataRange = new Long(source.DataRange);
        }
        if (source.DataTo != null) {
            this.DataTo = new String(source.DataTo);
        }
        if (source.ParentKey != null) {
            this.ParentKey = new String(source.ParentKey);
        }
        if (source.IsChecked != null) {
            this.IsChecked = new Boolean(source.IsChecked);
        }
        if (source.Children != null) {
            this.Children = new Permission[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new Permission(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Hide", this.Hide);
        this.setParamSimple(map, prefix + "DataLabel", this.DataLabel);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "DataRange", this.DataRange);
        this.setParamSimple(map, prefix + "DataTo", this.DataTo);
        this.setParamSimple(map, prefix + "ParentKey", this.ParentKey);
        this.setParamSimple(map, prefix + "IsChecked", this.IsChecked);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

