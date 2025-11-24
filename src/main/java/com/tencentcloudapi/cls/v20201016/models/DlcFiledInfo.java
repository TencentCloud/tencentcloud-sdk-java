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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcFiledInfo extends AbstractModel {

    /**
    * cls日志中的字段名
    */
    @SerializedName("ClsField")
    @Expose
    private String ClsField;

    /**
    * 数据湖计算服务表的列名
    */
    @SerializedName("DlcField")
    @Expose
    private String DlcField;

    /**
    * 数据湖计算服务字段类型
    */
    @SerializedName("DlcFieldType")
    @Expose
    private String DlcFieldType;

    /**
    * 解析失败填充字段
    */
    @SerializedName("FillField")
    @Expose
    private String FillField;

    /**
    * 是否禁用
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
     * Get cls日志中的字段名 
     * @return ClsField cls日志中的字段名
     */
    public String getClsField() {
        return this.ClsField;
    }

    /**
     * Set cls日志中的字段名
     * @param ClsField cls日志中的字段名
     */
    public void setClsField(String ClsField) {
        this.ClsField = ClsField;
    }

    /**
     * Get 数据湖计算服务表的列名 
     * @return DlcField 数据湖计算服务表的列名
     */
    public String getDlcField() {
        return this.DlcField;
    }

    /**
     * Set 数据湖计算服务表的列名
     * @param DlcField 数据湖计算服务表的列名
     */
    public void setDlcField(String DlcField) {
        this.DlcField = DlcField;
    }

    /**
     * Get 数据湖计算服务字段类型 
     * @return DlcFieldType 数据湖计算服务字段类型
     */
    public String getDlcFieldType() {
        return this.DlcFieldType;
    }

    /**
     * Set 数据湖计算服务字段类型
     * @param DlcFieldType 数据湖计算服务字段类型
     */
    public void setDlcFieldType(String DlcFieldType) {
        this.DlcFieldType = DlcFieldType;
    }

    /**
     * Get 解析失败填充字段 
     * @return FillField 解析失败填充字段
     */
    public String getFillField() {
        return this.FillField;
    }

    /**
     * Set 解析失败填充字段
     * @param FillField 解析失败填充字段
     */
    public void setFillField(String FillField) {
        this.FillField = FillField;
    }

    /**
     * Get 是否禁用 
     * @return Disable 是否禁用
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set 是否禁用
     * @param Disable 是否禁用
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
    }

    public DlcFiledInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcFiledInfo(DlcFiledInfo source) {
        if (source.ClsField != null) {
            this.ClsField = new String(source.ClsField);
        }
        if (source.DlcField != null) {
            this.DlcField = new String(source.DlcField);
        }
        if (source.DlcFieldType != null) {
            this.DlcFieldType = new String(source.DlcFieldType);
        }
        if (source.FillField != null) {
            this.FillField = new String(source.FillField);
        }
        if (source.Disable != null) {
            this.Disable = new Boolean(source.Disable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsField", this.ClsField);
        this.setParamSimple(map, prefix + "DlcField", this.DlcField);
        this.setParamSimple(map, prefix + "DlcFieldType", this.DlcFieldType);
        this.setParamSimple(map, prefix + "FillField", this.FillField);
        this.setParamSimple(map, prefix + "Disable", this.Disable);

    }
}

