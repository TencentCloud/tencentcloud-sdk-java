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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputDataConfig extends AbstractModel{

    /**
    * 通道名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 数据源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private DataSource DataSource;

    /**
    * 输入类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputMode")
    @Expose
    private String InputMode;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
     * Get 通道名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName 通道名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName 通道名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 数据源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSource getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(DataSource DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 输入类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputMode 输入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputMode() {
        return this.InputMode;
    }

    /**
     * Set 输入类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputMode 输入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputMode(String InputMode) {
        this.InputMode = InputMode;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamObj(map, prefix + "DataSource.", this.DataSource);
        this.setParamSimple(map, prefix + "InputMode", this.InputMode);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

