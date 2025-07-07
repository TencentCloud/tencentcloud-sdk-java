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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementProfileTreeRes extends AbstractModel {

    /**
    * 建筑id
    */
    @SerializedName("BuildingId")
    @Expose
    private String BuildingId;

    /**
    * 父级构件id
    */
    @SerializedName("ParentElementId")
    @Expose
    private String ParentElementId;

    /**
    * 构件树
    */
    @SerializedName("Root")
    @Expose
    private ElementProfileTreeNode Root;

    /**
     * Get 建筑id 
     * @return BuildingId 建筑id
     */
    public String getBuildingId() {
        return this.BuildingId;
    }

    /**
     * Set 建筑id
     * @param BuildingId 建筑id
     */
    public void setBuildingId(String BuildingId) {
        this.BuildingId = BuildingId;
    }

    /**
     * Get 父级构件id 
     * @return ParentElementId 父级构件id
     */
    public String getParentElementId() {
        return this.ParentElementId;
    }

    /**
     * Set 父级构件id
     * @param ParentElementId 父级构件id
     */
    public void setParentElementId(String ParentElementId) {
        this.ParentElementId = ParentElementId;
    }

    /**
     * Get 构件树 
     * @return Root 构件树
     */
    public ElementProfileTreeNode getRoot() {
        return this.Root;
    }

    /**
     * Set 构件树
     * @param Root 构件树
     */
    public void setRoot(ElementProfileTreeNode Root) {
        this.Root = Root;
    }

    public ElementProfileTreeRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementProfileTreeRes(ElementProfileTreeRes source) {
        if (source.BuildingId != null) {
            this.BuildingId = new String(source.BuildingId);
        }
        if (source.ParentElementId != null) {
            this.ParentElementId = new String(source.ParentElementId);
        }
        if (source.Root != null) {
            this.Root = new ElementProfileTreeNode(source.Root);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingId", this.BuildingId);
        this.setParamSimple(map, prefix + "ParentElementId", this.ParentElementId);
        this.setParamObj(map, prefix + "Root.", this.Root);

    }
}

