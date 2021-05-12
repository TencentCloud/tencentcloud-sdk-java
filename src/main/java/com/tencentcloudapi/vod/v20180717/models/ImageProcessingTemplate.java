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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessingTemplate extends AbstractModel{

    /**
    * 图片处理模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片处理模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 图片处理操作数组，操作将以数组顺序执行。
<li>长度限制：3。</li>
    */
    @SerializedName("Operations")
    @Expose
    private ImageOperation [] Operations;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 图片处理模板唯一标识。 
     * @return Definition 图片处理模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 图片处理模板唯一标识。
     * @param Definition 图片处理模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     * @param Type 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片处理模板名称。 
     * @return Name 图片处理模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片处理模板名称。
     * @param Name 图片处理模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息。 
     * @return Comment 模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息。
     * @param Comment 模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 图片处理操作数组，操作将以数组顺序执行。
<li>长度限制：3。</li> 
     * @return Operations 图片处理操作数组，操作将以数组顺序执行。
<li>长度限制：3。</li>
     */
    public ImageOperation [] getOperations() {
        return this.Operations;
    }

    /**
     * Set 图片处理操作数组，操作将以数组顺序执行。
<li>长度限制：3。</li>
     * @param Operations 图片处理操作数组，操作将以数组顺序执行。
<li>长度限制：3。</li>
     */
    public void setOperations(ImageOperation [] Operations) {
        this.Operations = Operations;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ImageProcessingTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessingTemplate(ImageProcessingTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Operations != null) {
            this.Operations = new ImageOperation[source.Operations.length];
            for (int i = 0; i < source.Operations.length; i++) {
                this.Operations[i] = new ImageOperation(source.Operations[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Operations.", this.Operations);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

