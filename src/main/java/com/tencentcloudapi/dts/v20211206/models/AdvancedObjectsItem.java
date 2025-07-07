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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedObjectsItem extends AbstractModel {

    /**
    * 对象类型,可能得值有：account,index,shardkey,schema
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 源端分块
    */
    @SerializedName("SrcChunk")
    @Expose
    private String SrcChunk;

    /**
    * 目标端分块
    */
    @SerializedName("DstChunk")
    @Expose
    private String DstChunk;

    /**
    * 源端值
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * 目标端值
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
     * Get 对象类型,可能得值有：account,index,shardkey,schema 
     * @return ObjectType 对象类型,可能得值有：account,index,shardkey,schema
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象类型,可能得值有：account,index,shardkey,schema
     * @param ObjectType 对象类型,可能得值有：account,index,shardkey,schema
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 源端分块 
     * @return SrcChunk 源端分块
     */
    public String getSrcChunk() {
        return this.SrcChunk;
    }

    /**
     * Set 源端分块
     * @param SrcChunk 源端分块
     */
    public void setSrcChunk(String SrcChunk) {
        this.SrcChunk = SrcChunk;
    }

    /**
     * Get 目标端分块 
     * @return DstChunk 目标端分块
     */
    public String getDstChunk() {
        return this.DstChunk;
    }

    /**
     * Set 目标端分块
     * @param DstChunk 目标端分块
     */
    public void setDstChunk(String DstChunk) {
        this.DstChunk = DstChunk;
    }

    /**
     * Get 源端值 
     * @return SrcItem 源端值
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set 源端值
     * @param SrcItem 源端值
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get 目标端值 
     * @return DstItem 目标端值
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set 目标端值
     * @param DstItem 目标端值
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    public AdvancedObjectsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedObjectsItem(AdvancedObjectsItem source) {
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.SrcChunk != null) {
            this.SrcChunk = new String(source.SrcChunk);
        }
        if (source.DstChunk != null) {
            this.DstChunk = new String(source.DstChunk);
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String(source.SrcItem);
        }
        if (source.DstItem != null) {
            this.DstItem = new String(source.DstItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "SrcChunk", this.SrcChunk);
        this.setParamSimple(map, prefix + "DstChunk", this.DstChunk);
        this.setParamSimple(map, prefix + "SrcItem", this.SrcItem);
        this.setParamSimple(map, prefix + "DstItem", this.DstItem);

    }
}

