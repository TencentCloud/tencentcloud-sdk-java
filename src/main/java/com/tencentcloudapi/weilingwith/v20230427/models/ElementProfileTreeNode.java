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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementProfileTreeNode extends AbstractModel {

    /**
    * 构件概要信息
    */
    @SerializedName("ElementProfile")
    @Expose
    private ElementProfile ElementProfile;

    /**
    * 子节点信息
    */
    @SerializedName("Children")
    @Expose
    private ElementProfileTreeNode [] Children;

    /**
     * Get 构件概要信息 
     * @return ElementProfile 构件概要信息
     */
    public ElementProfile getElementProfile() {
        return this.ElementProfile;
    }

    /**
     * Set 构件概要信息
     * @param ElementProfile 构件概要信息
     */
    public void setElementProfile(ElementProfile ElementProfile) {
        this.ElementProfile = ElementProfile;
    }

    /**
     * Get 子节点信息 
     * @return Children 子节点信息
     */
    public ElementProfileTreeNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点信息
     * @param Children 子节点信息
     */
    public void setChildren(ElementProfileTreeNode [] Children) {
        this.Children = Children;
    }

    public ElementProfileTreeNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementProfileTreeNode(ElementProfileTreeNode source) {
        if (source.ElementProfile != null) {
            this.ElementProfile = new ElementProfile(source.ElementProfile);
        }
        if (source.Children != null) {
            this.Children = new ElementProfileTreeNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new ElementProfileTreeNode(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ElementProfile.", this.ElementProfile);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

