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

public class MsgRecordCategory extends AbstractModel {

    /**
    * <p>分类的业务 ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>子分类列表，树形嵌套</p>
    */
    @SerializedName("Children")
    @Expose
    private MsgRecordCategory [] Children;

    /**
    * <p>分类名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>当前用户对该分类的操作权限</p>
    */
    @SerializedName("Permission")
    @Expose
    private CategoryPermission Permission;

    /**
    * <p>该分类下消息记录的数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
     * Get <p>分类的业务 ID</p> 
     * @return CategoryId <p>分类的业务 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类的业务 ID</p>
     * @param CategoryId <p>分类的业务 ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>子分类列表，树形嵌套</p> 
     * @return Children <p>子分类列表，树形嵌套</p>
     */
    public MsgRecordCategory [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>子分类列表，树形嵌套</p>
     * @param Children <p>子分类列表，树形嵌套</p>
     */
    public void setChildren(MsgRecordCategory [] Children) {
        this.Children = Children;
    }

    /**
     * Get <p>分类名称</p> 
     * @return Name <p>分类名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分类名称</p>
     * @param Name <p>分类名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>当前用户对该分类的操作权限</p> 
     * @return Permission <p>当前用户对该分类的操作权限</p>
     */
    public CategoryPermission getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>当前用户对该分类的操作权限</p>
     * @param Permission <p>当前用户对该分类的操作权限</p>
     */
    public void setPermission(CategoryPermission Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>该分类下消息记录的数量</p> 
     * @return TotalCount <p>该分类下消息记录的数量</p>
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>该分类下消息记录的数量</p>
     * @param TotalCount <p>该分类下消息记录的数量</p>
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    public MsgRecordCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordCategory(MsgRecordCategory source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.Children != null) {
            this.Children = new MsgRecordCategory[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new MsgRecordCategory(source.Children[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Permission != null) {
            this.Permission = new CategoryPermission(source.Permission);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

