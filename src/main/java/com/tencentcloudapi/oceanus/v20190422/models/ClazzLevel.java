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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClazzLevel extends AbstractModel{

    /**
    * java类全路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clazz")
    @Expose
    private String Clazz;

    /**
    * 日志级别  TRACE，DEBUG、INFO、WARN、ERROR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
     * Get java类全路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clazz java类全路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClazz() {
        return this.Clazz;
    }

    /**
     * Set java类全路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clazz java类全路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClazz(String Clazz) {
        this.Clazz = Clazz;
    }

    /**
     * Get 日志级别  TRACE，DEBUG、INFO、WARN、ERROR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 日志级别  TRACE，DEBUG、INFO、WARN、ERROR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志级别  TRACE，DEBUG、INFO、WARN、ERROR
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 日志级别  TRACE，DEBUG、INFO、WARN、ERROR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public ClazzLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClazzLevel(ClazzLevel source) {
        if (source.Clazz != null) {
            this.Clazz = new String(source.Clazz);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Clazz", this.Clazz);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

