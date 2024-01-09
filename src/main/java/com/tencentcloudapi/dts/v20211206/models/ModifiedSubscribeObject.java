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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifiedSubscribeObject extends AbstractModel {

    /**
    * 订阅对象的类型，枚举值为：0-库，1-表(该值对于mongo任务来说，是集合) 。
注意：mongo只支持全实例、单库或者单集合订阅，因此该字段不要与SubscribeObjectType冲突。如：SubscribeObjectType=4，表示mongo单库订阅，那么该字段应该传0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectsType")
    @Expose
    private Long ObjectsType;

    /**
    * 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 订阅数据库中表(或集合)的名称。如果 ObjectsType 为 1，那么此字段为必填，且不为空；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
     * Get 订阅对象的类型，枚举值为：0-库，1-表(该值对于mongo任务来说，是集合) 。
注意：mongo只支持全实例、单库或者单集合订阅，因此该字段不要与SubscribeObjectType冲突。如：SubscribeObjectType=4，表示mongo单库订阅，那么该字段应该传0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectsType 订阅对象的类型，枚举值为：0-库，1-表(该值对于mongo任务来说，是集合) 。
注意：mongo只支持全实例、单库或者单集合订阅，因此该字段不要与SubscribeObjectType冲突。如：SubscribeObjectType=4，表示mongo单库订阅，那么该字段应该传0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectsType() {
        return this.ObjectsType;
    }

    /**
     * Set 订阅对象的类型，枚举值为：0-库，1-表(该值对于mongo任务来说，是集合) 。
注意：mongo只支持全实例、单库或者单集合订阅，因此该字段不要与SubscribeObjectType冲突。如：SubscribeObjectType=4，表示mongo单库订阅，那么该字段应该传0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectsType 订阅对象的类型，枚举值为：0-库，1-表(该值对于mongo任务来说，是集合) 。
注意：mongo只支持全实例、单库或者单集合订阅，因此该字段不要与SubscribeObjectType冲突。如：SubscribeObjectType=4，表示mongo单库订阅，那么该字段应该传0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectsType(Long ObjectsType) {
        this.ObjectsType = ObjectsType;
    }

    /**
     * Get 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 订阅数据库中表(或集合)的名称。如果 ObjectsType 为 1，那么此字段为必填，且不为空；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNames 订阅数据库中表(或集合)的名称。如果 ObjectsType 为 1，那么此字段为必填，且不为空；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set 订阅数据库中表(或集合)的名称。如果 ObjectsType 为 1，那么此字段为必填，且不为空；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNames 订阅数据库中表(或集合)的名称。如果 ObjectsType 为 1，那么此字段为必填，且不为空；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    public ModifiedSubscribeObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifiedSubscribeObject(ModifiedSubscribeObject source) {
        if (source.ObjectsType != null) {
            this.ObjectsType = new Long(source.ObjectsType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableNames != null) {
            this.TableNames = new String[source.TableNames.length];
            for (int i = 0; i < source.TableNames.length; i++) {
                this.TableNames[i] = new String(source.TableNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectsType", this.ObjectsType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);

    }
}

