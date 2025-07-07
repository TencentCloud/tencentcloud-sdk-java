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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathNodeDsVO extends AbstractModel {

    /**
    * PathNode ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * PathNode 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * PathNode 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 父节点唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private PathNodeDsVO [] Children;

    /**
    * 业务参数 ,base64编译的json串，获取具体参数需要base64反编译
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get PathNode ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id PathNode ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set PathNode ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id PathNode ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get PathNode 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title PathNode 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set PathNode 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title PathNode 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get PathNode 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type PathNode 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set PathNode 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type PathNode 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 父节点唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 子节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathNodeDsVO [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(PathNodeDsVO [] Children) {
        this.Children = Children;
    }

    /**
     * Get 业务参数 ,base64编译的json串，获取具体参数需要base64反编译
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 业务参数 ,base64编译的json串，获取具体参数需要base64反编译
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 业务参数 ,base64编译的json串，获取具体参数需要base64反编译
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 业务参数 ,base64编译的json串，获取具体参数需要base64反编译
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public PathNodeDsVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathNodeDsVO(PathNodeDsVO source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Children != null) {
            this.Children = new PathNodeDsVO[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new PathNodeDsVO(source.Children[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

