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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSpriteTemplate  extends AbstractModel{

    /**
    * 雪碧图模板唯一标识。
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
    * 雪碧图模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 雪碧图中小图的宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 雪碧图中小图的高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 采样类型。
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 采样间隔。
    */
    @SerializedName("SampleInterval")
    @Expose
    private Long SampleInterval;

    /**
    * 雪碧图中小图的行数。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 雪碧图中小图的列数。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取雪碧图模板唯一标识。
     * @return Definition 雪碧图模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置雪碧图模板唯一标识。
     * @param Definition 雪碧图模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取模板类型，取值范围：
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
     * 设置模板类型，取值范围：
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
     * 获取雪碧图模板名称。
     * @return Name 雪碧图模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置雪碧图模板名称。
     * @param Name 雪碧图模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取雪碧图中小图的宽度。
     * @return Width 雪碧图中小图的宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置雪碧图中小图的宽度。
     * @param Width 雪碧图中小图的宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取雪碧图中小图的高度。
     * @return Height 雪碧图中小图的高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置雪碧图中小图的高度。
     * @param Height 雪碧图中小图的高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取采样类型。
     * @return SampleType 采样类型。
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * 设置采样类型。
     * @param SampleType 采样类型。
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * 获取采样间隔。
     * @return SampleInterval 采样间隔。
     */
    public Long getSampleInterval() {
        return this.SampleInterval;
    }

    /**
     * 设置采样间隔。
     * @param SampleInterval 采样间隔。
     */
    public void setSampleInterval(Long SampleInterval) {
        this.SampleInterval = SampleInterval;
    }

    /**
     * 获取雪碧图中小图的行数。
     * @return RowCount 雪碧图中小图的行数。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * 设置雪碧图中小图的行数。
     * @param RowCount 雪碧图中小图的行数。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * 获取雪碧图中小图的列数。
     * @return ColumnCount 雪碧图中小图的列数。
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * 设置雪碧图中小图的列数。
     * @param ColumnCount 雪碧图中小图的列数。
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    /**
     * 获取模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SampleInterval", this.SampleInterval);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

