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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOsList extends AbstractModel{

    /**
    * 支持的windows操作系统。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Windows")
    @Expose
    private String [] Windows;

    /**
    * 支持的linux操作系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Linux")
    @Expose
    private String [] Linux;

    /**
     * Get 支持的windows操作系统。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Windows 支持的windows操作系统。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWindows() {
        return this.Windows;
    }

    /**
     * Set 支持的windows操作系统。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Windows 支持的windows操作系统。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWindows(String [] Windows) {
        this.Windows = Windows;
    }

    /**
     * Get 支持的linux操作系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Linux 支持的linux操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLinux() {
        return this.Linux;
    }

    /**
     * Set 支持的linux操作系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param Linux 支持的linux操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinux(String [] Linux) {
        this.Linux = Linux;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Windows.", this.Windows);
        this.setParamArraySimple(map, prefix + "Linux.", this.Linux);

    }
}

