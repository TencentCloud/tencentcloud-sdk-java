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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetTagTreeNode extends AbstractModel {

    /**
    * 标签键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 子节点
    */
    @SerializedName("Children")
    @Expose
    private AssetTagTreeNode [] Children;

    /**
    * 颜色
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get 标签键 
     * @return Key 标签键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签键
     * @param Key 标签键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 标签值 
     * @return Value 标签值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签值
     * @param Value 标签值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 子节点 
     * @return Children 子节点
     */
    public AssetTagTreeNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点
     * @param Children 子节点
     */
    public void setChildren(AssetTagTreeNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get 颜色 
     * @return Color 颜色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 颜色
     * @param Color 颜色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public AssetTagTreeNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTagTreeNode(AssetTagTreeNode source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Children != null) {
            this.Children = new AssetTagTreeNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AssetTagTreeNode(source.Children[i]);
            }
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

