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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionInfo extends AbstractModel {

    /**
    * PDF文件页X坐标位置,以PDF单页左上角为坐标原点
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * PDF文件页Y坐标位置,以PDF单页左上角为坐标原点
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
    * 距离X坐标的宽度，用于在PDF文件进行画框。
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
    * 距离Y坐标的高度，用于在PDF文件进行画框。
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
    * PDF文件页码索引，此值加1就是对应PDF文件的页码。
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 系统生成的唯一ID值
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 开始位置
    */
    @SerializedName("Begin")
    @Expose
    private Long Begin;

    /**
    * 结束位置
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 文档类型，1：pdf，2：doc 文档
    */
    @SerializedName("DocType")
    @Expose
    private Long DocType;

    /**
     * Get PDF文件页X坐标位置,以PDF单页左上角为坐标原点 
     * @return X PDF文件页X坐标位置,以PDF单页左上角为坐标原点
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set PDF文件页X坐标位置,以PDF单页左上角为坐标原点
     * @param X PDF文件页X坐标位置,以PDF单页左上角为坐标原点
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get PDF文件页Y坐标位置,以PDF单页左上角为坐标原点 
     * @return Y PDF文件页Y坐标位置,以PDF单页左上角为坐标原点
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set PDF文件页Y坐标位置,以PDF单页左上角为坐标原点
     * @param Y PDF文件页Y坐标位置,以PDF单页左上角为坐标原点
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    /**
     * Get 距离X坐标的宽度，用于在PDF文件进行画框。 
     * @return Width 距离X坐标的宽度，用于在PDF文件进行画框。
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set 距离X坐标的宽度，用于在PDF文件进行画框。
     * @param Width 距离X坐标的宽度，用于在PDF文件进行画框。
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Get 距离Y坐标的高度，用于在PDF文件进行画框。 
     * @return Height 距离Y坐标的高度，用于在PDF文件进行画框。
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set 距离Y坐标的高度，用于在PDF文件进行画框。
     * @param Height 距离Y坐标的高度，用于在PDF文件进行画框。
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    /**
     * Get PDF文件页码索引，此值加1就是对应PDF文件的页码。 
     * @return PageIndex PDF文件页码索引，此值加1就是对应PDF文件的页码。
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set PDF文件页码索引，此值加1就是对应PDF文件的页码。
     * @param PageIndex PDF文件页码索引，此值加1就是对应PDF文件的页码。
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 系统生成的唯一ID值 
     * @return Id 系统生成的唯一ID值
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 系统生成的唯一ID值
     * @param Id 系统生成的唯一ID值
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 开始位置 
     * @return Begin 开始位置
     */
    public Long getBegin() {
        return this.Begin;
    }

    /**
     * Set 开始位置
     * @param Begin 开始位置
     */
    public void setBegin(Long Begin) {
        this.Begin = Begin;
    }

    /**
     * Get 结束位置 
     * @return End 结束位置
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 结束位置
     * @param End 结束位置
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 文档类型，1：pdf，2：doc 文档 
     * @return DocType 文档类型，1：pdf，2：doc 文档
     */
    public Long getDocType() {
        return this.DocType;
    }

    /**
     * Set 文档类型，1：pdf，2：doc 文档
     * @param DocType 文档类型，1：pdf，2：doc 文档
     */
    public void setDocType(Long DocType) {
        this.DocType = DocType;
    }

    public PositionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionInfo(PositionInfo source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Float(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Float(source.Height);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Begin != null) {
            this.Begin = new Long(source.Begin);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.DocType != null) {
            this.DocType = new Long(source.DocType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Begin", this.Begin);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "DocType", this.DocType);

    }
}

