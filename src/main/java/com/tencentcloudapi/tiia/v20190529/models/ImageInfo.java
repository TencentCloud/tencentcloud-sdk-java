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

public class ImageInfo extends AbstractModel{

    /**
    * 图片名称。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 用户自定义的内容。
    */
    @SerializedName("CustomContent")
    @Expose
    private String CustomContent;

    /**
    * 图片自定义标签，JSON格式。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 图片名称。
    */
    @SerializedName("PicName")
    @Expose
    private String PicName;

    /**
    * 相似度。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 图片名称。 
     * @return EntityId 图片名称。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 图片名称。
     * @param EntityId 图片名称。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 用户自定义的内容。 
     * @return CustomContent 用户自定义的内容。
     */
    public String getCustomContent() {
        return this.CustomContent;
    }

    /**
     * Set 用户自定义的内容。
     * @param CustomContent 用户自定义的内容。
     */
    public void setCustomContent(String CustomContent) {
        this.CustomContent = CustomContent;
    }

    /**
     * Get 图片自定义标签，JSON格式。 
     * @return Tags 图片自定义标签，JSON格式。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 图片自定义标签，JSON格式。
     * @param Tags 图片自定义标签，JSON格式。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
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

    /**
     * Get 相似度。 
     * @return Score 相似度。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 相似度。
     * @param Score 相似度。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.CustomContent != null) {
            this.CustomContent = new String(source.CustomContent);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.PicName != null) {
            this.PicName = new String(source.PicName);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "CustomContent", this.CustomContent);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "PicName", this.PicName);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

