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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeLeaf extends AbstractModel {

    /**
    * 子节点ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 子节点名称
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 节点列表
    */
    @SerializedName("Children")
    @Expose
    private NodeInfoBase [] Children;

    /**
     * Get 子节点ID 
     * @return ID 子节点ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 子节点ID
     * @param ID 子节点ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 子节点名称 
     * @return Content 子节点名称
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 子节点名称
     * @param Content 子节点名称
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 节点列表 
     * @return Children 节点列表
     */
    public NodeInfoBase [] getChildren() {
        return this.Children;
    }

    /**
     * Set 节点列表
     * @param Children 节点列表
     */
    public void setChildren(NodeInfoBase [] Children) {
        this.Children = Children;
    }

    public NodeLeaf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeLeaf(NodeLeaf source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Children != null) {
            this.Children = new NodeInfoBase[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new NodeInfoBase(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

