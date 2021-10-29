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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesRequest extends AbstractModel{

    /**
    * 图库名称。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 物品ID。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 图片名称。
    */
    @SerializedName("PicName")
    @Expose
    private String PicName;

    /**
     * Get 图库名称。 
     * @return GroupId 图库名称。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库名称。
     * @param GroupId 图库名称。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 物品ID。 
     * @return EntityId 物品ID。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 物品ID。
     * @param EntityId 物品ID。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 图片名称。 
     * @return PicName 图片名称。
     */
    public String getPicName() {
        return this.PicName;
    }

    /**
     * Set 图片名称。
     * @param PicName 图片名称。
     */
    public void setPicName(String PicName) {
        this.PicName = PicName;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.PicName != null) {
            this.PicName = new String(source.PicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "PicName", this.PicName);

    }
}

