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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewResponseInfo extends AbstractModel{

    /**
    * 视图基本信息。
    */
    @SerializedName("ViewBaseInfo")
    @Expose
    private ViewBaseInfo ViewBaseInfo;

    /**
    * 视图列信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 视图属性信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 视图创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 视图更新时间。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 视图基本信息。 
     * @return ViewBaseInfo 视图基本信息。
     */
    public ViewBaseInfo getViewBaseInfo() {
        return this.ViewBaseInfo;
    }

    /**
     * Set 视图基本信息。
     * @param ViewBaseInfo 视图基本信息。
     */
    public void setViewBaseInfo(ViewBaseInfo ViewBaseInfo) {
        this.ViewBaseInfo = ViewBaseInfo;
    }

    /**
     * Get 视图列信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 视图列信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 视图列信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 视图列信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 视图属性信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 视图属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 视图属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 视图属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 视图创建时间。 
     * @return CreateTime 视图创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 视图创建时间。
     * @param CreateTime 视图创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 视图更新时间。 
     * @return ModifiedTime 视图更新时间。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 视图更新时间。
     * @param ModifiedTime 视图更新时间。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public ViewResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewResponseInfo(ViewResponseInfo source) {
        if (source.ViewBaseInfo != null) {
            this.ViewBaseInfo = new ViewBaseInfo(source.ViewBaseInfo);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ViewBaseInfo.", this.ViewBaseInfo);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

