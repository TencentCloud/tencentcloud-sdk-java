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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeData extends AbstractModel{

    /**
    * 返回的数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private TimeValue [] Content;

    /**
    * 数据类型字段
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get 返回的数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 返回的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeValue [] getContent() {
        return this.Content;
    }

    /**
     * Set 返回的数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 返回的数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(TimeValue [] Content) {
        this.Content = Content;
    }

    /**
     * Get 数据类型字段 
     * @return DataType 数据类型字段
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型字段
     * @param DataType 数据类型字段
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

