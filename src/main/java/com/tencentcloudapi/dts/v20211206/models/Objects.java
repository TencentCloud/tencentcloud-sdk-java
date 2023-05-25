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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Objects extends AbstractModel{

    /**
    * 同步对象类型 Partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 同步对象，当 Mode 为 Partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Databases")
    @Expose
    private Database [] Databases;

    /**
    * 高级对象类型，如function、procedure，当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
    * OnlineDDL类型，冗余字段不做配置用途
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineDDL")
    @Expose
    private OnlineDDL OnlineDDL;

    /**
     * Get 同步对象类型 Partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 同步对象类型 Partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 同步对象类型 Partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 同步对象类型 Partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 同步对象，当 Mode 为 Partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Databases 同步对象，当 Mode 为 Partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Database [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 同步对象，当 Mode 为 Partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Databases 同步对象，当 Mode 为 Partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabases(Database [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get 高级对象类型，如function、procedure，当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedObjects 高级对象类型，如function、procedure，当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set 高级对象类型，如function、procedure，当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedObjects 高级对象类型，如function、procedure，当需要同步高级对象时，初始化类型必须包含结构初始化类型，即任务的Options.InitType字段值为Structure或Full
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    /**
     * Get OnlineDDL类型，冗余字段不做配置用途
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineDDL OnlineDDL类型，冗余字段不做配置用途
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OnlineDDL getOnlineDDL() {
        return this.OnlineDDL;
    }

    /**
     * Set OnlineDDL类型，冗余字段不做配置用途
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineDDL OnlineDDL类型，冗余字段不做配置用途
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineDDL(OnlineDDL OnlineDDL) {
        this.OnlineDDL = OnlineDDL;
    }

    public Objects() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Objects(Objects source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Databases != null) {
            this.Databases = new Database[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new Database(source.Databases[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
        if (source.OnlineDDL != null) {
            this.OnlineDDL = new OnlineDDL(source.OnlineDDL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);
        this.setParamObj(map, prefix + "OnlineDDL.", this.OnlineDDL);

    }
}

