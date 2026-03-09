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
    * <p>cls日志中的字段名</p>
    */
    @SerializedName("ClsField")
    @Expose
    private String ClsField;

    /**
    * <p>数据湖计算服务表的列名</p>
    */
    @SerializedName("DlcField")
    @Expose
    private String DlcField;

    /**
    * <p>数据湖计算服务字段类型</p><p>枚举值：</p><ul><li>int|string|struct等： 参考 <a href="https://cloud.tencent.com/document/product/1342/53778#Column">DLC  cloumn中的Type 定义 </a></li></ul>
    */
    @SerializedName("DlcFieldType")
    @Expose
    private String DlcFieldType;

    /**
    * <p>解析失败填充字段</p>
    */
    @SerializedName("FillField")
    @Expose
    private String FillField;

    /**
    * <p>是否禁用</p>
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
     * Get <p>cls日志中的字段名</p> 
     * @return ClsField <p>cls日志中的字段名</p>
     */
    public String getClsField() {
        return this.ClsField;
    }

    /**
     * Set <p>cls日志中的字段名</p>
     * @param ClsField <p>cls日志中的字段名</p>
     */
    public void setClsField(String ClsField) {
        this.ClsField = ClsField;
    }

    /**
     * Get <p>数据湖计算服务表的列名</p> 
     * @return DlcField <p>数据湖计算服务表的列名</p>
     */
    public String getDlcField() {
        return this.DlcField;
    }

    /**
     * Set <p>数据湖计算服务表的列名</p>
     * @param DlcField <p>数据湖计算服务表的列名</p>
     */
    public void setDlcField(String DlcField) {
        this.DlcField = DlcField;
    }

    /**
     * Get <p>数据湖计算服务字段类型</p><p>枚举值：</p><ul><li>int|string|struct等： 参考 <a href="https://cloud.tencent.com/document/product/1342/53778#Column">DLC  cloumn中的Type 定义 </a></li></ul> 
     * @return DlcFieldType <p>数据湖计算服务字段类型</p><p>枚举值：</p><ul><li>int|string|struct等： 参考 <a href="https://cloud.tencent.com/document/product/1342/53778#Column">DLC  cloumn中的Type 定义 </a></li></ul>
     */
    public String getDlcFieldType() {
        return this.DlcFieldType;
    }

    /**
     * Set <p>数据湖计算服务字段类型</p><p>枚举值：</p><ul><li>int|string|struct等： 参考 <a href="https://cloud.tencent.com/document/product/1342/53778#Column">DLC  cloumn中的Type 定义 </a></li></ul>
     * @param DlcFieldType <p>数据湖计算服务字段类型</p><p>枚举值：</p><ul><li>int|string|struct等： 参考 <a href="https://cloud.tencent.com/document/product/1342/53778#Column">DLC  cloumn中的Type 定义 </a></li></ul>
     */
    public void setDlcFieldType(String DlcFieldType) {
        this.DlcFieldType = DlcFieldType;
    }

    /**
     * Get <p>解析失败填充字段</p> 
     * @return FillField <p>解析失败填充字段</p>
     */
    public String getFillField() {
        return this.FillField;
    }

    /**
     * Set <p>解析失败填充字段</p>
     * @param FillField <p>解析失败填充字段</p>
     */
    public void setFillField(String FillField) {
        this.FillField = FillField;
    }

    /**
     * Get <p>是否禁用</p> 
     * @return Disable <p>是否禁用</p>
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set <p>是否禁用</p>
     * @param Disable <p>是否禁用</p>
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

