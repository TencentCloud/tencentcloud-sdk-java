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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityControlTemplateRequest extends AbstractModel {

    /**
    * 媒体质检模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒体质检控制参数。
    */
    @SerializedName("QualityControlItemSet")
    @Expose
    private QualityControlItemConfig [] QualityControlItemSet;

    /**
    * 媒体质检模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 媒体质检模板名称，长度限制：64 个字符。 
     * @return Name 媒体质检模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体质检模板名称，长度限制：64 个字符。
     * @param Name 媒体质检模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒体质检控制参数。 
     * @return QualityControlItemSet 媒体质检控制参数。
     */
    public QualityControlItemConfig [] getQualityControlItemSet() {
        return this.QualityControlItemSet;
    }

    /**
     * Set 媒体质检控制参数。
     * @param QualityControlItemSet 媒体质检控制参数。
     */
    public void setQualityControlItemSet(QualityControlItemConfig [] QualityControlItemSet) {
        this.QualityControlItemSet = QualityControlItemSet;
    }

    /**
     * Get 媒体质检模板描述信息，长度限制：256 个字符。 
     * @return Comment 媒体质检模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 媒体质检模板描述信息，长度限制：256 个字符。
     * @param Comment 媒体质检模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateQualityControlTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityControlTemplateRequest(CreateQualityControlTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.QualityControlItemSet != null) {
            this.QualityControlItemSet = new QualityControlItemConfig[source.QualityControlItemSet.length];
            for (int i = 0; i < source.QualityControlItemSet.length; i++) {
                this.QualityControlItemSet[i] = new QualityControlItemConfig(source.QualityControlItemSet[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "QualityControlItemSet.", this.QualityControlItemSet);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

