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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelevantEvent extends AbstractModel {

    /**
    * 相关事件标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 相关事件内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 相关事件时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Datetime")
    @Expose
    private String Datetime;

    /**
    * 相关事件引用文章标号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reference")
    @Expose
    private Long [] Reference;

    /**
     * Get 相关事件标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 相关事件标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 相关事件标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 相关事件标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 相关事件内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 相关事件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 相关事件内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 相关事件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 相关事件时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Datetime 相关事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatetime() {
        return this.Datetime;
    }

    /**
     * Set 相关事件时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Datetime 相关事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    /**
     * Get 相关事件引用文章标号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reference 相关事件引用文章标号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getReference() {
        return this.Reference;
    }

    /**
     * Set 相关事件引用文章标号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reference 相关事件引用文章标号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReference(Long [] Reference) {
        this.Reference = Reference;
    }

    public RelevantEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelevantEvent(RelevantEvent source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Datetime != null) {
            this.Datetime = new String(source.Datetime);
        }
        if (source.Reference != null) {
            this.Reference = new Long[source.Reference.length];
            for (int i = 0; i < source.Reference.length; i++) {
                this.Reference[i] = new Long(source.Reference[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Datetime", this.Datetime);
        this.setParamArraySimple(map, prefix + "Reference.", this.Reference);

    }
}

