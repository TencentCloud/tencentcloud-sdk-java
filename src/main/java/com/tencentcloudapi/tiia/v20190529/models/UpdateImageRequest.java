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

public class UpdateImageRequest extends AbstractModel{

    /**
    * 图库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 物品ID，最多支持64个字符。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 图片名称，最多支持64个字符。
    */
    @SerializedName("PicName")
    @Expose
    private String PicName;

    /**
    * 新的自定义标签，最多不超过10个，格式为JSON。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get 图库ID。 
     * @return GroupId 图库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库ID。
     * @param GroupId 图库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 物品ID，最多支持64个字符。 
     * @return EntityId 物品ID，最多支持64个字符。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 物品ID，最多支持64个字符。
     * @param EntityId 物品ID，最多支持64个字符。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 图片名称，最多支持64个字符。 
     * @return PicName 图片名称，最多支持64个字符。
     */
    public String getPicName() {
        return this.PicName;
    }

    /**
     * Set 图片名称，最多支持64个字符。
     * @param PicName 图片名称，最多支持64个字符。
     */
    public void setPicName(String PicName) {
        this.PicName = PicName;
    }

    /**
     * Get 新的自定义标签，最多不超过10个，格式为JSON。 
     * @return Tags 新的自定义标签，最多不超过10个，格式为JSON。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 新的自定义标签，最多不超过10个，格式为JSON。
     * @param Tags 新的自定义标签，最多不超过10个，格式为JSON。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public UpdateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageRequest(UpdateImageRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.PicName != null) {
            this.PicName = new String(source.PicName);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "PicName", this.PicName);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

